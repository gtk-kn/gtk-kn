// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.native.gsk.GskPathDirection
import org.gtkkn.native.gsk.GskPathDirection.GSK_PATH_FROM_END
import org.gtkkn.native.gsk.GskPathDirection.GSK_PATH_FROM_START
import org.gtkkn.native.gsk.GskPathDirection.GSK_PATH_TO_END
import org.gtkkn.native.gsk.GskPathDirection.GSK_PATH_TO_START

/**
 * The values of the `GskPathDirection` enum are used to pick one
 * of the four tangents at a given point on the path.
 *
 * Note that the directions for @GSK_PATH_FROM_START/@GSK_PATH_TO_END and
 * @GSK_PATH_TO_START/@GSK_PATH_FROM_END will coincide for smooth points.
 * Only sharp turns will exhibit four different directions.
 *
 * <picture>
 *   <source srcset="directions-dark.png" media="(prefers-color-scheme: dark)">
 *   <img alt="Path Tangents" src="directions-light.png">
 * </picture>
 * @since 4.14
 */
@GskVersion4_14
public enum class PathDirection(
    public val nativeValue: GskPathDirection,
) {
    /**
     * The tangent in path direction of the incoming side
     *   of the path
     */
    FROM_START(GSK_PATH_FROM_START),

    /**
     * The tangent against path direction of the incoming side
     *   of the path
     */
    TO_START(GSK_PATH_TO_START),

    /**
     * The tangent in path direction of the outgoing side
     *   of the path
     */
    TO_END(GSK_PATH_TO_END),

    /**
     * The tangent against path direction of the outgoing
     *   side of the path
     */
    FROM_END(GSK_PATH_FROM_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskPathDirection): PathDirection =
            when (nativeValue) {
                GSK_PATH_FROM_START -> FROM_START
                GSK_PATH_TO_START -> TO_START
                GSK_PATH_TO_END -> TO_END
                GSK_PATH_FROM_END -> FROM_END
                else -> error("invalid nativeValue")
            }
    }
}
