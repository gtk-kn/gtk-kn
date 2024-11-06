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
import org.gtkkn.native.gio.GDBusMethodInfo
import org.gtkkn.native.gio.g_dbus_method_info_ref
import org.gtkkn.native.gio.g_dbus_method_info_unref
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Information about a method on an D-Bus interface.
 *
 * ## Skipped during bindings generation
 *
 * - field `in_args`: Fields with arrays are not supported
 * - field `out_args`: Fields with arrays are not supported
 * - field `annotations`: Fields with arrays are not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusMethodInfo(
    pointer: CPointer<GDBusMethodInfo>,
) : Record {
    public val gioDBusMethodInfoPointer: CPointer<GDBusMethodInfo> = pointer

    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: Int
        get() = gioDBusMethodInfoPointer.pointed.ref_count
        set(`value`) {
            gioDBusMethodInfoPointer.pointed.ref_count = value
        }

    /**
     * The name of the D-Bus method, e.g. @RequestName.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val name: String?
        get() = gioDBusMethodInfoPointer.pointed.name?.toKString()

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun ref(): DBusMethodInfo =
        g_dbus_method_info_ref(gioDBusMethodInfoPointer.reinterpret())!!.run {
            DBusMethodInfo(reinterpret())
        }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public fun unref(): Unit = g_dbus_method_info_unref(gioDBusMethodInfoPointer.reinterpret())

    public companion object : RecordCompanion<DBusMethodInfo, GDBusMethodInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): DBusMethodInfo =
            DBusMethodInfo(pointer.reinterpret())
    }
}
