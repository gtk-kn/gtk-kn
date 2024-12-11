// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSpinButtonUpdatePolicy
import org.gtkkn.native.gtk.gtk_spin_button_update_policy_get_type

/**
 * Determines whether the spin button displays values outside the adjustment
 * bounds.
 *
 * See [method@Gtk.SpinButton.set_update_policy].
 */
public enum class SpinButtonUpdatePolicy(public val nativeValue: GtkSpinButtonUpdatePolicy) {
    /**
     * When refreshing your `GtkSpinButton`, the value is
     *   always displayed
     */
    ALWAYS(GtkSpinButtonUpdatePolicy.GTK_UPDATE_ALWAYS),

    /**
     * When refreshing your `GtkSpinButton`, the value is
     *   only displayed if it is valid within the bounds of the spin button's
     *   adjustment
     */
    IF_VALID(GtkSpinButtonUpdatePolicy.GTK_UPDATE_IF_VALID),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSpinButtonUpdatePolicy): SpinButtonUpdatePolicy =
            when (nativeValue) {
                GtkSpinButtonUpdatePolicy.GTK_UPDATE_ALWAYS -> ALWAYS
                GtkSpinButtonUpdatePolicy.GTK_UPDATE_IF_VALID -> IF_VALID
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of SpinButtonUpdatePolicy
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_spin_button_update_policy_get_type()
    }
}
