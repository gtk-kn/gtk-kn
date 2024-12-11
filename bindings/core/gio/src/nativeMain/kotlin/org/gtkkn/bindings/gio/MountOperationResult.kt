// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GMountOperationResult
import org.gtkkn.native.gio.g_mount_operation_result_get_type
import org.gtkkn.native.gobject.GType

/**
 * #GMountOperationResult is returned as a result when a request for
 * information is send by the mounting operation.
 */
public enum class MountOperationResult(public val nativeValue: GMountOperationResult) {
    /**
     * The request was fulfilled and the
     *     user specified data is now available
     */
    HANDLED(GMountOperationResult.G_MOUNT_OPERATION_HANDLED),

    /**
     * The user requested the mount operation
     *     to be aborted
     */
    ABORTED(GMountOperationResult.G_MOUNT_OPERATION_ABORTED),

    /**
     * The request was unhandled (i.e. not
     *     implemented)
     */
    UNHANDLED(GMountOperationResult.G_MOUNT_OPERATION_UNHANDLED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GMountOperationResult): MountOperationResult = when (nativeValue) {
            GMountOperationResult.G_MOUNT_OPERATION_HANDLED -> HANDLED
            GMountOperationResult.G_MOUNT_OPERATION_ABORTED -> ABORTED
            GMountOperationResult.G_MOUNT_OPERATION_UNHANDLED -> UNHANDLED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of MountOperationResult
         *
         * @return the GType
         */
        public fun getType(): GType = g_mount_operation_result_get_type()
    }
}
