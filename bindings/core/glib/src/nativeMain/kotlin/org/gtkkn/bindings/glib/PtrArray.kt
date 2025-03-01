// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GPtrArray
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_ptr_array_get_type
import kotlin.String

/**
 * Contains the public fields of a pointer array.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array_to_extend`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array_to_extend`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `haystack`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `haystack`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - function `new`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `data`: Array parameter of type gpointer is not supported
 * - parameter `data`: Array parameter of type gpointer is not supported
 * - parameter `element_free_func`: DestroyNotify
 * - parameter `element_free_func`: DestroyNotify
 * - parameter `data`: Array parameter of type gpointer is not supported
 * - parameter `data`: Array parameter of type gpointer is not supported
 * - parameter `element_free_func`: DestroyNotify
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - function `sized_new`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: GLib.PtrArray parameter of type gpointer is not supported
 * - field `pdata`: Unsupported pointer to primitive type
 */
public class PtrArray(public val glibPtrArrayPointer: CPointer<GPtrArray>) : ProxyInstance(glibPtrArrayPointer) {
    /**
     * number of pointers in the array
     */
    public var len: guint
        get() = glibPtrArrayPointer.pointed.len

        @UnsafeFieldSetter
        set(`value`) {
            glibPtrArrayPointer.pointed.len = value
        }

    /**
     * Allocate a new PtrArray.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GPtrArray>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new PtrArray using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GPtrArray>().ptr)

    /**
     * Allocate a new PtrArray.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param len number of pointers in the array
     */
    public constructor(len: guint) : this() {
        this.len = len
    }

    /**
     * Allocate a new PtrArray using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param len number of pointers in the array
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(len: guint, scope: AutofreeScope) : this(scope) {
        this.len = len
    }

    override fun toString(): String = "PtrArray(len=$len)"

    public companion object {
        /**
         * Get the GType of PtrArray
         *
         * @return the GType
         */
        public fun getType(): GType = g_ptr_array_get_type()
    }
}
