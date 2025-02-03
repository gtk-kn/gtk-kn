// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GMemoryInputStream
import org.gtkkn.native.gio.GPollableInputStream
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_memory_input_stream_add_bytes
import org.gtkkn.native.gio.g_memory_input_stream_get_type
import org.gtkkn.native.gio.g_memory_input_stream_new
import org.gtkkn.native.gio.g_memory_input_stream_new_from_bytes
import org.gtkkn.native.gobject.GType
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
public open class MemoryInputStream(public val gioMemoryInputStreamPointer: CPointer<GMemoryInputStream>) :
    InputStream(gioMemoryInputStreamPointer.reinterpret()),
    PollableInputStream,
    Seekable,
    KGTyped {
    init {
        Gio
    }

    override val gioPollableInputStreamPointer: CPointer<GPollableInputStream>
        get() = handle.reinterpret()

    override val gioSeekablePointer: CPointer<GSeekable>
        get() = handle.reinterpret()

    /**
     * Creates a new empty #GMemoryInputStream.
     *
     * @return a new #GInputStream
     */
    public constructor() : this(g_memory_input_stream_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new #GMemoryInputStream with data from the given @bytes.
     *
     * @param bytes a #GBytes
     * @return new #GInputStream read from @bytes
     * @since 2.34
     */
    public constructor(
        bytes: Bytes,
    ) : this(g_memory_input_stream_new_from_bytes(bytes.glibBytesPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Appends @bytes to data that can be read from the input stream.
     *
     * @param bytes input data
     * @since 2.34
     */
    @GioVersion2_34
    public open fun addBytes(bytes: Bytes): Unit =
        g_memory_input_stream_add_bytes(gioMemoryInputStreamPointer, bytes.glibBytesPointer)

    public companion object : TypeCompanion<MemoryInputStream> {
        override val type: GeneratedClassKGType<MemoryInputStream> =
            GeneratedClassKGType(getTypeOrNull()!!) { MemoryInputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of MemoryInputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_memory_input_stream_get_type()

        /**
         * Gets the GType of from the symbol `g_memory_input_stream_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_memory_input_stream_get_type")
    }
}
