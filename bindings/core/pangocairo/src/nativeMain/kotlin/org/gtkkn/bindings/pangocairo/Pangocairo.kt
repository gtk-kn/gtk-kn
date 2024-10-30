// This is a generated file. Do not modify.
package org.gtkkn.bindings.pangocairo

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.cairo.FontType
import org.gtkkn.bindings.pango.AttrShape
import org.gtkkn.bindings.pango.FontMap
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.native.pango.PangoAttrShape
import org.gtkkn.native.pangocairo.pango_cairo_font_map_get_default
import org.gtkkn.native.pangocairo.pango_cairo_font_map_new
import org.gtkkn.native.pangocairo.pango_cairo_font_map_new_for_font_type
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `context`: C Type PangoContext is ignored
 * - parameter `context`: C Type PangoContext is ignored
 * - parameter `context`: C Type PangoContext is ignored
 * - parameter `context`: C Type PangoContext is ignored
 * - parameter `context`: C Type PangoContext is ignored
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
public object Pangocairo {
    /**
     * Gets a default `PangoCairoFontMap` to use with Cairo.
     *
     * Note that the type of the returned object will depend on the
     * particular font backend Cairo was compiled to use; you generally
     * should only use the `PangoFontMap` and `PangoCairoFontMap`
     * interfaces on the returned object.
     *
     * The default Cairo fontmap can be changed by using
     * [method@PangoCairo.FontMap.set_default]. This can be used to
     * change the Cairo font backend that the default fontmap uses
     * for example.
     *
     * Note that since Pango 1.32.6, the default fontmap is per-thread.
     * Each thread gets its own default fontmap. In this way, PangoCairo
     * can be used safely from multiple threads.
     *
     * @return the default PangoCairo fontmap
     *  for the current thread. This object is owned by Pango and must
     *  not be freed.
     * @since 1.10
     */
    public fun fontMapGetDefault(): FontMap =
        pango_cairo_font_map_get_default()!!.run {
            FontMap(reinterpret())
        }

    /**
     * Creates a new `PangoCairoFontMap` object.
     *
     * A fontmap is used to cache information about available fonts,
     * and holds certain global parameters such as the resolution.
     * In most cases, you can use `func@PangoCairo.font_map_get_default]
     * instead.
     *
     * Note that the type of the returned object will depend
     * on the particular font backend Cairo was compiled to use;
     * You generally should only use the `PangoFontMap` and
     * `PangoCairoFontMap` interfaces on the returned object.
     *
     * You can override the type of backend returned by using an
     * environment variable %PANGOCAIRO_BACKEND. Supported types,
     * based on your build, are fc (fontconfig), win32, and coretext.
     * If requested type is not available, NULL is returned. Ie.
     * this is only useful for testing, when at least two backends
     * are compiled in.
     *
     * @return the newly allocated `PangoFontMap`,
     *   which should be freed with g_object_unref().
     * @since 1.10
     */
    public fun fontMapNew(): FontMap =
        pango_cairo_font_map_new()!!.run {
            FontMap(reinterpret())
        }

    /**
     * Creates a new `PangoCairoFontMap` object of the type suitable
     * to be used with cairo font backend of type @fonttype.
     *
     * In most cases one should simply use [func@PangoCairo.FontMap.new], or
     * in fact in most of those cases, just use [func@PangoCairo.FontMap.get_default].
     *
     * @param fonttype desired #cairo_font_type_t
     * @return the newly allocated
     *   `PangoFontMap` of suitable type which should be freed with
     *   g_object_unref(), or null if the requested cairo font backend
     *   is not supported / compiled in.
     * @since 1.18
     */
    public fun fontMapNewForFontType(fonttype: FontType): FontMap? =
        pango_cairo_font_map_new_for_font_type(fonttype.nativeValue)?.run {
            FontMap(reinterpret())
        }
}

public val ShapeRendererFuncFunc: CPointer<CFunction<(CPointer<PangoAttrShape>, Int) -> Unit>> =
    staticCFunction {
            attr: CPointer<PangoAttrShape>?,
            doPath: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(attr: AttrShape, doPath: Boolean) -> Unit>().get().invoke(
            attr!!.run {
                AttrShape(reinterpret())
            },
            doPath.asBoolean()
        )
    }.reinterpret()

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
