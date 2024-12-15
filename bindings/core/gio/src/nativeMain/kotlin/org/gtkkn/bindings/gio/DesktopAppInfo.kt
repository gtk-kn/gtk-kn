// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_36
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.bindings.gio.annotations.GioVersion2_42
import org.gtkkn.bindings.gio.annotations.GioVersion2_56
import org.gtkkn.bindings.gio.annotations.GioVersion2_58
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.KeyFile
import org.gtkkn.bindings.glib.SpawnChildSetupFunc
import org.gtkkn.bindings.glib.SpawnChildSetupFuncFunc
import org.gtkkn.bindings.glib.SpawnFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAppInfo
import org.gtkkn.native.gio.GDesktopAppInfo
import org.gtkkn.native.gio.g_desktop_app_info_get_action_name
import org.gtkkn.native.gio.g_desktop_app_info_get_boolean
import org.gtkkn.native.gio.g_desktop_app_info_get_categories
import org.gtkkn.native.gio.g_desktop_app_info_get_filename
import org.gtkkn.native.gio.g_desktop_app_info_get_generic_name
import org.gtkkn.native.gio.g_desktop_app_info_get_implementations
import org.gtkkn.native.gio.g_desktop_app_info_get_is_hidden
import org.gtkkn.native.gio.g_desktop_app_info_get_keywords
import org.gtkkn.native.gio.g_desktop_app_info_get_locale_string
import org.gtkkn.native.gio.g_desktop_app_info_get_nodisplay
import org.gtkkn.native.gio.g_desktop_app_info_get_show_in
import org.gtkkn.native.gio.g_desktop_app_info_get_startup_wm_class
import org.gtkkn.native.gio.g_desktop_app_info_get_string
import org.gtkkn.native.gio.g_desktop_app_info_get_type
import org.gtkkn.native.gio.g_desktop_app_info_has_key
import org.gtkkn.native.gio.g_desktop_app_info_launch_action
import org.gtkkn.native.gio.g_desktop_app_info_launch_uris_as_manager
import org.gtkkn.native.gio.g_desktop_app_info_launch_uris_as_manager_with_fds
import org.gtkkn.native.gio.g_desktop_app_info_list_actions
import org.gtkkn.native.gio.g_desktop_app_info_new
import org.gtkkn.native.gio.g_desktop_app_info_new_from_filename
import org.gtkkn.native.gio.g_desktop_app_info_new_from_keyfile
import org.gtkkn.native.gio.g_desktop_app_info_set_desktop_env
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List as CollectionsList
import org.gtkkn.bindings.glib.List as GlibList

/**
 * `GDesktopAppInfo` is an implementation of [iface@Gio.AppInfo] based on
 * desktop files.
 *
 * Note that `<gio/gdesktopappinfo.h>` belongs to the UNIX-specific
 * GIO interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file or the `GioUnix-2.0` GIR namespace when using it.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 * - function `search`: Nested array types are not supported
 */
