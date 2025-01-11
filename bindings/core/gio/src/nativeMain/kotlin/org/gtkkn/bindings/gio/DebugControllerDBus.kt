// This is a generated file. Do not modify.
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
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_72
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusMethodInvocation
import org.gtkkn.native.gio.GDebugController
import org.gtkkn.native.gio.GDebugControllerDBus
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.g_debug_controller_dbus_get_type
import org.gtkkn.native.gio.g_debug_controller_dbus_new
import org.gtkkn.native.gio.g_debug_controller_dbus_stop
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Throws
import kotlin.ULong
import kotlin.Unit

/**
 * `GDebugControllerDBus` is an implementation of [iface@Gio.DebugController]
 * which exposes debug settings as a D-Bus object.
 *
 * It is a [iface@Gio.Initable] object, and will register an object at
 * `/org/gtk/Debugging` on the bus given as
 * [property@Gio.DebugControllerDBus:connection] once it’s initialized. The
 * object will be unregistered when the last reference to the
 * `GDebugControllerDBus` is dropped.
 *
 * This D-Bus object can be used by remote processes to enable or disable debug
 * output in this process. Remote processes calling
 * `org.gtk.Debugging.SetDebugEnabled()` will affect the value of
 * [property@Gio.DebugController:debug-enabled] and, by default,
 * [func@GLib.log_get_debug_enabled].
 *
 * By default, no processes are allowed to call `SetDebugEnabled()` unless a
 * [signal@Gio.DebugControllerDBus::authorize] signal handler is installed. This
 * is because the process may be privileged, or might expose sensitive
 * information in its debug output. You may want to restrict the ability to
 * enable debug output to privileged users or processes.
 *
 * One option is to install a D-Bus security policy which restricts access to
 * `SetDebugEnabled()`, installing something like the following in
 * `$datadir/dbus-1/system.d/`:
 *
 * ```xml
 * <?xml version="1.0"?> <!--*-nxml-*-->
 * <!DOCTYPE busconfig PUBLIC "-//freedesktop//DTD D-BUS Bus Configuration 1.0//EN"
 *      "http://www.freedesktop.org/standards/dbus/1.0/busconfig.dtd">
 * <busconfig>
 *   <policy user="root">
 *     <allow send_destination="com.example.MyService" send_interface="org.gtk.Debugging"/>
 *   </policy>
 *   <policy context="default">
 *     <deny send_destination="com.example.MyService" send_interface="org.gtk.Debugging"/>
 *   </policy>
 * </busconfig>
 * ```
 *
 * This will prevent the `SetDebugEnabled()` method from being called by all
 * except root. It will not prevent the `DebugEnabled` property from being read,
 * as it’s accessed through the `org.freedesktop.DBus.Properties` interface.
 *
 * Another option is to use polkit to allow or deny requests on a case-by-case
 * basis, allowing for the possibility of dynamic authorisation. To do this,
 * connect to the [signal@Gio.DebugControllerDBus::authorize] signal and query
 * polkit in it:
 *
 * ```c
 *   g_autoptr(GError) child_error = NULL;
 *   g_autoptr(GDBusConnection) connection = g_bus_get_sync (G_BUS_TYPE_SYSTEM, NULL, NULL);
 *   gulong debug_controller_authorize_id = 0;
 *
 *   // Set up the debug controller.
 *   debug_controller = G_DEBUG_CONTROLLER (g_debug_controller_dbus_new (priv->connection, NULL, &child_error));
 *   if (debug_controller == NULL)
 *     {
 *       g_error ("Could not register debug controller on bus: %s"),
 *                child_error->message);
 *     }
 *
 *   debug_controller_authorize_id = g_signal_connect (debug_controller,
 *                                                     "authorize",
 *                                                     G_CALLBACK (debug_controller_authorize_cb),
 *                                                     self);
 *
 *   static gboolean
 *   debug_controller_authorize_cb (GDebugControllerDBus  *debug_controller,
 *                                  GDBusMethodInvocation *invocation,
 *                                  gpointer               user_data)
 *   {
 *     g_autoptr(PolkitAuthority) authority = NULL;
 *     g_autoptr(PolkitSubject) subject = NULL;
 *     g_autoptr(PolkitAuthorizationResult) auth_result = NULL;
 *     g_autoptr(GError) local_error = NULL;
 *     GDBusMessage *message;
 *     GDBusMessageFlags message_flags;
 *     PolkitCheckAuthorizationFlags flags = POLKIT_CHECK_AUTHORIZATION_FLAGS_NONE;
 *
 *     message = g_dbus_method_invocation_get_message (invocation);
 *     message_flags = g_dbus_message_get_flags (message);
 *
 *     authority = polkit_authority_get_sync (NULL, &local_error);
 *     if (authority == NULL)
 *       {
 *         g_warning ("Failed to get polkit authority: %s", local_error->message);
 *         return FALSE;
 *       }
 *
 *     if (message_flags & G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION)
 *       flags |= POLKIT_CHECK_AUTHORIZATION_FLAGS_ALLOW_USER_INTERACTION;
 *
 *     subject = polkit_system_bus_name_new (g_dbus_method_invocation_get_sender (invocation));
 *
 *     auth_result = polkit_authority_check_authorization_sync (authority,
 *                                                              subject,
 *                                                              "com.example.MyService.set-debug-enabled",
 *                                                              NULL,
 *                                                              flags,
 *                                                              NULL,
 *                                                              &local_error);
 *     if (auth_result == NULL)
 *       {
 *         g_warning ("Failed to get check polkit authorization: %s", local_error->message);
 *         return FALSE;
 *       }
 *
 *     return polkit_authorization_result_get_is_authorized (auth_result);
 *   }
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `connection`: Property has no getter nor setter
 *
 * @since 2.72
 */
