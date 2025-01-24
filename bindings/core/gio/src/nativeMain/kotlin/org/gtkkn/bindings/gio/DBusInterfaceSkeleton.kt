// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusInterface
import org.gtkkn.native.gio.GDBusInterfaceSkeleton
import org.gtkkn.native.gio.GDBusMethodInvocation
import org.gtkkn.native.gio.g_dbus_interface_skeleton_export
import org.gtkkn.native.gio.g_dbus_interface_skeleton_flush
import org.gtkkn.native.gio.g_dbus_interface_skeleton_get_connection
import org.gtkkn.native.gio.g_dbus_interface_skeleton_get_connections
import org.gtkkn.native.gio.g_dbus_interface_skeleton_get_flags
import org.gtkkn.native.gio.g_dbus_interface_skeleton_get_info
import org.gtkkn.native.gio.g_dbus_interface_skeleton_get_object_path
import org.gtkkn.native.gio.g_dbus_interface_skeleton_get_properties
import org.gtkkn.native.gio.g_dbus_interface_skeleton_get_type
import org.gtkkn.native.gio.g_dbus_interface_skeleton_get_vtable
import org.gtkkn.native.gio.g_dbus_interface_skeleton_has_connection
import org.gtkkn.native.gio.g_dbus_interface_skeleton_set_flags
import org.gtkkn.native.gio.g_dbus_interface_skeleton_unexport
import org.gtkkn.native.gio.g_dbus_interface_skeleton_unexport_from_connection
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Abstract base class for D-Bus interfaces on the service side.
 *
 * ## Skipped during bindings generation
 *
 * - method `g-flags`: Property has no getter nor setter
 *
 * @since 2.30
 */
