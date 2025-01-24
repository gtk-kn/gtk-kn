// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkSpinner
import org.gtkkn.native.gtk.gtk_spinner_get_spinning
import org.gtkkn.native.gtk.gtk_spinner_get_type
import org.gtkkn.native.gtk.gtk_spinner_new
import org.gtkkn.native.gtk.gtk_spinner_set_spinning
import org.gtkkn.native.gtk.gtk_spinner_start
import org.gtkkn.native.gtk.gtk_spinner_stop
import kotlin.Boolean
import kotlin.Unit

/**
 * A `GtkSpinner` widget displays an icon-size spinning animation.
 *
 * It is often used as an alternative to a [class@Gtk.ProgressBar]
 * for displaying indefinite activity, instead of actual progress.
 *
 * ![An example GtkSpinner](spinner.png)
 *
 * To start the animation, use [method@Gtk.Spinner.start], to stop it
 * use [method@Gtk.Spinner.stop].
 *
 * # CSS nodes
 *
 * `GtkSpinner` has a single CSS node with the name spinner.
 * When the animation is active, the :checked pseudoclass is
 * added to this node.
 */
public open class Spinner(public val gtkSpinnerPointer: CPointer<GtkSpinner>) :
    Widget(gtkSpinnerPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether the spinner is spinning
     */
    public open var spinning: Boolean
        /**
         * Returns whether the spinner is spinning.
         *
         * @return true if the spinner is active
         */
        get() = gtk_spinner_get_spinning(gtkSpinnerPointer).asBoolean()

        /**
         * Sets the activity of the spinner.
         *
         * @param spinning whether the spinner should be spinning
         */
        set(spinning) = gtk_spinner_set_spinning(gtkSpinnerPointer, spinning.asGBoolean())

    /**
     * Returns a new spinner widget. Not yet started.
     *
     * @return a new `GtkSpinner`
     */
    public constructor() : this(gtk_spinner_new()!!.reinterpret())

    /**
     * Starts the animation of the spinner.
     */
    public open fun start(): Unit = gtk_spinner_start(gtkSpinnerPointer)

    /**
     * Stops the animation of the spinner.
     */
    public open fun stop(): Unit = gtk_spinner_stop(gtkSpinnerPointer)

    public companion object : TypeCompanion<Spinner> {
        override val type: GeneratedClassKGType<Spinner> =
            GeneratedClassKGType(gtk_spinner_get_type()) { Spinner(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Spinner
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_spinner_get_type()
    }
}
