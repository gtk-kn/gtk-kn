// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pangocairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.ScaledFont
import org.gtkkn.bindings.pangocairo.annotations.PangoCairoVersion1_18
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
    public class FontImpl(pangocairoFontPointer: CPointer<PangoCairoFont>) :
        org.gtkkn.bindings.pango.Font(pangocairoFontPointer.reinterpret()),
        Font {
        init {
            PangoCairo
        }

        override val pangocairoFontPointer: CPointer<PangoCairoFont> = pangocairoFontPointer
    }

    public companion object : TypeCompanion<Font> {
        override val type: GeneratedInterfaceKGType<Font> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { FontImpl(it.reinterpret()) }

        init {
            PangoCairoTypeProvider.register()
        }

        /**
         * Get the GType of Font
         *
         * @return the GType
         */
        public fun getType(): GType = pango_cairo_font_get_type()

        /**
         * Gets the GType of from the symbol `pango_cairo_font_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("pango_cairo_font_get_type")
    }
}
