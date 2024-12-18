/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.CHAR
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT
import net.pearx.kasechange.toPascalCase
import org.gtkkn.gir.blueprints.OptInVersionBlueprint
import org.gtkkn.gir.blueprints.TypeInfo
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.generator.G_BOOLEAN
import org.gtkkn.gir.generator.G_CHAR
import org.gtkkn.gir.generator.G_DOUBLE
import org.gtkkn.gir.generator.G_FLOAT
import org.gtkkn.gir.generator.G_INT
import org.gtkkn.gir.generator.G_INT64
import org.gtkkn.gir.generator.G_INT8
import org.gtkkn.gir.generator.G_LONG
import org.gtkkn.gir.generator.G_SIZE
import org.gtkkn.gir.generator.G_TYPE
import org.gtkkn.gir.generator.G_UINT
import org.gtkkn.gir.generator.G_UINT16
import org.gtkkn.gir.generator.G_UINT64
import org.gtkkn.gir.generator.G_UINT8
import org.gtkkn.gir.generator.G_ULONG
import org.gtkkn.gir.generator.G_UNICHAR
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirAnyType
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirBitfield
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirEnumeration
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirNamedElement
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRecord
import org.gtkkn.gir.model.GirRepository
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirUnion

/**
 * A context object that has all the Gir information available so any phase 2 processing
 * can resolve types or objects for dependencies
 */
