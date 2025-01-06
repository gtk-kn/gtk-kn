// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GAllocator
import org.gtkkn.native.glib.g_allocator_free
import org.gtkkn.native.glib.g_allocator_new
import org.gtkkn.native.glib.guint
import kotlin.String
import kotlin.Unit

public class Allocator(pointer: CPointer<GAllocator>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GAllocator> = pointer

    public fun free(): Unit = g_allocator_free(gPointer.reinterpret())

    public companion object {
        public fun new(name: String, nPreallocs: guint): Allocator = g_allocator_new(name, nPreallocs)!!.run {
            Allocator(reinterpret())
        }
    }
}
