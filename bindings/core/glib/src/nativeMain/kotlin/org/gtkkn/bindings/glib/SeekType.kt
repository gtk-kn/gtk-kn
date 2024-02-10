// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GSeekType
import org.gtkkn.native.glib.GSeekType.G_SEEK_CUR
import org.gtkkn.native.glib.GSeekType.G_SEEK_END
import org.gtkkn.native.glib.GSeekType.G_SEEK_SET

/**
 * An enumeration specifying the base position for a
 * g_io_channel_seek_position() operation.
 */
public enum class SeekType(
    public val nativeValue: GSeekType,
) {
    /**
     * the current position in the file.
     */
    CUR(G_SEEK_CUR),

    /**
     * the start of the file.
     */
    SET(G_SEEK_SET),

    /**
     * the end of the file.
     */
    END(G_SEEK_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSeekType): SeekType =
            when (nativeValue) {
                G_SEEK_CUR -> CUR
                G_SEEK_SET -> SET
                G_SEEK_END -> END
                else -> error("invalid nativeValue")
            }
    }
}
