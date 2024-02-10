// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrString

/**
 * The `PangoAttrString` structure is used to represent attributes with
 * a string value.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 * - field `value`: Unsupported string type with cType: char*
 */
public class AttrString(
    pointer: CPointer<PangoAttrString>,
) : Record {
    public val pangoAttrStringPointer: CPointer<PangoAttrString> = pointer

    public companion object : RecordCompanion<AttrString, PangoAttrString> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrString = AttrString(pointer.reinterpret())
    }
}
