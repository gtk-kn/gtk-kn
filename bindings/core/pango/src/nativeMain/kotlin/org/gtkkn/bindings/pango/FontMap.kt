// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.annotations.PangoVersion1_22
import org.gtkkn.bindings.pango.annotations.PangoVersion1_32_4
import org.gtkkn.bindings.pango.annotations.PangoVersion1_34
import org.gtkkn.bindings.pango.annotations.PangoVersion1_46
import org.gtkkn.bindings.pango.annotations.PangoVersion1_52
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoFontMap
import org.gtkkn.native.pango.pango_font_map_changed
import org.gtkkn.native.pango.pango_font_map_create_context
import org.gtkkn.native.pango.pango_font_map_get_family
import org.gtkkn.native.pango.pango_font_map_get_serial
import org.gtkkn.native.pango.pango_font_map_get_type
import org.gtkkn.native.pango.pango_font_map_load_font
import org.gtkkn.native.pango.pango_font_map_load_fontset
import org.gtkkn.native.pango.pango_font_map_reload_font
import kotlin.String
import kotlin.Unit

/**
 * A `PangoFontMap` represents the set of fonts available for a
 * particular rendering system.
 *
 * This is a virtual object with implementations being specific to
 * particular rendering systems.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `families`: families: Out parameter is not supported
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public abstract class FontMap(public val pangoFontMapPointer: CPointer<PangoFontMap>) :
    Object(pangoFontMapPointer.reinterpret()),
    ListModel,
    KGTyped {
    init {
        Pango
    }

    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    /**
     * Forces a change in the context, which will cause any `PangoContext`
     * using this fontmap to change.
     *
     * This function is only useful when implementing a new backend
     * for Pango, something applications won't do. Backends should
     * call this function if they have attached extra data to the
     * context and such data is changed.
     *
     * @since 1.34
     */
    @PangoVersion1_34
    public open fun changed(): Unit = pango_font_map_changed(pangoFontMapPointer)

    /**
     * Creates a `PangoContext` connected to @fontmap.
     *
     * This is equivalent to [ctor@Pango.Context.new] followed by
     * [method@Pango.Context.set_font_map].
     *
     * If you are using Pango as part of a higher-level system,
     * that system may have it's own way of create a `PangoContext`.
     * For instance, the GTK toolkit has, among others,
     * gtk_widget_get_pango_context(). Use those instead.
     *
     * @return the newly allocated `PangoContext`,
     *   which should be freed with g_object_unref().
     * @since 1.22
     */
    @PangoVersion1_22
    public open fun createContext(): Context = pango_font_map_create_context(pangoFontMapPointer)!!.run {
        InstanceCache.get(this, true) { Context(reinterpret()) }!!
    }

    /**
     * Gets a font family by name.
     *
     * @param name a family name
     * @return the `PangoFontFamily`
     * @since 1.46
     */
    @PangoVersion1_46
    public open fun getFamily(name: String): FontFamily = pango_font_map_get_family(pangoFontMapPointer, name)!!.run {
        InstanceCache.get(this, true) { FontFamily.FontFamilyImpl(reinterpret()) }!!
    }

    /**
     * Returns the current serial number of @fontmap.
     *
     * The serial number is initialized to an small number larger than zero
     * when a new fontmap is created and is increased whenever the fontmap
     * is changed. It may wrap, but will never have the value 0. Since it can
     * wrap, never compare it with "less than", always use "not equals".
     *
     * The fontmap can only be changed using backend-specific API, like changing
     * fontmap resolution.
     *
     * This can be used to automatically detect changes to a `PangoFontMap`,
     * like in `PangoContext`.
     *
     * @return The current serial number of @fontmap.
     * @since 1.32.4
     */
    @PangoVersion1_32_4
    public open fun getSerial(): guint = pango_font_map_get_serial(pangoFontMapPointer)

    /**
     * Load the font in the fontmap that is the closest match for @desc.
     *
     * @param context the `PangoContext` the font will be used with
     * @param desc a `PangoFontDescription` describing the font to load
     * @return the newly allocated `PangoFont`
     *   loaded, or null if no font matched.
     */
    public open fun loadFont(context: Context, desc: FontDescription): Font? = pango_font_map_load_font(
        pangoFontMapPointer,
        context.pangoContextPointer,
        desc.pangoFontDescriptionPointer
    )?.run {
        InstanceCache.get(this, true) { Font.FontImpl(reinterpret()) }!!
    }

    /**
     * Load a set of fonts in the fontmap that can be used to render
     * a font matching @desc.
     *
     * @param context the `PangoContext` the font will be used with
     * @param desc a `PangoFontDescription` describing the font to load
     * @param language a `PangoLanguage` the fonts will be used for
     * @return the newly allocated
     *   `PangoFontset` loaded, or null if no font matched.
     */
    public open fun loadFontset(context: Context, desc: FontDescription, language: Language): Fontset? =
        pango_font_map_load_fontset(
            pangoFontMapPointer,
            context.pangoContextPointer,
            desc.pangoFontDescriptionPointer,
            language.pangoLanguagePointer
        )?.run {
            InstanceCache.get(this, true) { Fontset.FontsetImpl(reinterpret()) }!!
        }

    /**
     * Returns a new font that is like @font, except that its size
     * is multiplied by @scale, its backend-dependent configuration
     * (e.g. cairo font options) is replaced by the one in @context,
     * and its variations are replaced by @variations.
     *
     * @param font a font in @fontmap
     * @param scale the scale factor to apply
     * @param context a `PangoContext`
     * @param variations font variations to use
     * @return the modified font
     * @since 1.52
     */
    @PangoVersion1_52
    public open fun reloadFont(
        font: Font,
        scale: gdouble,
        context: Context? = null,
        variations: String? = null,
    ): Font = pango_font_map_reload_font(
        pangoFontMapPointer,
        font.pangoFontPointer,
        scale,
        context?.pangoContextPointer,
        variations
    )!!.run {
        InstanceCache.get(this, true) { Font.FontImpl(reinterpret()) }!!
    }

    /**
     * The FontMapImpl type represents a native instance of the abstract FontMap class.
     *
     * @constructor Creates a new instance of FontMap for the provided [CPointer].
     */
    public class FontMapImpl(pointer: CPointer<PangoFontMap>) : FontMap(pointer)

    public companion object : TypeCompanion<FontMap> {
        override val type: GeneratedClassKGType<FontMap> =
            GeneratedClassKGType(getTypeOrNull()!!) { FontMapImpl(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }

        /**
         * Get the GType of FontMap
         *
         * @return the GType
         */
        public fun getType(): GType = pango_font_map_get_type()

        /**
         * Gets the GType of from the symbol `pango_font_map_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("pango_font_map_get_type")
    }
}
