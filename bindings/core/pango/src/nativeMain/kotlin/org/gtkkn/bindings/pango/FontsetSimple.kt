// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.pango.PangoFontsetSimple
import org.gtkkn.native.pango.pango_fontset_simple_append
import org.gtkkn.native.pango.pango_fontset_simple_get_type
import org.gtkkn.native.pango.pango_fontset_simple_new
import org.gtkkn.native.pango.pango_fontset_simple_size
import kotlin.Int
import kotlin.Unit

/**
 * `PangoFontsetSimple` is a implementation of the abstract
 * `PangoFontset` base class as an array of fonts.
 *
 * When creating a `PangoFontsetSimple`, you have to provide
 * the array of fonts that make up the fontset.
 */
public open class FontsetSimple(
    pointer: CPointer<PangoFontsetSimple>,
) : Fontset(pointer.reinterpret()), KGTyped {
    public val pangoFontsetSimplePointer: CPointer<PangoFontsetSimple>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `PangoFontsetSimple` for the given language.
     *
     * @param language a `PangoLanguage` tag
     * @return the newly allocated `PangoFontsetSimple`
     */
    public constructor(language: Language) :
        this(pango_fontset_simple_new(language.pangoLanguagePointer)!!.reinterpret())

    /**
     * Adds a font to the fontset.
     *
     * The fontset takes ownership of @font.
     *
     * @param font a `PangoFont`.
     */
    public open fun append(font: Font): Unit =
        pango_fontset_simple_append(
            pangoFontsetSimplePointer.reinterpret(),
            font.pangoFontPointer.reinterpret()
        )

    /**
     * Returns the number of fonts in the fontset.
     *
     * @return the size of @fontset
     */
    public open fun size(): Int = pango_fontset_simple_size(pangoFontsetSimplePointer.reinterpret())

    public companion object : TypeCompanion<FontsetSimple> {
        override val type: GeneratedClassKGType<FontsetSimple> =
            GeneratedClassKGType(pango_fontset_simple_get_type()) {
                FontsetSimple(it.reinterpret())
            }

        init {
            PangoTypeProvider.register()
        }
    }
}
