// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GIOChannelError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by #GIOChannel operations.
 */
public enum class IoChannelError(public val nativeValue: GIOChannelError) {
    /**
     * File too large.
     */
    FBIG(GIOChannelError.G_IO_CHANNEL_ERROR_FBIG),

    /**
     * Invalid argument.
     */
    INVAL(GIOChannelError.G_IO_CHANNEL_ERROR_INVAL),

    /**
     * IO error.
     */
    IO(GIOChannelError.G_IO_CHANNEL_ERROR_IO),

    /**
     * File is a directory.
     */
    ISDIR(GIOChannelError.G_IO_CHANNEL_ERROR_ISDIR),

    /**
     * No space left on device.
     */
    NOSPC(GIOChannelError.G_IO_CHANNEL_ERROR_NOSPC),

    /**
     * No such device or address.
     */
    NXIO(GIOChannelError.G_IO_CHANNEL_ERROR_NXIO),

    /**
     * Value too large for defined datatype.
     */
    OVERFLOW(GIOChannelError.G_IO_CHANNEL_ERROR_OVERFLOW),

    /**
     * Broken pipe.
     */
    PIPE(GIOChannelError.G_IO_CHANNEL_ERROR_PIPE),

    /**
     * Some other error.
     */
    FAILED(GIOChannelError.G_IO_CHANNEL_ERROR_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GIOChannelError): IoChannelError = when (nativeValue) {
            GIOChannelError.G_IO_CHANNEL_ERROR_FBIG -> FBIG
            GIOChannelError.G_IO_CHANNEL_ERROR_INVAL -> INVAL
            GIOChannelError.G_IO_CHANNEL_ERROR_IO -> IO
            GIOChannelError.G_IO_CHANNEL_ERROR_ISDIR -> ISDIR
            GIOChannelError.G_IO_CHANNEL_ERROR_NOSPC -> NOSPC
            GIOChannelError.G_IO_CHANNEL_ERROR_NXIO -> NXIO
            GIOChannelError.G_IO_CHANNEL_ERROR_OVERFLOW -> OVERFLOW
            GIOChannelError.G_IO_CHANNEL_ERROR_PIPE -> PIPE
            GIOChannelError.G_IO_CHANNEL_ERROR_FAILED -> FAILED
            else -> error("invalid nativeValue")
        }

        public fun quark(): UInt = g_quark_from_string("g-io-channel-error-quark")

        public fun fromErrorOrNull(error: Error): IoChannelError? = if (error.domain != quark()) {
            null
        } else {
            IoChannelError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
