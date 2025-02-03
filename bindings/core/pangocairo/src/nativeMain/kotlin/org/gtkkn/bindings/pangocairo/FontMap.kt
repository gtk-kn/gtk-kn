// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pangocairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.FontType
import org.gtkkn.bindings.pango.Context
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_10
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_18
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_22
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pangocairo.PangoCairoFontMap
import org.gtkkn.native.pangocairo.pango_cairo_font_map_create_context
import org.gtkkn.native.pangocairo.pango_cairo_font_map_get_default
import org.gtkkn.native.pangocairo.pango_cairo_font_map_get_font_type
import org.gtkkn.native.pangocairo.pango_cairo_font_map_get_resolution
import org.gtkkn.native.pangocairo.pango_cairo_font_map_get_type
import org.gtkkn.native.pangocairo.pango_cairo_font_map_new
import org.gtkkn.native.pangocairo.pango_cairo_font_map_new_for_font_type
import org.gtkkn.native.pangocairo.pango_cairo_font_map_set_default
import org.gtkkn.native.pangocairo.pango_cairo_font_map_set_resolution
import kotlin.Unit

/**
 * `PangoCairoFontMap` is an interface exported by font maps for
 * use with Cairo.
 *
 * The actual type of the font map will depend on the particular
 * font technology Cairo was compiled to use.
 * @since 1.10
 */
@PangoCairoVersion1_10
public interface FontMap :
    Proxy,
    KGTyped {
    public val pangocairoFontMapPointer: CPointer<PangoCairoFontMap>

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.22.
     *
     * Use pango_font_map_create_context() instead.
     * ---
     *
     * Create a `PangoContext` for the given fontmap.
     *
     * @return the newly created context; free with g_object_unref().
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun createPangoCairoContext(): Context =
        pango_cairo_font_map_create_context(pangocairoFontMapPointer)!!.run {
            InstanceCache.get(this, true) { Context(reinterpret()) }!!
        }

    /**
     * Gets the type of Cairo font backend that @fontmap uses.
     *
     * @return the `cairo_font_type_t` cairo font backend type
     * @since 1.18
     */
    @PangoCairoVersion1_18
    public fun getFontType(): FontType = pango_cairo_font_map_get_font_type(pangocairoFontMapPointer).run {
        FontType.fromNativeValue(this)
    }

    /**
     * Gets the resolution for the fontmap.
     *
     * See [method@PangoCairo.FontMap.set_resolution].
     *
     * @return the resolution in "dots per inch"
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun getResolution(): gdouble = pango_cairo_font_map_get_resolution(pangocairoFontMapPointer)

    /**
     * Sets a default `PangoCairoFontMap` to use with Cairo.
     *
     * This can be used to change the Cairo font backend that the
     * default fontmap uses for example. The old default font map
     * is unreffed and the new font map referenced.
     *
     * Note that since Pango 1.32.6, the default fontmap is per-thread.
     * This function only changes the default fontmap for
     * the current thread. Default fontmaps of existing threads
     * are not changed. Default fontmaps of any new threads will
     * still be created using [func@PangoCairo.FontMap.new].
     *
     * A value of null for @fontmap will cause the current default
     * font map to be released and a new default font map to be created
     * on demand, using [func@PangoCairo.FontMap.new].
     *
     * @since 1.22
     */
    @PangoCairoVersion1_22
    public fun setDefault(): Unit = pango_cairo_font_map_set_default(pangocairoFontMapPointer)

    /**
     * Sets the resolution for the fontmap.
     *
     * This is a scale factor between
     * points specified in a `PangoFontDescription` and Cairo units. The
     * default value is 96, meaning that a 10 point font will be 13
     * units high. (10 * 96. / 72. = 13.3).
     *
     * @param dpi the resolution in "dots per inch". (Physical inches aren't actually
     *   involved; the terminology is conventional.)
     * @since 1.10
     */
    @PangoCairoVersion1_10
    public fun setResolution(dpi: gdouble): Unit = pango_cairo_font_map_set_resolution(pangocairoFontMapPointer, dpi)

    /**
     * The FontMapImpl type represents a native instance of the FontMap interface.
     *
     * @constructor Creates a new instance of FontMap for the provided [CPointer].
     */
    public class FontMapImpl(pangocairoFontMapPointer: CPointer<PangoCairoFontMap>) :
        org.gtkkn.bindings.pango.FontMap(pangocairoFontMapPointer.reinterpret()),
        FontMap {
        init {
            PangoCairo
        }

        override val pangocairoFontMapPointer: CPointer<PangoCairoFontMap> =
            pangocairoFontMapPointer
    }

    public companion object : TypeCompanion<FontMap> {
        override val type: GeneratedInterfaceKGType<FontMap> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { FontMapImpl(it.reinterpret()) }

        init {
            PangoCairoTypeProvider.register()
        }

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
        @PangoCairoVersion1_10
        public fun getDefault(): org.gtkkn.bindings.pango.FontMap = pango_cairo_font_map_get_default()!!.run {
            InstanceCache.get(this, true) { org.gtkkn.bindings.pango.FontMap.FontMapImpl(reinterpret()) }!!
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
        @PangoCairoVersion1_10
        public fun new(): org.gtkkn.bindings.pango.FontMap = pango_cairo_font_map_new()!!.run {
            InstanceCache.get(this, true) { org.gtkkn.bindings.pango.FontMap.FontMapImpl(reinterpret()) }!!
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
        @PangoCairoVersion1_18
        public fun newForFontType(fonttype: FontType): org.gtkkn.bindings.pango.FontMap? =
            pango_cairo_font_map_new_for_font_type(fonttype.nativeValue)?.run {
                InstanceCache.get(this, true) { org.gtkkn.bindings.pango.FontMap.FontMapImpl(reinterpret()) }!!
            }

        /**
         * Get the GType of FontMap
         *
         * @return the GType
         */
        public fun getType(): GType = pango_cairo_font_map_get_type()

        /**
         * Gets the GType of from the symbol `pango_cairo_font_map_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("pango_cairo_font_map_get_type")
    }
}
