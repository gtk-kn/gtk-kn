// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gtk.GtkRecentManagerError
import org.gtkkn.native.gtk.gtk_recent_manager_error_quark
import kotlin.UInt

/**
 * Error codes for `GtkRecentManager` operations
 */
public enum class RecentManagerError(
    public val nativeValue: GtkRecentManagerError,
) {
    /**
     * the URI specified does not exists in
     *   the recently used resources list.
     */
    NOT_FOUND(GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_NOT_FOUND),

    /**
     * the URI specified is not valid.
     */
    INVALID_URI(GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_INVALID_URI),

    /**
     * the supplied string is not
     *   UTF-8 encoded.
     */
    INVALID_ENCODING(GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING),

    /**
     * no application has registered
     *   the specified item.
     */
    NOT_REGISTERED(GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED),

    /**
     * failure while reading the recently used
     *   resources file.
     */
    READ(GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_READ),

    /**
     * failure while writing the recently used
     *   resources file.
     */
    WRITE(GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_WRITE),

    /**
     * unspecified error.
     */
    UNKNOWN(GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_UNKNOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkRecentManagerError): RecentManagerError =
            when (nativeValue) {
                GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_NOT_FOUND -> NOT_FOUND
                GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_INVALID_URI -> INVALID_URI
                GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING -> INVALID_ENCODING
                GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED -> NOT_REGISTERED
                GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_READ -> READ
                GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_WRITE -> WRITE
                GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_UNKNOWN -> UNKNOWN
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = gtk_recent_manager_error_quark()

        public fun fromErrorOrNull(error: Error): RecentManagerError? =
            if (error.domain != quark()) {
                null
            } else {
                RecentManagerError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
