// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_16
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_18
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_4
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_6
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.cairo.cairo_append_path
import org.gtkkn.native.cairo.cairo_arc
import org.gtkkn.native.cairo.cairo_arc_negative
import org.gtkkn.native.cairo.cairo_clip
import org.gtkkn.native.cairo.cairo_clip_preserve
import org.gtkkn.native.cairo.cairo_close_path
import org.gtkkn.native.cairo.cairo_copy_page
import org.gtkkn.native.cairo.cairo_copy_path
import org.gtkkn.native.cairo.cairo_copy_path_flat
import org.gtkkn.native.cairo.cairo_create
import org.gtkkn.native.cairo.cairo_curve_to
import org.gtkkn.native.cairo.cairo_destroy
import org.gtkkn.native.cairo.cairo_fill
import org.gtkkn.native.cairo.cairo_fill_preserve
import org.gtkkn.native.cairo.cairo_font_extents
import org.gtkkn.native.cairo.cairo_get_antialias
import org.gtkkn.native.cairo.cairo_get_dash_count
import org.gtkkn.native.cairo.cairo_get_fill_rule
import org.gtkkn.native.cairo.cairo_get_font_face
import org.gtkkn.native.cairo.cairo_get_font_matrix
import org.gtkkn.native.cairo.cairo_get_font_options
import org.gtkkn.native.cairo.cairo_get_group_target
import org.gtkkn.native.cairo.cairo_get_hairline
import org.gtkkn.native.cairo.cairo_get_line_cap
import org.gtkkn.native.cairo.cairo_get_line_join
import org.gtkkn.native.cairo.cairo_get_line_width
import org.gtkkn.native.cairo.cairo_get_matrix
import org.gtkkn.native.cairo.cairo_get_miter_limit
import org.gtkkn.native.cairo.cairo_get_operator
import org.gtkkn.native.cairo.cairo_get_scaled_font
import org.gtkkn.native.cairo.cairo_get_source
import org.gtkkn.native.cairo.cairo_get_target
import org.gtkkn.native.cairo.cairo_get_tolerance
import org.gtkkn.native.cairo.cairo_get_user_data
import org.gtkkn.native.cairo.cairo_gobject_context_get_type
import org.gtkkn.native.cairo.cairo_has_current_point
import org.gtkkn.native.cairo.cairo_identity_matrix
import org.gtkkn.native.cairo.cairo_in_clip
import org.gtkkn.native.cairo.cairo_in_stroke
import org.gtkkn.native.cairo.cairo_line_to
import org.gtkkn.native.cairo.cairo_mask
import org.gtkkn.native.cairo.cairo_mask_surface
import org.gtkkn.native.cairo.cairo_move_to
import org.gtkkn.native.cairo.cairo_new_path
import org.gtkkn.native.cairo.cairo_new_sub_path
import org.gtkkn.native.cairo.cairo_paint
import org.gtkkn.native.cairo.cairo_paint_with_alpha
import org.gtkkn.native.cairo.cairo_pop_group
import org.gtkkn.native.cairo.cairo_pop_group_to_source
import org.gtkkn.native.cairo.cairo_push_group
import org.gtkkn.native.cairo.cairo_push_group_with_content
import org.gtkkn.native.cairo.cairo_rectangle
import org.gtkkn.native.cairo.cairo_rel_curve_to
import org.gtkkn.native.cairo.cairo_rel_line_to
import org.gtkkn.native.cairo.cairo_rel_move_to
import org.gtkkn.native.cairo.cairo_reset_clip
import org.gtkkn.native.cairo.cairo_restore
import org.gtkkn.native.cairo.cairo_rotate
import org.gtkkn.native.cairo.cairo_save
import org.gtkkn.native.cairo.cairo_scale
import org.gtkkn.native.cairo.cairo_select_font_face
import org.gtkkn.native.cairo.cairo_set_antialias
import org.gtkkn.native.cairo.cairo_set_fill_rule
import org.gtkkn.native.cairo.cairo_set_font_face
import org.gtkkn.native.cairo.cairo_set_font_matrix
import org.gtkkn.native.cairo.cairo_set_font_options
import org.gtkkn.native.cairo.cairo_set_font_size
import org.gtkkn.native.cairo.cairo_set_hairline
import org.gtkkn.native.cairo.cairo_set_line_cap
import org.gtkkn.native.cairo.cairo_set_line_join
import org.gtkkn.native.cairo.cairo_set_line_width
import org.gtkkn.native.cairo.cairo_set_matrix
import org.gtkkn.native.cairo.cairo_set_miter_limit
import org.gtkkn.native.cairo.cairo_set_operator
import org.gtkkn.native.cairo.cairo_set_scaled_font
import org.gtkkn.native.cairo.cairo_set_source
import org.gtkkn.native.cairo.cairo_set_source_rgb
import org.gtkkn.native.cairo.cairo_set_source_rgba
import org.gtkkn.native.cairo.cairo_set_source_surface
import org.gtkkn.native.cairo.cairo_set_tolerance
import org.gtkkn.native.cairo.cairo_show_page
import org.gtkkn.native.cairo.cairo_show_text
import org.gtkkn.native.cairo.cairo_status
import org.gtkkn.native.cairo.cairo_stroke
import org.gtkkn.native.cairo.cairo_stroke_preserve
import org.gtkkn.native.cairo.cairo_t
import org.gtkkn.native.cairo.cairo_tag_begin
import org.gtkkn.native.cairo.cairo_tag_end
import org.gtkkn.native.cairo.cairo_text_extents
import org.gtkkn.native.cairo.cairo_text_path
import org.gtkkn.native.cairo.cairo_transform
import org.gtkkn.native.cairo.cairo_translate
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
 * - parameter `dashes`: Unsupported pointer to primitive type
 * - parameter `x`: Unsupported pointer to primitive type
 * - parameter `x1`: Unsupported pointer to primitive type
 * - parameter `x1`: Unsupported pointer to primitive type
 * - parameter `x1`: Unsupported pointer to primitive type
 * - parameter `x`: Unsupported pointer to primitive type
 * - parameter `dx`: Unsupported pointer to primitive type
 * - parameter `x`: Unsupported pointer to primitive type
 * - parameter `dx`: Unsupported pointer to primitive type
 * - parameter `destroy`: GLib.DestroyNotify
 * - parameter `dashes`: Unsupported pointer to primitive type
 * - parameter `x1`: Unsupported pointer to primitive type
 */
