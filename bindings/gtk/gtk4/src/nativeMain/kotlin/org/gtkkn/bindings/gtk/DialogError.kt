// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkDialogError
import org.gtkkn.native.gtk.gtk_dialog_error_get_type
import org.gtkkn.native.gtk.gtk_dialog_error_quark

/**
 * Error codes in the `GTK_DIALOG_ERROR` domain that can be returned
 * by async dialog functions.
 * @since 4.10
 */
@GtkVersion4_10
public enum class DialogError(public val nativeValue: GtkDialogError) {
    /**
     * Generic error condition for when
     *   an operation fails and no more specific code is applicable
     */
    FAILED(GtkDialogError.GTK_DIALOG_ERROR_FAILED),

    /**
     * The async function call was cancelled
     *   via its `GCancellable`
     */
    CANCELLED(GtkDialogError.GTK_DIALOG_ERROR_CANCELLED),

    /**
     * The operation was cancelled
     *   by the user (via a Cancel or Close button)
     */
    DISMISSED(GtkDialogError.GTK_DIALOG_ERROR_DISMISSED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkDialogError): DialogError = when (nativeValue) {
            GtkDialogError.GTK_DIALOG_ERROR_FAILED -> FAILED
            GtkDialogError.GTK_DIALOG_ERROR_CANCELLED -> CANCELLED
            GtkDialogError.GTK_DIALOG_ERROR_DISMISSED -> DISMISSED
            else -> error("invalid nativeValue")
        }

        /**
         * Registers an error quark for an operation that requires a dialog if
         * necessary.
         *
         * @return the error quark
         */
        public fun quark(): Quark = gtk_dialog_error_quark()

        /**
         * Get the GType of DialogError
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_dialog_error_get_type()

        public fun fromErrorOrNull(error: Error): DialogError? = if (error.domain != quark()) {
            null
        } else {
            DialogError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
