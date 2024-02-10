// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrLanguage
import org.gtkkn.native.pango.pango_attr_language_new

/**
 * The `PangoAttrLanguage` structure is used to represent attributes that
 * are languages.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 */
public class AttrLanguage(
    pointer: CPointer<PangoAttrLanguage>,
) : Record {
    public val pangoAttrLanguagePointer: CPointer<PangoAttrLanguage> = pointer

    /**
     * the `PangoLanguage` which is the value of the attribute
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val `value`: Language?
        get() =
            pangoAttrLanguagePointer.pointed.value?.run {
                Language(reinterpret())
            }

    public companion object : RecordCompanion<AttrLanguage, PangoAttrLanguage> {
        /**
         * Create a new language tag attribute.
         *
         * @param language language tag
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         */
        public fun new(language: Language): Attribute =
            pango_attr_language_new(language.pangoLanguagePointer)!!.run {
                Attribute(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrLanguage =
            AttrLanguage(pointer.reinterpret())
    }
}
