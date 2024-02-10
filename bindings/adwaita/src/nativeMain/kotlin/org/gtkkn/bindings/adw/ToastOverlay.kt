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
 * ┊   ├── label.heading
 *     ├── [button]
 *     ╰── button.circular.flat
 * ```
 *
 * `AdwToastOverlay`'s CSS node is called `toastoverlay`. It contains the child,
 * as well as zero or more `toast` subnodes.
 *
 * Each of the `toast` nodes contains a `label` subnode with the `.heading`
 * style class, optionally a `button` subnode, and another `button` subnode with
 * `.circular` and `.flat` style classes.
 *
 * ## Accessibility
 *
 * `AdwToastOverlay` uses the `GTK_ACCESSIBLE_ROLE_TAB_GROUP` role.
 * @since 1.0
 */
public class ToastOverlay(
    pointer: CPointer<AdwToastOverlay>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val adwToastOverlayPointer: CPointer<AdwToastOverlay>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The child widget.
     *
     * @since 1.0
     */
    public var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         * @since 1.0
         */
        get() =
            adw_toast_overlay_get_child(adwToastOverlayPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         * @since 1.0
         */
        set(child) =
            adw_toast_overlay_set_child(
                adwToastOverlayPointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Creates a new `AdwToastOverlay`.
     *
     * @return the new created `AdwToastOverlay`
     * @since 1.0
     */
    public constructor() : this(adw_toast_overlay_new()!!.reinterpret())

    /**
     * Displays @toast.
     *
     * Only one toast can be shown at a time; if a toast is already being displayed,
     * either @toast or the original toast will be placed in a queue, depending on
     * the priority of @toast. See [property@Toast:priority].
     *
     * @param toast a toast
     * @since 1.0
     */
    public fun addToast(toast: Toast): Unit =
        adw_toast_overlay_add_toast(
            adwToastOverlayPointer.reinterpret(),
            toast.adwToastPointer.reinterpret()
        )

    /**
     * Gets the child widget of @self.
     *
     * @return the child widget of @self
     * @since 1.0
     */
    public fun getChild(): Widget? =
        adw_toast_overlay_get_child(adwToastOverlayPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Sets the child widget of @self.
     *
     * @param child the child widget
     * @since 1.0
     */
    public fun setChild(child: Widget? = null): Unit =
        adw_toast_overlay_set_child(
            adwToastOverlayPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    public companion object : TypeCompanion<ToastOverlay> {
        override val type: GeneratedClassKGType<ToastOverlay> =
            GeneratedClassKGType(adw_toast_overlay_get_type()) {
                ToastOverlay(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
