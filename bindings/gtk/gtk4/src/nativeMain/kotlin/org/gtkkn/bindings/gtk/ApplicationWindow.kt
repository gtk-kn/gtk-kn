// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ActionGroup
import org.gtkkn.bindings.gio.ActionMap
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GActionGroup
import org.gtkkn.native.gio.GActionMap
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkApplicationWindow
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_application_window_get_help_overlay
import org.gtkkn.native.gtk.gtk_application_window_get_id
import org.gtkkn.native.gtk.gtk_application_window_get_show_menubar
import org.gtkkn.native.gtk.gtk_application_window_get_type
import org.gtkkn.native.gtk.gtk_application_window_new
import org.gtkkn.native.gtk.gtk_application_window_set_help_overlay
import org.gtkkn.native.gtk.gtk_application_window_set_show_menubar
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkApplicationWindow` is a `GtkWindow` subclass that integrates with
 * `GtkApplication`.
 *
 * Notably, `GtkApplicationWindow` can handle an application menubar.
 *
 * This class implements the `GActionGroup` and `GActionMap` interfaces,
 * to let you add window-specific actions that will be exported by the
 * associated [class@Gtk.Application], together with its application-wide
 * actions. Window-specific actions are prefixed with the “win.”
 * prefix and application-wide actions are prefixed with the “app.”
 * prefix. Actions must be addressed with the prefixed name when
 * referring to them from a `GMenuModel`.
 *
 * Note that widgets that are placed inside a `GtkApplicationWindow`
 * can also activate these actions, if they implement the
 * [iface@Gtk.Actionable] interface.
 *
 * The settings [property@Gtk.Settings:gtk-shell-shows-app-menu] and
 * [property@Gtk.Settings:gtk-shell-shows-menubar] tell GTK whether the
 * desktop environment is showing the application menu and menubar
 * models outside the application as part of the desktop shell.
 * For instance, on OS X, both menus will be displayed remotely;
 * on Windows neither will be.
 *
 * If the desktop environment does not display the menubar, then
 * `GtkApplicationWindow` will automatically show a menubar for it.
 * This behaviour can be overridden with the
 * [property@Gtk.ApplicationWindow:show-menubar] property. If the
 * desktop environment does not display the application menu, then
 * it will automatically be included in the menubar or in the windows
 * client-side decorations.
 *
 * See [class@Gtk.PopoverMenu] for information about the XML language
 * used by `GtkBuilder` for menu models.
 *
 * See also: [method@Gtk.Application.set_menubar].
 *
 * ## A GtkApplicationWindow with a menubar
 *
 * The code sample below shows how to set up a `GtkApplicationWindow`
 * with a menu bar defined on the [class@Gtk.Application]:
 *
 * ```c
 * GtkApplication *app = gtk_application_new ("org.gtk.test", 0);
 *
 * GtkBuilder *builder = gtk_builder_new_from_string (
 *     "<interface>"
 *     "  <menu id='menubar'>"
 *     "    <submenu>"
 *     "      <attribute name='label' translatable='yes'>_Edit</attribute>"
 *     "      <item>"
 *     "        <attribute name='label' translatable='yes'>_Copy</attribute>"
 *     "        <attribute name='action'>win.copy</attribute>"
 *     "      </item>"
 *     "      <item>"
 *     "        <attribute name='label' translatable='yes'>_Paste</attribute>"
 *     "        <attribute name='action'>win.paste</attribute>"
 *     "      </item>"
 *     "    </submenu>"
 *     "  </menu>"
 *     "</interface>",
 *     -1);
 *
 * GMenuModel *menubar = G_MENU_MODEL (gtk_builder_get_object (builder, "menubar"));
 * gtk_application_set_menubar (GTK_APPLICATION (app), menubar);
 * g_object_unref (builder);
 *
 * // ...
 *
 * GtkWidget *window = gtk_application_window_new (app);
 * ```
 */
public open class ApplicationWindow(pointer: CPointer<GtkApplicationWindow>) :
    Window(pointer.reinterpret()),
    ActionGroup,
    ActionMap,
    KGTyped {
    public val gtkApplicationWindowPointer: CPointer<GtkApplicationWindow>
        get() = gPointer.reinterpret()

    override val gioActionGroupPointer: CPointer<GActionGroup>
        get() = gPointer.reinterpret()

    override val gioActionMapPointer: CPointer<GActionMap>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gPointer.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = gPointer.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = gPointer.reinterpret()

    /**
     * If this property is true, the window will display a menubar
     * unless it is shown by the desktop shell.
     *
     * See [method@Gtk.Application.set_menubar].
     *
     * If false, the window will not display a menubar, regardless
     * of whether the desktop shell is showing it or not.
     */
    public open var showMenubar: Boolean
        /**
         * Returns whether the window will display a menubar for the app menu
         * and menubar as needed.
         *
         * @return true if @window will display a menubar when needed
         */
        get() = gtk_application_window_get_show_menubar(gtkApplicationWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the window will display a menubar for the app menu
         * and menubar as needed.
         *
         * @param showMenubar whether to show a menubar when needed
         */
        set(
            showMenubar
        ) = gtk_application_window_set_show_menubar(gtkApplicationWindowPointer.reinterpret(), showMenubar.asGBoolean())

    /**
     * Creates a new `GtkApplicationWindow`.
     *
     * @param application a `GtkApplication`
     * @return a newly created `GtkApplicationWindow`
     */
    public constructor(
        application: Application,
    ) : this(gtk_application_window_new(application.gtkApplicationPointer.reinterpret())!!.reinterpret())

    /**
     * Gets the `GtkShortcutsWindow` that is associated with @window.
     *
     * See [method@Gtk.ApplicationWindow.set_help_overlay].
     *
     * @return the help overlay associated
     *   with @window
     */
    public open fun getHelpOverlay(): ShortcutsWindow? =
        gtk_application_window_get_help_overlay(gtkApplicationWindowPointer.reinterpret())?.run {
            ShortcutsWindow(reinterpret())
        }

    /**
     * Returns the unique ID of the window.
     *
     *  If the window has not yet been added to a `GtkApplication`, returns `0`.
     *
     * @return the unique ID for @window, or `0` if the window
     *   has not yet been added to a `GtkApplication`
     */
    public open fun getId(): guint = gtk_application_window_get_id(gtkApplicationWindowPointer.reinterpret())

    /**
     * Associates a shortcuts window with the application window.
     *
     * Additionally, sets up an action with the name
     * `win.show-help-overlay` to present it.
     *
     * @window takes responsibility for destroying @help_overlay.
     *
     * @param helpOverlay a `GtkShortcutsWindow`
     */
    public open fun setHelpOverlay(helpOverlay: ShortcutsWindow? = null): Unit =
        gtk_application_window_set_help_overlay(
            gtkApplicationWindowPointer.reinterpret(),
            helpOverlay?.gtkShortcutsWindowPointer?.reinterpret()
        )

    public companion object : TypeCompanion<ApplicationWindow> {
        override val type: GeneratedClassKGType<ApplicationWindow> =
            GeneratedClassKGType(gtk_application_window_get_type()) { ApplicationWindow(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ApplicationWindow
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_application_window_get_type()
    }
}
