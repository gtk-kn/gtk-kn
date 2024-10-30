// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GMemoryInputStream
import org.gtkkn.native.gio.GPollableInputStream
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_memory_input_stream_add_bytes
import org.gtkkn.native.gio.g_memory_input_stream_get_type
import org.gtkkn.native.gio.g_memory_input_stream_new
import org.gtkkn.native.gio.g_memory_input_stream_new_from_bytes
import kotlin.Unit

/**
 * `GMemoryInputStream` is a class for using arbitrary
 * memory chunks as input for GIO streaming input operations.
 *
 * As of GLib 2.34, `GMemoryInputStream` implements
 * [iface@Gio.PollableInputStream].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 */
public open class MemoryInputStream(
    pointer: CPointer<GMemoryInputStream>,
) : InputStream(pointer.reinterpret()),
    PollableInputStream,
    Seekable,
    KGTyped {
    public val gioMemoryInputStreamPointer: CPointer<GMemoryInputStream>
        get() = gPointer.reinterpret()

    override val gioPollableInputStreamPointer: CPointer<GPollableInputStream>
        get() = gPointer.reinterpret()

    override val gioSeekablePointer: CPointer<GSeekable>
        get() = gPointer.reinterpret()

    /**
     * Creates a new empty #GMemoryInputStream.
     *
     * @return a new #GInputStream
     */
    public constructor() : this(g_memory_input_stream_new()!!.reinterpret())

    /**
     * Creates a new #GMemoryInputStream with data from the given @bytes.
     *
     * @param bytes a #GBytes
     * @return new #GInputStream read from @bytes
     * @since 2.34
     */
    public constructor(
        bytes: Bytes,
    ) : this(g_memory_input_stream_new_from_bytes(bytes.glibBytesPointer)!!.reinterpret())

    /**
     * Appends @bytes to data that can be read from the input stream.
     *
     * @param bytes input data
     * @since 2.34
     */
    public open fun addBytes(bytes: Bytes): Unit =
        g_memory_input_stream_add_bytes(gioMemoryInputStreamPointer.reinterpret(), bytes.glibBytesPointer)

    public companion object : TypeCompanion<MemoryInputStream> {
        override val type: GeneratedClassKGType<MemoryInputStream> =
            GeneratedClassKGType(g_memory_input_stream_get_type()) { MemoryInputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
