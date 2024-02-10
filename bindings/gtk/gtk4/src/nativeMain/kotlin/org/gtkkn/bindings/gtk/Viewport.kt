// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.GtkViewport
import org.gtkkn.native.gtk.gtk_viewport_get_child
import org.gtkkn.native.gtk.gtk_viewport_get_scroll_to_focus
import org.gtkkn.native.gtk.gtk_viewport_get_type
import org.gtkkn.native.gtk.gtk_viewport_new
import org.gtkkn.native.gtk.gtk_viewport_set_child
import org.gtkkn.native.gtk.gtk_viewport_set_scroll_to_focus
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkViewport` implements scrollability for widgets that lack their
 * own scrolling capabilities.
 *
 * Use `GtkViewport` to scroll child widgets such as `GtkGrid`,
 * `GtkBox`, and so on.
 *
 * The `GtkViewport` will start scrolling content only if allocated
 * less than the child widget’s minimum size in a given orientation.
 *
 * # CSS nodes
 *
 * `GtkViewport` has a single CSS node with name `viewport`.
 *
 * # Accessibility
 *
 * `GtkViewport` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 */
public open class Viewport(
    pointer: CPointer<GtkViewport>,
) : Widget(pointer.reinterpret()), Scrollable, KGTyped {
    public val gtkViewportPointer: CPointer<GtkViewport>
        get() = gPointer.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @viewport.
         *
         * @return the child widget of @viewport
         */
        get() =
            gtk_viewport_get_child(gtkViewportPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @viewport.
         *
         * @param child the child widget
         */
        set(child) =
            gtk_viewport_set_child(
                gtkViewportPointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Whether to scroll when the focus changes.
     *
     * Before 4.6.2, this property was mistakenly defaulting to FALSE, so if your
     * code needs to work with older versions, consider setting it explicitly to
     * TRUE.
     */
    public open var scrollToFocus: Boolean
        /**
         * Gets whether the viewport is scrolling to keep the focused
         * child in view.
         *
         * @return true if the viewport keeps the focus child scrolled to view
         */
        get() = gtk_viewport_get_scroll_to_focus(gtkViewportPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the viewport should automatically scroll
         * to keep the focused child in view.
         *
         * @param scrollToFocus whether to keep the focus widget scrolled to view
         */
        set(scrollToFocus) =
            gtk_viewport_set_scroll_to_focus(
                gtkViewportPointer.reinterpret(),
                scrollToFocus.asGBoolean()
            )

    /**
     * Creates a new `GtkViewport`.
     *
     * The new viewport uses the given adjustments, or default
     * adjustments if none are given.
     *
     * @param hadjustment horizontal adjustment
     * @param vadjustment vertical adjustment
     * @return a new `GtkViewport`
     */
    public constructor(hadjustment: Adjustment? = null, vadjustment: Adjustment? = null) :
        this(
            gtk_viewport_new(
                hadjustment?.gtkAdjustmentPointer?.reinterpret(),
                vadjustment?.gtkAdjustmentPointer?.reinterpret()
            )!!.reinterpret()
        )

    /**
     * Gets the child widget of @viewport.
     *
     * @return the child widget of @viewport
     */
    public open fun getChild(): Widget? =
        gtk_viewport_get_child(gtkViewportPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether the viewport is scrolling to keep the focused
     * child in view.
     *
     * @return true if the viewport keeps the focus child scrolled to view
     */
    public open fun getScrollToFocus(): Boolean =
        gtk_viewport_get_scroll_to_focus(gtkViewportPointer.reinterpret()).asBoolean()

    /**
     * Sets the child widget of @viewport.
     *
     * @param child the child widget
     */
    public open fun setChild(child: Widget? = null): Unit =
        gtk_viewport_set_child(
            gtkViewportPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets whether the viewport should automatically scroll
     * to keep the focused child in view.
     *
     * @param scrollToFocus whether to keep the focus widget scrolled to view
     */
    public open fun setScrollToFocus(scrollToFocus: Boolean): Unit =
        gtk_viewport_set_scroll_to_focus(
            gtkViewportPointer.reinterpret(),
            scrollToFocus.asGBoolean()
        )

    public companion object : TypeCompanion<Viewport> {
        override val type: GeneratedClassKGType<Viewport> =
            GeneratedClassKGType(gtk_viewport_get_type()) { Viewport(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
