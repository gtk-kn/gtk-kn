// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFileChooserError
import org.gtkkn.native.gtk.gtk_file_chooser_error_get_type
import org.gtkkn.native.gtk.gtk_file_chooser_error_quark

/**
 * These identify the various errors that can occur while calling
 * `GtkFileChooser` functions.
 */
public enum class FileChooserError(public val nativeValue: GtkFileChooserError) {
    /**
     * Indicates that a file does not exist.
     */
    NONEXISTENT(GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_NONEXISTENT),

    /**
     * Indicates a malformed filename.
     */
    BAD_FILENAME(GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_BAD_FILENAME),

    /**
     * Indicates a duplicate path (e.g. when
     *  adding a bookmark).
     */
    ALREADY_EXISTS(GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS),

    /**
     * Indicates an incomplete hostname
     *  (e.g. "http://foo" without a slash after that).
     */
    INCOMPLETE_HOSTNAME(GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkFileChooserError): FileChooserError = when (nativeValue) {
            GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_NONEXISTENT -> NONEXISTENT
            GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_BAD_FILENAME -> BAD_FILENAME
            GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS -> ALREADY_EXISTS
            GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME -> INCOMPLETE_HOSTNAME
            else -> error("invalid nativeValue")
        }

        /**
         * Registers an error quark for `GtkFileChooser` errors.
         *
         * @return The error quark used for `GtkFileChooser` errors.
         */
        public fun quark(): Quark = gtk_file_chooser_error_quark()

        /**
         * Get the GType of FileChooserError
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_file_chooser_error_get_type()

        public fun fromErrorOrNull(error: Error): FileChooserError? = if (error.domain != quark()) {
            null
        } else {
            FileChooserError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
