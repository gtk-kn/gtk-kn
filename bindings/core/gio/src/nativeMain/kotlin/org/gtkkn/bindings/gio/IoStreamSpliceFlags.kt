// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GIOStreamSpliceFlags
import org.gtkkn.native.gio.G_IO_STREAM_SPLICE_CLOSE_STREAM1
import org.gtkkn.native.gio.G_IO_STREAM_SPLICE_CLOSE_STREAM2
import org.gtkkn.native.gio.G_IO_STREAM_SPLICE_NONE
import org.gtkkn.native.gio.G_IO_STREAM_SPLICE_WAIT_FOR_BOTH
import org.gtkkn.native.gio.g_io_stream_splice_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * GIOStreamSpliceFlags determine how streams should be spliced.
 * @since 2.28
 */
public class IoStreamSpliceFlags(public val mask: GIOStreamSpliceFlags) : Bitfield<IoStreamSpliceFlags> {
    override infix fun or(other: IoStreamSpliceFlags): IoStreamSpliceFlags = IoStreamSpliceFlags(mask or other.mask)

    @GioVersion2_28
    public companion object {
        /**
         * Do not close either stream.
         */
        public val NONE: IoStreamSpliceFlags = IoStreamSpliceFlags(G_IO_STREAM_SPLICE_NONE)

        /**
         * Close the first stream after
         *     the splice.
         */
        public val CLOSE_STREAM1: IoStreamSpliceFlags =
            IoStreamSpliceFlags(G_IO_STREAM_SPLICE_CLOSE_STREAM1)

        /**
         * Close the second stream after
         *     the splice.
         */
        public val CLOSE_STREAM2: IoStreamSpliceFlags =
            IoStreamSpliceFlags(G_IO_STREAM_SPLICE_CLOSE_STREAM2)

        /**
         * Wait for both splice operations to finish
         *     before calling the callback.
         */
        public val WAIT_FOR_BOTH: IoStreamSpliceFlags =
            IoStreamSpliceFlags(G_IO_STREAM_SPLICE_WAIT_FOR_BOTH)

        /**
         * Get the GType of IOStreamSpliceFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_io_stream_splice_flags_get_type()
    }
}
