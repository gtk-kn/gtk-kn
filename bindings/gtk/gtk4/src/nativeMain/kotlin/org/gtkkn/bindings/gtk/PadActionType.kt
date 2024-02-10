// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPadActionType
import org.gtkkn.native.gtk.GtkPadActionType.GTK_PAD_ACTION_BUTTON
import org.gtkkn.native.gtk.GtkPadActionType.GTK_PAD_ACTION_RING
import org.gtkkn.native.gtk.GtkPadActionType.GTK_PAD_ACTION_STRIP

/**
 * The type of a pad action.
 */
public enum class PadActionType(
    public val nativeValue: GtkPadActionType,
) {
    /**
     * Action is triggered by a pad button
     */
    BUTTON(GTK_PAD_ACTION_BUTTON),

    /**
     * Action is triggered by a pad ring
     */
    RING(GTK_PAD_ACTION_RING),

    /**
     * Action is triggered by a pad strip
     */
    STRIP(GTK_PAD_ACTION_STRIP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPadActionType): PadActionType =
            when (nativeValue) {
                GTK_PAD_ACTION_BUTTON -> BUTTON
                GTK_PAD_ACTION_RING -> RING
                GTK_PAD_ACTION_STRIP -> STRIP
                else -> error("invalid nativeValue")
            }
    }
}
