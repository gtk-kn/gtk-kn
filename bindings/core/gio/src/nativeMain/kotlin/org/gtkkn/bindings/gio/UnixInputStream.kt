// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_20
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GFileDescriptorBased
import org.gtkkn.native.gio.GPollableInputStream
import org.gtkkn.native.gio.GUnixInputStream
import org.gtkkn.native.gio.g_unix_input_stream_get_close_fd
import org.gtkkn.native.gio.g_unix_input_stream_get_fd
import org.gtkkn.native.gio.g_unix_input_stream_get_type
import org.gtkkn.native.gio.g_unix_input_stream_new
import org.gtkkn.native.gio.g_unix_input_stream_set_close_fd
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * `GUnixInputStream` implements [class@Gio.InputStream] for reading from a UNIX
 * file descriptor, including asynchronous operations. (If the file
 * descriptor refers to a socket or pipe, this will use `poll()` to do
 * asynchronous I/O. If it refers to a regular file, it will fall back
 * to doing asynchronous I/O in another thread.)
 *
 * Note that `<gio/gunixinputstream.h>` belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file or the `GioUnix-2.0` GIR namespace when using it.
 */
public open class UnixInputStream(public val gioUnixInputStreamPointer: CPointer<GUnixInputStream>) :
    InputStream(gioUnixInputStreamPointer.reinterpret()),
    FileDescriptorBased,
    PollableInputStream,
    KGTyped {
    init {
        Gio
    }

    override val gioFileDescriptorBasedPointer: CPointer<GFileDescriptorBased>
        get() = handle.reinterpret()

    override val gioPollableInputStreamPointer: CPointer<GPollableInputStream>
        get() = handle.reinterpret()

    /**
     * Whether to close the file descriptor when the stream is closed.
     *
     * @since 2.20
     */
    @GioVersion2_20
    public open var closeFd: Boolean
        /**
         * Returns whether the file descriptor of @stream will be
         * closed when the stream is closed.
         *
         * @return true if the file descriptor is closed when done
         * @since 2.20
         */
        get() = g_unix_input_stream_get_close_fd(gioUnixInputStreamPointer).asBoolean()

        /**
         * Sets whether the file descriptor of @stream shall be closed
         * when the stream is closed.
         *
         * @param closeFd true to close the file descriptor when done
         * @since 2.20
         */
        @GioVersion2_20
        set(closeFd) = g_unix_input_stream_set_close_fd(gioUnixInputStreamPointer, closeFd.asGBoolean())

    /**
     * The file descriptor that the stream reads from.
     *
     * @since 2.20
     */
    @GioVersion2_20
    public open val fd: gint
        /**
         * Return the UNIX file descriptor that the stream reads from.
         *
         * @return The file descriptor of @stream
         * @since 2.20
         */
        get() = g_unix_input_stream_get_fd(gioUnixInputStreamPointer)

    /**
     * Creates a new #GUnixInputStream for the given @fd.
     *
     * If @close_fd is true, the file descriptor will be closed
     * when the stream is closed.
     *
     * @param fd a UNIX file descriptor
     * @param closeFd true to close the file descriptor when done
     * @return a new #GUnixInputStream
     */
    public constructor(
        fd: gint,
        closeFd: Boolean,
    ) : this(g_unix_input_stream_new(fd, closeFd.asGBoolean())!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<UnixInputStream> {
        override val type: GeneratedClassKGType<UnixInputStream> =
            GeneratedClassKGType(getTypeOrNull()!!) { UnixInputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of UnixInputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_unix_input_stream_get_type()

        /**
         * Gets the GType of from the symbol `g_unix_input_stream_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_unix_input_stream_get_type")
    }
}
