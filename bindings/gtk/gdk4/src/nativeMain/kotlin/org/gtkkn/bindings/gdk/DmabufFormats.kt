// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_14
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.gdk.GdkDmabufFormats
import org.gtkkn.native.gdk.gdk_dmabuf_formats_contains
import org.gtkkn.native.gdk.gdk_dmabuf_formats_equal
import org.gtkkn.native.gdk.gdk_dmabuf_formats_get_n_formats
import org.gtkkn.native.gdk.gdk_dmabuf_formats_get_type
import org.gtkkn.native.gdk.gdk_dmabuf_formats_ref
import org.gtkkn.native.gdk.gdk_dmabuf_formats_unref
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Unit

/**
 * The `GdkDmabufFormats` struct provides information about
 * supported DMA buffer formats.
 *
 * You can query whether a given format is supported with
 * [method@Gdk.DmabufFormats.contains] and you can iterate
 * over the list of all supported formats with
 * [method@Gdk.DmabufFormats.get_n_formats] and
 * [method@Gdk.DmabufFormats.get_format].
 *
 * The list of supported formats is sorted by preference,
 * with the best formats coming first.
 *
 * The list may contains (format, modifier) pairs where the modifier
 * is `DMA_FORMAT_MOD_INVALID`, indicating that **_implicit modifiers_**
 * may be used with this format.
 *
 * See [class@Gdk.DmabufTextureBuilder] for more information
 * about DMA buffers.
 *
 * Note that DMA buffers only exist on Linux.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `fourcc`: fourcc: Out parameter is not supported
 *
 * @since 4.14
 */
@GdkVersion4_14
public class DmabufFormats(public val gdkDmabufFormatsPointer: CPointer<GdkDmabufFormats>) :
    ProxyInstance(gdkDmabufFormatsPointer) {
    /**
     * Returns whether a given format is contained in @formats.
     *
     * @param fourcc a format code
     * @param modifier a format modifier
     * @return `TRUE` if the format specified by the arguments
     *   is part of @formats
     * @since 4.14
     */
    @GdkVersion4_14
    public fun contains(fourcc: guint, modifier: guint64): Boolean =
        gdk_dmabuf_formats_contains(gdkDmabufFormatsPointer, fourcc, modifier).asBoolean()

    /**
     * Returns whether @formats1 and @formats2 contain the
     * same dmabuf formats, in the same order.
     *
     * @param formats2 another `GdkDmabufFormats`
     * @return `TRUE` if @formats1 and @formats2 are equal
     * @since 4.14
     */
    @GdkVersion4_14
    public fun equal(formats2: DmabufFormats? = null): Boolean =
        gdk_dmabuf_formats_equal(gdkDmabufFormatsPointer, formats2?.gdkDmabufFormatsPointer).asBoolean()

    /**
     * Returns the number of formats that the @formats object
     * contains.
     *
     * Note that DMA buffers are a Linux concept, so on other
     * platforms, [method@Gdk.DmabufFormats.get_n_formats] will
     * always return zero.
     *
     * @return the number of formats
     * @since 4.14
     */
    @GdkVersion4_14
    public fun getNFormats(): gsize = gdk_dmabuf_formats_get_n_formats(gdkDmabufFormatsPointer)

    /**
     * Increases the reference count of @formats.
     *
     * @return the passed-in object
     * @since 4.14
     */
    @GdkVersion4_14
    public fun ref(): DmabufFormats = gdk_dmabuf_formats_ref(gdkDmabufFormatsPointer)!!.run {
        DmabufFormats(this)
    }

    /**
     * Decreases the reference count of @formats.
     *
     * When the reference count reaches zero,
     * the object is freed.
     *
     * @since 4.14
     */
    @GdkVersion4_14
    public fun unref(): Unit = gdk_dmabuf_formats_unref(gdkDmabufFormatsPointer)

    public companion object {
        /**
         * Get the GType of DmabufFormats
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_dmabuf_formats_get_type()
    }
}
