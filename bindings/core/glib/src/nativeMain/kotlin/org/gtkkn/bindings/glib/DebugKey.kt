// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GDebugKey
import kotlin.String
import kotlin.UInt

/**
 * Associates a string with a bit flag.
 * Used in g_parse_debug_string().
 */
public class DebugKey(
    pointer: CPointer<GDebugKey>,
) : Record {
    public val glibDebugKeyPointer: CPointer<GDebugKey> = pointer

    /**
     * the string
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val key: String?
        get() = glibDebugKeyPointer.pointed.key?.toKString()

    /**
     * the flag
     */
    public var `value`: UInt
        get() = glibDebugKeyPointer.pointed.value
        set(`value`) {
            glibDebugKeyPointer.pointed.value = value
        }

    public companion object : RecordCompanion<DebugKey, GDebugKey> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): DebugKey = DebugKey(pointer.reinterpret())
    }
}
