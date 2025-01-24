// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPrintStatus
import org.gtkkn.native.gtk.gtk_print_status_get_type

/**
 * The status gives a rough indication of the completion of a running
 * print operation.
 */
public enum class PrintStatus(public val nativeValue: GtkPrintStatus) {
    /**
     * The printing has not started yet; this
     *   status is set initially, and while the print dialog is shown.
     */
    INITIAL(GtkPrintStatus.GTK_PRINT_STATUS_INITIAL),

    /**
     * This status is set while the begin-print
     *   signal is emitted and during pagination.
     */
    PREPARING(GtkPrintStatus.GTK_PRINT_STATUS_PREPARING),

    /**
     * This status is set while the
     *   pages are being rendered.
     */
    GENERATING_DATA(GtkPrintStatus.GTK_PRINT_STATUS_GENERATING_DATA),

    /**
     * The print job is being sent off to the
     *   printer.
     */
    SENDING_DATA(GtkPrintStatus.GTK_PRINT_STATUS_SENDING_DATA),

    /**
     * The print job has been sent to the printer,
     *   but is not printed for some reason, e.g. the printer may be stopped.
     */
    PENDING(GtkPrintStatus.GTK_PRINT_STATUS_PENDING),

    /**
     * Some problem has occurred during
     *   printing, e.g. a paper jam.
     */
    PENDING_ISSUE(GtkPrintStatus.GTK_PRINT_STATUS_PENDING_ISSUE),

    /**
     * The printer is processing the print job.
     */
    PRINTING(GtkPrintStatus.GTK_PRINT_STATUS_PRINTING),

    /**
     * The printing has been completed successfully.
     */
    FINISHED(GtkPrintStatus.GTK_PRINT_STATUS_FINISHED),

    /**
     * The printing has been aborted.
     */
    FINISHED_ABORTED(GtkPrintStatus.GTK_PRINT_STATUS_FINISHED_ABORTED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintStatus): PrintStatus = when (nativeValue) {
            GtkPrintStatus.GTK_PRINT_STATUS_INITIAL -> INITIAL
            GtkPrintStatus.GTK_PRINT_STATUS_PREPARING -> PREPARING
            GtkPrintStatus.GTK_PRINT_STATUS_GENERATING_DATA -> GENERATING_DATA
            GtkPrintStatus.GTK_PRINT_STATUS_SENDING_DATA -> SENDING_DATA
            GtkPrintStatus.GTK_PRINT_STATUS_PENDING -> PENDING
            GtkPrintStatus.GTK_PRINT_STATUS_PENDING_ISSUE -> PENDING_ISSUE
            GtkPrintStatus.GTK_PRINT_STATUS_PRINTING -> PRINTING
            GtkPrintStatus.GTK_PRINT_STATUS_FINISHED -> FINISHED
            GtkPrintStatus.GTK_PRINT_STATUS_FINISHED_ABORTED -> FINISHED_ABORTED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PrintStatus
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_status_get_type()
    }
}
