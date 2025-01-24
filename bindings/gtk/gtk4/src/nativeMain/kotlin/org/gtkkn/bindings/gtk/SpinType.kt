// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSpinType
import org.gtkkn.native.gtk.gtk_spin_type_get_type

/**
 * The values of the GtkSpinType enumeration are used to specify the
 * change to make in gtk_spin_button_spin().
 */
public enum class SpinType(public val nativeValue: GtkSpinType) {
    /**
     * Increment by the adjustments step increment.
     */
    STEP_FORWARD(GtkSpinType.GTK_SPIN_STEP_FORWARD),

    /**
     * Decrement by the adjustments step increment.
     */
    STEP_BACKWARD(GtkSpinType.GTK_SPIN_STEP_BACKWARD),

    /**
     * Increment by the adjustments page increment.
     */
    PAGE_FORWARD(GtkSpinType.GTK_SPIN_PAGE_FORWARD),

    /**
     * Decrement by the adjustments page increment.
     */
    PAGE_BACKWARD(GtkSpinType.GTK_SPIN_PAGE_BACKWARD),

    /**
     * Go to the adjustments lower bound.
     */
    HOME(GtkSpinType.GTK_SPIN_HOME),

    /**
     * Go to the adjustments upper bound.
     */
    END(GtkSpinType.GTK_SPIN_END),

    /**
     * Change by a specified amount.
     */
    USER_DEFINED(GtkSpinType.GTK_SPIN_USER_DEFINED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSpinType): SpinType = when (nativeValue) {
            GtkSpinType.GTK_SPIN_STEP_FORWARD -> STEP_FORWARD
            GtkSpinType.GTK_SPIN_STEP_BACKWARD -> STEP_BACKWARD
            GtkSpinType.GTK_SPIN_PAGE_FORWARD -> PAGE_FORWARD
            GtkSpinType.GTK_SPIN_PAGE_BACKWARD -> PAGE_BACKWARD
            GtkSpinType.GTK_SPIN_HOME -> HOME
            GtkSpinType.GTK_SPIN_END -> END
            GtkSpinType.GTK_SPIN_USER_DEFINED -> USER_DEFINED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SpinType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_spin_type_get_type()
    }
}
