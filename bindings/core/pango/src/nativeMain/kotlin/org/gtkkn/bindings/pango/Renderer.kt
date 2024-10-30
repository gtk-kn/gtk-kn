// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.pango.PangoRenderer
import org.gtkkn.native.pango.pango_renderer_activate
import org.gtkkn.native.pango.pango_renderer_deactivate
import org.gtkkn.native.pango.pango_renderer_draw_error_underline
import org.gtkkn.native.pango.pango_renderer_draw_glyph_item
import org.gtkkn.native.pango.pango_renderer_draw_glyphs
import org.gtkkn.native.pango.pango_renderer_draw_layout
import org.gtkkn.native.pango.pango_renderer_draw_layout_line
import org.gtkkn.native.pango.pango_renderer_draw_rectangle
import org.gtkkn.native.pango.pango_renderer_draw_trapezoid
import org.gtkkn.native.pango.pango_renderer_get_alpha
import org.gtkkn.native.pango.pango_renderer_get_color
import org.gtkkn.native.pango.pango_renderer_get_layout
import org.gtkkn.native.pango.pango_renderer_get_layout_line
import org.gtkkn.native.pango.pango_renderer_get_matrix
import org.gtkkn.native.pango.pango_renderer_get_type
import org.gtkkn.native.pango.pango_renderer_part_changed
import org.gtkkn.native.pango.pango_renderer_set_alpha
import org.gtkkn.native.pango.pango_renderer_set_color
import org.gtkkn.native.pango.pango_renderer_set_matrix
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.UShort
import kotlin.Unit

/**
 * `PangoRenderer` is a base class for objects that can render text
 * provided as `PangoGlyphString` or `PangoLayout`.
 *
 * By subclassing `PangoRenderer` and overriding operations such as
 * @draw_glyphs and @draw_rectangle, renderers for particular font
 * backends and destinations can be created.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `glyph`: Glyph
 *
 * @since 1.8
 */
