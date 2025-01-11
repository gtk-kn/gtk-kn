// This is a generated file. Do not modify.
package org.gtkkn.bindings.pangocairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.ScaledFont
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_18
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pangocairo.PangoCairoFont
import org.gtkkn.native.pangocairo.pango_cairo_font_get_scaled_font
import org.gtkkn.native.pangocairo.pango_cairo_font_get_type

/**
 * `PangoCairoFont` is an interface exported by fonts for
 * use with Cairo.
 *
 * The actual type of the font will depend on the particular
 * font technology Cairo was compiled to use.
 * @since 1.18
 */
@PangoCairoVersion1_18
public interface Font :
    Proxy,
    KGTyped {
    public val pangocairoFontPointer: CPointer<PangoCairoFont>

    /**
     * Gets the `cairo_scaled_font_t` used by @font.
     * The scaled font can be referenced and kept using
     * cairo_scaled_font_reference().
     *
     * @return the `cairo_scaled_font_t`
     *   used by @font
     * @since 1.18
     */
    @PangoCairoVersion1_18
    public fun getScaledFont(): ScaledFont? = pango_cairo_font_get_scaled_font(pangocairoFontPointer)?.run {
        ScaledFont(this)
    }

    /**
     * The FontImpl type represents a native instance of the Font interface.
     *
     * @constructor Creates a new instance of Font for the provided [CPointer].
     */
    public data class FontImpl(override val pangocairoFontPointer: CPointer<PangoCairoFont>) :
        org.gtkkn.bindings.pango.Font(pangocairoFontPointer.reinterpret()),
        Font

    public companion object : TypeCompanion<Font> {
        override val type: GeneratedInterfaceKGType<Font> =
            GeneratedInterfaceKGType(pango_cairo_font_get_type()) { FontImpl(it.reinterpret()) }

        init {
            PangocairoTypeProvider.register()
        }

        /**
         * Get the GType of Font
         *
         * @return the GType
         */
        public fun getType(): GType = pango_cairo_font_get_type()
    }
}
