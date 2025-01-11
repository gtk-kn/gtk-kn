// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBox
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_box_append
import org.gtkkn.native.gtk.gtk_box_get_baseline_child
import org.gtkkn.native.gtk.gtk_box_get_baseline_position
import org.gtkkn.native.gtk.gtk_box_get_homogeneous
import org.gtkkn.native.gtk.gtk_box_get_spacing
import org.gtkkn.native.gtk.gtk_box_get_type
import org.gtkkn.native.gtk.gtk_box_insert_child_after
import org.gtkkn.native.gtk.gtk_box_new
import org.gtkkn.native.gtk.gtk_box_prepend
import org.gtkkn.native.gtk.gtk_box_remove
import org.gtkkn.native.gtk.gtk_box_reorder_child_after
import org.gtkkn.native.gtk.gtk_box_set_baseline_child
import org.gtkkn.native.gtk.gtk_box_set_baseline_position
import org.gtkkn.native.gtk.gtk_box_set_homogeneous
import org.gtkkn.native.gtk.gtk_box_set_spacing
import kotlin.Boolean
import kotlin.Unit

/**
 * The `GtkBox` widget arranges child widgets into a single row or column.
 *
 * ![An example GtkBox](box.png)
 *
 * Whether it is a row or column depends on the value of its
 * [property@Gtk.Orientable:orientation] property. Within the other
 * dimension, all children are allocated the same size. Of course, the
 * [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign] properties
 * can be used on the children to influence their allocation.
 *
 * Use repeated calls to [method@Gtk.Box.append] to pack widgets into a
 * `GtkBox` from start to end. Use [method@Gtk.Box.remove] to remove widgets
 * from the `GtkBox`. [method@Gtk.Box.insert_child_after] can be used to add
 * a child at a particular position.
 *
 * Use [method@Gtk.Box.set_homogeneous] to specify whether or not all children
 * of the `GtkBox` are forced to get the same amount of space.
 *
 * Use [method@Gtk.Box.set_spacing] to determine how much space will be minimally
 * placed between all children in the `GtkBox`. Note that spacing is added
 * *between* the children.
 *
 * Use [method@Gtk.Box.reorder_child_after] to move a child to a different
 * place in the box.
 *
 * # CSS nodes
 *
 * `GtkBox` uses a single CSS node with name box.
 *
 * # Accessibility
 *
 * Until GTK 4.10, `GtkBox` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 *
 * Starting from GTK 4.12, `GtkBox` uses the `GTK_ACCESSIBLE_ROLE_GENERIC` role.
 */
public open class Box(public val gtkBoxPointer: CPointer<GtkBox>) :
    Widget(gtkBoxPointer.reinterpret()),
    Orientable,
    KGTyped {
    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The child that determines the baseline, in vertical orientation.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var baselineChild: gint
        /**
         * Gets the value set by gtk_box_set_baseline_child().
         *
         * @return the baseline child
         * @since 4.12
         */
        get() = gtk_box_get_baseline_child(gtkBoxPointer)

        /**
         * Sets the baseline child of a box.
         *
         * This affects only vertical boxes.
         *
         * @param child a child, or -1
         * @since 4.12
         */
        @GtkVersion4_12
        set(child) = gtk_box_set_baseline_child(gtkBoxPointer, child)

    /**
     * The position of the baseline aligned widgets if extra space is available.
     */
    public open var baselinePosition: BaselinePosition
        /**
         * Gets the value set by gtk_box_set_baseline_position().
         *
         * @return the baseline position
         */
        get() = gtk_box_get_baseline_position(gtkBoxPointer).run {
            BaselinePosition.fromNativeValue(this)
        }

        /**
         * Sets the baseline position of a box.
         *
         * This affects only horizontal boxes with at least one baseline
         * aligned child. If there is more vertical space available than
         * requested, and the baseline is not allocated by the parent then
         * @position is used to allocate the baseline with respect to the
         * extra space available.
         *
         * @param position a `GtkBaselinePosition`
         */
        set(position) = gtk_box_set_baseline_position(gtkBoxPointer, position.nativeValue)

    /**
     * Whether the children should all be the same size.
     */
    public open var homogeneous: Boolean
        /**
         * Returns whether the box is homogeneous (all children are the
         * same size).
         *
         * @return true if the box is homogeneous.
         */
        get() = gtk_box_get_homogeneous(gtkBoxPointer).asBoolean()

        /**
         * Sets whether or not all children of @box are given equal space
         * in the box.
         *
         * @param homogeneous a boolean value, true to create equal allotments,
         *   false for variable allotments
         */
        set(homogeneous) = gtk_box_set_homogeneous(gtkBoxPointer, homogeneous.asGBoolean())

    /**
     * The amount of space between children.
     */
    public open var spacing: gint
        /**
         * Gets the value set by gtk_box_set_spacing().
         *
         * @return spacing between children
         */
        get() = gtk_box_get_spacing(gtkBoxPointer)

        /**
         * Sets the number of pixels to place between children of @box.
         *
         * @param spacing the number of pixels to put between children
         */
        set(spacing) = gtk_box_set_spacing(gtkBoxPointer, spacing)

    /**
     * Creates a new `GtkBox`.
     *
     * @param orientation the box’s orientation
     * @param spacing the number of pixels to place by default between children
     * @return a new `GtkBox`.
     */
    public constructor(
        orientation: Orientation,
        spacing: gint,
    ) : this(gtk_box_new(orientation.nativeValue, spacing)!!.reinterpret())

    /**
     * Adds @child as the last child to @box.
     *
     * @param child the `GtkWidget` to append
     */
    public open fun append(child: Widget): Unit = gtk_box_append(gtkBoxPointer, child.gtkWidgetPointer)

    /**
     * Inserts @child in the position after @sibling in the list
     * of @box children.
     *
     * If @sibling is null, insert @child at the first position.
     *
     * @param child the `GtkWidget` to insert
     * @param sibling the sibling after which to insert @child
     */
    public open fun insertChildAfter(child: Widget, sibling: Widget? = null): Unit =
        gtk_box_insert_child_after(gtkBoxPointer, child.gtkWidgetPointer, sibling?.gtkWidgetPointer)

    /**
     * Adds @child as the first child to @box.
     *
     * @param child the `GtkWidget` to prepend
     */
    public open fun prepend(child: Widget): Unit = gtk_box_prepend(gtkBoxPointer, child.gtkWidgetPointer)

    /**
     * Removes a child widget from @box.
     *
     * The child must have been added before with
     * [method@Gtk.Box.append], [method@Gtk.Box.prepend], or
     * [method@Gtk.Box.insert_child_after].
     *
     * @param child the child to remove
     */
    public open fun remove(child: Widget): Unit = gtk_box_remove(gtkBoxPointer, child.gtkWidgetPointer)

    /**
     * Moves @child to the position after @sibling in the list
     * of @box children.
     *
     * If @sibling is null, move @child to the first position.
     *
     * @param child the `GtkWidget` to move, must be a child of @box
     * @param sibling the sibling to move @child after
     */
    public open fun reorderChildAfter(child: Widget, sibling: Widget? = null): Unit =
        gtk_box_reorder_child_after(gtkBoxPointer, child.gtkWidgetPointer, sibling?.gtkWidgetPointer)

    public companion object : TypeCompanion<Box> {
        override val type: GeneratedClassKGType<Box> =
            GeneratedClassKGType(gtk_box_get_type()) { Box(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Box
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_box_get_type()
    }
}
