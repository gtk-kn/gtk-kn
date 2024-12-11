// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WEBKIT_SNAPSHOT_OPTIONS_INCLUDE_SELECTION_HIGHLIGHTING
import org.gtkkn.native.webkit.WEBKIT_SNAPSHOT_OPTIONS_NONE
import org.gtkkn.native.webkit.WEBKIT_SNAPSHOT_OPTIONS_TRANSPARENT_BACKGROUND
import org.gtkkn.native.webkit.WebKitSnapshotOptions
import org.gtkkn.native.webkit.webkit_snapshot_options_get_type

/**
 * Enum values used to specify options when taking a snapshot
 * from a #WebKitWebView.
 */
public class SnapshotOptions(public val mask: WebKitSnapshotOptions) : Bitfield<SnapshotOptions> {
    override infix fun or(other: SnapshotOptions): SnapshotOptions = SnapshotOptions(mask or other.mask)

    public companion object {
        /**
         * Do not include any special options.
         */
        public val NONE: SnapshotOptions = SnapshotOptions(WEBKIT_SNAPSHOT_OPTIONS_NONE)

        /**
         * Whether to include in the
         * snapshot the highlight of the selected content.
         */
        public val INCLUDE_SELECTION_HIGHLIGHTING: SnapshotOptions =
            SnapshotOptions(WEBKIT_SNAPSHOT_OPTIONS_INCLUDE_SELECTION_HIGHLIGHTING)

        /**
         * Do not fill the background with white before
         * rendering the snapshot. Since 2.8
         */
        public val TRANSPARENT_BACKGROUND: SnapshotOptions =
            SnapshotOptions(WEBKIT_SNAPSHOT_OPTIONS_TRANSPARENT_BACKGROUND)

        /**
         * Get the GType of SnapshotOptions
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_snapshot_options_get_type()
    }
}
