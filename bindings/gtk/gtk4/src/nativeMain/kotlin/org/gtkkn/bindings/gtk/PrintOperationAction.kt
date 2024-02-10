// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPrintOperationAction
import org.gtkkn.native.gtk.GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_EXPORT
import org.gtkkn.native.gtk.GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PREVIEW
import org.gtkkn.native.gtk.GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT
import org.gtkkn.native.gtk.GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG

/**
 * Determines what action the print operation should perform.
 *
 * A parameter of this typs is passed to [method@Gtk.PrintOperation.run].
 */
public enum class PrintOperationAction(
    public val nativeValue: GtkPrintOperationAction,
) {
    /**
     * Show the print dialog.
     */
    PRINT_DIALOG(GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG),

    /**
     * Start to print without showing
     *   the print dialog, based on the current print settings.
     */
    PRINT(GTK_PRINT_OPERATION_ACTION_PRINT),

    /**
     * Show the print preview.
     */
    PREVIEW(GTK_PRINT_OPERATION_ACTION_PREVIEW),

    /**
     * Export to a file. This requires
     *   the export-filename property to be set.
     */
    EXPORT(GTK_PRINT_OPERATION_ACTION_EXPORT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintOperationAction): PrintOperationAction =
            when (nativeValue) {
                GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG -> PRINT_DIALOG
                GTK_PRINT_OPERATION_ACTION_PRINT -> PRINT
                GTK_PRINT_OPERATION_ACTION_PREVIEW -> PREVIEW
                GTK_PRINT_OPERATION_ACTION_EXPORT -> EXPORT
                else -> error("invalid nativeValue")
            }
    }
}
