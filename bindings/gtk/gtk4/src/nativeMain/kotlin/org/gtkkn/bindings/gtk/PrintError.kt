// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gtk.GtkPrintError
import org.gtkkn.native.gtk.GtkPrintError.GTK_PRINT_ERROR_GENERAL
import org.gtkkn.native.gtk.GtkPrintError.GTK_PRINT_ERROR_INTERNAL_ERROR
import org.gtkkn.native.gtk.GtkPrintError.GTK_PRINT_ERROR_INVALID_FILE
import org.gtkkn.native.gtk.GtkPrintError.GTK_PRINT_ERROR_NOMEM
import org.gtkkn.native.gtk.gtk_print_error_quark
import kotlin.UInt

/**
 * Error codes that identify various errors that can occur while
 * using the GTK printing support.
 */
public enum class PrintError(
    public val nativeValue: GtkPrintError,
) {
    /**
     * An unspecified error occurred.
     */
    GENERAL(GTK_PRINT_ERROR_GENERAL),

    /**
     * An internal error occurred.
     */
    INTERNAL_ERROR(GTK_PRINT_ERROR_INTERNAL_ERROR),

    /**
     * A memory allocation failed.
     */
    NOMEM(GTK_PRINT_ERROR_NOMEM),

    /**
     * An error occurred while loading a page setup
     *   or paper size from a key file.
     */
    INVALID_FILE(GTK_PRINT_ERROR_INVALID_FILE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintError): PrintError =
            when (nativeValue) {
                GTK_PRINT_ERROR_GENERAL -> GENERAL
                GTK_PRINT_ERROR_INTERNAL_ERROR -> INTERNAL_ERROR
                GTK_PRINT_ERROR_NOMEM -> NOMEM
                GTK_PRINT_ERROR_INVALID_FILE -> INVALID_FILE
                else -> error("invalid nativeValue")
            }

        /**
         * Registers an error quark for `GtkPrintOperation` if necessary.
         *
         * @return The error quark used for `GtkPrintOperation` errors.
         */
        public fun quark(): UInt = gtk_print_error_quark()

        public fun fromErrorOrNull(error: Error): PrintError? =
            if (error.domain != quark()) {
                null
            } else {
                PrintError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
