package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRepository
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
}

class UnresolvableTypeException(val type: String) : Exception() {
    override val message: String = "Could not resolve type $type"
}
