/*
 * Copyright (c) 2023 gtk-kt
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

package org.gtkkn.extensions.glib

import kotlinx.cinterop.NativePtr
import kotlinx.cinterop.nativeHeap

/**
 * A reference to a heap allocated Record (C struct).
 *
 * Do not forget to call [free] on the [RecordRef] once you are done using it.
 */
public class RecordRef<TYPE : Record>(
    nativePtr: NativePtr,
    private val record: TYPE
) {
    private var nativePtr: NativePtr? = nativePtr

    /**
     * Get the underlying [record]
     */
    public fun get(): TYPE = if (nativePtr != null) {
        record
    } else {
        error("RecordRef accessed after it was freed")
    }

    /**
     * Free the memory.
     *
     * After calling this method, this [RecordRef] should not be accessed anymore.
     */
    public fun free() {
        val ptr = nativePtr
        if (ptr != null) {
            nativeHeap.free(ptr)
            nativePtr = null
        } else {
            error("Double free on RecordRef")
        }
    }

    /**
     * Use the value of this record.
     *
     * After this method returns, the underlying memory is freed and the [RecordRef]
     * should not be accessed anymore.
     */
    public fun use(func: (TYPE) -> Unit) {
        func(get())
        free()
    }
}
