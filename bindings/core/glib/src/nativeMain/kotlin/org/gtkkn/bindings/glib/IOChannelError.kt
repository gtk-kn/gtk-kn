// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GIOChannelError
import org.gtkkn.native.glib.GIOChannelError.G_IO_CHANNEL_ERROR_FAILED
import org.gtkkn.native.glib.GIOChannelError.G_IO_CHANNEL_ERROR_FBIG
import org.gtkkn.native.glib.GIOChannelError.G_IO_CHANNEL_ERROR_INVAL
import org.gtkkn.native.glib.GIOChannelError.G_IO_CHANNEL_ERROR_IO
import org.gtkkn.native.glib.GIOChannelError.G_IO_CHANNEL_ERROR_ISDIR
import org.gtkkn.native.glib.GIOChannelError.G_IO_CHANNEL_ERROR_NOSPC
import org.gtkkn.native.glib.GIOChannelError.G_IO_CHANNEL_ERROR_NXIO
import org.gtkkn.native.glib.GIOChannelError.G_IO_CHANNEL_ERROR_OVERFLOW
import org.gtkkn.native.glib.GIOChannelError.G_IO_CHANNEL_ERROR_PIPE
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by #GIOChannel operations.
 */
public enum class IOChannelError(
    public val nativeValue: GIOChannelError,
) {
    /**
     * File too large.
     */
    FBIG(G_IO_CHANNEL_ERROR_FBIG),

    /**
     * Invalid argument.
     */
    INVAL(G_IO_CHANNEL_ERROR_INVAL),

    /**
     * IO error.
     */
    IO(G_IO_CHANNEL_ERROR_IO),

    /**
     * File is a directory.
     */
    ISDIR(G_IO_CHANNEL_ERROR_ISDIR),

    /**
     * No space left on device.
     */
    NOSPC(G_IO_CHANNEL_ERROR_NOSPC),

    /**
     * No such device or address.
     */
    NXIO(G_IO_CHANNEL_ERROR_NXIO),

    /**
     * Value too large for defined datatype.
     */
    OVERFLOW(G_IO_CHANNEL_ERROR_OVERFLOW),

    /**
     * Broken pipe.
     */
    PIPE(G_IO_CHANNEL_ERROR_PIPE),

    /**
     * Some other error.
     */
    FAILED(G_IO_CHANNEL_ERROR_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GIOChannelError): IOChannelError =
            when (nativeValue) {
                G_IO_CHANNEL_ERROR_FBIG -> FBIG
                G_IO_CHANNEL_ERROR_INVAL -> INVAL
                G_IO_CHANNEL_ERROR_IO -> IO
                G_IO_CHANNEL_ERROR_ISDIR -> ISDIR
                G_IO_CHANNEL_ERROR_NOSPC -> NOSPC
                G_IO_CHANNEL_ERROR_NXIO -> NXIO
                G_IO_CHANNEL_ERROR_OVERFLOW -> OVERFLOW
                G_IO_CHANNEL_ERROR_PIPE -> PIPE
                G_IO_CHANNEL_ERROR_FAILED -> FAILED
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-io-channel-error-quark")

        public fun fromErrorOrNull(error: Error): IOChannelError? =
            if (error.domain != quark()) {
                null
            } else {
                IOChannelError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
