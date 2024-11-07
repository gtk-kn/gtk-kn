// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_4
import org.gtkkn.native.glib.GOnceStatus

/**
 * The possible statuses of a one-time initialization function
 * controlled by a #GOnce struct.
 * @since 2.4
 */
@GLibVersion2_4
public enum class OnceStatus(
    public val nativeValue: GOnceStatus,
) {
    /**
     * the function has not been called yet.
     */
    NOTCALLED(GOnceStatus.G_ONCE_STATUS_NOTCALLED),

    /**
     * the function call is currently in progress.
     */
    PROGRESS(GOnceStatus.G_ONCE_STATUS_PROGRESS),

    /**
     * the function has been called.
     */
    READY(GOnceStatus.G_ONCE_STATUS_READY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GOnceStatus): OnceStatus =
            when (nativeValue) {
                GOnceStatus.G_ONCE_STATUS_NOTCALLED -> NOTCALLED
                GOnceStatus.G_ONCE_STATUS_PROGRESS -> PROGRESS
                GOnceStatus.G_ONCE_STATUS_READY -> READY
                else -> error("invalid nativeValue")
            }
    }
}
