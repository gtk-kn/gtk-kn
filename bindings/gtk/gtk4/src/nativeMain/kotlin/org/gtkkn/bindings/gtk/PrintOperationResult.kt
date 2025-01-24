// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPrintOperationResult
import org.gtkkn.native.gtk.gtk_print_operation_result_get_type

/**
 * The result of a print operation.
 *
 * A value of this type is returned by [method@Gtk.PrintOperation.run].
 */
public enum class PrintOperationResult(public val nativeValue: GtkPrintOperationResult) {
    /**
     * An error has occurred.
     */
    ERROR(GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_ERROR),

    /**
     * The print settings should be stored.
     */
    APPLY(GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_APPLY),

    /**
     * The print operation has been canceled,
     *   the print settings should not be stored.
     */
    CANCEL(GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_CANCEL),

    /**
     * The print operation is not complete
     *   yet. This value will only be returned when running asynchronously.
     */
    IN_PROGRESS(GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_IN_PROGRESS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintOperationResult): PrintOperationResult = when (nativeValue) {
            GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_ERROR -> ERROR
            GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_APPLY -> APPLY
            GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_CANCEL -> CANCEL
            GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_IN_PROGRESS -> IN_PROGRESS
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PrintOperationResult
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_operation_result_get_type()
    }
}
