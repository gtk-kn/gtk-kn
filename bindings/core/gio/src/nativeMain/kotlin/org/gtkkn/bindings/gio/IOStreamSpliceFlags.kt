// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GIOStreamSpliceFlags
import org.gtkkn.native.gio.G_IO_STREAM_SPLICE_CLOSE_STREAM1
import org.gtkkn.native.gio.G_IO_STREAM_SPLICE_CLOSE_STREAM2
import org.gtkkn.native.gio.G_IO_STREAM_SPLICE_NONE
import org.gtkkn.native.gio.G_IO_STREAM_SPLICE_WAIT_FOR_BOTH

/**
 * GIOStreamSpliceFlags determine how streams should be spliced.
 * @since 2.28
 */
public class IOStreamSpliceFlags(
    public val mask: GIOStreamSpliceFlags,
) : Bitfield<IOStreamSpliceFlags> {
    override infix fun or(other: IOStreamSpliceFlags): IOStreamSpliceFlags = IOStreamSpliceFlags(mask or other.mask)

    public companion object {
        /**
         * Do not close either stream.
         */
        public val NONE: IOStreamSpliceFlags = IOStreamSpliceFlags(G_IO_STREAM_SPLICE_NONE)

        /**
         * Close the first stream after
         *     the splice.
         */
        public val CLOSE_STREAM1: IOStreamSpliceFlags =
            IOStreamSpliceFlags(G_IO_STREAM_SPLICE_CLOSE_STREAM1)

        /**
         * Close the second stream after
         *     the splice.
         */
        public val CLOSE_STREAM2: IOStreamSpliceFlags =
            IOStreamSpliceFlags(G_IO_STREAM_SPLICE_CLOSE_STREAM2)

        /**
         * Wait for both splice operations to finish
         *     before calling the callback.
         */
        public val WAIT_FOR_BOTH: IOStreamSpliceFlags =
            IOStreamSpliceFlags(G_IO_STREAM_SPLICE_WAIT_FOR_BOTH)
    }
}
