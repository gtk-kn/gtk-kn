// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GOutputStreamSpliceFlags
import org.gtkkn.native.gio.G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE
import org.gtkkn.native.gio.G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET
import org.gtkkn.native.gio.G_OUTPUT_STREAM_SPLICE_NONE

/**
 * GOutputStreamSpliceFlags determine how streams should be spliced.
 */
public class OutputStreamSpliceFlags(
    public val mask: GOutputStreamSpliceFlags,
) : Bitfield<OutputStreamSpliceFlags> {
    override infix fun or(other: OutputStreamSpliceFlags): OutputStreamSpliceFlags =
        OutputStreamSpliceFlags(
            mask or other.mask
        )

    public companion object {
        /**
         * Do not close either stream.
         */
        public val NONE: OutputStreamSpliceFlags =
            OutputStreamSpliceFlags(G_OUTPUT_STREAM_SPLICE_NONE)

        /**
         * Close the source stream after
         *     the splice.
         */
        public val CLOSE_SOURCE: OutputStreamSpliceFlags =
            OutputStreamSpliceFlags(G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE)

        /**
         * Close the target stream after
         *     the splice.
         */
        public val CLOSE_TARGET: OutputStreamSpliceFlags =
            OutputStreamSpliceFlags(G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET)
    }
}
