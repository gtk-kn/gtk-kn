// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.graphene.Vec2
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gsk.GskPathPoint
import org.gtkkn.native.gsk.gsk_path_point_compare
import org.gtkkn.native.gsk.gsk_path_point_copy
import org.gtkkn.native.gsk.gsk_path_point_equal
import org.gtkkn.native.gsk.gsk_path_point_free
import org.gtkkn.native.gsk.gsk_path_point_get_curvature
import org.gtkkn.native.gsk.gsk_path_point_get_distance
import org.gtkkn.native.gsk.gsk_path_point_get_position
import org.gtkkn.native.gsk.gsk_path_point_get_rotation
import org.gtkkn.native.gsk.gsk_path_point_get_tangent
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit

/**
 * `GskPathPoint` is an opaque type representing a point on a path.
 *
 * It can be queried for properties of the path at that point, such as
 * its tangent or its curvature.
 *
 * To obtain a `GskPathPoint`, use [method@Gsk.Path.get_closest_point],
 * [method@Gsk.Path.get_start_point], [method@Gsk.Path.get_end_point]
 * or [method@Gsk.PathMeasure.get_point].
 *
 * Note that `GskPathPoint` structs are meant to be stack-allocated,
 * and don't hold a reference to the path object they are obtained from.
 * It is the callers responsibility to keep a reference to the path
 * as long as the `GskPathPoint` is used.
 * @since 4.14
 */
public class PathPoint(
    pointer: CPointer<GskPathPoint>,
) : Record {
    public val gskPathPointPointer: CPointer<GskPathPoint> = pointer

    /**
     * Returns whether @point1 is before or after @point2.
     *
     * @param point2 another `GskPathPoint`
     * @return -1 if @point1 is before @point2,
     *   1 if @point1 is after @point2,
     *   0 if they are equal
     * @since 4.14
     */
    public fun compare(point2: PathPoint): Int =
        gsk_path_point_compare(gskPathPointPointer.reinterpret(), point2.gskPathPointPointer)

    public fun copy(): PathPoint =
        gsk_path_point_copy(gskPathPointPointer.reinterpret())!!.run {
            PathPoint(reinterpret())
        }

    /**
     * Returns whether the two path points refer to the same
     * location on all paths.
     *
     * Note that the start- and endpoint of a closed contour
     * will compare nonequal according to this definition.
     * Use [method@Gsk.Path.is_closed] to find out if the
     * start- and endpoint of a concrete path refer to the
     * same location.
     *
     * @param point2 another `GskPathPoint`
     * @return `TRUE` if @point1 and @point2 are equal
     * @since 4.14
     */
    public fun equal(point2: PathPoint): Boolean =
        gsk_path_point_equal(gskPathPointPointer.reinterpret(), point2.gskPathPointPointer).asBoolean()

    public fun free(): Unit = gsk_path_point_free(gskPathPointPointer.reinterpret())

    /**
     * Calculates the curvature of the path at the point.
     *
     * Optionally, returns the center of the osculating circle as well.
     * The curvature is the inverse of the radius of the osculating circle.
     *
     * Lines have a curvature of zero (indicating an osculating circle of
     * infinite radius. In this case, the @center is not modified.
     *
     * Circles with a radius of zero have `INFINITY` as curvature
     *
     * Note that certain points on a path may not have a single curvature,
     * such as sharp turns. At such points, there are two curvatures --
     * the (limit of) the curvature of the path going into the point,
     * and the (limit of) the curvature of the path coming out of it.
     * The @direction argument lets you choose which one to get.
     *
     * <picture>
     *   <source srcset="curvature-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Osculating circle" src="curvature-light.png">
     * </picture>
     *
     * @param path the path that @point is on
     * @param direction the direction for which to return the curvature
     * @param center Return location for
     *   the center of the osculating circle
     * @return The curvature of the path at the given point
     * @since 4.14
     */
    public fun getCurvature(
        path: Path,
        direction: PathDirection,
        center: Point?,
    ): Float =
        gsk_path_point_get_curvature(
            gskPathPointPointer.reinterpret(),
            path.gskPathPointer,
            direction.nativeValue,
            center?.graphenePointPointer
        )

    /**
     * Returns the distance from the beginning of the path
     * to @point.
     *
     * @param measure a `GskPathMeasure` for the path
     * @return the distance of @point
     * @since 4.14
     */
    public fun getDistance(measure: PathMeasure): Float =
        gsk_path_point_get_distance(gskPathPointPointer.reinterpret(), measure.gskPathMeasurePointer)

    /**
     * Gets the position of the point.
     *
     * @param path the path that @point is on
     * @param position Return location for
     *   the coordinates of the point
     * @since 4.14
     */
    public fun getPosition(
        path: Path,
        position: Point,
    ): Unit =
        gsk_path_point_get_position(
            gskPathPointPointer.reinterpret(),
            path.gskPathPointer,
            position.graphenePointPointer
        )

    /**
     * Gets the direction of the tangent at a given point.
     *
     * This is a convenience variant of [method@Gsk.PathPoint.get_tangent]
     * that returns the angle between the tangent and the X axis. The angle
     * can e.g. be used in
     * [gtk_snapshot_rotate()](../gtk4/method.Snapshot.rotate.html).
     *
     * @param path the path that @point is on
     * @param direction the direction for which to return the rotation
     * @return the angle between the tangent and the X axis, in degrees
     * @since 4.14
     */
    public fun getRotation(
        path: Path,
        direction: PathDirection,
    ): Float =
        gsk_path_point_get_rotation(gskPathPointPointer.reinterpret(), path.gskPathPointer, direction.nativeValue)

    /**
     * Gets the tangent of the path at the point.
     *
     * Note that certain points on a path may not have a single
     * tangent, such as sharp turns. At such points, there are
     * two tangents -- the direction of the path going into the
     * point, and the direction coming out of it. The @direction
     * argument lets you choose which one to get.
     *
     * If the path is just a single point (e.g. a circle with
     * radius zero), then @tangent is set to `0, 0`.
     *
     * If you want to orient something in the direction of the
     * path, [method@Gsk.PathPoint.get_rotation] may be more
     * convenient to use.
     *
     * @param path the path that @point is on
     * @param direction the direction for which to return the tangent
     * @param tangent Return location for
     *   the tangent at the point
     * @since 4.14
     */
    public fun getTangent(
        path: Path,
        direction: PathDirection,
        tangent: Vec2,
    ): Unit =
        gsk_path_point_get_tangent(
            gskPathPointPointer.reinterpret(),
            path.gskPathPointer,
            direction.nativeValue,
            tangent.grapheneVec2Pointer
        )

    public companion object : RecordCompanion<PathPoint, GskPathPoint> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PathPoint = PathPoint(pointer.reinterpret())
    }
}