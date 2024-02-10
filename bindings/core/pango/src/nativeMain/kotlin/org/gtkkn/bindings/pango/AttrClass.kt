// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrClass

/**
 * The `PangoAttrClass` structure stores the type and operations for
 * a particular type of attribute.
 *
 * The functions in this structure should not be called directly. Instead,
 * one should use the wrapper functions provided for `PangoAttribute`.
 *
 * ## Skipped during bindings generation
 *
 * - field `copy`: Fields with callbacks are not supported
 * - field `destroy`: Fields with callbacks are not supported
 * - field `equal`: Fields with callbacks are not supported
 */
public class AttrClass(
    pointer: CPointer<PangoAttrClass>,
) : Record {
    public val pangoAttrClassPointer: CPointer<PangoAttrClass> = pointer

    /**
     * the type ID for this attribute
     */
    public var type: AttrType
        get() =
            pangoAttrClassPointer.pointed.type.run {
                AttrType.fromNativeValue(this)
            }
        set(`value`) {
            pangoAttrClassPointer.pointed.type = value.nativeValue
        }

    public companion object : RecordCompanion<AttrClass, PangoAttrClass> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrClass = AttrClass(pointer.reinterpret())
    }
}
