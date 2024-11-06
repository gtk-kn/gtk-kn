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
import org.gtkkn.native.gio.GDBusPropertyInfo
import org.gtkkn.native.gio.g_dbus_property_info_ref
import org.gtkkn.native.gio.g_dbus_property_info_unref
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Information about a D-Bus property on a D-Bus interface.
 *
 * ## Skipped during bindings generation
 *
 * - field `annotations`: Fields with arrays are not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusPropertyInfo(
    pointer: CPointer<GDBusPropertyInfo>,
) : Record {
    public val gioDBusPropertyInfoPointer: CPointer<GDBusPropertyInfo> = pointer

    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: Int
        get() = gioDBusPropertyInfoPointer.pointed.ref_count
        set(`value`) {
            gioDBusPropertyInfoPointer.pointed.ref_count = value
        }

    /**
     * The name of the D-Bus property, e.g. "SupportedFilesystems".
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val name: String?
        get() = gioDBusPropertyInfoPointer.pointed.name?.toKString()

    /**
     * The D-Bus signature of the property (a single complete type).
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val signature: String?
        get() = gioDBusPropertyInfoPointer.pointed.signature?.toKString()

    /**
     * Access control flags for the property.
     */
    public var flags: DBusPropertyInfoFlags
        get() =
            gioDBusPropertyInfoPointer.pointed.flags.run {
                DBusPropertyInfoFlags(this)
            }
        set(`value`) {
            gioDBusPropertyInfoPointer.pointed.flags = value.mask
        }

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun ref(): DBusPropertyInfo =
        g_dbus_property_info_ref(gioDBusPropertyInfoPointer.reinterpret())!!.run {
            DBusPropertyInfo(reinterpret())
        }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public fun unref(): Unit = g_dbus_property_info_unref(gioDBusPropertyInfoPointer.reinterpret())

    public companion object : RecordCompanion<DBusPropertyInfo, GDBusPropertyInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): DBusPropertyInfo =
            DBusPropertyInfo(pointer.reinterpret())
    }
}
