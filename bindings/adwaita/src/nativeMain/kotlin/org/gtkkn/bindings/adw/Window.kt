// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.adw.annotations.AdwVersion1_5
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwWindow
import org.gtkkn.native.adw.adw_window_add_breakpoint
import org.gtkkn.native.adw.adw_window_get_content
import org.gtkkn.native.adw.adw_window_get_current_breakpoint
import org.gtkkn.native.adw.adw_window_get_dialogs
import org.gtkkn.native.adw.adw_window_get_type
import org.gtkkn.native.adw.adw_window_get_visible_dialog
import org.gtkkn.native.adw.adw_window_new
import org.gtkkn.native.adw.adw_window_set_content
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import kotlin.Unit

/**
 * A freeform window.
 *
 * <picture>
 *   <source srcset="window-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="window.png" alt="window">
 * </picture>
 *
 * The `AdwWindow` widget is a subclass of [class@Gtk.Window] which has no
 * titlebar area. Instead, [class@ToolbarView] can be used together with
 * [class@HeaderBar] or [class@Gtk.HeaderBar] as follows:
 *
 * ```xml
 * <object class="AdwWindow">
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
 * Using [property@Gtk.Window:titlebar] or [property@Gtk.Window:child]
 * is not supported and will result in a crash. Use [property@Window:content]
 * instead.
 *
 * ## Dialogs
 *
 * `AdwWindow` can contain [class@Dialog]. Use [method@Dialog.present] with the
 * window or a widget within a window to show a dialog.
 *
 * ## Breakpoints
 *
 * `AdwWindow` can be used with [class@Breakpoint] the same way as
 * [class@BreakpointBin]. Refer to that widget's documentation for details.
 *
 * Example:
 *
 * ```xml
 * <object class="AdwWindow">
 *   <property name="content">
 *     <object class="AdwToolbarView">
 *       <child type="top">
 *         <object class="AdwHeaderBar"/>
 *       </child>
 *       <property name="content">
 *         <!-- ... -->
 *       </property>
 *       <child type="bottom">
 *         <object class="GtkActionBar" id="bottom_bar">
 *           <property name="revealed">True</property>
 *           <property name="visible">False</property>
 *         </object>
 *       </child>
 *     </object>
 *   </property>
 *   <child>
 *     <object class="AdwBreakpoint">
 *       <condition>max-width: 500px</condition>
 *       <setter object="bottom_bar" property="visible">True</setter>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * When breakpoints are used, the minimum size must be larger than the smallest
 * UI state. `AdwWindow` defaults to the minimum size of 360×200 px. If that's
 * too small, set the [property@Gtk.Widget:width-request] and
 * [property@Gtk.Widget:height-request] properties manually.
 */
public open class Window(public val adwWindowPointer: CPointer<AdwWindow>) :
    org.gtkkn.bindings.gtk.Window(adwWindowPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = handle.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = handle.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = handle.reinterpret()

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
        get() = adw_window_get_content(adwWindowPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the content widget of @self.
         *
         * This method should always be used instead of [method@Gtk.Window.set_child].
         *
         * @param content the content widget
         */
        set(content) = adw_window_set_content(adwWindowPointer, content?.gtkWidgetPointer)

    /**
     * The current breakpoint.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public open val currentBreakpoint: Breakpoint?
        /**
         * Gets the current breakpoint.
         *
         * @return the current breakpoint
         * @since 1.4
         */
        get() = adw_window_get_current_breakpoint(adwWindowPointer)?.run {
            InstanceCache.get(this, true) { Breakpoint(reinterpret()) }!!
        }

    /**
     * The open dialogs.
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open val dialogs: ListModel
        /**
         * Returns a [iface@Gio.ListModel] that contains the open dialogs of @self.
         *
         * This can be used to keep an up-to-date view.
         *
         * @return a list model for the dialogs of @self
         * @since 1.5
         */
        get() = adw_window_get_dialogs(adwWindowPointer)!!.run {
            ListModel.ListModelImpl(reinterpret())
        }

    /**
     * The currently visible dialog
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open val visibleDialog: Dialog?
        /**
         * Returns the currently visible dialog in @self, if there's one.
         *
         * @return the visible dialog
         * @since 1.5
         */
        get() = adw_window_get_visible_dialog(adwWindowPointer)?.run {
            InstanceCache.get(this, true) { Dialog(reinterpret()) }!!
        }

    /**
     * Creates a new `AdwWindow`.
     *
     * @return the newly created `AdwWindow`
     */
    public constructor() : this(adw_window_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Adds @breakpoint to @self.
     *
     * @param breakpoint the breakpoint to add
     * @since 1.4
     */
    @AdwVersion1_4
    public open fun addBreakpoint(breakpoint: Breakpoint): Unit =
        adw_window_add_breakpoint(adwWindowPointer, breakpoint.adwBreakpointPointer)

    public companion object : TypeCompanion<Window> {
        override val type: GeneratedClassKGType<Window> =
            GeneratedClassKGType(getTypeOrNull()!!) { Window(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Window
         *
         * @return the GType
         */
        public fun getType(): GType = adw_window_get_type()

        /**
         * Gets the GType of from the symbol `adw_window_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_window_get_type")
    }
}
