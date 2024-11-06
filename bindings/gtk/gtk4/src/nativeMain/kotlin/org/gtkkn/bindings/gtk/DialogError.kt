// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.native.gtk.GtkDialogError
import org.gtkkn.native.gtk.GtkDialogError.GTK_DIALOG_ERROR_CANCELLED
import org.gtkkn.native.gtk.GtkDialogError.GTK_DIALOG_ERROR_DISMISSED
import org.gtkkn.native.gtk.GtkDialogError.GTK_DIALOG_ERROR_FAILED
import org.gtkkn.native.gtk.gtk_dialog_error_quark
import kotlin.UInt

/**
 * Error codes in the `GTK_DIALOG_ERROR` domain that can be returned
 * by async dialog functions.
 * @since 4.10
 */
@GtkVersion4_10
public enum class DialogError(
    public val nativeValue: GtkDialogError,
) {
    /**
     * Generic error condition for when
     *   an operation fails and no more specific code is applicable
     */
    FAILED(GTK_DIALOG_ERROR_FAILED),

    /**
     * The async function call was cancelled
     *   via its `GCancellable`
     */
    CANCELLED(GTK_DIALOG_ERROR_CANCELLED),

    /**
     * The operation was cancelled
     *   by the user (via a Cancel or Close button)
     */
    DISMISSED(GTK_DIALOG_ERROR_DISMISSED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkDialogError): DialogError =
            when (nativeValue) {
                GTK_DIALOG_ERROR_FAILED -> FAILED
                GTK_DIALOG_ERROR_CANCELLED -> CANCELLED
                GTK_DIALOG_ERROR_DISMISSED -> DISMISSED
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = gtk_dialog_error_quark()

        public fun fromErrorOrNull(error: Error): DialogError? =
            if (error.domain != quark()) {
                null
            } else {
                DialogError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
