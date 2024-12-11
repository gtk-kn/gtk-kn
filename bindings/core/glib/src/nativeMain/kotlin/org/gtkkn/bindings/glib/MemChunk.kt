// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GMemChunk
import org.gtkkn.native.glib.g_mem_chunk_clean
import org.gtkkn.native.glib.g_mem_chunk_destroy
import org.gtkkn.native.glib.g_mem_chunk_info
import org.gtkkn.native.glib.g_mem_chunk_print
import org.gtkkn.native.glib.g_mem_chunk_reset
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `alloc`: Return type gpointer is unsupported
 * - method `alloc0`: Return type gpointer is unsupported
 * - parameter `mem`: gpointer
 * - function `new`: Return type MemChunk is unsupported
 */
public class MemChunk(pointer: CPointer<GMemChunk>) : ProxyInstance(pointer) {
    public val glibMemChunkPointer: CPointer<GMemChunk> = pointer

    public fun clean(): Unit = g_mem_chunk_clean(glibMemChunkPointer.reinterpret())

    public fun destroy(): Unit = g_mem_chunk_destroy(glibMemChunkPointer.reinterpret())

    public fun print(): Unit = g_mem_chunk_print(glibMemChunkPointer.reinterpret())

    public fun reset(): Unit = g_mem_chunk_reset(glibMemChunkPointer.reinterpret())

    public companion object {
        public fun info(): Unit = g_mem_chunk_info()
    }
}
