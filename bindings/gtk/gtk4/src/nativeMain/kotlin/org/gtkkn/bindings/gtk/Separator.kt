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
import org.gtkkn.native.gtk.GtkSeparator
import org.gtkkn.native.gtk.gtk_separator_get_type
import org.gtkkn.native.gtk.gtk_separator_new

/**
 * `GtkSeparator` is a horizontal or vertical separator widget.
 *
 * ![An example GtkSeparator](separator.png)
 *
 * A `GtkSeparator` can be used to group the widgets within a window.
 * It displays a line with a shadow to make it appear sunken into the
 * interface.
 *
 * # CSS nodes
 *
 * `GtkSeparator` has a single CSS node with name separator. The node
 * gets one of the .horizontal or .vertical style classes.
 *
 * # Accessibility
 *
 * `GtkSeparator` uses the %GTK_ACCESSIBLE_ROLE_SEPARATOR role.
 */
public open class Separator(public val gtkSeparatorPointer: CPointer<GtkSeparator>) :
    Widget(gtkSeparatorPointer.reinterpret()),
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
     * Creates a new `GtkSeparator` with the given orientation.
     *
     * @param orientation the separator’s orientation.
     * @return a new `GtkSeparator`.
     */
    public constructor(orientation: Orientation) : this(gtk_separator_new(orientation.nativeValue)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<Separator> {
        override val type: GeneratedClassKGType<Separator> =
            GeneratedClassKGType(getTypeOrNull()!!) { Separator(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Separator
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_separator_get_type()

        /**
         * Gets the GType of from the symbol `gtk_separator_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_separator_get_type")
    }
}
