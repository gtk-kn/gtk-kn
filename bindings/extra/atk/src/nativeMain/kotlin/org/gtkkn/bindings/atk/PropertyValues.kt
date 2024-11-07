// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.atk.AtkPropertyValues
import kotlin.String

/**
 * Note: @old_value field of #AtkPropertyValues will not contain a
 * valid value. This is a field defined with the purpose of contain
 * the previous value of the property, but is not used anymore.
 *
 * ## Skipped during bindings generation
 *
 * - field `old_value`: GObject.Value
 * - field `new_value`: GObject.Value
 */
public class PropertyValues(
    pointer: CPointer<AtkPropertyValues>,
) : Record {
    public val atkPropertyValuesPointer: CPointer<AtkPropertyValues> = pointer

    /**
     * The name of the ATK property which has changed.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val propertyName: String?
        get() = atkPropertyValuesPointer.pointed.property_name?.toKString()

    public companion object : RecordCompanion<PropertyValues, AtkPropertyValues> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PropertyValues =
            PropertyValues(pointer.reinterpret())
    }
}
