// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrFontDesc
import org.gtkkn.native.pango.pango_attr_font_desc_new

/**
 * The `PangoAttrFontDesc` structure is used to store an attribute that
 * sets all aspects of the font description at once.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 */
public class AttrFontDesc(
    pointer: CPointer<PangoAttrFontDesc>,
) : Record {
    public val pangoAttrFontDescPointer: CPointer<PangoAttrFontDesc> = pointer

    /**
     * the font description which is the value of this attribute
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val desc: FontDescription?
        get() =
            pangoAttrFontDescPointer.pointed.desc?.run {
                FontDescription(reinterpret())
            }

    public companion object : RecordCompanion<AttrFontDesc, PangoAttrFontDesc> {
        /**
         * Create a new font description attribute.
         *
         * This attribute allows setting family, style, weight, variant,
         * stretch, and size simultaneously.
         *
         * @param desc the font description
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         */
        public fun new(desc: FontDescription): Attribute =
            pango_attr_font_desc_new(desc.pangoFontDescriptionPointer.reinterpret())!!.run {
                Attribute(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrFontDesc =
            AttrFontDesc(pointer.reinterpret())
    }
}
