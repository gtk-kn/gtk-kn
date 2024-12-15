// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GMemChunk
import org.gtkkn.native.glib.g_mem_chunk_alloc
import org.gtkkn.native.glib.g_mem_chunk_alloc0
import org.gtkkn.native.glib.g_mem_chunk_clean
import org.gtkkn.native.glib.g_mem_chunk_destroy
import org.gtkkn.native.glib.g_mem_chunk_free
import org.gtkkn.native.glib.g_mem_chunk_info
import org.gtkkn.native.glib.g_mem_chunk_print
import org.gtkkn.native.glib.g_mem_chunk_reset
import org.gtkkn.native.glib.gpointer
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - function `new`: Return type MemChunk is unsupported
 */
public class MemChunk(pointer: CPointer<GMemChunk>) : ProxyInstance(pointer) {
    public val glibMemChunkPointer: CPointer<GMemChunk> = pointer

    public fun alloc(): gpointer? = g_mem_chunk_alloc(glibMemChunkPointer.reinterpret())

    public fun alloc0(): gpointer? = g_mem_chunk_alloc0(glibMemChunkPointer.reinterpret())

    public fun clean(): Unit = g_mem_chunk_clean(glibMemChunkPointer.reinterpret())

    public fun destroy(): Unit = g_mem_chunk_destroy(glibMemChunkPointer.reinterpret())

    public fun free(mem: gpointer? = null): Unit = g_mem_chunk_free(glibMemChunkPointer.reinterpret(), mem)

    public fun print(): Unit = g_mem_chunk_print(glibMemChunkPointer.reinterpret())

    public fun reset(): Unit = g_mem_chunk_reset(glibMemChunkPointer.reinterpret())

    public companion object {
        public fun info(): Unit = g_mem_chunk_info()
    }
}
