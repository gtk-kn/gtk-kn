package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT
import org.gtkkn.gir.blueprints.ConversionType
import org.gtkkn.gir.blueprints.TypeInfo
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRepository
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.util.snakeToCamelCase

/**
 * A context object that has all the Gir information available so any phase 2 processing
 * can resolve types or objects for dependencies
 */
class ProcessorContext(
    private val repositories: List<GirRepository>
) {
    private val typeInfoTable: Map<String, TypeInfo> = mapOf(
        "none" to TypeInfo(UNIT, UNIT, ConversionType.NO_CONVERSION),
        "gboolean" to TypeInfo(INT, BOOLEAN, ConversionType.UNKNOWN),
        "gint" to TypeInfo(INT, INT, ConversionType.NO_CONVERSION),
        "gint32" to TypeInfo(INT, INT, ConversionType.NO_CONVERSION),
        "gint64" to TypeInfo(LONG, LONG, ConversionType.NO_CONVERSION),
        "gfloat" to TypeInfo(FLOAT, FLOAT, ConversionType.NO_CONVERSION),
        "gdouble" to TypeInfo(DOUBLE, DOUBLE, ConversionType.NO_CONVERSION),
        "guint" to TypeInfo(U_INT, U_INT, ConversionType.NO_CONVERSION),
        "guint16" to TypeInfo(U_SHORT, U_SHORT, ConversionType.NO_CONVERSION),
        "guint32" to TypeInfo(U_INT, U_INT, ConversionType.NO_CONVERSION),
        "guint64" to TypeInfo(U_LONG, U_LONG, ConversionType.NO_CONVERSION),
        "gsize" to TypeInfo(U_LONG, U_LONG, ConversionType.NO_CONVERSION),
        "gssize" to TypeInfo(LONG, LONG, ConversionType.NO_CONVERSION),
        "gpointer" to TypeInfo(
            NativeTypes.cpointerOf(STAR),
            NativeTypes.cpointerOf(STAR),
            ConversionType.UNKNOWN,
        ),
        // strings
        "utf8" to TypeInfo(
            NativeTypes.cpointerOf(NativeTypes.KP_BYTEVAR),
            STRING,
            ConversionType.UNKNOWN,
        ),
    )

    // object lookups methods
    fun findRepositoryByNameOrNull(name: String): GirRepository? = repositories.find { it.namespace.name == name }

    fun findNamespaceByNameOrNull(name: String) = findRepositoryByNameOrNull(name)?.namespace

    @Throws(UnresolvableTypeException::class)
    fun findNamespaceByName(name: String) =
        findRepositoryByNameOrNull(name)?.namespace ?: throw UnresolvableTypeException("Namespace $name not found")

    // kotlin names
    fun kotlinizeMethodName(nativeMethodName: String): String = nativeMethodName.snakeToCamelCase()

    fun kotlinizeClassName(nativeClassName: String): String = nativeClassName

    fun kotlinizeInterfaceName(nativeInterfaceName: String): String = nativeInterfaceName.snakeToCamelCase()

    fun kotlinizeEnumName(nativeEnumName: String): String = nativeEnumName.snakeToCamelCase()

    fun kotlinzeEnumMemberName(nativeEnumMemberName: String): String = nativeEnumMemberName.uppercase()

    fun kotlinizePackageName(nativePackageName: String): String = "bindings.${nativePackageName.lowercase()}"

    fun kotlinizeParameterName(nativeParameterName: String): String = nativeParameterName.snakeToCamelCase()

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
        objectName: String
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
    fun resolveEnumTypeName(targetNamespace: GirNamespace, nativeEnumName: String): TypeName {
        val (namespace, simpleName) = extractFullyQualifiedName(targetNamespace, nativeEnumName)
        val enum = namespace.enums.find { it.name == simpleName }
            ?: throw UnresolvableTypeException("enum $nativeEnumName not found")
        return ClassName(namespaceBindingsPackageName(namespace), kotlinizeEnumName(enum.name))
    }

    /**
     * Resolve a [TypeInfo] for the given [GirType].
     */
    fun resolveTypeInfo(girNamespace: GirNamespace, type: GirType): TypeInfo {
        if (type.name == null) {
            throw UnresolvableTypeException("type name is null")
        }
        // first basic types
        typeInfoTable[type.name]?.let { return it }

        // classes
        try {
            val classTypeName = resolveClassTypeName(girNamespace, type.name)
            return TypeInfo(
                NativeTypes.cpointerOf(STAR),
                classTypeName,
                ConversionType.OBJECT_POINTER,
            )
        } catch (ignored: UnresolvableTypeException) {
            // fallthrough
        }

        // interfaces
        try {
            val interfaceTypeName = resolveInterfaceTypeName(girNamespace, type.name)
            return TypeInfo(
                NativeTypes.cpointerOf(STAR),
                interfaceTypeName,
                ConversionType.OBJECT_POINTER,
            )
        } catch (ignored: UnresolvableTypeException) {
            // fallthrough
        }

        // enums
        try {
            val enumTypeName = resolveEnumTypeName(girNamespace, type.name)
            return TypeInfo(U_INT, enumTypeName, ConversionType.ENUMERATION)
        } catch (ignored: UnresolvableTypeException) {
            // fallthrough
        }

        throw UnresolvableTypeException(type.name)
    }
}

class UnresolvableTypeException(private val reason: String) : Exception() {
    override val message: String = "Unresolvable type: $reason"
}