public open class Renderer(
    pointer: CPointer<PangoRenderer>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val pangoRendererPointer: CPointer<PangoRenderer>
        get() = gPointer.reinterpret()

    /**
     * Does initial setup before rendering operations on @renderer.
     *
     * [method@Pango.Renderer.deactivate] should be called when done drawing.
     * Calls such as [method@Pango.Renderer.draw_layout] automatically
     * activate the layout before drawing on it.
     *
     * Calls to [method@Pango.Renderer.activate] and
     * [method@Pango.Renderer.deactivate] can be nested and the
     * renderer will only be initialized and deinitialized once.
     *
     * @since 1.8
     */
    public open fun activate(): Unit = pango_renderer_activate(pangoRendererPointer.reinterpret())

    /**
     * Cleans up after rendering operations on @renderer.
     *
     * See docs for [method@Pango.Renderer.activate].
     *
     * @since 1.8
     */
    public open fun deactivate(): Unit = pango_renderer_deactivate(pangoRendererPointer.reinterpret())

    /**
     * Draw a squiggly line that approximately covers the given rectangle
     * in the style of an underline used to indicate a spelling error.
     *
     * The width of the underline is rounded to an integer number
     * of up/down segments and the resulting rectangle is centered
     * in the original rectangle.
     *
     * This should be called while @renderer is already active.
     * Use [method@Pango.Renderer.activate] to activate a renderer.
     *
     * @param x X coordinate of underline, in Pango units in user coordinate system
     * @param y Y coordinate of underline, in Pango units in user coordinate system
     * @param width width of underline, in Pango units in user coordinate system
     * @param height height of underline, in Pango units in user coordinate system
     * @since 1.8
     */
    public open fun drawErrorUnderline(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
    ): Unit = pango_renderer_draw_error_underline(pangoRendererPointer.reinterpret(), x, y, width, height)

    /**
     * Draws the glyphs in @glyph_item with the specified `PangoRenderer`,
     * embedding the text associated with the glyphs in the output if the
     * output format supports it.
     *
     * This is useful for rendering text in PDF.
     *
     * Note that this method does not handle attributes in @glyph_item.
     * If you want colors, shapes and lines handled automatically according
     * to those attributes, you need to use pango_renderer_draw_layout_line()
     * or pango_renderer_draw_layout().
     *
     * Note that @text is the start of the text for layout, which is then
     * indexed by `glyph_item->item->offset`.
     *
     * If @text is null, this simply calls [method@Pango.Renderer.draw_glyphs].
     *
     * The default implementation of this method simply falls back to
     * [method@Pango.Renderer.draw_glyphs].
     *
     * @param text the UTF-8 text that @glyph_item refers to
     * @param glyphItem a `PangoGlyphItem`
     * @param x X position of left edge of baseline, in user space coordinates
     *   in Pango units
     * @param y Y position of left edge of baseline, in user space coordinates
     *   in Pango units
     * @since 1.22
     */
    public open fun drawGlyphItem(
        text: String? = null,
        glyphItem: GlyphItem,
        x: Int,
        y: Int,
    ): Unit =
        pango_renderer_draw_glyph_item(pangoRendererPointer.reinterpret(), text, glyphItem.pangoGlyphItemPointer, x, y)

    /**
     * Draws the glyphs in @glyphs with the specified `PangoRenderer`.
     *
     * @param font a `PangoFont`
     * @param glyphs a `PangoGlyphString`
     * @param x X position of left edge of baseline, in user space coordinates
     *   in Pango units.
     * @param y Y position of left edge of baseline, in user space coordinates
     *   in Pango units.
     * @since 1.8
     */
    public open fun drawGlyphs(
        font: Font,
        glyphs: GlyphString,
        x: Int,
        y: Int,
    ): Unit =
        pango_renderer_draw_glyphs(
            pangoRendererPointer.reinterpret(),
            font.pangoFontPointer.reinterpret(),
            glyphs.pangoGlyphStringPointer,
            x,
            y
        )

    /**
     * Draws @layout with the specified `PangoRenderer`.
     *
     * This is equivalent to drawing the lines of the layout, at their
     * respective positions relative to @x, @y.
     *
     * @param layout a `PangoLayout`
     * @param x X position of left edge of baseline, in user space coordinates
     *   in Pango units.
     * @param y Y position of left edge of baseline, in user space coordinates
     *   in Pango units.
     * @since 1.8
     */
    public open fun drawLayout(
        layout: Layout,
        x: Int,
        y: Int,
    ): Unit =
        pango_renderer_draw_layout(pangoRendererPointer.reinterpret(), layout.pangoLayoutPointer.reinterpret(), x, y)

    /**
     * Draws @line with the specified `PangoRenderer`.
     *
     * This draws the glyph items that make up the line, as well as
     * shapes, backgrounds and lines that are specified by the attributes
     * of those items.
     *
     * @param line a `PangoLayoutLine`
     * @param x X position of left edge of baseline, in user space coordinates
     *   in Pango units.
     * @param y Y position of left edge of baseline, in user space coordinates
     *   in Pango units.
     * @since 1.8
     */
    public open fun drawLayoutLine(
        line: LayoutLine,
        x: Int,
        y: Int,
    ): Unit = pango_renderer_draw_layout_line(pangoRendererPointer.reinterpret(), line.pangoLayoutLinePointer, x, y)

    /**
     * Draws an axis-aligned rectangle in user space coordinates with the
     * specified `PangoRenderer`.
     *
     * This should be called while @renderer is already active.
     * Use [method@Pango.Renderer.activate] to activate a renderer.
     *
     * @param part type of object this rectangle is part of
     * @param x X position at which to draw rectangle, in user space coordinates
     *   in Pango units
     * @param y Y position at which to draw rectangle, in user space coordinates
     *   in Pango units
     * @param width width of rectangle in Pango units
     * @param height height of rectangle in Pango units
     * @since 1.8
     */
    public open fun drawRectangle(
        part: RenderPart,
        x: Int,
        y: Int,
        width: Int,
        height: Int,
    ): Unit = pango_renderer_draw_rectangle(pangoRendererPointer.reinterpret(), part.nativeValue, x, y, width, height)

    /**
     * Draws a trapezoid with the parallel sides aligned with the X axis
     * using the given `PangoRenderer`; coordinates are in device space.
     *
     * @param part type of object this trapezoid is part of
     * @param y1 Y coordinate of top of trapezoid
     * @param x11 X coordinate of left end of top of trapezoid
     * @param x21 X coordinate of right end of top of trapezoid
     * @param y2 Y coordinate of bottom of trapezoid
     * @param x12 X coordinate of left end of bottom of trapezoid
     * @param x22 X coordinate of right end of bottom of trapezoid
     * @since 1.8
     */
    public open fun drawTrapezoid(
        part: RenderPart,
        y1: Double,
        x11: Double,
        x21: Double,
        y2: Double,
        x12: Double,
        x22: Double,
    ): Unit =
        pango_renderer_draw_trapezoid(pangoRendererPointer.reinterpret(), part.nativeValue, y1, x11, x21, y2, x12, x22)

    /**
     * Gets the current alpha for the specified part.
     *
     * @param part the part to get the alpha for
     * @return the alpha for the specified part,
     *   or 0 if it hasn't been set and should be
     *   inherited from the environment.
     * @since 1.38
     */
    public open fun getAlpha(part: RenderPart): UShort =
        pango_renderer_get_alpha(pangoRendererPointer.reinterpret(), part.nativeValue)

    /**
     * Gets the current rendering color for the specified part.
     *
     * @param part the part to get the color for
     * @return the color for the
     *   specified part, or null if it hasn't been set and should be
     *   inherited from the environment.
     * @since 1.8
     */
    public open fun getColor(part: RenderPart): Color? =
        pango_renderer_get_color(pangoRendererPointer.reinterpret(), part.nativeValue)?.run {
            Color(reinterpret())
        }

    /**
     * Gets the layout currently being rendered using @renderer.
     *
     * Calling this function only makes sense from inside a subclass's
     * methods, like in its draw_shape vfunc, for example.
     *
     * The returned layout should not be modified while still being
     * rendered.
     *
     * @return the layout, or null if
     *   no layout is being rendered using @renderer at this time.
     * @since 1.20
     */
    public open fun getLayout(): Layout? =
        pango_renderer_get_layout(pangoRendererPointer.reinterpret())?.run {
            Layout(reinterpret())
        }

    /**
     * Gets the layout line currently being rendered using @renderer.
     *
     * Calling this function only makes sense from inside a subclass's
     * methods, like in its draw_shape vfunc, for example.
     *
     * The returned layout line should not be modified while still being
     * rendered.
     *
     * @return the layout line, or null
     *   if no layout line is being rendered using @renderer at this time.
     * @since 1.20
     */
    public open fun getLayoutLine(): LayoutLine? =
        pango_renderer_get_layout_line(pangoRendererPointer.reinterpret())?.run {
            LayoutLine(reinterpret())
        }

    /**
     * Gets the transformation matrix that will be applied when
     * rendering.
     *
     * See [method@Pango.Renderer.set_matrix].
     *
     * @return the matrix, or null if no matrix has
     *   been set (which is the same as the identity matrix). The returned
     *   matrix is owned by Pango and must not be modified or freed.
     * @since 1.8
     */
    public open fun getMatrix(): Matrix? =
        pango_renderer_get_matrix(pangoRendererPointer.reinterpret())?.run {
            Matrix(reinterpret())
        }

    /**
     * Informs Pango that the way that the rendering is done
     * for @part has changed.
     *
     * This should be called if the rendering changes in a way that would
     * prevent multiple pieces being joined together into one drawing call.
     * For instance, if a subclass of `PangoRenderer` was to add a stipple
     * option for drawing underlines, it needs to call
     *
     * ```
     * pango_renderer_part_changed (render, PANGO_RENDER_PART_UNDERLINE);
     * ```
     *
     * When the stipple changes or underlines with different stipples
     * might be joined together. Pango automatically calls this for
     * changes to colors. (See [method@Pango.Renderer.set_color])
     *
     * @param part the part for which rendering has changed.
     * @since 1.8
     */
    public open fun partChanged(part: RenderPart): Unit =
        pango_renderer_part_changed(pangoRendererPointer.reinterpret(), part.nativeValue)

    /**
     * Sets the alpha for part of the rendering.
     *
     * Note that the alpha may only be used if a color is
     * specified for @part as well.
     *
     * @param part the part to set the alpha for
     * @param alpha an alpha value between 1 and 65536, or 0 to unset the alpha
     * @since 1.38
     */
    public open fun setAlpha(
        part: RenderPart,
        alpha: UShort,
    ): Unit = pango_renderer_set_alpha(pangoRendererPointer.reinterpret(), part.nativeValue, alpha)

    /**
     * Sets the color for part of the rendering.
     *
     * Also see [method@Pango.Renderer.set_alpha].
     *
     * @param part the part to change the color of
     * @param color the new color or null to unset the current color
     * @since 1.8
     */
    public open fun setColor(
        part: RenderPart,
        color: Color? = null,
    ): Unit = pango_renderer_set_color(pangoRendererPointer.reinterpret(), part.nativeValue, color?.pangoColorPointer)

    /**
     * Sets the transformation matrix that will be applied when rendering.
     *
     * @param matrix a `PangoMatrix`, or null to unset any existing matrix
     *  (No matrix set is the same as setting the identity matrix.)
     * @since 1.8
     */
    public open fun setMatrix(matrix: Matrix? = null): Unit =
        pango_renderer_set_matrix(pangoRendererPointer.reinterpret(), matrix?.pangoMatrixPointer)

    public companion object : TypeCompanion<Renderer> {
        override val type: GeneratedClassKGType<Renderer> =
            GeneratedClassKGType(pango_renderer_get_type()) { Renderer(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }
    }
}