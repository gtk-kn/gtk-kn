// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gio.Menu
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GActionGroup
import org.gtkkn.native.gio.GActionMap
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkApplication
import org.gtkkn.native.gtk.GtkWindow
import org.gtkkn.native.gtk.gtk_application_add_window
import org.gtkkn.native.gtk.gtk_application_get_accels_for_action
import org.gtkkn.native.gtk.gtk_application_get_actions_for_accel
import org.gtkkn.native.gtk.gtk_application_get_active_window
import org.gtkkn.native.gtk.gtk_application_get_menu_by_id
import org.gtkkn.native.gtk.gtk_application_get_menubar
import org.gtkkn.native.gtk.gtk_application_get_type
import org.gtkkn.native.gtk.gtk_application_get_window_by_id
import org.gtkkn.native.gtk.gtk_application_get_windows
import org.gtkkn.native.gtk.gtk_application_inhibit
import org.gtkkn.native.gtk.gtk_application_list_action_descriptions
import org.gtkkn.native.gtk.gtk_application_new
import org.gtkkn.native.gtk.gtk_application_remove_window
import org.gtkkn.native.gtk.gtk_application_set_accels_for_action
import org.gtkkn.native.gtk.gtk_application_set_menubar
import org.gtkkn.native.gtk.gtk_application_uninhibit
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List as CollectionsList
import org.gtkkn.bindings.glib.List as GlibList

/**
 * `GtkApplication` is a high-level API for writing applications.
 *
 * It supports many aspects of writing a GTK application in a convenient
 * fashion, without enforcing a one-size-fits-all model.
 *
 * Currently, `GtkApplication` handles GTK initialization, application
 * uniqueness, session management, provides some basic scriptability and
 * desktop shell integration by exporting actions and menus and manages a
 * list of toplevel windows whose life-cycle is automatically tied to the
 * life-cycle of your application.
 *
 * While `GtkApplication` works fine with plain [class@Gtk.Window]s, it is
 * recommended to use it together with [class@Gtk.ApplicationWindow].
 *
 * ## Automatic resources
 *
 * `GtkApplication` will automatically load menus from the `GtkBuilder`
 * resource located at "gtk/menus.ui", relative to the application's
 * resource base path (see [method@Gio.Application.set_resource_base_path]).
 * The menu with the ID "menubar" is taken as the application's
 * menubar. Additional menus (most interesting submenus) can be named
 * and accessed via [method@Gtk.Application.get_menu_by_id] which allows for
 * dynamic population of a part of the menu structure.
 *
 * Note that automatic resource loading uses the resource base path
 * that is set at construction time and will not work if the resource
 * base path is changed at a later time.
 *
 * It is also possible to provide the menubar manually using
 * [method@Gtk.Application.set_menubar].
 *
 * `GtkApplication` will also automatically setup an icon search path for
 * the default icon theme by appending "icons" to the resource base
 * path. This allows your application to easily store its icons as
 * resources. See [method@Gtk.IconTheme.add_resource_path] for more
 * information.
 *
 * If there is a resource located at `gtk/help-overlay.ui` which
 * defines a [class@Gtk.ShortcutsWindow] with ID `help_overlay` then
 * `GtkApplication` associates an instance of this shortcuts window with
 * each [class@Gtk.ApplicationWindow] and sets up the keyboard accelerator
 * <kbd>Control</kbd>+<kbd>?</kbd> to open it. To create a menu item that
 * displays the shortcuts window, associate the item with the action
 * `win.show-help-overlay`.
 *
 * ## A simple application
 *
 * [A simple example](https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/bp/bloatpad.c)
 * is available in the GTK source code repository
 *
 * `GtkApplication` optionally registers with a session manager of the
 * users session (if you set the [property@Gtk.Application:register-session]
 * property) and offers various functionality related to the session
 * life-cycle.
 *
 * An application can block various ways to end the session with
 * the [method@Gtk.Application.inhibit] function. Typical use cases for
 * this kind of inhibiting are long-running, uninterruptible operations,
 * such as burning a CD or performing a disk backup. The session
 * manager may not honor the inhibitor, but it can be expected to
 * inform the user about the negative consequences of ending the
 * session while inhibitors are present.
 *
 * ## See Also
 *
 * [HowDoI: Using GtkApplication](https://wiki.gnome.org/HowDoI/GtkApplication),
 * [Getting Started with GTK: Basics](getting_started.html#basics)
 *
 * ## Skipped during bindings generation
 *
 * - method `register-session`: Property has no getter nor setter
 * - method `screensaver-active`: Property has no getter nor setter
 */
