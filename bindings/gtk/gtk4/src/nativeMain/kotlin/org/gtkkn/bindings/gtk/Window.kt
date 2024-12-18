// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gdk.Monitor
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_2
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_6
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.GtkWindow
import org.gtkkn.native.gtk.gtk_window_close
import org.gtkkn.native.gtk.gtk_window_destroy
import org.gtkkn.native.gtk.gtk_window_fullscreen
import org.gtkkn.native.gtk.gtk_window_fullscreen_on_monitor
import org.gtkkn.native.gtk.gtk_window_get_application
import org.gtkkn.native.gtk.gtk_window_get_child
import org.gtkkn.native.gtk.gtk_window_get_decorated
import org.gtkkn.native.gtk.gtk_window_get_default_icon_name
import org.gtkkn.native.gtk.gtk_window_get_default_widget
import org.gtkkn.native.gtk.gtk_window_get_deletable
import org.gtkkn.native.gtk.gtk_window_get_destroy_with_parent
import org.gtkkn.native.gtk.gtk_window_get_focus
import org.gtkkn.native.gtk.gtk_window_get_focus_visible
import org.gtkkn.native.gtk.gtk_window_get_group
import org.gtkkn.native.gtk.gtk_window_get_handle_menubar_accel
import org.gtkkn.native.gtk.gtk_window_get_hide_on_close
import org.gtkkn.native.gtk.gtk_window_get_icon_name
import org.gtkkn.native.gtk.gtk_window_get_mnemonics_visible
import org.gtkkn.native.gtk.gtk_window_get_modal
import org.gtkkn.native.gtk.gtk_window_get_resizable
import org.gtkkn.native.gtk.gtk_window_get_title
import org.gtkkn.native.gtk.gtk_window_get_titlebar
import org.gtkkn.native.gtk.gtk_window_get_toplevels
import org.gtkkn.native.gtk.gtk_window_get_transient_for
import org.gtkkn.native.gtk.gtk_window_get_type
import org.gtkkn.native.gtk.gtk_window_has_group
import org.gtkkn.native.gtk.gtk_window_is_active
import org.gtkkn.native.gtk.gtk_window_is_fullscreen
import org.gtkkn.native.gtk.gtk_window_is_maximized
import org.gtkkn.native.gtk.gtk_window_is_suspended
import org.gtkkn.native.gtk.gtk_window_list_toplevels
import org.gtkkn.native.gtk.gtk_window_maximize
import org.gtkkn.native.gtk.gtk_window_minimize
import org.gtkkn.native.gtk.gtk_window_new
import org.gtkkn.native.gtk.gtk_window_present
import org.gtkkn.native.gtk.gtk_window_present_with_time
import org.gtkkn.native.gtk.gtk_window_set_application
import org.gtkkn.native.gtk.gtk_window_set_auto_startup_notification
import org.gtkkn.native.gtk.gtk_window_set_child
import org.gtkkn.native.gtk.gtk_window_set_decorated
import org.gtkkn.native.gtk.gtk_window_set_default_icon_name
import org.gtkkn.native.gtk.gtk_window_set_default_size
import org.gtkkn.native.gtk.gtk_window_set_default_widget
import org.gtkkn.native.gtk.gtk_window_set_deletable
import org.gtkkn.native.gtk.gtk_window_set_destroy_with_parent
import org.gtkkn.native.gtk.gtk_window_set_display
import org.gtkkn.native.gtk.gtk_window_set_focus
import org.gtkkn.native.gtk.gtk_window_set_focus_visible
import org.gtkkn.native.gtk.gtk_window_set_handle_menubar_accel
import org.gtkkn.native.gtk.gtk_window_set_hide_on_close
import org.gtkkn.native.gtk.gtk_window_set_icon_name
import org.gtkkn.native.gtk.gtk_window_set_interactive_debugging
import org.gtkkn.native.gtk.gtk_window_set_mnemonics_visible
import org.gtkkn.native.gtk.gtk_window_set_modal
import org.gtkkn.native.gtk.gtk_window_set_resizable
import org.gtkkn.native.gtk.gtk_window_set_startup_id
import org.gtkkn.native.gtk.gtk_window_set_title
import org.gtkkn.native.gtk.gtk_window_set_titlebar
import org.gtkkn.native.gtk.gtk_window_set_transient_for
import org.gtkkn.native.gtk.gtk_window_unfullscreen
import org.gtkkn.native.gtk.gtk_window_unmaximize
import org.gtkkn.native.gtk.gtk_window_unminimize
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkWindow` is a toplevel window which can contain other widgets.
 *
 * ![An example GtkWindow](window.png)
 *
 * Windows normally have decorations that are under the control
 * of the windowing system and allow the user to manipulate the window
 * (resize it, move it, close it,...).
 *
 * # GtkWindow as GtkBuildable
 *
 * The `GtkWindow` implementation of the [iface@Gtk.Buildable] interface supports
 * setting a child as the titlebar by specifying “titlebar” as the “type”
 * attribute of a `<child>` element.
 *
 * # CSS nodes
 *
 * ```
 * window.background [.csd / .solid-csd / .ssd] [.maximized / .fullscreen / .tiled]
 * ├── <child>
 * ╰── <titlebar child>.titlebar [.default-decoration]
 * ```
 *
 * `GtkWindow` has a main CSS node with name window and style class .background.
 *
 * Style classes that are typically used with the main CSS node are .csd (when
 * client-side decorations are in use), .solid-csd (for client-side decorations
 * without invisible borders), .ssd (used by mutter when rendering server-side
 * decorations). GtkWindow also represents window states with the following
 * style classes on the main node: .maximized, .fullscreen, .tiled (when supported,
 * also .tiled-top, .tiled-left, .tiled-right, .tiled-bottom).
 *
 * `GtkWindow` subclasses often add their own discriminating style classes,
 * such as .dialog, .popup or .tooltip.
 *
 * Generally, some CSS properties don't make sense on the toplevel window node,
 * such as margins or padding. When client-side decorations without invisible
 * borders are in use (i.e. the .solid-csd style class is added to the
 * main window node), the CSS border of the toplevel window is used for
 * resize drags. In the .csd case, the shadow area outside of the window
 * can be used to resize it.
 *
 * `GtkWindow` adds the .titlebar and .default-decoration style classes to the
 * widget that is added as a titlebar child.
 *
 * # Accessibility
 *
 * Until GTK 4.10, `GtkWindow` used the `GTK_ACCESSIBLE_ROLE_WINDOW` role.
 *
 * Since GTK 4.12, `GtkWindow` uses the `GTK_ACCESSIBLE_ROLE_APPLICATION` role.
 *
 * # Actions
 *
 * `GtkWindow` defines a set of built-in actions:
 * - `default.activate`: Activate the default widget.
 * - `window.minimize`: Minimize the window.
 * - `window.toggle-maximized`: Maximize or restore the window.
 * - `window.close`: Close the window.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `width`: width: Out parameter is not supported
 * - method `default-height`: Property has no getter nor setter
 * - method `default-width`: Property has no getter nor setter
 * - method `display`: Property has no getter
 * - method `focus-widget`: Property has no getter nor setter
 * - method `fullscreened`: Property has no getter nor setter
 * - method `is-active`: Property has no getter nor setter
 * - method `maximized`: Property has no getter nor setter
 * - method `startup-id`: Property has no getter
 * - method `suspended`: Property has no getter nor setter
 */
public open class Window(pointer: CPointer<GtkWindow>) :
    Widget(pointer.reinterpret()),
    Native,
    Root,
    ShortcutManager,
    KGTyped {
    public val gtkWindowPointer: CPointer<GtkWindow>
        get() = gPointer.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gPointer.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = gPointer.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The `GtkApplication` associated with the window.
     *
     * The application will be kept alive for at least as long as it
     * has any windows associated with it (see g_application_hold()
     * for a way to keep it alive without windows).
     *
     * Normally, the connection between the application and the window
     * will remain until the window is destroyed, but you can explicitly
     * remove it by setting the :application property to null.
     */
    public open var application: Application?
        /**
         * Gets the `GtkApplication` associated with the window.
         *
         * @return a `GtkApplication`
         */
        get() = gtk_window_get_application(gtkWindowPointer.reinterpret())?.run {
            Application(reinterpret())
        }

        /**
         * Sets or unsets the `GtkApplication` associated with the window.
         *
         * The application will be kept alive for at least as long as it has
         * any windows associated with it (see g_application_hold() for a way
         * to keep it alive without windows).
         *
         * Normally, the connection between the application and the window will
         * remain until the window is destroyed, but you can explicitly remove
         * it by setting the @application to null.
         *
         * This is equivalent to calling [method@Gtk.Application.remove_window]
         * and/or [method@Gtk.Application.add_window] on the old/new applications
         * as relevant.
         *
         * @param application a `GtkApplication`, or null to unset
         */
        set(
            application
        ) = gtk_window_set_application(
            gtkWindowPointer.reinterpret(),
            application?.gtkApplicationPointer?.reinterpret()
        )

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @window.
         *
         * @return the child widget of @window
         */
        get() = gtk_window_get_child(gtkWindowPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the child widget of @window.
         *
         * @param child the child widget
         */
        set(child) = gtk_window_set_child(gtkWindowPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Whether the window should have a frame (also known as *decorations*).
     */
    public open var decorated: Boolean
        /**
         * Returns whether the window has been set to have decorations.
         *
         * @return true if the window has been set to have decorations
         */
        get() = gtk_window_get_decorated(gtkWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the window should be decorated.
         *
         * By default, windows are decorated with a title bar, resize
         * controls, etc. Some window managers allow GTK to disable these
         * decorations, creating a borderless window. If you set the decorated
         * property to false using this function, GTK will do its best to
         * convince the window manager not to decorate the window. Depending on
         * the system, this function may not have any effect when called on a
         * window that is already visible, so you should call it before calling
         * [method@Gtk.Widget.show].
         *
         * On Windows, this function always works, since there’s no window manager
         * policy involved.
         *
         * @param setting true to decorate the window
         */
        set(setting) = gtk_window_set_decorated(gtkWindowPointer.reinterpret(), setting.asGBoolean())

    /**
     * The default widget.
     */
    public open var defaultWidget: Widget?
        /**
         * Returns the default widget for @window.
         *
         * @return the default widget
         */
        get() = gtk_window_get_default_widget(gtkWindowPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the default widget.
         *
         * The default widget is the widget that is activated when the user
         * presses Enter in a dialog (for example).
         *
         * @param defaultWidget widget to be the default
         *   to unset the default widget for the toplevel
         */
        set(
            defaultWidget
        ) = gtk_window_set_default_widget(
            gtkWindowPointer.reinterpret(),
            defaultWidget?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Whether the window frame should have a close button.
     */
    public open var deletable: Boolean
        /**
         * Returns whether the window has been set to have a close button.
         *
         * @return true if the window has been set to have a close button
         */
        get() = gtk_window_get_deletable(gtkWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the window should be deletable.
         *
         * By default, windows have a close button in the window frame.
         * Some  window managers allow GTK to disable this button. If you
         * set the deletable property to false using this function, GTK
         * will do its best to convince the window manager not to show a
         * close button. Depending on the system, this function may not
         * have any effect when called on a window that is already visible,
         * so you should call it before calling [method@Gtk.Widget.show].
         *
         * On Windows, this function always works, since there’s no window
         * manager policy involved.
         *
         * @param setting true to decorate the window as deletable
         */
        set(setting) = gtk_window_set_deletable(gtkWindowPointer.reinterpret(), setting.asGBoolean())

    /**
     * If this window should be destroyed when the parent is destroyed.
     */
    public open var destroyWithParent: Boolean
        /**
         * Returns whether the window will be destroyed with its transient parent.
         *
         * @return true if the window will be destroyed with its transient parent.
         */
        get() = gtk_window_get_destroy_with_parent(gtkWindowPointer.reinterpret()).asBoolean()

        /**
         * If @setting is true, then destroying the transient parent of @window
         * will also destroy @window itself.
         *
         * This is useful for dialogs that shouldn’t persist beyond the lifetime
         * of the main window they are associated with, for example.
         *
         * @param setting whether to destroy @window with its transient parent
         */
        set(setting) = gtk_window_set_destroy_with_parent(gtkWindowPointer.reinterpret(), setting.asGBoolean())

    /**
     * Whether 'focus rectangles' are currently visible in this window.
     *
     * This property is maintained by GTK based on user input
     * and should not be set by applications.
     */
    public open var focusVisible: Boolean
        /**
         * Gets whether “focus rectangles” are supposed to be visible.
         *
         * @return true if “focus rectangles” are supposed to be visible
         *   in this window.
         */
        get() = gtk_window_get_focus_visible(gtkWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether “focus rectangles” are supposed to be visible.
         *
         * This property is maintained by GTK based on user input,
         * and should not be set by applications.
         *
         * @param setting the new value
         */
        set(setting) = gtk_window_set_focus_visible(gtkWindowPointer.reinterpret(), setting.asGBoolean())

    /**
     * Whether the window frame should handle F10 for activating
     * menubars.
     *
     * @since 4.2
     */
    @GtkVersion4_2
    public open var handleMenubarAccel: Boolean
        /**
         * Returns whether this window reacts to F10 key presses by
         * activating a menubar it contains.
         *
         * @return true if the window handles F10
         * @since 4.2
         */
        get() = gtk_window_get_handle_menubar_accel(gtkWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether this window should react to F10 key presses
         * by activating a menubar it contains.
         *
         * @param handleMenubarAccel true to make @window handle F10
         * @since 4.2
         */
        @GtkVersion4_2
        set(
            handleMenubarAccel
        ) = gtk_window_set_handle_menubar_accel(gtkWindowPointer.reinterpret(), handleMenubarAccel.asGBoolean())

    /**
     * If this window should be hidden when the users clicks the close button.
     */
    public open var hideOnClose: Boolean
        /**
         * Returns whether the window will be hidden when the close button is clicked.
         *
         * @return true if the window will be hidden
         */
        get() = gtk_window_get_hide_on_close(gtkWindowPointer.reinterpret()).asBoolean()

        /**
         * If @setting is true, then clicking the close button on the window
         * will not destroy it, but only hide it.
         *
         * @param setting whether to hide the window when it is closed
         */
        set(setting) = gtk_window_set_hide_on_close(gtkWindowPointer.reinterpret(), setting.asGBoolean())

    /**
     * Specifies the name of the themed icon to use as the window icon.
     *
     * See [class@Gtk.IconTheme] for more details.
     */
    public open var iconName: String?
        /**
         * Returns the name of the themed icon for the window.
         *
         * @return the icon name
         */
        get() = gtk_window_get_icon_name(gtkWindowPointer.reinterpret())?.toKString()

        /**
         * Sets the icon for the window from a named themed icon.
         *
         * See the docs for [class@Gtk.IconTheme] for more details.
         * On some platforms, the window icon is not used at all.
         *
         * Note that this has nothing to do with the WM_ICON_NAME
         * property which is mentioned in the ICCCM.
         *
         * @param name the name of the themed icon
         */
        set(name) = gtk_window_set_icon_name(gtkWindowPointer.reinterpret(), name)

    /**
     * Whether mnemonics are currently visible in this window.
     *
     * This property is maintained by GTK based on user input,
     * and should not be set by applications.
     */
    public open var mnemonicsVisible: Boolean
        /**
         * Gets whether mnemonics are supposed to be visible.
         *
         * @return true if mnemonics are supposed to be visible
         *   in this window.
         */
        get() = gtk_window_get_mnemonics_visible(gtkWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether mnemonics are supposed to be visible.
         *
         * This property is maintained by GTK based on user input,
         * and should not be set by applications.
         *
         * @param setting the new value
         */
        set(setting) = gtk_window_set_mnemonics_visible(gtkWindowPointer.reinterpret(), setting.asGBoolean())

    /**
     * If true, the window is modal.
     */
    public open var modal: Boolean
        /**
         * Returns whether the window is modal.
         *
         * @return true if the window is set to be modal and
         *   establishes a grab when shown
         */
        get() = gtk_window_get_modal(gtkWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets a window modal or non-modal.
         *
         * Modal windows prevent interaction with other windows in the same
         * application. To keep modal dialogs on top of main application windows,
         * use [method@Gtk.Window.set_transient_for] to make the dialog transient
         * for the parent; most window managers will then disallow lowering the
         * dialog below the parent.
         *
         * @param modal whether the window is modal
         */
        set(modal) = gtk_window_set_modal(gtkWindowPointer.reinterpret(), modal.asGBoolean())

    /**
     * If true, users can resize the window.
     */
    public open var resizable: Boolean
        /**
         * Gets the value set by gtk_window_set_resizable().
         *
         * @return true if the user can resize the window
         */
        get() = gtk_window_get_resizable(gtkWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the user can resize a window.
         *
         * Windows are user resizable by default.
         *
         * @param resizable true if the user can resize this window
         */
        set(resizable) = gtk_window_set_resizable(gtkWindowPointer.reinterpret(), resizable.asGBoolean())

    /**
     * The title of the window.
     */
    public open var title: String?
        /**
         * Retrieves the title of the window.
         *
         * @return the title of the window
         */
        get() = gtk_window_get_title(gtkWindowPointer.reinterpret())?.toKString()

        /**
         * Sets the title of the `GtkWindow`.
         *
         * The title of a window will be displayed in its title bar; on the
         * X Window System, the title bar is rendered by the window manager
         * so exactly how the title appears to users may vary according to a
         * user’s exact configuration. The title should help a user distinguish
         * this window from other windows they may have open. A good title might
         * include the application name and current document filename, for example.
         *
         * Passing null does the same as setting the title to an empty string.
         *
         * @param title title of the window
         */
        set(title) = gtk_window_set_title(gtkWindowPointer.reinterpret(), title)

    /**
     * The titlebar widget.
     *
     * @since 4.6
     */
    @GtkVersion4_6
    public open var titlebar: Widget?
        /**
         * Returns the custom titlebar that has been set with
         * gtk_window_set_titlebar().
         *
         * @return the custom titlebar
         */
        get() = gtk_window_get_titlebar(gtkWindowPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets a custom titlebar for @window.
         *
         * A typical widget used here is [class@Gtk.HeaderBar], as it
         * provides various features expected of a titlebar while allowing
         * the addition of child widgets to it.
         *
         * If you set a custom titlebar, GTK will do its best to convince
         * the window manager not to put its own titlebar on the window.
         * Depending on the system, this function may not work for a window
         * that is already visible, so you set the titlebar before calling
         * [method@Gtk.Widget.show].
         *
         * @param titlebar the widget to use as titlebar
         */
        set(
            titlebar
        ) = gtk_window_set_titlebar(gtkWindowPointer.reinterpret(), titlebar?.gtkWidgetPointer?.reinterpret())

    /**
     * The transient parent of the window.
     */
    public open var transientFor: Window?
        /**
         * Fetches the transient parent for this window.
         *
         * @return the transient parent for this window
         */
        get() = gtk_window_get_transient_for(gtkWindowPointer.reinterpret())?.run {
            Window(reinterpret())
        }

        /**
         * Dialog windows should be set transient for the main application
         * window they were spawned from. This allows window managers to e.g.
         * keep the dialog on top of the main window, or center the dialog
         * over the main window. [ctor@Gtk.Dialog.new_with_buttons] and other
         * convenience functions in GTK will sometimes call
         * gtk_window_set_transient_for() on your behalf.
         *
         * Passing null for @parent unsets the current transient window.
         *
         * On Windows, this function puts the child window on top of the parent,
         * much as the window manager would have done on X.
         *
         * @param parent parent window
         */
        set(
            parent
        ) = gtk_window_set_transient_for(gtkWindowPointer.reinterpret(), parent?.gtkWindowPointer?.reinterpret())

    /**
     * Creates a new `GtkWindow`.
     *
     * To get an undecorated window (no window borders), use
     * [method@Gtk.Window.set_decorated].
     *
     * All top-level windows created by gtk_window_new() are stored
     * in an internal top-level window list. This list can be obtained
     * from [func@Gtk.Window.list_toplevels]. Due to GTK keeping a
     * reference to the window internally, gtk_window_new() does not
     * return a reference to the caller.
     *
     * To delete a `GtkWindow`, call [method@Gtk.Window.destroy].
     *
     * @return a new `GtkWindow`.
     */
    public constructor() : this(gtk_window_new()!!.reinterpret())

    /**
     * Requests that the window is closed.
     *
     * This is similar to what happens when a window manager
     * close button is clicked.
     *
     * This function can be used with close buttons in custom
     * titlebars.
     */
    public open fun close(): Unit = gtk_window_close(gtkWindowPointer.reinterpret())

    /**
     * Drop the internal reference GTK holds on toplevel windows.
     */
    public open fun destroy(): Unit = gtk_window_destroy(gtkWindowPointer.reinterpret())

    /**
     * Asks to place @window in the fullscreen state.
     *
     * Note that you shouldn’t assume the window is definitely fullscreen
     * afterward, because other entities (e.g. the user or window manager)
     * unfullscreen it again, and not all window managers honor requests
     * to fullscreen windows.
     *
     * You can track the result of this operation via the
     * [property@Gdk.Toplevel:state] property, or by listening to
     * notifications of the [property@Gtk.Window:fullscreened] property.
     */
    public open fun fullscreen(): Unit = gtk_window_fullscreen(gtkWindowPointer.reinterpret())

    /**
     * Asks to place @window in the fullscreen state on the given @monitor.
     *
     * Note that you shouldn't assume the window is definitely fullscreen
     * afterward, or that the windowing system allows fullscreen windows on
     * any given monitor.
     *
     * You can track the result of this operation via the
     * [property@Gdk.Toplevel:state] property, or by listening to
     * notifications of the [property@Gtk.Window:fullscreened] property.
     *
     * @param monitor which monitor to go fullscreen on
     */
    public open fun fullscreenOnMonitor(monitor: Monitor): Unit =
        gtk_window_fullscreen_on_monitor(gtkWindowPointer.reinterpret(), monitor.gdkMonitorPointer.reinterpret())

    /**
     * Retrieves the current focused widget within the window.
     *
     * Note that this is the widget that would have the focus
     * if the toplevel window focused; if the toplevel window
     * is not focused then `gtk_widget_has_focus (widget)` will
     * not be true for the widget.
     *
     * @return the currently focused widget
     */
    override fun getFocus(): Widget? = gtk_window_get_focus(gtkWindowPointer.reinterpret())?.run {
        Widget(reinterpret())
    }

    /**
     * Returns the group for @window.
     *
     * If the window has no group, then the default group is returned.
     *
     * @return the `GtkWindowGroup` for a window
     *   or the default group
     */
    public open fun getGroup(): WindowGroup = gtk_window_get_group(gtkWindowPointer.reinterpret())!!.run {
        WindowGroup(reinterpret())
    }

    /**
     * Returns whether @window has an explicit window group.
     *
     * @return true if @window has an explicit window group.
     */
    public open fun hasGroup(): Boolean = gtk_window_has_group(gtkWindowPointer.reinterpret()).asBoolean()

    /**
     * Returns whether the window is part of the current active toplevel.
     *
     * The active toplevel is the window receiving keystrokes.
     *
     * The return value is true if the window is active toplevel itself.
     * You might use this function if you wanted to draw a widget
     * differently in an active window from a widget in an inactive window.
     *
     * @return true if the window part of the current active window.
     */
    public open fun isActive(): Boolean = gtk_window_is_active(gtkWindowPointer.reinterpret()).asBoolean()

    /**
     * Retrieves the current fullscreen state of @window.
     *
     * Note that since fullscreening is ultimately handled by the window
     * manager and happens asynchronously to an application request, you
     * shouldn’t assume the return value of this function changing
     * immediately (or at all), as an effect of calling
     * [method@Gtk.Window.fullscreen] or [method@Gtk.Window.unfullscreen].
     *
     * If the window isn't yet mapped, the value returned will whether the
     * initial requested state is fullscreen.
     *
     * @return whether the window has a fullscreen state.
     */
    public open fun isFullscreen(): Boolean = gtk_window_is_fullscreen(gtkWindowPointer.reinterpret()).asBoolean()

    /**
     * Retrieves the current maximized state of @window.
     *
     * Note that since maximization is ultimately handled by the window
     * manager and happens asynchronously to an application request, you
     * shouldn’t assume the return value of this function changing
     * immediately (or at all), as an effect of calling
     * [method@Gtk.Window.maximize] or [method@Gtk.Window.unmaximize].
     *
     * If the window isn't yet mapped, the value returned will whether the
     * initial requested state is maximized.
     *
     * @return whether the window has a maximized state.
     */
    public open fun isMaximized(): Boolean = gtk_window_is_maximized(gtkWindowPointer.reinterpret()).asBoolean()

    /**
     * Retrieves the current suspended state of @window.
     *
     * A window being suspended means it's currently not visible to the user, for
     * example by being on a inactive workspace, minimized, obstructed.
     *
     * @return whether the window is suspended.
     * @since 4.12
     */
    @GtkVersion4_12
    public open fun isSuspended(): Boolean = gtk_window_is_suspended(gtkWindowPointer.reinterpret()).asBoolean()

    /**
     * Asks to maximize @window, so that it fills the screen.
     *
     * Note that you shouldn’t assume the window is definitely maximized
     * afterward, because other entities (e.g. the user or window manager)
     * could unmaximize it again, and not all window managers support
     * maximization.
     *
     * It’s permitted to call this function before showing a window,
     * in which case the window will be maximized when it appears onscreen
     * initially.
     *
     * You can track the result of this operation via the
     * [property@Gdk.Toplevel:state] property, or by listening to
     * notifications on the [property@Gtk.Window:maximized]
     * property.
     */
    public open fun maximize(): Unit = gtk_window_maximize(gtkWindowPointer.reinterpret())

    /**
     * Asks to minimize the specified @window.
     *
     * Note that you shouldn’t assume the window is definitely minimized
     * afterward, because the windowing system might not support this
     * functionality; other entities (e.g. the user or the window manager)
     * could unminimize it again, or there may not be a window manager in
     * which case minimization isn’t possible, etc.
     *
     * It’s permitted to call this function before showing a window,
     * in which case the window will be minimized before it ever appears
     * onscreen.
     *
     * You can track result of this operation via the
     * [property@Gdk.Toplevel:state] property.
     */
    public open fun minimize(): Unit = gtk_window_minimize(gtkWindowPointer.reinterpret())

    /**
     * Presents a window to the user.
     *
     * This may mean raising the window in the stacking order,
     * unminimizing it, moving it to the current desktop and/or
     * giving it the keyboard focus (possibly dependent on the user’s
     * platform, window manager and preferences).
     *
     * If @window is hidden, this function also makes it visible.
     */
    public open fun present(): Unit = gtk_window_present(gtkWindowPointer.reinterpret())

    /**
     * Presents a window to the user in response to an user interaction.
     *
     * See [method@Gtk.Window.present] for more details.
     *
     * The timestamp should be gathered when the window was requested
     * to be shown (when clicking a link for example), rather than once
     * the window is ready to be shown.
     *
     * @param timestamp the timestamp of the user interaction (typically a
     *   button or key press event) which triggered this call
     */
    public open fun presentWithTime(timestamp: guint): Unit =
        gtk_window_present_with_time(gtkWindowPointer.reinterpret(), timestamp)

    /**
     * Sets the default size of a window.
     *
     * The default size of a window is the size that will be used if no other constraints apply.
     *
     * The default size will be updated whenever the window is resized
     * to reflect the new size, unless the window is forced to a size,
     * like when it is maximized or fullscreened.
     *
     * If the window’s minimum size request is larger than
     * the default, the default will be ignored.
     *
     * Setting the default size to a value <= 0 will cause it to be
     * ignored and the natural size request will be used instead. It
     * is possible to do this while the window is showing to "reset"
     * it to its initial size.
     *
     * Unlike [method@Gtk.Widget.set_size_request], which sets a size
     * request for a widget and thus would keep users from shrinking
     * the window, this function only sets the initial size, just as
     * if the user had resized the window themselves. Users can still
     * shrink the window again as they normally would. Setting a default
     * size of -1 means to use the “natural” default size (the size request
     * of the window).
     *
     * If you use this function to reestablish a previously saved window size,
     * note that the appropriate size to save is the one returned by
     * [method@Gtk.Window.get_default_size]. Using the window allocation
     * directly will not work in all circumstances and can lead to growing
     * or shrinking windows.
     *
     * @param width width in pixels, or -1 to unset the default width
     * @param height height in pixels, or -1 to unset the default height
     */
    public open fun setDefaultSize(width: gint, height: gint): Unit =
        gtk_window_set_default_size(gtkWindowPointer.reinterpret(), width, height)

    /**
     * Sets the `GdkDisplay` where the @window is displayed.
     *
     * If the window is already mapped, it will be unmapped,
     * and then remapped on the new display.
     *
     * @param display a `GdkDisplay`
     */
    public open fun setDisplay(display: Display): Unit =
        gtk_window_set_display(gtkWindowPointer.reinterpret(), display.gdkDisplayPointer.reinterpret())

    /**
     * Sets the focus widget.
     *
     * If @focus is not the current focus widget, and is focusable,
     * sets it as the focus widget for the window. If @focus is null,
     * unsets the focus widget for this window. To set the focus to a
     * particular widget in the toplevel, it is usually more convenient
     * to use [method@Gtk.Widget.grab_focus] instead of this function.
     *
     * @param focus widget to be the new focus widget, or null to unset
     *   any focus widget for the toplevel window.
     */
    override fun setFocus(focus: Widget?): Unit =
        gtk_window_set_focus(gtkWindowPointer.reinterpret(), focus?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets the startup notification ID.
     *
     * Startup notification identifiers are used by desktop environment
     * to track application startup, to provide user feedback and other
     * features. This function changes the corresponding property on the
     * underlying `GdkSurface`.
     *
     * Normally, startup identifier is managed automatically and you should
     * only use this function in special cases like transferring focus from
     * other processes. You should use this function before calling
     * [method@Gtk.Window.present] or any equivalent function generating
     * a window map event.
     *
     * This function is only useful on X11, not with other GTK targets.
     *
     * @param startupId a string with startup-notification identifier
     */
    public open fun setStartupId(startupId: String): Unit =
        gtk_window_set_startup_id(gtkWindowPointer.reinterpret(), startupId)

    /**
     * Asks to remove the fullscreen state for @window, and return to
     * its previous state.
     *
     * Note that you shouldn’t assume the window is definitely not
     * fullscreen afterward, because other entities (e.g. the user or
     * window manager) could fullscreen it again, and not all window
     * managers honor requests to unfullscreen windows; normally the
     * window will end up restored to its normal state. Just don’t
     * write code that crashes if not.
     *
     * You can track the result of this operation via the
     * [property@Gdk.Toplevel:state] property, or by listening to
     * notifications of the [property@Gtk.Window:fullscreened] property.
     */
    public open fun unfullscreen(): Unit = gtk_window_unfullscreen(gtkWindowPointer.reinterpret())

    /**
     * Asks to unmaximize @window.
     *
     * Note that you shouldn’t assume the window is definitely unmaximized
     * afterward, because other entities (e.g. the user or window manager)
     * maximize it again, and not all window managers honor requests to
     * unmaximize.
     *
     * You can track the result of this operation via the
     * [property@Gdk.Toplevel:state] property, or by listening to
     * notifications on the [property@Gtk.Window:maximized] property.
     */
    public open fun unmaximize(): Unit = gtk_window_unmaximize(gtkWindowPointer.reinterpret())

    /**
     * Asks to unminimize the specified @window.
     *
     * Note that you shouldn’t assume the window is definitely unminimized
     * afterward, because the windowing system might not support this
     * functionality; other entities (e.g. the user or the window manager)
     * could minimize it again, or there may not be a window manager in
     * which case minimization isn’t possible, etc.
     *
     * You can track result of this operation via the
     * [property@Gdk.Toplevel:state] property.
     */
    public open fun unminimize(): Unit = gtk_window_unminimize(gtkWindowPointer.reinterpret())

    /**
     * Emitted when the user activates the default widget
     * of @window.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivateDefault(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate-default",
            connectActivateDefaultFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user activates the currently focused
     * widget of @window.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivateFocus(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate-focus",
            connectActivateFocusFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user clicks on the close button of the window.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true to stop other handlers from being invoked for the signal
     */
    public fun connectCloseRequest(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "close-request",
            connectCloseRequestFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user enables or disables interactive debugging.
     *
     * When @toggle is true, interactive debugging is toggled on or off,
     * when it is false, the debugger will be pointed at the widget
     * under the pointer.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are Ctrl-Shift-I
     * and Ctrl-Shift-D.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `toggle` toggle the debugger. Returns true if the key binding was handled
     */
    public fun connectEnableDebugging(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (toggle: Boolean) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "enable-debugging",
        connectEnableDebuggingFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * emitted when the set of accelerators or mnemonics that
     * are associated with @window changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectKeysChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "keys-changed",
            connectKeysChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Window> {
        override val type: GeneratedClassKGType<Window> =
            GeneratedClassKGType(gtk_window_get_type()) { Window(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Returns the fallback icon name for windows.
         *
         * The returned string is owned by GTK and should not
         * be modified. It is only valid until the next call to
         * [func@Gtk.Window.set_default_icon_name].
         *
         * @return the fallback icon name for windows
         */
        public fun getDefaultIconName(): String? = gtk_window_get_default_icon_name()?.toKString()

        /**
         * Returns a list of all existing toplevel windows.
         *
         * If you want to iterate through the list and perform actions involving
         * callbacks that might destroy the widgets or add new ones, be aware that
         * the list of toplevels will change and emit the "items-changed" signal.
         *
         * @return the list
         *   of toplevel widgets
         */
        public fun getToplevels(): ListModel = gtk_window_get_toplevels()!!.run {
            ListModel.wrap(reinterpret())
        }

        /**
         * Returns a list of all existing toplevel windows.
         *
         * The widgets in the list are not individually referenced.
         * If you want to iterate through the list and perform actions
         * involving callbacks that might destroy the widgets, you must
         * call `g_list_foreach (result, (GFunc)g_object_ref, NULL)` first,
         * and then unref all the widgets afterwards.
         *
         * @return list of
         *   toplevel widgets
         */
        public fun listToplevels(): List = gtk_window_list_toplevels()!!.run {
            List(reinterpret())
        }

        /**
         * Sets whether the window should request startup notification.
         *
         * By default, after showing the first `GtkWindow`, GTK calls
         * [method@Gdk.Toplevel.set_startup_id]. Call this function
         * to disable the automatic startup notification. You might do this
         * if your first window is a splash screen, and you want to delay
         * notification until after your real main window has been shown,
         * for example.
         *
         * In that example, you would disable startup notification
         * temporarily, show your splash screen, then re-enable it so that
         * showing the main window would automatically result in notification.
         *
         * @param setting true to automatically do startup notification
         */
        public fun setAutoStartupNotification(setting: Boolean): Unit =
            gtk_window_set_auto_startup_notification(setting.asGBoolean())

        /**
         * Sets an icon to be used as fallback.
         *
         * The fallback icon is used for windows that
         * haven't had [method@Gtk.Window.set_icon_name]
         * called on them.
         *
         * @param name the name of the themed icon
         */
        public fun setDefaultIconName(name: String): Unit = gtk_window_set_default_icon_name(name)

        /**
         * Opens or closes the [interactive debugger](running.html#interactive-debugging).
         *
         * The debugger offers access to the widget hierarchy of the application
         * and to useful debugging tools.
         *
         * @param enable true to enable interactive debugging
         */
        public fun setInteractiveDebugging(enable: Boolean): Unit =
            gtk_window_set_interactive_debugging(enable.asGBoolean())

        /**
         * Get the GType of Window
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_window_get_type()
    }
}

private val connectActivateDefaultFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectActivateFocusFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectCloseRequestFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val connectEnableDebuggingFunc: CPointer<CFunction<(gboolean) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            toggle: gboolean,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(toggle: Boolean) -> Boolean>().get().invoke(toggle.asBoolean()).asGBoolean()
    }
        .reinterpret()

private val connectKeysChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
