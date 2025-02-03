// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkStackSwitcher
import org.gtkkn.native.gtk.gtk_stack_switcher_get_stack
import org.gtkkn.native.gtk.gtk_stack_switcher_get_type
import org.gtkkn.native.gtk.gtk_stack_switcher_new
import org.gtkkn.native.gtk.gtk_stack_switcher_set_stack

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
public open class StackSwitcher(public val gtkStackSwitcherPointer: CPointer<GtkStackSwitcher>) :
    Widget(gtkStackSwitcherPointer.reinterpret()),
    Orientable,
    KGTyped {
    init {
        Gtk
    }

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The stack.
     */
    public open var stack: Stack?
        /**
         * Retrieves the stack.
         *
         * @return the stack
         */
        get() = gtk_stack_switcher_get_stack(gtkStackSwitcherPointer)?.run {
            InstanceCache.get(this, true) { Stack(reinterpret()) }!!
        }

        /**
         * Sets the stack to control.
         *
         * @param stack a `GtkStack`
         */
        set(stack) = gtk_stack_switcher_set_stack(gtkStackSwitcherPointer, stack?.gtkStackPointer)

    /**
     * Create a new `GtkStackSwitcher`.
     *
     * @return a new `GtkStackSwitcher`.
     */
    public constructor() : this(gtk_stack_switcher_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<StackSwitcher> {
        override val type: GeneratedClassKGType<StackSwitcher> =
            GeneratedClassKGType(getTypeOrNull()!!) { StackSwitcher(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of StackSwitcher
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_stack_switcher_get_type()

        /**
         * Gets the GType of from the symbol `gtk_stack_switcher_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_stack_switcher_get_type")
    }
}
