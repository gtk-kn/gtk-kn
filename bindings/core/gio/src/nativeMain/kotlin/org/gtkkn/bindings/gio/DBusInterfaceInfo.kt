// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GDBusInterfaceInfo
import org.gtkkn.native.gio.g_dbus_interface_info_cache_build
import org.gtkkn.native.gio.g_dbus_interface_info_cache_release
import org.gtkkn.native.gio.g_dbus_interface_info_generate_xml
import org.gtkkn.native.gio.g_dbus_interface_info_lookup_method
import org.gtkkn.native.gio.g_dbus_interface_info_lookup_property
import org.gtkkn.native.gio.g_dbus_interface_info_lookup_signal
import org.gtkkn.native.gio.g_dbus_interface_info_ref
import org.gtkkn.native.gio.g_dbus_interface_info_unref
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * Information about a D-Bus interface.
 *
 * ## Skipped during bindings generation
 *
 * - field `methods`: Fields with arrays are not supported
 * - field `signals`: Fields with arrays are not supported
 * - field `properties`: Fields with arrays are not supported
 * - field `annotations`: Fields with arrays are not supported
 *
 * @since 2.26
 */
public class DBusInterfaceInfo(
    pointer: CPointer<GDBusInterfaceInfo>,
) : Record {
    public val gioDBusInterfaceInfoPointer: CPointer<GDBusInterfaceInfo> = pointer

    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: Int
        get() = gioDBusInterfaceInfoPointer.pointed.ref_count
        set(`value`) {
            gioDBusInterfaceInfoPointer.pointed.ref_count = value
        }

    /**
     * The name of the D-Bus interface, e.g. "org.freedesktop.DBus.Properties".
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val name: KotlinString?
        get() = gioDBusInterfaceInfoPointer.pointed.name?.toKString()

    /**
     * Builds a lookup-cache to speed up
     * g_dbus_interface_info_lookup_method(),
     * g_dbus_interface_info_lookup_signal() and
     * g_dbus_interface_info_lookup_property().
     *
     * If this has already been called with @info, the existing cache is
     * used and its use count is increased.
     *
     * Note that @info cannot be modified until
     * g_dbus_interface_info_cache_release() is called.
     *
     * @since 2.30
     */
    public fun cacheBuild(): Unit = g_dbus_interface_info_cache_build(gioDBusInterfaceInfoPointer.reinterpret())

    /**
     * Decrements the usage count for the cache for @info built by
     * g_dbus_interface_info_cache_build() (if any) and frees the
     * resources used by the cache if the usage count drops to zero.
     *
     * @since 2.30
     */
    public fun cacheRelease(): Unit = g_dbus_interface_info_cache_release(gioDBusInterfaceInfoPointer.reinterpret())

    /**
     * Appends an XML representation of @info (and its children) to @string_builder.
     *
     * This function is typically used for generating introspection XML
     * documents at run-time for handling the
     * `org.freedesktop.DBus.Introspectable.Introspect`
     * method.
     *
     * @param indent Indentation level.
     * @param stringBuilder A #GString to to append XML data to.
     * @since 2.26
     */
    public fun generateXml(
        indent: UInt,
        stringBuilder: GlibString,
    ): Unit =
        g_dbus_interface_info_generate_xml(
            gioDBusInterfaceInfoPointer.reinterpret(),
            indent,
            stringBuilder.glibStringPointer
        )

    /**
     * Looks up information about a method.
     *
     * The cost of this function is O(n) in number of methods unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     *
     * @param name A D-Bus method name (typically in CamelCase)
     * @return A #GDBusMethodInfo or null if not found. Do not free, it is owned by @info.
     * @since 2.26
     */
    public fun lookupMethod(name: KotlinString): DBusMethodInfo? =
        g_dbus_interface_info_lookup_method(gioDBusInterfaceInfoPointer.reinterpret(), name)?.run {
            DBusMethodInfo(reinterpret())
        }

    /**
     * Looks up information about a property.
     *
     * The cost of this function is O(n) in number of properties unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     *
     * @param name A D-Bus property name (typically in CamelCase).
     * @return A #GDBusPropertyInfo or null if not found. Do not free, it is owned by @info.
     * @since 2.26
     */
    public fun lookupProperty(name: KotlinString): DBusPropertyInfo? =
        g_dbus_interface_info_lookup_property(gioDBusInterfaceInfoPointer.reinterpret(), name)?.run {
            DBusPropertyInfo(reinterpret())
        }

    /**
     * Looks up information about a signal.
     *
     * The cost of this function is O(n) in number of signals unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     *
     * @param name A D-Bus signal name (typically in CamelCase)
     * @return A #GDBusSignalInfo or null if not found. Do not free, it is owned by @info.
     * @since 2.26
     */
    public fun lookupSignal(name: KotlinString): DBusSignalInfo? =
        g_dbus_interface_info_lookup_signal(gioDBusInterfaceInfoPointer.reinterpret(), name)?.run {
            DBusSignalInfo(reinterpret())
        }

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    public fun ref(): DBusInterfaceInfo =
        g_dbus_interface_info_ref(gioDBusInterfaceInfoPointer.reinterpret())!!.run {
            DBusInterfaceInfo(reinterpret())
        }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    public fun unref(): Unit = g_dbus_interface_info_unref(gioDBusInterfaceInfoPointer.reinterpret())

    public companion object : RecordCompanion<DBusInterfaceInfo, GDBusInterfaceInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): DBusInterfaceInfo =
            DBusInterfaceInfo(pointer.reinterpret())
    }
}
