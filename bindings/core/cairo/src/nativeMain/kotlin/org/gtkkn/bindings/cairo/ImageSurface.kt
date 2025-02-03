// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_6
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.cairo.cairo_format_stride_for_width
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_image_surface_create
import org.gtkkn.native.cairo.cairo_image_surface_create_from_png
import org.gtkkn.native.cairo.cairo_image_surface_get_data
import org.gtkkn.native.cairo.cairo_image_surface_get_format
import org.gtkkn.native.cairo.cairo_image_surface_get_height
import org.gtkkn.native.cairo.cairo_image_surface_get_stride
import org.gtkkn.native.cairo.cairo_image_surface_get_width
import org.gtkkn.native.cairo.cairo_surface_destroy
import org.gtkkn.native.cairo.cairo_surface_t
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import kotlin.String

public open class ImageSurface(public val cairoImageSurfacePointer: CPointer<cairo_surface_t>) :
    Surface(cairoImageSurfacePointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    public constructor(
        format: Format,
        width: gint,
        height: gint,
    ) : this(cairo_image_surface_create(format.nativeValue, width, height)!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_surface_destroy(it.reinterpret()) }
    }

    public constructor(filename: String) : this(cairo_image_surface_create_from_png(filename)!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_surface_destroy(it.reinterpret()) }
    }

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun getData(): gpointer = cairo_image_surface_get_data(cairoImageSurfacePointer)!!

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun getFormat(): Format = cairo_image_surface_get_format(cairoImageSurfacePointer).run {
        Format.fromNativeValue(this)
    }

    public open fun getWidth(): gint = cairo_image_surface_get_width(cairoImageSurfacePointer)

    public open fun getHeight(): gint = cairo_image_surface_get_height(cairoImageSurfacePointer)

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun getStride(): gint = cairo_image_surface_get_stride(cairoImageSurfacePointer)

    public companion object : TypeCompanion<ImageSurface> {
        override val type: GeneratedClassKGType<ImageSurface> =
            GeneratedClassKGType(getTypeOrNull()!!) { ImageSurface(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
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

        /**
         * Gets the GType of from the symbol `cairo_gobject_surface_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("cairo_gobject_surface_get_type")
    }
}
