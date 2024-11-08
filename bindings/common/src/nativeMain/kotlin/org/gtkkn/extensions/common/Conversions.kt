/*
 * Copyright (c) 2024 gtk-kn
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

package org.gtkkn.extensions.common

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CArrayPointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVarOf
import kotlinx.cinterop.MemScope
import kotlinx.cinterop.allocArrayOf
import kotlinx.cinterop.cstr
import kotlinx.cinterop.get
import kotlinx.cinterop.toKString

public fun Int.asBoolean(): Boolean = this > 0

public fun Boolean.asGBoolean(): Int = if (this) 1 else 0

/**
 * Convert a Kotlin [List<String>] into its native equivalent.
 */
public fun List<String>.toCStringList(scope: MemScope): CArrayPointer<CPointerVarOf<CPointer<ByteVar>>> = with(scope) {
    return allocArrayOf(this@toCStringList.map { it.cstr.getPointer(this) } + null)
}

/**
 * Convert a native char** into a Kotlin [List<String>].
 */
public fun CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>.toKStringList(): List<String> = buildList {
    var i = 0
    while (this@toKStringList[i] != null) {
        add(this@toKStringList[i]!!.toKString())
        i++
    }
}
