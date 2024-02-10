// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GDBusArgInfo
import org.gtkkn.native.gio.g_dbus_arg_info_ref
import org.gtkkn.native.gio.g_dbus_arg_info_unref
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Information about an argument for a method or a signal.
 *
 * ## Skipped during bindings generation
 *
 * - field `annotations`: Fields with arrays are not supported
 *
 * @since 2.26
 */
public class DBusArgInfo(
    pointer: CPointer<GDBusArgInfo>,
) : Record {
    public val gioDBusArgInfoPointer: CPointer<GDBusArgInfo> = pointer

    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: Int
        get() = gioDBusArgInfoPointer.pointed.ref_count
        set(`value`) {
            gioDBusArgInfoPointer.pointed.ref_count = value
        }

    /**
     * Name of the argument, e.g. @unix_user_id.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val name: String?
        get() = gioDBusArgInfoPointer.pointed.name?.toKString()

    /**
     * D-Bus signature of the argument (a single complete type).
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val signature: String?
        get() = gioDBusArgInfoPointer.pointed.signature?.toKString()

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    public fun ref(): DBusArgInfo =
        g_dbus_arg_info_ref(gioDBusArgInfoPointer.reinterpret())!!.run {
            DBusArgInfo(reinterpret())
        }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    public fun unref(): Unit = g_dbus_arg_info_unref(gioDBusArgInfoPointer.reinterpret())

    public companion object : RecordCompanion<DBusArgInfo, GDBusArgInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): DBusArgInfo =
            DBusArgInfo(pointer.reinterpret())
    }
}
