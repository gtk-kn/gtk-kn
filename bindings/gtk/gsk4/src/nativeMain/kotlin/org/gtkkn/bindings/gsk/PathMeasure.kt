// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskPathMeasure
import org.gtkkn.native.gsk.gsk_path_measure_get_length
import org.gtkkn.native.gsk.gsk_path_measure_get_path
import org.gtkkn.native.gsk.gsk_path_measure_get_point
import org.gtkkn.native.gsk.gsk_path_measure_get_tolerance
import org.gtkkn.native.gsk.gsk_path_measure_get_type
import org.gtkkn.native.gsk.gsk_path_measure_new
import org.gtkkn.native.gsk.gsk_path_measure_new_with_tolerance
import org.gtkkn.native.gsk.gsk_path_measure_ref
import org.gtkkn.native.gsk.gsk_path_measure_unref
import kotlin.Boolean
import kotlin.Unit

/**
 * `GskPathMeasure` is an object that allows measurements
 * on `GskPath`s such as determining the length of the path.
 *
 * Many measuring operations require sampling the path length
 * at intermediate points. Therefore, a `GskPathMeasure` has
 * a tolerance that determines what precision is required
 * for such approximations.
 *
 * A `GskPathMeasure` struct is a reference counted struct
 * and should be treated as opaque.
 * @since 4.14
 */
@GskVersion4_14
public class PathMeasure(pointer: CPointer<GskPathMeasure>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GskPathMeasure> = pointer

    /**
     * Gets the length of the path being measured.
     *
     * The length is cached, so this function does not do any work.
     *
     * @return The length of the path measured by @self
     * @since 4.14
     */
    @GskVersion4_14
    public fun getLength(): gfloat = gsk_path_measure_get_length(gPointer)

    /**
     * Returns the path that the measure was created for.
     *
     * @return the path of @self
     * @since 4.14
     */
    @GskVersion4_14
    public fun getPath(): Path = gsk_path_measure_get_path(gPointer)!!.run {
        Path(this)
    }

    /**
     * Sets @result to the point at the given distance into the path.
     *
     * An empty path has no points, so `FALSE` is returned in that case.
     *
     * @param distance the distance
     * @param result return location for the result
     * @return `TRUE` if @result was set
     * @since 4.14
     */
    @GskVersion4_14
    public fun getPoint(distance: gfloat, result: PathPoint): Boolean =
        gsk_path_measure_get_point(gPointer, distance, result.gPointer).asBoolean()

    /**
     * Returns the tolerance that the measure was created with.
     *
     * @return the tolerance of @self
     * @since 4.14
     */
    @GskVersion4_14
    public fun getTolerance(): gfloat = gsk_path_measure_get_tolerance(gPointer)

    /**
     * Increases the reference count of a `GskPathMeasure` by one.
     *
     * @return the passed in `GskPathMeasure`.
     * @since 4.14
     */
    @GskVersion4_14
    public fun ref(): PathMeasure = gsk_path_measure_ref(gPointer)!!.run {
        PathMeasure(this)
    }

    /**
     * Decreases the reference count of a `GskPathMeasure` by one.
     *
     * If the resulting reference count is zero, frees the object.
     *
     * @since 4.14
     */
    @GskVersion4_14
    public fun unref(): Unit = gsk_path_measure_unref(gPointer)

    public companion object {
        /**
         * Creates a measure object for the given @path with the
         * default tolerance.
         *
         * @param path the path to measure
         * @return a new `GskPathMeasure` representing @path
         * @since 4.14
         */
        public fun new(path: Path): PathMeasure = PathMeasure(gsk_path_measure_new(path.gPointer)!!.reinterpret())

        /**
         * Creates a measure object for the given @path and @tolerance.
         *
         * @param path the path to measure
         * @param tolerance the tolerance for measuring operations
         * @return a new `GskPathMeasure` representing @path
         * @since 4.14
         */
        public fun newWithTolerance(path: Path, tolerance: gfloat): PathMeasure =
            PathMeasure(gsk_path_measure_new_with_tolerance(path.gPointer, tolerance)!!.reinterpret())

        /**
         * Get the GType of PathMeasure
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_path_measure_get_type()
    }
}
