package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT
import org.gtkkn.gir.blueprints.TypeInfo
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirBitField
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirEnum
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRepository
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.util.toCamelCase
import org.gtkkn.gir.util.toPascalCase

/**
 * A context object that has all the Gir information available so any phase 2 processing
 * can resolve types or objects for dependencies
 */
class ProcessorContext(
    private val repositories: List<GirRepository>,
) {
    private val typeInfoTable: Map<String, TypeInfo> = mapOf(
        "none" to TypeInfo.Primitive(UNIT),
        "gboolean" to TypeInfo.GBoolean(INT, BOOLEAN),
        "gdouble" to TypeInfo.Primitive(DOUBLE),
        "gfloat" to TypeInfo.Primitive(FLOAT),
        "gint" to TypeInfo.Primitive(INT),
        "gint16" to TypeInfo.Primitive(SHORT),
        "gint32" to TypeInfo.Primitive(INT),
        "gint64" to TypeInfo.Primitive(LONG),
        "gsize" to TypeInfo.Primitive(U_LONG),
        "gssize" to TypeInfo.Primitive(LONG),
        "guint" to TypeInfo.Primitive(U_INT),
        "guint16" to TypeInfo.Primitive(U_SHORT),
        "guint32" to TypeInfo.Primitive(U_INT),
        "guint64" to TypeInfo.Primitive(U_LONG),
        "gunichar" to TypeInfo.Primitive(U_INT),
        "gpointer" to TypeInfo.Primitive(NativeTypes.KP_OPAQUE_POINTER),
        // strings
        "utf8" to TypeInfo.KString(NativeTypes.cpointerOf(NativeTypes.KP_BYTEVAR), STRING),
        "filename" to TypeInfo.KString(NativeTypes.cpointerOf(NativeTypes.KP_BYTEVAR), STRING),
    )

    /**
     * A set of C identifiers for gir objects that should not be generated.
     */
    private val ignoredTypes = hashSetOf(
        // not available on older ubuntu versions
        "GskBroadwayRenderer",
        // bitfield members not found through cinterop
        "GdkPixbufFormatFlags",
        // cinterop fails to map these graphene enums
        "graphene_ray_intersection_kind_t",
        "graphene_euler_order_t",
    )

    /**
     * A set of C functions that should not be generated.
     */
    private val ignoredFunctions = hashSetOf(
        "g_memory_output_stream_get_data",
        "g_memory_output_stream_steal_data",
        "gdk_pixbuf_ref",
        "gdk_pixbuf_unref",
        "gdk_pixbuf_animation_ref",
        "gdk_pixbuf_animation_unref",
        "pango_coverage_ref",
        "pango_coverage_unref",
        "gdk_gl_context_get_display",
        "gdk_gl_context_get_surface",
        "gtk_menu_button_get_direction",
        "gtk_menu_button_set_direction",
        "gtk_print_unix_dialog_get_settings",
        "gtk_widget_snapshot_child", // problems with Snapshot class
        "gtk_string_list_take", // problems with string argument conversion
        "gsk_debug_node_new", // problems with string argument conversion
        "g_type_module_use",
        "g_type_module_unuse",
        "g_unix_input_stream_get_fd",
        "g_unix_output_stream_get_fd",
        "g_socket_condition_check",
        "g_task_get_source_object",
        "gdk_content_deserializer_get_user_data",
        "gdk_content_serializer_get_user_data",
    )

    /**
     * A set of C identifiers for enum that cinterop cannot map using `strictEnums`
     * and need their native members imported directly in the package.
     */
    private val enumsWithDirectImportOverride = hashSetOf(
        "cairo_format_t",
        "cairo_content_t",
        "cairo_device_type_t",
        "cairo_status_t",
        "cairo_text_cluster_flags_t",
    )

    // object lookups methods
    fun findRepositoryByNameOrNull(name: String): GirRepository? = repositories.find { it.namespace.name == name }

    fun findNamespaceByNameOrNull(name: String) = findRepositoryByNameOrNull(name)?.namespace

    @Throws(UnresolvableTypeException::class)
    fun findNamespaceByName(name: String) =
        findRepositoryByNameOrNull(name)?.namespace ?: throw UnresolvableTypeException("Namespace $name not found")

    // kotlin names
    fun kotlinizeMethodName(nativeMethodName: String): String =
        nativeMethodName
            .removePrefix("_")
            .toCamelCase()

    fun kotlinizeClassName(nativeClassName: String): String =
        nativeClassName
            .removeSuffix("_t")
            .toPascalCase()

    fun kotlinizeInterfaceName(nativeInterfaceName: String): String = nativeInterfaceName.toPascalCase()

    fun kotlinizeEnumName(nativeEnumName: String): String =
        nativeEnumName
            .removeSuffix("_t")
            .toPascalCase()

    fun kotlinzeEnumMemberName(nativeEnumMemberName: String): String = nativeEnumMemberName.uppercase()

    fun kotlinizePackageName(nativePackageName: String): String = "bindings.${nativePackageName.lowercase()}"

    fun kotlinizeParameterName(nativeParameterName: String): String =
        nativeParameterName
            .removeSuffix("_")
            .toCamelCase()

    fun kotlinizeBitfieldName(nativeBitfieldName: String): String =
        nativeBitfieldName
            .removeSuffix("_t")
            .toPascalCase()

    fun kotlinizeBitfieldMemberName(nativeMemberName: String): String = nativeMemberName.uppercase()

    // namespace naming
    fun namespacePrefix(namespace: GirNamespace): String = namespace.name.lowercase()

    fun namespaceNativePackageName(namespace: GirNamespace): String = "native.${namespacePrefix(namespace)}"

    fun namespaceBindingsPackageName(namespace: GirNamespace): String = "bindings.${namespacePrefix(namespace)}"

    /**
     * Resolve the [TypeName] for the objectPointer we have in all classes.
     *
     * For example, for Widget, this will return kotlinx.cinterop.CPointer<native.gtk.Widget>.
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveClassObjectPointerTypeName(namespace: GirNamespace, clazz: GirClass): TypeName =
        NativeTypes.cpointerOf(
            ClassName(
                namespaceNativePackageName(namespace),
                clazz.cType
                    ?: throw UnresolvableTypeException("Missing cType on class"),
            ),
        )

    /**
     * Resolve the [TypeName] for the objectPointer we have in all interfaces.
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveInterfaceObjectPointerTypeName(namespace: GirNamespace, iface: GirInterface): TypeName =
        NativeTypes.cpointerOf(
            ClassName(
                namespaceNativePackageName(namespace),
                iface.cType ?: throw UnresolvableTypeException("Missing cType on interface"),
            ),
        )

    /**
     * Convert an objectName which can be either simple (no dots) or fully qualified (with dot separator)
     * into a pair of namespace and simple object name.
     */
    @Throws(UnresolvableTypeException::class)
    private fun extractFullyQualifiedName(
        targetNamespace: GirNamespace,
        objectName: String,
    ): Pair<GirNamespace, String> {
        val parts = objectName.split(".")
        return when (parts.count()) {
            1 -> Pair(targetNamespace, objectName)
            2 -> Pair(findNamespaceByName(parts.first()), parts.last())
            else -> throw UnresolvableTypeException(
                "objectName $objectName is not a valid simple or fully qualified name",
            )
        }
    }

    /**
     * Resolve a native class name to a [TypeName] object.
     *
     * If the given [nativeClassName] contains a separator dot, the prefix is used to resolve the interface
     * from another namespace.
     * Otherwise the [targetNamespace] is used.
     *
     * @param targetNamespace target namespace for which we are resolving.
     * @param nativeClassName name of the interface.
     * @throws UnresolvableTypeException if the type cannot be resolved
     * @return fully qualified [TypeName] for the interface
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveClassTypeName(targetNamespace: GirNamespace, nativeClassName: String): TypeName {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeClassName)
        val clazz = namespace.classes.find { it.name == simpleName }
            ?: throw UnresolvableTypeException("class $nativeClassName not found")
        return ClassName(namespaceBindingsPackageName(namespace), kotlinizeClassName(clazz.name))
    }

    /**
     * Resolve a native interface name to a [TypeName] object.
     *
     * If the given [nativeInterfaceName] contains a separator dot, the prefix is used to resolve the interface
     * from another namespace.
     * Otherwise the [targetNamespace] is used.
     *
     * @param targetNamespace target namespace for which we are resolving.
     * @param nativeInterfaceName name of the interface.
     * @throws UnresolvableTypeException if the type cannot be resolved
     * @return fully qualified [TypeName] for the interface
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveInterfaceTypeName(targetNamespace: GirNamespace, nativeInterfaceName: String): TypeName {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeInterfaceName)
        val iface = namespace.interfaces.find { it.name == simpleName }
            ?: throw UnresolvableTypeException("interface $nativeInterfaceName not found")
        return ClassName(namespaceBindingsPackageName(namespace), kotlinizeInterfaceName(iface.name))
    }

    @Throws(UnresolvableTypeException::class)
    fun resolveEnumTypeNames(targetNamespace: GirNamespace, nativeEnumName: String): Pair<TypeName, TypeName> {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeEnumName)
        val enum = namespace.enums.find { it.name == simpleName }
            ?: throw UnresolvableTypeException("enum $nativeEnumName not found")

        return Pair(
            ClassName(namespaceNativePackageName(namespace), enum.name),
            ClassName(namespaceBindingsPackageName(namespace), kotlinizeEnumName(enum.name)),
        )
    }

    @Throws(UnresolvableTypeException::class)
    fun resolveBitfieldTypeNames(targetNamespace: GirNamespace, nativeBitfieldName: String): Pair<TypeName, TypeName> {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeBitfieldName)
        val bitfield = namespace.bitfields.find { it.name == simpleName }
            ?: throw UnresolvableTypeException("enum $nativeBitfieldName not found")

        return Pair(
            ClassName(namespaceNativePackageName(namespace), bitfield.name),
            ClassName(namespaceBindingsPackageName(namespace), kotlinizeBitfieldName(bitfield.name)),
        )
    }

    /**
     * Resolve a [TypeInfo] for the given [GirType].
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveTypeInfo(girNamespace: GirNamespace, type: GirType, nullable: Boolean): TypeInfo {
        if (type.name == null) {
            throw UnresolvableTypeException("type name is null")
        }
        // first basic types
        typeInfoTable[type.name]?.let { return it.withNullable(nullable) }

        // classes
        try {
            val kotlinClassTypeName = resolveClassTypeName(girNamespace, type.name)
            val (namespace, girClass) = findClassByName(girNamespace, type.name)
            val objectPointerName = if (girClass.parent != null) {
                "${namespacePrefix(namespace)}${girClass.name}Pointer"
            } else {
                "gPointer"
            }
            return TypeInfo.ObjectPointer(
                NativeTypes.KP_WILDCARD_CPOINTER,
                kotlinClassTypeName,
                objectPointerName,
            ).withNullable(nullable)
        } catch (ignored: UnresolvableTypeException) {
            // fallthrough
        }

        // interfaces
        try {
            val kotlinInterfaceTypeName = resolveInterfaceTypeName(girNamespace, type.name)
            val (namespace, girInterface) = findInterfaceByName(girNamespace, type.name)
            val objectPointerName = "${namespacePrefix(namespace)}${girInterface.name}Pointer"
            return TypeInfo.InterfacePointer(
                NativeTypes.KP_WILDCARD_CPOINTER,
                kotlinInterfaceTypeName,
                objectPointerName,
            ).withNullable(nullable)
        } catch (ignored: UnresolvableTypeException) {
            // fallthrough
        }

        // enums
        try {
            val (nativeTypeName, kotlinTypeName) = resolveEnumTypeNames(girNamespace, type.name)
            return TypeInfo.Enumeration(
                nativeTypeName = nativeTypeName,
                kotlinTypeName = kotlinTypeName,
            ).withNullable(nullable)
        } catch (ignored: UnresolvableTypeException) {
            // fallthrough
        }

        // bitfields
        try {
            val (nativeBitfieldTypeName, kotlinBitfieldTypeName) = resolveBitfieldTypeNames(girNamespace, type.name)
            val (namespace, bitfield) = findBitfieldByName(girNamespace, type.name)

            return TypeInfo.Bitfield(
                nativeTypeName = nativeBitfieldTypeName,
                kotlinTypeName = kotlinBitfieldTypeName,
            ).withNullable(nullable)
        } catch (ignored: UnresolvableTypeException) {
            // fallthrough
        }

        logger.warn("Could not resolve type for type with name: ${type.name} and cType: ${type.cType}")
        throw UnresolvableTypeException(type.name)
    }

    @Throws(UnresolvableTypeException::class)
    fun findClassByName(
        targetNamespace: GirNamespace,
        fullyQualifiedName: String,
    ): Pair<GirNamespace, GirClass> {
        val (namespace, simpleClassName) = extractFullyQualifiedName(targetNamespace, fullyQualifiedName)
        val clazz = namespace.classes.find { it.name == simpleClassName }
            ?: throw UnresolvableTypeException("Class $simpleClassName does not exist in namespace ${namespace.name}")
        return Pair(namespace, clazz)
    }

    @Throws(UnresolvableTypeException::class)
    fun findInterfaceByName(
        targetNamespace: GirNamespace,
        fullyQualifiedName: String,
    ): Pair<GirNamespace, GirInterface> {
        val (namespace, simpleIfaceName) = extractFullyQualifiedName(targetNamespace, fullyQualifiedName)
        val clazz = namespace.interfaces.find { it.name == simpleIfaceName }
            ?: throw UnresolvableTypeException(
                "Interface $simpleIfaceName does not exist in namespace ${namespace.name}",
            )
        return Pair(namespace, clazz)
    }

    @Throws(UnresolvableTypeException::class)
    fun findBitfieldByName(
        targetNamespace: GirNamespace,
        fullyQualifiedName: String
    ): Pair<GirNamespace, GirBitField> {
        val (namespace, simpleBitfieldName) = extractFullyQualifiedName(targetNamespace, fullyQualifiedName)
        val clazz = namespace.bitfields.find { it.name == simpleBitfieldName }
            ?: throw UnresolvableTypeException(
                "Bitfield $simpleBitfieldName does not exist in namespace ${namespace.name}",
            )
        return Pair(namespace, clazz)
    }

    /**
     * Utility method for checking whether a cType is supported or should be skipped.
     *
     * This method returns successfully when the given [cType] is not present in any of the skipped lists
     * or configuration.
     * @throws IgnoredTypeException if the type should be ignored.
     */
    fun checkIgnoredType(cType: String) {
        if (ignoredTypes.contains(cType)) {
            throw IgnoredTypeException(cType)
        }
    }

    /**
     * Utility method for checking whether a C function is supported or should be skipped.
     *
     * This method returns succesfully when the given [cFunctionName] is not present in any of the skipped lists
     * or configuration.
     * @throws IgnoredTypeException if the function should be ignored.
     */
    fun checkIgnoredFunction(cFunctionName: String) {
        if (ignoredFunctions.contains(cFunctionName)) {
            throw IgnoredFunctionException(cFunctionName)
        }

        if (cFunctionName.endsWith("to_string")) {
            throw IgnoredFunctionException(cFunctionName)
        }
    }

    /**
     * Utility method for checking when an enum cannot import its members using
     * `native.<package>.<enumname>.<membername>` syntax and instead has to use
     * `native.<package>.<membername>.
     *
     * @return true when the package import needs to be applied, false otherwise.
     */
    fun needsEnumMemberPackageImport(girEnum: GirEnum): Boolean = enumsWithDirectImportOverride.contains(girEnum.cType)
}
