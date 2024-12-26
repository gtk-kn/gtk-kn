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
import com.squareup.kotlinpoet.DOUBLE
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
import org.gtkkn.gir.generator.G_INTPTR
import org.gtkkn.gir.generator.G_LONG
import org.gtkkn.gir.generator.G_SIZE
import org.gtkkn.gir.generator.G_TYPE
import org.gtkkn.gir.generator.G_UINT
import org.gtkkn.gir.generator.G_UINT16
import org.gtkkn.gir.generator.G_UINT64
import org.gtkkn.gir.generator.G_UINT8
import org.gtkkn.gir.generator.G_UINTPTR
import org.gtkkn.gir.generator.G_ULONG
import org.gtkkn.gir.generator.G_UNICHAR
import org.gtkkn.gir.generator.G_USHORT
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirAlias
import org.gtkkn.gir.model.GirAnyType
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirBitfield
import org.gtkkn.gir.model.GirCallback
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirConstant
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
    val typeRegistry: TypeRegistry,
) {
    private val optInVersionBlueprintsMap = mutableMapOf<GirNamespace, MutableSet<OptInVersionBlueprint>>()

    // object lookups methods
    fun findRepositoryByNameOrNull(name: String): GirRepository? =
        repositories.find { it.namespaces.first().name == name }

    @Throws(UnresolvableTypeException::class)
    fun findNamespaceByName(name: String) =
        findRepositoryByNameOrNull(name)?.namespaces?.first()
            ?: throw UnresolvableTypeException("Namespace $name not found")

    /**
     * Resolve the [TypeName] for the objectPointer we have in all classes.
     *
     * For example, for Widget, this will return kotlinx.cinterop.CPointer<native.gtk.Widget>.
     */
    @Throws(UnresolvableTypeException::class)
    fun resolveClassObjectPointerTypeName(namespace: GirNamespace, clazz: GirClass): TypeName {
        var ns = namespace
        var cType = clazz.cType
        if (cType == null) {
            val parent = typeRegistry
                .get(clazz)
                .allAncestors
                .firstOrNull { it.cType != null }
                ?: throw UnresolvableTypeException("Missing cType on class")
            ns = parent.namespace
            cType = parent.cType
        }
        return BindingsGenerator.cpointerOf(ClassName(namespaceNativePackageName(ns), checkNotNull(cType)))
    }

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
    fun resolveInterfaceObjectPointerTypeName(namespace: GirNamespace, cType: String): TypeName =
        BindingsGenerator.cpointerOf(ClassName(namespaceNativePackageName(namespace), cType))

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
     * Otherwise, the [targetNamespace] is used.
     *
     * @param registeredType the [RegisteredType] we are resolving.
     * @return fully qualified [TypeInfo.Alias] object for the alias, or null if the alias cannot be resolved.
     */
    private fun resolveAliasTypeInfo(registeredType: RegisteredType): TypeInfo.Alias {
        val baseGirType = (registeredType.girNamedElement as GirAlias).type
        val baseTypeInfo = resolveTypeInfo(registeredType.girNamedElement.namespace, baseGirType, false)
        val nativeTypeName =
            registeredType.cType?.let { typeRegistry.getByCType(it)?.className } ?: baseTypeInfo.nativeTypeName
        return TypeInfo.Alias(
            nativeTypeName = nativeTypeName,
            kotlinTypeName = registeredType.className,
            baseTypeInfo = baseTypeInfo,
        )
    }

    private fun resolveBitfieldTypeInfo(registeredType: RegisteredType): TypeInfo.Bitfield =
        TypeInfo.Bitfield(
            nativeTypeName = ClassName(
                namespaceNativePackageName(registeredType.namespace),
                checkNotNull(registeredType.cType),
            ),
            kotlinTypeName = registeredType.className,
        )

    private fun resolveEnumerationTypeInfo(registeredType: RegisteredType): TypeInfo.Enumeration =
        TypeInfo.Enumeration(
            nativeTypeName = ClassName(
                namespaceNativePackageName(registeredType.namespace),
                checkNotNull(registeredType.cType),
            ),
            kotlinTypeName = registeredType.className,
        )

    private fun resolveClassTypeInfo(registeredType: RegisteredType): TypeInfo.ObjectPointer {
        val objectPointerName = if (registeredType.allAncestors.isNotEmpty()) {
            "${namespacePrefix(registeredType.namespace)}${registeredType.className.simpleName}Pointer"
        } else {
            "gPointer"
        }
        val nativeTypeName =
            BindingsGenerator.KP_CPOINTER.parameterizedBy(
                buildNativeClassName(
                    registeredType.namespace,
                    registeredType.findFirstWithCType()?.girNamedElement ?: registeredType.girNamedElement,
                ),
            )
        return TypeInfo.ObjectPointer(
            nativeTypeName = nativeTypeName,
            kotlinTypeName = registeredType.className,
            objectPointerName = objectPointerName,
        )
    }

    private fun resolveInterfaceTypeInfo(registeredType: RegisteredType): TypeInfo.InterfacePointer {
        val objectPointerName =
            "${namespacePrefix(registeredType.namespace)}${registeredType.className.simpleName}Pointer"
        return TypeInfo.InterfacePointer(
            BindingsGenerator.KP_CPOINTER.parameterizedBy(
                buildNativeClassName(
                    registeredType.namespace,
                    registeredType.girNamedElement,
                ),
            ),
            registeredType.className,
            objectPointerName,
        )
    }

    private fun resolveRecordTypeInfo(registeredType: RegisteredType): TypeInfo.RecordPointer {
        if (registeredType.girNamedElement is GirRecord && registeredType.girNamedElement.foreign == true) {
            throw UnresolvableTypeException("Foreign record ${registeredType.rawName} is ignored")
        }
        val objectPointerName = "gPointer"
        return TypeInfo.RecordPointer(
            kotlinTypeName = registeredType.className,
            nativeTypeName = BindingsGenerator.KP_CPOINTER.parameterizedBy(
                buildNativeClassName(
                    registeredType.namespace,
                    registeredType.girNamedElement,
                ),
            ),
            objectPointerName = objectPointerName,
        )
    }

    fun resolveCallbackTypeName(targetNamespace: GirNamespace, nativeCallbackName: String): ClassName? {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeCallbackName)
        val callback = namespace.callbacks.find { it.name == simpleName }
        return callback?.let { ClassName(namespaceBindingsPackageName(namespace), callback.name.toPascalCase()) }
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

        if (type.name == "va_list") {
            throw UnresolvableTypeException("va_list type is not supported")
        }

        type.cType?.let { checkIgnoredType(it) }

        // first basic types
        getPrimitiveTypeInfo(type)?.let { typeInfo ->
            if (type.cType != null && type.cType.endsWith("*")) {
                logger.error { "Skipping primitive with pointer type" }
                throw UnresolvableTypeException("Unsupported pointer to primitive type")
            }
            return typeInfo.withNullable(nullable)
        }

        // strings
        if (type.name == "utf8" || type.name == "filename" || type.name == "const char*") {
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

        val registeredType = typeRegistry.get(girNamespace, type.name)

        when (registeredType.girNamedElement) {
            is GirAlias -> return resolveAliasTypeInfo(registeredType).withNullable(nullable)
            is GirBitfield -> return resolveBitfieldTypeInfo(registeredType).withNullable(nullable)
            is GirCallback -> Unit // TODO
            is GirClass -> return resolveClassTypeInfo(registeredType).withNullable(nullable)
            is GirConstant -> Unit // TODO
            is GirEnumeration -> return resolveEnumerationTypeInfo(registeredType).withNullable(nullable)
            is GirInterface -> return resolveInterfaceTypeInfo(registeredType).withNullable(nullable)
            is GirRecord -> if (type.cType == null || type.cType == "gpointer" || type.cType.endsWith("*")) {
                return resolveRecordTypeInfo(registeredType).withNullable(nullable)
            } else {
                throw UnresolvableTypeException("Not-pointer record ${registeredType.rawName} is ignored")
            }

            is GirUnion -> Unit // TODO
        }

        // TODO Unions

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

    fun findRecordByNameOrNull(
        targetNamespace: GirNamespace,
        fullyQualifiedName: String,
    ): RegisteredType? = try {
        typeRegistry.get(targetNamespace, fullyQualifiedName)
    } catch (ex: IllegalStateException) {
        null
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
        if (ignoredTypes.contains(cType.removeSuffix("*"))) {
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
            "GType" -> TypeInfo.Primitive(G_TYPE)
            "gchar" -> TypeInfo.GChar(G_CHAR, CHAR)
            "gdouble" -> TypeInfo.Primitive(G_DOUBLE)
            "gfloat" -> TypeInfo.Primitive(G_FLOAT)
            "gint" -> TypeInfo.Primitive(G_INT)
            "gint16" -> TypeInfo.Primitive(SHORT)
            "gint32" -> TypeInfo.Primitive(G_INT)
            "gint64" -> TypeInfo.Primitive(G_INT64)
            "gint8" -> TypeInfo.Primitive(G_INT8)
            "gintptr" -> TypeInfo.Primitive(G_INTPTR)
            "glong" -> TypeInfo.Primitive(G_LONG)
            "gpointer" -> TypeInfo.GPointer()
            "gsize" -> TypeInfo.Primitive(G_SIZE)
            "gssize" -> TypeInfo.Primitive(LONG)
            "guint" -> TypeInfo.Primitive(G_UINT)
            "guint16" -> TypeInfo.Primitive(G_UINT16)
            "guint32" -> TypeInfo.Primitive(G_UINT)
            "guint64" -> TypeInfo.Primitive(G_UINT64)
            "guint8" -> TypeInfo.Primitive(G_UINT8)
            "guintptr" -> TypeInfo.Primitive(G_UINTPTR)
            "gulong" -> TypeInfo.Primitive(G_ULONG)
            "gunichar" -> TypeInfo.Primitive(G_UNICHAR)
            "gushort" -> TypeInfo.Primitive(G_USHORT)
            "long double" -> TypeInfo.Primitive(DOUBLE)
            "none" -> TypeInfo.Primitive(UNIT)
            "time_t" -> TypeInfo.Primitive(LONG)
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

            // Harfbuzz headers require only "hb.h" to be included directly. Including other internal headers
            // (e.g., hb-blob.h, hb-buffer.h) triggers errors due to a #error directive in those files.
            "hb_font_t",
        )

        /**
         * A set of C functions that should not be generated.
         */
        private val ignoredFunctions = hashSetOf(
            // Argument type mismatch: is 'CPointer<CapturedType(out CPointed)>', but 'GTraverseType' was expected.
            "g_tree_traverse",

            // On Fedora 41 this is listed in the GIR but the header file is missing
            "g_set_prgname_once",

            // need to convert a org.gtkkn.native.glib.GPtrArray to a List<String>
            "gtk_buildable_parse_context_get_element_stack",

            // not resolved by cinterop
            "g_assertion_message_cmpnum",
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

// namespace naming
fun namespacePrefix(namespace: GirNamespace): String = checkNotNull(namespace.mainSymbolPrefix)
    .replace("_", "")
    .lowercase()

fun namespaceNativePackageName(namespace: GirNamespace): String =
    "org.gtkkn.native.${namespacePrefix(namespace)}"

fun namespaceBindingsPackageName(namespace: GirNamespace): String =
    "org.gtkkn.bindings.${namespacePrefix(namespace)}"
