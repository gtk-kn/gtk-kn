// This is a generated file. Do not modify.
package org.gtkkn.bindings.pangocairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.pangocairo.PangoCairoFont
import org.gtkkn.native.pangocairo.pango_cairo_font_get_type

/**
 * `PangoCairoFont` is an interface exported by fonts for
 * use with Cairo.
 *
 * The actual type of the font will depend on the particular
 * font technology Cairo was compiled to use.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_scaled_font`: Return type cairo.ScaledFont is unsupported
 *
 * @since 1.18
 */
public interface Font : Interface, KGTyped {
    public val pangocairoFontPointer: CPointer<PangoCairoFont>

    private data class Wrapper(
        private val pointer: CPointer<PangoCairoFont>,
    ) : Font {
        override val pangocairoFontPointer: CPointer<PangoCairoFont> = pointer
    }

    public companion object : TypeCompanion<Font> {
        override val type: GeneratedInterfaceKGType<Font> =
            GeneratedInterfaceKGType(pango_cairo_font_get_type()) { Wrapper(it.reinterpret()) }

        init {
            PangocairoTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<PangoCairoFont>): Font = Wrapper(pointer)
    }
}
