// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitSnapshotError
import org.gtkkn.native.webkit.webkit_snapshot_error_get_type
import org.gtkkn.native.webkit.webkit_snapshot_error_quark

/**
 * Enum values used to denote errors happening when creating snapshots of #WebKitWebView
 */
public enum class SnapshotError(public val nativeValue: WebKitSnapshotError) {
    /**
     * An error occurred when creating a webpage snapshot.
     */
    CREATE(WebKitSnapshotError.WEBKIT_SNAPSHOT_ERROR_FAILED_TO_CREATE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitSnapshotError): SnapshotError = when (nativeValue) {
            WebKitSnapshotError.WEBKIT_SNAPSHOT_ERROR_FAILED_TO_CREATE -> CREATE
            else -> error("invalid nativeValue")
        }

        /**
         * Gets the quark for the domain of page snapshot errors.
         *
         * @return snapshot error domain.
         */
        public fun quark(): Quark = webkit_snapshot_error_quark()

        /**
         * Get the GType of SnapshotError
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_snapshot_error_get_type()

        public fun fromErrorOrNull(error: Error): SnapshotError? = if (error.domain != quark()) {
            null
        } else {
            SnapshotError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
