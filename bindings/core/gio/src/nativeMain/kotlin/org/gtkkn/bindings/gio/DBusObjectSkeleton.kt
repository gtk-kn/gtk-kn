// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusInterfaceSkeleton
import org.gtkkn.native.gio.GDBusMethodInvocation
import org.gtkkn.native.gio.GDBusObject
import org.gtkkn.native.gio.GDBusObjectSkeleton
import org.gtkkn.native.gio.g_dbus_object_skeleton_add_interface
import org.gtkkn.native.gio.g_dbus_object_skeleton_flush
import org.gtkkn.native.gio.g_dbus_object_skeleton_get_type
import org.gtkkn.native.gio.g_dbus_object_skeleton_new
import org.gtkkn.native.gio.g_dbus_object_skeleton_remove_interface
import org.gtkkn.native.gio.g_dbus_object_skeleton_remove_interface_by_name
import org.gtkkn.native.gio.g_dbus_object_skeleton_set_object_path
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GDBusObjectSkeleton` instance is essentially a group of D-Bus
 * interfaces. The set of exported interfaces on the object may be
 * dynamic and change at runtime.
 *
 * This type is intended to be used with [iface@Gio.DBusObjectManager].
 *
 * ## Skipped during bindings generation
 *
 * - method `g-object-path`: Property has no getter nor setter
 *
 * @since 2.30
 */
@GioVersion2_30
public open class DBusObjectSkeleton(
    pointer: CPointer<GDBusObjectSkeleton>,
) : Object(pointer.reinterpret()),
    DBusObject,
    KGTyped {
    public val gioDBusObjectSkeletonPointer: CPointer<GDBusObjectSkeleton>
        get() = gPointer.reinterpret()

    override val gioDBusObjectPointer: CPointer<GDBusObject>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GDBusObjectSkeleton.
     *
     * @param objectPath An object path.
     * @return A #GDBusObjectSkeleton. Free with g_object_unref().
     * @since 2.30
     */
    public constructor(objectPath: String) : this(g_dbus_object_skeleton_new(objectPath)!!.reinterpret())

    /**
     * Adds @interface_ to @object.
     *
     * If @object already contains a #GDBusInterfaceSkeleton with the same
     * interface name, it is removed before @interface_ is added.
     *
     * Note that @object takes its own reference on @interface_ and holds
     * it until removed.
     *
     * @param interface A #GDBusInterfaceSkeleton.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun addInterface(`interface`: DBusInterfaceSkeleton): Unit =
        g_dbus_object_skeleton_add_interface(
            gioDBusObjectSkeletonPointer.reinterpret(),
            `interface`.gioDBusInterfaceSkeletonPointer.reinterpret()
        )

    /**
     * This method simply calls g_dbus_interface_skeleton_flush() on all
     * interfaces belonging to @object. See that method for when flushing
     * is useful.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public open fun flush(): Unit = g_dbus_object_skeleton_flush(gioDBusObjectSkeletonPointer.reinterpret())

    /**
     * Removes @interface_ from @object.
     *
     * @param interface A #GDBusInterfaceSkeleton.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun removeInterface(`interface`: DBusInterfaceSkeleton): Unit =
        g_dbus_object_skeleton_remove_interface(
            gioDBusObjectSkeletonPointer.reinterpret(),
            `interface`.gioDBusInterfaceSkeletonPointer.reinterpret()
        )

    /**
     * Removes the #GDBusInterface with @interface_name from @object.
     *
     * If no D-Bus interface of the given interface exists, this function
     * does nothing.
     *
     * @param interfaceName A D-Bus interface name.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun removeInterfaceByName(interfaceName: String): Unit =
        g_dbus_object_skeleton_remove_interface_by_name(gioDBusObjectSkeletonPointer.reinterpret(), interfaceName)

    /**
     * Sets the object path for @object.
     *
     * @param objectPath A valid D-Bus object path.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun setObjectPath(objectPath: String): Unit =
        g_dbus_object_skeleton_set_object_path(gioDBusObjectSkeletonPointer.reinterpret(), objectPath)

    /**
     * Emitted when a method is invoked by a remote caller and used to
     * determine if the method call is authorized.
     *
     * This signal is like #GDBusInterfaceSkeleton's
     * #GDBusInterfaceSkeleton::g-authorize-method signal,
     * except that it is for the enclosing object.
     *
     * The default class handler just returns true.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `interface` The #GDBusInterfaceSkeleton that @invocation is for.; `invocation` A #GDBusMethodInvocation.. Returns true if the call is authorized, false otherwise.
     * @since 2.30
     */
    @GioVersion2_30
    public fun connectAuthorizeMethod(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`interface`: DBusInterfaceSkeleton, invocation: DBusMethodInvocation) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "authorize-method",
            connectAuthorizeMethodFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<DBusObjectSkeleton> {
        override val type: GeneratedClassKGType<DBusObjectSkeleton> =
            GeneratedClassKGType(g_dbus_object_skeleton_get_type()) { DBusObjectSkeleton(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}

private val connectAuthorizeMethodFunc:
    CPointer<CFunction<(CPointer<GDBusInterfaceSkeleton>, CPointer<GDBusMethodInvocation>) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            `interface`: CPointer<GDBusInterfaceSkeleton>?,
            invocation: CPointer<GDBusMethodInvocation>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    `interface`: DBusInterfaceSkeleton,
                    invocation: DBusMethodInvocation,
                ) -> Boolean
            >()
            .get()
            .invoke(
                `interface`!!.run {
                    DBusInterfaceSkeleton(reinterpret())
                },
                invocation!!.run {
                    DBusMethodInvocation(reinterpret())
                }
            ).asGBoolean()
    }.reinterpret()
