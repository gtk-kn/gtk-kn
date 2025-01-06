// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_6
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_format_stride_for_width
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_image_surface_create
import org.gtkkn.native.cairo.cairo_image_surface_create_from_png
import org.gtkkn.native.cairo.cairo_image_surface_get_data
import org.gtkkn.native.cairo.cairo_image_surface_get_format
import org.gtkkn.native.cairo.cairo_image_surface_get_height
import org.gtkkn.native.cairo.cairo_image_surface_get_stride
import org.gtkkn.native.cairo.cairo_image_surface_get_width
import org.gtkkn.native.cairo.cairo_surface_t
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import kotlin.String

public open class ImageSurface(pointer: CPointer<cairo_surface_t>) :
    Surface(pointer.reinterpret()),
    KGTyped {
    public val cairoImageSurfacePointer: CPointer<cairo_surface_t>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun getData(): gpointer = cairo_image_surface_get_data(cairoImageSurfacePointer.reinterpret())!!

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun getFormat(): Format = cairo_image_surface_get_format(cairoImageSurfacePointer.reinterpret()).run {
        Format.fromNativeValue(this)
    }

    public open fun getWidth(): gint = cairo_image_surface_get_width(cairoImageSurfacePointer.reinterpret())

    public open fun getHeight(): gint = cairo_image_surface_get_height(cairoImageSurfacePointer.reinterpret())

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun getStride(): gint = cairo_image_surface_get_stride(cairoImageSurfacePointer.reinterpret())

    public companion object : TypeCompanion<ImageSurface> {
        override val type: GeneratedClassKGType<ImageSurface> =
            GeneratedClassKGType(cairo_gobject_surface_get_type()) { ImageSurface(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        public fun create(format: Format, width: gint, height: gint): ImageSurface =
            cairo_image_surface_create(format.nativeValue, width, height)!!.run {
                ImageSurface(reinterpret())
            }

        public fun createFromPng(filename: String): ImageSurface = cairo_image_surface_create_from_png(filename)!!.run {
            ImageSurface(reinterpret())
        }

        /**
         *
         *
         * @param format
         * @param width
         * @since 1.6
         */
        @CairoVersion1_6
        public fun formatStrideForWidth(format: Format, width: gint): gint =
            cairo_format_stride_for_width(format.nativeValue, width)

        /**
         * Get the GType of ImageSurface
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
