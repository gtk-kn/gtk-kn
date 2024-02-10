// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPropagationLimit
import org.gtkkn.native.gtk.GtkPropagationLimit.GTK_LIMIT_NONE
import org.gtkkn.native.gtk.GtkPropagationLimit.GTK_LIMIT_SAME_NATIVE

/**
 * Describes limits of a [class@EventController] for handling events
 * targeting other widgets.
 */
public enum class PropagationLimit(
    public val nativeValue: GtkPropagationLimit,
) {
    /**
     * Events are handled regardless of what their
     *   target is.
     */
    NONE(GTK_LIMIT_NONE),

    /**
     * Events are only handled if their target
     *   is in the same [iface@Native] as the event controllers widget. Note
     *   that some event types have two targets (origin and destination).
     */
    SAME_NATIVE(GTK_LIMIT_SAME_NATIVE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPropagationLimit): PropagationLimit =
            when (nativeValue) {
                GTK_LIMIT_NONE -> NONE
                GTK_LIMIT_SAME_NATIVE -> SAME_NATIVE
                else -> error("invalid nativeValue")
            }
    }
}
