// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkStack
import org.gtkkn.native.gtk.gtk_stack_add_child
import org.gtkkn.native.gtk.gtk_stack_add_named
import org.gtkkn.native.gtk.gtk_stack_add_titled
import org.gtkkn.native.gtk.gtk_stack_get_child_by_name
import org.gtkkn.native.gtk.gtk_stack_get_hhomogeneous
import org.gtkkn.native.gtk.gtk_stack_get_interpolate_size
import org.gtkkn.native.gtk.gtk_stack_get_page
import org.gtkkn.native.gtk.gtk_stack_get_pages
import org.gtkkn.native.gtk.gtk_stack_get_transition_duration
import org.gtkkn.native.gtk.gtk_stack_get_transition_running
import org.gtkkn.native.gtk.gtk_stack_get_transition_type
import org.gtkkn.native.gtk.gtk_stack_get_type
import org.gtkkn.native.gtk.gtk_stack_get_vhomogeneous
import org.gtkkn.native.gtk.gtk_stack_get_visible_child
import org.gtkkn.native.gtk.gtk_stack_get_visible_child_name
import org.gtkkn.native.gtk.gtk_stack_new
import org.gtkkn.native.gtk.gtk_stack_remove
import org.gtkkn.native.gtk.gtk_stack_set_hhomogeneous
import org.gtkkn.native.gtk.gtk_stack_set_interpolate_size
import org.gtkkn.native.gtk.gtk_stack_set_transition_duration
import org.gtkkn.native.gtk.gtk_stack_set_transition_type
import org.gtkkn.native.gtk.gtk_stack_set_vhomogeneous
import org.gtkkn.native.gtk.gtk_stack_set_visible_child
import org.gtkkn.native.gtk.gtk_stack_set_visible_child_full
import org.gtkkn.native.gtk.gtk_stack_set_visible_child_name
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GtkStack` is a container which only shows one of its children
 * at a time.
 *
 * In contrast to `GtkNotebook`, `GtkStack` does not provide a means
 * for users to change the visible child. Instead, a separate widget
 * such as [class@Gtk.StackSwitcher] or [class@Gtk.StackSidebar] can
 * be used with `GtkStack` to provide this functionality.
 *
 * Transitions between pages can be animated as slides or fades. This
 * can be controlled with [method@Gtk.Stack.set_transition_type].
 * These animations respect the [property@Gtk.Settings:gtk-enable-animations]
 * setting.
 *
 * `GtkStack` maintains a [class@Gtk.StackPage] object for each added
 * child, which holds additional per-child properties. You
 * obtain the `GtkStackPage` for a child with [method@Gtk.Stack.get_page]
 * and you can obtain a `GtkSelectionModel` containing all the pages
 * with [method@Gtk.Stack.get_pages].
 *
 * # GtkStack as GtkBuildable
 *
 * To set child-specific properties in a .ui file, create `GtkStackPage`
 * objects explicitly, and set the child widget as a property on it:
 *
 * ```xml
 *   <object class="GtkStack" id="stack">
 *     <child>
 *       <object class="GtkStackPage">
 *         <property name="name">page1</property>
 *         <property name="title">In the beginning…</property>
 *         <property name="child">
 *           <object class="GtkLabel">
 *             <property name="label">It was dark</property>
 *           </object>
 *         </property>
 *       </object>
 *     </child>
 * ```
 *
 * # CSS nodes
 *
 * `GtkStack` has a single CSS node named stack.
 *
 * # Accessibility
 *
 * `GtkStack` uses the %GTK_ACCESSIBLE_ROLE_TAB_PANEL for the stack
 * pages, which are the accessible parent objects of the child widgets.
 *
 * ## Skipped during bindings generation
 *
 * - method `visible-child`: Property TypeInfo of getter and setter do not match
 * - method `visible-child-name`: Property TypeInfo of getter and setter do not match
 */
public open class Stack(public val gtkStackPointer: CPointer<GtkStack>) :
    Widget(gtkStackPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * true if the stack allocates the same width for all children.
     */
    public open var hhomogeneous: Boolean
        /**
         * Gets whether @stack is horizontally homogeneous.
         *
         * @return whether @stack is horizontally homogeneous.
         */
        get() = gtk_stack_get_hhomogeneous(gtkStackPointer).asBoolean()

        /**
         * Sets the `GtkStack` to be horizontally homogeneous or not.
         *
         * If it is homogeneous, the `GtkStack` will request the same
         * width for all its children. If it isn't, the stack
         * may change width when a different child becomes visible.
         *
         * @param hhomogeneous true to make @stack horizontally homogeneous
         */
        set(hhomogeneous) = gtk_stack_set_hhomogeneous(gtkStackPointer, hhomogeneous.asGBoolean())

    /**
     * Whether or not the size should smoothly change during the transition.
     */
    public open var interpolateSize: Boolean
        /**
         * Returns whether the `GtkStack` is set up to interpolate between
         * the sizes of children on page switch.
         *
         * @return true if child sizes are interpolated
         */
        get() = gtk_stack_get_interpolate_size(gtkStackPointer).asBoolean()

        /**
         * Sets whether or not @stack will interpolate its size when
         * changing the visible child.
         *
         * If the [property@Gtk.Stack:interpolate-size] property is set
         * to true, @stack will interpolate its size between the current
         * one and the one it'll take after changing the visible child,
         * according to the set transition duration.
         *
         * @param interpolateSize the new value
         */
        set(interpolateSize) = gtk_stack_set_interpolate_size(gtkStackPointer, interpolateSize.asGBoolean())

    /**
     * A selection model with the stack pages.
     */
    public open val pages: SelectionModel
        /**
         * Returns a `GListModel` that contains the pages of the stack.
         *
         * This can be used to keep an up-to-date view. The model also
         * implements [iface@Gtk.SelectionModel] and can be used to track
         * and modify the visible page.
         *
         * @return a `GtkSelectionModel` for the stack's children
         */
        get() = gtk_stack_get_pages(gtkStackPointer)!!.run {
            SelectionModel.SelectionModelImpl(reinterpret())
        }

    /**
     * The animation duration, in milliseconds.
     */
    public open var transitionDuration: guint
        /**
         * Returns the amount of time (in milliseconds) that
         * transitions between pages in @stack will take.
         *
         * @return the transition duration
         */
        get() = gtk_stack_get_transition_duration(gtkStackPointer)

        /**
         * Sets the duration that transitions between pages in @stack
         * will take.
         *
         * @param duration the new duration, in milliseconds
         */
        set(duration) = gtk_stack_set_transition_duration(gtkStackPointer, duration)

    /**
     * Whether or not the transition is currently running.
     */
    public open val transitionRunning: Boolean
        /**
         * Returns whether the @stack is currently in a transition from one page to
         * another.
         *
         * @return true if the transition is currently running, false otherwise.
         */
        get() = gtk_stack_get_transition_running(gtkStackPointer).asBoolean()

    /**
     * The type of animation used to transition.
     */
    public open var transitionType: StackTransitionType
        /**
         * Gets the type of animation that will be used
         * for transitions between pages in @stack.
         *
         * @return the current transition type of @stack
         */
        get() = gtk_stack_get_transition_type(gtkStackPointer).run {
            StackTransitionType.fromNativeValue(this)
        }

        /**
         * Sets the type of animation that will be used for
         * transitions between pages in @stack.
         *
         * Available types include various kinds of fades and slides.
         *
         * The transition type can be changed without problems
         * at runtime, so it is possible to change the animation
         * based on the page that is about to become current.
         *
         * @param transition the new transition type
         */
        set(transition) = gtk_stack_set_transition_type(gtkStackPointer, transition.nativeValue)

    /**
     * true if the stack allocates the same height for all children.
     */
    public open var vhomogeneous: Boolean
        /**
         * Gets whether @stack is vertically homogeneous.
         *
         * @return whether @stack is vertically homogeneous.
         */
        get() = gtk_stack_get_vhomogeneous(gtkStackPointer).asBoolean()

        /**
         * Sets the `GtkStack` to be vertically homogeneous or not.
         *
         * If it is homogeneous, the `GtkStack` will request the same
         * height for all its children. If it isn't, the stack
         * may change height when a different child becomes visible.
         *
         * @param vhomogeneous true to make @stack vertically homogeneous
         */
        set(vhomogeneous) = gtk_stack_set_vhomogeneous(gtkStackPointer, vhomogeneous.asGBoolean())

    /**
     * Creates a new `GtkStack`.
     *
     * @return a new `GtkStack`
     */
    public constructor() : this(gtk_stack_new()!!.reinterpret())

    /**
     * Adds a child to @stack.
     *
     * @param child the widget to add
     * @return the `GtkStackPage` for @child
     */
    public open fun addChild(child: Widget): StackPage =
        gtk_stack_add_child(gtkStackPointer, child.gtkWidgetPointer)!!.run {
            StackPage(this)
        }

    /**
     * Adds a child to @stack.
     *
     * The child is identified by the @name.
     *
     * @param child the widget to add
     * @param name the name for @child
     * @return the `GtkStackPage` for @child
     */
    public open fun addNamed(child: Widget, name: String? = null): StackPage =
        gtk_stack_add_named(gtkStackPointer, child.gtkWidgetPointer, name)!!.run {
            StackPage(this)
        }

    /**
     * Adds a child to @stack.
     *
     * The child is identified by the @name. The @title
     * will be used by `GtkStackSwitcher` to represent
     * @child in a tab bar, so it should be short.
     *
     * @param child the widget to add
     * @param name the name for @child
     * @param title a human-readable title for @child
     * @return the `GtkStackPage` for @child
     */
    public open fun addTitled(child: Widget, name: String? = null, title: String): StackPage =
        gtk_stack_add_titled(gtkStackPointer, child.gtkWidgetPointer, name, title)!!.run {
            StackPage(this)
        }

    /**
     * Finds the child with the name given as the argument.
     *
     * Returns null if there is no child with this name.
     *
     * @param name the name of the child to find
     * @return the requested child
     *   of the `GtkStack`
     */
    public open fun getChildByName(name: String): Widget? = gtk_stack_get_child_by_name(gtkStackPointer, name)?.run {
        Widget.WidgetImpl(this)
    }

    /**
     * Returns the `GtkStackPage` object for @child.
     *
     * @param child a child of @stack
     * @return the `GtkStackPage` for @child
     */
    public open fun getPage(child: Widget): StackPage =
        gtk_stack_get_page(gtkStackPointer, child.gtkWidgetPointer)!!.run {
            StackPage(this)
        }

    /**
     * Gets the currently visible child of @stack.
     *
     * Returns null if there are no visible children.
     *
     * @return the visible child of the `GtkStack`
     */
    public open fun getVisibleChild(): Widget? = gtk_stack_get_visible_child(gtkStackPointer)?.run {
        Widget.WidgetImpl(this)
    }

    /**
     * Returns the name of the currently visible child of @stack.
     *
     * Returns null if there is no visible child.
     *
     * @return the name of the visible child
     *   of the `GtkStack`
     */
    public open fun getVisibleChildName(): String? = gtk_stack_get_visible_child_name(gtkStackPointer)?.toKString()

    /**
     * Removes a child widget from @stack.
     *
     * @param child the child to remove
     */
    public open fun remove(child: Widget): Unit = gtk_stack_remove(gtkStackPointer, child.gtkWidgetPointer)

    /**
     * Makes @child the visible child of @stack.
     *
     * If @child is different from the currently visible child,
     * the transition between the two will be animated with the
     * current transition type of @stack.
     *
     * Note that the @child widget has to be visible itself
     * (see [method@Gtk.Widget.show]) in order to become the visible
     * child of @stack.
     *
     * @param child a child of @stack
     */
    public open fun setVisibleChild(child: Widget): Unit =
        gtk_stack_set_visible_child(gtkStackPointer, child.gtkWidgetPointer)

    /**
     * Makes the child with the given name visible.
     *
     * Note that the child widget has to be visible itself
     * (see [method@Gtk.Widget.show]) in order to become the visible
     * child of @stack.
     *
     * @param name the name of the child to make visible
     * @param transition the transition type to use
     */
    public open fun setVisibleChildFull(name: String, transition: StackTransitionType): Unit =
        gtk_stack_set_visible_child_full(gtkStackPointer, name, transition.nativeValue)

    /**
     * Makes the child with the given name visible.
     *
     * If @child is different from the currently visible child,
     * the transition between the two will be animated with the
     * current transition type of @stack.
     *
     * Note that the child widget has to be visible itself
     * (see [method@Gtk.Widget.show]) in order to become the visible
     * child of @stack.
     *
     * @param name the name of the child to make visible
     */
    public open fun setVisibleChildName(name: String): Unit = gtk_stack_set_visible_child_name(gtkStackPointer, name)

    public companion object : TypeCompanion<Stack> {
        override val type: GeneratedClassKGType<Stack> =
            GeneratedClassKGType(gtk_stack_get_type()) { Stack(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Stack
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_stack_get_type()
    }
}
