// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GIOStatus
import org.gtkkn.native.glib.GIOStatus.G_IO_STATUS_AGAIN
import org.gtkkn.native.glib.GIOStatus.G_IO_STATUS_EOF
import org.gtkkn.native.glib.GIOStatus.G_IO_STATUS_ERROR
import org.gtkkn.native.glib.GIOStatus.G_IO_STATUS_NORMAL

/**
 * Statuses returned by most of the #GIOFuncs functions.
 */
public enum class IOStatus(
    public val nativeValue: GIOStatus,
) {
    /**
     * An error occurred.
     */
    ERROR(G_IO_STATUS_ERROR),

    /**
     * Success.
     */
    NORMAL(G_IO_STATUS_NORMAL),

    /**
     * End of file.
     */
    EOF(G_IO_STATUS_EOF),

    /**
     * Resource temporarily unavailable.
     */
    AGAIN(G_IO_STATUS_AGAIN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GIOStatus): IOStatus =
            when (nativeValue) {
                G_IO_STATUS_ERROR -> ERROR
                G_IO_STATUS_NORMAL -> NORMAL
                G_IO_STATUS_EOF -> EOF
                G_IO_STATUS_AGAIN -> AGAIN
                else -> error("invalid nativeValue")
            }
    }
}
