// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GLogField
import kotlin.Long
import kotlin.String

/**
 * Structure representing a single field in a structured log entry. See
 * g_log_structured() for details.
 *
 * Log fields may contain arbitrary values, including binary with embedded nul
 * bytes. If the field contains a string, the string must be UTF-8 encoded and
 * have a trailing nul byte. Otherwise, @length must be set to a non-negative
 * value.
 *
 * ## Skipped during bindings generation
 *
 * - field `value`: gpointer
 *
 * @since 2.50
 */
public class LogField(
    pointer: CPointer<GLogField>,
) : Record {
    public val glibLogFieldPointer: CPointer<GLogField> = pointer

    /**
     * field name (UTF-8 string)
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val key: String?
        get() = glibLogFieldPointer.pointed.key?.toKString()

    /**
     * length of @value, in bytes, or -1 if it is nul-terminated
     */
    public var length: Long
        get() = glibLogFieldPointer.pointed.length
        set(`value`) {
            glibLogFieldPointer.pointed.length = value
        }

    public companion object : RecordCompanion<LogField, GLogField> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): LogField = LogField(pointer.reinterpret())
    }
}
