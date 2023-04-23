/*
 * Copyright (c) 2023 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.extensions.gobject

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
        return kgType?.convertPointerFunc?.invoke(obj.gPointer.reinterpret()) as? T
            ?: error("Cannot cast to ${targetClass.simpleName}")
    }

    private fun resolveTypeFromProviders(targetClass: KClass<*>): KGType<*>? =
        typeProviders.firstNotNullOfOrNull { it.resolveType(targetClass) }

    private fun TypeProvider.resolveType(targetClass: KClass<*>): KGType<*>? = typeMap[targetClass]
}
