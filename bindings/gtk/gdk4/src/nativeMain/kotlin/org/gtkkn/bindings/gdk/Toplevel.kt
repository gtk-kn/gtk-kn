// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_4
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkToplevel
import org.gtkkn.native.gdk.GdkToplevelSize
import org.gtkkn.native.gdk.gdk_toplevel_begin_move
import org.gtkkn.native.gdk.gdk_toplevel_begin_resize
import org.gtkkn.native.gdk.gdk_toplevel_focus
import org.gtkkn.native.gdk.gdk_toplevel_get_state
import org.gtkkn.native.gdk.gdk_toplevel_get_type
import org.gtkkn.native.gdk.gdk_toplevel_inhibit_system_shortcuts
import org.gtkkn.native.gdk.gdk_toplevel_lower
import org.gtkkn.native.gdk.gdk_toplevel_minimize
import org.gtkkn.native.gdk.gdk_toplevel_present
import org.gtkkn.native.gdk.gdk_toplevel_restore_system_shortcuts
import org.gtkkn.native.gdk.gdk_toplevel_set_decorated
import org.gtkkn.native.gdk.gdk_toplevel_set_deletable
import org.gtkkn.native.gdk.gdk_toplevel_set_icon_list
import org.gtkkn.native.gdk.gdk_toplevel_set_modal
import org.gtkkn.native.gdk.gdk_toplevel_set_startup_id
import org.gtkkn.native.gdk.gdk_toplevel_set_title
import org.gtkkn.native.gdk.gdk_toplevel_set_transient_for
import org.gtkkn.native.gdk.gdk_toplevel_show_window_menu
import org.gtkkn.native.gdk.gdk_toplevel_supports_edge_constraints
import org.gtkkn.native.gdk.gdk_toplevel_titlebar_gesture
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GdkToplevel` is a freestanding toplevel surface.
 *
 * The `GdkToplevel` interface provides useful APIs for interacting with
 * the windowing system, such as controlling maximization and size of the
 * surface, setting icons and transient parents for dialogs.
 *
 * ## Skipped during bindings generation
 *
 * - method `decorated`: Property has no getter
 * - method `deletable`: Property has no getter
 * - method `fullscreen-mode`: Property has no getter nor setter
 * - method `icon-list`: Property has no getter
 * - method `modal`: Property has no getter
 * - method `shortcuts-inhibited`: Property has no getter nor setter
 * - method `startup-id`: Property has no getter
 * - method `title`: Property has no getter
 * - method `transient-for`: Property has no getter
 */
public interface Toplevel :
    Proxy,
    KGTyped {
    public val gdkToplevelPointer: CPointer<GdkToplevel>

    /**
     * The state of the toplevel.
     */
    public val state: ToplevelState
        /**
         * Gets the bitwise or of the currently active surface state flags,
         * from the `GdkToplevelState` enumeration.
         *
         * @return surface state bitfield
         */
        get() = gdk_toplevel_get_state(gdkToplevelPointer).run {
            ToplevelState(this)
        }

    /**
     * Begins an interactive move operation.
     *
     * You might use this function to implement draggable titlebars.
     *
     * @param device the device used for the operation
     * @param button the button being used to drag, or 0 for a keyboard-initiated drag
     * @param x surface X coordinate of mouse click that began the drag
     * @param y surface Y coordinate of mouse click that began the drag
     * @param timestamp timestamp of mouse click that began the drag (use
     *   [method@Gdk.Event.get_time])
     */
    public fun beginMove(device: Device, button: gint, x: gdouble, y: gdouble, timestamp: guint): Unit =
        gdk_toplevel_begin_move(gdkToplevelPointer, device.gdkDevicePointer, button, x, y, timestamp)

    /**
     * Begins an interactive resize operation.
     *
     * You might use this function to implement a “window resize grip.”
     *
     * @param edge the edge or corner from which the drag is started
     * @param device the device used for the operation
     * @param button the button being used to drag, or 0 for a keyboard-initiated drag
     * @param x surface X coordinate of mouse click that began the drag
     * @param y surface Y coordinate of mouse click that began the drag
     * @param timestamp timestamp of mouse click that began the drag (use
     *   [method@Gdk.Event.get_time])
     */
    public fun beginResize(
        edge: SurfaceEdge,
        device: Device? = null,
        button: gint,
        x: gdouble,
        y: gdouble,
        timestamp: guint,
    ): Unit = gdk_toplevel_begin_resize(
        gdkToplevelPointer,
        edge.nativeValue,
        device?.gdkDevicePointer,
        button,
        x,
        y,
        timestamp
    )

    /**
     * Sets keyboard focus to @surface.
     *
     * In most cases, [gtk_window_present_with_time()](../gtk4/method.Window.present_with_time.html)
     * should be used on a [GtkWindow](../gtk4/class.Window.html), rather than
     * calling this function.
     *
     * @param timestamp timestamp of the event triggering the surface focus
     */
    public fun focus(timestamp: guint): Unit = gdk_toplevel_focus(gdkToplevelPointer, timestamp)

    /**
     * Gets the bitwise or of the currently active surface state flags,
     * from the `GdkToplevelState` enumeration.
     *
     * @return surface state bitfield
     */
    public fun getState(): ToplevelState = gdk_toplevel_get_state(gdkToplevelPointer).run {
        ToplevelState(this)
    }

    /**
     * Requests that the @toplevel inhibit the system shortcuts.
     *
     * This is asking the desktop environment/windowing system to let all
     * keyboard events reach the surface, as long as it is focused, instead
     * of triggering system actions.
     *
     * If granted, the rerouting remains active until the default shortcuts
     * processing is restored with [method@Gdk.Toplevel.restore_system_shortcuts],
     * or the request is revoked by the desktop environment, windowing system
     * or the user.
     *
     * A typical use case for this API is remote desktop or virtual machine
     * viewers which need to inhibit the default system keyboard shortcuts
     * so that the remote session or virtual host gets those instead of the
     * local environment.
     *
     * The windowing system or desktop environment may ask the user to grant
     * or deny the request or even choose to ignore the request entirely.
     *
     * The caller can be notified whenever the request is granted or revoked
     * by listening to the [property@Gdk.Toplevel:shortcuts-inhibited] property.
     *
     * @param event the `GdkEvent` that is triggering the inhibit
     *   request, or null if none is available
     */
    public fun inhibitSystemShortcuts(event: Event? = null): Unit =
        gdk_toplevel_inhibit_system_shortcuts(gdkToplevelPointer, event?.gdkEventPointer)

    /**
     * Asks to lower the @toplevel below other windows.
     *
     * The windowing system may choose to ignore the request.
     *
     * @return true if the surface was lowered
     */
    public fun lower(): Boolean = gdk_toplevel_lower(gdkToplevelPointer).asBoolean()

    /**
     * Asks to minimize the @toplevel.
     *
     * The windowing system may choose to ignore the request.
     *
     * @return true if the surface was minimized
     */
    public fun minimize(): Boolean = gdk_toplevel_minimize(gdkToplevelPointer).asBoolean()

    /**
     * Present @toplevel after having processed the `GdkToplevelLayout` rules.
     *
     * If the toplevel was previously not showing, it will be showed,
     * otherwise it will change layout according to @layout.
     *
     * GDK may emit the [signal@Gdk.Toplevel::compute-size] signal to let
     * the user of this toplevel compute the preferred size of the toplevel
     * surface.
     *
     * Presenting is asynchronous and the specified layout parameters are not
     * guaranteed to be respected.
     *
     * @param layout the `GdkToplevelLayout` object used to layout
     */
    public fun present(layout: ToplevelLayout): Unit =
        gdk_toplevel_present(gdkToplevelPointer, layout.gdkToplevelLayoutPointer)

    /**
     * Restore default system keyboard shortcuts which were previously
     * inhibited.
     *
     * This undoes the effect of [method@Gdk.Toplevel.inhibit_system_shortcuts].
     */
    public fun restoreSystemShortcuts(): Unit = gdk_toplevel_restore_system_shortcuts(gdkToplevelPointer)

    /**
     * Sets the toplevel to be decorated.
     *
     * Setting @decorated to false hints the desktop environment
     * that the surface has its own, client-side decorations and
     * does not need to have window decorations added.
     *
     * @param decorated true to request decorations
     */
    public fun setDecorated(decorated: Boolean): Unit =
        gdk_toplevel_set_decorated(gdkToplevelPointer, decorated.asGBoolean())

    /**
     * Sets the toplevel to be deletable.
     *
     * Setting @deletable to true hints the desktop environment
     * that it should offer the user a way to close the surface.
     *
     * @param deletable true to request a delete button
     */
    public fun setDeletable(deletable: Boolean): Unit =
        gdk_toplevel_set_deletable(gdkToplevelPointer, deletable.asGBoolean())

    /**
     * Sets a list of icons for the surface.
     *
     * One of these will be used to represent the surface in iconic form.
     * The icon may be shown in window lists or task bars. Which icon
     * size is shown depends on the window manager. The window manager
     * can scale the icon but setting several size icons can give better
     * image quality.
     *
     * Note that some platforms don't support surface icons.
     *
     * @param surfaces A list of textures to use as icon, of different sizes
     */
    public fun setIconList(surfaces: List): Unit =
        gdk_toplevel_set_icon_list(gdkToplevelPointer, surfaces.glibListPointer)

    /**
     * Sets the toplevel to be modal.
     *
     * The application can use this hint to tell the
     * window manager that a certain surface has modal
     * behaviour. The window manager can use this information
     * to handle modal surfaces in a special way.
     *
     * You should only use this on surfaces for which you have
     * previously called [method@Gdk.Toplevel.set_transient_for].
     *
     * @param modal true if the surface is modal, false otherwise.
     */
    public fun setModal(modal: Boolean): Unit = gdk_toplevel_set_modal(gdkToplevelPointer, modal.asGBoolean())

    /**
     * Sets the startup notification ID.
     *
     * When using GTK, typically you should use
     * [gtk_window_set_startup_id()](../gtk4/method.Window.set_startup_id.html)
     * instead of this low-level function.
     *
     * @param startupId a string with startup-notification identifier
     */
    public fun setStartupId(startupId: String): Unit = gdk_toplevel_set_startup_id(gdkToplevelPointer, startupId)

    /**
     * Sets the title of a toplevel surface.
     *
     * The title maybe be displayed in the titlebar,
     * in lists of windows, etc.
     *
     * @param title title of @surface
     */
    public fun setTitle(title: String): Unit = gdk_toplevel_set_title(gdkToplevelPointer, title)

    /**
     * Sets a transient-for parent.
     *
     * Indicates to the window manager that @surface is a transient
     * dialog associated with the application surface @parent. This
     * allows the window manager to do things like center @surface
     * on @parent and keep @surface above @parent.
     *
     * See [gtk_window_set_transient_for()](../gtk4/method.Window.set_transient_for.html)
     * if you’re using [GtkWindow](../gtk4/class.Window.html).
     *
     * @param parent another toplevel `GdkSurface`
     */
    public fun setTransientFor(parent: Surface): Unit =
        gdk_toplevel_set_transient_for(gdkToplevelPointer, parent.gdkSurfacePointer)

    /**
     * Asks the windowing system to show the window menu.
     *
     * The window menu is the menu shown when right-clicking the titlebar
     * on traditional windows managed by the window manager. This is useful
     * for windows using client-side decorations, activating it with a
     * right-click on the window decorations.
     *
     * @param event a `GdkEvent` to show the menu for
     * @return true if the window menu was shown and false otherwise.
     */
    public fun showWindowMenu(event: Event): Boolean =
        gdk_toplevel_show_window_menu(gdkToplevelPointer, event.gdkEventPointer).asBoolean()

    /**
     * Returns whether the desktop environment supports
     * tiled window states.
     *
     * @return true if the desktop environment supports tiled window states
     */
    public fun supportsEdgeConstraints(): Boolean =
        gdk_toplevel_supports_edge_constraints(gdkToplevelPointer).asBoolean()

    /**
     *
     *
     * @param gesture a `GdkTitlebarGesture`
     * @since 4.4
     */
    @GdkVersion4_4
    public fun titlebarGesture(gesture: TitlebarGesture): Boolean =
        gdk_toplevel_titlebar_gesture(gdkToplevelPointer, gesture.nativeValue).asBoolean()

    /**
     * Emitted when the size for the surface needs to be computed, when
     * it is present.
     *
     * This signal will normally be emitted during or after a call to
     * [method@Gdk.Toplevel.present], depending on the configuration
     * received by the windowing system. It may also be emitted at any
     * other point in time, in response to the windowing system
     * spontaneously changing the configuration of the toplevel surface.
     *
     * It is the responsibility of the toplevel user to handle this signal
     * and compute the desired size of the toplevel, given the information
     * passed via the [struct@Gdk.ToplevelSize] object. Failing to do so
     * will result in an arbitrary size being used as a result.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `size` a `GdkToplevelSize`
     */
    public fun onComputeSize(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (size: ToplevelSize) -> Unit,
    ): ULong = g_signal_connect_data(
        gdkToplevelPointer,
        "compute-size",
        onComputeSizeFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The ToplevelImpl type represents a native instance of the Toplevel interface.
     *
     * @constructor Creates a new instance of Toplevel for the provided [CPointer].
     */
    public class ToplevelImpl(gdkToplevelPointer: CPointer<GdkToplevel>) :
        Surface(gdkToplevelPointer.reinterpret()),
        Toplevel {
        init {
            Gdk
        }

        override val gdkToplevelPointer: CPointer<GdkToplevel> = gdkToplevelPointer
    }

    public companion object : TypeCompanion<Toplevel> {
        override val type: GeneratedInterfaceKGType<Toplevel> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { ToplevelImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of Toplevel
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_toplevel_get_type()

        /**
         * Gets the GType of from the symbol `gdk_toplevel_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_toplevel_get_type")
    }
}

private val onComputeSizeFunc: CPointer<CFunction<(CPointer<GdkToplevelSize>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            size: CPointer<GdkToplevelSize>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(size: ToplevelSize) -> Unit>().get().invoke(
            size!!.run {
                ToplevelSize(this)
            }
        )
    }
        .reinterpret()
