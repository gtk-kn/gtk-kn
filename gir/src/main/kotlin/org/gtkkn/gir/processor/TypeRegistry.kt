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

import com.squareup.kotlinpoet.ClassName
import me.tatarka.inject.annotations.Inject
import org.gtkkn.gir.di.Singleton
import org.gtkkn.gir.model.GirNamedElement
import org.gtkkn.gir.model.GirNamespace

@Singleton
@Inject
class TypeRegistry {
    private val byClassName = mutableMapOf<ClassName, RegisteredType>()
    private val byCType = mutableMapOf<String, RegisteredType>()
    private val byFQName = mutableMapOf<String, RegisteredType>()
    private var resolved = false

    fun register(
        registeredType: RegisteredType
    ) {
        check(!resolved) { "Cannot register new types after resolving inheritance." }

        registeredType.cType?.let { byCType[it] = registeredType }
        byClassName[registeredType.className] = registeredType
        byFQName[registeredType.fullName] = registeredType
    }

    fun get(className: ClassName): RegisteredType? = byClassName[className]
    fun getByCType(cType: String): RegisteredType? = byCType[cType]
    fun getByFullName(fullName: String): RegisteredType? = byFQName[fullName]
    fun get(namespace: GirNamespace, name: String): RegisteredType = get(checkNotNull(namespace.name), name)
    fun get(namespace: String, name: String): RegisteredType {
        val type = if (name.contains('.')) {
            getByFullName(name)
        } else {
            getByFullName("$namespace.$name")
        }
        return checkNotNull(type) { "Unable to find type with ${if (name.contains('.')) "" else "$namespace."}$name" }
    }

    fun get(element: GirNamedElement): RegisteredType {
        val namespace = checkNotNull(element.namespace.name)
        val name = checkNotNull(element.name)
        return get(namespace = namespace, name = name)
    }

    fun resolveInheritance() {
        if (resolved) return
        resolved = true

        // Compute ancestors for each registered type
        for ((_, type) in byFQName) {
            type.allAncestors = computeAncestors(type)
        }
    }

    private fun computeAncestors(type: RegisteredType): List<RegisteredType> {
        val ancestors = mutableListOf<RegisteredType>()
        var current: RegisteredType? = type
        while (current?.parentFullName != null) {
            val parent = getByFullName(checkNotNull(current.parentFullName))
            if (parent != null) {
                ancestors.add(parent)
                current = parent
            } else {
                error(
                    "Parent type not found for '${current.fullName}'. Expected parent: '${current.parentFullName}'. " +
                        "Ensure the parent type is registered in the TypeRegistry.",
                )
            }
        }
        return ancestors
    }

    /**
     * Check if subType inherits from superType.
     * For this to make sense, both types should be in the registry and part of a hierarchy.
     * This checks if `superType` is in `subType`'s ancestors list.
     */
    fun isInstanceOf(subCType: String, superCType: String): Boolean {
        val sub = getByCType(subCType) ?: return false
        val sup = getByCType(superCType) ?: return false
        return sub.allAncestors.contains(sup)
    }

    /**
     * If using ClassNames, we can similarly check:
     */
    fun isInstanceOf(subClassName: ClassName, superClassName: ClassName): Boolean {
        val sub = get(subClassName) ?: return false
        val sup = get(superClassName) ?: return false
        return sub.allAncestors.contains(sup)
    }

    fun isInstanceOfFullName(subFullName: String, superFullName: String): Boolean {
        val sub = getByFullName(subFullName) ?: return false
        val sup = getByFullName(superFullName) ?: return false
        return sub.allAncestors.contains(sup)
    }
}
