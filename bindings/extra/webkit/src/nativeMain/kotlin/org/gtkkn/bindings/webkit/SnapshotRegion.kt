// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitSnapshotRegion
import org.gtkkn.native.webkit.webkit_snapshot_region_get_type

/**
 * Enum values used to specify the region from which to get a #WebKitWebView
 * snapshot
 */
public enum class SnapshotRegion(public val nativeValue: WebKitSnapshotRegion) {
    /**
     * Specifies a snapshot only for the area that is
     * visible in the webview
     */
    VISIBLE(WebKitSnapshotRegion.WEBKIT_SNAPSHOT_REGION_VISIBLE),

    /**
     * A snapshot of the entire document.
     */
    FULL_DOCUMENT(WebKitSnapshotRegion.WEBKIT_SNAPSHOT_REGION_FULL_DOCUMENT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitSnapshotRegion): SnapshotRegion = when (nativeValue) {
            WebKitSnapshotRegion.WEBKIT_SNAPSHOT_REGION_VISIBLE -> VISIBLE
            WebKitSnapshotRegion.WEBKIT_SNAPSHOT_REGION_FULL_DOCUMENT -> FULL_DOCUMENT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SnapshotRegion
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_snapshot_region_get_type()
    }
}
