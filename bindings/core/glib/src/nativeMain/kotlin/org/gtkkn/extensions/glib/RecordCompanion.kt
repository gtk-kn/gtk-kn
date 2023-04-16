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

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CVariable
import kotlinx.cinterop.MemScope
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

/**
 * An interface that should be implemented by companion objects for  wrapper classes
 * that wrap Records (C structs).
 */
public interface RecordCompanion<TYPE : Record, STRUCT : CPointed> {
    /**
     * Wrap a [CPointer] pointing to a record of this type into its wrapper class.
     */
    public fun wrapRecordPointer(pointer: CPointer<*>): TYPE
}

/**
 * Allocate memory and instantiate a wrapper instance of this record type on the native heap.
 *
 * The return value is wrapped in a [RecordRef] and [RecordRef.free] should be called on it
 * once you are done and the memory can be deallocated.
 * @see RecordRef
 */
public inline fun <reified COMPANION, reified TYPE, reified STRUCT> COMPANION.allocateHeap(): RecordRef<TYPE>
    where TYPE : Record,
          STRUCT : CVariable,
          COMPANION : RecordCompanion<TYPE, STRUCT> {
    val v = nativeHeap.alloc<STRUCT>()
    val record = wrapRecordPointer(v.ptr.reinterpret<STRUCT>())
    return RecordRef(v.rawPtr, record)
}

/**
 * Allocate memory and instantiate a wrapper instance of this record in the given [MemScope]
 *
 * The return value is bound to the given [scope] and will be automatically freed
 * once the scope ends.
 * @see [MemScope]
 */
public inline fun <reified COMPANION, reified TYPE, reified STRUCT>
    COMPANION.allocateScoped(scope: MemScope): TYPE
    where TYPE : Record,
          STRUCT : CVariable,
          COMPANION : RecordCompanion<TYPE, STRUCT> {
    val v = scope.alloc<STRUCT>()
    return wrapRecordPointer(v.ptr.reinterpret<STRUCT>())
}
