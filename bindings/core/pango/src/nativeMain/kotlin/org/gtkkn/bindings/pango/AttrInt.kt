// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrInt
import kotlin.Int

/**
 * The `PangoAttrInt` structure is used to represent attributes with
 * an integer or enumeration value.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 */
public class AttrInt(
    pointer: CPointer<PangoAttrInt>,
) : Record {
    public val pangoAttrIntPointer: CPointer<PangoAttrInt> = pointer

    /**
     * the value of the attribute
     */
    public var `value`: Int
        get() = pangoAttrIntPointer.pointed.value
        set(`value`) {
            pangoAttrIntPointer.pointed.value = value
        }

    public companion object : RecordCompanion<AttrInt, PangoAttrInt> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrInt = AttrInt(pointer.reinterpret())
    }
}