@GioVersion2_30
public abstract class DBusInterfaceSkeleton(
    public val gioDBusInterfaceSkeletonPointer: CPointer<GDBusInterfaceSkeleton>,
) : Object(gioDBusInterfaceSkeletonPointer.reinterpret()),
    DBusInterface,
    KGTyped {
    override val gioDBusInterfacePointer: CPointer<GDBusInterface>
        get() = handle.reinterpret()

    /**
     * Exports @interface_ at @object_path on @connection.
     *
     * This can be called multiple times to export the same @interface_
     * onto multiple connections however the @object_path provided must be
     * the same for all connections.
     *
     * Use g_dbus_interface_skeleton_unexport() to unexport the object.
     *
     * @param connection A #GDBusConnection to export @interface_ on.
     * @param objectPath The path to export the interface at.
     * @return true if the interface was exported on @connection, otherwise false with
     * @error set.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun export(connection: DBusConnection, objectPath: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_interface_skeleton_export(
            gioDBusInterfaceSkeletonPointer,
            connection.gioDBusConnectionPointer,
            objectPath,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * If @interface_ has outstanding changes, request for these changes to be
     * emitted immediately.
     *
     * For example, an exported D-Bus interface may queue up property
     * changes and emit the
     * `org.freedesktop.DBus.Properties.PropertiesChanged`
     * signal later (e.g. in an idle handler). This technique is useful
     * for collapsing multiple property changes into one.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public open fun flush(): Unit = g_dbus_interface_skeleton_flush(gioDBusInterfaceSkeletonPointer)

    /**
     * Gets the first connection that @interface_ is exported on, if any.
     *
     * @return A #GDBusConnection or null if @interface_ is
     * not exported anywhere. Do not free, the object belongs to @interface_.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun getConnection(): DBusConnection? =
        g_dbus_interface_skeleton_get_connection(gioDBusInterfaceSkeletonPointer)?.run {
            DBusConnection(this)
        }

    /**
     * Gets a list of the connections that @interface_ is exported on.
     *
     * @return A list of
     *   all the connections that @interface_ is exported on. The returned
     *   list should be freed with g_list_free() after each element has
     *   been freed with g_object_unref().
     * @since 2.32
     */
    @GioVersion2_32
    public open fun getConnections(): List =
        g_dbus_interface_skeleton_get_connections(gioDBusInterfaceSkeletonPointer)!!.run {
            List(this)
        }

    /**
     * Gets the #GDBusInterfaceSkeletonFlags that describes what the behavior
     * of @interface_
     *
     * @return One or more flags from the #GDBusInterfaceSkeletonFlags enumeration.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun getFlags(): DBusInterfaceSkeletonFlags =
        g_dbus_interface_skeleton_get_flags(gioDBusInterfaceSkeletonPointer).run {
            DBusInterfaceSkeletonFlags(this)
        }

    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by @interface_.
     *
     * @return A #GDBusInterfaceInfo (never null). Do not free.
     * @since 2.30
     */
    @GioVersion2_30
    override fun getInfo(): DBusInterfaceInfo =
        g_dbus_interface_skeleton_get_info(gioDBusInterfaceSkeletonPointer)!!.run {
            DBusInterfaceInfo(this)
        }

    /**
     * Gets the object path that @interface_ is exported on, if any.
     *
     * @return A string owned by @interface_ or null if @interface_ is not exported
     * anywhere. Do not free, the string belongs to @interface_.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun getObjectPath(): String? =
        g_dbus_interface_skeleton_get_object_path(gioDBusInterfaceSkeletonPointer)?.toKString()

    /**
     * Gets all D-Bus properties for @interface_.
     *
     * @return A #GVariant of type
     * ['a{sv}'][G-VARIANT-TYPE-VARDICT:CAPS].
     * Free with g_variant_unref().
     * @since 2.30
     */
    @GioVersion2_30
    public open fun getProperties(): Variant =
        g_dbus_interface_skeleton_get_properties(gioDBusInterfaceSkeletonPointer)!!.run {
            Variant(this)
        }

    /**
     * Gets the interface vtable for the D-Bus interface implemented by
     * @interface_. The returned function pointers should expect @interface_
     * itself to be passed as @user_data.
     *
     * @return the vtable of the D-Bus interface implemented by the skeleton
     * @since 2.30
     */
    @GioVersion2_30
    public open fun getVtable(): DBusInterfaceVTable =
        g_dbus_interface_skeleton_get_vtable(gioDBusInterfaceSkeletonPointer)!!.run {
            DBusInterfaceVTable(this)
        }

    /**
     * Checks if @interface_ is exported on @connection.
     *
     * @param connection A #GDBusConnection.
     * @return true if @interface_ is exported on @connection, false otherwise.
     * @since 2.32
     */
    @GioVersion2_32
    public open fun hasConnection(connection: DBusConnection): Boolean = g_dbus_interface_skeleton_has_connection(
        gioDBusInterfaceSkeletonPointer,
        connection.gioDBusConnectionPointer
    ).asBoolean()

    /**
     * Sets flags describing what the behavior of @skeleton should be.
     *
     * @param flags Flags from the #GDBusInterfaceSkeletonFlags enumeration.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun setFlags(flags: DBusInterfaceSkeletonFlags): Unit =
        g_dbus_interface_skeleton_set_flags(gioDBusInterfaceSkeletonPointer, flags.mask)

    /**
     * Stops exporting @interface_ on all connections it is exported on.
     *
     * To unexport @interface_ from only a single connection, use
     * g_dbus_interface_skeleton_unexport_from_connection()
     *
     * @since 2.30
     */
    @GioVersion2_30
    public open fun unexport(): Unit = g_dbus_interface_skeleton_unexport(gioDBusInterfaceSkeletonPointer)

    /**
     * Stops exporting @interface_ on @connection.
     *
     * To stop exporting on all connections the interface is exported on,
     * use g_dbus_interface_skeleton_unexport().
     *
     * @param connection A #GDBusConnection.
     * @since 2.32
     */
    @GioVersion2_32
    public open fun unexportFromConnection(connection: DBusConnection): Unit =
        g_dbus_interface_skeleton_unexport_from_connection(
            gioDBusInterfaceSkeletonPointer,
            connection.gioDBusConnectionPointer
        )

    /**
     * Emitted when a method is invoked by a remote caller and used to
     * determine if the method call is authorized.
     *
     * Note that this signal is emitted in a thread dedicated to
     * handling the method call so handlers are allowed to perform
     * blocking IO. This means that it is appropriate to call e.g.
     * [polkit_authority_check_authorization_sync()](http://hal.freedesktop.org/docs/polkit/PolkitAuthority.html#polkit-authority-check-authorization-sync)
     * with the
     * [POLKIT_CHECK_AUTHORIZATION_FLAGS_ALLOW_USER_INTERACTION](http://hal.freedesktop.org/docs/polkit/PolkitAuthority.html#POLKIT-CHECK-AUTHORIZATION-FLAGS-ALLOW-USER-INTERACTION:CAPS)
     * flag set.
     *
     * If false is returned then no further handlers are run and the
     * signal handler must take a reference to @invocation and finish
     * handling the call (e.g. return an error via
     * g_dbus_method_invocation_return_error()).
     *
     * Otherwise, if true is returned, signal emission continues. If no
     * handlers return false, then the method is dispatched. If
     * @interface has an enclosing #GDBusObjectSkeleton, then the
     * #GDBusObjectSkeleton::authorize-method signal handlers run before
     * the handlers for this signal.
     *
     * The default class handler just returns true.
     *
     * Please note that the common case is optimized: if no signals
     * handlers are connected and the default class handler isn't
     * overridden (for both @interface and the enclosing
     * #GDBusObjectSkeleton, if any) and #GDBusInterfaceSkeleton:g-flags does
     * not have the
     * %G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD
     * flags set, no dedicated thread is ever used and the call will be
     * handled in the same thread as the object that @interface belongs
     * to was exported in.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `invocation` A #GDBusMethodInvocation.. Returns true if the call is authorized, false otherwise.
     * @since 2.30
     */
    @GioVersion2_30
    public fun onGAuthorizeMethod(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (invocation: DBusMethodInvocation) -> Boolean,
    ): ULong = g_signal_connect_data(
        gioDBusInterfaceSkeletonPointer,
        "g-authorize-method",
        onGAuthorizeMethodFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The DBusInterfaceSkeletonImpl type represents a native instance of the abstract DBusInterfaceSkeleton class.
     *
     * @constructor Creates a new instance of DBusInterfaceSkeleton for the provided [CPointer].
     */
    public class DBusInterfaceSkeletonImpl(pointer: CPointer<GDBusInterfaceSkeleton>) : DBusInterfaceSkeleton(pointer)

    public companion object : TypeCompanion<DBusInterfaceSkeleton> {
        override val type: GeneratedClassKGType<DBusInterfaceSkeleton> =
            GeneratedClassKGType(g_dbus_interface_skeleton_get_type()) {
                DBusInterfaceSkeletonImpl(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of DBusInterfaceSkeleton
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_interface_skeleton_get_type()
    }
}

private val onGAuthorizeMethodFunc:
    CPointer<CFunction<(CPointer<GDBusMethodInvocation>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            invocation: CPointer<GDBusMethodInvocation>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(invocation: DBusMethodInvocation) -> Boolean>().get().invoke(
            invocation!!.run {
                DBusMethodInvocation(this)
            }
        ).asGBoolean()
    }
        .reinterpret()
