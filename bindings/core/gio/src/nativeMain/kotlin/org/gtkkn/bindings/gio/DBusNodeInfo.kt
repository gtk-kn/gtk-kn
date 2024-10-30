// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GDBusNodeInfo
import org.gtkkn.native.gio.g_dbus_node_info_generate_xml
import org.gtkkn.native.gio.g_dbus_node_info_lookup_interface
import org.gtkkn.native.gio.g_dbus_node_info_new_for_xml
import org.gtkkn.native.gio.g_dbus_node_info_ref
import org.gtkkn.native.gio.g_dbus_node_info_unref
import org.gtkkn.native.glib.GError
import kotlin.Int
import kotlin.Result
import kotlin.UInt
import kotlin.Unit
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * Information about nodes in a remote object hierarchy.
 *
 * ## Skipped during bindings generation
 *
 * - field `interfaces`: Fields with arrays are not supported
 * - field `nodes`: Fields with arrays are not supported
 * - field `annotations`: Fields with arrays are not supported
 *
 * @since 2.26
 */
public class DBusNodeInfo(
    pointer: CPointer<GDBusNodeInfo>,
) : Record {
    public val gioDBusNodeInfoPointer: CPointer<GDBusNodeInfo> = pointer

    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: Int
        get() = gioDBusNodeInfoPointer.pointed.ref_count
        set(`value`) {
            gioDBusNodeInfoPointer.pointed.ref_count = value
        }

    /**
     * The path of the node or null if omitted. Note that this may be a relative path. See the D-Bus specification for more details.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val path: KotlinString?
        get() = gioDBusNodeInfoPointer.pointed.path?.toKString()

    /**
     * Appends an XML representation of @info (and its children) to @string_builder.
     *
     * This function is typically used for generating introspection XML documents at run-time for
     * handling the `org.freedesktop.DBus.Introspectable.Introspect`  method.
     *
     * @param indent Indentation level.
     * @param stringBuilder A #GString to to append XML data to.
     * @since 2.26
     */
    public fun generateXml(
        indent: UInt,
        stringBuilder: GlibString,
    ): Unit =
        g_dbus_node_info_generate_xml(gioDBusNodeInfoPointer.reinterpret(), indent, stringBuilder.glibStringPointer)

    /**
     * Looks up information about an interface.
     *
     * The cost of this function is O(n) in number of interfaces.
     *
     * @param name A D-Bus interface name.
     * @return A #GDBusInterfaceInfo or null if not found. Do not free, it is owned by @info.
     * @since 2.26
     */
    public fun lookupInterface(name: KotlinString): DBusInterfaceInfo? =
        g_dbus_node_info_lookup_interface(gioDBusNodeInfoPointer.reinterpret(), name)?.run {
            DBusInterfaceInfo(reinterpret())
        }

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    public fun ref(): DBusNodeInfo =
        g_dbus_node_info_ref(gioDBusNodeInfoPointer.reinterpret())!!.run {
            DBusNodeInfo(reinterpret())
        }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    public fun unref(): Unit = g_dbus_node_info_unref(gioDBusNodeInfoPointer.reinterpret())

    public companion object : RecordCompanion<DBusNodeInfo, GDBusNodeInfo> {
        /**
         * Parses @xml_data and returns a #GDBusNodeInfo representing the data.
         *
         * The introspection XML must contain exactly one top-level
         * <node> element.
         *
         * Note that this routine is using a
         * [GMarkup][glib-Simple-XML-Subset-Parser.description]-based
         * parser that only accepts a subset of valid XML documents.
         *
         * @param xmlData Valid D-Bus introspection XML.
         * @return A #GDBusNodeInfo structure or null if @error is set. Free
         * with g_dbus_node_info_unref().
         * @since 2.26
         */
        public fun newForXml(xmlData: KotlinString): Result<DBusNodeInfo> {
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_dbus_node_info_new_for_xml(xmlData, gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(DBusNodeInfo(checkNotNull(gResult)))
                }
            }
        }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): DBusNodeInfo =
            DBusNodeInfo(pointer.reinterpret())
    }
}
