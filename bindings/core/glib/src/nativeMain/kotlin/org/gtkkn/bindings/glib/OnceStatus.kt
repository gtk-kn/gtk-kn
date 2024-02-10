// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GOnceStatus
import org.gtkkn.native.glib.GOnceStatus.G_ONCE_STATUS_NOTCALLED
import org.gtkkn.native.glib.GOnceStatus.G_ONCE_STATUS_PROGRESS
import org.gtkkn.native.glib.GOnceStatus.G_ONCE_STATUS_READY

/**
 * The possible statuses of a one-time initialization function
 * controlled by a #GOnce struct.
 * @since 2.4
 */
public enum class OnceStatus(
    public val nativeValue: GOnceStatus,
) {
    /**
     * the function has not been called yet.
     */
    NOTCALLED(G_ONCE_STATUS_NOTCALLED),

    /**
     * the function call is currently in progress.
     */
    PROGRESS(G_ONCE_STATUS_PROGRESS),

    /**
     * the function has been called.
     */
    READY(G_ONCE_STATUS_READY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GOnceStatus): OnceStatus =
            when (nativeValue) {
                G_ONCE_STATUS_NOTCALLED -> NOTCALLED
                G_ONCE_STATUS_PROGRESS -> PROGRESS
                G_ONCE_STATUS_READY -> READY
                else -> error("invalid nativeValue")
            }
    }
}
