// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkAccessibleInvalidState
import org.gtkkn.native.gtk.GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_FALSE
import org.gtkkn.native.gtk.GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_GRAMMAR
import org.gtkkn.native.gtk.GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_SPELLING
import org.gtkkn.native.gtk.GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_TRUE

/**
 * The possible values for the %GTK_ACCESSIBLE_STATE_INVALID
 * accessible state.
 *
 * Note that the %GTK_ACCESSIBLE_INVALID_FALSE and
 * %GTK_ACCESSIBLE_INVALID_TRUE have the same values
 * as false and true.
 */
public enum class AccessibleInvalidState(
    public val nativeValue: GtkAccessibleInvalidState,
) {
    /**
     * There are no detected errors in the value
     */
    FALSE(GTK_ACCESSIBLE_INVALID_FALSE),

    /**
     * The value entered by the user has failed validation
     */
    TRUE(GTK_ACCESSIBLE_INVALID_TRUE),

    /**
     * A grammatical error was detected
     */
    GRAMMAR(GTK_ACCESSIBLE_INVALID_GRAMMAR),

    /**
     * A spelling error was detected
     */
    SPELLING(GTK_ACCESSIBLE_INVALID_SPELLING),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleInvalidState): AccessibleInvalidState =
            when (nativeValue) {
                GTK_ACCESSIBLE_INVALID_FALSE -> FALSE
                GTK_ACCESSIBLE_INVALID_TRUE -> TRUE
                GTK_ACCESSIBLE_INVALID_GRAMMAR -> GRAMMAR
                GTK_ACCESSIBLE_INVALID_SPELLING -> SPELLING
                else -> error("invalid nativeValue")
            }
    }
}
