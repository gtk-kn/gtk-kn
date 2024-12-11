// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GAllocator
import org.gtkkn.native.glib.g_allocator_free
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - function `new`: Return type Allocator is unsupported
 */
public class Allocator(pointer: CPointer<GAllocator>) : ProxyInstance(pointer) {
    public val glibAllocatorPointer: CPointer<GAllocator> = pointer

    public fun free(): Unit = g_allocator_free(glibAllocatorPointer.reinterpret())
}
