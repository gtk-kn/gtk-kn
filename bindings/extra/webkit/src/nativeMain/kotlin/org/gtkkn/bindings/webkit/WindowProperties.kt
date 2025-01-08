// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitWindowProperties
import org.gtkkn.native.webkit.webkit_window_properties_get_fullscreen
import org.gtkkn.native.webkit.webkit_window_properties_get_geometry
import org.gtkkn.native.webkit.webkit_window_properties_get_locationbar_visible
import org.gtkkn.native.webkit.webkit_window_properties_get_menubar_visible
import org.gtkkn.native.webkit.webkit_window_properties_get_resizable
import org.gtkkn.native.webkit.webkit_window_properties_get_scrollbars_visible
import org.gtkkn.native.webkit.webkit_window_properties_get_statusbar_visible
import org.gtkkn.native.webkit.webkit_window_properties_get_toolbar_visible
import org.gtkkn.native.webkit.webkit_window_properties_get_type
import kotlin.Boolean
import kotlin.Unit

/**
 * Window properties of a #WebKitWebView.
 *
 * The content of a #WebKitWebView can request to change certain
 * properties of the window containing the view. This can include the x, y position
 * of the window, the width and height but also if a toolbar,
 * scrollbar, statusbar, locationbar should be visible to the user,
 * and the request to show the #WebKitWebView fullscreen.
 *
 * The #WebKitWebView::ready-to-show signal handler is the proper place
 * to apply the initial window properties. Then you can monitor the
 * #WebKitWindowProperties by connecting to ::notify signal.
 *
 * ```c
 * static void ready_to_show_cb (WebKitWebView *web_view, gpointer user_data)
 * {
 *     GtkWidget *window;
 *     WebKitWindowProperties *window_properties;
 *     gboolean visible;
 *
 *     // Create the window to contain the WebKitWebView.
 *     window = browser_window_new ();
 *     gtk_container_add (GTK_CONTAINER (window), GTK_WIDGET (web_view));
 *     gtk_widget_show (GTK_WIDGET (web_view));
 *
 *     // Get the WebKitWindowProperties of the web view and monitor it.
 *     window_properties = webkit_web_view_get_window_properties (web_view);
 *     g_signal_connect (window_properties, "notify::geometry",
 *                       G_CALLBACK (window_geometry_changed), window);
 *     g_signal_connect (window_properties, "notify::toolbar-visible",
 *                       G_CALLBACK (window_toolbar_visibility_changed), window);
 *     g_signal_connect (window_properties, "notify::menubar-visible",
 *                       G_CALLBACK (window_menubar_visibility_changed), window);
 *
 *     // Apply the window properties before showing the window.
 *     visible = webkit_window_properties_get_toolbar_visible (window_properties);
 *     browser_window_set_toolbar_visible (BROWSER_WINDOW (window), visible);
 *     visible = webkit_window_properties_get_menubar_visible (window_properties);
 *     browser_window_set_menubar_visible (BROWSER_WINDOW (window), visible);
 *
 *     if (webkit_window_properties_get_fullscreen (window_properties)) {
 *         gtk_window_fullscreen (GTK_WINDOW (window));
 *     } else {
 *         GdkRectangle geometry;
 *
 *         gtk_window_set_resizable (GTK_WINDOW (window),
 *                                   webkit_window_properties_get_resizable (window_properties));
 *         webkit_window_properties_get_geometry (window_properties, &geometry);
 *         gtk_window_move (GTK_WINDOW (window), geometry.x, geometry.y);
 *         gtk_window_resize (GTK_WINDOW (window), geometry.width, geometry.height);
 *     }
 *
 *     gtk_widget_show (window);
 * }
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `geometry`: Property has no getter nor setter
 */
public class WindowProperties(pointer: CPointer<WebKitWindowProperties>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitWindowPropertiesPointer: CPointer<WebKitWindowProperties>
        get() = gPointer.reinterpret()

    /**
     * Whether window will be displayed fullscreen.
     */
    public val fullscreen: Boolean
        /**
         * Get whether the window should be shown in fullscreen state or not.
         *
         * @return true if the window should be fullscreen or false otherwise.
         */
        get() = webkit_window_properties_get_fullscreen(webkitWindowPropertiesPointer).asBoolean()

    /**
     * Whether the locationbar should be visible for the window.
     */
    public val locationbarVisible: Boolean
        /**
         * Get whether the window should have the locationbar visible or not.
         *
         * @return true if locationbar should be visible or false otherwise.
         */
        get() = webkit_window_properties_get_locationbar_visible(webkitWindowPropertiesPointer).asBoolean()

    /**
     * Whether the menubar should be visible for the window.
     */
    public val menubarVisible: Boolean
        /**
         * Get whether the window should have the menubar visible or not.
         *
         * @return true if menubar should be visible or false otherwise.
         */
        get() = webkit_window_properties_get_menubar_visible(webkitWindowPropertiesPointer).asBoolean()

    /**
     * Whether the window can be resized.
     */
    public val resizable: Boolean
        /**
         * Get whether the window should be resizable by the user or not.
         *
         * @return true if the window should be resizable or false otherwise.
         */
        get() = webkit_window_properties_get_resizable(webkitWindowPropertiesPointer).asBoolean()

    /**
     * Whether the scrollbars should be visible for the window.
     */
    public val scrollbarsVisible: Boolean
        /**
         * Get whether the window should have the scrollbars visible or not.
         *
         * @return true if scrollbars should be visible or false otherwise.
         */
        get() = webkit_window_properties_get_scrollbars_visible(webkitWindowPropertiesPointer).asBoolean()

    /**
     * Whether the statusbar should be visible for the window.
     */
    public val statusbarVisible: Boolean
        /**
         * Get whether the window should have the statusbar visible or not.
         *
         * @return true if statusbar should be visible or false otherwise.
         */
        get() = webkit_window_properties_get_statusbar_visible(webkitWindowPropertiesPointer).asBoolean()

    /**
     * Whether the toolbar should be visible for the window.
     */
    public val toolbarVisible: Boolean
        /**
         * Get whether the window should have the toolbar visible or not.
         *
         * @return true if toolbar should be visible or false otherwise.
         */
        get() = webkit_window_properties_get_toolbar_visible(webkitWindowPropertiesPointer).asBoolean()

    /**
     * Get the geometry the window should have on the screen when shown.
     *
     * @param geometry return location for the window geometry
     */
    public fun getGeometry(geometry: Rectangle): Unit =
        webkit_window_properties_get_geometry(webkitWindowPropertiesPointer, geometry.gPointer)

    public companion object : TypeCompanion<WindowProperties> {
        override val type: GeneratedClassKGType<WindowProperties> =
            GeneratedClassKGType(webkit_window_properties_get_type()) { WindowProperties(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of WindowProperties
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_window_properties_get_type()
    }
}
