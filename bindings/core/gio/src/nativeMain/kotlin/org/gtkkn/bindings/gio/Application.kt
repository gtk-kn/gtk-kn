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
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.bindings.gio.annotations.GioVersion2_42
import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.bindings.gio.annotations.GioVersion2_56
import org.gtkkn.bindings.gio.annotations.GioVersion2_60
import org.gtkkn.bindings.gio.annotations.GioVersion2_80
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.OptionArg
import org.gtkkn.bindings.glib.OptionFlags
import org.gtkkn.bindings.glib.OptionGroup
import org.gtkkn.bindings.glib.VariantDict
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GActionGroup
import org.gtkkn.native.gio.GActionMap
import org.gtkkn.native.gio.GApplication
import org.gtkkn.native.gio.GApplicationCommandLine
import org.gtkkn.native.gio.g_application_activate
import org.gtkkn.native.gio.g_application_add_main_option
import org.gtkkn.native.gio.g_application_add_option_group
import org.gtkkn.native.gio.g_application_bind_busy_property
import org.gtkkn.native.gio.g_application_get_application_id
import org.gtkkn.native.gio.g_application_get_dbus_connection
import org.gtkkn.native.gio.g_application_get_dbus_object_path
import org.gtkkn.native.gio.g_application_get_default
import org.gtkkn.native.gio.g_application_get_flags
import org.gtkkn.native.gio.g_application_get_inactivity_timeout
import org.gtkkn.native.gio.g_application_get_is_busy
import org.gtkkn.native.gio.g_application_get_is_registered
import org.gtkkn.native.gio.g_application_get_is_remote
import org.gtkkn.native.gio.g_application_get_resource_base_path
import org.gtkkn.native.gio.g_application_get_type
import org.gtkkn.native.gio.g_application_get_version
import org.gtkkn.native.gio.g_application_hold
import org.gtkkn.native.gio.g_application_id_is_valid
import org.gtkkn.native.gio.g_application_mark_busy
import org.gtkkn.native.gio.g_application_new
import org.gtkkn.native.gio.g_application_quit
import org.gtkkn.native.gio.g_application_register
import org.gtkkn.native.gio.g_application_release
import org.gtkkn.native.gio.g_application_run
import org.gtkkn.native.gio.g_application_send_notification
import org.gtkkn.native.gio.g_application_set_action_group
import org.gtkkn.native.gio.g_application_set_application_id
import org.gtkkn.native.gio.g_application_set_default
import org.gtkkn.native.gio.g_application_set_flags
import org.gtkkn.native.gio.g_application_set_inactivity_timeout
import org.gtkkn.native.gio.g_application_set_option_context_description
import org.gtkkn.native.gio.g_application_set_option_context_parameter_string
import org.gtkkn.native.gio.g_application_set_option_context_summary
import org.gtkkn.native.gio.g_application_set_resource_base_path
import org.gtkkn.native.gio.g_application_set_version
import org.gtkkn.native.gio.g_application_unbind_busy_property
import org.gtkkn.native.gio.g_application_unmark_busy
import org.gtkkn.native.gio.g_application_withdraw_notification
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GVariantDict
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Boolean
import kotlin.Char
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * `GApplication` is the core class for application support.
 *
 * A `GApplication` is the foundation of an application. It wraps some
 * low-level platform-specific services and is intended to act as the
 * foundation for higher-level application classes such as
 * `GtkApplication` or `MxApplication`. In general, you should not use
 * this class outside of a higher level framework.
 *
 * `GApplication` provides convenient life-cycle management by maintaining
 * a "use count" for the primary application instance. The use count can
 * be changed using [method@Gio.Application.hold] and
 * [method@Gio.Application.release]. If it drops to zero, the application
 * exits. Higher-level classes such as `GtkApplication` employ the use count
 * to ensure that the application stays alive as long as it has any opened
 * windows.
 *
 * Another feature that `GApplication` (optionally) provides is process
 * uniqueness. Applications can make use of this functionality by
 * providing a unique application ID. If given, only one application
 * with this ID can be running at a time per session. The session
 * concept is platform-dependent, but corresponds roughly to a graphical
 * desktop login. When your application is launched again, its
 * arguments are passed through platform communication to the already
 * running program. The already running instance of the program is
 * called the "primary instance"; for non-unique applications this is
 * always the current instance. On Linux, the D-Bus session bus
 * is used for communication.
 *
 * The use of `GApplication` differs from some other commonly-used
 * uniqueness libraries (such as libunique) in important ways. The
 * application is not expected to manually register itself and check
 * if it is the primary instance. Instead, the main() function of a
 * `GApplication` should do very little more than instantiating the
 * application instance, possibly connecting signal handlers, then
 * calling [method@Gio.Application.run]. All checks for uniqueness are done
 * internally. If the application is the primary instance then the
 * startup signal is emitted and the mainloop runs. If the application
 * is not the primary instance then a signal is sent to the primary
 * instance and [method@Gio.Application.run] promptly returns. See the code
 * examples below.
 *
 * If used, the expected form of an application identifier is the
 * same as that of a
 * [D-Bus well-known bus name](https://dbus.freedesktop.org/doc/dbus-specification.html#message-protocol-names-bus).
 * Examples include: `com.example.MyApp`, `org.example.internal_apps.Calculator`,
 * `org._7_zip.Archiver`.
 * For details on valid application identifiers, see [func@Gio.Application.id_is_valid].
 *
 * On Linux, the application identifier is claimed as a well-known bus name
 * on the user's session bus. This means that the uniqueness of your
 * application is scoped to the current session. It also means that your
 * application may provide additional services (through registration of other
 * object paths) at that bus name. The registration of these object paths
 * should be done with the shared GDBus session bus. Note that due to the
 * internal architecture of GDBus, method calls can be dispatched at any time
 * (even if a main loop is not running). For this reason, you must ensure that
 * any object paths that you wish to register are registered before #GApplication
 * attempts to acquire the bus name of your application (which happens in
 * [method@Gio.Application.register]). Unfortunately, this means that you cannot
 * use [property@Gio.Application:is-remote] to decide if you want to register
 * object paths.
 *
 * `GApplication` also implements the [iface@Gio.ActionGroup] and [iface@Gio.ActionMap]
 * interfaces and lets you easily export actions by adding them with
 * [method@Gio.ActionMap.add_action]. When invoking an action by calling
 * [method@Gio.ActionGroup.activate_action] on the application, it is always
 * invoked in the primary instance. The actions are also exported on
 * the session bus, and GIO provides the [class@Gio.DBusActionGroup] wrapper to
 * conveniently access them remotely. GIO provides a [class@Gio.DBusMenuModel] wrapper
 * for remote access to exported [class@Gio.MenuModel]s.
 *
 * Note: Due to the fact that actions are exported on the session bus,
 * using `maybe` parameters is not supported, since D-Bus does not support
 * `maybe` types.
 *
 * There is a number of different entry points into a `GApplication`:
 *
 * - via 'Activate' (i.e. just starting the application)
 *
 * - via 'Open' (i.e. opening some files)
 *
 * - by handling a command-line
 *
 * - via activating an action
 *
 * The [signal@Gio.Application::startup] signal lets you handle the application
 * initialization for all of these in a single place.
 *
 * Regardless of which of these entry points is used to start the
 * application, `GApplication` passes some ‘platform data’ from the
 * launching instance to the primary instance, in the form of a
 * [struct@GLib.Variant] dictionary mapping strings to variants. To use platform
 * data, override the [vfunc@Gio.Application.before_emit] or
 * [vfunc@Gio.Application.after_emit] virtual functions
 * in your `GApplication` subclass. When dealing with
 * [class@Gio.ApplicationCommandLine] objects, the platform data is
 * directly available via [method@Gio.ApplicationCommandLine.get_cwd],
 * [method@Gio.ApplicationCommandLine.get_environ] and
 * [method@Gio.ApplicationCommandLine.get_platform_data].
 *
 * As the name indicates, the platform data may vary depending on the
 * operating system, but it always includes the current directory (key
 * `cwd`), and optionally the environment (ie the set of environment
 * variables and their values) of the calling process (key `environ`).
 * The environment is only added to the platform data if the
 * `G_APPLICATION_SEND_ENVIRONMENT` flag is set. `GApplication` subclasses
 * can add their own platform data by overriding the
 * [vfunc@Gio.Application.add_platform_data] virtual function. For instance,
 * `GtkApplication` adds startup notification data in this way.
 *
 * To parse commandline arguments you may handle the
 * [signal@Gio.Application::command-line] signal or override the
 * [vfunc@Gio.Application.local_command_line] virtual funcion, to parse them in
 * either the primary instance or the local instance, respectively.
 *
 * For an example of opening files with a `GApplication`, see
 * [gapplication-example-open.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-open.c).
 *
 * For an example of using actions with `GApplication`, see
 * [gapplication-example-actions.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-actions.c).
 *
 * For an example of using extra D-Bus hooks with `GApplication`, see
 * [gapplication-example-dbushooks.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-dbushooks.c).
 *
 * ## Skipped during bindings generation
 *
 * - parameter `entries`: Array parameter of type GLib.OptionEntry is not supported
 * - parameter `files`: Array parameter of type File is not supported
 * - method `action-group`: Property has no getter
 * - method `version`: Property TypeInfo of getter and setter do not match
 * - signal `open`: Unsupported parameter `files` : Array parameter of type File is not supported
 *
 * @since 2.28
 */
@GioVersion2_28
public open class Application(public val gioApplicationPointer: CPointer<GApplication>) :
    Object(gioApplicationPointer.reinterpret()),
    ActionGroup,
    ActionMap,
    KGTyped {
    override val gioActionGroupPointer: CPointer<GActionGroup>
        get() = handle.reinterpret()

    override val gioActionMapPointer: CPointer<GActionMap>
        get() = handle.reinterpret()

    /**
     * The unique identifier for the application.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open var applicationId: String?
        /**
         * Gets the unique identifier for @application.
         *
         * @return the identifier for @application, owned by @application
         * @since 2.28
         */
        get() = g_application_get_application_id(gioApplicationPointer)?.toKString()

        /**
         * Sets the unique identifier for @application.
         *
         * The application id can only be modified if @application has not yet
         * been registered.
         *
         * If non-null, the application id must be valid.  See
         * g_application_id_is_valid().
         *
         * @param applicationId the identifier for @application
         * @since 2.28
         */
        @GioVersion2_28
        set(applicationId) = g_application_set_application_id(gioApplicationPointer, applicationId)

    /**
     * Flags specifying the behaviour of the application.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open var flags: ApplicationFlags
        /**
         * Gets the flags for @application.
         *
         * See #GApplicationFlags.
         *
         * @return the flags for @application
         * @since 2.28
         */
        get() = g_application_get_flags(gioApplicationPointer).run {
            ApplicationFlags(this)
        }

        /**
         * Sets the flags for @application.
         *
         * The flags can only be modified if @application has not yet been
         * registered.
         *
         * See #GApplicationFlags.
         *
         * @param flags the flags for @application
         * @since 2.28
         */
        @GioVersion2_28
        set(flags) = g_application_set_flags(gioApplicationPointer, flags.mask)

    /**
     * Time (in milliseconds) to stay alive after becoming idle.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open var inactivityTimeout: guint
        /**
         * Gets the current inactivity timeout for the application.
         *
         * This is the amount of time (in milliseconds) after the last call to
         * g_application_release() before the application stops running.
         *
         * @return the timeout, in milliseconds
         * @since 2.28
         */
        get() = g_application_get_inactivity_timeout(gioApplicationPointer)

        /**
         * Sets the current inactivity timeout for the application.
         *
         * This is the amount of time (in milliseconds) after the last call to
         * g_application_release() before the application stops running.
         *
         * This call has no side effects of its own.  The value set here is only
         * used for next time g_application_release() drops the use count to
         * zero.  Any timeouts currently in progress are not impacted.
         *
         * @param inactivityTimeout the timeout, in milliseconds
         * @since 2.28
         */
        @GioVersion2_28
        set(inactivityTimeout) = g_application_set_inactivity_timeout(gioApplicationPointer, inactivityTimeout)

    /**
     * Whether the application is currently marked as busy through
     * g_application_mark_busy() or g_application_bind_busy_property().
     *
     * @since 2.44
     */
    @GioVersion2_44
    public open val isBusy: Boolean
        /**
         * Gets the application's current busy state, as set through
         * g_application_mark_busy() or g_application_bind_busy_property().
         *
         * @return true if @application is currently marked as busy
         * @since 2.44
         */
        get() = g_application_get_is_busy(gioApplicationPointer).asBoolean()

    /**
     * Whether [method@Gio.Application.register] has been called.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open val isRegistered: Boolean
        /**
         * Checks if @application is registered.
         *
         * An application is registered if g_application_register() has been
         * successfully called.
         *
         * @return true if @application is registered
         * @since 2.28
         */
        get() = g_application_get_is_registered(gioApplicationPointer).asBoolean()

    /**
     * Whether this application instance is remote.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open val isRemote: Boolean
        /**
         * Checks if @application is remote.
         *
         * If @application is remote then it means that another instance of
         * application already exists (the 'primary' instance).  Calls to
         * perform actions on @application will result in the actions being
         * performed by the primary instance.
         *
         * The value of this property cannot be accessed before
         * g_application_register() has been called.  See
         * g_application_get_is_registered().
         *
         * @return true if @application is remote
         * @since 2.28
         */
        get() = g_application_get_is_remote(gioApplicationPointer).asBoolean()

    /**
     * The base resource path for the application.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open var resourceBasePath: String?
        /**
         * Gets the resource base path of @application.
         *
         * See g_application_set_resource_base_path() for more information.
         *
         * @return the base resource path, if one is set
         * @since 2.42
         */
        get() = g_application_get_resource_base_path(gioApplicationPointer)?.toKString()

        /**
         * Sets (or unsets) the base resource path of @application.
         *
         * The path is used to automatically load various [application
         * resources][gresource] such as menu layouts and action descriptions.
         * The various types of resources will be found at fixed names relative
         * to the given base path.
         *
         * By default, the resource base path is determined from the application
         * ID by prefixing '/' and replacing each '.' with '/'.  This is done at
         * the time that the #GApplication object is constructed.  Changes to
         * the application ID after that point will not have an impact on the
         * resource base path.
         *
         * As an example, if the application has an ID of "org.example.app" then
         * the default resource base path will be "/org/example/app".  If this
         * is a #GtkApplication (and you have not manually changed the path)
         * then Gtk will then search for the menus of the application at
         * "/org/example/app/gtk/menus.ui".
         *
         * See #GResource for more information about adding resources to your
         * application.
         *
         * You can disable automatic resource loading functionality by setting
         * the path to null.
         *
         * Changing the resource base path once the application is running is
         * not recommended.  The point at which the resource path is consulted
         * for forming paths for various purposes is unspecified.  When writing
         * a sub-class of #GApplication you should either set the
         * #GApplication:resource-base-path property at construction time, or call
         * this function during the instance initialization. Alternatively, you
         * can call this function in the #GApplicationClass.startup virtual function,
         * before chaining up to the parent implementation.
         *
         * @param resourcePath the resource path to use
         * @since 2.42
         */
        @GioVersion2_42
        set(resourcePath) = g_application_set_resource_base_path(gioApplicationPointer, resourcePath)

    /**
     * Creates a new #GApplication instance.
     *
     * If non-null, the application id must be valid.  See
     * g_application_id_is_valid().
     *
     * If no application ID is given then some features of #GApplication
     * (most notably application uniqueness) will be disabled.
     *
     * @param applicationId the application id
     * @param flags the application flags
     * @return a new #GApplication instance
     */
    public constructor(
        applicationId: String? = null,
        flags: ApplicationFlags,
    ) : this(g_application_new(applicationId, flags.mask)!!.reinterpret())

    /**
     * Activates the application.
     *
     * In essence, this results in the #GApplication::activate signal being
     * emitted in the primary instance.
     *
     * The application must be registered before calling this function.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open fun activate(): Unit = g_application_activate(gioApplicationPointer)

    /**
     * Add an option to be handled by @application.
     *
     * Calling this function is the equivalent of calling
     * g_application_add_main_option_entries() with a single #GOptionEntry
     * that has its arg_data member set to null.
     *
     * The parsed arguments will be packed into a #GVariantDict which
     * is passed to #GApplication::handle-local-options. If
     * %G_APPLICATION_HANDLES_COMMAND_LINE is set, then it will also
     * be sent to the primary instance. See
     * g_application_add_main_option_entries() for more details.
     *
     * See #GOptionEntry for more documentation of the arguments.
     *
     * @param longName the long name of an option used to specify it in a commandline
     * @param shortName the short name of an option
     * @param flags flags from #GOptionFlags
     * @param arg the type of the option, as a #GOptionArg
     * @param description the description for the option in `--help` output
     * @param argDescription the placeholder to use for the extra argument
     *    parsed by the option in `--help` output
     * @since 2.42
     */
    @GioVersion2_42
    public open fun addMainOption(
        longName: String,
        shortName: Char,
        flags: OptionFlags,
        arg: OptionArg,
        description: String,
        argDescription: String? = null,
    ): Unit = g_application_add_main_option(
        gioApplicationPointer,
        longName,
        shortName.code.toByte(),
        flags.mask,
        arg.nativeValue,
        description,
        argDescription
    )

    /**
     * Adds a #GOptionGroup to the commandline handling of @application.
     *
     * This function is comparable to g_option_context_add_group().
     *
     * Unlike g_application_add_main_option_entries(), this function does
     * not deal with null @arg_data and never transmits options to the
     * primary instance.
     *
     * The reason for that is because, by the time the options arrive at the
     * primary instance, it is typically too late to do anything with them.
     * Taking the GTK option group as an example: GTK will already have been
     * initialised by the time the #GApplication::command-line handler runs.
     * In the case that this is not the first-running instance of the
     * application, the existing instance may already have been running for
     * a very long time.
     *
     * This means that the options from #GOptionGroup are only really usable
     * in the case that the instance of the application being run is the
     * first instance.  Passing options like `--display=` or `--gdk-debug=`
     * on future runs will have no effect on the existing primary instance.
     *
     * Calling this function will cause the options in the supplied option
     * group to be parsed, but it does not cause you to be "opted in" to the
     * new functionality whereby unrecognised options are rejected even if
     * %G_APPLICATION_HANDLES_COMMAND_LINE was given.
     *
     * @param group a #GOptionGroup
     * @since 2.40
     */
    @GioVersion2_40
    public open fun addOptionGroup(group: OptionGroup): Unit =
        g_application_add_option_group(gioApplicationPointer, group.glibOptionGroupPointer)

    /**
     * Marks @application as busy (see g_application_mark_busy()) while
     * @property on @object is true.
     *
     * The binding holds a reference to @application while it is active, but
     * not to @object. Instead, the binding is destroyed when @object is
     * finalized.
     *
     * @param object a #GObject
     * @param property the name of a boolean property of @object
     * @since 2.44
     */
    @GioVersion2_44
    public open fun bindBusyProperty(`object`: Object, `property`: String): Unit =
        g_application_bind_busy_property(gioApplicationPointer, `object`.gobjectObjectPointer.reinterpret(), `property`)

    /**
     * Gets the #GDBusConnection being used by the application, or null.
     *
     * If #GApplication is using its D-Bus backend then this function will
     * return the #GDBusConnection being used for uniqueness and
     * communication with the desktop environment and other instances of the
     * application.
     *
     * If #GApplication is not using D-Bus then this function will return
     * null.  This includes the situation where the D-Bus backend would
     * normally be in use but we were unable to connect to the bus.
     *
     * This function must not be called before the application has been
     * registered.  See g_application_get_is_registered().
     *
     * @return a #GDBusConnection, or null
     * @since 2.34
     */
    @GioVersion2_34
    public open fun getDbusConnection(): DBusConnection? =
        g_application_get_dbus_connection(gioApplicationPointer)?.run {
            DBusConnection(this)
        }

    /**
     * Gets the D-Bus object path being used by the application, or null.
     *
     * If #GApplication is using its D-Bus backend then this function will
     * return the D-Bus object path that #GApplication is using.  If the
     * application is the primary instance then there is an object published
     * at this path.  If the application is not the primary instance then
     * the result of this function is undefined.
     *
     * If #GApplication is not using D-Bus then this function will return
     * null.  This includes the situation where the D-Bus backend would
     * normally be in use but we were unable to connect to the bus.
     *
     * This function must not be called before the application has been
     * registered.  See g_application_get_is_registered().
     *
     * @return the object path, or null
     * @since 2.34
     */
    @GioVersion2_34
    public open fun getDbusObjectPath(): String? =
        g_application_get_dbus_object_path(gioApplicationPointer)?.toKString()

    /**
     * Gets the version of @application.
     *
     * @return the version of @application
     * @since 2.80
     */
    @GioVersion2_80
    public open fun getVersion(): String? = g_application_get_version(gioApplicationPointer)?.toKString()

    /**
     * Increases the use count of @application.
     *
     * Use this function to indicate that the application has a reason to
     * continue to run.  For example, g_application_hold() is called by GTK
     * when a toplevel window is on the screen.
     *
     * To cancel the hold, call g_application_release().
     */
    public open fun hold(): Unit = g_application_hold(gioApplicationPointer)

    /**
     * Increases the busy count of @application.
     *
     * Use this function to indicate that the application is busy, for instance
     * while a long running operation is pending.
     *
     * The busy state will be exposed to other processes, so a session shell will
     * use that information to indicate the state to the user (e.g. with a
     * spinner).
     *
     * To cancel the busy indication, use g_application_unmark_busy().
     *
     * The application must be registered before calling this function.
     *
     * @since 2.38
     */
    @GioVersion2_38
    public open fun markBusy(): Unit = g_application_mark_busy(gioApplicationPointer)

    /**
     * Immediately quits the application.
     *
     * Upon return to the mainloop, g_application_run() will return,
     * calling only the 'shutdown' function before doing so.
     *
     * The hold count is ignored.
     * Take care if your code has called g_application_hold() on the application and
     * is therefore still expecting it to exist.
     * (Note that you may have called g_application_hold() indirectly, for example
     * through gtk_application_add_window().)
     *
     * The result of calling g_application_run() again after it returns is
     * unspecified.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open fun quit(): Unit = g_application_quit(gioApplicationPointer)

    /**
     * Attempts registration of the application.
     *
     * This is the point at which the application discovers if it is the
     * primary instance or merely acting as a remote for an already-existing
     * primary instance.  This is implemented by attempting to acquire the
     * application identifier as a unique bus name on the session bus using
     * GDBus.
     *
     * If there is no application ID or if %G_APPLICATION_NON_UNIQUE was
     * given, then this process will always become the primary instance.
     *
     * Due to the internal architecture of GDBus, method calls can be
     * dispatched at any time (even if a main loop is not running).  For
     * this reason, you must ensure that any object paths that you wish to
     * register are registered before calling this function.
     *
     * If the application has already been registered then true is
     * returned with no work performed.
     *
     * The #GApplication::startup signal is emitted if registration succeeds
     * and @application is the primary instance (including the non-unique
     * case).
     *
     * In the event of an error (such as @cancellable being cancelled, or a
     * failure to connect to the session bus), false is returned and @error
     * is set appropriately.
     *
     * Note: the return value of this function is not an indicator that this
     * instance is or is not the primary instance of the application.  See
     * g_application_get_is_remote() for that.
     *
     * @param cancellable a #GCancellable, or null
     * @return true if registration succeeded
     * @since 2.28
     */
    @GioVersion2_28
    public open fun register(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_application_register(
            gioApplicationPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Decrease the use count of @application.
     *
     * When the use count reaches zero, the application will stop running.
     *
     * Never call this function except to cancel the effect of a previous
     * call to g_application_hold().
     */
    public open fun release(): Unit = g_application_release(gioApplicationPointer)

    /**
     * Runs the application.
     *
     * This function is intended to be run from main() and its return value
     * is intended to be returned by main(). Although you are expected to pass
     * the @argc, @argv parameters from main() to this function, it is possible
     * to pass null if @argv is not available or commandline handling is not
     * required.  Note that on Windows, @argc and @argv are ignored, and
     * g_win32_get_command_line() is called internally (for proper support
     * of Unicode commandline arguments).
     *
     * #GApplication will attempt to parse the commandline arguments.  You
     * can add commandline flags to the list of recognised options by way of
     * g_application_add_main_option_entries().  After this, the
     * #GApplication::handle-local-options signal is emitted, from which the
     * application can inspect the values of its #GOptionEntrys.
     *
     * #GApplication::handle-local-options is a good place to handle options
     * such as `--version`, where an immediate reply from the local process is
     * desired (instead of communicating with an already-running instance).
     * A #GApplication::handle-local-options handler can stop further processing
     * by returning a non-negative value, which then becomes the exit status of
     * the process.
     *
     * What happens next depends on the flags: if
     * %G_APPLICATION_HANDLES_COMMAND_LINE was specified then the remaining
     * commandline arguments are sent to the primary instance, where a
     * #GApplication::command-line signal is emitted.  Otherwise, the
     * remaining commandline arguments are assumed to be a list of files.
     * If there are no files listed, the application is activated via the
     * #GApplication::activate signal.  If there are one or more files, and
     * %G_APPLICATION_HANDLES_OPEN was specified then the files are opened
     * via the #GApplication::open signal.
     *
     * If you are interested in doing more complicated local handling of the
     * commandline then you should implement your own #GApplication subclass
     * and override local_command_line(). In this case, you most likely want
     * to return true from your local_command_line() implementation to
     * suppress the default handling. See
     * [gapplication-example-cmdline2.c][https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline2.c]
     * for an example.
     *
     * If, after the above is done, the use count of the application is zero
     * then the exit status is returned immediately.  If the use count is
     * non-zero then the default main context is iterated until the use count
     * falls to zero, at which point 0 is returned.
     *
     * If the %G_APPLICATION_IS_SERVICE flag is set, then the service will
     * run for as much as 10 seconds with a use count of zero while waiting
     * for the message that caused the activation to arrive.  After that,
     * if the use count falls to zero the application will exit immediately,
     * except in the case that g_application_set_inactivity_timeout() is in
     * use.
     *
     * This function sets the prgname (g_set_prgname()), if not already set,
     * to the basename of argv[0].
     *
     * Much like g_main_loop_run(), this function will acquire the main context
     * for the duration that the application is running.
     *
     * Since 2.40, applications that are not explicitly flagged as services
     * or launchers (ie: neither %G_APPLICATION_IS_SERVICE or
     * %G_APPLICATION_IS_LAUNCHER are given as flags) will check (from the
     * default handler for local_command_line) if "--gapplication-service"
     * was given in the command line.  If this flag is present then normal
     * commandline processing is interrupted and the
     * %G_APPLICATION_IS_SERVICE flag is set.  This provides a "compromise"
     * solution whereby running an application directly from the commandline
     * will invoke it in the normal way (which can be useful for debugging)
     * while still allowing applications to be D-Bus activated in service
     * mode.  The D-Bus service file should invoke the executable with
     * "--gapplication-service" as the sole commandline argument.  This
     * approach is suitable for use by most graphical applications but
     * should not be used from applications like editors that need precise
     * control over when processes invoked via the commandline will exit and
     * what their exit status will be.
     *
     * @param argc the argc from main() (or 0 if @argv is null)
     * @param argv the argv from main(), or null
     * @return the exit status
     * @since 2.28
     */
    @GioVersion2_28
    public open fun run(argc: gint, argv: List<String>? = null): gint = memScoped {
        return g_application_run(gioApplicationPointer, argc, argv?.toCStringList(this))
    }

    /**
     * Sends a notification on behalf of @application to the desktop shell.
     * There is no guarantee that the notification is displayed immediately,
     * or even at all.
     *
     * Notifications may persist after the application exits. It will be
     * D-Bus-activated when the notification or one of its actions is
     * activated.
     *
     * Modifying @notification after this call has no effect. However, the
     * object can be reused for a later call to this function.
     *
     * @id may be any string that uniquely identifies the event for the
     * application. It does not need to be in any special format. For
     * example, "new-message" might be appropriate for a notification about
     * new messages.
     *
     * If a previous notification was sent with the same @id, it will be
     * replaced with @notification and shown again as if it was a new
     * notification. This works even for notifications sent from a previous
     * execution of the application, as long as @id is the same string.
     *
     * @id may be null, but it is impossible to replace or withdraw
     * notifications without an id.
     *
     * If @notification is no longer relevant, it can be withdrawn with
     * g_application_withdraw_notification().
     *
     * It is an error to call this function if @application has no
     * application ID.
     *
     * @param id id of the notification, or null
     * @param notification the #GNotification to send
     * @since 2.40
     */
    @GioVersion2_40
    public open fun sendNotification(id: String? = null, notification: Notification): Unit =
        g_application_send_notification(gioApplicationPointer, id, notification.gioNotificationPointer)

    /**
     * This used to be how actions were associated with a #GApplication.
     * Now there is #GActionMap for that.
     *
     * @param actionGroup a #GActionGroup, or null
     * @since 2.28
     */
    @GioVersion2_28
    public open fun setActionGroup(actionGroup: ActionGroup? = null): Unit =
        g_application_set_action_group(gioApplicationPointer, actionGroup?.gioActionGroupPointer)

    /**
     * Sets or unsets the default application for the process, as returned
     * by g_application_get_default().
     *
     * This function does not take its own reference on @application.  If
     * @application is destroyed then the default application will revert
     * back to null.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open fun setDefault(): Unit = g_application_set_default(gioApplicationPointer)

    /**
     * Adds a description to the @application option context.
     *
     * See g_option_context_set_description() for more information.
     *
     * @param description a string to be shown in `--help` output
     *  after the list of options, or null
     * @since 2.56
     */
    @GioVersion2_56
    public open fun setOptionContextDescription(description: String? = null): Unit =
        g_application_set_option_context_description(gioApplicationPointer, description)

    /**
     * Sets the parameter string to be used by the commandline handling of @application.
     *
     * This function registers the argument to be passed to g_option_context_new()
     * when the internal #GOptionContext of @application is created.
     *
     * See g_option_context_new() for more information about @parameter_string.
     *
     * @param parameterString a string which is displayed
     *   in the first line of `--help` output, after the usage summary `programname [OPTION]`.
     * @since 2.56
     */
    @GioVersion2_56
    public open fun setOptionContextParameterString(parameterString: String? = null): Unit =
        g_application_set_option_context_parameter_string(gioApplicationPointer, parameterString)

    /**
     * Adds a summary to the @application option context.
     *
     * See g_option_context_set_summary() for more information.
     *
     * @param summary a string to be shown in `--help` output
     *  before the list of options, or null
     * @since 2.56
     */
    @GioVersion2_56
    public open fun setOptionContextSummary(summary: String? = null): Unit =
        g_application_set_option_context_summary(gioApplicationPointer, summary)

    /**
     * Sets the version number of @application. This will be used to implement
     * a `--version` command line argument
     *
     * The application version can only be modified if @application has not yet
     * been registered.
     *
     * @param version the version of @application
     * @since 2.80
     */
    @GioVersion2_80
    public open fun setVersion(version: String): Unit = g_application_set_version(gioApplicationPointer, version)

    /**
     * Destroys a binding between @property and the busy state of
     * @application that was previously created with
     * g_application_bind_busy_property().
     *
     * @param object a #GObject
     * @param property the name of a boolean property of @object
     * @since 2.44
     */
    @GioVersion2_44
    public open fun unbindBusyProperty(`object`: Object, `property`: String): Unit = g_application_unbind_busy_property(
        gioApplicationPointer,
        `object`.gobjectObjectPointer.reinterpret(),
        `property`
    )

    /**
     * Decreases the busy count of @application.
     *
     * When the busy count reaches zero, the new state will be propagated
     * to other processes.
     *
     * This function must only be called to cancel the effect of a previous
     * call to g_application_mark_busy().
     *
     * @since 2.38
     */
    @GioVersion2_38
    public open fun unmarkBusy(): Unit = g_application_unmark_busy(gioApplicationPointer)

    /**
     * Withdraws a notification that was sent with
     * g_application_send_notification().
     *
     * This call does nothing if a notification with @id doesn't exist or
     * the notification was never sent.
     *
     * This function works even for notifications sent in previous
     * executions of this application, as long @id is the same as it was for
     * the sent notification.
     *
     * Note that notifications are dismissed when the user clicks on one
     * of the buttons in a notification or triggers its default action, so
     * there is no need to explicitly withdraw the notification in that case.
     *
     * @param id id of a previously sent notification
     * @since 2.40
     */
    @GioVersion2_40
    public open fun withdrawNotification(id: String): Unit =
        g_application_withdraw_notification(gioApplicationPointer, id)

    /**
     * The ::activate signal is emitted on the primary instance when an
     * activation occurs. See g_application_activate().
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioApplicationPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     */
    public fun emitActivate() {
        g_signal_emit_by_name(gioApplicationPointer.reinterpret(), "activate")
    }

    /**
     * The ::command-line signal is emitted on the primary instance when
     * a commandline is not handled locally. See g_application_run() and
     * the #GApplicationCommandLine documentation for more information.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `commandLine` a #GApplicationCommandLine representing the
     *     passed commandline. Returns An integer that is set as the exit status for the calling
     *   process. See g_application_command_line_set_exit_status().
     */
    public fun onCommandLine(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (commandLine: ApplicationCommandLine) -> gint,
    ): ULong = g_signal_connect_data(
        gioApplicationPointer,
        "command-line",
        onCommandLineFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The ::handle-local-options signal is emitted on the local instance
     * after the parsing of the commandline options has occurred.
     *
     * You can add options to be recognised during commandline option
     * parsing using g_application_add_main_option_entries() and
     * g_application_add_option_group().
     *
     * Signal handlers can inspect @options (along with values pointed to
     * from the @arg_data of an installed #GOptionEntrys) in order to
     * decide to perform certain actions, including direct local handling
     * (which may be useful for options like --version).
     *
     * In the event that the application is marked
     * %G_APPLICATION_HANDLES_COMMAND_LINE the "normal processing" will
     * send the @options dictionary to the primary instance where it can be
     * read with g_application_command_line_get_options_dict().  The signal
     * handler can modify the dictionary before returning, and the
     * modified dictionary will be sent.
     *
     * In the event that %G_APPLICATION_HANDLES_COMMAND_LINE is not set,
     * "normal processing" will treat the remaining uncollected command
     * line arguments as filenames or URIs.  If there are no arguments,
     * the application is activated by g_application_activate().  One or
     * more arguments results in a call to g_application_open().
     *
     * If you want to handle the local commandline arguments for yourself
     * by converting them to calls to g_application_open() or
     * g_action_group_activate_action() then you must be sure to register
     * the application first.  You should probably not call
     * g_application_activate() for yourself, however: just return -1 and
     * allow the default handler to do it for you.  This will ensure that
     * the `--gapplication-service` switch works properly (i.e. no activation
     * in that case).
     *
     * Note that this signal is emitted from the default implementation of
     * local_command_line().  If you override that function and don't
     * chain up then this signal will never be emitted.
     *
     * You can override local_command_line() if you need more powerful
     * capabilities than what is provided here, but this should not
     * normally be required.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `options` the options dictionary. Returns an exit code. If you have handled your options and want
     * to exit the process, return a non-negative option, 0 for success,
     * and a positive value for failure. To continue, return -1 to let
     * the default option processing continue.
     * @since 2.40
     */
    @GioVersion2_40
    public fun onHandleLocalOptions(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (options: VariantDict) -> gint,
    ): ULong = g_signal_connect_data(
        gioApplicationPointer,
        "handle-local-options",
        onHandleLocalOptionsFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The ::name-lost signal is emitted only on the registered primary instance
     * when a new instance has taken over. This can only happen if the application
     * is using the %G_APPLICATION_ALLOW_REPLACEMENT flag.
     *
     * The default handler for this signal calls g_application_quit().
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true if the signal has been handled
     * @since 2.60
     */
    @GioVersion2_60
    public fun onNameLost(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gioApplicationPointer,
            "name-lost",
            onNameLostFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The ::shutdown signal is emitted only on the registered primary instance
     * immediately after the main loop terminates.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onShutdown(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioApplicationPointer,
            "shutdown",
            onShutdownFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "shutdown" signal. See [onShutdown].
     */
    public fun emitShutdown() {
        g_signal_emit_by_name(gioApplicationPointer.reinterpret(), "shutdown")
    }

    /**
     * The ::startup signal is emitted on the primary instance immediately
     * after registration. See g_application_register().
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onStartup(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioApplicationPointer,
            "startup",
            onStartupFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "startup" signal. See [onStartup].
     */
    public fun emitStartup() {
        g_signal_emit_by_name(gioApplicationPointer.reinterpret(), "startup")
    }

    public companion object : TypeCompanion<Application> {
        override val type: GeneratedClassKGType<Application> =
            GeneratedClassKGType(g_application_get_type()) { Application(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Returns the default #GApplication instance for this process.
         *
         * Normally there is only one #GApplication per process and it becomes
         * the default when it is created.  You can exercise more control over
         * this by using g_application_set_default().
         *
         * If there is no default application then null is returned.
         *
         * @return the default application for this process, or null
         * @since 2.32
         */
        @GioVersion2_32
        public fun getDefault(): Application? = g_application_get_default()?.run {
            Application(this)
        }

        /**
         * Checks if @application_id is a valid application identifier.
         *
         * A valid ID is required for calls to g_application_new() and
         * g_application_set_application_id().
         *
         * Application identifiers follow the same format as
         * [D-Bus well-known bus names](https://dbus.freedesktop.org/doc/dbus-specification.html#message-protocol-names-bus).
         * For convenience, the restrictions on application identifiers are
         * reproduced here:
         *
         * - Application identifiers are composed of 1 or more elements separated by a
         *   period (`.`) character. All elements must contain at least one character.
         *
         * - Each element must only contain the ASCII characters `[A-Z][a-z][0-9]_-`,
         *   with `-` discouraged in new application identifiers. Each element must not
         *   begin with a digit.
         *
         * - Application identifiers must contain at least one `.` (period) character
         *   (and thus at least two elements).
         *
         * - Application identifiers must not begin with a `.` (period) character.
         *
         * - Application identifiers must not exceed 255 characters.
         *
         * Note that the hyphen (`-`) character is allowed in application identifiers,
         * but is problematic or not allowed in various specifications and APIs that
         * refer to D-Bus, such as
         * [Flatpak application IDs](http://docs.flatpak.org/en/latest/introduction.html#identifiers),
         * the
         * [`DBusActivatable` interface in the Desktop Entry Specification](https://specifications.freedesktop.org/desktop-entry-spec/desktop-entry-spec-latest.html#dbus),
         * and the convention that an application's "main" interface and object path
         * resemble its application identifier and bus name. To avoid situations that
         * require special-case handling, it is recommended that new application
         * identifiers consistently replace hyphens with underscores.
         *
         * Like D-Bus interface names, application identifiers should start with the
         * reversed DNS domain name of the author of the interface (in lower-case), and
         * it is conventional for the rest of the application identifier to consist of
         * words run together, with initial capital letters.
         *
         * As with D-Bus interface names, if the author's DNS domain name contains
         * hyphen/minus characters they should be replaced by underscores, and if it
         * contains leading digits they should be escaped by prepending an underscore.
         * For example, if the owner of 7-zip.org used an application identifier for an
         * archiving application, it might be named `org._7_zip.Archiver`.
         *
         * @param applicationId a potential application identifier
         * @return true if @application_id is valid
         */
        public fun idIsValid(applicationId: String): Boolean = g_application_id_is_valid(applicationId).asBoolean()

        /**
         * Get the GType of Application
         *
         * @return the GType
         */
        public fun getType(): GType = g_application_get_type()
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onCommandLineFunc: CPointer<CFunction<(CPointer<GApplicationCommandLine>) -> gint>> =
    staticCFunction {
            _: COpaquePointer,
            commandLine: CPointer<GApplicationCommandLine>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(commandLine: ApplicationCommandLine) -> gint>().get().invoke(
            commandLine!!.run {
                ApplicationCommandLine(this)
            }
        )
    }
        .reinterpret()

private val onHandleLocalOptionsFunc: CPointer<CFunction<(CPointer<GVariantDict>) -> gint>> =
    staticCFunction {
            _: COpaquePointer,
            options: CPointer<GVariantDict>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(options: VariantDict) -> gint>().get().invoke(
            options!!.run {
                VariantDict(this)
            }
        )
    }
        .reinterpret()

private val onNameLostFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val onShutdownFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onStartupFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
