// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.pango.PangoFontset
import org.gtkkn.native.pango.pango_fontset_foreach
import org.gtkkn.native.pango.pango_fontset_get_font
import org.gtkkn.native.pango.pango_fontset_get_metrics
import org.gtkkn.native.pango.pango_fontset_get_type
import kotlin.UInt
import kotlin.Unit

/**
 * A `PangoFontset` represents a set of `PangoFont` to use when rendering text.
 *
 * A `PangoFontset` is the result of resolving a `PangoFontDescription`
 * against a particular `PangoContext`. It has operations for finding the
 * component font for a particular Unicode character, and for finding a
 * composite set of metrics for the entire fontset.
 */
public open class Fontset(
    pointer: CPointer<PangoFontset>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val pangoFontsetPointer: CPointer<PangoFontset>
        get() = gPointer.reinterpret()

    /**
     * Iterates through all the fonts in a fontset, calling @func for
     * each one.
     *
     * If @func returns true, that stops the iteration.
     *
     * @param func Callback function
     * @since 1.4
     */
    public open fun foreach(func: FontsetForeachFunc): Unit =
        pango_fontset_foreach(
            pangoFontsetPointer.reinterpret(),
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
    public open fun getFont(wc: UInt): Font =
        pango_fontset_get_font(pangoFontsetPointer.reinterpret(), wc)!!.run {
            Font(reinterpret())
        }

    /**
     * Get overall metric information for the fonts in the fontset.
     *
     * @return a `PangoFontMetrics` object
     */
    public open fun getMetrics(): FontMetrics =
        pango_fontset_get_metrics(pangoFontsetPointer.reinterpret())!!.run {
            FontMetrics(reinterpret())
        }

    public companion object : TypeCompanion<Fontset> {
        override val type: GeneratedClassKGType<Fontset> =
            GeneratedClassKGType(pango_fontset_get_type()) { Fontset(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }
    }
}
