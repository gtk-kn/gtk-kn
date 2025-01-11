// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwToastOverlay
import org.gtkkn.native.adw.adw_toast_overlay_add_toast
import org.gtkkn.native.adw.adw_toast_overlay_get_child
import org.gtkkn.native.adw.adw_toast_overlay_get_type
import org.gtkkn.native.adw.adw_toast_overlay_new
import org.gtkkn.native.adw.adw_toast_overlay_set_child
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Unit

/**
 * A widget showing toasts above its content.
 *
 * <picture>
 *   <source srcset="toast-overlay-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toast-overlay.png" alt="toast-overlay">
 * </picture>
 *
 * Much like [class@Gtk.Overlay], `AdwToastOverlay` is a container with a single
 * main child, on top of which it can display a [class@Toast], overlaid.
 * Toasts can be shown with [method@ToastOverlay.add_toast].
 *
 * See [class@Toast] for details.
 *
 * ## CSS nodes
 *
 * ```
 * toastoverlay
 * ├── [child]
 * ├── toast
 * ┊   ├── widget
 * ┊   │   ├── [label.heading]
 *     │   ╰── [custom title]
 *     ├── [button]
 *     ╰── button.circular.flat
 * ```
 *
 * `AdwToastOverlay`'s CSS node is called `toastoverlay`. It contains the child,
 * as well as zero or more `toast` subnodes.
 *
 * Each of the `toast` nodes contains a `widget` subnode, optionally a `button`
 * subnode, and another `button` subnode with `.circular` and `.flat` style
 * classes.
 *
 * The `widget` subnode contains a `label` subnode with the `.heading` style
 * class, or a custom widget provided by the application.
 *
 * ## Accessibility
 *
 * `AdwToastOverlay` uses the `GTK_ACCESSIBLE_ROLE_TAB_GROUP` role.
 */
public class ToastOverlay(public val adwToastOverlayPointer: CPointer<AdwToastOverlay>) :
    Widget(adwToastOverlayPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The child widget.
     */
    public var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         */
        get() = adw_toast_overlay_get_child(adwToastOverlayPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(child) = adw_toast_overlay_set_child(adwToastOverlayPointer, child?.gtkWidgetPointer)

    /**
     * Creates a new `AdwToastOverlay`.
     *
     * @return the new created `AdwToastOverlay`
     */
    public constructor() : this(adw_toast_overlay_new()!!.reinterpret())

    /**
     * Displays @toast.
     *
     * Only one toast can be shown at a time; if a toast is already being displayed,
     * either @toast or the original toast will be placed in a queue, depending on
     * the priority of @toast. See [property@Toast:priority].
     *
     * If called on a toast that's already displayed, its timeout will be reset.
     *
     * If called on a toast currently in the queue, the toast will be bumped
     * forward to be shown as soon as possible.
     *
     * @param toast a toast
     */
    public fun addToast(toast: Toast): Unit = adw_toast_overlay_add_toast(adwToastOverlayPointer, toast.adwToastPointer)

    public companion object : TypeCompanion<ToastOverlay> {
        override val type: GeneratedClassKGType<ToastOverlay> =
            GeneratedClassKGType(adw_toast_overlay_get_type()) { ToastOverlay(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ToastOverlay
         *
         * @return the GType
         */
        public fun getType(): GType = adw_toast_overlay_get_type()
    }
}
