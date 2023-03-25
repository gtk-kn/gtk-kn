package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.BYTE
import com.squareup.kotlinpoet.CHAR
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT
import org.gtkkn.gir.blueprints.TypeInfo
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirBitField
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirEnum
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRecord
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
    private val config: Config,
) {
    private val typeInfoTable: Map<String, TypeInfo> = mapOf(
        "none" to TypeInfo.Primitive(UNIT),
        "gboolean" to TypeInfo.GBoolean(INT, BOOLEAN),
        "gchar" to TypeInfo.GChar(BYTE, CHAR),
        "gdouble" to TypeInfo.Primitive(DOUBLE),
        "gfloat" to TypeInfo.Primitive(FLOAT),
        "gint" to TypeInfo.Primitive(INT),
        "gint16" to TypeInfo.Primitive(SHORT),
        "gint32" to TypeInfo.Primitive(INT),
        "gint64" to TypeInfo.Primitive(LONG),
        "glong" to TypeInfo.Primitive(LONG),
        "gsize" to TypeInfo.Primitive(U_LONG),
        "gssize" to TypeInfo.Primitive(LONG),
        "guint" to TypeInfo.Primitive(U_INT),
        "guint16" to TypeInfo.Primitive(U_SHORT),
        "guint32" to TypeInfo.Primitive(U_INT),
        "guint64" to TypeInfo.Primitive(U_LONG),
        "gulong" to TypeInfo.Primitive(U_LONG),
        "gunichar" to TypeInfo.Primitive(U_INT),
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

        // callback returning a String
        "GtkScaleFormatValueFunc",

        // issues with records?
        "GdkPixbufAnimationIterClass",
        "GdkPixbufAnimationClass",
        "GskBroadwayRendererClass",
        "GdkPixbufModule",
        "GdkPixbufModulePattern",
        // Issues with Context being defined in pango, but used in pangocairo callbacks?
        "PangoContext",
        "Context",
        "Region",
        "CairoRegion",
        "cairo_t",
        "cairo_region_t",
        "const cairo_region_t",
    )

    /**
     * A set of C functions that should not be generated.
     */
    private val ignoredFunctions = hashSetOf<String>(
        // problems with Snapshot class
        "gtk_widget_snapshot_child",

        // problems with string argument conversion
        "gtk_string_list_take",
        "gsk_debug_node_new",

        // the following are ignore because of clashes between interface and superclass
        "gtk_widget_get_display",
        "gtk_widget_get_font_map",
        "gtk_widget_set_font_map",
        "gtk_widget_realize",
        "gtk_widget_unrealize",

        // ignored because the overridden return value is not a subtype of the parent
        "adw_preferences_page_get_name",
        "adw_preferences_page_set_name",

        // problems with mismatched return type
        "cairo_image_surface_create",

        // problems with enum conversion (might be strictEnum?)
        "hb_glib_script_from_script",
        "hb_glib_script_to_script",

        // which def file should include this (gio or glib)?
        "g_networking_init",

        // might be missing unix-related headers?
        "g_unix_fd_add_full",
        "g_unix_signal_add_full",
        "g_unix_fd_source_new",
        "g_unix_signal_source_new",

        // error pointer argument
        "g_prefix_error_literal",
        "g_trash_stack_height",

        // record issues?
        "hb_ft_font_changed",
        "hb_ft_font_get_load_flags",
        "hb_ft_font_set_funcs",
        "hb_ft_font_set_load_flags",
        "pango_cairo_font_get_scaled_font",
        "pango_cairo_context_get_font_options",
        "pango_cairo_context_set_font_options",
        "pango_cairo_create_context",
        "pango_cairo_create_layout",
        // all issues with pango_cairo Context
        "pango_cairo_error_underline_path",
        "pango_cairo_glyph_string_path",
        "pango_cairo_layout_line_path",
        "pango_cairo_layout_path",
        "pango_cairo_layout_line_path",
        "pango_cairo_show_error_underline",
        "pango_cairo_show_glyph_item",
        "pango_cairo_show_glyph_string",
        "pango_cairo_show_layout",
        "pango_cairo_show_layout_line",
        "pango_cairo_update_context",
        "pango_cairo_update_layout",

        "pango_font_map_create_context",
        "gdk_cairo_context_cairo_create",
        "gdk_draw_context_begin_frame",
        "pango_layout_get_context",
        "pango_layout_get_context",
        "gdk_draw_context_get_frame_region",

        "gdk_pixbuf_get_from_surface",
        "gdk_cairo_region_create_from_surface",
        "gdk_surface_create_similar_surface",
        "gsk_cairo_node_get_surface",
        "gsk_cairo_node_get_draw_context",
        "gsk_cairo_node_new",
        "gsk_clip_node_new",
        "gsk_clip_node_get_clip",
        "gsk_color_matrix_node_new",
        "gsk_color_matrix_node_new",
        "gsk_color_matrix_node_get_color_matrix",

        "gtk_print_context_create_pango_context",
        "gtk_print_context_get_cairo_context",
        "gtk_text_view_get_ltr_context",
        "gtk_text_view_get_rtl_context",
        "gtk_widget_create_pango_context",
        "gtk_widget_get_font_options",
        "gtk_widget_get_pango_context",
        "gtk_widget_set_font_options",

        "g_thread_new",

        // problem because it needs a GObjectClass struct
        "gtk_editable_install_properties",

        // problem because it uses a callback with a string return value
        "g_option_group_set_translate_func"
    )

    /**
     * A set of signals that should not be generated.
     */
    private val ignoredSignals = hashSetOf<String>(
        // problems with string conversion in signal handler
        "format-entry-text",
        // problems with pango/cairo region
        "render", // Surface
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
            .replace("-", "_")
            .removeSuffix("_")
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

    fun kotlinizeSignalConnectName(nativeSignalName: String): String =
        "connect${nativeSignalName.replace("-", "_").toPascalCase()}"

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
     * Resolve the [TypeName] for the objectPointer we have in all records.
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveRecordObjectPointerTypeName(namespace: GirNamespace, record: GirRecord): TypeName =
        NativeTypes.cpointerOf(
            ClassName(
                namespaceNativePackageName(namespace),
                record.cType
                    ?: throw UnresolvableTypeException("Missing cType on record"),
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

    @Throws(UnresolvableTypeException::class)
    fun resolveCallbackTypeName(targetNamespace: GirNamespace, nativeCallbackName: String): ClassName {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeCallbackName)
        val clazz = namespace.callbacks.find { it.name == simpleName }
            ?: throw UnresolvableTypeException("callback $nativeCallbackName not found")
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
            ClassName(
                namespaceNativePackageName(namespace),
                enum.cType,
            ),
            ClassName(namespaceBindingsPackageName(namespace), kotlinizeEnumName(enum.name)),
        )
    }

    @Throws(UnresolvableTypeException::class)
    fun resolveBitfieldTypeNames(targetNamespace: GirNamespace, nativeBitfieldName: String): Pair<TypeName, TypeName> {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeBitfieldName)
        val bitfield = namespace.bitfields.find { it.name == simpleName }
            ?: throw UnresolvableTypeException("enum $nativeBitfieldName not found")

        return Pair(
            ClassName(
                namespaceNativePackageName(namespace),
                bitfield.cType,
            ),
            ClassName(namespaceBindingsPackageName(namespace), kotlinizeBitfieldName(bitfield.name)),
        )
    }

    @Throws(UnresolvableTypeException::class)
    fun resolveRecordTypeName(targetNamespace: GirNamespace, nativeRecordName: String): TypeName {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeRecordName)
        val clazz = namespace.records.find { it.name == simpleName }
            ?: throw UnresolvableTypeException("record $nativeRecordName not found")
        return ClassName(
            namespaceBindingsPackageName(namespace),
            kotlinizeClassName(clazz.name),
        ) // TODO kotlinize Record Name
    }

    /**
     * Resolve a [TypeInfo] for the given [GirType].
     */
    @Suppress("LongMethod", "ReturnCount")
    @Throws(UnresolvableTypeException::class)
    fun resolveTypeInfo(
        girNamespace: GirNamespace,
        type: GirType,
        nullable: Boolean,
        isArray: Boolean = false
    ): TypeInfo {
        if (type.name == null) {
            throw UnresolvableTypeException("type name is null")
        }

        // first basic types
        typeInfoTable[type.name]?.let { typeInfo ->
            if (type.cType != null && type.cType.endsWith("*")) {
                logger.error("Skipping primitive with pointer type")
                throw UnresolvableTypeException("Unsupported pointer to primitive type")
            }
            return typeInfo.withNullable(nullable)
        }

        // strings
        if (type.name == "utf8" || type.name == "filename") {
            return when (type.cType) {
                "const char*" -> TypeInfo.KString(NativeTypes.cpointerOf(NativeTypes.KP_BYTEVAR), STRING)
                "const gchar*" -> TypeInfo.KString(NativeTypes.cpointerOf(NativeTypes.KP_BYTEVAR), STRING)
                "char*" -> {
                    if (isArray) {
                        TypeInfo.KString(NativeTypes.cpointerOf(NativeTypes.KP_BYTEVAR), STRING)
                    } else {
                        throw UnresolvableTypeException("Unsupported string type with cType: ${type.cType}")
                    }
                }

                null -> TypeInfo.KString(NativeTypes.cpointerOf(NativeTypes.KP_BYTEVAR), STRING)
                else -> {
                    logger.error("Skipping string type with cType: ${type.cType}")
                    throw UnresolvableTypeException("Unsupported string with cType ${type.cType}")
                }
            }.withNullable(nullable)
        }

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
                NativeTypes.KP_CPOINTER.parameterizedBy(buildNativeClassName(namespace, girClass)),
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
                NativeTypes.KP_CPOINTER.parameterizedBy(buildNativeClassName(namespace, girInterface)),
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

            return TypeInfo.Bitfield(
                nativeTypeName = nativeBitfieldTypeName,
                kotlinTypeName = kotlinBitfieldTypeName,
            ).withNullable(nullable)
        } catch (ignored: UnresolvableTypeException) {
            // fallthrough
        }

        // records
        try {
            val kotlinRecordTypeName = resolveRecordTypeName(girNamespace, type.name)
            val (namespace, girRecord) = findRecordByName(girNamespace, type.name)
            // TODO find a better way to ignore these
            if (girRecord.disguised == true) throw UnresolvableTypeException("Diguised record ${girRecord.name} is ignored")

            val objectPointerName = "${namespacePrefix(namespace)}${girRecord.name}Pointer"
            return TypeInfo.RecordPointer(
                kotlinTypeName = kotlinRecordTypeName,
                nativeTypeName = NativeTypes.KP_CPOINTER.parameterizedBy(buildNativeClassName(namespace, girRecord)),
                objectPointerName,
            ).withNullable(nullable)
        } catch (ignored: UnresolvableTypeException) {
            // fallthrough
        }


        logger.warn("Could not resolve type for type with name: ${type.name} and cType: ${type.cType}")
        throw UnresolvableTypeException(type.name)
    }

    /**
     * Resolve a [TypeInfo] for the given [GirArrayType].
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveTypeInfo(girNamespace: GirNamespace, array: GirArrayType, nullable: Boolean): TypeInfo =
        when (array.type) {
            is GirArrayType -> throw UnresolvableTypeException("Nested array types are not supported")
            is GirType -> {
                val arrayTypeInfo = resolveTypeInfo(girNamespace, array.type, false, true)
                if (arrayTypeInfo is TypeInfo.KString) {
                    val nullTerminated = array.zeroTerminated == null || array.zeroTerminated == true
                    TypeInfo.StringList(
                        nativeTypeName = NativeTypes.KP_STRING_ARRAY,
                        kotlinTypeName = LIST.parameterizedBy(STRING),
                        nullTerminated,
                        array.fixedSize,
                    ).withNullable(nullable)
                } else {
                    throw UnresolvableTypeException("Array parameter of type ${array.type.name} is not supported")
                }
            }
        }

    private fun buildNativeClassName(girNamespace: GirNamespace, girClass: GirClass) =
        ClassName(
            namespaceNativePackageName(girNamespace),
            girClass.cType
                ?: throw UnresolvableTypeException("missing cType for class ${girClass.name}"),
        )

    private fun buildNativeClassName(girNamespace: GirNamespace, girInterface: GirInterface) =
        ClassName(
            namespaceNativePackageName(girNamespace),
            girInterface.cType
                ?: throw UnresolvableTypeException("missing cType for interface ${girInterface.name}"),
        )

    private fun buildNativeClassName(girNamespace: GirNamespace, girRecord: GirRecord) =
        ClassName(
            namespaceNativePackageName(girNamespace),
            girRecord.cType
                ?: throw UnresolvableTypeException("missing cType for interface ${girRecord.name}"),
        )

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
    fun findRecordByName(
        targetNamespace: GirNamespace,
        fullyQualifiedName: String,
    ): Pair<GirNamespace, GirRecord> {
        val (namespace, simpleRecordName) = extractFullyQualifiedName(targetNamespace, fullyQualifiedName)
        val clazz = namespace.records.find { it.name == simpleRecordName }
            ?: throw UnresolvableTypeException(
                "Record $simpleRecordName does not exist in namespace ${namespace.name}",
            )
        return Pair(namespace, clazz)
    }

    @Throws(UnresolvableTypeException::class)
    fun findBitfieldByName(
        targetNamespace: GirNamespace,
        fullyQualifiedName: String,
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
    @Throws(IgnoredTypeException::class)
    fun checkIgnoredType(cType: String) {
        if (ignoredTypes.contains(cType)) {
            throw IgnoredTypeException(cType)
        }
        // FIXME graphene_*_t are posing problems with cinterop
        if (cType.startsWith("graphene_") && cType.endsWith("_t")) {
            throw IgnoredTypeException(cType)
        }
    }

    /**
     * Utility method for checking whether a C function is supported or should be skipped.
     *
     * This method returns successfully when the given [cFunctionName] is not present in any of the skipped lists
     * or configuration.
     * @throws IgnoredFunctionException if the function should be ignored.
     */
    @Throws(IgnoredFunctionException::class)
    fun checkIgnoredFunction(cFunctionName: String) {
        if (ignoredFunctions.contains(cFunctionName)) {
            throw IgnoredFunctionException(cFunctionName)
        }

        if (cFunctionName.endsWith("to_string")) {
            throw IgnoredFunctionException(cFunctionName)
        }
        // FIXME ignore graphene functions for same reason as ignored types above
        if (cFunctionName.startsWith("graphene_")) {
            throw IgnoredFunctionException(cFunctionName)
        }
        // FIXME same for gsk
        if (cFunctionName.startsWith("gsk_")) {
            throw IgnoredFunctionException(cFunctionName)
        }
    }

    /**
     * Utility method for checking whether a C function is supported or should be skipped.
     *
     * This method returns successfully when the given [cFunctionName] is not present in any of the skipped lists
     * or configuration.
     * @throws IgnoredSignalException if the function should be ignored.
     */
    @Throws(IgnoredSignalException::class)
    fun checkIgnoredSignal(signalName: String) {
        if (ignoredSignals.contains(signalName)) {
            throw IgnoredSignalException(signalName)
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

    fun processKdoc(doc: String?): String? = if (config.bindingLicense == Config.License.LGPL) {
        doc.sanitizeKDoc()
    } else {
        null
    }

    private fun String?.sanitizeKDoc(): String? = this?.replace("...]", "]")
        ?.replace("%TRUE", "true")
        ?.replace("%FALSE", "false")
        ?.replace("%NULL", "null")
}
