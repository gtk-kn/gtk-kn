// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_12
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_14
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_4
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_6
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_8
import org.gtkkn.bindings.gobject.TypeInstance
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_surface_copy_page
import org.gtkkn.native.cairo.cairo_surface_create_for_rectangle
import org.gtkkn.native.cairo.cairo_surface_create_similar
import org.gtkkn.native.cairo.cairo_surface_create_similar_image
import org.gtkkn.native.cairo.cairo_surface_destroy
import org.gtkkn.native.cairo.cairo_surface_finish
import org.gtkkn.native.cairo.cairo_surface_flush
import org.gtkkn.native.cairo.cairo_surface_get_content
import org.gtkkn.native.cairo.cairo_surface_get_device
import org.gtkkn.native.cairo.cairo_surface_get_font_options
import org.gtkkn.native.cairo.cairo_surface_get_type
import org.gtkkn.native.cairo.cairo_surface_get_user_data
import org.gtkkn.native.cairo.cairo_surface_has_show_text_glyphs
import org.gtkkn.native.cairo.cairo_surface_map_to_image
import org.gtkkn.native.cairo.cairo_surface_mark_dirty
import org.gtkkn.native.cairo.cairo_surface_mark_dirty_rectangle
import org.gtkkn.native.cairo.cairo_surface_set_device_offset
import org.gtkkn.native.cairo.cairo_surface_set_device_scale
import org.gtkkn.native.cairo.cairo_surface_set_fallback_resolution
import org.gtkkn.native.cairo.cairo_surface_show_page
import org.gtkkn.native.cairo.cairo_surface_status
import org.gtkkn.native.cairo.cairo_surface_supports_mime_type
import org.gtkkn.native.cairo.cairo_surface_t
import org.gtkkn.native.cairo.cairo_surface_unmap_image
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `x_offset`: Unsupported pointer to primitive type
 * - parameter `x_scale`: Unsupported pointer to primitive type
 * - parameter `x_ppi`: Unsupported pointer to primitive type
 * - parameter `destroy`: GLib.DestroyNotify
 * - parameter `destroy`: GLib.DestroyNotify
 */
public open class Surface(public val cairoSurfacePointer: CPointer<cairo_surface_t>) :
    TypeInstance(cairoSurfacePointer.reinterpret()),
    KGTyped {
    public open fun destroy(): Unit = cairo_surface_destroy(cairoSurfacePointer)

    public open fun status(): Status = cairo_surface_status(cairoSurfacePointer).run {
        Status.fromNativeValue(this)
    }

    public open fun finish(): Unit = cairo_surface_finish(cairoSurfacePointer)

    public open fun flush(): Unit = cairo_surface_flush(cairoSurfacePointer)

    /**
     *
     *
     * @since 1.10
     */
    @CairoVersion1_10
    public open fun getDevice(): Device = cairo_surface_get_device(cairoSurfacePointer)!!.run {
        Device.DeviceImpl(this)
    }

    public open fun getFontOptions(options: FontOptions): Unit =
        cairo_surface_get_font_options(cairoSurfacePointer, options.cairoFontOptionsPointer)

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun getContent(): Content = cairo_surface_get_content(cairoSurfacePointer).run {
        Content.fromNativeValue(this)
    }

    public open fun markDirty(): Unit = cairo_surface_mark_dirty(cairoSurfacePointer)

    public open fun markDirtyRectangle(x: gint, y: gint, width: gint, height: gint): Unit =
        cairo_surface_mark_dirty_rectangle(cairoSurfacePointer, x, y, width, height)

    public open fun setDeviceOffset(xOffset: gdouble, yOffset: gdouble): Unit =
        cairo_surface_set_device_offset(cairoSurfacePointer, xOffset, yOffset)

    /**
     *
     *
     * @param xScale
     * @param yScale
     * @since 1.14
     */
    @CairoVersion1_14
    public open fun setDeviceScale(xScale: gdouble, yScale: gdouble): Unit =
        cairo_surface_set_device_scale(cairoSurfacePointer, xScale, yScale)

    /**
     *
     *
     * @param xPpi
     * @param yPpi
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun setFallbackResolution(xPpi: gdouble, yPpi: gdouble): Unit =
        cairo_surface_set_fallback_resolution(cairoSurfacePointer, xPpi, yPpi)

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun getSurfaceType(): SurfaceType = cairo_surface_get_type(cairoSurfacePointer).run {
        SurfaceType.fromNativeValue(this)
    }

    /**
     *
     *
     * @since 1.6
     */
    @CairoVersion1_6
    public open fun copyPage(): Unit = cairo_surface_copy_page(cairoSurfacePointer)

    /**
     *
     *
     * @since 1.6
     */
    @CairoVersion1_6
    public open fun showPage(): Unit = cairo_surface_show_page(cairoSurfacePointer)

    /**
     *
     *
     * @since 1.8
     */
    @CairoVersion1_8
    public open fun hasShowTextGlyphs(): Boolean = cairo_surface_has_show_text_glyphs(cairoSurfacePointer).asBoolean()

    /**
     *
     *
     * @param mimeType
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun supportsMimeType(mimeType: String): Boolean =
        cairo_surface_supports_mime_type(cairoSurfacePointer, mimeType).asBoolean()

    /**
     *
     *
     * @param extents
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun mapToImage(extents: RectangleInt): ImageSurface =
        cairo_surface_map_to_image(cairoSurfacePointer, extents.cairoRectangleIntPointer)!!.run {
            ImageSurface(reinterpret())
        }

    /**
     *
     *
     * @param imageSurface
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun unmapImage(imageSurface: Surface): Unit =
        cairo_surface_unmap_image(cairoSurfacePointer, imageSurface.cairoSurfacePointer)

    /**
     *
     *
     * @param key
     * @since 1.4
     */
    @CairoVersion1_4
    public open fun getUserData(key: UserDataKey): gpointer =
        cairo_surface_get_user_data(cairoSurfacePointer, key.cairoUserDataKeyPointer)!!

    public companion object : TypeCompanion<Surface> {
        override val type: GeneratedClassKGType<Surface> =
            GeneratedClassKGType(getTypeOrNull("cairo_gobject_surface_get_type")!!) { Surface(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        public fun createSimilar(other: Surface, content: Content, width: gint, height: gint): Surface =
            cairo_surface_create_similar(other.cairoSurfacePointer, content.nativeValue, width, height)!!.run {
                Surface(this)
            }

        /**
         *
         *
         * @param other
         * @param format
         * @param width
         * @param height
         * @since 1.12
         */
        @CairoVersion1_12
        public fun createSimilarImage(other: Surface, format: Format, width: gint, height: gint): ImageSurface =
            cairo_surface_create_similar_image(other.cairoSurfacePointer, format.nativeValue, width, height)!!.run {
                ImageSurface(reinterpret())
            }

        /**
         *
         *
         * @param target
         * @param x
         * @param y
         * @param width
         * @param height
         * @since 1.10
         */
        @CairoVersion1_10
        public fun createForRectangle(
            target: Surface,
            x: gdouble,
            y: gdouble,
            width: gdouble,
            height: gdouble,
        ): Surface = cairo_surface_create_for_rectangle(target.cairoSurfacePointer, x, y, width, height)!!.run {
            Surface(this)
        }

        /**
         * Get the GType of Surface
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
