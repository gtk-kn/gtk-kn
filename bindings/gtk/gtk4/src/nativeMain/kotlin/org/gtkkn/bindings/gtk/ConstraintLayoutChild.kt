// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkConstraintLayoutChild
import org.gtkkn.native.gtk.gtk_constraint_layout_child_get_type

/**
 * `GtkLayoutChild` subclass for children in a `GtkConstraintLayout`.
 */
public open class ConstraintLayoutChild(
    public val gtkConstraintLayoutChildPointer: CPointer<GtkConstraintLayoutChild>,
) : LayoutChild(gtkConstraintLayoutChildPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    public companion object : TypeCompanion<ConstraintLayoutChild> {
        override val type: GeneratedClassKGType<ConstraintLayoutChild> =
            GeneratedClassKGType(getTypeOrNull()!!) { ConstraintLayoutChild(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ConstraintLayoutChild
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_constraint_layout_child_get_type()

        /**
         * Gets the GType of from the symbol `gtk_constraint_layout_child_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_constraint_layout_child_get_type")
    }
}
