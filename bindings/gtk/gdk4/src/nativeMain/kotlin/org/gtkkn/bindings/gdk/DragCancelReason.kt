// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkDragCancelReason
import org.gtkkn.native.gdk.gdk_drag_cancel_reason_get_type
import org.gtkkn.native.gobject.GType

/**
 * Used in `GdkDrag` to the reason of a cancelled DND operation.
 */
public enum class DragCancelReason(public val nativeValue: GdkDragCancelReason) {
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
        public fun fromNativeValue(nativeValue: GdkDragCancelReason): DragCancelReason = when (nativeValue) {
            GdkDragCancelReason.GDK_DRAG_CANCEL_NO_TARGET -> NO_TARGET
            GdkDragCancelReason.GDK_DRAG_CANCEL_USER_CANCELLED -> USER_CANCELLED
            GdkDragCancelReason.GDK_DRAG_CANCEL_ERROR -> ERROR
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DragCancelReason
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_drag_cancel_reason_get_type()
    }
}
