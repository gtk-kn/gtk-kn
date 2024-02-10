// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GFlagsValue
import kotlin.String
import kotlin.UInt

/**
 * A structure which contains a single flags value, its name, and its
 * nickname.
 */
public class FlagsValue(
    pointer: CPointer<GFlagsValue>,
) : Record {
    public val gobjectFlagsValuePointer: CPointer<GFlagsValue> = pointer

    /**
     * the flags value
     */
    public var `value`: UInt
        get() = gobjectFlagsValuePointer.pointed.value
        set(`value`) {
            gobjectFlagsValuePointer.pointed.value = value
        }

    /**
     * the name of the value
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val valueName: String?
        get() = gobjectFlagsValuePointer.pointed.value_name?.toKString()

    /**
     * the nickname of the value
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val valueNick: String?
        get() = gobjectFlagsValuePointer.pointed.value_nick?.toKString()

    public companion object : RecordCompanion<FlagsValue, GFlagsValue> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): FlagsValue = FlagsValue(pointer.reinterpret())
    }
}
