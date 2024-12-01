// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrString
import kotlin.String

/**
 * The `PangoAttrString` structure is used to represent attributes with
 * a string value.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 */
public class AttrString(
    pointer: CPointer<PangoAttrString>,
) : Record {
    public val pangoAttrStringPointer: CPointer<PangoAttrString> = pointer

    /**
     * the string which is the value of the attribute
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val `value`: String?
        get() = pangoAttrStringPointer.pointed.value?.toKString()

    public companion object : RecordCompanion<AttrString, PangoAttrString> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrString = AttrString(pointer.reinterpret())
    }
}
