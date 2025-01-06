// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkAppLaunchContext
import org.gtkkn.native.gdk.gdk_app_launch_context_get_display
import org.gtkkn.native.gdk.gdk_app_launch_context_get_type
import org.gtkkn.native.gdk.gdk_app_launch_context_set_desktop
import org.gtkkn.native.gdk.gdk_app_launch_context_set_icon
import org.gtkkn.native.gdk.gdk_app_launch_context_set_icon_name
import org.gtkkn.native.gdk.gdk_app_launch_context_set_timestamp
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * `GdkAppLaunchContext` handles launching an application in a graphical context.
 *
 * It is an implementation of `GAppLaunchContext` that provides startup
 * notification and allows to launch applications on a specific workspace.
 *
 * ## Launching an application
 *
 * ```c
 * GdkAppLaunchContext *context;
 *
 * context = gdk_display_get_app_launch_context (display);
 *
 * gdk_app_launch_context_set_timestamp (gdk_event_get_time (event));
 *
 * if (!g_app_info_launch_default_for_uri ("http://www.gtk.org", context, &error))
 *   g_warning ("Launching failed: %s\n", error->message);
 *
 * g_object_unref (context);
 * ```
 */
public open class AppLaunchContext(pointer: CPointer<GdkAppLaunchContext>) :
    org.gtkkn.bindings.gio.AppLaunchContext(pointer.reinterpret()),
    KGTyped {
    public val gdkAppLaunchContextPointer: CPointer<GdkAppLaunchContext>
        get() = gPointer.reinterpret()

    /**
     * The display that the `GdkAppLaunchContext` is on.
     */
    public open val display: Display
        /**
         * Gets the `GdkDisplay` that @context is for.
         *
         * @return the display of @context
         */
        get() = gdk_app_launch_context_get_display(gdkAppLaunchContextPointer.reinterpret())!!.run {
            Display(reinterpret())
        }

    /**
     * Sets the workspace on which applications will be launched.
     *
     * This only works when running under a window manager that
     * supports multiple workspaces, as described in the
     * [Extended Window Manager Hints](http://www.freedesktop.org/Standards/wm-spec).
     * Specifically this sets the `_NET_WM_DESKTOP` property described
     * in that spec.
     *
     * This only works when using the X11 backend.
     *
     * When the workspace is not specified or @desktop is set to -1,
     * it is up to the window manager to pick one, typically it will
     * be the current workspace.
     *
     * @param desktop the number of a workspace, or -1
     */
    public open fun setDesktop(desktop: gint): Unit =
        gdk_app_launch_context_set_desktop(gdkAppLaunchContextPointer.reinterpret(), desktop)

    /**
     * Sets the icon for applications that are launched with this
     * context.
     *
     * Window Managers can use this information when displaying startup
     * notification.
     *
     * See also [method@Gdk.AppLaunchContext.set_icon_name].
     *
     * @param icon a `GIcon`
     */
    public open fun setIcon(icon: Icon? = null): Unit =
        gdk_app_launch_context_set_icon(gdkAppLaunchContextPointer.reinterpret(), icon?.gioIconPointer)

    /**
     * Sets the icon for applications that are launched with this context.
     *
     * The @icon_name will be interpreted in the same way as the Icon field
     * in desktop files. See also [method@Gdk.AppLaunchContext.set_icon].
     *
     * If both @icon and @icon_name are set, the @icon_name takes priority.
     * If neither @icon or @icon_name is set, the icon is taken from either
     * the file that is passed to launched application or from the `GAppInfo`
     * for the launched application itself.
     *
     * @param iconName an icon name
     */
    public open fun setIconName(iconName: String? = null): Unit =
        gdk_app_launch_context_set_icon_name(gdkAppLaunchContextPointer.reinterpret(), iconName)

    /**
     * Sets the timestamp of @context.
     *
     * The timestamp should ideally be taken from the event that
     * triggered the launch.
     *
     * Window managers can use this information to avoid moving the
     * focus to the newly launched application when the user is busy
     * typing in another window. This is also known as 'focus stealing
     * prevention'.
     *
     * @param timestamp a timestamp
     */
    public open fun setTimestamp(timestamp: guint): Unit =
        gdk_app_launch_context_set_timestamp(gdkAppLaunchContextPointer.reinterpret(), timestamp)

    public companion object : TypeCompanion<AppLaunchContext> {
        override val type: GeneratedClassKGType<AppLaunchContext> =
            GeneratedClassKGType(gdk_app_launch_context_get_type()) { AppLaunchContext(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of AppLaunchContext
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_app_launch_context_get_type()
    }
}
