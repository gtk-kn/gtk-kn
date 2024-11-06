// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_80
import org.gtkkn.native.glib.GUnixPipeEnd
import org.gtkkn.native.glib.GUnixPipeEnd.G_UNIX_PIPE_END_READ
import org.gtkkn.native.glib.GUnixPipeEnd.G_UNIX_PIPE_END_WRITE

/**
 * Mnemonic constants for the ends of a Unix pipe.
 * @since 2.80
 */
@GLibVersion2_80
public enum class UnixPipeEnd(
    public val nativeValue: GUnixPipeEnd,
) {
    /**
     * The readable file descriptor 0
     */
    READ(G_UNIX_PIPE_END_READ),

    /**
     * The writable file descriptor 1
     */
    WRITE(G_UNIX_PIPE_END_WRITE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GUnixPipeEnd): UnixPipeEnd =
            when (nativeValue) {
                G_UNIX_PIPE_END_READ -> READ
                G_UNIX_PIPE_END_WRITE -> WRITE
                else -> error("invalid nativeValue")
            }
    }
}
