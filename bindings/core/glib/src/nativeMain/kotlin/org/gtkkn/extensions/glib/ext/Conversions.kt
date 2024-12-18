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

package org.gtkkn.extensions.glib.ext

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CArrayPointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVarOf
import kotlinx.cinterop.allocArrayOf
import kotlinx.cinterop.cstr
import kotlinx.cinterop.get
import kotlinx.cinterop.toKString
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gcharVar
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gpointerVar

/**
 * Converts a Kotlin [Boolean] into its native C equivalent `gboolean`.
 *
 * In the C language, `gboolean` is typically represented as an integer,
 * where `1` corresponds to `true` and `0` corresponds to `false`.
 *
 * @receiver The Kotlin [Boolean] value to convert.
 * @return `1` if the [Boolean] is `true`, or `0` if it is `false`.
 */
public fun Boolean.asGBoolean(): gboolean = if (this) 1 else 0

/**
 * Converts a native C `gboolean` into its Kotlin equivalent [Boolean].
 *
 * In the C language, `gboolean` is typically represented as an integer,
 * where any non-zero value is considered `true`, and `0` is `false`.
 *
 * @receiver The native `gboolean` value to convert.
 * @return `true` if the [gboolean] is non-zero, or `false` if it is `0`.
 */

public fun gboolean.asBoolean(): Boolean = this != 0

/**
 * Converts a Kotlin [List] of [String] into its native C equivalent: an array of C strings (`char**`).
 *
 * This function uses the provided [AutofreeScope] to allocate the necessary memory for the C string array,
 * ensuring that the memory is automatically managed and freed when the scope exits.
 *
 * Each string in the [List] is converted to a C string (`char*`) using UTF-8 encoding.
 * If [nullTerminate] is `true` (default), a `null` pointer is appended to the array to indicate the end of the list.
 * If [nullTerminate] is `false`, the array will not be null-terminated.
 *
 * @receiver The Kotlin [List] of [String] to convert.
 * @param scope The [AutofreeScope] used to allocate memory for the native array and its elements.
 * @param nullTerminate Whether to append a `null` pointer at the end of the array. Defaults to `true`.
 * @return A pointer to the array of C strings (`char**`), null-terminated if [nullTerminate] is `true`.
 */
public fun List<String>.toCStringList(
    scope: AutofreeScope,
    nullTerminate: Boolean = true
): CArrayPointer<CPointerVarOf<CPointer<gcharVar>>> = with(scope) {
    val cStrings = this@toCStringList.map { it.cstr.getPointer(this) }
    val cStringArray = if (nullTerminate) cStrings + null else cStrings
    return allocArrayOf(cStringArray)
}

/**
 * Extension function to convert a native `char**` pointer into a Kotlin [List] of [String].
 *
 * This function treats the array as null-terminated and processes elements until a `null` is found.
 *
 * @receiver A pointer to a null-terminated array of C strings (`char**`).
 * @return A [List] of [String] representing the non-null contents of the native `char**`.
 */
public fun CArrayPointer<CPointerVarOf<CPointer<gcharVar>>>.toKStringList(): List<String> = buildList {
    var index = 0
    while (this@toKStringList[index] != null) {
        add(checkNotNull(this@toKStringList[index]).toKString())
        index++
    }
}

/**
 * Extension function to convert a native `char**` pointer into a Kotlin [List] of nullable [String].
 *
 * This function processes exactly [size] elements from the array, allowing for the possibility of null values.
 *
 * @receiver A pointer to an array of C strings (`char**`).
 * @param size The number of elements to process from the native array.
 * @return A [List] of nullable [String] representing the contents of the native `char**`.
 *         Null elements are preserved as `null` in the resulting list.
 */
public fun CArrayPointer<CPointerVarOf<CPointer<gcharVar>>>.toKStringList(size: Int): List<String?> =
    List(size) { index -> this[index]?.toKString() }

/**
 * Converts a Kotlin [List] of [gpointer] into a native C array (`gpointer**`).
 *
 * This function uses the provided [AutofreeScope] to allocate the necessary memory for the C array,
 * ensuring that the memory is automatically managed and freed when the scope exits.
 *
 * @receiver A [List] of [gpointer] to convert.
 * @param scope The [AutofreeScope] used to allocate memory for the native array.
 * @param nullTerminate Whether to append a `null` pointer at the end of the array. Defaults to `true`.
 * @return A pointer to the C array (`gpointer**`), null-terminated if [nullTerminate] is `true`.
 */
public fun List<gpointer>.toGPointerCArray(
    scope: AutofreeScope,
    nullTerminate: Boolean = true
): CArrayPointer<gpointerVar> =
    with(scope) {
        val cPointers = this@toGPointerCArray
        val cPointerArray = if (nullTerminate) cPointers + null else cPointers
        return allocArrayOf(cPointerArray)
    }

/**
 * Converts a native `gpointer**` pointer into a Kotlin [List] of [gpointer].
 *
 * This function treats the array as null-terminated and processes elements until a `null` is found.
 *
 * @receiver A pointer to a null-terminated array of `gpointer` (`gpointer**`).
 * @return A [List] of [gpointer] representing the non-null contents of the native `gpointer**`.
 */
public fun CArrayPointer<gpointerVar>.toGPointerList(): List<gpointer> = buildList {
    var index = 0
    while (this@toGPointerList[index] != null) {
        add(checkNotNull(this@toGPointerList[index]))
        index++
    }
}

/**
 * Converts a native `gpointer**` pointer into a Kotlin [List] of nullable [gpointer].
 *
 * This function processes exactly [size] elements from the array, allowing for the possibility of null values.
 *
 * @receiver A pointer to an array of `gpointer` (`gpointer**`).
 * @param size The number of elements to process from the native array.
 * @return A [List] of nullable [gpointer] representing the contents of the native `gpointer**`.
 *         Null elements are preserved as `null` in the resulting list.
 */
public fun CArrayPointer<gpointerVar>.toGPointerList(size: Int): List<gpointer?> =
    List(size) { index -> this[index] }