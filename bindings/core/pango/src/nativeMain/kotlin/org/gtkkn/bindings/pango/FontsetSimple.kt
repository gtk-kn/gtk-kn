// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoFontsetSimple
import org.gtkkn.native.pango.pango_fontset_simple_append
import org.gtkkn.native.pango.pango_fontset_simple_get_type
import org.gtkkn.native.pango.pango_fontset_simple_new
import org.gtkkn.native.pango.pango_fontset_simple_size
import kotlin.Unit

/**
 * `PangoFontsetSimple` is a implementation of the abstract
 * `PangoFontset` base class as an array of fonts.
 *
 * When creating a `PangoFontsetSimple`, you have to provide
 * the array of fonts that make up the fontset.
 */
public open class FontsetSimple(public val pangoFontsetSimplePointer: CPointer<PangoFontsetSimple>) :
    Fontset(pangoFontsetSimplePointer.reinterpret()),
    KGTyped {
    init {
        Pango
    }

    /**
     * Creates a new `PangoFontsetSimple` for the given language.
     *
     * @param language a `PangoLanguage` tag
     * @return the newly allocated `PangoFontsetSimple`
     */
    public constructor(language: Language) : this(pango_fontset_simple_new(language.pangoLanguagePointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * Adds a font to the fontset.
     *
     * The fontset takes ownership of @font.
     *
     * @param font a `PangoFont`.
     */
    public open fun append(font: Font): Unit =
        pango_fontset_simple_append(pangoFontsetSimplePointer, font.pangoFontPointer)

    /**
     * Returns the number of fonts in the fontset.
     *
     * @return the size of @fontset
     */
    public open fun size(): gint = pango_fontset_simple_size(pangoFontsetSimplePointer)

    public companion object : TypeCompanion<FontsetSimple> {
        override val type: GeneratedClassKGType<FontsetSimple> =
            GeneratedClassKGType(getTypeOrNull()!!) { FontsetSimple(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }

        /**
         * Get the GType of FontsetSimple
         *
         * @return the GType
         */
        public fun getType(): GType = pango_fontset_simple_get_type()

        /**
         * Gets the GType of from the symbol `pango_fontset_simple_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("pango_fontset_simple_get_type")
    }
}
