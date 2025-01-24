// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceFileSaverError
import org.gtkkn.native.gtksource.gtk_source_file_saver_error_get_type
import org.gtkkn.native.gtksource.gtk_source_file_saver_error_quark

/**
 * An error code used with the %GTK_SOURCE_FILE_SAVER_ERROR domain.
 */
public enum class FileSaverError(public val nativeValue: GtkSourceFileSaverError) {
    /**
     * The buffer contains invalid
     *   characters.
     */
    INVALID_CHARS(GtkSourceFileSaverError.GTK_SOURCE_FILE_SAVER_ERROR_INVALID_CHARS),

    /**
     * The file is externally
     *   modified.
     */
    EXTERNALLY_MODIFIED(GtkSourceFileSaverError.GTK_SOURCE_FILE_SAVER_ERROR_EXTERNALLY_MODIFIED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceFileSaverError): FileSaverError = when (nativeValue) {
            GtkSourceFileSaverError.GTK_SOURCE_FILE_SAVER_ERROR_INVALID_CHARS -> INVALID_CHARS
            GtkSourceFileSaverError.GTK_SOURCE_FILE_SAVER_ERROR_EXTERNALLY_MODIFIED -> EXTERNALLY_MODIFIED
            else -> error("invalid nativeValue")
        }

        public fun quark(): Quark = gtk_source_file_saver_error_quark()

        /**
         * Get the GType of FileSaverError
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_file_saver_error_get_type()

        public fun fromErrorOrNull(error: Error): FileSaverError? = if (error.domain != quark()) {
            null
        } else {
            FileSaverError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
