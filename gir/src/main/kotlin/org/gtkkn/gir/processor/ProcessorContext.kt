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
import org.gtkkn.gir.blueprints.TypeNamePair
import org.gtkkn.gir.model.GirClass
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

    fun kotlinizePackageName(nativePackageName: String): String = "bindings.${nativePackageName.lowercase()}"

    fun namespacePrefix(namespace: GirNamespace): String = namespace.name.lowercase()
    fun namespaceNativePackageName(namespace: GirNamespace): String = "native.${namespace.name.lowercase()}"

    /**
     * Resolve the [TypeName] for the objectPointer we have in all classes.
     *
     * For example, for Widget, this will return kotlinx.cinterop.CPointer<native.gtk.Widget>.
     */
    fun resolveClassObjectPointerTypeName(namespace: GirNamespace, clazz: GirClass): TypeName =
        ClassName("kotlinx.cinterop", "CPointer").parameterizedBy(
            ClassName(namespaceNativePackageName(namespace), clazz.glibTypeName),
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
        return when (parts.count()) {
            1 -> ClassName(kotlinizePackageName(targetNamespace.name), kotlinizeInterfaceName(nativeInterfaceName))
            2 -> {
                val namespace = findNamespaceByName(parts.first())
                if (namespace != null) {
                    ClassName(kotlinizePackageName(namespace.name), kotlinizeInterfaceName(parts.last()))
                } else {
                    throw UnresolvableTypeException(nativeInterfaceName)
                }
            }

            else -> throw UnresolvableTypeException(nativeInterfaceName)
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
        return when (parts.count()) {
            1 -> ClassName(kotlinizePackageName(targetNamespace.name), kotlinizeClassName(nativeClassName))
            2 -> {
                val namespace = findNamespaceByName(parts.first())
                if (namespace != null) {
                    ClassName(kotlinizePackageName(namespace.name), kotlinizeClassName(parts.last()))
                } else {
                    throw UnresolvableTypeException(nativeClassName)
                }
            }

            else -> throw UnresolvableTypeException(nativeClassName)
        }
    }

    /**
     * Resolve a [TypeNamePair] for the given [GirType].
     */
    fun resolveTypeNamePair(girNamespace: GirNamespace, type: GirType): TypeNamePair {
        // first basic types
        if (type.name == "none") {
            return TypeNamePair(UNIT, UNIT)
        }
        if (type.name == "gboolean") {
            return TypeNamePair(INT, BOOLEAN)
        }
        if (type.name == "gint") {
            return TypeNamePair(INT, INT)
        }
        if (type.name == "gint32") {
            return TypeNamePair(INT, INT)
        }
        if (type.name == "gint64") {
            return TypeNamePair(LONG, LONG)
        }
        if (type.name == "gfloat") {
            return TypeNamePair(FLOAT, FLOAT)
        }
        if (type.name == "gdouble") {
            return TypeNamePair(DOUBLE, DOUBLE)
        }
        if (type.name == "guint") {
            return TypeNamePair(U_INT, U_INT)
        }
        if (type.name == "guint16") {
            return TypeNamePair(U_SHORT, U_SHORT)
        }
        if (type.name == "guint32") {
            return TypeNamePair(U_INT, U_INT)
        }
        if (type.name == "guint64") {
            return TypeNamePair(U_LONG, U_LONG)
        }
        if (type.name == "gsize") {
            return TypeNamePair(U_LONG, U_LONG)
        }
        if (type.name == "gssize") {
            return TypeNamePair(LONG, LONG)
        }

        if (type.name == "gpointer") {
            return TypeNamePair(
                ClassName("kotlinx.cinterop", "CPointer").parameterizedBy(STAR),
                ClassName("kotlinx.cinterop", "CPointer").parameterizedBy(STAR),
            )
        }

        // strings
        if (type.name == "utf8") {
            return TypeNamePair(
                ClassName("kotlinx.cinterop", "CPointer").plusParameter(ClassName("kotlinx.cinterop", "ByteVar")),
                STRING,
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
            )
        } catch (ex: UnresolvableTypeException) {
            // fallthrough
        }

        // enums
        // TODO

        println("Resolving return type with name: ${type.name}, cType: ${type.cType}")
        throw UnresolvableTypeException(type.name)
    }
}

class UnresolvableTypeException(val type: String) : Exception() {
    override val message: String = "Could not resolve type $type"
}
