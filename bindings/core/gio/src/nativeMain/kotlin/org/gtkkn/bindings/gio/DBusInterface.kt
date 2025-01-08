// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusInterface
import org.gtkkn.native.gio.g_dbus_interface_dup_object
import org.gtkkn.native.gio.g_dbus_interface_get_info
import org.gtkkn.native.gio.g_dbus_interface_get_type
import org.gtkkn.native.gio.g_dbus_interface_set_object
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * Base type for D-Bus interfaces.
 *
 * The `GDBusInterface` type is the base type for D-Bus interfaces both
 * on the service side (see [class@Gio.DBusInterfaceSkeleton]) and client side
 * (see [class@Gio.DBusProxy]).
 * @since 2.30
 */
@GioVersion2_30
public interface DBusInterface :
    Interface,
    KGTyped {
    public val gioDBusInterfacePointer: CPointer<GDBusInterface>

    /**
     * Gets the #GDBusObject that @interface_ belongs to, if any.
     *
     * @return A #GDBusObject or null. The returned
     * reference should be freed with g_object_unref().
     * @since 2.32
     */
    @GioVersion2_32
    public fun getObject(): DBusObject? = g_dbus_interface_dup_object(gioDBusInterfacePointer)?.run {
        DBusObject.wrap(reinterpret())
    }

    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by @interface_.
     *
     * @return A #GDBusInterfaceInfo. Do not free.
     * @since 2.30
     */
    @GioVersion2_30
    public fun getInfo(): DBusInterfaceInfo = g_dbus_interface_get_info(gioDBusInterfacePointer)!!.run {
        DBusInterfaceInfo(this)
    }

    /**
     * Sets the #GDBusObject for @interface_ to @object.
     *
     * Note that @interface_ will hold a weak reference to @object.
     *
     * @param object A #GDBusObject or null.
     * @since 2.30
     */
    @GioVersion2_30
    public fun setObject(`object`: DBusObject? = null): Unit =
        g_dbus_interface_set_object(gioDBusInterfacePointer, `object`?.gioDBusObjectPointer)

    private data class Wrapper(private val pointer: CPointer<GDBusInterface>) : DBusInterface {
        override val gioDBusInterfacePointer: CPointer<GDBusInterface> = pointer
    }

    public companion object : TypeCompanion<DBusInterface> {
        override val type: GeneratedInterfaceKGType<DBusInterface> =
            GeneratedInterfaceKGType(g_dbus_interface_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GDBusInterface>): DBusInterface = Wrapper(pointer)

        /**
         * Get the GType of DBusInterface
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_interface_get_type()
    }
}
