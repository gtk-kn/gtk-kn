// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GSimpleIOStream
import org.gtkkn.native.gio.g_simple_io_stream_get_type
import org.gtkkn.native.gio.g_simple_io_stream_new
import org.gtkkn.native.gobject.GType

/**
 * `GSimpleIOStream` creates a [class@Gio.IOStream] from an arbitrary
 * [class@Gio.InputStream] and [class@Gio.OutputStream]. This allows any pair of
 * input and output streams to be used with [class@Gio.IOStream] methods.
 *
 * This is useful when you obtained a [class@Gio.InputStream] and a
 * [class@Gio.OutputStream] by other means, for instance creating them with
 * platform specific methods as
 * [`g_unix_input_stream_new()`](../gio-unix/ctor.UnixInputStream.new.html)
 * (from `gio-unix-2.0.pc` / `GioUnix-2.0`), and you want to
 * take advantage of the methods provided by [class@Gio.IOStream].
 *
 * ## Skipped during bindings generation
 *
 * - method `input-stream`: Property has no getter nor setter
 * - method `output-stream`: Property has no getter nor setter
 *
 * @since 2.44
 */
@GioVersion2_44
public open class SimpleIoStream(public val gioSimpleIoStreamPointer: CPointer<GSimpleIOStream>) :
    IoStream(gioSimpleIoStreamPointer.reinterpret()),
    KGTyped {
    init {
        Gio
    }

    /**
     * Creates a new #GSimpleIOStream wrapping @input_stream and @output_stream.
     * See also #GIOStream.
     *
     * @param inputStream a #GInputStream.
     * @param outputStream a #GOutputStream.
     * @return a new #GSimpleIOStream instance.
     * @since 2.44
     */
    public constructor(
        inputStream: InputStream,
        outputStream: OutputStream,
    ) : this(
        g_simple_io_stream_new(inputStream.gioInputStreamPointer, outputStream.gioOutputStreamPointer)!!.reinterpret()
    ) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<SimpleIoStream> {
        override val type: GeneratedClassKGType<SimpleIoStream> =
            GeneratedClassKGType(getTypeOrNull()!!) { SimpleIoStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of SimpleIOStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_simple_io_stream_get_type()

        /**
         * Gets the GType of from the symbol `g_simple_io_stream_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_simple_io_stream_get_type")
    }
}