@GioVersion2_72
public open class DebugControllerDBus(public val gioDebugControllerDBusPointer: CPointer<GDebugControllerDBus>) :
    Object(gioDebugControllerDBusPointer.reinterpret()),
    DebugController,
    Initable,
    KGTyped {
    override val gioDebugControllerPointer: CPointer<GDebugController>
        get() = handle.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = handle.reinterpret()

    /**
     * Create a new #GDebugControllerDBus and synchronously initialize it.
     *
     * Initializing the object will export the debug object on @connection. The
     * object will remain registered until the last reference to the
     * #GDebugControllerDBus is dropped.
     *
     * Initialization may fail if registering the object on @connection fails.
     *
     * @param connection a #GDBusConnection to register the debug object on
     * @param cancellable a #GCancellable, or null
     * @return a new #GDebugControllerDBus, or null
     *   on failure
     * @since 2.72
     */
    @Throws(GLibException::class)
    public constructor(connection: DBusConnection, cancellable: Cancellable? = null) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_debug_controller_dbus_new(
                    connection.gioDBusConnectionPointer,
                    cancellable?.gioCancellablePointer,
                    gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Stop the debug controller, unregistering its object from the bus.
     *
     * Any pending method calls to the object will complete successfully, but new
     * ones will return an error. This method will block until all pending
     * #GDebugControllerDBus::authorize signals have been handled. This is expected
     * to not take long, as it will just be waiting for threads to join. If any
     * #GDebugControllerDBus::authorize signal handlers are still executing in other
     * threads, this will block until after they have returned.
     *
     * This method will be called automatically when the final reference to the
     * #GDebugControllerDBus is dropped. You may want to call it explicitly to know
     * when the controller has been fully removed from the bus, or to break
     * reference count cycles.
     *
     * Calling this method from within a #GDebugControllerDBus::authorize signal
     * handler will cause a deadlock and must not be done.
     *
     * @since 2.72
     */
    @GioVersion2_72
    public open fun stop(): Unit = g_debug_controller_dbus_stop(gioDebugControllerDBusPointer)

    /**
     * Emitted when a D-Bus peer is trying to change the debug settings and used
     * to determine if that is authorized.
     *
     * This signal is emitted in a dedicated worker thread, so handlers are
     * allowed to perform blocking I/O. This means that, for example, it is
     * appropriate to call `polkit_authority_check_authorization_sync()` to check
     * authorization using polkit.
     *
     * If false is returned then no further handlers are run and the request to
     * change the debug settings is rejected.
     *
     * Otherwise, if true is returned, signal emission continues. If no handlers
     * return false, then the debug settings are allowed to be changed.
     *
     * Signal handlers must not modify @invocation, or cause it to return a value.
     *
     * The default class handler just returns true.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `invocation` A #GDBusMethodInvocation.. Returns true if the call is authorized, false otherwise.
     * @since 2.72
     */
    @GioVersion2_72
    public fun onAuthorize(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (invocation: DBusMethodInvocation) -> Boolean,
    ): ULong = g_signal_connect_data(
        gioDebugControllerDBusPointer,
        "authorize",
        onAuthorizeFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<DebugControllerDBus> {
        override val type: GeneratedClassKGType<DebugControllerDBus> =
            GeneratedClassKGType(g_debug_controller_dbus_get_type()) { DebugControllerDBus(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of DebugControllerDBus
         *
         * @return the GType
         */
        public fun getType(): GType = g_debug_controller_dbus_get_type()
    }
}

private val onAuthorizeFunc: CPointer<CFunction<(CPointer<GDBusMethodInvocation>) -> gboolean>> =
    staticCFunction {
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
