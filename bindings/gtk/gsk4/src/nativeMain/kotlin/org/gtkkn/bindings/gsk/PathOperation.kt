// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.native.gsk.GskPathOperation
import org.gtkkn.native.gsk.GskPathOperation.GSK_PATH_CLOSE
import org.gtkkn.native.gsk.GskPathOperation.GSK_PATH_CONIC
import org.gtkkn.native.gsk.GskPathOperation.GSK_PATH_CUBIC
import org.gtkkn.native.gsk.GskPathOperation.GSK_PATH_LINE
import org.gtkkn.native.gsk.GskPathOperation.GSK_PATH_MOVE
import org.gtkkn.native.gsk.GskPathOperation.GSK_PATH_QUAD

/**
 * Path operations are used to describe the segments of a `GskPath`.
 *
 * More values may be added in the future.
 * @since 4.14
 */
@GskVersion4_14
public enum class PathOperation(
    public val nativeValue: GskPathOperation,
) {
    /**
     * A move-to operation, with 1 point describing the target point.
     */
    MOVE(GSK_PATH_MOVE),

    /**
     * A close operation ending the current contour with a line back
     *   to the starting point. Two points describe the start and end of the line.
     */
    CLOSE(GSK_PATH_CLOSE),

    /**
     * A line-to operation, with 2 points describing the start and
     *   end point of a straight line.
     */
    LINE(GSK_PATH_LINE),

    /**
     * A curve-to operation describing a quadratic Bézier curve
     *   with 3 points describing the start point, the control point and the end
     *   point of the curve.
     */
    QUAD(GSK_PATH_QUAD),

    /**
     * A curve-to operation describing a cubic Bézier curve with 4
     *   points describing the start point, the two control points and the end point
     *   of the curve.
     */
    CUBIC(GSK_PATH_CUBIC),

    /**
     * A rational quadratic Bézier curve with 3 points describing
     *   the start point, control point and end point of the curve. A weight for the
     *   curve will be passed, too.
     */
    CONIC(GSK_PATH_CONIC),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskPathOperation): PathOperation =
            when (nativeValue) {
                GSK_PATH_MOVE -> MOVE
                GSK_PATH_CLOSE -> CLOSE
                GSK_PATH_LINE -> LINE
                GSK_PATH_QUAD -> QUAD
                GSK_PATH_CUBIC -> CUBIC
                GSK_PATH_CONIC -> CONIC
                else -> error("invalid nativeValue")
            }
    }
}
