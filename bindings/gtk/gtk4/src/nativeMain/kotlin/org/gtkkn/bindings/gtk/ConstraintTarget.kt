// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_constraint_target_get_type

/**
 * The `GtkConstraintTarget` interface is implemented by objects that
 * can be used as source or target in `GtkConstraint`s.
 *
 * Besides `GtkWidget`, it is also implemented by `GtkConstraintGuide`.
 */
public interface ConstraintTarget :
    Proxy,
    KGTyped {
    public val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>

    /**
     * The ConstraintTargetImpl type represents a native instance of the ConstraintTarget interface.
     *
     * @constructor Creates a new instance of ConstraintTarget for the provided [CPointer].
     */
    public class ConstraintTargetImpl(gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>) :
        Object(gtkConstraintTargetPointer.reinterpret()),
        ConstraintTarget {
        init {
            Gtk
        }

        override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget> =
            gtkConstraintTargetPointer
    }

    public companion object : TypeCompanion<ConstraintTarget> {
        override val type: GeneratedInterfaceKGType<ConstraintTarget> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { ConstraintTargetImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ConstraintTarget
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_constraint_target_get_type()

        /**
         * Gets the GType of from the symbol `gtk_constraint_target_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_constraint_target_get_type")
    }
}
