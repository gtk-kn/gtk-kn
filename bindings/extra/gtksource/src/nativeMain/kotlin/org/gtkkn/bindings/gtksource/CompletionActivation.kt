// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gtksource.GTK_SOURCE_COMPLETION_ACTIVATION_INTERACTIVE
import org.gtkkn.native.gtksource.GTK_SOURCE_COMPLETION_ACTIVATION_NONE
import org.gtkkn.native.gtksource.GTK_SOURCE_COMPLETION_ACTIVATION_USER_REQUESTED
import org.gtkkn.native.gtksource.GtkSourceCompletionActivation

public enum class CompletionActivation(
    public val nativeValue: GtkSourceCompletionActivation,
) {
    NONE(GTK_SOURCE_COMPLETION_ACTIVATION_NONE),
    INTERACTIVE(GTK_SOURCE_COMPLETION_ACTIVATION_INTERACTIVE),
    USER_REQUESTED(GTK_SOURCE_COMPLETION_ACTIVATION_USER_REQUESTED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceCompletionActivation): CompletionActivation =
            when (nativeValue) {
                GTK_SOURCE_COMPLETION_ACTIVATION_NONE -> NONE
                GTK_SOURCE_COMPLETION_ACTIVATION_INTERACTIVE -> INTERACTIVE
                GTK_SOURCE_COMPLETION_ACTIVATION_USER_REQUESTED -> USER_REQUESTED
                else -> error("invalid nativeValue")
            }
    }
}
