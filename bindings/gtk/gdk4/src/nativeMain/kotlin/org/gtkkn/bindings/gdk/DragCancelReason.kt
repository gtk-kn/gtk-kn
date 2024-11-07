// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkDragCancelReason

/**
 * Used in `GdkDrag` to the reason of a cancelled DND operation.
 */
public enum class DragCancelReason(
    public val nativeValue: GdkDragCancelReason,
) {
    /**
     * There is no suitable drop target.
     */
    NO_TARGET(GdkDragCancelReason.GDK_DRAG_CANCEL_NO_TARGET),

    /**
     * Drag cancelled by the user
     */
    USER_CANCELLED(GdkDragCancelReason.GDK_DRAG_CANCEL_USER_CANCELLED),

    /**
     * Unspecified error.
     */
    ERROR(GdkDragCancelReason.GDK_DRAG_CANCEL_ERROR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkDragCancelReason): DragCancelReason =
            when (nativeValue) {
                GdkDragCancelReason.GDK_DRAG_CANCEL_NO_TARGET -> NO_TARGET
                GdkDragCancelReason.GDK_DRAG_CANCEL_USER_CANCELLED -> USER_CANCELLED
                GdkDragCancelReason.GDK_DRAG_CANCEL_ERROR -> ERROR
                else -> error("invalid nativeValue")
            }
    }
}
