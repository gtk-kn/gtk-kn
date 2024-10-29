// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFilterOutputStream
import org.gtkkn.native.gio.g_filter_output_stream_get_base_stream
import org.gtkkn.native.gio.g_filter_output_stream_get_close_base_stream
import org.gtkkn.native.gio.g_filter_output_stream_get_type
import org.gtkkn.native.gio.g_filter_output_stream_set_close_base_stream
import kotlin.Boolean
import kotlin.Unit

/**
 * Base class for output stream implementations that perform some
 * kind of filtering operation on a base stream. Typical examples
 * of filtering operations are character set conversion, compression
 * and byte order flipping.
 */
public open class FilterOutputStream(
    pointer: CPointer<GFilterOutputStream>,
) : OutputStream(pointer.reinterpret()), KGTyped {
    public val gioFilterOutputStreamPointer: CPointer<GFilterOutputStream>
        get() = gPointer.reinterpret()

    public open val baseStream: OutputStream
        /**
         * Gets the base stream for the filter stream.
         *
         * @return a #GOutputStream.
         */
        get() =
            g_filter_output_stream_get_base_stream(gioFilterOutputStreamPointer.reinterpret())!!.run {
                OutputStream(reinterpret())
            }

    /**
     * Whether the base stream should be closed when the filter stream is closed.
     */
    public open val closeBaseStream: Boolean
        /**
         * Returns whether the base stream will be closed when @stream is
         * closed.
         *
         * @return true if the base stream will be closed.
         */
        get() =
            g_filter_output_stream_get_close_base_stream(gioFilterOutputStreamPointer.reinterpret()).asBoolean()

    /**
     * Gets the base stream for the filter stream.
     *
     * @return a #GOutputStream.
     */
    public open fun getBaseStream(): OutputStream =
        g_filter_output_stream_get_base_stream(gioFilterOutputStreamPointer.reinterpret())!!.run {
            OutputStream(reinterpret())
        }

    /**
     * Returns whether the base stream will be closed when @stream is
     * closed.
     *
     * @return true if the base stream will be closed.
     */
    public open fun getCloseBaseStream(): Boolean =
        g_filter_output_stream_get_close_base_stream(gioFilterOutputStreamPointer.reinterpret()).asBoolean()

    /**
     * Sets whether the base stream will be closed when @stream is closed.
     *
     * @param closeBase true to close the base stream.
     */
    public open fun setCloseBaseStream(closeBase: Boolean): Unit =
        g_filter_output_stream_set_close_base_stream(
            gioFilterOutputStreamPointer.reinterpret(),
            closeBase.asGBoolean()
        )

    public companion object : TypeCompanion<FilterOutputStream> {
        override val type: GeneratedClassKGType<FilterOutputStream> =
            GeneratedClassKGType(g_filter_output_stream_get_type()) {
                FilterOutputStream(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }
    }
}
