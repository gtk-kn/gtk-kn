// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPrintOperationAction
import org.gtkkn.native.gtk.gtk_print_operation_action_get_type

/**
 * Determines what action the print operation should perform.
 *
 * A parameter of this typs is passed to [method@Gtk.PrintOperation.run].
 */
public enum class PrintOperationAction(public val nativeValue: GtkPrintOperationAction) {
    /**
     * Show the print dialog.
     */
    PRINT_DIALOG(GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG),

    /**
     * Start to print without showing
     *   the print dialog, based on the current print settings.
     */
    PRINT(GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT),

    /**
     * Show the print preview.
     */
    PREVIEW(GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PREVIEW),

    /**
     * Export to a file. This requires
     *   the export-filename property to be set.
     */
    EXPORT(GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_EXPORT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintOperationAction): PrintOperationAction = when (nativeValue) {
            GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG -> PRINT_DIALOG
            GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT -> PRINT
            GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PREVIEW -> PREVIEW
            GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_EXPORT -> EXPORT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PrintOperationAction
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_operation_action_get_type()
    }
}
