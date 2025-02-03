// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pangocairo

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.cairo.FontOptions
import org.gtkkn.bindings.pango.AttrShape
import org.gtkkn.bindings.pango.GlyphItem
import org.gtkkn.bindings.pango.GlyphString
import org.gtkkn.bindings.pango.Layout
import org.gtkkn.bindings.pango.LayoutLine
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_10
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_14
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_18
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_22
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.TypeCache
import org.gtkkn.native.cairo.cairo_t
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.pango.PangoAttrShape
import org.gtkkn.native.pangocairo.pango_cairo_context_get_font_options
import org.gtkkn.native.pangocairo.pango_cairo_context_get_resolution
import org.gtkkn.native.pangocairo.pango_cairo_context_set_font_options
import org.gtkkn.native.pangocairo.pango_cairo_context_set_resolution
import org.gtkkn.native.pangocairo.pango_cairo_context_set_shape_renderer
import org.gtkkn.native.pangocairo.pango_cairo_create_context
import org.gtkkn.native.pangocairo.pango_cairo_create_layout
import org.gtkkn.native.pangocairo.pango_cairo_error_underline_path
import org.gtkkn.native.pangocairo.pango_cairo_glyph_string_path
import org.gtkkn.native.pangocairo.pango_cairo_layout_line_path
import org.gtkkn.native.pangocairo.pango_cairo_layout_path
import org.gtkkn.native.pangocairo.pango_cairo_show_error_underline
import org.gtkkn.native.pangocairo.pango_cairo_show_glyph_item
import org.gtkkn.native.pangocairo.pango_cairo_show_glyph_string
import org.gtkkn.native.pangocairo.pango_cairo_show_layout
import org.gtkkn.native.pangocairo.pango_cairo_show_layout_line
import org.gtkkn.native.pangocairo.pango_cairo_update_context
import org.gtkkn.native.pangocairo.pango_cairo_update_layout
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import org.gtkkn.bindings.cairo.Context as CairoContext
import org.gtkkn.bindings.pango.Context as PangoContext

/**
 * ## Skipped during bindings generation
 *
 * - parameter `data`: Unsupported pointer to primitive type
 */
public object PangoCairo {
    init {
        registerTypes()
    }

    /**
     * Retrieves any font rendering options previously set with
     * [func@PangoCairo.context_set_font_options].
     *
     * This function does not report options that are derived from
     * the target surface by [func@update_context].
     *
     * @param context a `PangoContext`, from a pangocairo font map
     * @return the font options previously set on the
     *   context, or null if no options have been set. This value is
     *   owned by the context and must not be modified or freed.
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun contextGetFontOptions(context: PangoContext): FontOptions? =
        pango_cairo_context_get_font_options(context.pangoContextPointer)?.run {
            FontOptions(this)
        }

    /**
     * Gets the resolution for the context.
     *
     * See [func@PangoCairo.context_set_resolution]
     *
     * @param context a `PangoContext`, from a pangocairo font map
     * @return the resolution in "dots per inch". A negative value will
     *   be returned if no resolution has previously been set.
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun contextGetResolution(context: PangoContext): gdouble =
        pango_cairo_context_get_resolution(context.pangoContextPointer)

    /**
     * Sets the font options used when rendering text with this context.
     *
     * These options override any options that [func@update_context]
     * derives from the target surface.
     *
     * @param context a `PangoContext`, from a pangocairo font map
     * @param options a `cairo_font_options_t`, or null to unset
     *   any previously set options. A copy is made.
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun contextSetFontOptions(context: PangoContext, options: FontOptions? = null): Unit =
        pango_cairo_context_set_font_options(context.pangoContextPointer, options?.cairoFontOptionsPointer)

    /**
     * Sets the resolution for the context.
     *
     * This is a scale factor between points specified in a `PangoFontDescription`
     * and Cairo units. The default value is 96, meaning that a 10 point font will
     * be 13 units high. (10 * 96. / 72. = 13.3).
     *
     * @param context a `PangoContext`, from a pangocairo font map
     * @param dpi the resolution in "dots per inch". (Physical inches aren't actually
     *   involved; the terminology is conventional.) A 0 or negative value
     *   means to use the resolution from the font map.
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun contextSetResolution(context: PangoContext, dpi: gdouble): Unit =
        pango_cairo_context_set_resolution(context.pangoContextPointer, dpi)

    /**
     * Sets callback function for context to use for rendering attributes
     * of type %PANGO_ATTR_SHAPE.
     *
     * See `PangoCairoShapeRendererFunc` for details.
     *
     * @param context a `PangoContext`, from a pangocairo font map
     * @param func Callback function for rendering attributes of
     *   type %PANGO_ATTR_SHAPE, or null to disable shape rendering.
     * @since 1.18
     */
    @PangoCairoVersion1_18
    public fun contextSetShapeRenderer(context: PangoContext, func: ShapeRendererFunc?): Unit =
        pango_cairo_context_set_shape_renderer(
            context.pangoContextPointer,
            func?.let {
                ShapeRendererFuncFunc.reinterpret()
            },
            func?.let { StableRef.create(func).asCPointer() },
            func?.let { staticStableRefDestroy.reinterpret() }
        )

