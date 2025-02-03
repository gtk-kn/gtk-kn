// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import kotlinx.cinterop.`value`
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GDBusNodeInfo
import org.gtkkn.native.gio.g_dbus_node_info_generate_xml
import org.gtkkn.native.gio.g_dbus_node_info_get_type
import org.gtkkn.native.gio.g_dbus_node_info_lookup_interface
import org.gtkkn.native.gio.g_dbus_node_info_new_for_xml
import org.gtkkn.native.gio.g_dbus_node_info_ref
import org.gtkkn.native.gio.g_dbus_node_info_unref
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Throws
import kotlin.Unit
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * Information about nodes in a remote object hierarchy.
 *
 * ## Skipped during bindings generation
 *
 * - field `interfaces`: Array parameter of type DBusInterfaceInfo is not supported
 * - field `nodes`: Array parameter of type DBusNodeInfo is not supported
 * - field `annotations`: Array parameter of type DBusAnnotationInfo is not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusNodeInfo(public val gioDBusNodeInfoPointer: CPointer<GDBusNodeInfo>) :
    ProxyInstance(gioDBusNodeInfoPointer) {
    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: gint
        get() = gioDBusNodeInfoPointer.pointed.ref_count

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusNodeInfoPointer.pointed.ref_count = value
        }

    /**
     * The path of the node or null if omitted. Note that this may be a relative path. See the D-Bus specification for more details.
     */
    public var path: KotlinString?
        get() = gioDBusNodeInfoPointer.pointed.path?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusNodeInfoPointer.pointed.path?.let { g_free(it) }
            gioDBusNodeInfoPointer.pointed.path = value?.let { g_strdup(it) }
        }

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
    @Throws(GLibException::class)
    public constructor(xmlData: KotlinString) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = g_dbus_node_info_new_for_xml(xmlData, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!
        }
    ) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Allocate a new DBusNodeInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GDBusNodeInfo>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new DBusNodeInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDBusNodeInfo>().ptr)

    /**
     * Allocate a new DBusNodeInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param path The path of the node or null if omitted. Note that this may be a relative path. See the D-Bus specification for more details.
     */
    public constructor(refCount: gint, path: KotlinString?) : this() {
        this.refCount = refCount
        this.path = path
    }

    /**
     * Allocate a new DBusNodeInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param path The path of the node or null if omitted. Note that this may be a relative path. See the D-Bus specification for more details.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        refCount: gint,
        path: KotlinString?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.refCount = refCount
        this.path = path
    }

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
    @GioVersion2_26
    public fun generateXml(indent: guint, stringBuilder: GlibString): Unit =
        g_dbus_node_info_generate_xml(gioDBusNodeInfoPointer, indent, stringBuilder.glibStringPointer)

    /**
     * Looks up information about an interface.
     *
     * The cost of this function is O(n) in number of interfaces.
     *
     * @param name A D-Bus interface name.
     * @return A #GDBusInterfaceInfo or null if not found. Do not free, it is owned by @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun lookupInterface(name: KotlinString): DBusInterfaceInfo? =
        g_dbus_node_info_lookup_interface(gioDBusNodeInfoPointer, name)?.run {
            DBusInterfaceInfo(this)
        }

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun ref(): DBusNodeInfo = g_dbus_node_info_ref(gioDBusNodeInfoPointer)!!.run {
        DBusNodeInfo(this)
    }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public fun unref(): Unit = g_dbus_node_info_unref(gioDBusNodeInfoPointer)

    override fun toString(): KotlinString = "DBusNodeInfo(refCount=$refCount, path=$path)"

    public companion object {
        /**
         * Get the GType of DBusNodeInfo
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_node_info_get_type()
    }
}
