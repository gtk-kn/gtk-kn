// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GKeyFileError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by key file parsing.
 */
public enum class KeyFileError(public val nativeValue: GKeyFileError) {
    /**
     * the text being parsed was in
     *   an unknown encoding
     */
    UNKNOWN_ENCODING(GKeyFileError.G_KEY_FILE_ERROR_UNKNOWN_ENCODING),

    /**
     * document was ill-formed
     */
    PARSE(GKeyFileError.G_KEY_FILE_ERROR_PARSE),

    /**
     * the file was not found
     */
    NOT_FOUND(GKeyFileError.G_KEY_FILE_ERROR_NOT_FOUND),

    /**
     * a requested key was not found
     */
    KEY_NOT_FOUND(GKeyFileError.G_KEY_FILE_ERROR_KEY_NOT_FOUND),

    /**
     * a requested group was not found
     */
    GROUP_NOT_FOUND(GKeyFileError.G_KEY_FILE_ERROR_GROUP_NOT_FOUND),

    /**
     * a value could not be parsed
     */
    INVALID_VALUE(GKeyFileError.G_KEY_FILE_ERROR_INVALID_VALUE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GKeyFileError): KeyFileError = when (nativeValue) {
            GKeyFileError.G_KEY_FILE_ERROR_UNKNOWN_ENCODING -> UNKNOWN_ENCODING
            GKeyFileError.G_KEY_FILE_ERROR_PARSE -> PARSE
            GKeyFileError.G_KEY_FILE_ERROR_NOT_FOUND -> NOT_FOUND
            GKeyFileError.G_KEY_FILE_ERROR_KEY_NOT_FOUND -> KEY_NOT_FOUND
            GKeyFileError.G_KEY_FILE_ERROR_GROUP_NOT_FOUND -> GROUP_NOT_FOUND
            GKeyFileError.G_KEY_FILE_ERROR_INVALID_VALUE -> INVALID_VALUE
            else -> error("invalid nativeValue")
        }

        public fun quark(): UInt = g_quark_from_string("g-key-file-error-quark")

        public fun fromErrorOrNull(error: Error): KeyFileError? = if (error.domain != quark()) {
            null
        } else {
            KeyFileError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
