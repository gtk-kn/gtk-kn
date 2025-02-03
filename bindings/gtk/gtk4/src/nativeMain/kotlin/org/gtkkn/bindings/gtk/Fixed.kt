// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gsk.Transform
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkFixed
import org.gtkkn.native.gtk.gtk_fixed_get_child_transform
import org.gtkkn.native.gtk.gtk_fixed_get_type
import org.gtkkn.native.gtk.gtk_fixed_move
import org.gtkkn.native.gtk.gtk_fixed_new
import org.gtkkn.native.gtk.gtk_fixed_put
import org.gtkkn.native.gtk.gtk_fixed_remove
import org.gtkkn.native.gtk.gtk_fixed_set_child_transform
import kotlin.Unit

/**
 * `GtkFixed` places its child widgets at fixed positions and with fixed sizes.
 *
 * `GtkFixed` performs no automatic layout management.
 *
 * For most applications, you should not use this container! It keeps
 * you from having to learn about the other GTK containers, but it
 * results in broken applications.  With `GtkFixed`, the following
 * things will result in truncated text, overlapping widgets, and
 * other display bugs:
 *
 * - Themes, which may change widget sizes.
 *
 * - Fonts other than the one you used to write the app will of course
 *   change the size of widgets containing text; keep in mind that
 *   users may use a larger font because of difficulty reading the
 *   default, or they may be using a different OS that provides different fonts.
 *
 * - Translation of text into other languages changes its size. Also,
 *   display of non-English text will use a different font in many
 *   cases.
 *
 * In addition, `GtkFixed` does not pay attention to text direction and
 * thus may produce unwanted results if your app is run under right-to-left
 * languages such as Hebrew or Arabic. That is: normally GTK will order
 * containers appropriately for the text direction, e.g. to put labels to
 * the right of the thing they label when using an RTL language, but it can’t
 * do that with `GtkFixed`. So if you need to reorder widgets depending on
 * the text direction, you would need to manually detect it and adjust child
 * positions accordingly.
 *
 * Finally, fixed positioning makes it kind of annoying to add/remove
 * UI elements, since you have to reposition all the other elements. This
 * is a long-term maintenance problem for your application.
 *
 * If you know none of these things are an issue for your application,
 * and prefer the simplicity of `GtkFixed`, by all means use the
 * widget. But you should be aware of the tradeoffs.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 */
public open class Fixed(public val gtkFixedPointer: CPointer<GtkFixed>) :
    Widget(gtkFixedPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkFixed`.
     *
     * @return a new `GtkFixed`.
     */
    public constructor() : this(gtk_fixed_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Retrieves the transformation for @widget set using
     * gtk_fixed_set_child_transform().
     *
     * @param widget a `GtkWidget`, child of @fixed
     * @return a `GskTransform`
     */
    public open fun getChildTransform(widget: Widget): Transform? =
        gtk_fixed_get_child_transform(gtkFixedPointer, widget.gtkWidgetPointer)?.run {
            Transform(this)
        }

    /**
     * Sets a translation transformation to the given @x and @y
     * coordinates to the child @widget of the `GtkFixed`.
     *
     * @param widget the child widget
     * @param x the horizontal position to move the widget to
     * @param y the vertical position to move the widget to
     */
    public open fun move(widget: Widget, x: gdouble, y: gdouble): Unit =
        gtk_fixed_move(gtkFixedPointer, widget.gtkWidgetPointer, x, y)

    /**
     * Adds a widget to a `GtkFixed` at the given position.
     *
     * @param widget the widget to add
     * @param x the horizontal position to place the widget at
     * @param y the vertical position to place the widget at
     */
    public open fun put(widget: Widget, x: gdouble, y: gdouble): Unit =
        gtk_fixed_put(gtkFixedPointer, widget.gtkWidgetPointer, x, y)

    /**
     * Removes a child from @fixed.
     *
     * @param widget the child widget to remove
     */
    public open fun remove(widget: Widget): Unit = gtk_fixed_remove(gtkFixedPointer, widget.gtkWidgetPointer)

    /**
     * Sets the transformation for @widget.
     *
     * This is a convenience function that retrieves the
     * [class@Gtk.FixedLayoutChild] instance associated to
     * @widget and calls [method@Gtk.FixedLayoutChild.set_transform].
     *
     * @param widget a `GtkWidget`, child of @fixed
     * @param transform the transformation assigned to @widget
     *   to reset @widget's transform
     */
    public open fun setChildTransform(widget: Widget, transform: Transform? = null): Unit =
        gtk_fixed_set_child_transform(gtkFixedPointer, widget.gtkWidgetPointer, transform?.gskTransformPointer)

    public companion object : TypeCompanion<Fixed> {
        override val type: GeneratedClassKGType<Fixed> =
            GeneratedClassKGType(getTypeOrNull()!!) { Fixed(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Fixed
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_fixed_get_type()

        /**
         * Gets the GType of from the symbol `gtk_fixed_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_fixed_get_type")
    }
}
