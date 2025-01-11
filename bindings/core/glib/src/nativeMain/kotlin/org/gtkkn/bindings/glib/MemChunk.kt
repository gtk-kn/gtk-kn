// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GMemChunk
import org.gtkkn.native.glib.g_mem_chunk_alloc
import org.gtkkn.native.glib.g_mem_chunk_alloc0
import org.gtkkn.native.glib.g_mem_chunk_clean
import org.gtkkn.native.glib.g_mem_chunk_destroy
import org.gtkkn.native.glib.g_mem_chunk_free
import org.gtkkn.native.glib.g_mem_chunk_info
import org.gtkkn.native.glib.g_mem_chunk_new
import org.gtkkn.native.glib.g_mem_chunk_print
import org.gtkkn.native.glib.g_mem_chunk_reset
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import kotlin.String
import kotlin.Unit

public class MemChunk(public val glibMemChunkPointer: CPointer<GMemChunk>) : ProxyInstance(glibMemChunkPointer) {
    public fun alloc(): gpointer? = g_mem_chunk_alloc(glibMemChunkPointer)

    public fun alloc0(): gpointer? = g_mem_chunk_alloc0(glibMemChunkPointer)

    public fun clean(): Unit = g_mem_chunk_clean(glibMemChunkPointer)

    public fun destroy(): Unit = g_mem_chunk_destroy(glibMemChunkPointer)

    public fun free(mem: gpointer? = null): Unit = g_mem_chunk_free(glibMemChunkPointer, mem)

    public fun print(): Unit = g_mem_chunk_print(glibMemChunkPointer)

    public fun reset(): Unit = g_mem_chunk_reset(glibMemChunkPointer)

    public companion object {
        public fun info(): Unit = g_mem_chunk_info()

        public fun new(name: String, atomSize: gint, areaSize: gsize, type: gint): MemChunk =
            g_mem_chunk_new(name, atomSize, areaSize, type)!!.run {
                MemChunk(this)
            }
    }
}
