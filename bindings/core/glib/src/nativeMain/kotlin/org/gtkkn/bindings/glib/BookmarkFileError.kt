// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GBookmarkFileError
import org.gtkkn.native.glib.GBookmarkFileError.G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED
import org.gtkkn.native.glib.GBookmarkFileError.G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND
import org.gtkkn.native.glib.GBookmarkFileError.G_BOOKMARK_FILE_ERROR_INVALID_URI
import org.gtkkn.native.glib.GBookmarkFileError.G_BOOKMARK_FILE_ERROR_INVALID_VALUE
import org.gtkkn.native.glib.GBookmarkFileError.G_BOOKMARK_FILE_ERROR_READ
import org.gtkkn.native.glib.GBookmarkFileError.G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING
import org.gtkkn.native.glib.GBookmarkFileError.G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND
import org.gtkkn.native.glib.GBookmarkFileError.G_BOOKMARK_FILE_ERROR_WRITE
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by bookmark file parsing.
 */
public enum class BookmarkFileError(
    public val nativeValue: GBookmarkFileError,
) {
    /**
     * URI was ill-formed
     */
    INVALID_URI(G_BOOKMARK_FILE_ERROR_INVALID_URI),

    /**
     * a requested field was not found
     */
    INVALID_VALUE(G_BOOKMARK_FILE_ERROR_INVALID_VALUE),

    /**
     * a requested application did
     *     not register a bookmark
     */
    APP_NOT_REGISTERED(G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED),

    /**
     * a requested URI was not found
     */
    URI_NOT_FOUND(G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND),

    /**
     * document was ill formed
     */
    READ(G_BOOKMARK_FILE_ERROR_READ),

    /**
     * the text being parsed was
     *     in an unknown encoding
     */
    UNKNOWN_ENCODING(G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING),

    /**
     * an error occurred while writing
     */
    WRITE(G_BOOKMARK_FILE_ERROR_WRITE),

    /**
     * requested file was not found
     */
    FILE_NOT_FOUND(G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GBookmarkFileError): BookmarkFileError =
            when (nativeValue) {
                G_BOOKMARK_FILE_ERROR_INVALID_URI -> INVALID_URI
                G_BOOKMARK_FILE_ERROR_INVALID_VALUE -> INVALID_VALUE
                G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED -> APP_NOT_REGISTERED
                G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND -> URI_NOT_FOUND
                G_BOOKMARK_FILE_ERROR_READ -> READ
                G_BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING -> UNKNOWN_ENCODING
                G_BOOKMARK_FILE_ERROR_WRITE -> WRITE
                G_BOOKMARK_FILE_ERROR_FILE_NOT_FOUND -> FILE_NOT_FOUND
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-bookmark-file-error-quark")

        public fun fromErrorOrNull(error: Error): BookmarkFileError? =
            if (error.domain != quark()) {
                null
            } else {
                BookmarkFileError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
