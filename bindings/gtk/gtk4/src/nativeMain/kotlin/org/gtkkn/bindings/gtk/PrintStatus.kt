// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPrintStatus
import org.gtkkn.native.gtk.GtkPrintStatus.GTK_PRINT_STATUS_FINISHED
import org.gtkkn.native.gtk.GtkPrintStatus.GTK_PRINT_STATUS_FINISHED_ABORTED
import org.gtkkn.native.gtk.GtkPrintStatus.GTK_PRINT_STATUS_GENERATING_DATA
import org.gtkkn.native.gtk.GtkPrintStatus.GTK_PRINT_STATUS_INITIAL
import org.gtkkn.native.gtk.GtkPrintStatus.GTK_PRINT_STATUS_PENDING
import org.gtkkn.native.gtk.GtkPrintStatus.GTK_PRINT_STATUS_PENDING_ISSUE
import org.gtkkn.native.gtk.GtkPrintStatus.GTK_PRINT_STATUS_PREPARING
import org.gtkkn.native.gtk.GtkPrintStatus.GTK_PRINT_STATUS_PRINTING
import org.gtkkn.native.gtk.GtkPrintStatus.GTK_PRINT_STATUS_SENDING_DATA

/**
 * The status gives a rough indication of the completion of a running
 * print operation.
 */
public enum class PrintStatus(
    public val nativeValue: GtkPrintStatus,
) {
    /**
     * The printing has not started yet; this
     *   status is set initially, and while the print dialog is shown.
     */
    INITIAL(GTK_PRINT_STATUS_INITIAL),

    /**
     * This status is set while the begin-print
     *   signal is emitted and during pagination.
     */
    PREPARING(GTK_PRINT_STATUS_PREPARING),

    /**
     * This status is set while the
     *   pages are being rendered.
     */
    GENERATING_DATA(GTK_PRINT_STATUS_GENERATING_DATA),

    /**
     * The print job is being sent off to the
     *   printer.
     */
    SENDING_DATA(GTK_PRINT_STATUS_SENDING_DATA),

    /**
     * The print job has been sent to the printer,
     *   but is not printed for some reason, e.g. the printer may be stopped.
     */
    PENDING(GTK_PRINT_STATUS_PENDING),

    /**
     * Some problem has occurred during
     *   printing, e.g. a paper jam.
     */
    PENDING_ISSUE(GTK_PRINT_STATUS_PENDING_ISSUE),

    /**
     * The printer is processing the print job.
     */
    PRINTING(GTK_PRINT_STATUS_PRINTING),

    /**
     * The printing has been completed successfully.
     */
    FINISHED(GTK_PRINT_STATUS_FINISHED),

    /**
     * The printing has been aborted.
     */
    FINISHED_ABORTED(GTK_PRINT_STATUS_FINISHED_ABORTED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintStatus): PrintStatus =
            when (nativeValue) {
                GTK_PRINT_STATUS_INITIAL -> INITIAL
                GTK_PRINT_STATUS_PREPARING -> PREPARING
                GTK_PRINT_STATUS_GENERATING_DATA -> GENERATING_DATA
                GTK_PRINT_STATUS_SENDING_DATA -> SENDING_DATA
                GTK_PRINT_STATUS_PENDING -> PENDING
                GTK_PRINT_STATUS_PENDING_ISSUE -> PENDING_ISSUE
                GTK_PRINT_STATUS_PRINTING -> PRINTING
                GTK_PRINT_STATUS_FINISHED -> FINISHED
                GTK_PRINT_STATUS_FINISHED_ABORTED -> FINISHED_ABORTED
                else -> error("invalid nativeValue")
            }
    }
}
