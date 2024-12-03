// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GIOError

/**
 * #GIOError is only used by the deprecated functions
 * g_io_channel_read(), g_io_channel_write(), and g_io_channel_seek().
 */
public enum class IOError(public val nativeValue: GIOError) {
    /**
     * no error
     */
    NONE(GIOError.G_IO_ERROR_NONE),

    /**
     * an EAGAIN error occurred
     */
    AGAIN(GIOError.G_IO_ERROR_AGAIN),

    /**
     * an EINVAL error occurred
     */
    INVAL(GIOError.G_IO_ERROR_INVAL),

    /**
     * another error occurred
     */
    UNKNOWN(GIOError.G_IO_ERROR_UNKNOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GIOError): IOError = when (nativeValue) {
            GIOError.G_IO_ERROR_NONE -> NONE
            GIOError.G_IO_ERROR_AGAIN -> AGAIN
            GIOError.G_IO_ERROR_INVAL -> INVAL
            GIOError.G_IO_ERROR_UNKNOWN -> UNKNOWN
            else -> error("invalid nativeValue")
        }
    }
}
