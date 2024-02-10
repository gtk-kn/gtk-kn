// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GEnumValue
import kotlin.Int
import kotlin.String

/**
 * A structure which contains a single enum value, its name, and its
 * nickname.
 */
public class EnumValue(
    pointer: CPointer<GEnumValue>,
) : Record {
    public val gobjectEnumValuePointer: CPointer<GEnumValue> = pointer

    /**
     * the enum value
     */
    public var `value`: Int
        get() = gobjectEnumValuePointer.pointed.value
        set(`value`) {
            gobjectEnumValuePointer.pointed.value = value
        }

    /**
     * the name of the value
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val valueName: String?
        get() = gobjectEnumValuePointer.pointed.value_name?.toKString()

    /**
     * the nickname of the value
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val valueNick: String?
        get() = gobjectEnumValuePointer.pointed.value_nick?.toKString()

    public companion object : RecordCompanion<EnumValue, GEnumValue> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): EnumValue = EnumValue(pointer.reinterpret())
    }
}
