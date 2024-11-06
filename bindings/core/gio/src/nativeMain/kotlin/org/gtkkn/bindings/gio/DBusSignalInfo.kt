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
import org.gtkkn.native.gio.GDBusSignalInfo
import org.gtkkn.native.gio.g_dbus_signal_info_ref
import org.gtkkn.native.gio.g_dbus_signal_info_unref
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Information about a signal on a D-Bus interface.
 *
 * ## Skipped during bindings generation
 *
 * - field `args`: Fields with arrays are not supported
 * - field `annotations`: Fields with arrays are not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusSignalInfo(
    pointer: CPointer<GDBusSignalInfo>,
) : Record {
    public val gioDBusSignalInfoPointer: CPointer<GDBusSignalInfo> = pointer

    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: Int
        get() = gioDBusSignalInfoPointer.pointed.ref_count
        set(`value`) {
            gioDBusSignalInfoPointer.pointed.ref_count = value
        }

    /**
     * The name of the D-Bus signal, e.g. "NameOwnerChanged".
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val name: String?
        get() = gioDBusSignalInfoPointer.pointed.name?.toKString()

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun ref(): DBusSignalInfo =
        g_dbus_signal_info_ref(gioDBusSignalInfoPointer.reinterpret())!!.run {
            DBusSignalInfo(reinterpret())
        }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public fun unref(): Unit = g_dbus_signal_info_unref(gioDBusSignalInfoPointer.reinterpret())

    public companion object : RecordCompanion<DBusSignalInfo, GDBusSignalInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): DBusSignalInfo =
            DBusSignalInfo(pointer.reinterpret())
    }
}