    /**
     * Creates a context object set up to match the current transformation
     * and target surface of the Cairo context.
     *
     * This context can then be
     * used to create a layout using [ctor@Pango.Layout.new].
     *
     * This function is a convenience function that creates a context using
     * the default font map, then updates it to @cr. If you just need to
     * create a layout for use with @cr and do not need to access `PangoContext`
     * directly, you can use [func@create_layout] instead.
     *
     * @param cr a Cairo context
     * @return the newly created `PangoContext`
     * @since 1.22
     */
    @PangoCairoVersion1_22
    public fun createContext(cr: CairoContext): PangoContext =
        pango_cairo_create_context(cr.cairoContextPointer)!!.run {
            InstanceCache.get(this, true) { PangoContext(reinterpret()) }!!
        }

    /**
     * Creates a layout object set up to match the current transformation
     * and target surface of the Cairo context.
     *
     * This layout can then be used for text measurement with functions
     * like [method@Pango.Layout.get_size] or drawing with functions like
     * [func@show_layout]. If you change the transformation or target
     * surface for @cr, you need to call [func@update_layout].
     *
     * This function is the most convenient way to use Cairo with Pango,
     * however it is slightly inefficient since it creates a separate
     * `PangoContext` object for each layout. This might matter in an
     * application that was laying out large amounts of text.
     *
     * @param cr a Cairo context
     * @return the newly created `PangoLayout`
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun createLayout(cr: CairoContext): Layout = pango_cairo_create_layout(cr.cairoContextPointer)!!.run {
        InstanceCache.get(this, true) { Layout(reinterpret()) }!!
    }

    /**
     * Add a squiggly line to the current path in the specified cairo context that
     * approximately covers the given rectangle in the style of an underline used
     * to indicate a spelling error.
     *
     * The width of the underline is rounded to an integer number of up/down
     * segments and the resulting rectangle is centered in the original rectangle.
     *
     * @param cr a Cairo context
     * @param x The X coordinate of one corner of the rectangle
     * @param y The Y coordinate of one corner of the rectangle
     * @param width Non-negative width of the rectangle
     * @param height Non-negative height of the rectangle
     * @since 1.14
     */
    @PangoCairoVersion1_14
    public fun errorUnderlinePath(cr: CairoContext, x: gdouble, y: gdouble, width: gdouble, height: gdouble): Unit =
        pango_cairo_error_underline_path(cr.cairoContextPointer, x, y, width, height)

    /**
     * Adds the glyphs in @glyphs to the current path in the specified
     * cairo context.
     *
     * The origin of the glyphs (the left edge of the baseline)
     * will be at the current point of the cairo context.
     *
     * @param cr a Cairo context
     * @param font a `PangoFont` from a `PangoCairoFontMap`
     * @param glyphs a `PangoGlyphString`
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun glyphStringPath(cr: CairoContext, font: org.gtkkn.bindings.pango.Font, glyphs: GlyphString): Unit =
        pango_cairo_glyph_string_path(cr.cairoContextPointer, font.pangoFontPointer, glyphs.pangoGlyphStringPointer)

    /**
     * Adds the text in `PangoLayoutLine` to the current path in the
     * specified cairo context.
     *
     * The origin of the glyphs (the left edge of the line) will be
     * at the current point of the cairo context.
     *
     * @param cr a Cairo context
     * @param line a `PangoLayoutLine`
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun layoutLinePath(cr: CairoContext, line: LayoutLine): Unit =
        pango_cairo_layout_line_path(cr.cairoContextPointer, line.pangoLayoutLinePointer)

    /**
     * Adds the text in a `PangoLayout` to the current path in the
     * specified cairo context.
     *
     * The top-left corner of the `PangoLayout` will be at the
     * current point of the cairo context.
     *
     * @param cr a Cairo context
     * @param layout a Pango layout
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun layoutPath(cr: CairoContext, layout: Layout): Unit =
        pango_cairo_layout_path(cr.cairoContextPointer, layout.pangoLayoutPointer)

    /**
     * Draw a squiggly line in the specified cairo context that approximately
     * covers the given rectangle in the style of an underline used to indicate a
     * spelling error.
     *
     * The width of the underline is rounded to an integer
     * number of up/down segments and the resulting rectangle is centered in the
     * original rectangle.
     *
     * @param cr a Cairo context
     * @param x The X coordinate of one corner of the rectangle
     * @param y The Y coordinate of one corner of the rectangle
     * @param width Non-negative width of the rectangle
     * @param height Non-negative height of the rectangle
     * @since 1.14
     */
    @PangoCairoVersion1_14
    public fun showErrorUnderline(cr: CairoContext, x: gdouble, y: gdouble, width: gdouble, height: gdouble): Unit =
        pango_cairo_show_error_underline(cr.cairoContextPointer, x, y, width, height)

