// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCenterBox
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_center_box_get_baseline_position
import org.gtkkn.native.gtk.gtk_center_box_get_center_widget
import org.gtkkn.native.gtk.gtk_center_box_get_end_widget
import org.gtkkn.native.gtk.gtk_center_box_get_shrink_center_last
import org.gtkkn.native.gtk.gtk_center_box_get_start_widget
import org.gtkkn.native.gtk.gtk_center_box_get_type
import org.gtkkn.native.gtk.gtk_center_box_new
import org.gtkkn.native.gtk.gtk_center_box_set_baseline_position
import org.gtkkn.native.gtk.gtk_center_box_set_center_widget
import org.gtkkn.native.gtk.gtk_center_box_set_end_widget
import org.gtkkn.native.gtk.gtk_center_box_set_shrink_center_last
import org.gtkkn.native.gtk.gtk_center_box_set_start_widget
import kotlin.Boolean

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
 * or “end” as the “type” attribute of a `<child>` element.
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
 * Until GTK 4.10, `GtkCenterBox` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 *
 * Starting from GTK 4.12, `GtkCenterBox` uses the `GTK_ACCESSIBLE_ROLE_GENERIC` role.
 */
public open class CenterBox(pointer: CPointer<GtkCenterBox>) :
    Widget(pointer.reinterpret()),
    Orientable,
    KGTyped {
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
        get() = gtk_center_box_get_baseline_position(gtkCenterBoxPointer.reinterpret()).run {
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
        set(position) = gtk_center_box_set_baseline_position(gtkCenterBoxPointer.reinterpret(), position.nativeValue)

    /**
     * The widget that is placed at the center position.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var centerWidget: Widget?
        /**
         * Gets the center widget, or null if there is none.
         *
         * @return the center widget.
         */
        get() = gtk_center_box_get_center_widget(gtkCenterBoxPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the center widget.
         *
         * To remove the existing center widget, pass null.
         *
         * @param child the new center widget
         */
        set(
            child
        ) = gtk_center_box_set_center_widget(gtkCenterBoxPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * The widget that is placed at the end position.
     *
     * In vertical orientation, the end position is at the bottom.
     * In horizontal orientation, the end position is at the trailing
     * edge wrt. to the text direction.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var endWidget: Widget?
        /**
         * Gets the end widget, or null if there is none.
         *
         * @return the end widget.
         */
        get() = gtk_center_box_get_end_widget(gtkCenterBoxPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the end widget.
         *
         * To remove the existing end widget, pass null.
         *
         * @param child the new end widget
         */
        set(
            child
        ) = gtk_center_box_set_end_widget(gtkCenterBoxPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Whether to shrink the center widget after other children.
     *
     * By default, when there's no space to give all three children their
     * natural widths, the start and end widgets start shrinking and the
     * center child keeps natural width until they reach minimum width.
     *
     * If set to `FALSE`, start and end widgets keep natural width and the
     * center widget starts shrinking instead.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var shrinkCenterLast: Boolean
        /**
         * Gets whether @self shrinks the center widget after other children.
         *
         * @return whether to shrink the center widget after others
         * @since 4.12
         */
        get() = gtk_center_box_get_shrink_center_last(gtkCenterBoxPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to shrink the center widget after other children.
         *
         * By default, when there's no space to give all three children their
         * natural widths, the start and end widgets start shrinking and the
         * center child keeps natural width until they reach minimum width.
         *
         * If set to `FALSE`, start and end widgets keep natural width and the
         * center widget starts shrinking instead.
         *
         * @param shrinkCenterLast whether to shrink the center widget after others
         * @since 4.12
         */
        @GtkVersion4_12
        set(
            shrinkCenterLast
        ) = gtk_center_box_set_shrink_center_last(gtkCenterBoxPointer.reinterpret(), shrinkCenterLast.asGBoolean())

    /**
     * The widget that is placed at the start position.
     *
     * In vertical orientation, the start position is at the top.
     * In horizontal orientation, the start position is at the leading
     * edge wrt. to the text direction.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var startWidget: Widget?
        /**
         * Gets the start widget, or null if there is none.
         *
         * @return the start widget.
         */
        get() = gtk_center_box_get_start_widget(gtkCenterBoxPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the start widget.
         *
         * To remove the existing start widget, pass null.
         *
         * @param child the new start widget
         */
        set(
            child
        ) = gtk_center_box_set_start_widget(gtkCenterBoxPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Creates a new `GtkCenterBox`.
     *
     * @return the new `GtkCenterBox`.
     */
    public constructor() : this(gtk_center_box_new()!!.reinterpret())

    public companion object : TypeCompanion<CenterBox> {
        override val type: GeneratedClassKGType<CenterBox> =
            GeneratedClassKGType(gtk_center_box_get_type()) { CenterBox(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CenterBox
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_center_box_get_type()
    }
}