public open class Application(pointer: CPointer<GtkApplication>) :
    org.gtkkn.bindings.gio.Application(pointer.reinterpret()),
    KGTyped {
    public val gtkApplicationPointer: CPointer<GtkApplication>
        get() = gPointer.reinterpret()

    override val gioActionGroupPointer: CPointer<GActionGroup>
        get() = gPointer.reinterpret()

    override val gioActionMapPointer: CPointer<GActionMap>
        get() = gPointer.reinterpret()

    /**
     * The currently focused window of the application.
     */
    public open val activeWindow: Window?
        /**
         * Gets the “active” window for the application.
         *
         * The active window is the one that was most recently focused (within
         * the application).  This window may not have the focus at the moment
         * if another application has it — this is just the most
         * recently-focused window within this application.
         *
         * @return the active window
         */
        get() = gtk_application_get_active_window(gtkApplicationPointer)?.run {
            Window(this)
        }

    /**
     * The `GMenuModel` to be used for the application's menu bar.
     */
    public open var menubar: MenuModel?
        /**
         * Returns the menu model that has been set with
         * [method@Gtk.Application.set_menubar].
         *
         * @return the menubar for windows of `application`
         */
        get() = gtk_application_get_menubar(gtkApplicationPointer)?.run {
            MenuModel(this)
        }

        /**
         * Sets or unsets the menubar for windows of `application`.
         *
         * This is a menubar in the traditional sense.
         *
         * This can only be done in the primary instance of the application,
         * after it has been registered. `GApplication::startup` is a good place
         * to call this.
         *
         * Depending on the desktop environment, this may appear at the top of
         * each window, or at the top of the screen.  In some environments, if
         * both the application menu and the menubar are set, the application
         * menu will be presented as if it were the first item of the menubar.
         * Other environments treat the two as completely separate — for example,
         * the application menu may be rendered by the desktop shell while the
         * menubar (if set) remains in each individual window.
         *
         * Use the base `GActionMap` interface to add actions, to respond to the
         * user selecting these menu items.
         *
         * @param menubar a `GMenuModel`
         */
        set(menubar) = gtk_application_set_menubar(gtkApplicationPointer, menubar?.gioMenuModelPointer)

    /**
     * Creates a new `GtkApplication` instance.
     *
     * When using `GtkApplication`, it is not necessary to call [func@Gtk.init]
     * manually. It is called as soon as the application gets registered as
     * the primary instance.
     *
     * Concretely, [func@Gtk.init] is called in the default handler for the
     * `GApplication::startup` signal. Therefore, `GtkApplication` subclasses should
     * always chain up in their `GApplication::startup` handler before using any GTK
     * API.
     *
     * Note that commandline arguments are not passed to [func@Gtk.init].
     *
     * If `application_id` is not null, then it must be valid. See
     * `g_application_id_is_valid()`.
     *
     * If no application ID is given then some features (most notably application
     * uniqueness) will be disabled.
     *
     * @param applicationId The application ID
     * @param flags the application flags
     * @return a new `GtkApplication` instance
     */
    public constructor(
        applicationId: String? = null,
        flags: ApplicationFlags,
    ) : this(gtk_application_new(applicationId, flags.mask)!!.reinterpret())

    /**
     * Adds a window to `application`.
     *
     * This call can only happen after the `application` has started;
     * typically, you should add new application windows in response
     * to the emission of the `GApplication::activate` signal.
     *
     * This call is equivalent to setting the [property@Gtk.Window:application]
     * property of `window` to `application`.
     *
     * Normally, the connection between the application and the window
     * will remain until the window is destroyed, but you can explicitly
     * remove it with [method@Gtk.Application.remove_window].
     *
     * GTK will keep the `application` running as long as it has
     * any windows.
     *
     * @param window a `GtkWindow`
     */
    public open fun addWindow(window: Window): Unit =
        gtk_application_add_window(gtkApplicationPointer, window.gtkWindowPointer)

    /**
     * Gets the accelerators that are currently associated with
     * the given action.
     *
     * @param detailedActionName a detailed action name, specifying an action
     *   and target to obtain accelerators for
     * @return accelerators for `detailed_action_name`
     */
    public open fun getAccelsForAction(detailedActionName: String): CollectionsList<String> =
        gtk_application_get_accels_for_action(gtkApplicationPointer, detailedActionName)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Returns the list of actions (possibly empty) that `accel` maps to.
     *
     * Each item in the list is a detailed action name in the usual form.
     *
     * This might be useful to discover if an accel already exists in
     * order to prevent installation of a conflicting accelerator (from
     * an accelerator editor or a plugin system, for example). Note that
     * having more than one action per accelerator may not be a bad thing
     * and might make sense in cases where the actions never appear in the
     * same context.
     *
     * In case there are no actions for a given accelerator, an empty array
     * is returned. `NULL` is never returned.
     *
     * It is a programmer error to pass an invalid accelerator string.
     *
     * If you are unsure, check it with [func@Gtk.accelerator_parse] first.
     *
     * @param accel an accelerator that can be parsed by [func@Gtk.accelerator_parse]
     * @return a null-terminated array of actions for `accel`
     */
    public open fun getActionsForAccel(accel: String): CollectionsList<String> =
        gtk_application_get_actions_for_accel(gtkApplicationPointer, accel)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Gets a menu from automatically loaded resources.
     *
     * See [the section on Automatic resources](class.Application.html#automatic-resources)
     * for more information.
     *
     * @param id the id of the menu to look up
     * @return Gets the menu with the
     *   given id from the automatically loaded resources
     */
    public open fun getMenuById(id: String): Menu? = gtk_application_get_menu_by_id(gtkApplicationPointer, id)?.run {
        Menu(this)
    }

    /**
     * Returns the [class@Gtk.ApplicationWindow] with the given ID.
     *
     * The ID of a `GtkApplicationWindow` can be retrieved with
     * [method@Gtk.ApplicationWindow.get_id].
     *
     * @param id an identifier number
     * @return the window for the given `id`
     */
    public open fun getWindowById(id: guint): Window? =
        gtk_application_get_window_by_id(gtkApplicationPointer, id)?.run {
            Window(this)
        }

    /**
     * Gets a list of the [class@Gtk.Window] instances associated with `application`.
     *
     * The list is sorted by most recently focused window, such that the first
     * element is the currently focused window. (Useful for choosing a parent
     * for a transient window.)
     *
     * The list that is returned should not be modified in any way. It will
     * only remain valid until the next focus change or window creation or
     * deletion.
     *
     * @return a `GList` of `GtkWindow`
     *   instances
     */
    public open fun getWindows(): GlibList = gtk_application_get_windows(gtkApplicationPointer)!!.run {
        GlibList(this)
    }

    /**
     * Inform the session manager that certain types of actions should be
     * inhibited.
     *
     * This is not guaranteed to work on all platforms and for all types of
     * actions.
     *
     * Applications should invoke this method when they begin an operation
     * that should not be interrupted, such as creating a CD or DVD. The
     * types of actions that may be blocked are specified by the `flags`
     * parameter. When the application completes the operation it should
     * call [method@Gtk.Application.uninhibit] to remove the inhibitor. Note
     * that an application can have multiple inhibitors, and all of them must
     * be individually removed. Inhibitors are also cleared when the
     * application exits.
     *
     * Applications should not expect that they will always be able to block
     * the action. In most cases, users will be given the option to force
     * the action to take place.
     *
     * The `reason` message should be short and to the point.
     *
     * If `window` is given, the session manager may point the user to
     * this window to find out more about why the action is inhibited.
     *
     * @param window a `GtkWindow`
     * @param flags what types of actions should be inhibited
     * @param reason a short, human-readable string that explains
     *   why these operations are inhibited
     * @return A non-zero cookie that is used to uniquely identify this
     *   request. It should be used as an argument to [method@Gtk.Application.uninhibit]
     *   in order to remove the request. If the platform does not support
     *   inhibiting or the request failed for some reason, 0 is returned.
     */
    public open fun inhibit(window: Window? = null, flags: ApplicationInhibitFlags, reason: String? = null): guint =
        gtk_application_inhibit(gtkApplicationPointer, window?.gtkWindowPointer, flags.mask, reason)

    /**
     * Lists the detailed action names which have associated accelerators.
     *
     * See [method@Gtk.Application.set_accels_for_action].
     *
     * @return the detailed action names
     */
    public open fun listActionDescriptions(): CollectionsList<String> =
        gtk_application_list_action_descriptions(gtkApplicationPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Remove a window from `application`.
     *
     * If `window` belongs to `application` then this call is equivalent to
     * setting the [property@Gtk.Window:application] property of `window` to
     * `NULL`.
     *
     * The application may stop running as a result of a call to this
     * function, if `window` was the last window of the `application`.
     *
     * @param window a `GtkWindow`
     */
    public open fun removeWindow(window: Window): Unit =
        gtk_application_remove_window(gtkApplicationPointer, window.gtkWindowPointer)

    /**
     * Sets zero or more keyboard accelerators that will trigger the
     * given action.
     *
     * The first item in `accels` will be the primary accelerator, which may be
     * displayed in the UI.
     *
     * To remove all accelerators for an action, use an empty, zero-terminated
     * array for `accels`.
     *
     * For the `detailed_action_name`, see `g_action_parse_detailed_name()` and
     * `g_action_print_detailed_name()`.
     *
     * @param detailedActionName a detailed action name, specifying an action
     *   and target to associate accelerators with
     * @param accels a list of accelerators in the format
     *   understood by [func@Gtk.accelerator_parse]
     */
    public open fun setAccelsForAction(detailedActionName: String, accels: CollectionsList<String>): Unit = memScoped {
        return gtk_application_set_accels_for_action(
            gtkApplicationPointer,
            detailedActionName,
            accels.toCStringList(this)
        )
    }

    /**
     * Removes an inhibitor that has been previously established.
     *
     * See [method@Gtk.Application.inhibit].
     *
     * Inhibitors are also cleared when the application exits.
     *
     * @param cookie a cookie that was returned by [method@Gtk.Application.inhibit]
     */
    public open fun uninhibit(cookie: guint): Unit = gtk_application_uninhibit(gtkApplicationPointer, cookie)

    /**
     * Emitted when the session manager is about to end the session.
     *
     * This signal is only emitted if [property@Gtk.Application:register-session]
     * is `TRUE`. Applications can connect to this signal and call
     * [method@Gtk.Application.inhibit] with `GTK_APPLICATION_INHIBIT_LOGOUT`
     * to delay the end of the session until state has been saved.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onQueryEnd(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "query-end",
            onQueryEndFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "query-end" signal. See [onQueryEnd].
     */
    public fun emitQueryEnd() {
        g_signal_emit_by_name(gPointer.reinterpret(), "query-end")
    }

    /**
     * Emitted when a [class@Gtk.Window] is added to `application` through
     * [method@Gtk.Application.add_window].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `window` the newly-added [class@Gtk.Window]
     */
    public fun onWindowAdded(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (window: Window) -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "window-added",
            onWindowAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "window-added" signal. See [onWindowAdded].
     *
     * @param window the newly-added [class@Gtk.Window]
     */
    public fun emitWindowAdded(window: Window) {
        g_signal_emit_by_name(gPointer.reinterpret(), "window-added", window.gtkWindowPointer)
    }

    /**
     * Emitted when a [class@Gtk.Window] is removed from `application`.
     *
     * This can happen as a side-effect of the window being destroyed
     * or explicitly through [method@Gtk.Application.remove_window].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `window` the [class@Gtk.Window] that is being removed
     */
    public fun onWindowRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (window: Window) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "window-removed",
        onWindowRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "window-removed" signal. See [onWindowRemoved].
     *
     * @param window the [class@Gtk.Window] that is being removed
     */
    public fun emitWindowRemoved(window: Window) {
        g_signal_emit_by_name(gPointer.reinterpret(), "window-removed", window.gtkWindowPointer)
    }

    public companion object : TypeCompanion<Application> {
        override val type: GeneratedClassKGType<Application> =
            GeneratedClassKGType(gtk_application_get_type()) { Application(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Application
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_application_get_type()
    }
}

private val onQueryEndFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onWindowAddedFunc: CPointer<CFunction<(CPointer<GtkWindow>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            window: CPointer<GtkWindow>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(window: Window) -> Unit>().get().invoke(
            window!!.run {
                Window(this)
            }
        )
    }
        .reinterpret()

private val onWindowRemovedFunc: CPointer<CFunction<(CPointer<GtkWindow>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            window: CPointer<GtkWindow>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(window: Window) -> Unit>().get().invoke(
            window!!.run {
                Window(this)
            }
        )
    }
        .reinterpret()