    /**
     * Draws the glyphs in @glyph_item in the specified cairo context,
     *
     * embedding the text associated with the glyphs in the output if the
     * output format supports it (PDF for example), otherwise it acts
     * similar to [func@show_glyph_string].
     *
     * The origin of the glyphs (the left edge of the baseline) will
     * be drawn at the current point of the cairo context.
     *
     * Note that @text is the start of the text for layout, which is then
     * indexed by `glyph_item->item->offset`.
     *
     * @param cr a Cairo context
     * @param text the UTF-8 text that @glyph_item refers to
     * @param glyphItem a `PangoGlyphItem`
     * @since 1.22
     */
    @PangoCairoVersion1_22
    public fun showGlyphItem(cr: CairoContext, text: String, glyphItem: GlyphItem): Unit =
        pango_cairo_show_glyph_item(cr.cairoContextPointer, text, glyphItem.pangoGlyphItemPointer)

    /**
     * Draws the glyphs in @glyphs in the specified cairo context.
     *
     * The origin of the glyphs (the left edge of the baseline) will
     * be drawn at the current point of the cairo context.
     *
     * @param cr a Cairo context
     * @param font a `PangoFont` from a `PangoCairoFontMap`
     * @param glyphs a `PangoGlyphString`
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun showGlyphString(cr: CairoContext, font: org.gtkkn.bindings.pango.Font, glyphs: GlyphString): Unit =
        pango_cairo_show_glyph_string(cr.cairoContextPointer, font.pangoFontPointer, glyphs.pangoGlyphStringPointer)

    /**
     * Draws a `PangoLayout` in the specified cairo context.
     *
     * The top-left corner of the `PangoLayout` will be drawn
     * at the current point of the cairo context.
     *
     * @param cr a Cairo context
     * @param layout a Pango layout
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun showLayout(cr: CairoContext, layout: Layout): Unit =
        pango_cairo_show_layout(cr.cairoContextPointer, layout.pangoLayoutPointer)

    /**
     * Draws a `PangoLayoutLine` in the specified cairo context.
     *
     * The origin of the glyphs (the left edge of the line) will
     * be drawn at the current point of the cairo context.
     *
     * @param cr a Cairo context
     * @param line a `PangoLayoutLine`
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun showLayoutLine(cr: CairoContext, line: LayoutLine): Unit =
        pango_cairo_show_layout_line(cr.cairoContextPointer, line.pangoLayoutLinePointer)

    /**
     * Updates a `PangoContext` previously created for use with Cairo to
     * match the current transformation and target surface of a Cairo
     * context.
     *
     * If any layouts have been created for the context, it's necessary
     * to call [method@Pango.Layout.context_changed] on those layouts.
     *
     * @param cr a Cairo context
     * @param context a `PangoContext`, from a pangocairo font map
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun updateContext(cr: CairoContext, context: PangoContext): Unit =
        pango_cairo_update_context(cr.cairoContextPointer, context.pangoContextPointer)

    /**
     * Updates the private `PangoContext` of a `PangoLayout` created with
     * [func@create_layout] to match the current transformation and target
     * surface of a Cairo context.
     *
     * @param cr a Cairo context
     * @param layout a `PangoLayout`, from [func@create_layout]
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun updateLayout(cr: CairoContext, layout: Layout): Unit =
        pango_cairo_update_layout(cr.cairoContextPointer, layout.pangoLayoutPointer)

    private fun registerTypes() {
        Font.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Font::class, gtype) { Font.FontImpl(it.reinterpret()) }
        }
        FontMap.getTypeOrNull()?.let { gtype ->
            TypeCache.register(FontMap::class, gtype) { FontMap.FontMapImpl(it.reinterpret()) }
        }
    }
}

public val ShapeRendererFuncFunc: CPointer<
    CFunction<
        (
            CPointer<cairo_t>,
            CPointer<PangoAttrShape>,
            gboolean,
        ) -> Unit
        >
    > = staticCFunction {
        cr: CPointer<cairo_t>?,
        attr: CPointer<PangoAttrShape>?,
        doPath: gboolean,
        `data`: gpointer?,
    ->
    data!!.asStableRef<
        (
            cr: CairoContext,
            attr: AttrShape,
            doPath: Boolean,
        ) -> Unit
        >().get().invoke(
        cr!!.run {
            CairoContext(this)
        },
        attr!!.run {
            AttrShape(this)
        },
        doPath.asBoolean()
    )
}
    .reinterpret()

/**
 * Function type for rendering attributes of type %PANGO_ATTR_SHAPE
 * with Pango's Cairo renderer.
 *
 * - param `cr` a Cairo context with current point set to where the shape should
 * be rendered
 * - param `attr` the %PANGO_ATTR_SHAPE to render
 * - param `doPath` whether only the shape path should be appended to current
 * path of @cr and no filling/stroking done.  This will be set
 * to true when called from pango_cairo_layout_path() and
 * pango_cairo_layout_line_path() rendering functions.
 */
public typealias ShapeRendererFunc = (
    cr: CairoContext,
    attr: AttrShape,
    doPath: Boolean,
) -> Unit
