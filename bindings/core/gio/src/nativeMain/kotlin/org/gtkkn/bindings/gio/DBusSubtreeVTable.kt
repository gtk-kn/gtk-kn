// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GDBusSubtreeVTable

/**
 * Virtual table for handling subtrees registered with g_dbus_connection_register_subtree().
 *
 * ## Skipped during bindings generation
 *
 * - field `enumerate`: DBusSubtreeEnumerateFunc
 * - field `introspect`: DBusSubtreeIntrospectFunc
 * - field `dispatch`: DBusSubtreeDispatchFunc
 * - field `padding`: Record field padding is private
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusSubtreeVTable(
    pointer: CPointer<GDBusSubtreeVTable>,
) : Record {
    public val gioDBusSubtreeVTablePointer: CPointer<GDBusSubtreeVTable> = pointer

    public companion object : RecordCompanion<DBusSubtreeVTable, GDBusSubtreeVTable> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): DBusSubtreeVTable =
            DBusSubtreeVTable(pointer.reinterpret())
    }
}
