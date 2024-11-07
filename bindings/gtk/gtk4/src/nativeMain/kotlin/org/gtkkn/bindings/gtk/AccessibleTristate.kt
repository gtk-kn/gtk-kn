// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkAccessibleTristate

/**
 * The possible values for the %GTK_ACCESSIBLE_STATE_PRESSED
 * accessible state.
 *
 * Note that the %GTK_ACCESSIBLE_TRISTATE_FALSE and
 * %GTK_ACCESSIBLE_TRISTATE_TRUE have the same values
 * as false and true.
 */
public enum class AccessibleTristate(
    public val nativeValue: GtkAccessibleTristate,
) {
    /**
     * The state is `false`
     */
    FALSE(GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_FALSE),

    /**
     * The state is `true`
     */
    TRUE(GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_TRUE),

    /**
     * The state is `mixed`
     */
    MIXED(GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_MIXED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleTristate): AccessibleTristate =
            when (nativeValue) {
                GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_FALSE -> FALSE
                GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_TRUE -> TRUE
                GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_MIXED -> MIXED
                else -> error("invalid nativeValue")
            }
    }
}
