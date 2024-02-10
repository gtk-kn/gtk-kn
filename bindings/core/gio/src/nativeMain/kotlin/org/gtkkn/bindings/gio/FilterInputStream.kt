// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFilterInputStream
import org.gtkkn.native.gio.g_filter_input_stream_get_base_stream
import org.gtkkn.native.gio.g_filter_input_stream_get_close_base_stream
import org.gtkkn.native.gio.g_filter_input_stream_get_type
import org.gtkkn.native.gio.g_filter_input_stream_set_close_base_stream
import kotlin.Boolean
import kotlin.Unit

/**
 * Base class for input stream implementations that perform some
 * kind of filtering operation on a base stream. Typical examples
 * of filtering operations are character set conversion, compression
 * and byte order flipping.
 */
public open class FilterInputStream(
    pointer: CPointer<GFilterInputStream>,
) : InputStream(pointer.reinterpret()), KGTyped {
    public val gioFilterInputStreamPointer: CPointer<GFilterInputStream>
        get() = gPointer.reinterpret()

    public open val baseStream: InputStream
        /**
         * Gets the base stream for the filter stream.
         *
         * @return a #GInputStream.
         */
        get() =
            g_filter_input_stream_get_base_stream(gioFilterInputStreamPointer.reinterpret())!!.run {
                InputStream(reinterpret())
            }

    public open var closeBaseStream: Boolean
        /**
         * Returns whether the base stream will be closed when @stream is
         * closed.
         *
         * @return true if the base stream will be closed.
         */
        get() =
            g_filter_input_stream_get_close_base_stream(gioFilterInputStreamPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the base stream will be closed when @stream is closed.
         *
         * @param closeBase true to close the base stream.
         */
        set(closeBase) =
            g_filter_input_stream_set_close_base_stream(
                gioFilterInputStreamPointer.reinterpret(),
                closeBase.asGBoolean()
            )

    /**
     * Gets the base stream for the filter stream.
     *
     * @return a #GInputStream.
     */
    public open fun getBaseStream(): InputStream =
        g_filter_input_stream_get_base_stream(gioFilterInputStreamPointer.reinterpret())!!.run {
            InputStream(reinterpret())
        }

    /**
     * Returns whether the base stream will be closed when @stream is
     * closed.
     *
     * @return true if the base stream will be closed.
     */
    public open fun getCloseBaseStream(): Boolean =
        g_filter_input_stream_get_close_base_stream(gioFilterInputStreamPointer.reinterpret()).asBoolean()

    /**
     * Sets whether the base stream will be closed when @stream is closed.
     *
     * @param closeBase true to close the base stream.
     */
    public open fun setCloseBaseStream(closeBase: Boolean): Unit =
        g_filter_input_stream_set_close_base_stream(
            gioFilterInputStreamPointer.reinterpret(),
            closeBase.asGBoolean()
        )

    public companion object : TypeCompanion<FilterInputStream> {
        override val type: GeneratedClassKGType<FilterInputStream> =
            GeneratedClassKGType(g_filter_input_stream_get_type()) {
                FilterInputStream(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }
    }
}