class ProcessorContext(
    private val repositories: List<GirRepository>,
    private val config: Config,
) {
    private val optInVersionBlueprintsMap = mutableMapOf<GirNamespace, MutableSet<OptInVersionBlueprint>>()

    // object lookups methods
    fun findRepositoryByNameOrNull(name: String): GirRepository? =
        repositories.find { it.namespaces.first().name == name }

    @Throws(UnresolvableTypeException::class)
    fun findNamespaceByName(name: String) =
        findRepositoryByNameOrNull(name)?.namespaces?.first()
            ?: throw UnresolvableTypeException("Namespace $name not found")

    fun getKotlinPackageName(nativePackageName: String): String = "org.gtkkn.bindings.${nativePackageName.lowercase()}"

    // namespace naming
    fun namespacePrefix(namespace: GirNamespace): String = checkNotNull(namespace.name).lowercase()

    fun namespaceNativePackageName(namespace: GirNamespace): String = "org.gtkkn.native.${namespacePrefix(namespace)}"

    fun namespaceBindingsPackageName(namespace: GirNamespace): String =
        "org.gtkkn.bindings.${namespacePrefix(namespace)}"

    /**
     * Resolve the [TypeName] for the objectPointer we have in all classes.
     *
     * For example, for Widget, this will return kotlinx.cinterop.CPointer<native.gtk.Widget>.
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveClassObjectPointerTypeName(namespace: GirNamespace, clazz: GirClass): TypeName =
        BindingsGenerator.cpointerOf(
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
    fun resolveRecordObjectPointerTypeName(namespace: GirNamespace, record: GirRecord): TypeName {
        val className = ClassName(
            namespaceNativePackageName(namespace),
            record.cType ?: throw UnresolvableTypeException("Missing cType on record"),
        )
        return if (record.pointer == true) {
            className
        } else {
            BindingsGenerator.cpointerOf(className)
        }
    }

    /**
     * Resolve the [TypeName] for the objectPointer we have in all unions.
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveUnionObjectPointerTypeName(namespace: GirNamespace, union: GirUnion): TypeName {
        val className = ClassName(
            namespaceNativePackageName(namespace),
            union.cType ?: throw UnresolvableTypeException("Missing cType on union"),
        )
        return BindingsGenerator.cpointerOf(className)
    }

    /**
     * Resolve the [TypeName] for the objectPointer we have in all interfaces.
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveInterfaceObjectPointerTypeName(namespace: GirNamespace, iface: GirInterface): TypeName =
        BindingsGenerator.cpointerOf(
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
     * Resolve a native Alias name to a [TypeName] object.
     *
     * If the given [nativeClassName] contains a separator dot, the prefix is used to resolve the interface
     * from another namespace.
     * Otherwise the [targetNamespace] is used.
     *
     * @param targetNamespace target namespace for which we are resolving.
     * @param nativeAliasName name of the interface.
     * @return fully qualified [TypeInfo.Alias] object for the alias, or null if the alias cannot be resolved.
     */
    fun resolveAliasTypeInfo(targetNamespace: GirNamespace, nativeAliasName: String): TypeInfo.Alias? {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeAliasName)
        val alias = namespace.aliases.find { it.name == simpleName && it.info.shouldBeGenerated() }
        return alias?.run {
            TypeInfo.Alias(
                nativeTypeName = ClassName(namespaceNativePackageName(namespace), cType),
                kotlinTypeName = ClassName(namespaceBindingsPackageName(namespace), name.toPascalCase()),
                baseTypeInfo = resolveTypeInfo(type.namespace, type, false),
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
     * @return fully qualified [TypeName] for the interface, null if the type cannot be resolved
     */
    fun resolveClassTypeName(targetNamespace: GirNamespace, nativeClassName: String): TypeName? {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeClassName)
        val clazz = namespace.classes.find { it.name == simpleName }
        return clazz?.let { ClassName(namespaceBindingsPackageName(namespace), it.name.toPascalCase()) }
    }

    fun resolveCallbackTypeName(targetNamespace: GirNamespace, nativeCallbackName: String): ClassName? {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeCallbackName)
        val callback = namespace.callbacks.find { it.name == simpleName }
        return callback?.let { ClassName(namespaceBindingsPackageName(namespace), callback.name.toPascalCase()) }
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
     * @return fully qualified [TypeName] for the interface, null if the type cannot be resolved
     */
    fun resolveInterfaceTypeName(targetNamespace: GirNamespace, nativeInterfaceName: String): TypeName? {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeInterfaceName)
        val iface = namespace.interfaces.find { it.name == simpleName }
        return iface?.let {
            ClassName(namespaceBindingsPackageName(namespace), checkNotNull(iface.name).toPascalCase())
        }
    }

    fun resolveEnumTypeName(targetNamespace: GirNamespace, nativeEnumName: String): Pair<TypeName, TypeName>? {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeEnumName)
        val enum = namespace.enumerations.find { it.name == simpleName }
        return enum?.let {
            Pair(
                ClassName(namespaceNativePackageName(namespace), enum.cType),
                ClassName(namespaceBindingsPackageName(namespace), enum.name.toPascalCase()),
            )
        }
    }

    fun resolveBitfieldTypeName(targetNamespace: GirNamespace, nativeBitfieldName: String): Pair<TypeName, TypeName>? {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeBitfieldName)
        val bitfield = namespace.bitfields.find { it.name == simpleName }

        return bitfield?.let {
            Pair(
                ClassName(namespaceNativePackageName(namespace), bitfield.cType),
                ClassName(namespaceBindingsPackageName(namespace), bitfield.name.toPascalCase()),
            )
        }
    }

    fun resolveRecordTypeName(targetNamespace: GirNamespace, nativeRecordName: String): TypeName? {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeRecordName)
        val clazz = namespace.records.find { it.name == simpleName }
        return clazz?.let { ClassName(namespaceBindingsPackageName(namespace), it.name.toPascalCase()) }
    }

    /**
     * Resolve a [TypeInfo] for the given [GirType].
     */
    @Suppress("LongMethod", "ReturnCount", "CyclomaticComplexMethod")
    @Throws(UnresolvableTypeException::class)
    fun resolveTypeInfo(
        girNamespace: GirNamespace,
        type: GirType,
        nullable: Boolean,
    ): TypeInfo {
        if (type.name == null) {
            throw UnresolvableTypeException("type name is null")
        }

        // first basic types
        getPrimitiveTypeInfo(type)?.let { typeInfo ->
            if (type.cType != null && type.cType.endsWith("*")) {
                logger.error { "Skipping primitive with pointer type" }
                throw UnresolvableTypeException("Unsupported pointer to primitive type")
            }
            return typeInfo.withNullable(nullable)
        }

        // strings
        if (type.name == "utf8" || type.name == "filename") {
            return when (type.cType) {
                "const char*",
                "const gchar*",
                null -> TypeInfo.KString(BindingsGenerator.cpointerOf(BindingsGenerator.KP_BYTEVAR), STRING, true)

                "char*",
                "gchar*" -> TypeInfo.KString(BindingsGenerator.cpointerOf(BindingsGenerator.KP_BYTEVAR), STRING, false)

                else -> {
                    logger.error { "Skipping string type with cType: ${type.cType}" }
                    throw UnresolvableTypeException("Unsupported string with cType ${type.cType}")
                }
            }.withNullable(nullable)
        }

        // aliases
        resolveAliasTypeInfo(girNamespace, type.name)?.let { return it.withNullable(nullable) }

        // aliases
        resolveAliasTypeInfo(girNamespace, type.name)?.let { return it.withNullable(nullable) }

        // classes
        val kotlinClassTypeName = resolveClassTypeName(girNamespace, type.name)
        if (kotlinClassTypeName != null) {
            val (namespace, girClass) = findClassByName(girNamespace, type.name)
            val objectPointerName = if (girClass.parent != null) {
                "${namespacePrefix(namespace)}${girClass.name}Pointer"
            } else {
                "gPointer"
            }
            return TypeInfo.ObjectPointer(
                BindingsGenerator.KP_CPOINTER.parameterizedBy(buildNativeClassName(namespace, girClass)),
                kotlinClassTypeName,
                objectPointerName,
            ).withNullable(nullable)
        }

        // interfaces
        val kotlinInterfaceTypeName = resolveInterfaceTypeName(girNamespace, type.name)
        if (kotlinInterfaceTypeName != null) {
            val (namespace, girInterface) = findInterfaceByName(girNamespace, type.name)
            val objectPointerName = "${namespacePrefix(namespace)}${girInterface.name}Pointer"
            return TypeInfo.InterfacePointer(
                BindingsGenerator.KP_CPOINTER.parameterizedBy(buildNativeClassName(namespace, girInterface)),
                kotlinInterfaceTypeName,
                objectPointerName,
            ).withNullable(nullable)
        }

        // enums
        resolveEnumTypeName(girNamespace, type.name)?.let { pair ->
            val (nativeTypeName, kotlinTypeName) = pair
            return TypeInfo.Enumeration(
                nativeTypeName = nativeTypeName,
                kotlinTypeName = kotlinTypeName,
            ).withNullable(nullable)
        }

        // bitfields
        resolveBitfieldTypeName(girNamespace, type.name)?.let { pair ->
            val (nativeBitfieldTypeName, kotlinBitfieldTypeName) = pair

            return TypeInfo.Bitfield(
                nativeTypeName = nativeBitfieldTypeName,
                kotlinTypeName = kotlinBitfieldTypeName,
            ).withNullable(nullable)
        }

        // records
        try {
            val kotlinRecordTypeName = resolveRecordTypeName(girNamespace, type.name)
                ?: throw UnresolvableTypeException("record ${type.name} not found")
            val (namespace, girRecord) = findRecordByName(girNamespace, type.name)
            if (girRecord.foreign == true) {
                throw UnresolvableTypeException("Foreign record ${girRecord.name} is ignored")
            }
            if (girRecord.disguised == true) {
                throw UnresolvableTypeException("Disguised record ${girRecord.name} is ignored")
            }

            // only use RecordPointer for actual pointers
            if (type.cType == null || type.cType == "gpointer" || type.cType.endsWith("*")) {
                val objectPointerName = "${namespacePrefix(namespace)}${girRecord.name}Pointer"
                return TypeInfo.RecordPointer(
                    kotlinTypeName = kotlinRecordTypeName,
                    nativeTypeName = BindingsGenerator.KP_CPOINTER.parameterizedBy(
                        buildNativeClassName(
                            namespace,
                            girRecord,
                        ),
                    ),
                    objectPointerName,
                ).withNullable(nullable)
            }
        } catch (ignored: UnresolvableTypeException) {
            // fallthrough
        }

        logger.warn { "Could not resolve type for type with name: ${type.name} and cType: ${type.cType}" }
        throw UnresolvableTypeException(type.name)
    }

    fun resolveTypeInfo(
        girNamespace: GirNamespace,
        type: GirAnyType,
        nullable: Boolean,
    ) = when (type) {
        is GirArrayType -> resolveTypeInfo(girNamespace, type, nullable)
        is GirType -> resolveTypeInfo(girNamespace, type, nullable)
    }

    /**
     * Resolve a [TypeInfo] for the given [GirArrayType].
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveTypeInfo(girNamespace: GirNamespace, array: GirArrayType, nullable: Boolean): TypeInfo =
        when (array.type) {
            is GirArrayType -> throw UnresolvableTypeException("Nested array types are not supported")
            is GirType -> if (resolveTypeInfo(girNamespace, array.type, false) is TypeInfo.KString) {
                TypeInfo.StringList(listSize = array.toListSize()).withNullable(nullable)
            } else {
                throw UnresolvableTypeException(
                    "${array.name ?: "Array"} parameter of type ${array.type.name} is not supported",
                )
            }
        }

    fun buildNativeClassName(girNamespace: GirNamespace, girElement: GirNamedElement) =
        ClassName(
            namespaceNativePackageName(girNamespace),
            girElement.cType
                ?: throw UnresolvableTypeException(
                    "missing cType for ${girElement::class.simpleName} ${girElement.name}",
                ),
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

    fun findRecordByNameOrNull(
        targetNamespace: GirNamespace,
        fullyQualifiedName: String,
    ): Pair<GirNamespace, GirRecord>? = try {
        findRecordByName(targetNamespace, fullyQualifiedName)
    } catch (ex: UnresolvableTypeException) {
        null
    }

    @Throws(UnresolvableTypeException::class)
    fun findBitfieldByName(
        targetNamespace: GirNamespace,
        fullyQualifiedName: String,
    ): Pair<GirNamespace, GirBitfield> {
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
    fun needsEnumMemberPackageImport(girEnumeration: GirEnumeration): Boolean =
        enumsWithDirectImportOverride.contains(girEnumeration.cType)

    fun processKdoc(doc: String?): String? = if (config.bindingLicense == Config.License.LGPL) {
        doc.sanitizeKDoc()
    } else {
        null
    }

    private fun String?.sanitizeKDoc(): String? = this?.replace("...]", "]")
        ?.replace(Regex("&[#0-9a-zA-Z]+;")) { "`${it.value}`" }
        ?.replace("%TRUE", "true")
        ?.replace("%FALSE", "false")
        ?.replace("%NULL", "null")

    fun addOptInVersionsBlueprints(namespace: GirNamespace, optInVersionBlueprint: OptInVersionBlueprint?) {
        if (optInVersionBlueprint != null) {
            val set = optInVersionBlueprintsMap.getOrPut(namespace) { mutableSetOf() }
            set.add(optInVersionBlueprint)
        }
    }

    fun getOptInVersionsBlueprints(namespace: GirNamespace): Set<OptInVersionBlueprint> =
        optInVersionBlueprintsMap[namespace]?.toSet().orEmpty()

    private fun getPrimitiveTypeInfo(type: GirType): TypeInfo? =
        when (type.name) {
            "none" -> TypeInfo.Primitive(UNIT)
            "GType" -> TypeInfo.Primitive(G_TYPE)
            "gchar" -> TypeInfo.GChar(G_CHAR, CHAR)
            "gdouble" -> TypeInfo.Primitive(G_DOUBLE)
            "gfloat" -> TypeInfo.Primitive(G_FLOAT)
            "gint" -> TypeInfo.Primitive(G_INT)
            "gint16" -> TypeInfo.Primitive(SHORT)
            "gint32" -> TypeInfo.Primitive(G_INT)
            "gint64" -> TypeInfo.Primitive(G_INT64)
            "gint8" -> TypeInfo.Primitive(G_INT8)
            "glong" -> TypeInfo.Primitive(G_LONG)
            "gsize" -> TypeInfo.Primitive(G_SIZE)
            "gssize" -> TypeInfo.Primitive(LONG)
            "guint" -> TypeInfo.Primitive(G_UINT)
            "guint16" -> TypeInfo.Primitive(G_UINT16)
            "guint32" -> TypeInfo.Primitive(G_UINT)
            "guint64" -> TypeInfo.Primitive(G_UINT64)
            "guint8" -> TypeInfo.Primitive(G_UINT8)
            "gulong" -> TypeInfo.Primitive(G_ULONG)
            "gunichar" -> TypeInfo.Primitive(G_UNICHAR)
            "gpointer" -> TypeInfo.GPointer()
            "gboolean" -> when (type.cType) {
                "gboolean" -> TypeInfo.GBoolean(G_BOOLEAN, BOOLEAN)
                "const gboolean" -> TypeInfo.GBoolean(G_BOOLEAN, BOOLEAN)
                "_Bool" -> TypeInfo.Primitive(BOOLEAN)
                null -> error("gboolean with null cType")
                else -> null
            }

            else -> null
        }

    companion object {
        /**
         * A set of C identifiers for gir objects that should not be generated.
         */
        private val ignoredTypes = hashSetOf(
            // not a pointed type, simd vector?
            "graphene_simd4f_t",
        )

        /**
         * A set of C functions that should not be generated.
         */
        private val ignoredFunctions = hashSetOf(
            // problems with mismatched return type
            "cairo_image_surface_create",

            // Argument type mismatch: is 'CPointer<CapturedType(out CPointed)>', but 'GTraverseType' was expected.
            "g_tree_traverse",

            // On Fedora 41 this is listed in the GIR but the header file is missing
            "g_set_prgname_once",

            // need to convert a org.gtkkn.native.glib.GPtrArray to a List<String>
            "gtk_buildable_parse_context_get_element_stack",
        )

        /**
         * A set of signals that should not be generated.
         */
        private val ignoredSignals = hashSetOf(
            // problems with string conversion in signal handler
            "format-entry-text",
            // problems with pango/cairo region
            "render", // Surface

            "query-tooltip-markup",
            "query-tooltip-text",
        )

        /**
         * A set of C identifiers for enum that cinterop cannot map using `strictEnums`
         * and need their native members imported directly in the package.
         */
        private val enumsWithDirectImportOverride = hashSetOf(
            // cairo
            "cairo_format_t",
            "cairo_content_t",
            "cairo_device_type_t",
            "cairo_status_t",
            "cairo_text_cluster_flags_t",
            // GtkSource-5
            "GtkSourceCompletionActivation",
            "GtkSourceCompletionColumn",
            "GtkSourceViewGutterPosition",
        )
    }
}
