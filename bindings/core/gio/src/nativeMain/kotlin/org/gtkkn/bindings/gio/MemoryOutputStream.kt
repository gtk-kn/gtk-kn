// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GMemoryOutputStream
import org.gtkkn.native.gio.GPollableOutputStream
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_memory_output_stream_get_data
import org.gtkkn.native.gio.g_memory_output_stream_get_data_size
import org.gtkkn.native.gio.g_memory_output_stream_get_size
import org.gtkkn.native.gio.g_memory_output_stream_get_type
import org.gtkkn.native.gio.g_memory_output_stream_new_resizable
import org.gtkkn.native.gio.g_memory_output_stream_steal_as_bytes
import org.gtkkn.native.gio.g_memory_output_stream_steal_data
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType

/**
 * `GMemoryOutputStream` is a class for using arbitrary
 * memory chunks as output for GIO streaming output operations.
 *
 * As of GLib 2.34, `GMemoryOutputStream` trivially implements
 * [iface@Gio.PollableOutputStream]: it always polls as ready.
 *
 * ## Skipped during bindings generation
 *
 * - method `destroy-function`: Property has no getter nor setter
 * - method `realloc-function`: Property has no getter nor setter
 * - parameter `realloc_function`: ReallocFunc
 */
public open class MemoryOutputStream(public val gioMemoryOutputStreamPointer: CPointer<GMemoryOutputStream>) :
    OutputStream(gioMemoryOutputStreamPointer.reinterpret()),
    PollableOutputStream,
    Seekable,
    KGTyped {
    init {
        Gio
    }

    override val gioPollableOutputStreamPointer: CPointer<GPollableOutputStream>
        get() = handle.reinterpret()

    override val gioSeekablePointer: CPointer<GSeekable>
        get() = handle.reinterpret()

    /**
     * Pointer to buffer where data will be written.
     *
     * @since 2.24
     */
    @GioVersion2_24
    public open val `data`: gpointer?
        /**
         * Gets any loaded data from the @ostream.
         *
         * Note that the returned pointer may become invalid on the next
         * write or truncate operation on the stream.
         *
         * @return pointer to the stream's data, or null if the data
         *    has been stolen
         */
        get() = g_memory_output_stream_get_data(gioMemoryOutputStreamPointer)

    /**
     * Size of data written to the buffer.
     *
     * @since 2.24
     */
    @GioVersion2_24
    public open val dataSize: gsize
        /**
         * Returns the number of bytes from the start up to including the last
         * byte written in the stream that has not been truncated away.
         *
         * @return the number of bytes written to the stream
         * @since 2.18
         */
        get() = g_memory_output_stream_get_data_size(gioMemoryOutputStreamPointer)

    /**
     * Current size of the data buffer.
     *
     * @since 2.24
     */
    @GioVersion2_24
    public open val size: gsize
        /**
         * Gets the size of the currently allocated data area (available from
         * g_memory_output_stream_get_data()).
         *
         * You probably don't want to use this function on resizable streams.
         * See g_memory_output_stream_get_data_size() instead.  For resizable
         * streams the size returned by this function is an implementation
         * detail and may be change at any time in response to operations on the
         * stream.
         *
         * If the stream is fixed-sized (ie: no realloc was passed to
         * g_memory_output_stream_new()) then this is the maximum size of the
         * stream and further writes will return %G_IO_ERROR_NO_SPACE.
         *
         * In any case, if you want the number of bytes currently written to the
         * stream, use g_memory_output_stream_get_data_size().
         *
         * @return the number of bytes allocated for the data buffer
         */
        get() = g_memory_output_stream_get_size(gioMemoryOutputStreamPointer)

    /**
     * Creates a new #GMemoryOutputStream, using g_realloc() and g_free()
     * for memory allocation.
     *
     * @since 2.36
     */
    public constructor() : this(g_memory_output_stream_new_resizable()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Returns data from the @ostream as a #GBytes. @ostream must be
     * closed before calling this function.
     *
     * @return the stream's data
     * @since 2.34
     */
    @GioVersion2_34
    public open fun stealAsBytes(): Bytes = g_memory_output_stream_steal_as_bytes(gioMemoryOutputStreamPointer)!!.run {
        Bytes(this)
    }

    /**
     * Gets any loaded data from the @ostream. Ownership of the data
     * is transferred to the caller; when no longer needed it must be
     * freed using the free function set in @ostream's
     * #GMemoryOutputStream:destroy-function property.
     *
     * @ostream must be closed before calling this function.
     *
     * @return the stream's data, or null if it has previously
     *    been stolen
     * @since 2.26
     */
    @GioVersion2_26
    public open fun stealData(): gpointer? = g_memory_output_stream_steal_data(gioMemoryOutputStreamPointer)

    public companion object : TypeCompanion<MemoryOutputStream> {
        override val type: GeneratedClassKGType<MemoryOutputStream> =
            GeneratedClassKGType(getTypeOrNull()!!) { MemoryOutputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of MemoryOutputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_memory_output_stream_get_type()

        /**
         * Gets the GType of from the symbol `g_memory_output_stream_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_memory_output_stream_get_type")
    }
}
