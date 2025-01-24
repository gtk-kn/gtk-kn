// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GAllocator
import org.gtkkn.native.glib.g_allocator_free
import org.gtkkn.native.glib.g_allocator_new
import org.gtkkn.native.glib.guint
import kotlin.String
import kotlin.Unit

public class Allocator(public val glibAllocatorPointer: CPointer<GAllocator>) : ProxyInstance(glibAllocatorPointer) {
    public fun free(): Unit = g_allocator_free(glibAllocatorPointer)

    public companion object {
        public fun new(name: String, nPreallocs: guint): Allocator = g_allocator_new(name, nPreallocs)!!.run {
            Allocator(this)
        }
    }
}
