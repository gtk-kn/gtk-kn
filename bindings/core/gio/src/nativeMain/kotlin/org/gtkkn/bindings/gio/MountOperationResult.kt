// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GMountOperationResult
import org.gtkkn.native.gio.GMountOperationResult.G_MOUNT_OPERATION_ABORTED
import org.gtkkn.native.gio.GMountOperationResult.G_MOUNT_OPERATION_HANDLED
import org.gtkkn.native.gio.GMountOperationResult.G_MOUNT_OPERATION_UNHANDLED

/**
 * #GMountOperationResult is returned as a result when a request for
 * information is send by the mounting operation.
 */
public enum class MountOperationResult(
    public val nativeValue: GMountOperationResult,
) {
    /**
     * The request was fulfilled and the
     *     user specified data is now available
     */
    HANDLED(G_MOUNT_OPERATION_HANDLED),

    /**
     * The user requested the mount operation
     *     to be aborted
     */
    ABORTED(G_MOUNT_OPERATION_ABORTED),

    /**
     * The request was unhandled (i.e. not
     *     implemented)
     */
    UNHANDLED(G_MOUNT_OPERATION_UNHANDLED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GMountOperationResult): MountOperationResult =
            when (nativeValue) {
                G_MOUNT_OPERATION_HANDLED -> HANDLED
                G_MOUNT_OPERATION_ABORTED -> ABORTED
                G_MOUNT_OPERATION_UNHANDLED -> UNHANDLED
                else -> error("invalid nativeValue")
            }
    }
}
