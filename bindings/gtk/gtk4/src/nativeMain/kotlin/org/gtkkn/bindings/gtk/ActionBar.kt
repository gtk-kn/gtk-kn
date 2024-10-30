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
import org.gtkkn.native.gtk.GtkActionBar
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_action_bar_get_center_widget
import org.gtkkn.native.gtk.gtk_action_bar_get_revealed
import org.gtkkn.native.gtk.gtk_action_bar_get_type
import org.gtkkn.native.gtk.gtk_action_bar_new
import org.gtkkn.native.gtk.gtk_action_bar_pack_end
import org.gtkkn.native.gtk.gtk_action_bar_pack_start
import org.gtkkn.native.gtk.gtk_action_bar_remove
import org.gtkkn.native.gtk.gtk_action_bar_set_center_widget
import org.gtkkn.native.gtk.gtk_action_bar_set_revealed
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkActionBar` is designed to present contextual actions.
 *
 * ![An example GtkActionBar](action-bar.png)
 *
 * It is expected to be displayed below the content and expand
 * horizontally to fill the area.
 *
 * It allows placing children at the start or the end. In addition, it
 * contains an internal centered box which is centered with respect to
 * the full width of the box, even if the children at either side take
 * up different amounts of space.
 *
 * # GtkActionBar as GtkBuildable
 *
 * The `GtkActionBar` implementation of the `GtkBuildable` interface supports
 * adding children at the start or end sides by specifying “start” or “end” as
 * the “type” attribute of a `<child>` element, or setting the center widget
 * by specifying “center” value.
 *
 * # CSS nodes
 *
 * ```
 * actionbar
 * ╰── revealer
 *     ╰── box
 *         ├── box.start
 *         │   ╰── [start children]
 *         ├── [center widget]
 *         ╰── box.end
 *             ╰── [end children]
 * ```
 *
 * A `GtkActionBar`'s CSS node is called `actionbar`. It contains a `revealer`
 * subnode, which contains a `box` subnode, which contains two `box` subnodes at
 * the start and end of the action bar, with `start` and `end style classes
 * respectively, as well as a center node that represents the center child.
 *
 * Each of the boxes contains children packed for that side.
 */
public open class ActionBar(
    pointer: CPointer<GtkActionBar>,
) : Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkActionBarPointer: CPointer<GtkActionBar>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Controls whether the action bar shows its contents.
     */
    public open var revealed: Boolean
        /**
         * Gets whether the contents of the action bar are revealed.
         *
         * @return the current value of the [property@Gtk.ActionBar:revealed]
         *   property
         */
        get() = gtk_action_bar_get_revealed(gtkActionBarPointer.reinterpret()).asBoolean()

        /**
         * Reveals or conceals the content of the action bar.
         *
         * Note: this does not show or hide @action_bar in the
         * [property@Gtk.Widget:visible] sense, so revealing has
         * no effect if the action bar is hidden.
         *
         * @param revealed The new value of the property
         */
        set(revealed) = gtk_action_bar_set_revealed(gtkActionBarPointer.reinterpret(), revealed.asGBoolean())

    /**
     * Creates a new `GtkActionBar` widget.
     *
     * @return a new `GtkActionBar`
     */
    public constructor() : this(gtk_action_bar_new()!!.reinterpret())

    /**
     * Retrieves the center bar widget of the bar.
     *
     * @return the center `GtkWidget`
     */
    public open fun getCenterWidget(): Widget? =
        gtk_action_bar_get_center_widget(gtkActionBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether the contents of the action bar are revealed.
     *
     * @return the current value of the [property@Gtk.ActionBar:revealed]
     *   property
     */
    public open fun getRevealed(): Boolean = gtk_action_bar_get_revealed(gtkActionBarPointer.reinterpret()).asBoolean()

    /**
     * Adds @child to @action_bar, packed with reference to the
     * end of the @action_bar.
     *
     * @param child the `GtkWidget` to be added to @action_bar
     */
    public open fun packEnd(child: Widget): Unit =
        gtk_action_bar_pack_end(gtkActionBarPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())

    /**
     * Adds @child to @action_bar, packed with reference to the
     * start of the @action_bar.
     *
     * @param child the `GtkWidget` to be added to @action_bar
     */
    public open fun packStart(child: Widget): Unit =
        gtk_action_bar_pack_start(gtkActionBarPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())

    /**
     * Removes a child from @action_bar.
     *
     * @param child the `GtkWidget` to be removed
     */
    public open fun remove(child: Widget): Unit =
        gtk_action_bar_remove(gtkActionBarPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())

    /**
     * Sets the center widget for the `GtkActionBar`.
     *
     * @param centerWidget a widget to use for the center
     */
    public open fun setCenterWidget(centerWidget: Widget? = null): Unit =
        gtk_action_bar_set_center_widget(
            gtkActionBarPointer.reinterpret(),
            centerWidget?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Reveals or conceals the content of the action bar.
     *
     * Note: this does not show or hide @action_bar in the
     * [property@Gtk.Widget:visible] sense, so revealing has
     * no effect if the action bar is hidden.
     *
     * @param revealed The new value of the property
     */
    public open fun setRevealed(revealed: Boolean): Unit =
        gtk_action_bar_set_revealed(gtkActionBarPointer.reinterpret(), revealed.asGBoolean())

    public companion object : TypeCompanion<ActionBar> {
        override val type: GeneratedClassKGType<ActionBar> =
            GeneratedClassKGType(gtk_action_bar_get_type()) { ActionBar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
