// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_36
import org.gtkkn.bindings.gio.annotations.GioVersion2_72
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.toKStringList
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
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
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
public open class AppLaunchContext(public val gioAppLaunchContextPointer: CPointer<GAppLaunchContext>) :
    Object(gioAppLaunchContextPointer.reinterpret()),
    KGTyped {
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
    public open fun getDisplay(info: AppInfo, files: GlibList): String? = g_app_launch_context_get_display(
        gioAppLaunchContextPointer,
        info.gioAppInfoPointer,
        files.glibListPointer
    )?.toKString()

    /**
     * Gets the complete environment variable list to be passed to
     * the child process when @context is used to launch an application.
     * This is a null-terminated array of strings, where each string has
     * the form `KEY=VALUE`.
     *
     * @return the child's environment
     * @since 2.32
     */
    @GioVersion2_32
    public open fun getEnvironment(): CollectionsList<String> =
        g_app_launch_context_get_environment(gioAppLaunchContextPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Initiates startup notification for the application and returns the
     * `XDG_ACTIVATION_TOKEN` or `DESKTOP_STARTUP_ID` for the launched operation,
     * if supported.
     *
     * The returned token may be referred to equivalently as an ‘activation token’
     * (using Wayland terminology) or a ‘startup sequence ID’ (using X11 terminology).
     * The two [are interoperable](https://gitlab.freedesktop.org/wayland/wayland-protocols/-/blob/main/staging/xdg-activation/x11-interoperation.rst).
     *
     * Activation tokens are defined in the [XDG Activation Protocol](https://wayland.app/protocols/xdg-activation-v1),
     * and startup notification IDs are defined in the
     * [freedesktop.org Startup Notification Protocol](http://standards.freedesktop.org/startup-notification-spec/startup-notification-latest.txt).
     *
     * Support for the XDG Activation Protocol was added in GLib 2.76.
     *
     * @param info a #GAppInfo
     * @param files a #GList of #GFile objects
     * @return a startup notification ID for the application, or null if
     *     not supported.
     */
    public open fun getStartupNotifyId(info: AppInfo, files: GlibList): String? =
        g_app_launch_context_get_startup_notify_id(
            gioAppLaunchContextPointer,
            info.gioAppInfoPointer,
            files.glibListPointer
        )?.toKString()

    /**
     * Called when an application has failed to launch, so that it can cancel
     * the application startup notification started in g_app_launch_context_get_startup_notify_id().
     *
     * @param startupNotifyId the startup notification id that was returned by g_app_launch_context_get_startup_notify_id().
     */
    public open fun launchFailed(startupNotifyId: String): Unit =
        g_app_launch_context_launch_failed(gioAppLaunchContextPointer, startupNotifyId)

    /**
     * Arranges for @variable to be set to @value in the child's
     * environment when @context is used to launch an application.
     *
     * @param variable the environment variable to set
     * @param value the value for to set the variable to.
     * @since 2.32
     */
    @GioVersion2_32
    public open fun setenv(variable: String, `value`: String): Unit =
        g_app_launch_context_setenv(gioAppLaunchContextPointer, variable, `value`)

    /**
     * Arranges for @variable to be unset in the child's environment
     * when @context is used to launch an application.
     *
     * @param variable the environment variable to remove
     * @since 2.32
     */
    @GioVersion2_32
    public open fun unsetenv(variable: String): Unit =
        g_app_launch_context_unsetenv(gioAppLaunchContextPointer, variable)

    /**
     * The #GAppLaunchContext::launch-failed signal is emitted when a #GAppInfo launch
     * fails. The startup notification id is provided, so that the launcher
     * can cancel the startup notification.
     *
     * Because a launch operation may involve spawning multiple instances of the
     * target application, you should expect this signal to be emitted multiple
     * times, one for each spawned instance.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `startupNotifyId` the startup notification id for the failed launch
     * @since 2.36
     */
    @GioVersion2_36
    public fun onLaunchFailed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (startupNotifyId: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gioAppLaunchContextPointer,
        "launch-failed",
        onLaunchFailedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "launch-failed" signal. See [onLaunchFailed].
     *
     * @param startupNotifyId the startup notification id for the failed launch
     * @since 2.36
     */
    @GioVersion2_36
    public fun emitLaunchFailed(startupNotifyId: String) {
        g_signal_emit_by_name(gioAppLaunchContextPointer.reinterpret(), "launch-failed", startupNotifyId.cstr)
    }

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
     * Because a launch operation may involve spawning multiple instances of the
     * target application, you should expect this signal to be emitted multiple
     * times, one for each spawned instance.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `info` the #GAppInfo that is about to be launched; `platformData` additional platform-specific data for this launch
     * @since 2.72
     */
    @GioVersion2_72
    public fun onLaunchStarted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (info: AppInfo, platformData: Variant?) -> Unit,
    ): ULong = g_signal_connect_data(
        gioAppLaunchContextPointer,
        "launch-started",
        onLaunchStartedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "launch-started" signal. See [onLaunchStarted].
     *
     * @param info the #GAppInfo that is about to be launched
     * @param platformData additional platform-specific data for this launch
     * @since 2.72
     */
    @GioVersion2_72
    public fun emitLaunchStarted(info: AppInfo, platformData: Variant?) {
        g_signal_emit_by_name(
            gioAppLaunchContextPointer.reinterpret(),
            "launch-started",
            info.gioAppInfoPointer,
            platformData?.glibVariantPointer
        )
    }

    /**
     * The #GAppLaunchContext::launched signal is emitted when a #GAppInfo is successfully
     * launched.
     *
     * Because a launch operation may involve spawning multiple instances of the
     * target application, you should expect this signal to be emitted multiple
     * times, one time for each spawned instance.
     *
     * The @platform_data is an GVariant dictionary mapping
     * strings to variants (ie `a{sv}`), which contains additional,
     * platform-specific data about this launch. On UNIX, at least the
     * `pid` and `startup-notification-id` keys will be present.
     *
     * Since 2.72 the `pid` may be 0 if the process id wasn't known (for
     * example if the process was launched via D-Bus). The `pid` may not be
     * set at all in subsequent releases.
     *
     * On Windows, `pid` is guaranteed to be valid only for the duration of the
     * #GAppLaunchContext::launched signal emission; after the signal is emitted,
     * GLib will call g_spawn_close_pid(). If you need to keep the #GPid after the
     * signal has been emitted, then you can duplicate `pid` using `DuplicateHandle()`.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `info` the #GAppInfo that was just launched; `platformData` additional platform-specific data for this launch
     * @since 2.36
     */
    @GioVersion2_36
    public fun onLaunched(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (info: AppInfo, platformData: Variant) -> Unit,
    ): ULong = g_signal_connect_data(
        gioAppLaunchContextPointer,
        "launched",
        onLaunchedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "launched" signal. See [onLaunched].
     *
     * @param info the #GAppInfo that was just launched
     * @param platformData additional platform-specific data for this launch
     * @since 2.36
     */
    @GioVersion2_36
    public fun emitLaunched(info: AppInfo, platformData: Variant) {
        g_signal_emit_by_name(
            gioAppLaunchContextPointer.reinterpret(),
            "launched",
            info.gioAppInfoPointer,
            platformData.glibVariantPointer
        )
    }

    public companion object : TypeCompanion<AppLaunchContext> {
        override val type: GeneratedClassKGType<AppLaunchContext> =
            GeneratedClassKGType(getTypeOrNull("g_app_launch_context_get_type")!!) {
                AppLaunchContext(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of AppLaunchContext
         *
         * @return the GType
         */
        public fun getType(): GType = g_app_launch_context_get_type()
    }
}

private val onLaunchFailedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        startupNotifyId: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(startupNotifyId: String) -> Unit>().get().invoke(
        startupNotifyId?.toKString() ?: error("Expected not null string")
    )
}
    .reinterpret()

private val onLaunchStartedFunc:
    CPointer<CFunction<(CPointer<GAppInfo>, CPointer<GVariant>?) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            info: CPointer<GAppInfo>?,
            platformData: CPointer<GVariant>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(info: AppInfo, platformData: Variant?) -> Unit>().get().invoke(
            info!!.run {
                AppInfo.AppInfoImpl(reinterpret())
            },
            platformData?.run {
                Variant(this)
            }
        )
    }
        .reinterpret()

private val onLaunchedFunc: CPointer<CFunction<(CPointer<GAppInfo>, CPointer<GVariant>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            info: CPointer<GAppInfo>?,
            platformData: CPointer<GVariant>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(info: AppInfo, platformData: Variant) -> Unit>().get().invoke(
            info!!.run {
                AppInfo.AppInfoImpl(reinterpret())
            },
            platformData!!.run {
                Variant(this)
            }
        )
    }
        .reinterpret()
