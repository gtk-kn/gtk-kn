// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GEnumClass
import kotlin.Int
import kotlin.UInt

/**
 * The class of an enumeration type holds information about its
 * possible values.
 *
 * ## Skipped during bindings generation
 *
 * - field `g_type_class`: TypeClass
 */
public class EnumClass(
    pointer: CPointer<GEnumClass>,
) : Record {
    public val gobjectEnumClassPointer: CPointer<GEnumClass> = pointer

    /**
     * the smallest possible value.
     */
    public var minimum: Int
        get() = gobjectEnumClassPointer.pointed.minimum
        set(`value`) {
            gobjectEnumClassPointer.pointed.minimum = value
        }

    /**
     * the largest possible value.
     */
    public var maximum: Int
        get() = gobjectEnumClassPointer.pointed.maximum
        set(`value`) {
            gobjectEnumClassPointer.pointed.maximum = value
        }

    /**
     * the number of possible values.
     */
    public var nValues: UInt
        get() = gobjectEnumClassPointer.pointed.n_values
        set(`value`) {
            gobjectEnumClassPointer.pointed.n_values = value
        }

    /**
     * an array of #GEnumValue structs describing the
     *  individual values.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val values: EnumValue?
        get() =
            gobjectEnumClassPointer.pointed.values?.run {
                EnumValue(reinterpret())
            }

    public companion object : RecordCompanion<EnumClass, GEnumClass> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): EnumClass = EnumClass(pointer.reinterpret())
    }
}
