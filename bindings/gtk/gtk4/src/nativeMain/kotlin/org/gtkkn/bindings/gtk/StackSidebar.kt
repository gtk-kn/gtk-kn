// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkStackSidebar
import org.gtkkn.native.gtk.gtk_stack_sidebar_get_stack
import org.gtkkn.native.gtk.gtk_stack_sidebar_get_type
import org.gtkkn.native.gtk.gtk_stack_sidebar_new
import org.gtkkn.native.gtk.gtk_stack_sidebar_set_stack
import kotlin.Unit

/**
 * A `GtkStackSidebar` uses a sidebar to switch between `GtkStack` pages.
 *
 * In order to use a `GtkStackSidebar`, you simply use a `GtkStack` to
 * organize your UI flow, and add the sidebar to your sidebar area. You
 * can use [method@Gtk.StackSidebar.set_stack] to connect the `GtkStackSidebar`
 * to the `GtkStack`.
 *
 * # CSS nodes
 *
 * `GtkStackSidebar` has a single CSS node with name stacksidebar and
 * style class .sidebar.
 *
 * When circumstances require it, `GtkStackSidebar` adds the
 * .needs-attention style class to the widgets representing the stack
 * pages.
 *
 * ## Skipped during bindings generation
 *
 * - method `stack`: Property TypeInfo of getter and setter do not match
 */
public open class StackSidebar(public val gtkStackSidebarPointer: CPointer<GtkStackSidebar>) :
    Widget(gtkStackSidebarPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkStackSidebar`.
     *
     * @return the new `GtkStackSidebar`
     */
    public constructor() : this(gtk_stack_sidebar_new()!!.reinterpret())

    /**
     * Retrieves the stack.
     *
     * @return the associated `GtkStack` or
     *   null if none has been set explicitly
     */
    public open fun getStack(): Stack? = gtk_stack_sidebar_get_stack(gtkStackSidebarPointer)?.run {
        Stack(this)
    }

    /**
     * Set the `GtkStack` associated with this `GtkStackSidebar`.
     *
     * The sidebar widget will automatically update according to
     * the order and items within the given `GtkStack`.
     *
     * @param stack a `GtkStack`
     */
    public open fun setStack(stack: Stack): Unit =
        gtk_stack_sidebar_set_stack(gtkStackSidebarPointer, stack.gtkStackPointer)

    public companion object : TypeCompanion<StackSidebar> {
        override val type: GeneratedClassKGType<StackSidebar> =
            GeneratedClassKGType(gtk_stack_sidebar_get_type()) { StackSidebar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of StackSidebar
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_stack_sidebar_get_type()
    }
}
