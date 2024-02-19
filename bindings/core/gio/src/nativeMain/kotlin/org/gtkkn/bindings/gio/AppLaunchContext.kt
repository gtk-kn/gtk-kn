// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAppInfo
import org.gtkkn.native.gio.GAppLaunchContext
import org.gtkkn.native.gio.g_app_launch_context_get_display
import org.gtkkn.native.gio.g_app_launch_context_get_environment
import org.gtkkn.native.gio.g_app_launch_context_get_startup_notify_id
import org.gtkkn.native.gio.g_app_launch_context_get_type
import org.gtkkn.native.gio.g_app_launch_context_launch_failed
import org.gtkkn.native.gio.g_app_launch_context_new
import org.gtkkn.native.gio.g_app_launch_context_setenv
import org.gtkkn.native.gio.g_app_launch_context_unsetenv
import org.gtkkn.native.glib.GVariant
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List as CollectionsList
import org.gtkkn.bindings.glib.List as GlibList

/**
 * Integrating the launch with the launching application. This is used to
 * handle for instance startup notification and launching the new application
 * on the same screen as the launching window.
 */
public open class AppLaunchContext(
    pointer: CPointer<GAppLaunchContext>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gioAppLaunchContextPointer: CPointer<GAppLaunchContext>
        get() = gPointer.reinterpret()

    /**
     * Creates a new application launch context. This is not normally used,
     * instead you instantiate a subclass of this, such as #GdkAppLaunchContext.
     *
     * @return a #GAppLaunchContext.
     */
    public constructor() : this(g_app_launch_context_new()!!.reinterpret())

    /**
     * Gets the display string for the @context. This is used to ensure new
     * applications are started on the same display as the launching
     * application, by setting the `DISPLAY` environment variable.
     *
     * @param info a #GAppInfo
     * @param files a #GList of #GFile objects
     * @return a display string for the display.
     */
    public open fun getDisplay(
        info: AppInfo,
        files: GlibList,
    ): String? =
        g_app_launch_context_get_display(
            gioAppLaunchContextPointer.reinterpret(),
            info.gioAppInfoPointer,
            files.glibListPointer
        )?.toKString()

    /**
     * Gets the complete environment variable list to be passed to
     * the child process when @context is used to launch an application.
     * This is a null-terminated array of strings, where each string has
     * the form `KEY=VALUE`.
     *
     * @return
     *     the child's environment
     * @since 2.32
     */
    public open fun getEnvironment(): CollectionsList<String> =
        g_app_launch_context_get_environment(gioAppLaunchContextPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Initiates startup notification for the application and returns the
     * `DESKTOP_STARTUP_ID` for the launched operation, if supported.
     *
     * Startup notification IDs are defined in the
     * [FreeDesktop.Org Startup Notifications
     * standard](http://standards.freedesktop.org/startup-notification-spec/startup-notification-latest.txt).
     *
     * @param info a #GAppInfo
     * @param files a #GList of of #GFile objects
     * @return a startup notification ID for the application, or null if
     *     not supported.
     */
    public open fun getStartupNotifyId(
        info: AppInfo,
        files: GlibList,
    ): String? =
        g_app_launch_context_get_startup_notify_id(
            gioAppLaunchContextPointer.reinterpret(),
            info.gioAppInfoPointer,
            files.glibListPointer
        )?.toKString()

    /**
     * Called when an application has failed to launch, so that it can cancel
     * the application startup notification started in g_app_launch_context_get_startup_notify_id().
     *
     * @param startupNotifyId the startup notification id that was returned by
     * g_app_launch_context_get_startup_notify_id().
     */
    public open fun launchFailed(startupNotifyId: String): Unit =
        g_app_launch_context_launch_failed(
            gioAppLaunchContextPointer.reinterpret(),
            startupNotifyId
        )

    /**
     * Arranges for @variable to be set to @value in the child's
     * environment when @context is used to launch an application.
     *
     * @param variable the environment variable to set
     * @param value the value for to set the variable to.
     * @since 2.32
     */
    public open fun setenv(
        variable: String,
        `value`: String,
    ): Unit = g_app_launch_context_setenv(gioAppLaunchContextPointer.reinterpret(), variable, `value`)

    /**
     * Arranges for @variable to be unset in the child's environment
     * when @context is used to launch an application.
     *
     * @param variable the environment variable to remove
     * @since 2.32
     */
    public open fun unsetenv(variable: String): Unit =
        g_app_launch_context_unsetenv(gioAppLaunchContextPointer.reinterpret(), variable)

    /**
     * The #GAppLaunchContext::launch-failed signal is emitted when a #GAppInfo launch
     * fails. The startup notification id is provided, so that the launcher
     * can cancel the startup notification.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `startupNotifyId` the startup notification id
     * for the failed launch
     * @since 2.36
     */
    public fun connectLaunchFailed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (startupNotifyId: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "launch-failed",
            connectLaunchFailedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The #GAppLaunchContext::launch-started signal is emitted when a #GAppInfo is
     * about to be launched. If non-null the @platform_data is an
     * GVariant dictionary mapping strings to variants (ie `a{sv}`), which
     * contains additional, platform-specific data about this launch. On
     * UNIX, at least the `startup-notification-id` keys will be
     * present.
     *
     * The value of the `startup-notification-id` key (type `s`) is a startup
     * notification ID corresponding to the format from the [startup-notification
     * specification](https://specifications.freedesktop.org/startup-notification-spec/startup-notification-0.1.txt).
     * It allows tracking the progress of the launchee through startup.
     *
     * It is guaranteed that this signal is followed by either a #GAppLaunchContext::launched or
     * #GAppLaunchContext::launch-failed signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `info` the #GAppInfo that is about to be
     * launched; `platformData` additional platform-specific data for this launch
     * @since 2.72
     */
    public fun connectLaunchStarted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (info: AppInfo, platformData: Variant?) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "launch-started",
            connectLaunchStartedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The #GAppLaunchContext::launched signal is emitted when a #GAppInfo is successfully
     * launched. The @platform_data is an GVariant dictionary mapping
     * strings to variants (ie `a{sv}`), which contains additional,
     * platform-specific data about this launch. On UNIX, at least the
     * `pid` and `startup-notification-id` keys will be present.
     *
     * Since 2.72 the `pid` may be 0 if the process id wasn't known (for
     * example if the process was launched via D-Bus). The `pid` may not be
     * set at all in subsequent releases.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `info` the #GAppInfo that was just launched;
     * `platformData` additional platform-specific data for this launch
     * @since 2.36
     */
    public fun connectLaunched(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (info: AppInfo, platformData: Variant) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "launched",
            connectLaunchedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<AppLaunchContext> {
        override val type: GeneratedClassKGType<AppLaunchContext> =
            GeneratedClassKGType(g_app_launch_context_get_type()) {
                AppLaunchContext(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }
    }
}

private val connectLaunchFailedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            startupNotifyId: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(startupNotifyId: String) -> Unit>().get().invoke(
            startupNotifyId?.toKString()
                ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val connectLaunchStartedFunc: CPointer<
    CFunction<
        (
            CPointer<GAppInfo>,
            CPointer<GVariant>?,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            info: CPointer<GAppInfo>?,
            platformData: CPointer<GVariant>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                info: AppInfo,
                platformData: Variant?,
            ) -> Unit
        >().get().invoke(
            info!!.run {
                AppInfo.wrap(reinterpret())
            },
            platformData?.run {
                Variant(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectLaunchedFunc: CPointer<
    CFunction<
        (
            CPointer<GAppInfo>,
            CPointer<GVariant>,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            info: CPointer<GAppInfo>?,
            platformData: CPointer<GVariant>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(info: AppInfo, platformData: Variant) -> Unit>().get().invoke(
            info!!.run {
                AppInfo.wrap(reinterpret())
            },
            platformData!!.run {
                Variant(reinterpret())
            }
        )
    }
        .reinterpret()
