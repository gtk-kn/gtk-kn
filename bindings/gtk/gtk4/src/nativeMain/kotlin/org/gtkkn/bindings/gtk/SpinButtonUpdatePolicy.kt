// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSpinButtonUpdatePolicy
import org.gtkkn.native.gtk.GtkSpinButtonUpdatePolicy.GTK_UPDATE_ALWAYS
import org.gtkkn.native.gtk.GtkSpinButtonUpdatePolicy.GTK_UPDATE_IF_VALID

/**
 * Determines whether the spin button displays values outside the adjustment
 * bounds.
 *
 * See [method@Gtk.SpinButton.set_update_policy].
 */
public enum class SpinButtonUpdatePolicy(
    public val nativeValue: GtkSpinButtonUpdatePolicy,
) {
    /**
     * When refreshing your `GtkSpinButton`, the value is
     *   always displayed
     */
    ALWAYS(GTK_UPDATE_ALWAYS),

    /**
     * When refreshing your `GtkSpinButton`, the value is
     *   only displayed if it is valid within the bounds of the spin button's
     *   adjustment
     */
    IF_VALID(GTK_UPDATE_IF_VALID),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSpinButtonUpdatePolicy): SpinButtonUpdatePolicy =
            when (nativeValue) {
                GTK_UPDATE_ALWAYS -> ALWAYS
                GTK_UPDATE_IF_VALID -> IF_VALID
                else -> error("invalid nativeValue")
            }
    }
}
