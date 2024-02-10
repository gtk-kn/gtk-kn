// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCenterBox
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_center_box_get_baseline_position
import org.gtkkn.native.gtk.gtk_center_box_get_center_widget
import org.gtkkn.native.gtk.gtk_center_box_get_end_widget
import org.gtkkn.native.gtk.gtk_center_box_get_start_widget
import org.gtkkn.native.gtk.gtk_center_box_get_type
import org.gtkkn.native.gtk.gtk_center_box_new
import org.gtkkn.native.gtk.gtk_center_box_set_baseline_position
import org.gtkkn.native.gtk.gtk_center_box_set_center_widget
import org.gtkkn.native.gtk.gtk_center_box_set_end_widget
import org.gtkkn.native.gtk.gtk_center_box_set_start_widget
import kotlin.Unit

/**
 * `GtkCenterBox` arranges three children in a row, keeping the middle child
 * centered as well as possible.
 *
 * ![An example GtkCenterBox](centerbox.png)
 *
 * To add children to `GtkCenterBox`, use [method@Gtk.CenterBox.set_start_widget],
 * [method@Gtk.CenterBox.set_center_widget] and
 * [method@Gtk.CenterBox.set_end_widget].
 *
 * The sizing and positioning of children can be influenced with the
 * align and expand properties of the children.
 *
 * # GtkCenterBox as GtkBuildable
 *
 * The `GtkCenterBox` implementation of the `GtkBuildable` interface
 * supports placing children in the 3 positions by specifying “start”, “center”
 * or “end” as the “type” attribute of a <child> element.
 *
 * # CSS nodes
 *
 * `GtkCenterBox` uses a single CSS node with the name “box”,
 *
 * The first child of the `GtkCenterBox` will be allocated depending on the
 * text direction, i.e. in left-to-right layouts it will be allocated on the
 * left and in right-to-left layouts on the right.
 *
 * In vertical orientation, the nodes of the children are arranged from top to
 * bottom.
 *
 * # Accessibility
 *
 * `GtkCenterBox` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 */
public open class CenterBox(
    pointer: CPointer<GtkCenterBox>,
) : Widget(pointer.reinterpret()), Orientable, KGTyped {
    public val gtkCenterBoxPointer: CPointer<GtkCenterBox>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The position of the baseline aligned widget if extra space is available.
     */
    public open var baselinePosition: BaselinePosition
        /**
         * Gets the value set by gtk_center_box_set_baseline_position().
         *
         * @return the baseline position
         */
        get() =
            gtk_center_box_get_baseline_position(gtkCenterBoxPointer.reinterpret()).run {
                BaselinePosition.fromNativeValue(this)
            }

        /**
         * Sets the baseline position of a center box.
         *
         * This affects only horizontal boxes with at least one baseline
         * aligned child. If there is more vertical space available than
         * requested, and the baseline is not allocated by the parent then
         * @position is used to allocate the baseline wrt. the extra space
         * available.
         *
         * @param position a `GtkBaselinePosition`
         */
        set(position) =
            gtk_center_box_set_baseline_position(
                gtkCenterBoxPointer.reinterpret(),
                position.nativeValue
            )

    /**
     * Creates a new `GtkCenterBox`.
     *
     * @return the new `GtkCenterBox`.
     */
    public constructor() : this(gtk_center_box_new()!!.reinterpret())

    /**
     * Gets the value set by gtk_center_box_set_baseline_position().
     *
     * @return the baseline position
     */
    public open fun getBaselinePosition(): BaselinePosition =
        gtk_center_box_get_baseline_position(gtkCenterBoxPointer.reinterpret()).run {
            BaselinePosition.fromNativeValue(this)
        }

    /**
     * Gets the center widget, or null if there is none.
     *
     * @return the center widget.
     */
    public open fun getCenterWidget(): Widget? =
        gtk_center_box_get_center_widget(gtkCenterBoxPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the end widget, or null if there is none.
     *
     * @return the end widget.
     */
    public open fun getEndWidget(): Widget? =
        gtk_center_box_get_end_widget(gtkCenterBoxPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the start widget, or null if there is none.
     *
     * @return the start widget.
     */
    public open fun getStartWidget(): Widget? =
        gtk_center_box_get_start_widget(gtkCenterBoxPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Sets the baseline position of a center box.
     *
     * This affects only horizontal boxes with at least one baseline
     * aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then
     * @position is used to allocate the baseline wrt. the extra space
     * available.
     *
     * @param position a `GtkBaselinePosition`
     */
    public open fun setBaselinePosition(position: BaselinePosition): Unit =
        gtk_center_box_set_baseline_position(
            gtkCenterBoxPointer.reinterpret(),
            position.nativeValue
        )

    /**
     * Sets the center widget.
     *
     * To remove the existing center widget, pas null.
     *
     * @param child the new center widget
     */
    public open fun setCenterWidget(child: Widget? = null): Unit =
        gtk_center_box_set_center_widget(
            gtkCenterBoxPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the end widget.
     *
     * To remove the existing end widget, pass null.
     *
     * @param child the new end widget
     */
    public open fun setEndWidget(child: Widget? = null): Unit =
        gtk_center_box_set_end_widget(
            gtkCenterBoxPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the start widget.
     *
     * To remove the existing start widget, pass null.
     *
     * @param child the new start widget
     */
    public open fun setStartWidget(child: Widget? = null): Unit =
        gtk_center_box_set_start_widget(
            gtkCenterBoxPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    public companion object : TypeCompanion<CenterBox> {
        override val type: GeneratedClassKGType<CenterBox> =
            GeneratedClassKGType(gtk_center_box_get_type()) { CenterBox(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
