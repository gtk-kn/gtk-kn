// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPrintOperationResult
import org.gtkkn.native.gtk.GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_APPLY
import org.gtkkn.native.gtk.GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_CANCEL
import org.gtkkn.native.gtk.GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_ERROR
import org.gtkkn.native.gtk.GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_IN_PROGRESS

/**
 * The result of a print operation.
 *
 * A value of this type is returned by [method@Gtk.PrintOperation.run].
 */
public enum class PrintOperationResult(
    public val nativeValue: GtkPrintOperationResult,
) {
    /**
     * An error has occurred.
     */
    ERROR(GTK_PRINT_OPERATION_RESULT_ERROR),

    /**
     * The print settings should be stored.
     */
    APPLY(GTK_PRINT_OPERATION_RESULT_APPLY),

    /**
     * The print operation has been canceled,
     *   the print settings should not be stored.
     */
    CANCEL(GTK_PRINT_OPERATION_RESULT_CANCEL),

    /**
     * The print operation is not complete
     *   yet. This value will only be returned when running asynchronously.
     */
    IN_PROGRESS(GTK_PRINT_OPERATION_RESULT_IN_PROGRESS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintOperationResult): PrintOperationResult =
            when (nativeValue) {
                GTK_PRINT_OPERATION_RESULT_ERROR -> ERROR
                GTK_PRINT_OPERATION_RESULT_APPLY -> APPLY
                GTK_PRINT_OPERATION_RESULT_CANCEL -> CANCEL
                GTK_PRINT_OPERATION_RESULT_IN_PROGRESS -> IN_PROGRESS
                else -> error("invalid nativeValue")
            }
    }
}
