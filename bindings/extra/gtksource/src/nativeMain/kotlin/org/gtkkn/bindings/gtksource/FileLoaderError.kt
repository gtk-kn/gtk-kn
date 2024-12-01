// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gtksource.GtkSourceFileLoaderError
import org.gtkkn.native.gtksource.gtk_source_file_loader_error_quark

/**
 * An error code used with the %GTK_SOURCE_FILE_LOADER_ERROR domain.
 */
public enum class FileLoaderError(
    public val nativeValue: GtkSourceFileLoaderError,
) {
    /**
     * The file is too big.
     */
    TOO_BIG(GtkSourceFileLoaderError.GTK_SOURCE_FILE_LOADER_ERROR_TOO_BIG),

    /**
     * It is not
     * possible to detect the encoding automatically.
     */
    ENCODING_AUTO_DETECTION_FAILED(
        GtkSourceFileLoaderError.GTK_SOURCE_FILE_LOADER_ERROR_ENCODING_AUTO_DETECTION_FAILED
    ),

    /**
     * There was an encoding
     * conversion error and it was needed to use a fallback character.
     */
    CONVERSION_FALLBACK(GtkSourceFileLoaderError.GTK_SOURCE_FILE_LOADER_ERROR_CONVERSION_FALLBACK),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceFileLoaderError): FileLoaderError =
            when (nativeValue) {
                GtkSourceFileLoaderError.GTK_SOURCE_FILE_LOADER_ERROR_TOO_BIG -> TOO_BIG
                GtkSourceFileLoaderError.GTK_SOURCE_FILE_LOADER_ERROR_ENCODING_AUTO_DETECTION_FAILED -> ENCODING_AUTO_DETECTION_FAILED
                GtkSourceFileLoaderError.GTK_SOURCE_FILE_LOADER_ERROR_CONVERSION_FALLBACK -> CONVERSION_FALLBACK
                else -> error("invalid nativeValue")
            }

        public fun quark(): Quark = gtk_source_file_loader_error_quark()

        public fun fromErrorOrNull(error: Error): FileLoaderError? =
            if (error.domain != quark()) {
                null
            } else {
                FileLoaderError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