public open class DesktopAppInfo(pointer: CPointer<GDesktopAppInfo>) :
    Object(pointer.reinterpret()),
    AppInfo,
    KGTyped {
    public val gioDesktopAppInfoPointer: CPointer<GDesktopAppInfo>
        get() = gPointer.reinterpret()

    override val gioAppInfoPointer: CPointer<GAppInfo>
        get() = gPointer.reinterpret()

    /**
     * The origin filename of this #GDesktopAppInfo
     */
    public open val filename: String?
        /**
         * When @info was created from a known filename, return it.  In some
         * situations such as the #GDesktopAppInfo returned from
         * g_desktop_app_info_new_from_keyfile(), this function will return null.
         *
         * @return The full path to the file for @info,
         *     or null if not known.
         * @since 2.24
         */
        get() = g_desktop_app_info_get_filename(gioDesktopAppInfoPointer.reinterpret())?.toKString()

    /**
     * Creates a new #GDesktopAppInfo based on a desktop file id.
     *
     * A desktop file id is the basename of the desktop file, including the
     * .desktop extension. GIO is looking for a desktop file with this name
     * in the `applications` subdirectories of the XDG
     * data directories (i.e. the directories specified in the `XDG_DATA_HOME`
     * and `XDG_DATA_DIRS` environment variables). GIO also supports the
     * prefix-to-subdirectory mapping that is described in the
     * [Menu Spec](http://standards.freedesktop.org/menu-spec/latest/)
     * (i.e. a desktop id of kde-foo.desktop will match
     * `/usr/share/applications/kde/foo.desktop`).
     *
     * @param desktopId the desktop file id
     * @return a new #GDesktopAppInfo, or null if no desktop
     *     file with that id exists.
     */
    public constructor(desktopId: String) : this(g_desktop_app_info_new(desktopId)!!.reinterpret())

    /**
     * Creates a new #GDesktopAppInfo.
     *
     * @param keyFile an opened #GKeyFile
     * @return a new #GDesktopAppInfo or null on error.
     * @since 2.18
     */
    public constructor(
        keyFile: KeyFile,
    ) : this(g_desktop_app_info_new_from_keyfile(keyFile.glibKeyFilePointer.reinterpret())!!.reinterpret())

    /**
     * Gets the user-visible display name of the "additional application
     * action" specified by @action_name.
     *
     * This corresponds to the "Name" key within the keyfile group for the
     * action.
     *
     * @param actionName the name of the action as from
     *   g_desktop_app_info_list_actions()
     * @return the locale-specific action name
     * @since 2.38
     */
    @GioVersion2_38
    public open fun getActionName(actionName: String): String =
        g_desktop_app_info_get_action_name(gioDesktopAppInfoPointer.reinterpret(), actionName)?.toKString()
            ?: error("Expected not null string")

    /**
     * Looks up a boolean value in the keyfile backing @info.
     *
     * The @key is looked up in the "Desktop Entry" group.
     *
     * @param key the key to look up
     * @return the boolean value, or false if the key
     *     is not found
     * @since 2.36
     */
    @GioVersion2_36
    public open fun getBoolean(key: String): Boolean =
        g_desktop_app_info_get_boolean(gioDesktopAppInfoPointer.reinterpret(), key).asBoolean()

    /**
     * Gets the categories from the desktop file.
     *
     * @return The unparsed Categories key from the desktop file;
     *     i.e. no attempt is made to split it by ';' or validate it.
     */
    public open fun getCategories(): String? =
        g_desktop_app_info_get_categories(gioDesktopAppInfoPointer.reinterpret())?.toKString()

    /**
     * Gets the generic name from the desktop file.
     *
     * @return The value of the GenericName key
     */
    public open fun getGenericName(): String? =
        g_desktop_app_info_get_generic_name(gioDesktopAppInfoPointer.reinterpret())?.toKString()

    /**
     * A desktop file is hidden if the Hidden key in it is
     * set to True.
     *
     * @return true if hidden, false otherwise.
     */
    public open fun getIsHidden(): Boolean =
        g_desktop_app_info_get_is_hidden(gioDesktopAppInfoPointer.reinterpret()).asBoolean()

    /**
     * Gets the keywords from the desktop file.
     *
     * @return The value of the Keywords key
     * @since 2.32
     */
    @GioVersion2_32
    public open fun getKeywords(): CollectionsList<String> =
        g_desktop_app_info_get_keywords(gioDesktopAppInfoPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Looks up a localized string value in the keyfile backing @info
     * translated to the current locale.
     *
     * The @key is looked up in the "Desktop Entry" group.
     *
     * @param key the key to look up
     * @return a newly allocated string, or null if the key
     *     is not found
     * @since 2.56
     */
    @GioVersion2_56
    public open fun getLocaleString(key: String): String? =
        g_desktop_app_info_get_locale_string(gioDesktopAppInfoPointer.reinterpret(), key)?.toKString()

    /**
     * Gets the value of the NoDisplay key, which helps determine if the
     * application info should be shown in menus. See
     * %G_KEY_FILE_DESKTOP_KEY_NO_DISPLAY and g_app_info_should_show().
     *
     * @return The value of the NoDisplay key
     * @since 2.30
     */
    @GioVersion2_30
    public open fun getNodisplay(): Boolean =
        g_desktop_app_info_get_nodisplay(gioDesktopAppInfoPointer.reinterpret()).asBoolean()

    /**
     * Checks if the application info should be shown in menus that list available
     * applications for a specific name of the desktop, based on the
     * `OnlyShowIn` and `NotShowIn` keys.
     *
     * @desktop_env should typically be given as null, in which case the
     * `XDG_CURRENT_DESKTOP` environment variable is consulted.  If you want
     * to override the default mechanism then you may specify @desktop_env,
     * but this is not recommended.
     *
     * Note that g_app_info_should_show() for @info will include this check (with
     * null for @desktop_env) as well as additional checks.
     *
     * @param desktopEnv a string specifying a desktop name
     * @return true if the @info should be shown in @desktop_env according to the
     * `OnlyShowIn` and `NotShowIn` keys, false
     * otherwise.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun getShowIn(desktopEnv: String? = null): Boolean =
        g_desktop_app_info_get_show_in(gioDesktopAppInfoPointer.reinterpret(), desktopEnv).asBoolean()

    /**
     * Retrieves the StartupWMClass field from @info. This represents the
     * WM_CLASS property of the main window of the application, if launched
     * through @info.
     *
     * @return the startup WM class, or null if none is set
     * in the desktop file.
     * @since 2.34
     */
    @GioVersion2_34
    public open fun getStartupWmClass(): String? =
        g_desktop_app_info_get_startup_wm_class(gioDesktopAppInfoPointer.reinterpret())?.toKString()

    /**
     * Looks up a string value in the keyfile backing @info.
     *
     * The @key is looked up in the "Desktop Entry" group.
     *
     * @param key the key to look up
     * @return a newly allocated string, or null if the key
     *     is not found
     * @since 2.36
     */
    @GioVersion2_36
    public open fun getString(key: String): String? =
        g_desktop_app_info_get_string(gioDesktopAppInfoPointer.reinterpret(), key)?.toKString()

    /**
     * Returns whether @key exists in the "Desktop Entry" group
     * of the keyfile backing @info.
     *
     * @param key the key to look up
     * @return true if the @key exists
     * @since 2.36
     */
    @GioVersion2_36
    public open fun hasKey(key: String): Boolean =
        g_desktop_app_info_has_key(gioDesktopAppInfoPointer.reinterpret(), key).asBoolean()

    /**
     * Activates the named application action.
     *
     * You may only call this function on action names that were
     * returned from g_desktop_app_info_list_actions().
     *
     * Note that if the main entry of the desktop file indicates that the
     * application supports startup notification, and @launch_context is
     * non-null, then startup notification will be used when activating the
     * action (and as such, invocation of the action on the receiving side
     * must signal the end of startup notification when it is completed).
     * This is the expected behaviour of applications declaring additional
     * actions, as per the desktop file specification.
     *
     * As with g_app_info_launch() there is no way to detect failures that
     * occur while using this function.
     *
     * @param actionName the name of the action as from
     *   g_desktop_app_info_list_actions()
     * @param launchContext a #GAppLaunchContext
     * @since 2.38
     */
    @GioVersion2_38
    public open fun launchAction(actionName: String, launchContext: AppLaunchContext? = null): Unit =
        g_desktop_app_info_launch_action(
            gioDesktopAppInfoPointer.reinterpret(),
            actionName,
            launchContext?.gioAppLaunchContextPointer?.reinterpret()
        )

    /**
     * This function performs the equivalent of g_app_info_launch_uris(),
     * but is intended primarily for operating system components that
     * launch applications.  Ordinary applications should use
     * g_app_info_launch_uris().
     *
     * If the application is launched via GSpawn, then @spawn_flags, @user_setup
     * and @user_setup_data are used for the call to g_spawn_async().
     * Additionally, @pid_callback (with @pid_callback_data) will be called to
     * inform about the PID of the created process. See g_spawn_async_with_pipes()
     * for information on certain parameter conditions that can enable an
     * optimized posix_spawn() codepath to be used.
     *
     * If application launching occurs via some other mechanism (eg: D-Bus
     * activation) then @spawn_flags, @user_setup, @user_setup_data,
     * @pid_callback and @pid_callback_data are ignored.
     *
     * @param uris List of URIs
     * @param launchContext a #GAppLaunchContext
     * @param spawnFlags #GSpawnFlags, used for each process
     * @param userSetup a #GSpawnChildSetupFunc, used once
     *     for each process.
     * @param pidCallback Callback for child processes
     * @return true on successful launch, false otherwise.
     */
    public open fun launchUrisAsManager(
        uris: GlibList,
        launchContext: AppLaunchContext? = null,
        spawnFlags: SpawnFlags,
        userSetup: SpawnChildSetupFunc?,
        pidCallback: DesktopAppLaunchCallback?,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_desktop_app_info_launch_uris_as_manager(
            gioDesktopAppInfoPointer.reinterpret(), uris.glibListPointer.reinterpret(), launchContext?.gioAppLaunchContextPointer?.reinterpret(), spawnFlags.mask,
            userSetup?.let {
                SpawnChildSetupFuncFunc.reinterpret()
            },
            userSetup?.let {
                StableRef.create(userSetup).asCPointer()
            },
            pidCallback?.let {
                DesktopAppLaunchCallbackFunc.reinterpret()
            },
            pidCallback?.let { StableRef.create(pidCallback).asCPointer() }, gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Equivalent to g_desktop_app_info_launch_uris_as_manager() but allows
     * you to pass in file descriptors for the stdin, stdout and stderr streams
     * of the launched process.
     *
     * If application launching occurs via some non-spawn mechanism (e.g. D-Bus
     * activation) then @stdin_fd, @stdout_fd and @stderr_fd are ignored.
     *
     * @param uris List of URIs
     * @param launchContext a #GAppLaunchContext
     * @param spawnFlags #GSpawnFlags, used for each process
     * @param userSetup a #GSpawnChildSetupFunc, used once
     *     for each process.
     * @param pidCallback Callback for child processes
     * @param stdinFd file descriptor to use for child's stdin, or -1
     * @param stdoutFd file descriptor to use for child's stdout, or -1
     * @param stderrFd file descriptor to use for child's stderr, or -1
     * @return true on successful launch, false otherwise.
     * @since 2.58
     */
    @GioVersion2_58
    public open fun launchUrisAsManagerWithFds(
        uris: GlibList,
        launchContext: AppLaunchContext? = null,
        spawnFlags: SpawnFlags,
        userSetup: SpawnChildSetupFunc?,
        pidCallback: DesktopAppLaunchCallback?,
        stdinFd: gint,
        stdoutFd: gint,
        stderrFd: gint,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_desktop_app_info_launch_uris_as_manager_with_fds(
            gioDesktopAppInfoPointer.reinterpret(), uris.glibListPointer.reinterpret(), launchContext?.gioAppLaunchContextPointer?.reinterpret(), spawnFlags.mask,
            userSetup?.let {
                SpawnChildSetupFuncFunc.reinterpret()
            },
            userSetup?.let {
                StableRef.create(userSetup).asCPointer()
            },
            pidCallback?.let {
                DesktopAppLaunchCallbackFunc.reinterpret()
            },
            pidCallback?.let {
                StableRef.create(pidCallback).asCPointer()
            },
            stdinFd, stdoutFd, stderrFd, gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Returns the list of "additional application actions" supported on the
     * desktop file, as per the desktop file specification.
     *
     * As per the specification, this is the list of actions that are
     * explicitly listed in the "Actions" key of the [Desktop Entry] group.
     *
     * @return a list of strings, always non-null
     * @since 2.38
     */
    @GioVersion2_38
    public open fun listActions(): CollectionsList<String> =
        g_desktop_app_info_list_actions(gioDesktopAppInfoPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    public companion object : TypeCompanion<DesktopAppInfo> {
        override val type: GeneratedClassKGType<DesktopAppInfo> =
            GeneratedClassKGType(g_desktop_app_info_get_type()) { DesktopAppInfo(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a new #GDesktopAppInfo based on a desktop file id.
         *
         * A desktop file id is the basename of the desktop file, including the
         * .desktop extension. GIO is looking for a desktop file with this name
         * in the `applications` subdirectories of the XDG
         * data directories (i.e. the directories specified in the `XDG_DATA_HOME`
         * and `XDG_DATA_DIRS` environment variables). GIO also supports the
         * prefix-to-subdirectory mapping that is described in the
         * [Menu Spec](http://standards.freedesktop.org/menu-spec/latest/)
         * (i.e. a desktop id of kde-foo.desktop will match
         * `/usr/share/applications/kde/foo.desktop`).
         *
         * @param desktopId the desktop file id
         * @return a new #GDesktopAppInfo, or null if no desktop
         *     file with that id exists.
         */
        public fun new(desktopId: String): DesktopAppInfo =
            DesktopAppInfo(g_desktop_app_info_new(desktopId)!!.reinterpret())

        /**
         * Creates a new #GDesktopAppInfo.
         *
         * @param filename the path of a desktop file, in the GLib
         *      filename encoding
         * @return a new #GDesktopAppInfo or null on error.
         */
        public fun newFromFilename(filename: String): DesktopAppInfo =
            DesktopAppInfo(g_desktop_app_info_new_from_filename(filename)!!.reinterpret())

        /**
         * Gets all applications that implement @interface.
         *
         * An application implements an interface if that interface is listed in
         * the Implements= line of the desktop file of the application.
         *
         * @param interface the name of the interface
         * @return a list of #GDesktopAppInfo
         * objects.
         * @since 2.42
         */
        @GioVersion2_42
        public fun getImplementations(`interface`: String): GlibList =
            g_desktop_app_info_get_implementations(`interface`)!!.run {
                GlibList(reinterpret())
            }

        /**
         * Sets the name of the desktop that the application is running in.
         * This is used by g_app_info_should_show() and
         * g_desktop_app_info_get_show_in() to evaluate the
         * `OnlyShowIn` and `NotShowIn`
         * desktop entry fields.
         *
         * Should be called only once; subsequent calls are ignored.
         *
         * @param desktopEnv a string specifying what desktop this is
         */
        public fun setDesktopEnv(desktopEnv: String): Unit = g_desktop_app_info_set_desktop_env(desktopEnv)

        /**
         * Get the GType of DesktopAppInfo
         *
         * @return the GType
         */
        public fun getType(): GType = g_desktop_app_info_get_type()
    }
}
