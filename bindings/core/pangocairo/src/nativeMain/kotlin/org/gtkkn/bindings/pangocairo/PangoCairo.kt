// This is a generated file. Do not modify.
package org.gtkkn.bindings.pangocairo

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.pango.AttrShape
import org.gtkkn.bindings.pango.Context
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_10
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_18
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.gdouble
import org.gtkkn.native.pango.PangoAttrShape
import org.gtkkn.native.pangocairo.pango_cairo_context_get_resolution
import org.gtkkn.native.pangocairo.pango_cairo_context_set_resolution
import org.gtkkn.native.pangocairo.pango_cairo_context_set_shape_renderer
import kotlin.Boolean
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - function `context_get_font_options`: Return type cairo.FontOptions is unsupported
 * - parameter `data`: Unsupported pointer to primitive type
 * - parameter `options`: cairo.FontOptions
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 */
public object PangoCairo {
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
    public fun contextGetResolution(context: Context): gdouble =
        pango_cairo_context_get_resolution(context.pangoContextPointer.reinterpret())

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
    public fun contextSetResolution(context: Context, dpi: gdouble): Unit =
        pango_cairo_context_set_resolution(context.pangoContextPointer.reinterpret(), dpi)

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
    public fun contextSetShapeRenderer(context: Context, func: ShapeRendererFunc?): Unit =
        pango_cairo_context_set_shape_renderer(
            context.pangoContextPointer.reinterpret(),
            func?.let {
                ShapeRendererFuncFunc.reinterpret()
            },
            func?.let { StableRef.create(func).asCPointer() },
            func?.let { staticStableRefDestroy.reinterpret() }
        )
}

public val ShapeRendererFuncFunc: CPointer<CFunction<(CPointer<PangoAttrShape>, gboolean) -> Unit>> =
    staticCFunction {
            attr: CPointer<PangoAttrShape>?,
            doPath: gboolean,
            `data`: gpointer?,
        ->
        data!!.asStableRef<(attr: AttrShape, doPath: Boolean) -> Unit>().get().invoke(
            attr!!.run {
                AttrShape(reinterpret())
            },
            doPath.asBoolean()
        )
    }
        .reinterpret()

/**
 * Function type for rendering attributes of type %PANGO_ATTR_SHAPE
 * with Pango's Cairo renderer.
 *
 * - param `attr` the %PANGO_ATTR_SHAPE to render
 * - param `doPath` whether only the shape path should be appended to current
 * path of @cr and no filling/stroking done.  This will be set
 * to true when called from pango_cairo_layout_path() and
 * pango_cairo_layout_line_path() rendering functions.
 */
public typealias ShapeRendererFunc = (attr: AttrShape, doPath: Boolean) -> Unit
