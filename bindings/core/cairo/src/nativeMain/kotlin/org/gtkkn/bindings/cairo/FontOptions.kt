// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_16
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_18
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.cairo.cairo_font_options_copy
import org.gtkkn.native.cairo.cairo_font_options_create
import org.gtkkn.native.cairo.cairo_font_options_destroy
import org.gtkkn.native.cairo.cairo_font_options_equal
import org.gtkkn.native.cairo.cairo_font_options_get_antialias
import org.gtkkn.native.cairo.cairo_font_options_get_color_mode
import org.gtkkn.native.cairo.cairo_font_options_get_color_palette
import org.gtkkn.native.cairo.cairo_font_options_get_hint_metrics
import org.gtkkn.native.cairo.cairo_font_options_get_hint_style
import org.gtkkn.native.cairo.cairo_font_options_get_subpixel_order
import org.gtkkn.native.cairo.cairo_font_options_get_variations
import org.gtkkn.native.cairo.cairo_font_options_hash
import org.gtkkn.native.cairo.cairo_font_options_merge
import org.gtkkn.native.cairo.cairo_font_options_set_antialias
import org.gtkkn.native.cairo.cairo_font_options_set_color_mode
import org.gtkkn.native.cairo.cairo_font_options_set_color_palette
import org.gtkkn.native.cairo.cairo_font_options_set_custom_palette_color
import org.gtkkn.native.cairo.cairo_font_options_set_hint_metrics
import org.gtkkn.native.cairo.cairo_font_options_set_hint_style
import org.gtkkn.native.cairo.cairo_font_options_set_subpixel_order
import org.gtkkn.native.cairo.cairo_font_options_set_variations
import org.gtkkn.native.cairo.cairo_font_options_status
import org.gtkkn.native.cairo.cairo_font_options_t
import org.gtkkn.native.cairo.cairo_gobject_font_options_get_type
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.gulong
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `red_out`: red_out: Out parameter is not supported
 */
public class FontOptions(public val cairoFontOptionsPointer: CPointer<cairo_font_options_t>) :
    ProxyInstance(cairoFontOptionsPointer) {
    public constructor() : this(cairo_font_options_create()!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_font_options_destroy(it.reinterpret()) }
    }

    public fun copy(): FontOptions = cairo_font_options_copy(cairoFontOptionsPointer)!!.run {
        FontOptions(this)
    }

    public fun status(): Status = cairo_font_options_status(cairoFontOptionsPointer).run {
        Status.fromNativeValue(this)
    }

    public fun merge(other: FontOptions): Unit =
        cairo_font_options_merge(cairoFontOptionsPointer, other.cairoFontOptionsPointer)

    public fun hash(): gulong = cairo_font_options_hash(cairoFontOptionsPointer)

    public fun equal(other: FontOptions): Boolean =
        cairo_font_options_equal(cairoFontOptionsPointer, other.cairoFontOptionsPointer).asBoolean()

    public fun setAntialias(antialias: Antialias): Unit =
        cairo_font_options_set_antialias(cairoFontOptionsPointer, antialias.nativeValue)

    public fun getAntialias(): Antialias = cairo_font_options_get_antialias(cairoFontOptionsPointer).run {
        Antialias.fromNativeValue(this)
    }

    public fun setSubpixelOrder(subpixelOrder: SubpixelOrder): Unit =
        cairo_font_options_set_subpixel_order(cairoFontOptionsPointer, subpixelOrder.nativeValue)

    public fun getSubpixelOrder(): SubpixelOrder = cairo_font_options_get_subpixel_order(cairoFontOptionsPointer).run {
        SubpixelOrder.fromNativeValue(this)
    }

    public fun setHintStyle(hintStyle: HintStyle): Unit =
        cairo_font_options_set_hint_style(cairoFontOptionsPointer, hintStyle.nativeValue)

    public fun getHintStyle(): HintStyle = cairo_font_options_get_hint_style(cairoFontOptionsPointer).run {
        HintStyle.fromNativeValue(this)
    }

    public fun setHintMetrics(hintMetrics: HintMetrics): Unit =
        cairo_font_options_set_hint_metrics(cairoFontOptionsPointer, hintMetrics.nativeValue)

    public fun getHintMetrics(): HintMetrics = cairo_font_options_get_hint_metrics(cairoFontOptionsPointer).run {
        HintMetrics.fromNativeValue(this)
    }

    /**
     *
     *
     * @param variations
     * @since 1.16
     */
    @CairoVersion1_16
    public fun setVariations(variations: String): Unit =
        cairo_font_options_set_variations(cairoFontOptionsPointer, variations)

    /**
     *
     *
     * @since 1.16
     */
    @CairoVersion1_16
    public fun getVariations(): String =
        cairo_font_options_get_variations(cairoFontOptionsPointer)?.toKString() ?: error("Expected not null string")

    /**
     *
     *
     * @param colorMode
     * @since 1.18
     */
    @CairoVersion1_18
    public fun setColorMode(colorMode: ColorMode): Unit =
        cairo_font_options_set_color_mode(cairoFontOptionsPointer, colorMode.nativeValue)

    /**
     *
     *
     * @since 1.18
     */
    @CairoVersion1_18
    public fun getColorMode(): ColorMode = cairo_font_options_get_color_mode(cairoFontOptionsPointer).run {
        ColorMode.fromNativeValue(this)
    }

    /**
     *
     *
     * @param paletteIndex
     * @since 1.18
     */
    @CairoVersion1_18
    public fun setColorPalette(paletteIndex: guint): Unit =
        cairo_font_options_set_color_palette(cairoFontOptionsPointer, paletteIndex)

    /**
     *
     *
     * @since 1.18
     */
    @CairoVersion1_18
    public fun getColorPalette(): guint = cairo_font_options_get_color_palette(cairoFontOptionsPointer)

    /**
     *
     *
     * @param index
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @since 1.18
     */
    @CairoVersion1_18
    public fun setCustomPaletteColor(index: guint, red: gdouble, green: gdouble, blue: gdouble, alpha: gdouble): Unit =
        cairo_font_options_set_custom_palette_color(cairoFontOptionsPointer, index, red, green, blue, alpha)

    public companion object {
        /**
         * Get the GType of FontOptions
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_font_options_get_type()
    }
}
