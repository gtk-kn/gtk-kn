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
import org.gtkkn.native.gtk.GtkStackSwitcher
import org.gtkkn.native.gtk.gtk_stack_switcher_get_stack
import org.gtkkn.native.gtk.gtk_stack_switcher_get_type
import org.gtkkn.native.gtk.gtk_stack_switcher_new
import org.gtkkn.native.gtk.gtk_stack_switcher_set_stack
import kotlin.Unit

/**
 * The `GtkStackSwitcher` shows a row of buttons to switch between `GtkStack`
 * pages.
 *
 * ![An example GtkStackSwitcher](stackswitcher.png)
 *
 * It acts as a controller for the associated `GtkStack`.
 *
 * All the content for the buttons comes from the properties of the stacks
 * [class@Gtk.StackPage] objects; the button visibility in a `GtkStackSwitcher`
 * widget is controlled by the visibility of the child in the `GtkStack`.
 *
 * It is possible to associate multiple `GtkStackSwitcher` widgets
 * with the same `GtkStack` widget.
 *
 * # CSS nodes
 *
 * `GtkStackSwitcher` has a single CSS node named stackswitcher and
 * style class .stack-switcher.
 *
 * When circumstances require it, `GtkStackSwitcher` adds the
 * .needs-attention style class to the widgets representing the
 * stack pages.
 *
 * # Accessibility
 *
 * `GtkStackSwitcher` uses the %GTK_ACCESSIBLE_ROLE_TAB_LIST role
 * and uses the %GTK_ACCESSIBLE_ROLE_TAB for its buttons.
 *
 * # Orientable
 *
 * Since GTK 4.4, `GtkStackSwitcher` implements `GtkOrientable` allowing
 * the stack switcher to be made vertical with
 * `gtk_orientable_set_orientation()`.
 */
public open class StackSwitcher(
    pointer: CPointer<GtkStackSwitcher>,
) : Widget(pointer.reinterpret()),
    Orientable,
    KGTyped {
    public val gtkStackSwitcherPointer: CPointer<GtkStackSwitcher>
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
     * The stack.
     */
    public open var stack: Stack?
        /**
         * Retrieves the stack.
         *
         * @return the stack
         */
        get() =
            gtk_stack_switcher_get_stack(gtkStackSwitcherPointer.reinterpret())?.run {
                Stack(reinterpret())
            }

        /**
         * Sets the stack to control.
         *
         * @param stack a `GtkStack`
         */
        set(
            stack
        ) = gtk_stack_switcher_set_stack(gtkStackSwitcherPointer.reinterpret(), stack?.gtkStackPointer?.reinterpret())

    /**
     * Create a new `GtkStackSwitcher`.
     *
     * @return a new `GtkStackSwitcher`.
     */
    public constructor() : this(gtk_stack_switcher_new()!!.reinterpret())

    /**
     * Retrieves the stack.
     *
     * @return the stack
     */
    public open fun getStack(): Stack? =
        gtk_stack_switcher_get_stack(gtkStackSwitcherPointer.reinterpret())?.run {
            Stack(reinterpret())
        }

    /**
     * Sets the stack to control.
     *
     * @param stack a `GtkStack`
     */
    public open fun setStack(stack: Stack? = null): Unit =
        gtk_stack_switcher_set_stack(gtkStackSwitcherPointer.reinterpret(), stack?.gtkStackPointer?.reinterpret())

    public companion object : TypeCompanion<StackSwitcher> {
        override val type: GeneratedClassKGType<StackSwitcher> =
            GeneratedClassKGType(gtk_stack_switcher_get_type()) { StackSwitcher(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}