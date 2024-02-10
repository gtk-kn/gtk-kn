// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkScrollbar
import org.gtkkn.native.gtk.gtk_scrollbar_get_adjustment
import org.gtkkn.native.gtk.gtk_scrollbar_get_type
import org.gtkkn.native.gtk.gtk_scrollbar_new
import org.gtkkn.native.gtk.gtk_scrollbar_set_adjustment
import kotlin.Unit

/**
 * The `GtkScrollbar` widget is a horizontal or vertical scrollbar.
 *
 * ![An example GtkScrollbar](scrollbar.png)
 *
 * Its position and movement are controlled by the adjustment that is passed to
 * or created by [ctor@Gtk.Scrollbar.new]. See [class@Gtk.Adjustment] for more
 * details. The [property@Gtk.Adjustment:value] field sets the position of the
 * thumb and must be between [property@Gtk.Adjustment:lower] and
 * [property@Gtk.Adjustment:upper] - [property@Gtk.Adjustment:page-size].
 * The [property@Gtk.Adjustment:page-size] represents the size of the visible
 * scrollable area.
 *
 * The fields [property@Gtk.Adjustment:step-increment] and
 * [property@Gtk.Adjustment:page-increment] fields are added to or subtracted
 * from the [property@Gtk.Adjustment:value] when the user asks to move by a step
 * (using e.g. the cursor arrow keys) or by a page (using e.g. the Page Down/Up
 * keys).
 *
 * # CSS nodes
 *
 * ```
 * scrollbar
 * ╰── range[.fine-tune]
 *     ╰── trough
 *         ╰── slider
 * ```
 *
 * `GtkScrollbar` has a main CSS node with name scrollbar and a subnode for its
 * contents. The main node gets the .horizontal or .vertical style classes applied,
 * depending on the scrollbar's orientation.
 *
 * The range node gets the style class .fine-tune added when the scrollbar is
 * in 'fine-tuning' mode.
 *
 * Other style classes that may be added to scrollbars inside
 * [class@Gtk.ScrolledWindow] include the positional classes (.left, .right,
 * .top, .bottom) and style classes related to overlay scrolling (.overlay-indicator,
 * .dragging, .hovering).
 *
 * # Accessibility
 *
 * `GtkScrollbar` uses the %GTK_ACCESSIBLE_ROLE_SCROLLBAR role.
 *
 * ## Skipped during bindings generation
 *
 * - method `adjustment`: Property TypeInfo of getter and setter do not match
 */
public open class Scrollbar(
    pointer: CPointer<GtkScrollbar>,
) : Widget(pointer.reinterpret()), Orientable, KGTyped {
    public val gtkScrollbarPointer: CPointer<GtkScrollbar>
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
     * Creates a new scrollbar with the given orientation.
     *
     * @param orientation the scrollbar’s orientation.
     * @param adjustment the [class@Gtk.Adjustment] to use, or null
     *   to create a new adjustment.
     * @return the new `GtkScrollbar`.
     */
    public constructor(orientation: Orientation, adjustment: Adjustment? = null) :
        this(
            gtk_scrollbar_new(
                orientation.nativeValue,
                adjustment?.gtkAdjustmentPointer?.reinterpret()
            )!!.reinterpret()
        )

    /**
     * Returns the scrollbar's adjustment.
     *
     * @return the scrollbar's adjustment
     */
    public open fun getAdjustment(): Adjustment =
        gtk_scrollbar_get_adjustment(gtkScrollbarPointer.reinterpret())!!.run {
            Adjustment(reinterpret())
        }

    /**
     * Makes the scrollbar use the given adjustment.
     *
     * @param adjustment the adjustment to set
     */
    public open fun setAdjustment(adjustment: Adjustment? = null): Unit =
        gtk_scrollbar_set_adjustment(
            gtkScrollbarPointer.reinterpret(),
            adjustment?.gtkAdjustmentPointer?.reinterpret()
        )

    public companion object : TypeCompanion<Scrollbar> {
        override val type: GeneratedClassKGType<Scrollbar> =
            GeneratedClassKGType(gtk_scrollbar_get_type()) { Scrollbar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
