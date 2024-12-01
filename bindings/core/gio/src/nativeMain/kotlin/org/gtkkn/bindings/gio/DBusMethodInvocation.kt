// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusMethodInvocation
import org.gtkkn.native.gio.g_dbus_method_invocation_get_connection
import org.gtkkn.native.gio.g_dbus_method_invocation_get_interface_name
import org.gtkkn.native.gio.g_dbus_method_invocation_get_message
import org.gtkkn.native.gio.g_dbus_method_invocation_get_method_info
import org.gtkkn.native.gio.g_dbus_method_invocation_get_method_name
import org.gtkkn.native.gio.g_dbus_method_invocation_get_object_path
import org.gtkkn.native.gio.g_dbus_method_invocation_get_parameters
import org.gtkkn.native.gio.g_dbus_method_invocation_get_property_info
import org.gtkkn.native.gio.g_dbus_method_invocation_get_sender
import org.gtkkn.native.gio.g_dbus_method_invocation_get_type
import org.gtkkn.native.gio.g_dbus_method_invocation_return_dbus_error
import org.gtkkn.native.gio.g_dbus_method_invocation_return_error_literal
import org.gtkkn.native.gio.g_dbus_method_invocation_return_gerror
import org.gtkkn.native.gio.g_dbus_method_invocation_return_value
import org.gtkkn.native.gio.g_dbus_method_invocation_return_value_with_unix_fd_list
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Instances of the `GDBusMethodInvocation` class are used when
 * handling D-Bus method calls. It provides a way to asynchronously
 * return results and errors.
 *
 * The normal way to obtain a `GDBusMethodInvocation` object is to receive
 * it as an argument to the `handle_method_call()` function in a
 * [type@Gio.DBusInterfaceVTable] that was passed to
 * [method@Gio.DBusConnection.register_object].
 * @since 2.26
 */
