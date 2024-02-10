// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GFlagsClass
import kotlin.UInt

/**
 * The class of a flags type holds information about its
 * possible values.
 *
 * ## Skipped during bindings generation
 *
 * - field `g_type_class`: TypeClass
 */
public class FlagsClass(
    pointer: CPointer<GFlagsClass>,
) : Record {
    public val gobjectFlagsClassPointer: CPointer<GFlagsClass> = pointer

    /**
     * a mask covering all possible values.
     */
    public var mask: UInt
        get() = gobjectFlagsClassPointer.pointed.mask
        set(`value`) {
            gobjectFlagsClassPointer.pointed.mask = value
        }

    /**
     * the number of possible values.
     */
    public var nValues: UInt
        get() = gobjectFlagsClassPointer.pointed.n_values
        set(`value`) {
            gobjectFlagsClassPointer.pointed.n_values = value
        }

    /**
     * an array of #GFlagsValue structs describing the
     *  individual values.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val values: FlagsValue?
        get() =
            gobjectFlagsClassPointer.pointed.values?.run {
                FlagsValue(reinterpret())
            }

    public companion object : RecordCompanion<FlagsClass, GFlagsClass> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): FlagsClass = FlagsClass(pointer.reinterpret())
    }
}
