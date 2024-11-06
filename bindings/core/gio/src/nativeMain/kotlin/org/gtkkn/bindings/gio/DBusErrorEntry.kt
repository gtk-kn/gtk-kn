// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GDBusErrorEntry
import kotlin.Int
import kotlin.String

/**
 * Struct used in g_dbus_error_register_error_domain().
 * @since 2.26
 */
@GioVersion2_26
public class DBusErrorEntry(
    pointer: CPointer<GDBusErrorEntry>,
) : Record {
    public val gioDBusErrorEntryPointer: CPointer<GDBusErrorEntry> = pointer

    /**
     * An error code.
     */
    public var errorCode: Int
        get() = gioDBusErrorEntryPointer.pointed.error_code
        set(`value`) {
            gioDBusErrorEntryPointer.pointed.error_code = value
        }

    /**
     * The D-Bus error name to associate with @error_code.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val dbusErrorName: String?
        get() = gioDBusErrorEntryPointer.pointed.dbus_error_name?.toKString()

    public companion object : RecordCompanion<DBusErrorEntry, GDBusErrorEntry> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): DBusErrorEntry =
            DBusErrorEntry(pointer.reinterpret())
    }
}
