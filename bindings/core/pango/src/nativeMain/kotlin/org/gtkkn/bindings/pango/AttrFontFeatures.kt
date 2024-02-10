// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrFontFeatures
import org.gtkkn.native.pango.pango_attr_font_features_new
import kotlin.String

/**
 * The `PangoAttrFontFeatures` structure is used to represent OpenType
 * font features as an attribute.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 *
 * @since 1.38
 */
public class AttrFontFeatures(
    pointer: CPointer<PangoAttrFontFeatures>,
) : Record {
    public val pangoAttrFontFeaturesPointer: CPointer<PangoAttrFontFeatures> = pointer

    /**
     * the features, as a string in CSS syntax
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val features: String?
        get() = pangoAttrFontFeaturesPointer.pointed.features?.toKString()

    public companion object : RecordCompanion<AttrFontFeatures, PangoAttrFontFeatures> {
        /**
         * Create a new font features tag attribute.
         *
         * You can use this attribute to select OpenType font features like small-caps,
         * alternative glyphs, ligatures, etc. for fonts that support them.
         *
         * @param features a string with OpenType font features, with the syntax of the [CSS
         * font-feature-settings property](https://www.w3.org/TR/css-fonts-4/#font-rend-desc)
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         * @since 1.38
         */
        public fun new(features: String): Attribute =
            pango_attr_font_features_new(features)!!.run {
                Attribute(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrFontFeatures =
            AttrFontFeatures(pointer.reinterpret())
    }
}