@GioVersion2_26
public open class DBusMethodInvocation(
    pointer: CPointer<GDBusMethodInvocation>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioDBusMethodInvocationPointer: CPointer<GDBusMethodInvocation>
        get() = gPointer.reinterpret()

    /**
     * Gets the #GDBusConnection the method was invoked on.
     *
     * @return A #GDBusConnection. Do not free, it is owned by @invocation.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getConnection(): DBusConnection =
        g_dbus_method_invocation_get_connection(gioDBusMethodInvocationPointer.reinterpret())!!.run {
            DBusConnection(reinterpret())
        }

    /**
     * Gets the name of the D-Bus interface the method was invoked on.
     *
     * If this method call is a property Get, Set or GetAll call that has
     * been redirected to the method call handler then
     * "org.freedesktop.DBus.Properties" will be returned.  See
     * #GDBusInterfaceVTable for more information.
     *
     * @return A string. Do not free, it is owned by @invocation.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getInterfaceName(): String =
        g_dbus_method_invocation_get_interface_name(gioDBusMethodInvocationPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the #GDBusMessage for the method invocation. This is useful if
     * you need to use low-level protocol features, such as UNIX file
     * descriptor passing, that cannot be properly expressed in the
     * #GVariant API.
     *
     * See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
     * for an example of how to use this low-level API to send and receive
     * UNIX file descriptors.
     *
     * @return #GDBusMessage. Do not free, it is owned by @invocation.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getMessage(): DBusMessage =
        g_dbus_method_invocation_get_message(gioDBusMethodInvocationPointer.reinterpret())!!.run {
            DBusMessage(reinterpret())
        }

    /**
     * Gets information about the method call, if any.
     *
     * If this method invocation is a property Get, Set or GetAll call that
     * has been redirected to the method call handler then null will be
     * returned.  See g_dbus_method_invocation_get_property_info() and
     * #GDBusInterfaceVTable for more information.
     *
     * @return A #GDBusMethodInfo or null. Do not free, it is owned by @invocation.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getMethodInfo(): DBusMethodInfo? =
        g_dbus_method_invocation_get_method_info(gioDBusMethodInvocationPointer.reinterpret())?.run {
            DBusMethodInfo(reinterpret())
        }

    /**
     * Gets the name of the method that was invoked.
     *
     * @return A string. Do not free, it is owned by @invocation.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getMethodName(): String =
        g_dbus_method_invocation_get_method_name(gioDBusMethodInvocationPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the object path the method was invoked on.
     *
     * @return A string. Do not free, it is owned by @invocation.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getObjectPath(): String =
        g_dbus_method_invocation_get_object_path(gioDBusMethodInvocationPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the parameters of the method invocation. If there are no input
     * parameters then this will return a GVariant with 0 children rather than NULL.
     *
     * @return A #GVariant tuple. Do not unref this because it is owned by @invocation.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getParameters(): Variant =
        g_dbus_method_invocation_get_parameters(gioDBusMethodInvocationPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * Gets information about the property that this method call is for, if
     * any.
     *
     * This will only be set in the case of an invocation in response to a
     * property Get or Set call that has been directed to the method call
     * handler for an object on account of its property_get() or
     * property_set() vtable pointers being unset.
     *
     * See #GDBusInterfaceVTable for more information.
     *
     * If the call was GetAll, null will be returned.
     *
     * @return a #GDBusPropertyInfo or null
     * @since 2.38
     */
    @GioVersion2_38
    public open fun getPropertyInfo(): DBusPropertyInfo? =
        g_dbus_method_invocation_get_property_info(gioDBusMethodInvocationPointer.reinterpret())?.run {
            DBusPropertyInfo(reinterpret())
        }

    /**
     * Gets the bus name that invoked the method.
     *
     * @return A string. Do not free, it is owned by @invocation.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getSender(): String =
        g_dbus_method_invocation_get_sender(gioDBusMethodInvocationPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Finishes handling a D-Bus method call by returning an error.
     *
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     *
     * @param errorName A valid D-Bus error name.
     * @param errorMessage A valid D-Bus error message.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun returnDbusError(
        errorName: String,
        errorMessage: String,
    ): Unit =
        g_dbus_method_invocation_return_dbus_error(
            gioDBusMethodInvocationPointer.reinterpret(),
            errorName,
            errorMessage
        )

    /**
     * Like g_dbus_method_invocation_return_error() but without printf()-style formatting.
     *
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     *
     * @param domain A #GQuark for the #GError error domain.
     * @param code The error code.
     * @param message The error message.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun returnErrorLiteral(
        domain: Quark,
        code: Int,
        message: String,
    ): Unit =
        g_dbus_method_invocation_return_error_literal(
            gioDBusMethodInvocationPointer.reinterpret(),
            domain,
            code,
            message
        )

    /**
     * Like g_dbus_method_invocation_return_error() but takes a #GError
     * instead of the error domain, error code and message.
     *
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     *
     * @param error A #GError.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun returnGerror(error: Error): Unit =
        g_dbus_method_invocation_return_gerror(
            gioDBusMethodInvocationPointer.reinterpret(),
            error.glibErrorPointer.reinterpret()
        )

    /**
     * Finishes handling a D-Bus method call by returning @parameters.
     * If the @parameters GVariant is floating, it is consumed.
     *
     * It is an error if @parameters is not of the right format: it must be a tuple
     * containing the out-parameters of the D-Bus method. Even if the method has a
     * single out-parameter, it must be contained in a tuple. If the method has no
     * out-parameters, @parameters may be null or an empty tuple.
     *
     * |[<!-- language="C" -->
     * GDBusMethodInvocation *invocation = some_invocation;
     * g_autofree gchar *result_string = NULL;
     * g_autoptr (GError) error = NULL;
     *
     * result_string = calculate_result (&error);
     *
     * if (error != NULL)
     *   g_dbus_method_invocation_return_gerror (invocation, error);
     * else
     *   g_dbus_method_invocation_return_value (invocation,
     *                                          g_variant_new ("(s)", result_string));
     *
     * // Do not free @invocation here; returning a value does that
     * ]|
     *
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     *
     * Since 2.48, if the method call requested for a reply not to be sent
     * then this call will sink @parameters and free @invocation, but
     * otherwise do nothing (as per the recommendations of the D-Bus
     * specification).
     *
     * @param parameters A #GVariant tuple with out parameters for the method or null if not passing any parameters.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun returnValue(parameters: Variant? = null): Unit =
        g_dbus_method_invocation_return_value(
            gioDBusMethodInvocationPointer.reinterpret(),
            parameters?.glibVariantPointer?.reinterpret()
        )

    /**
     * Like g_dbus_method_invocation_return_value() but also takes a #GUnixFDList.
     *
     * This method is only available on UNIX.
     *
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     *
     * @param parameters A #GVariant tuple with out parameters for the method or null if not passing any parameters.
     * @param fdList A #GUnixFDList or null.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun returnValueWithUnixFdList(
        parameters: Variant? = null,
        fdList: UnixFDList? = null,
    ): Unit =
        g_dbus_method_invocation_return_value_with_unix_fd_list(
            gioDBusMethodInvocationPointer.reinterpret(),
            parameters?.glibVariantPointer?.reinterpret(),
            fdList?.gioUnixFDListPointer?.reinterpret()
        )

    public companion object : TypeCompanion<DBusMethodInvocation> {
        override val type: GeneratedClassKGType<DBusMethodInvocation> =
            GeneratedClassKGType(g_dbus_method_invocation_get_type()) { DBusMethodInvocation(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
