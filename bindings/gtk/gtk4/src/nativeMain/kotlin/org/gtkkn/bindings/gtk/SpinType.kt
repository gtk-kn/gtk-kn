// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSpinType
import org.gtkkn.native.gtk.GtkSpinType.GTK_SPIN_END
import org.gtkkn.native.gtk.GtkSpinType.GTK_SPIN_HOME
import org.gtkkn.native.gtk.GtkSpinType.GTK_SPIN_PAGE_BACKWARD
import org.gtkkn.native.gtk.GtkSpinType.GTK_SPIN_PAGE_FORWARD
import org.gtkkn.native.gtk.GtkSpinType.GTK_SPIN_STEP_BACKWARD
import org.gtkkn.native.gtk.GtkSpinType.GTK_SPIN_STEP_FORWARD
import org.gtkkn.native.gtk.GtkSpinType.GTK_SPIN_USER_DEFINED

/**
 * The values of the GtkSpinType enumeration are used to specify the
 * change to make in gtk_spin_button_spin().
 */
public enum class SpinType(
    public val nativeValue: GtkSpinType,
) {
    /**
     * Increment by the adjustments step increment.
     */
    STEP_FORWARD(GTK_SPIN_STEP_FORWARD),

    /**
     * Decrement by the adjustments step increment.
     */
    STEP_BACKWARD(GTK_SPIN_STEP_BACKWARD),

    /**
     * Increment by the adjustments page increment.
     */
    PAGE_FORWARD(GTK_SPIN_PAGE_FORWARD),

    /**
     * Decrement by the adjustments page increment.
     */
    PAGE_BACKWARD(GTK_SPIN_PAGE_BACKWARD),

    /**
     * Go to the adjustments lower bound.
     */
    HOME(GTK_SPIN_HOME),

    /**
     * Go to the adjustments upper bound.
     */
    END(GTK_SPIN_END),

    /**
     * Change by a specified amount.
     */
    USER_DEFINED(GTK_SPIN_USER_DEFINED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSpinType): SpinType =
            when (nativeValue) {
                GTK_SPIN_STEP_FORWARD -> STEP_FORWARD
                GTK_SPIN_STEP_BACKWARD -> STEP_BACKWARD
                GTK_SPIN_PAGE_FORWARD -> PAGE_FORWARD
                GTK_SPIN_PAGE_BACKWARD -> PAGE_BACKWARD
                GTK_SPIN_HOME -> HOME
                GTK_SPIN_END -> END
                GTK_SPIN_USER_DEFINED -> USER_DEFINED
                else -> error("invalid nativeValue")
            }
    }
}