public class Context(pointer: CPointer<cairo_t>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<cairo_t> = pointer

    public fun save(): Unit = cairo_save(gPointer.reinterpret())

    public fun restore(): Unit = cairo_restore(gPointer.reinterpret())

    public fun rotate(angle: gdouble): Unit = cairo_rotate(gPointer.reinterpret(), angle)

    public fun paint(): Unit = cairo_paint(gPointer.reinterpret())

    public fun paintWithAlpha(alpha: gdouble): Unit = cairo_paint_with_alpha(gPointer.reinterpret(), alpha)

    public fun setSourceSurface(surface: Surface, x: gdouble, y: gdouble): Unit =
        cairo_set_source_surface(gPointer.reinterpret(), surface.gPointer.reinterpret(), x, y)

    public fun setSource(source: Pattern): Unit =
        cairo_set_source(gPointer.reinterpret(), source.gPointer.reinterpret())

    public fun closePath(): Unit = cairo_close_path(gPointer.reinterpret())

    public fun setOperator(`operator`: Operator): Unit =
        cairo_set_operator(gPointer.reinterpret(), `operator`.nativeValue)

    public fun setLineWidth(width: gdouble): Unit = cairo_set_line_width(gPointer.reinterpret(), width)

    public fun setAntialias(antialias: Antialias): Unit =
        cairo_set_antialias(gPointer.reinterpret(), antialias.nativeValue)

    public fun moveTo(x: gdouble, y: gdouble): Unit = cairo_move_to(gPointer.reinterpret(), x, y)

    public fun selectFontFace(utf8: String, style: FontSlant, weight: FontWeight): Unit =
        cairo_select_font_face(gPointer.reinterpret(), utf8, style.nativeValue, weight.nativeValue)

    public fun setFontSize(size: gdouble): Unit = cairo_set_font_size(gPointer.reinterpret(), size)

    public fun lineTo(x: gdouble, y: gdouble): Unit = cairo_line_to(gPointer.reinterpret(), x, y)

    public fun arc(xc: gdouble, yc: gdouble, radius: gdouble, angle1: gdouble, angle2: gdouble): Unit =
        cairo_arc(gPointer.reinterpret(), xc, yc, radius, angle1, angle2)

    public fun curveTo(x1: gdouble, y1: gdouble, x2: gdouble, y2: gdouble, x3: gdouble, y3: gdouble): Unit =
        cairo_curve_to(gPointer.reinterpret(), x1, y1, x2, y2, x3, y3)

    public fun stroke(): Unit = cairo_stroke(gPointer.reinterpret())

    public fun fill(): Unit = cairo_fill(gPointer.reinterpret())

    public fun fillPreserve(): Unit = cairo_fill_preserve(gPointer.reinterpret())

    public fun rectangle(x: gdouble, y: gdouble, width: gdouble, height: gdouble): Unit =
        cairo_rectangle(gPointer.reinterpret(), x, y, width, height)

    public fun setLineCap(lineCap: LineCap): Unit = cairo_set_line_cap(gPointer.reinterpret(), lineCap.nativeValue)

    public fun setLineJoin(lineJoin: LineJoin): Unit = cairo_set_line_join(gPointer.reinterpret(), lineJoin.nativeValue)

    public fun setSourceRgba(red: gdouble, green: gdouble, blue: gdouble, alpha: gdouble): Unit =
        cairo_set_source_rgba(gPointer.reinterpret(), red, green, blue, alpha)

    public fun setSourceRgb(red: gdouble, green: gdouble, blue: gdouble): Unit =
        cairo_set_source_rgb(gPointer.reinterpret(), red, green, blue)

    public fun destroy(): Unit = cairo_destroy(gPointer.reinterpret())

    public fun resetClip(): Unit = cairo_reset_clip(gPointer.reinterpret())

    public fun clip(): Unit = cairo_clip(gPointer.reinterpret())

    public fun newPath(): Unit = cairo_new_path(gPointer.reinterpret())

    public fun setMatrix(matrix: Matrix): Unit = cairo_set_matrix(gPointer.reinterpret(), matrix.gPointer.reinterpret())

    public fun transform(matrix: Matrix): Unit = cairo_transform(gPointer.reinterpret(), matrix.gPointer.reinterpret())

    public fun identityMatrix(): Unit = cairo_identity_matrix(gPointer.reinterpret())

    public fun showText(utf8: String): Unit = cairo_show_text(gPointer.reinterpret(), utf8)

    public fun getSource(): Pattern = cairo_get_source(gPointer.reinterpret())!!.run {
        Pattern(reinterpret())
    }

    public fun translate(x: gdouble, y: gdouble): Unit = cairo_translate(gPointer.reinterpret(), x, y)

    public fun scale(x: gdouble, y: gdouble): Unit = cairo_scale(gPointer.reinterpret(), x, y)

    public fun getTarget(): Surface = cairo_get_target(gPointer.reinterpret())!!.run {
        Surface(reinterpret())
    }

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public fun pushGroup(): Unit = cairo_push_group(gPointer.reinterpret())

    /**
     *
     *
     * @param content
     * @since 1.2
     */
    @CairoVersion1_2
    public fun pushGroupWithContent(content: Content): Unit =
        cairo_push_group_with_content(gPointer.reinterpret(), content.nativeValue)

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public fun popGroup(): Pattern = cairo_pop_group(gPointer.reinterpret())!!.run {
        Pattern(reinterpret())
    }

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public fun popGroupToSource(): Unit = cairo_pop_group_to_source(gPointer.reinterpret())

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public fun getGroupTarget(): Surface = cairo_get_group_target(gPointer.reinterpret())!!.run {
        Surface(reinterpret())
    }

    public fun getAntialias(): Antialias = cairo_get_antialias(gPointer.reinterpret()).run {
        Antialias.fromNativeValue(this)
    }

    public fun getOperator(): Operator = cairo_get_operator(gPointer.reinterpret()).run {
        Operator.fromNativeValue(this)
    }

    public fun setMiterLimit(limit: gdouble): Unit = cairo_set_miter_limit(gPointer.reinterpret(), limit)

    public fun getMiterLimit(): gdouble = cairo_get_miter_limit(gPointer.reinterpret())

    public fun setTolerance(tolerance: gdouble): Unit = cairo_set_tolerance(gPointer.reinterpret(), tolerance)

    public fun getTolerance(): gdouble = cairo_get_tolerance(gPointer.reinterpret())

    public fun clipPreserve(): Unit = cairo_clip_preserve(gPointer.reinterpret())

    /**
     *
     *
     * @param x
     * @param y
     * @since 1.10
     */
    @CairoVersion1_10
    public fun inClip(x: gdouble, y: gdouble): Boolean = cairo_in_clip(gPointer.reinterpret(), x, y).asBoolean()

    public fun strokePreserve(): Unit = cairo_stroke_preserve(gPointer.reinterpret())

    public fun inStroke(x: gdouble, y: gdouble): Boolean = cairo_in_stroke(gPointer.reinterpret(), x, y).asBoolean()

    public fun copyPage(): Unit = cairo_copy_page(gPointer.reinterpret())

    public fun showPage(): Unit = cairo_show_page(gPointer.reinterpret())

    public fun arcNegative(xc: gdouble, yc: gdouble, radius: gdouble, angle1: gdouble, angle2: gdouble): Unit =
        cairo_arc_negative(gPointer.reinterpret(), xc, yc, radius, angle1, angle2)

    public fun textPath(utf8: String): Unit = cairo_text_path(gPointer.reinterpret(), utf8)

    public fun relCurveTo(dx1: gdouble, dy1: gdouble, dx2: gdouble, dy2: gdouble, dx3: gdouble, dy3: gdouble): Unit =
        cairo_rel_curve_to(gPointer.reinterpret(), dx1, dy1, dx2, dy2, dx3, dy3)

    public fun relLineTo(dx: gdouble, dy: gdouble): Unit = cairo_rel_line_to(gPointer.reinterpret(), dx, dy)

    public fun relMoveTo(dx: gdouble, dy: gdouble): Unit = cairo_rel_move_to(gPointer.reinterpret(), dx, dy)

    public fun getFontMatrix(matrix: Matrix): Unit =
        cairo_get_font_matrix(gPointer.reinterpret(), matrix.gPointer.reinterpret())

    public fun setFontOptions(options: FontOptions): Unit =
        cairo_set_font_options(gPointer.reinterpret(), options.gPointer.reinterpret())

    public fun getFontOptions(options: FontOptions): Unit =
        cairo_get_font_options(gPointer.reinterpret(), options.gPointer.reinterpret())

    public fun setFontFace(fontFace: FontFace): Unit =
        cairo_set_font_face(gPointer.reinterpret(), fontFace.gPointer.reinterpret())

    public fun getFontFace(): FontFace = cairo_get_font_face(gPointer.reinterpret())!!.run {
        FontFace(reinterpret())
    }

    /**
     *
     *
     * @param scaledFont
     * @since 1.2
     */
    @CairoVersion1_2
    public fun setScaledFont(scaledFont: ScaledFont): Unit =
        cairo_set_scaled_font(gPointer.reinterpret(), scaledFont.gPointer.reinterpret())

    /**
     *
     *
     * @since 1.4
     */
    @CairoVersion1_4
    public fun getScaledFont(): ScaledFont = cairo_get_scaled_font(gPointer.reinterpret())!!.run {
        ScaledFont(reinterpret())
    }

    public fun fontExtents(extents: FontExtents): Unit =
        cairo_font_extents(gPointer.reinterpret(), extents.gPointer.reinterpret())

    public fun textExtents(utf8: String, extents: TextExtents): Unit =
        cairo_text_extents(gPointer.reinterpret(), utf8, extents.gPointer.reinterpret())

    /**
     *
     *
     * @param tagName
     * @param attributes
     * @since 1.16
     */
    @CairoVersion1_16
    public fun tagBegin(tagName: String, attributes: String): Unit =
        cairo_tag_begin(gPointer.reinterpret(), tagName, attributes)

    /**
     *
     *
     * @param tagName
     * @since 1.16
     */
    @CairoVersion1_16
    public fun tagEnd(tagName: String): Unit = cairo_tag_end(gPointer.reinterpret(), tagName)

    public fun getUserData(key: UserDataKey): gpointer =
        cairo_get_user_data(gPointer.reinterpret(), key.gPointer.reinterpret())!!

    public fun status(): Status = cairo_status(gPointer.reinterpret()).run {
        Status.fromNativeValue(this)
    }

    /**
     *
     *
     * @since 1.4
     */
    @CairoVersion1_4
    public fun getDashCount(): gint = cairo_get_dash_count(gPointer.reinterpret())

    public fun setFillRule(fillRule: FillRule): Unit = cairo_set_fill_rule(gPointer.reinterpret(), fillRule.nativeValue)

    public fun getFillRule(): FillRule = cairo_get_fill_rule(gPointer.reinterpret()).run {
        FillRule.fromNativeValue(this)
    }

    public fun getLineCap(): LineCap = cairo_get_line_cap(gPointer.reinterpret()).run {
        LineCap.fromNativeValue(this)
    }

    public fun getLineJoin(): LineJoin = cairo_get_line_join(gPointer.reinterpret()).run {
        LineJoin.fromNativeValue(this)
    }

    public fun getLineWidth(): gdouble = cairo_get_line_width(gPointer.reinterpret())

    public fun mask(pattern: Pattern): Unit = cairo_mask(gPointer.reinterpret(), pattern.gPointer.reinterpret())

    public fun maskSurface(surface: Surface, surfaceX: gdouble, surfaceY: gdouble): Unit =
        cairo_mask_surface(gPointer.reinterpret(), surface.gPointer.reinterpret(), surfaceX, surfaceY)

    /**
     *
     *
     * @param enable
     * @since 1.18
     */
    @CairoVersion1_18
    public fun setHairline(enable: Boolean): Unit = cairo_set_hairline(gPointer.reinterpret(), enable.asGBoolean())

    /**
     *
     *
     * @since 1.18
     */
    @CairoVersion1_18
    public fun getHairline(): Boolean = cairo_get_hairline(gPointer.reinterpret()).asBoolean()

    public fun copyPath(): Path = cairo_copy_path(gPointer.reinterpret())!!.run {
        Path(reinterpret())
    }

    public fun copyPathFlat(): Path = cairo_copy_path_flat(gPointer.reinterpret())!!.run {
        Path(reinterpret())
    }

    public fun appendPath(path: Path): Unit = cairo_append_path(gPointer.reinterpret(), path.gPointer.reinterpret())

    /**
     *
     *
     * @since 1.6
     */
    @CairoVersion1_6
    public fun hasCurrentPoint(): Boolean = cairo_has_current_point(gPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public fun newSubPath(): Unit = cairo_new_sub_path(gPointer.reinterpret())

    public fun getMatrix(matrix: Matrix): Unit = cairo_get_matrix(gPointer.reinterpret(), matrix.gPointer.reinterpret())

    public fun setFontMatrix(matrix: Matrix): Unit =
        cairo_set_font_matrix(gPointer.reinterpret(), matrix.gPointer.reinterpret())

    public companion object {
        public fun create(surface: Surface): Context =
            Context(cairo_create(surface.gPointer.reinterpret())!!.reinterpret())

        /**
         * Get the GType of Context
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_context_get_type()
    }
}
