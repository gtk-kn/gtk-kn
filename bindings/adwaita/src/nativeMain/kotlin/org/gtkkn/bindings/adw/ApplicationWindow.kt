// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwApplicationWindow
import org.gtkkn.native.adw.adw_application_window_add_breakpoint
import org.gtkkn.native.adw.adw_application_window_get_content
import org.gtkkn.native.adw.adw_application_window_get_current_breakpoint
import org.gtkkn.native.adw.adw_application_window_get_dialogs
import org.gtkkn.native.adw.adw_application_window_get_type
import org.gtkkn.native.adw.adw_application_window_get_visible_dialog
import org.gtkkn.native.adw.adw_application_window_new
import org.gtkkn.native.adw.adw_application_window_set_content
import org.gtkkn.native.gio.GActionGroup
import org.gtkkn.native.gio.GActionMap
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import kotlin.Unit

/**
 * A freeform application window.
 *
 * <picture>
 *   <source srcset="application-window-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="application-window.png" alt="application-window">
 * </picture>
 *
 * `AdwApplicationWindow` is a [class@Gtk.ApplicationWindow] subclass providing
 * the same features as [class@Window].
 *
 * See [class@Window] for details.
 *
 * Example of an `AdwApplicationWindow` UI definition:
 *
 * ```xml
 * <object class="AdwApplicationWindow">
 *   <property name="content">
 *     <object class="AdwToolbarView">
 *       <child type="top">
 *         <object class="AdwHeaderBar"/>
 *       </child>
 *       <property name="content">
 *         <!-- ... -->
 *       </property>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * Using [property@Gtk.Application:menubar] is not supported and may result in
 * visual glitches.
 */
public open class ApplicationWindow(
    pointer: CPointer<AdwApplicationWindow>,
) : org.gtkkn.bindings.gtk.ApplicationWindow(pointer.reinterpret()),
    KGTyped {
    public val adwApplicationWindowPointer: CPointer<AdwApplicationWindow>
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
     * The content widget.
     *
     * This property should always be used instead of [property@Gtk.Window:child].
     */
    public open var content: Widget?
        /**
         * Gets the content widget of @self.
         *
         * This method should always be used instead of [method@Gtk.Window.get_child].
         *
         * @return the content widget of @self
         */
        get() =
            adw_application_window_get_content(adwApplicationWindowPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the content widget of @self.
         *
         * This method should always be used instead of [method@Gtk.Window.set_child].
         *
         * @param content the content widget
         */
        set(
            content
        ) =
            adw_application_window_set_content(
                adwApplicationWindowPointer.reinterpret(),
                content?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * The current breakpoint.
     *
     * @since 1.4
     */
    public open val currentBreakpoint: Breakpoint?
        /**
         * Gets the current breakpoint.
         *
         * @return the current breakpoint
         * @since 1.4
         */
        get() =
            adw_application_window_get_current_breakpoint(adwApplicationWindowPointer.reinterpret())?.run {
                Breakpoint(reinterpret())
            }

    /**
     * The open dialogs.
     *
     * @since 1.5
     */
    public open val dialogs: ListModel
        /**
         * Returns a [iface@Gio.ListModel] that contains the open dialogs of @self.
         *
         * This can be used to keep an up-to-date view.
         *
         * @return a list model for the dialogs of @self
         * @since 1.5
         */
        get() =
            adw_application_window_get_dialogs(adwApplicationWindowPointer.reinterpret())!!.run {
                ListModel.wrap(reinterpret())
            }

    /**
     * The currently visible dialog
     *
     * @since 1.5
     */
    public open val visibleDialog: Dialog?
        /**
         * Returns the currently visible dialog in @self, if there's one.
         *
         * @return the visible dialog
         * @since 1.5
         */
        get() =
            adw_application_window_get_visible_dialog(adwApplicationWindowPointer.reinterpret())?.run {
                Dialog(reinterpret())
            }

    /**
     * Creates a new `AdwApplicationWindow` for @app.
     *
     * @param app an application instance
     * @return the newly created `AdwApplicationWindow`
     */
    public constructor(
        app: Application,
    ) : this(adw_application_window_new(app.gtkApplicationPointer.reinterpret())!!.reinterpret())

    /**
     * Adds @breakpoint to @self.
     *
     * @param breakpoint the breakpoint to add
     * @since 1.4
     */
    public open fun addBreakpoint(breakpoint: Breakpoint): Unit =
        adw_application_window_add_breakpoint(
            adwApplicationWindowPointer.reinterpret(),
            breakpoint.adwBreakpointPointer.reinterpret()
        )

    /**
     * Gets the content widget of @self.
     *
     * This method should always be used instead of [method@Gtk.Window.get_child].
     *
     * @return the content widget of @self
     */
    public open fun getContent(): Widget? =
        adw_application_window_get_content(adwApplicationWindowPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the current breakpoint.
     *
     * @return the current breakpoint
     * @since 1.4
     */
    public open fun getCurrentBreakpoint(): Breakpoint? =
        adw_application_window_get_current_breakpoint(adwApplicationWindowPointer.reinterpret())?.run {
            Breakpoint(reinterpret())
        }

    /**
     * Returns a [iface@Gio.ListModel] that contains the open dialogs of @self.
     *
     * This can be used to keep an up-to-date view.
     *
     * @return a list model for the dialogs of @self
     * @since 1.5
     */
    public open fun getDialogs(): ListModel =
        adw_application_window_get_dialogs(adwApplicationWindowPointer.reinterpret())!!.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Returns the currently visible dialog in @self, if there's one.
     *
     * @return the visible dialog
     * @since 1.5
     */
    public open fun getVisibleDialog(): Dialog? =
        adw_application_window_get_visible_dialog(adwApplicationWindowPointer.reinterpret())?.run {
            Dialog(reinterpret())
        }

    /**
     * Sets the content widget of @self.
     *
     * This method should always be used instead of [method@Gtk.Window.set_child].
     *
     * @param content the content widget
     */
    public open fun setContent(content: Widget? = null): Unit =
        adw_application_window_set_content(
            adwApplicationWindowPointer.reinterpret(),
            content?.gtkWidgetPointer?.reinterpret()
        )

    public companion object : TypeCompanion<ApplicationWindow> {
        override val type: GeneratedClassKGType<ApplicationWindow> =
            GeneratedClassKGType(adw_application_window_get_type()) { ApplicationWindow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
