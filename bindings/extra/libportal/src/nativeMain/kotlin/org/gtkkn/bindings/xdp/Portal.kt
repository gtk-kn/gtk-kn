// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import kotlinx.cinterop.ByteVar
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
import kotlinx.cinterop.`value`
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.Initable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.xdp.Xdp.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GVariant
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.xdp.XdpLoginSessionState
import org.gtkkn.native.xdp.XdpPortal
import org.gtkkn.native.xdp.XdpUpdateStatus
import org.gtkkn.native.xdp.xdp_portal_access_camera
import org.gtkkn.native.xdp.xdp_portal_access_camera_finish
import org.gtkkn.native.xdp.xdp_portal_add_notification
import org.gtkkn.native.xdp.xdp_portal_add_notification_finish
import org.gtkkn.native.xdp.xdp_portal_compose_email
import org.gtkkn.native.xdp.xdp_portal_compose_email_finish
import org.gtkkn.native.xdp.xdp_portal_create_remote_desktop_session
import org.gtkkn.native.xdp.xdp_portal_create_remote_desktop_session_finish
import org.gtkkn.native.xdp.xdp_portal_create_screencast_session
import org.gtkkn.native.xdp.xdp_portal_create_screencast_session_finish
import org.gtkkn.native.xdp.xdp_portal_dynamic_launcher_get_desktop_entry
import org.gtkkn.native.xdp.xdp_portal_dynamic_launcher_install
import org.gtkkn.native.xdp.xdp_portal_dynamic_launcher_launch
import org.gtkkn.native.xdp.xdp_portal_dynamic_launcher_prepare_install
import org.gtkkn.native.xdp.xdp_portal_dynamic_launcher_prepare_install_finish
import org.gtkkn.native.xdp.xdp_portal_dynamic_launcher_request_install_token
import org.gtkkn.native.xdp.xdp_portal_dynamic_launcher_uninstall
import org.gtkkn.native.xdp.xdp_portal_get_type
import org.gtkkn.native.xdp.xdp_portal_get_user_information
import org.gtkkn.native.xdp.xdp_portal_get_user_information_finish
import org.gtkkn.native.xdp.xdp_portal_initable_new
import org.gtkkn.native.xdp.xdp_portal_is_camera_present
import org.gtkkn.native.xdp.xdp_portal_location_monitor_start
import org.gtkkn.native.xdp.xdp_portal_location_monitor_start_finish
import org.gtkkn.native.xdp.xdp_portal_location_monitor_stop
import org.gtkkn.native.xdp.xdp_portal_new
import org.gtkkn.native.xdp.xdp_portal_open_directory
import org.gtkkn.native.xdp.xdp_portal_open_directory_finish
import org.gtkkn.native.xdp.xdp_portal_open_file
import org.gtkkn.native.xdp.xdp_portal_open_file_finish
import org.gtkkn.native.xdp.xdp_portal_open_pipewire_remote_for_camera
import org.gtkkn.native.xdp.xdp_portal_open_uri
import org.gtkkn.native.xdp.xdp_portal_open_uri_finish
import org.gtkkn.native.xdp.xdp_portal_pick_color
import org.gtkkn.native.xdp.xdp_portal_pick_color_finish
import org.gtkkn.native.xdp.xdp_portal_prepare_print
import org.gtkkn.native.xdp.xdp_portal_prepare_print_finish
import org.gtkkn.native.xdp.xdp_portal_print_file
import org.gtkkn.native.xdp.xdp_portal_print_file_finish
import org.gtkkn.native.xdp.xdp_portal_remove_notification
import org.gtkkn.native.xdp.xdp_portal_request_background_finish
import org.gtkkn.native.xdp.xdp_portal_running_under_flatpak
import org.gtkkn.native.xdp.xdp_portal_running_under_sandbox
import org.gtkkn.native.xdp.xdp_portal_running_under_snap
import org.gtkkn.native.xdp.xdp_portal_save_file
import org.gtkkn.native.xdp.xdp_portal_save_file_finish
import org.gtkkn.native.xdp.xdp_portal_save_files
import org.gtkkn.native.xdp.xdp_portal_save_files_finish
import org.gtkkn.native.xdp.xdp_portal_session_inhibit
import org.gtkkn.native.xdp.xdp_portal_session_inhibit_finish
import org.gtkkn.native.xdp.xdp_portal_session_monitor_query_end_response
import org.gtkkn.native.xdp.xdp_portal_session_monitor_start
import org.gtkkn.native.xdp.xdp_portal_session_monitor_start_finish
import org.gtkkn.native.xdp.xdp_portal_session_monitor_stop
import org.gtkkn.native.xdp.xdp_portal_session_uninhibit
import org.gtkkn.native.xdp.xdp_portal_set_background_status
import org.gtkkn.native.xdp.xdp_portal_set_background_status_finish
import org.gtkkn.native.xdp.xdp_portal_set_wallpaper
import org.gtkkn.native.xdp.xdp_portal_set_wallpaper_finish
import org.gtkkn.native.xdp.xdp_portal_spawn_finish
import org.gtkkn.native.xdp.xdp_portal_spawn_signal
import org.gtkkn.native.xdp.xdp_portal_take_screenshot
import org.gtkkn.native.xdp.xdp_portal_take_screenshot_finish
import org.gtkkn.native.xdp.xdp_portal_trash_file
import org.gtkkn.native.xdp.xdp_portal_trash_file_finish
import org.gtkkn.native.xdp.xdp_portal_update_install
import org.gtkkn.native.xdp.xdp_portal_update_install_finish
import org.gtkkn.native.xdp.xdp_portal_update_monitor_start
import org.gtkkn.native.xdp.xdp_portal_update_monitor_start_finish
import org.gtkkn.native.xdp.xdp_portal_update_monitor_stop
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * Context for portal calls.
 *
 * The XdpPortal object provides the main context object
 * for the portal operations of libportal.
 *
 * Typically, an application will create a single XdpPortal
 * object with [ctor@Portal.new] and use it throughout its lifetime.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_icon_format`: Unsupported string with cType char**
 * - parameter `reason`: Unsupported string type with cType: char*
 * - parameter `fds`: Array parameter of type gint is not supported
 */
public open class Portal(
    pointer: CPointer<XdpPortal>,
) : Object(pointer.reinterpret()),
    Initable,
    KGTyped {
    public val xdpPortalPointer: CPointer<XdpPortal>
        get() = gPointer.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = gPointer.reinterpret()

    /**
     * Creates a new [class@Portal] object. If D-Bus is unavailable this API will abort.
     * We recommend using xdp_portal_initable_new() to safely handle this failure.
     *
     * @return a newly created [class@Portal] object
     */
    public constructor() : this(xdp_portal_new()!!.reinterpret())

    /**
     * Request access to a camera.
     *
     * When the request is done, @callback will be called.
     * You can then call [method@Portal.access_camera_finish]
     * to get the results.
     *
     * @param parent parent window information
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun accessCamera(
        parent: Parent? = null,
        flags: CameraFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_access_camera(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes a camera acess request.
     *
     * Returns the result as a boolean.
     *
     * If the access was granted, you can then call
     * [method@Portal.open_pipewire_remote_for_camera]
     * to obtain a pipewire remote.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if access to a camera was granted
     */
    public open fun accessCameraFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_access_camera_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sends a desktop notification.
     *
     * The following keys may be present in @notification:
     *
     * - title `s`: a user-visible string to display as title
     * - body `s`: a user-visible string to display as body
     * - icon `v`: a serialized icon (in the format produced by [method@Gio.Icon.serialize])
     * - priority `s`: "low", "normal", "high" or "urgent"
     * - default-action `s`: name of an action that
     *     will be activated when the user clicks on the notification
     * - default-action-target `v`: target parameter to send along when
     *     activating the default action.
     * - buttons `aa{sv}`: array of serialized buttons
     *
     * Each serialized button is a dictionary with the following supported keys:
     *
     * - label `s`: user-visible lable for the button. Mandatory
     * - action `s`: name of an action that will be activated when
     *     the user clicks on the button. Mandatory
     * - target `v`: target parameter to send along when activating
     *     the button
     *
     * Actions with a prefix of "app." are assumed to be exported by the
     * application and will be activated via the org.freedesktop.Application
     * interface, others are activated by emitting the
     * [signal@Portal::notification-action-invoked] signal.
     *
     * It is the callers responsibility to ensure that the ID is unique
     * among all notifications.
     *
     * To withdraw a notification, use [method@Portal.remove_notification].
     *
     * @param id unique ID for the notification
     * @param notification a [struct@GLib.Variant] dictionary with the content of the notification
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun addNotification(
        id: String,
        notification: Variant,
        flags: NotificationFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_add_notification(
            xdpPortalPointer.reinterpret(),
            id,
            notification.glibVariantPointer,
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the notification request.
     *
     * Returns the result as a boolean.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the notification was added
     */
    public open fun addNotificationFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_add_notification_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Presents a window that lets the user compose an email,
     * with some pre-filled information.
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.compose_email_finish] to get the results.
     *
     * @param parent parent window information
     * @param addresses the email addresses to send to
     * @param cc the email addresses to cc
     * @param bcc the email addresses to bcc
     * @param subject the subject for the email
     * @param body the body for the email
     * @param attachments an array of paths for files to attach
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun composeEmail(
        parent: Parent? = null,
        addresses: List<String>? = null,
        cc: List<String>? = null,
        bcc: List<String>? = null,
        subject: String? = null,
        body: String? = null,
        attachments: List<String>? = null,
        flags: EmailFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        memScoped {
            return xdp_portal_compose_email(
                xdpPortalPointer.reinterpret(),
                parent?.xdpParentPointer,
                addresses?.toCStringList(this),
                cc?.toCStringList(this),
                bcc?.toCStringList(this),
                subject,
                body,
                attachments?.toCStringList(this),
                flags.nativeValue,
                cancellable?.gioCancellablePointer?.reinterpret(),
                AsyncReadyCallbackFunc.reinterpret(),
                StableRef.create(callback).asCPointer()
            )
        }

    /**
     * Finishes the compose-email request.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the request was handled successfully
     */
    public open fun composeEmailFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_compose_email_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Creates a session for remote desktop.
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.create_remote_desktop_session_finish] to get the results.
     *
     * @param devices which kinds of input devices to ofer in the new dialog
     * @param outputs which kinds of source to offer in the dialog
     * @param flags options for this call
     * @param cursorMode the cursor mode of the session
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun createRemoteDesktopSession(
        devices: DeviceType,
        outputs: OutputType,
        flags: RemoteDesktopFlags,
        cursorMode: CursorMode,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_create_remote_desktop_session(
            xdpPortalPointer.reinterpret(),
            devices.mask,
            outputs.mask,
            flags.mask,
            cursorMode.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the create-remote-desktop request, and returns a [class@Session].
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return a [class@Session]
     */
    public open fun createRemoteDesktopSessionFinish(result: AsyncResult): Result<Session> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_create_remote_desktop_session_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Session(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Creates a session for a screencast.
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.create_screencast_session_finish] to get the results.
     *
     * @param outputs which kinds of source to offer in the dialog
     * @param flags options for this call
     * @param cursorMode the cursor mode of the session
     * @param persistMode the persist mode of the session
     * @param restoreToken the token of a previous screencast session to restore
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun createScreencastSession(
        outputs: OutputType,
        flags: ScreencastFlags,
        cursorMode: CursorMode,
        persistMode: PersistMode,
        restoreToken: String? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_create_screencast_session(
            xdpPortalPointer.reinterpret(),
            outputs.mask,
            flags.mask,
            cursorMode.mask,
            persistMode.nativeValue,
            restoreToken,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the create-screencast request, and returns a [class@Session].
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return a [class@Session]
     */
    public open fun createScreencastSessionFinish(result: AsyncResult): Result<Session> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_create_screencast_session_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Session(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * This function gets the contents of a .desktop file that was previously
     * installed by the dynamic launcher portal.
     *
     * The @desktop_file_id must be prefixed with the caller's app ID followed by a
     * "." and suffixed with ".desktop".
     *
     * @param desktopFileId the .desktop file name
     * @return the contents of the desktop file, or null with
     *   @error set
     */
    public open fun dynamicLauncherGetDesktopEntry(desktopFileId: String): Result<String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_dynamic_launcher_get_desktop_entry(
                    xdpPortalPointer.reinterpret(),
                    desktopFileId,
                    gError.ptr
                )?.toKString()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * This function completes installation of a launcher so that the icon and name
     * given in previous method calls will show up in the desktop environment's menu.
     *
     * The @desktop_file_id must be prefixed with the caller's app ID followed by a
     * "." and suffixed with ".desktop".
     *
     * The @desktop_entry data need not include Icon= or Name= entries since these
     * will be added by the portal, and the Exec= entry will be rewritten to call
     * the application with e.g. "flatpak run" depending on the sandbox status of
     * the app.
     *
     * @param token a token acquired via a [method@Portal.dynamic_launcher_request_install_token] or [method@Portal.dynamic_launcher_prepare_install] call
     * @param desktopFileId the .desktop file name to be used
     * @param desktopEntry the key-file to be used for the contents of the .desktop file
     * @return true if the installation was successful, false with @error set
     *   otherwise
     */
    public open fun dynamicLauncherInstall(
        token: String,
        desktopFileId: String,
        desktopEntry: String,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_dynamic_launcher_install(
                    xdpPortalPointer.reinterpret(),
                    token,
                    desktopFileId,
                    desktopEntry,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     *
     *
     * @param desktopFileId
     * @param activationToken
     */
    public open fun dynamicLauncherLaunch(
        desktopFileId: String,
        activationToken: String,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_dynamic_launcher_launch(
                    xdpPortalPointer.reinterpret(),
                    desktopFileId,
                    activationToken,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Presents a dialog to the user so they can confirm they want to install a
     * launcher to their desktop.
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.dynamic_launcher_prepare_install_finish] to get the results.
     *
     * @param parent parent window information
     * @param name the name for the launcher
     * @param iconV a #GBytesIcon as returned by g_icon_serialize(). Must be a png or jpeg no larger than 512x512, or an svg
     * @param launcherType the type of the launcher
     * @param target the URL if the launcher is for a web app, or null
     * @param editableName if true, the user will be able to edit the name of the launcher
     * @param editableIcon if true, the user will be able to edit the icon of the launcher, if the implementation supports this
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun dynamicLauncherPrepareInstall(
        parent: Parent? = null,
        name: String,
        iconV: Variant,
        launcherType: LauncherType,
        target: String? = null,
        editableName: Boolean,
        editableIcon: Boolean,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_dynamic_launcher_prepare_install(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            name,
            iconV.glibVariantPointer,
            launcherType.mask,
            target,
            editableName.asGBoolean(),
            editableIcon.asGBoolean(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the prepare-install-launcher request, and returns
     * [struct@GLib.Variant] dictionary with the following information:
     *
     * - name s: the name chosen by the user (or the provided name if the
     *     editable_name option was not set)
     * - token s: a token that can by used in a [method@Portal.dynamic_launcher_install]
     *     call to complete the installation
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return a [struct@GLib.Variant] dictionary with launcher
     *   information
     */
    public open fun dynamicLauncherPrepareInstallFinish(result: AsyncResult): Result<Variant> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_dynamic_launcher_prepare_install_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Variant(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Requests a token which can be passed to [method@Portal.dynamic_launcher_install]
     * to complete installation of the launcher without user interaction.
     *
     * This function only works when the caller's app ID is in the allowlist for
     * the portal backend being used. It's intended for software centers such as
     * GNOME Software or KDE Discover.
     *
     * @param name the name for the launcher
     * @param iconV a #GBytesIcon as returned by g_icon_serialize(). Must be a png or jpeg no larger than 512x512, or an svg
     * @return a token that can be passed to
     *   [method@Portal.dynamic_launcher_install], or null with @error set
     */
    public open fun dynamicLauncherRequestInstallToken(
        name: String,
        iconV: Variant,
    ): Result<String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_dynamic_launcher_request_install_token(
                    xdpPortalPointer.reinterpret(),
                    name,
                    iconV.glibVariantPointer,
                    gError.ptr
                )?.toKString()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * This function uninstalls a launcher that was previously installed using the
     * dynamic launcher portal, resulting in the .desktop file and icon being deleted.
     *
     * The @desktop_file_id must be prefixed with the caller's app ID followed by a
     * "." and suffixed with ".desktop".
     *
     * @param desktopFileId the .desktop file name
     * @return true if the uninstallation was successful, false with @error set
     *   otherwise
     */
    public open fun dynamicLauncherUninstall(desktopFileId: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_dynamic_launcher_uninstall(
                    xdpPortalPointer.reinterpret(),
                    desktopFileId,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Gets information about the user.
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.get_user_information_finish] to get the results.
     *
     * @param parent parent window information
     * @param reason a string that can be shown in the dialog to explain
     *    why the information is needed
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun getUserInformation(
        parent: Parent? = null,
        reason: String? = null,
        flags: UserInformationFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_get_user_information(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            reason,
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the get-user-information request.
     *
     * Returns the result in the form of a [struct@GLib.Variant] dictionary
     * containing the following fields:
     *
     * - id `s`: the user ID
     * - name `s`: the users real name
     * - image `s`: the uri of an image file for the users avatar picture
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return a [struct@GLib.Variant] dictionary with user information
     */
    public open fun getUserInformationFinish(result: AsyncResult): Result<Variant> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_get_user_information_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Variant(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Returns whether any camera are present.
     *
     * @return `TRUE` if the system has cameras
     */
    public open fun isCameraPresent(): Boolean =
        xdp_portal_is_camera_present(xdpPortalPointer.reinterpret()).asBoolean()

    /**
     * Makes `XdpPortal` start monitoring location changes.
     *
     * When the location changes, the [signal@Portal::location-updated].
     * signal is emitted.
     *
     * Use [method@Portal.location_monitor_stop] to stop monitoring.
     *
     * Note that [class@Portal] only maintains a single location monitor
     * at a time. If you want to change the @distance_threshold,
     * @time_threshold or @accuracy of the current monitor, you
     * first have to call [method@Portal.location_monitor_stop] to
     * stop monitoring.
     *
     * @param parent a [struct@Parent], or `NULL`
     * @param distanceThreshold distance threshold, in meters
     * @param timeThreshold time threshold, in seconds
     * @param accuracy desired accuracy
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun locationMonitorStart(
        parent: Parent? = null,
        distanceThreshold: UInt,
        timeThreshold: UInt,
        accuracy: LocationAccuracy,
        flags: LocationMonitorFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_location_monitor_start(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            distanceThreshold,
            timeThreshold,
            accuracy.nativeValue,
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes a location-monitor request.
     *
     * Returns result in the form of boolean.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the request succeeded
     */
    public open fun locationMonitorStartFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_location_monitor_start_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Stops location monitoring that was started with
     * [method@Portal.location_monitor_start].
     */
    public open fun locationMonitorStop(): Unit = xdp_portal_location_monitor_stop(xdpPortalPointer.reinterpret())

    /**
     * Opens the directory containing the file specified by the @uri.
     *
     * which must be a file: uri pointing to a file that the application has access
     * to.
     *
     * @param parent parent window information
     * @param uri the URI to open
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun openDirectory(
        parent: Parent,
        uri: String,
        flags: OpenUriFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_open_directory(
            xdpPortalPointer.reinterpret(),
            parent.xdpParentPointer,
            uri,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the open-directory request.
     *
     * Returns the result in the form of a boolean.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the call succeeded
     */
    public open fun openDirectoryFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_open_directory_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Asks the user to open one or more files.
     *
     * The format for the @filters argument is `a(sa(us))`.
     * Each item in the array specifies a single filter to offer to the user.
     * The first string is a user-visible name for the filter. The `a(us)`
     * specifies a list of filter strings, which can be either a glob pattern
     * (indicated by 0) or a mimetype (indicated by 1).
     *
     * Example: `[('Images', [(0, '*.ico'), (1, 'image/png')]), ('Text', [(0, '*.txt')])]`
     *
     * The format for the @choices argument is `a(ssa(ss)s)`.
     * For each element, the first string is an ID that will be returned
     * with the response, te second string is a user-visible label. The
     * `a(ss)` is the list of choices, each being a is an ID and a
     * user-visible label. The final string is the initial selection,
     * or `""`, to let the portal decide which choice will be initially selected.
     * None of the strings, except for the initial selection, should be empty.
     *
     * As a special case, passing an empty array for the list of choices
     * indicates a boolean choice that is typically displayed as a check
     * button, using `"true"` and `"false"` as the choices.
     *
     * Example: `[('encoding', 'Encoding', [('utf8', 'Unicode (UTF-8)'), ('latin15', 'Western')], 'latin15'), ('reencode', 'Reencode', [], 'false')]`
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.open_file_finish] to get the results.
     *
     * @param parent parent window information
     * @param title title for the file chooser dialog
     * @param filters a [struct@GLib.Variant] describing file filters
     * @param currentFilter a [struct@GLib.Variant] describing the current file filter
     * @param choices a [struct@GLib.Variant] describing extra widgets
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun openFile(
        parent: Parent? = null,
        title: String,
        filters: Variant? = null,
        currentFilter: Variant? = null,
        choices: Variant? = null,
        flags: OpenFileFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_open_file(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            title,
            filters?.glibVariantPointer,
            currentFilter?.glibVariantPointer,
            choices?.glibVariantPointer,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the open-file request
     *
     * Returns the result in the form of a [struct@GLib.Variant] dictionary
     * containing the following fields:
     *
     * - uris `as`: an array of strings containing the uris of selected files
     * - choices `a(ss)`: an array of pairs of strings, the first string being the
     *     ID of a combobox that was passed into this call, the second string
     *     being the selected option.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return a [struct@GLib.Variant] dictionary with the results
     */
    public open fun openFileFinish(result: AsyncResult): Result<Variant> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_open_file_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Variant(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Opens a file descriptor to the pipewire remote where the camera
     * nodes are available.
     *
     * The file descriptor should be used to create a pw_core object, by using
     * pw_context_connect_fd(). Only the camera nodes will be available from this
     * pipewire node.
     *
     * @return the file descriptor
     */
    public open fun openPipewireRemoteForCamera(): Int =
        xdp_portal_open_pipewire_remote_for_camera(xdpPortalPointer.reinterpret())

    /**
     * Opens @uri with an external handler.
     *
     * @param parent parent window information
     * @param uri the URI to open
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun openUri(
        parent: Parent,
        uri: String,
        flags: OpenUriFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_open_uri(
            xdpPortalPointer.reinterpret(),
            parent.xdpParentPointer,
            uri,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the open-uri request.
     *
     * Returns the result in the form of a boolean.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the call succeeded
     */
    public open fun openUriFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_open_uri_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Lets the user pick a color from the screen.
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.pick_color_finish] to get the results.
     *
     * @param parent parent window information
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun pickColor(
        parent: Parent? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_pick_color(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes a pick-color request.
     *
     * Returns the result in the form of a GVariant of the form (ddd), containing
     * red, green and blue components in the range [0,1].
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return GVariant containing the color
     */
    public open fun pickColorFinish(result: AsyncResult): Result<Variant> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_pick_color_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Variant(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Presents a print dialog to the user and returns print settings and page setup.
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.prepare_print_finish] to get the results.
     *
     * @param parent parent window information
     * @param title tile for the print dialog
     * @param settings Serialized print settings
     * @param pageSetup Serialized page setup
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun preparePrint(
        parent: Parent? = null,
        title: String,
        settings: Variant? = null,
        pageSetup: Variant? = null,
        flags: PrintFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_prepare_print(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            title,
            settings?.glibVariantPointer,
            pageSetup?.glibVariantPointer,
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the prepare-print request.
     *
     * Returns a [struct@GLib.Variant] dictionary with the following information:
     *
     * - settings `a{sv}`: print settings as set up by the user in the print dialog
     * - page-setup `a{sv}: page setup as set up by the user in the print dialog
     * - token u: a token that can by used in a [method@Portal.print_file] call to
     *     avoid the print dialog
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return a [struct@GLib.Variant] dictionary with print information
     */
    public open fun preparePrintFinish(result: AsyncResult): Result<Variant> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_prepare_print_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Variant(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Prints a file.
     *
     * If a valid token is present in the @options, then this call will print
     * with the settings from the Print call that the token refers to. If
     * no token is present, then a print dialog will be presented to the user.
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.print_file_finish] to get the results.
     *
     * @param parent parent window information
     * @param title tile for the print dialog
     * @param token token that was returned by a previous [method@Portal.prepare_print] call, or 0
     * @param file path of the document to print
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun printFile(
        parent: Parent? = null,
        title: String,
        token: UInt,
        `file`: String,
        flags: PrintFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_print_file(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            title,
            token,
            `file`,
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the print request.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the request was successful
     */
    public open fun printFileFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_print_file_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Withdraws a desktop notification.
     *
     * @param id the ID of an notification
     */
    public open fun removeNotification(id: String): Unit =
        xdp_portal_remove_notification(xdpPortalPointer.reinterpret(), id)

    /**
     * Finishes the request.
     *
     * Returns `TRUE` if successful.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if successful.
     */
    public open fun requestBackgroundFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_request_background_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Asks the user for a location to save a file.
     *
     * The format for the @filters argument is the same as for [method@Portal.open_file].
     *
     * The format for the @choices argument is the same as for [method@Portal.open_file].
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.save_file_finish] to get the results.
     *
     * @param parent parent window information
     * @param title title for the file chooser dialog
     * @param currentName suggested filename
     * @param currentFolder suggested folder to save the file in
     * @param currentFile the current file (when saving an existing file)
     * @param filters a [struct@GLib.Variant] describing file filters
     * @param currentFilter a [struct@GLib.Variant] describing the current file filter
     * @param choices a [struct@GLib.Variant] describing extra widgets
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun saveFile(
        parent: Parent? = null,
        title: String,
        currentName: String? = null,
        currentFolder: String? = null,
        currentFile: String? = null,
        filters: Variant? = null,
        currentFilter: Variant? = null,
        choices: Variant? = null,
        flags: SaveFileFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_save_file(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            title,
            currentName,
            currentFolder,
            currentFile,
            filters?.glibVariantPointer,
            currentFilter?.glibVariantPointer,
            choices?.glibVariantPointer,
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the save-file request.
     *
     * Returns the result in the form of a [struct@GLib.Variant] dictionary
     * containing the following fields:
     *
     * - uris `(as)`: an array of strings containing the uri of the selected file
     * - choices `a(ss)`: an array of pairs of strings, the first string being the
     *   ID of a combobox that was passed into this call, the second string
     *   being the selected option.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return a [struct@GLib.Variant] dictionary with the results
     */
    public open fun saveFileFinish(result: AsyncResult): Result<Variant> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_save_file_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Variant(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Asks for a folder as a location to save one or more files.
     *
     * The names of the files will be used as-is and appended to the selected
     * folder's path in the list of returned files. If the selected folder already
     * contains a file with one of the given names, the portal may prompt or take
     * some other action to construct a unique file name and return that instead.
     *
     * The format for the @choices argument is the same as for [method@Portal.open_file].
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.save_file_finish] to get the results.
     *
     * @param parent parent window information
     * @param title title for the file chooser dialog
     * @param currentName suggested filename
     * @param currentFolder suggested folder to save the file in
     * @param files An array of file names to be saved
     * @param choices a [struct@GLib.Variant] describing extra widgets
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun saveFiles(
        parent: Parent? = null,
        title: String,
        currentName: String? = null,
        currentFolder: String? = null,
        files: Variant,
        choices: Variant? = null,
        flags: SaveFileFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_save_files(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            title,
            currentName,
            currentFolder,
            files.glibVariantPointer,
            choices?.glibVariantPointer,
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the save-files request.
     *
     * Returns the result in the form of a [struct@GLib.Variant] dictionary
     * containing the following fields:
     *
     * - uris `(as)`: an array of strings containing the uri corresponding to each
     *   file passed to the save-files request, in the same order. Note that the
     *   file names may have changed, for example if a file with the same name in
     *   the selected folder already exists.
     * - choices `a(ss)`: an array of pairs of strings, the first string being the
     *   ID of a combobox that was passed into this call, the second string
     *   being the selected option.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return a [struct@GLib.Variant] dictionary with the results
     */
    public open fun saveFilesFinish(result: AsyncResult): Result<Variant> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_save_files_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Variant(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Inhibits various session status changes.
     *
     * To obtain an ID that can be used to undo the inhibition, use
     * [method@Portal.session_inhibit_finish] in the callback.
     *
     * To remove an active inhibitor, call [method@Portal.session_uninhibit]
     * with the same ID.
     *
     * @param parent parent window information
     * @param reason user-visible reason for the inhibition
     * @param flags information about what to inhibit
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun sessionInhibit(
        parent: Parent? = null,
        reason: String? = null,
        flags: InhibitFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_session_inhibit(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            reason,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the inhbit request.
     *
     * Returns the ID of the inhibition as a positive integer. The ID can be passed
     * to [method@Portal.session_uninhibit] to undo the inhibition.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return the ID of the inhibition, or -1 if there was an error
     */
    public open fun sessionInhibitFinish(result: AsyncResult): Result<Int> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_session_inhibit_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * This method should be called within one second of
     * receiving a [signal@Portal::session-state-changed] signal
     * with the 'Query End' state, to acknowledge that they
     * have handled the state change.
     *
     * Possible ways to handle the state change are either
     * to call [method@Portal.session_inhibit] to prevent the
     * session from ending, or to save your state and get
     * ready for the session to end.
     */
    public open fun sessionMonitorQueryEndResponse(): Unit =
        xdp_portal_session_monitor_query_end_response(xdpPortalPointer.reinterpret())

    /**
     * Makes [class@Portal] start monitoring the login session state.
     *
     * When the state changes, the [signal@Portal::session-state-changed]
     * signal is emitted.
     *
     * Use [method@Portal.session_monitor_stop] to stop monitoring.
     *
     * @param parent a XdpParent, or `NULL`
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun sessionMonitorStart(
        parent: Parent? = null,
        flags: SessionMonitorFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_session_monitor_start(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes a session-monitor request.
     *
     * Returns the result in the form of boolean.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the request succeeded
     */
    public open fun sessionMonitorStartFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_session_monitor_start_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Stops session state monitoring that was started with
     * [method@Portal.session_monitor_start].
     */
    public open fun sessionMonitorStop(): Unit = xdp_portal_session_monitor_stop(xdpPortalPointer.reinterpret())

    /**
     * Removes an inhibitor that was created by a call
     * to [method@Portal.session_inhibit].
     *
     * @param id unique ID for an active inhibition
     */
    public open fun sessionUninhibit(id: Int): Unit = xdp_portal_session_uninhibit(xdpPortalPointer.reinterpret(), id)

    /**
     * Sets the status information of the application, for when it's running
     * in background.
     *
     * @param statusMessage status message when running in background
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun setBackgroundStatus(
        statusMessage: String? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_set_background_status(
            xdpPortalPointer.reinterpret(),
            statusMessage,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes setting the background status of the application.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return true if successfully set status, false otherwise
     */
    public open fun setBackgroundStatusFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_set_background_status_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sets a desktop background image, given by a uri.
     *
     * @param parent parent window information
     * @param uri the URI to use
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun setWallpaper(
        parent: Parent? = null,
        uri: String,
        flags: WallpaperFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_set_wallpaper(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            uri,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the open-uri request.
     *
     * Returns the result in the form of a boolean.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the call succeeded
     */
    public open fun setWallpaperFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_set_wallpaper_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Finishes the spawn request.
     *
     * Returns the pid of the newly spawned process.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return the pid of the spawned process.
     */
    public open fun spawnFinish(result: AsyncResult): Result<Int> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_spawn_finish(xdpPortalPointer.reinterpret(), result.gioAsyncResultPointer, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sends a Unix signal to a process that has been spawned
     * by [method@Portal.spawn].
     *
     * @param pid the pid of the process to send a signal to
     * @param signal the Unix signal to send (see signal(7))
     * @param toProcessGroup whether to send the signal to the process
     *     group of the process
     */
    public open fun spawnSignal(
        pid: Int,
        signal: Int,
        toProcessGroup: Boolean,
    ): Unit = xdp_portal_spawn_signal(xdpPortalPointer.reinterpret(), pid, signal, toProcessGroup.asGBoolean())

    /**
     * Takes a screenshot.
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Portal.take_screenshot_finish] to get the results.
     *
     * @param parent parent window information
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun takeScreenshot(
        parent: Parent? = null,
        flags: ScreenshotFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_take_screenshot(
            xdpPortalPointer.reinterpret(),
            parent?.xdpParentPointer,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes a screenshot request.
     *
     * Returns the result in the form of a URI pointing to an image file.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return URI pointing to an image file
     */
    public open fun takeScreenshotFinish(result: AsyncResult): Result<String?> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_take_screenshot_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.toKString()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sends the file at @path to the trash can.
     *
     * @param path the path for a local file
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun trashFile(
        path: String,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_trash_file(
            xdpPortalPointer.reinterpret(),
            path,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the trash-file request.
     *
     * Returns the result in the form of a boolean.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the call succeeded
     */
    public open fun trashFileFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_trash_file_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Installs an available software update.
     *
     * This should be called in response to a [signal@Portal::update-available]
     * signal.
     *
     * During the update installation, the [signal@Portal::update-progress]
     * signal will be emitted to provide progress information.
     *
     * @param parent a [struct@Parent]
     * @param flags options for this call
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun updateInstall(
        parent: Parent,
        flags: UpdateInstallFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_update_install(
            xdpPortalPointer.reinterpret(),
            parent.xdpParentPointer,
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an update-installation request.
     *
     * Returns the result in the form of boolean.
     *
     * Note that the update may not be completely installed
     * by the time this function is called. You need to
     * listen to the [signal@Portal::update-progress] signal
     * to learn when the installation is complete.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the update is being installed
     */
    public open fun updateInstallFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_update_install_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Makes `XdpPortal` start monitoring for available software updates.
     *
     * When a new update is available, the [signal@Portal::update-available].
     * signal is emitted.
     *
     * Use [method@Portal.update_monitor_stop] to stop monitoring.
     *
     * @param flags options for this cal..
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun updateMonitorStart(
        flags: UpdateMonitorFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_portal_update_monitor_start(
            xdpPortalPointer.reinterpret(),
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an update-monitor request.
     *
     * Returns the result in the form of boolean.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the request succeeded
     */
    public open fun updateMonitorStartFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_portal_update_monitor_start_finish(
                    xdpPortalPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Stops update monitoring that was started with
     * [method@Portal.update_monitor_start].
     */
    public open fun updateMonitorStop(): Unit = xdp_portal_update_monitor_stop(xdpPortalPointer.reinterpret())

    /**
     * Emitted when location monitoring is enabled and the location changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `latitude` the latitude, in degrees; `longitude` the longitude, in degrees; `altitude` the altitude, in meters; `accuracy` the accuracy, in meters; `speed` the speed, in meters per second; `heading` the heading, in degrees; `description` the description; `timestampS` the timestamp seconds since the Unix epoch; `timestampMs` the microseconds fraction of the timestamp
     */
    public fun connectLocationUpdated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            latitude: Double,
            longitude: Double,
            altitude: Double,
            accuracy: Double,
            speed: Double,
            heading: Double,
            description: String,
            timestampS: Long,
            timestampMs: Long,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "location-updated",
            connectLocationUpdatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a non-exported action is activated on a notification.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `id` the notification ID; `action` the action name; `parameter` the target parameter for the action
     */
    public fun connectNotificationActionInvoked(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            id: String,
            action: String,
            parameter: Variant?,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "notification-action-invoked",
            connectNotificationActionInvokedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when session state monitoring is
     * enabled and the state of the login session changes or
     * the screensaver is activated or deactivated.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `screensaverActive` whether the screensaver is active; `sessionState` the current state of the login session
     */
    public fun connectSessionStateChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (screensaverActive: Boolean, sessionState: LoginSessionState) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "session-state-changed",
            connectSessionStateChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a process that was spawned with [method@Portal.spawn] exits.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `pid` the pid of the process; `exitStatus` the exit status of the process
     */
    public fun connectSpawnExited(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (pid: UInt, exitStatus: UInt) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "spawn-exited",
            connectSpawnExitedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when updates monitoring is enabled
     * and a new update is available.
     *
     * It is only sent once with the same information, but it can be sent many
     * times if new updates appear.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `runningCommit` the commit that the sandbox is running with; `localCommit` the commit that is currently deployed. Restarting
     *     the app will use this commit; `remoteCommit` the commit that is available as an update.
     *     Updating the app will deloy this commit
     */
    public fun connectUpdateAvailable(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            runningCommit: String,
            localCommit: String,
            remoteCommit: String,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "update-available",
            connectUpdateAvailableFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to indicate progress of an update installation.
     *
     * It is undefined exactly how often it is sent, but it will be emitted at
     * least once at the end with a non-zero @status. For each successful
     * operation in the update, we're also guaranteed to send exactly one signal
     * with @progress 100.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `nOps` the number of operations that the update consists of; `op` the position of the currently active operation; `progress` the progress of the currently active operation, as
     *   a number between 0 and 100; `status` the overall status of the update; `error` the error name if the status is 'failed'; `errorMessage` the error message if the status is 'failed'
     */
    public fun connectUpdateProgress(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            nOps: UInt,
            op: UInt,
            progress: UInt,
            status: UpdateStatus,
            error: String,
            errorMessage: String,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "update-progress",
            connectUpdateProgressFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Portal> {
        override val type: GeneratedClassKGType<Portal> =
            GeneratedClassKGType(xdp_portal_get_type()) { Portal(it.reinterpret()) }

        init {
            XdpTypeProvider.register()
        }

        /**
         * Creates a new [class@Portal] object.
         *
         * @return a newly created [class@Portal] object or NULL on error
         */
        public fun initableNew(): Result<Portal> =
            memScoped {
                val gError = allocPointerTo<GError>()
                gError.`value` = null
                val gResult = xdp_portal_initable_new(gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(Portal(gResult!!.reinterpret()))
                }
            }

        /**
         * Detects if running inside of a Flatpak or WebKit sandbox.
         *
         * See also: [func@Portal.running_under_sandbox].
         *
         * @return true if the current process is running under a Flatpak sandbox
         */
        public fun runningUnderFlatpak(): Boolean = xdp_portal_running_under_flatpak().asBoolean()

        /**
         * This function tries to determine if the current process is running under a
         * sandbox that requires the use of portals.
         *
         * If you need to check error conditions see [func@Portal.running_under_snap].
         *
         * Note that these functions are all cached and will always return the same result.
         *
         * @return true if the current process should use portals to access resources
         *   on the host system, or false if either an error was encountered or the
         *   process is running unsandboxed
         */
        public fun runningUnderSandbox(): Boolean = xdp_portal_running_under_sandbox().asBoolean()

        /**
         * Detects if you are running inside of a Snap sandbox.
         *
         * See also: [func@Portal.running_under_sandbox].
         *
         * @return true if the current process is running under a Snap sandbox, or
         *   false if either unsandboxed or an error was encountered in which case
         *   @error will be set
         */
        public fun runningUnderSnap(): Result<Boolean> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = xdp_portal_running_under_snap(gError.ptr).asBoolean()
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(gResult)
                }
            }
    }
}

private val connectLocationUpdatedFunc: CPointer<
    CFunction<
        (
            Double,
            Double,
            Double,
            Double,
            Double,
            Double,
            CPointer<ByteVar>,
            Long,
            Long,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            latitude: Double,
            longitude: Double,
            altitude: Double,
            accuracy: Double,
            speed: Double,
            heading: Double,
            description: CPointer<ByteVar>?,
            timestampS: Long,
            timestampMs: Long,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    latitude: Double,
                    longitude: Double,
                    altitude: Double,
                    accuracy: Double,
                    speed: Double,
                    heading: Double,
                    description: String,
                    timestampS: Long,
                    timestampMs: Long,
                ) -> Unit
            >()
            .get()
            .invoke(
                latitude,
                longitude,
                altitude,
                accuracy,
                speed,
                heading,
                description?.toKString() ?: error("Expected not null string"),
                timestampS,
                timestampMs
            )
    }.reinterpret()

private val connectNotificationActionInvokedFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<GVariant>?,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            id: CPointer<ByteVar>?,
            action: CPointer<ByteVar>?,
            parameter: CPointer<GVariant>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    id: String,
                    action: String,
                    parameter: Variant?,
                ) -> Unit
            >()
            .get()
            .invoke(
                id?.toKString() ?: error("Expected not null string"),
                action?.toKString() ?: error("Expected not null string"),
                parameter?.run {
                    Variant(reinterpret())
                }
            )
    }.reinterpret()

private val connectSessionStateChangedFunc: CPointer<CFunction<(Int, XdpLoginSessionState) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            screensaverActive: Int,
            sessionState: XdpLoginSessionState,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    screensaverActive: Boolean,
                    sessionState: LoginSessionState,
                ) -> Unit
            >()
            .get()
            .invoke(
                screensaverActive.asBoolean(),
                sessionState.run {
                    LoginSessionState.fromNativeValue(this)
                }
            )
    }.reinterpret()

private val connectSpawnExitedFunc: CPointer<CFunction<(UInt, UInt) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            pid: UInt,
            exitStatus: UInt,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(pid: UInt, exitStatus: UInt) -> Unit>().get().invoke(pid, exitStatus)
    }.reinterpret()

private val connectUpdateAvailableFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            runningCommit: CPointer<ByteVar>?,
            localCommit: CPointer<ByteVar>?,
            remoteCommit: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    runningCommit: String,
                    localCommit: String,
                    remoteCommit: String,
                ) -> Unit
            >()
            .get()
            .invoke(
                runningCommit?.toKString() ?: error("Expected not null string"),
                localCommit?.toKString() ?: error("Expected not null string"),
                remoteCommit?.toKString() ?: error("Expected not null string")
            )
    }.reinterpret()

private val connectUpdateProgressFunc: CPointer<
    CFunction<
        (
            UInt,
            UInt,
            UInt,
            XdpUpdateStatus,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            nOps: UInt,
            op: UInt,
            progress: UInt,
            status: XdpUpdateStatus,
            error: CPointer<ByteVar>?,
            errorMessage: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    nOps: UInt,
                    op: UInt,
                    progress: UInt,
                    status: UpdateStatus,
                    error: String,
                    errorMessage: String,
                ) -> Unit
            >()
            .get()
            .invoke(
                nOps,
                op,
                progress,
                status.run {
                    UpdateStatus.fromNativeValue(this)
                },
                error?.toKString() ?: error("Expected not null string"),
                errorMessage?.toKString() ?: error("Expected not null string")
            )
    }.reinterpret()
