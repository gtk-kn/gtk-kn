// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.webkit.WebKitSnapshotError
import org.gtkkn.native.webkit.webkit_snapshot_error_quark

/**
 * Enum values used to denote errors happening when creating snapshots of #WebKitWebView
 */
public enum class SnapshotError(
    public val nativeValue: WebKitSnapshotError,
) {
    /**
     * An error occurred when creating a webpage snapshot.
     */
    CREATE(WebKitSnapshotError.WEBKIT_SNAPSHOT_ERROR_FAILED_TO_CREATE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitSnapshotError): SnapshotError =
            when (nativeValue) {
                WebKitSnapshotError.WEBKIT_SNAPSHOT_ERROR_FAILED_TO_CREATE -> CREATE
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the quark for the domain of page snapshot errors.
         *
         * @return snapshot error domain.
         */
        public fun quark(): Quark = webkit_snapshot_error_quark()

        public fun fromErrorOrNull(error: Error): SnapshotError? =
            if (error.domain != quark()) {
                null
            } else {
                SnapshotError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
