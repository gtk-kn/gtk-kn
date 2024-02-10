// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrFloat
import kotlin.Double

/**
 * The `PangoAttrFloat` structure is used to represent attributes with
 * a float or double value.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 */
public class AttrFloat(
    pointer: CPointer<PangoAttrFloat>,
) : Record {
    public val pangoAttrFloatPointer: CPointer<PangoAttrFloat> = pointer

    /**
     * the value of the attribute
     */
    public var `value`: Double
        get() = pangoAttrFloatPointer.pointed.value
        set(`value`) {
            pangoAttrFloatPointer.pointed.value = value
        }

    public companion object : RecordCompanion<AttrFloat, PangoAttrFloat> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrFloat = AttrFloat(pointer.reinterpret())
    }
}
