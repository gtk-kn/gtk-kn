// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskPathOperation
import org.gtkkn.native.gsk.gsk_path_operation_get_type

/**
 * Path operations are used to describe the segments of a `GskPath`.
 *
 * More values may be added in the future.
 * @since 4.14
 */
@GskVersion4_14
public enum class PathOperation(public val nativeValue: GskPathOperation) {
    /**
     * A move-to operation, with 1 point describing the target point.
     */
    MOVE(GskPathOperation.GSK_PATH_MOVE),

    /**
     * A close operation ending the current contour with a line back
     *   to the starting point. Two points describe the start and end of the line.
     */
    CLOSE(GskPathOperation.GSK_PATH_CLOSE),

    /**
     * A line-to operation, with 2 points describing the start and
     *   end point of a straight line.
     */
    LINE(GskPathOperation.GSK_PATH_LINE),

    /**
     * A curve-to operation describing a quadratic Bézier curve
     *   with 3 points describing the start point, the control point and the end
     *   point of the curve.
     */
    QUAD(GskPathOperation.GSK_PATH_QUAD),

    /**
     * A curve-to operation describing a cubic Bézier curve with 4
     *   points describing the start point, the two control points and the end point
     *   of the curve.
     */
    CUBIC(GskPathOperation.GSK_PATH_CUBIC),

    /**
     * A rational quadratic Bézier curve with 3 points describing
     *   the start point, control point and end point of the curve. A weight for the
     *   curve will be passed, too.
     */
    CONIC(GskPathOperation.GSK_PATH_CONIC),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskPathOperation): PathOperation = when (nativeValue) {
            GskPathOperation.GSK_PATH_MOVE -> MOVE
            GskPathOperation.GSK_PATH_CLOSE -> CLOSE
            GskPathOperation.GSK_PATH_LINE -> LINE
            GskPathOperation.GSK_PATH_QUAD -> QUAD
            GskPathOperation.GSK_PATH_CUBIC -> CUBIC
            GskPathOperation.GSK_PATH_CONIC -> CONIC
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PathOperation
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_path_operation_get_type()
    }
}
