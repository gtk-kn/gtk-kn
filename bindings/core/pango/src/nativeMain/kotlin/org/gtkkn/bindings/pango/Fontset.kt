// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.annotations.PangoVersion1_4
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoFontset
import org.gtkkn.native.pango.pango_fontset_foreach
import org.gtkkn.native.pango.pango_fontset_get_font
import org.gtkkn.native.pango.pango_fontset_get_metrics
import org.gtkkn.native.pango.pango_fontset_get_type
import kotlin.Unit

/**
 * A `PangoFontset` represents a set of `PangoFont` to use when rendering text.
 *
 * A `PangoFontset` is the result of resolving a `PangoFontDescription`
 * against a particular `PangoContext`. It has operations for finding the
 * component font for a particular Unicode character, and for finding a
 * composite set of metrics for the entire fontset.
 */
public abstract class Fontset(public val pangoFontsetPointer: CPointer<PangoFontset>) :
    Object(pangoFontsetPointer.reinterpret()),
    KGTyped {
    init {
        Pango
    }

    /**
     * Iterates through all the fonts in a fontset, calling @func for
     * each one.
     *
     * If @func returns true, that stops the iteration.
     *
     * @param func Callback function
     * @since 1.4
     */
    @PangoVersion1_4
    public open fun foreach(func: FontsetForeachFunc): Unit = pango_fontset_foreach(
        pangoFontsetPointer,
        FontsetForeachFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Returns the font in the fontset that contains the best
     * glyph for a Unicode character.
     *
     * @param wc a Unicode character
     * @return a `PangoFont`
     */
    public open fun getFont(wc: guint): Font = pango_fontset_get_font(pangoFontsetPointer, wc)!!.run {
        InstanceCache.get(this, true) { Font.FontImpl(reinterpret()) }!!
    }

    /**
     * Get overall metric information for the fonts in the fontset.
     *
     * @return a `PangoFontMetrics` object
     */
    public open fun getMetrics(): FontMetrics = pango_fontset_get_metrics(pangoFontsetPointer)!!.run {
        FontMetrics(this)
    }

    /**
     * The FontsetImpl type represents a native instance of the abstract Fontset class.
     *
     * @constructor Creates a new instance of Fontset for the provided [CPointer].
     */
    public class FontsetImpl(pointer: CPointer<PangoFontset>) : Fontset(pointer)

    public companion object : TypeCompanion<Fontset> {
        override val type: GeneratedClassKGType<Fontset> =
            GeneratedClassKGType(getTypeOrNull()!!) { FontsetImpl(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }

        /**
         * Get the GType of Fontset
         *
         * @return the GType
         */
        public fun getType(): GType = pango_fontset_get_type()

        /**
         * Gets the GType of from the symbol `pango_fontset_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("pango_fontset_get_type")
    }
}
