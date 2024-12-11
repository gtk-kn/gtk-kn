// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessibleInvalidState
import org.gtkkn.native.gtk.gtk_accessible_invalid_state_get_type

/**
 * The possible values for the %GTK_ACCESSIBLE_STATE_INVALID
 * accessible state.
 *
 * Note that the %GTK_ACCESSIBLE_INVALID_FALSE and
 * %GTK_ACCESSIBLE_INVALID_TRUE have the same values
 * as false and true.
 */
public enum class AccessibleInvalidState(public val nativeValue: GtkAccessibleInvalidState) {
    /**
     * There are no detected errors in the value
     */
    FALSE(GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_FALSE),

    /**
     * The value entered by the user has failed validation
     */
    TRUE(GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_TRUE),

    /**
     * A grammatical error was detected
     */
    GRAMMAR(GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_GRAMMAR),

    /**
     * A spelling error was detected
     */
    SPELLING(GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_SPELLING),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleInvalidState): AccessibleInvalidState =
            when (nativeValue) {
                GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_FALSE -> FALSE
                GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_TRUE -> TRUE
                GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_GRAMMAR -> GRAMMAR
                GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_SPELLING -> SPELLING
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of AccessibleInvalidState
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_invalid_state_get_type()
    }
}
