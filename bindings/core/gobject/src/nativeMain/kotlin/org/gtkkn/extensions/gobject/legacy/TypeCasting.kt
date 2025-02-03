/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.extensions.gobject.legacy

import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import kotlin.reflect.KClass

public typealias CastFunc = () -> Unit

internal object TypeCasting {
    private val userDefinedTypeMap = mutableMapOf<KClass<*>, KGType<*>>()

    private val typeProviders = mutableSetOf<TypeProvider>()

    fun registerUserDefinedType(clazz: KClass<*>, type: KGType<*>) {
        userDefinedTypeMap[clazz] = type
    }

    fun registerProvider(provider: TypeProvider) {
        typeProviders.add(provider)
    }

    fun <T : Any> castObject(obj: Object, targetClass: KClass<T>): T {
        val kgType = userDefinedTypeMap[targetClass] ?: resolveTypeFromProviders(targetClass)

        @Suppress("UNCHECKED_CAST")
        return kgType?.convertPointerFunc?.invoke(obj.gobjectObjectPointer.reinterpret()) as? T
            ?: error("Cannot cast to ${targetClass.simpleName}")
    }

    private fun resolveTypeFromProviders(targetClass: KClass<*>): KGType<*>? =
        typeProviders.firstNotNullOfOrNull { it.resolveType(targetClass) }

    private fun TypeProvider.resolveType(targetClass: KClass<*>): KGType<*>? = typeMap[targetClass]
}
