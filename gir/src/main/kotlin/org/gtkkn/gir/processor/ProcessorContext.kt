package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT
import org.gtkkn.gir.blueprints.ConversionType
import org.gtkkn.gir.blueprints.TypeNamePair
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
    fun findRepositoryByName(name: String): GirRepository? = repositories.find { it.namespace.name == name }
    fun findNamespaceByName(name: String) = repositories.map { it.namespace }.find { it.name == name }

    fun kotlinizeMethodName(nativeMethodName: String): String = nativeMethodName.snakeToCamelCase()

    fun kotlinizeClassName(nativeClassName: String): String = nativeClassName

    fun kotlinizeInterfaceName(nativeInterfaceName: String): String = nativeInterfaceName.snakeToCamelCase()

    fun kotlinizeEnumName(nativeEnumName: String): String = nativeEnumName.snakeToCamelCase()

    fun kotlinzeEnumMemberName(nativeEnumMemberName: String): String = nativeEnumMemberName.uppercase()

    fun kotlinizePackageName(nativePackageName: String): String = "bindings.${nativePackageName.lowercase()}"

    fun namespacePrefix(namespace: GirNamespace): String = namespace.name.lowercase()

    fun namespaceNativePackageName(namespace: GirNamespace): String = "native.${namespacePrefix(namespace)}"
    fun namespaceBindingsPackageName(namespace: GirNamespace): String = "bindings.${namespacePrefix(namespace)}"

    /**
     * Resolve the [TypeName] for the objectPointer we have in all classes.
     *
     * For example, for Widget, this will return kotlinx.cinterop.CPointer<native.gtk.Widget>.
     */
    fun resolveClassObjectPointerTypeName(namespace: GirNamespace, clazz: GirClass): TypeName =
        ClassName("kotlinx.cinterop", "CPointer").parameterizedBy(
            ClassName(namespaceNativePackageName(namespace), clazz.cType ?: error("No cType for class ${clazz.name}")),
        )

    /**
     * Resolve the [TypeName] for the objectPointer we have in all interfaces.
     */
    fun resolveInterfaceObjectPointerTypeName(namespace: GirNamespace, iface: GirInterface): TypeName =
        ClassName("kotlinx.cinterop", "CPointer").parameterizedBy(
            ClassName(namespaceNativePackageName(namespace), iface.cType ?: error("No cType for class ${iface.name}")),
        )

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
        val parts = nativeInterfaceName.split(".")

        val namespace = when (parts.count()) {
            1 -> targetNamespace
            2 -> findNamespaceByName(parts.first())
                ?: throw UnresolvableTypeException("namespace ${parts.first()} does not exist")

            else -> throw UnresolvableTypeException(nativeInterfaceName)
        }
        val ifaceName = parts.last()
        val iface = namespace.interfaces.find { it.name == ifaceName }
        if (iface != null) {
            return ClassName(namespaceBindingsPackageName(namespace), kotlinizeInterfaceName(ifaceName))
        } else {
            throw UnresolvableTypeException(nativeInterfaceName)
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
        val parts = nativeClassName.split(".")

        val namespace = when (parts.count()) {
            1 -> targetNamespace
            2 -> findNamespaceByName(parts.first())
                ?: throw UnresolvableTypeException("namespace ${parts.first()} does not exist")

            else -> throw UnresolvableTypeException(nativeClassName)
        }
        val className = parts.last()
        val clazz = namespace.classes.find { it.name == className }
        if (clazz != null) {
            return ClassName(namespaceBindingsPackageName(namespace), kotlinizeClassName(className))
        } else {
            throw UnresolvableTypeException(nativeClassName)
        }
    }

    fun resolveEnumTypeName(targetNamespace: GirNamespace, nativeEnumName: String): TypeName {
        val parts = nativeEnumName.split(".")

        val namespace = when (parts.count()) {
            1 -> targetNamespace
            2 -> findNamespaceByName(parts.first())
                ?: throw UnresolvableTypeException("namespace ${parts.first()} does not exist")

            else -> throw UnresolvableTypeException(nativeEnumName)
        }
        val enumName = parts.last()
        val enum = namespace.enums.find { it.name == enumName }
        if (enum != null) {
            return ClassName(namespaceBindingsPackageName(namespace), kotlinizeClassName(enumName))
        } else {
            throw UnresolvableTypeException(nativeEnumName)
        }
    }

    /**
     * Resolve a [TypeNamePair] for the given [GirType].
     */
    fun resolveTypeNamePair(girNamespace: GirNamespace, type: GirType): TypeNamePair {
        // first basic types
        if (type.name == "none") {
            return TypeNamePair(UNIT, UNIT, ConversionType.SAME_TYPE)
        }
        if (type.name == "gboolean") {
            return TypeNamePair(INT, BOOLEAN, ConversionType.UNKNOWN) // TODO
        }
        if (type.name == "gint") {
            return TypeNamePair(INT, INT, ConversionType.SAME_TYPE)
        }
        if (type.name == "gint32") {
            return TypeNamePair(INT, INT, ConversionType.SAME_TYPE)
        }
        if (type.name == "gint64") {
            return TypeNamePair(LONG, LONG, ConversionType.SAME_TYPE)
        }
        if (type.name == "gfloat") {
            return TypeNamePair(FLOAT, FLOAT, ConversionType.SAME_TYPE)
        }
        if (type.name == "gdouble") {
            return TypeNamePair(DOUBLE, DOUBLE, ConversionType.SAME_TYPE)
        }
        if (type.name == "guint") {
            return TypeNamePair(U_INT, U_INT, ConversionType.SAME_TYPE)
        }
        if (type.name == "guint16") {
            return TypeNamePair(U_SHORT, U_SHORT, ConversionType.SAME_TYPE)
        }
        if (type.name == "guint32") {
            return TypeNamePair(U_INT, U_INT, ConversionType.SAME_TYPE)
        }
        if (type.name == "guint64") {
            return TypeNamePair(U_LONG, U_LONG, ConversionType.SAME_TYPE)
        }
        if (type.name == "gsize") {
            return TypeNamePair(U_LONG, U_LONG, ConversionType.SAME_TYPE)
        }
        if (type.name == "gssize") {
            return TypeNamePair(LONG, LONG, ConversionType.SAME_TYPE)
        }

        if (type.name == "gpointer") {
            return TypeNamePair(
                ClassName("kotlinx.cinterop", "CPointer").parameterizedBy(STAR),
                ClassName("kotlinx.cinterop", "CPointer").parameterizedBy(STAR),
                ConversionType.UNKNOWN
            )
        }

        // strings
        if (type.name == "utf8") {
            return TypeNamePair(
                ClassName("kotlinx.cinterop", "CPointer").plusParameter(ClassName("kotlinx.cinterop", "ByteVar")),
                STRING,
                ConversionType.UNKNOWN
            )
        }

        if (type.name == null) {
            throw UnresolvableTypeException("<empty>")
        }

        // classes
        try {
            val classTypeName = resolveClassTypeName(girNamespace, type.name)
            return TypeNamePair(
                ClassName(
                    "kotlinx.cinterop",
                    "CPointer",
                ).parameterizedBy(STAR), // TODO proper type info of class pointer
                classTypeName,
                ConversionType.OBJECT // TODO
            )
        } catch (ex: UnresolvableTypeException) {
            // fallthrough
        }

        // interfaces
        try {
            val interfaceTypeName = resolveInterfaceTypeName(girNamespace, type.name)
            return TypeNamePair(
                ClassName(
                    "kotlinx.cinterop",
                    "CPointer",
                ).parameterizedBy(STAR), // TODO proper type info of interface pointer
                interfaceTypeName,
                ConversionType.OBJECT // TODO
            )
        } catch (ex: UnresolvableTypeException) {
            // fallthrough
        }

        // enums
        // TODO
        try {
            val enumTypeName = resolveEnumTypeName(girNamespace, type.name)
            return TypeNamePair(U_INT, enumTypeName, ConversionType.ENUMERATION)
        } catch (ex: UnresolvableTypeException) {
            // fallthrough
        }

        println("Resolving return type with name: ${type.name}, cType: ${type.cType}")
        throw UnresolvableTypeException(type.name)
    }
}

class UnresolvableTypeException(val type: String) : Exception() {
    override val message: String = "Could not resolve type $type"
}
