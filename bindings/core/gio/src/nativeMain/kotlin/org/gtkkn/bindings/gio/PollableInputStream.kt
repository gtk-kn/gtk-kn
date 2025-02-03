// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.glib.Source
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GPollableInputStream
import org.gtkkn.native.gio.g_pollable_input_stream_can_poll
import org.gtkkn.native.gio.g_pollable_input_stream_create_source
import org.gtkkn.native.gio.g_pollable_input_stream_get_type
import org.gtkkn.native.gio.g_pollable_input_stream_is_readable
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * `GPollableInputStream` is implemented by [class@Gio.InputStream]s that
 * can be polled for readiness to read. This can be used when
 * interfacing with a non-GIO API that expects
 * UNIX-file-descriptor-style asynchronous I/O rather than GIO-style.
 *
 * Some classes may implement `GPollableInputStream` but have only certain
 * instances of that class be pollable. If [method@Gio.PollableInputStream.can_poll]
 * returns false, then the behavior of other `GPollableInputStream` methods is
 * undefined.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `buffer`: buffer: Out parameter is not supported
 *
 * @since 2.28
 */
@GioVersion2_28
public interface PollableInputStream :
    Proxy,
    KGTyped {
    public val gioPollableInputStreamPointer: CPointer<GPollableInputStream>

    /**
     * Checks if @stream is actually pollable. Some classes may implement
     * #GPollableInputStream but have only certain instances of that class
     * be pollable. If this method returns false, then the behavior of
     * other #GPollableInputStream methods is undefined.
     *
     * For any given stream, the value returned by this method is constant;
     * a stream cannot switch from pollable to non-pollable or vice versa.
     *
     * @return true if @stream is pollable, false if not.
     * @since 2.28
     */
    @GioVersion2_28
    public fun canPoll(): Boolean = g_pollable_input_stream_can_poll(gioPollableInputStreamPointer).asBoolean()

    /**
     * Creates a #GSource that triggers when @stream can be read, or
     * @cancellable is triggered or an error occurs. The callback on the
     * source is of the #GPollableSourceFunc type.
     *
     * As with g_pollable_input_stream_is_readable(), it is possible that
     * the stream may not actually be readable even after the source
     * triggers, so you should use g_pollable_input_stream_read_nonblocking()
     * rather than g_input_stream_read() from the callback.
     *
     * The behaviour of this method is undefined if
     * g_pollable_input_stream_can_poll() returns false for @stream.
     *
     * @param cancellable a #GCancellable, or null
     * @return a new #GSource
     * @since 2.28
     */
    @GioVersion2_28
    public fun createSource(cancellable: Cancellable? = null): Source =
        g_pollable_input_stream_create_source(gioPollableInputStreamPointer, cancellable?.gioCancellablePointer)!!.run {
            Source(this)
        }

    /**
     * Checks if @stream can be read.
     *
     * Note that some stream types may not be able to implement this 100%
     * reliably, and it is possible that a call to g_input_stream_read()
     * after this returns true would still block. To guarantee
     * non-blocking behavior, you should always use
     * g_pollable_input_stream_read_nonblocking(), which will return a
     * %G_IO_ERROR_WOULD_BLOCK error rather than blocking.
     *
     * The behaviour of this method is undefined if
     * g_pollable_input_stream_can_poll() returns false for @stream.
     *
     * @return true if @stream is readable, false if not. If an error
     *   has occurred on @stream, this will result in
     *   g_pollable_input_stream_is_readable() returning true, and the
     *   next attempt to read will return the error.
     * @since 2.28
     */
    @GioVersion2_28
    public fun isReadable(): Boolean = g_pollable_input_stream_is_readable(gioPollableInputStreamPointer).asBoolean()

    /**
     * The PollableInputStreamImpl type represents a native instance of the PollableInputStream interface.
     *
     * @constructor Creates a new instance of PollableInputStream for the provided [CPointer].
     */
    public class PollableInputStreamImpl(gioPollableInputStreamPointer: CPointer<GPollableInputStream>) :
        InputStream(gioPollableInputStreamPointer.reinterpret()),
        PollableInputStream {
        init {
            Gio
        }

        override val gioPollableInputStreamPointer: CPointer<GPollableInputStream> =
            gioPollableInputStreamPointer
    }

    public companion object : TypeCompanion<PollableInputStream> {
        override val type: GeneratedInterfaceKGType<PollableInputStream> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { PollableInputStreamImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of PollableInputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_pollable_input_stream_get_type()

        /**
         * Gets the GType of from the symbol `g_pollable_input_stream_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_pollable_input_stream_get_type")
    }
}
