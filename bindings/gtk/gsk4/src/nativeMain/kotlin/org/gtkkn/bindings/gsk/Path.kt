// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskPath
import org.gtkkn.native.gsk.gsk_path_foreach
import org.gtkkn.native.gsk.gsk_path_get_bounds
import org.gtkkn.native.gsk.gsk_path_get_end_point
import org.gtkkn.native.gsk.gsk_path_get_start_point
import org.gtkkn.native.gsk.gsk_path_get_stroke_bounds
import org.gtkkn.native.gsk.gsk_path_get_type
import org.gtkkn.native.gsk.gsk_path_in_fill
import org.gtkkn.native.gsk.gsk_path_is_closed
import org.gtkkn.native.gsk.gsk_path_is_empty
import org.gtkkn.native.gsk.gsk_path_parse
import org.gtkkn.native.gsk.gsk_path_print
import org.gtkkn.native.gsk.gsk_path_ref
import org.gtkkn.native.gsk.gsk_path_to_string
import org.gtkkn.native.gsk.gsk_path_unref
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * A `GskPath` describes lines and curves that are more complex
 * than simple rectangles.
 *
 * Paths can used for rendering (filling or stroking) and for animations
 * (e.g. as trajectories).
 *
 * `GskPath` is an immutable, opaque, reference-counted struct.
 * After creation, you cannot change the types it represents. Instead,
 * new `GskPath` objects have to be created. The [struct@Gsk.PathBuilder]
 * structure is meant to help in this endeavor.
 *
 * Conceptually, a path consists of zero or more contours (continuous, connected
 * curves), each of which may or may not be closed. Contours are typically
 * constructed from Bézier segments.
 *
 * <picture>
 *   <source srcset="path-dark.png" media="(prefers-color-scheme: dark)">
 *   <img alt="A Path" src="path-light.png">
 * </picture>
 *
 * ## Skipped during bindings generation
 *
 * - parameter `distance`: distance: Out parameter is not supported
 * - parameter `cr`: cairo.Context
 *
 * @since 4.14
 */
@GskVersion4_14
public class Path(pointer: CPointer<GskPath>) : ProxyInstance(pointer) {
    public val gskPathPointer: CPointer<GskPath> = pointer

    /**
     * Calls @func for every operation of the path.
     *
     * Note that this may only approximate @self, because paths can contain
     * optimizations for various specialized contours, and depending on the
     * @flags, the path may be decomposed into simpler curves than the ones
     * that it contained originally.
     *
     * This function serves two purposes:
     *
     * - When the @flags allow everything, it provides access to the raw,
     *   unmodified data of the path.
     * - When the @flags disallow certain operations, it provides
     *   an approximation of the path using just the allowed operations.
     *
     * @param flags flags to pass to the foreach function. See [flags@Gsk.PathForeachFlags]
     *   for details about flags
     * @param func the function to call for operations
     * @return `FALSE` if @func returned FALSE`, `TRUE` otherwise.
     * @since 4.14
     */
    @GskVersion4_14
    public fun foreach(flags: PathForeachFlags, func: PathForeachFunc): Boolean = gsk_path_foreach(
        gskPathPointer.reinterpret(),
        flags.mask,
        PathForeachFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    ).asBoolean()

    /**
     * Computes the bounds of the given path.
     *
     * The returned bounds may be larger than necessary, because this
     * function aims to be fast, not accurate. The bounds are guaranteed
     * to contain the path.
     *
     * It is possible that the returned rectangle has 0 width and/or height.
     * This can happen when the path only describes a point or an
     * axis-aligned line.
     *
     * If the path is empty, `FALSE` is returned and @bounds are set to
     * graphene_rect_zero(). This is different from the case where the path
     * is a single point at the origin, where the @bounds will also be set to
     * the zero rectangle but `TRUE` will be returned.
     *
     * @param bounds the bounds of the given path
     * @return `TRUE` if the path has bounds, `FALSE` if the path is known
     *   to be empty and have no bounds.
     * @since 4.14
     */
    @GskVersion4_14
    public fun getBounds(bounds: Rect): Boolean =
        gsk_path_get_bounds(gskPathPointer.reinterpret(), bounds.grapheneRectPointer.reinterpret()).asBoolean()

    /**
     * Gets the end point of the path.
     *
     * An empty path has no points, so `FALSE`
     * is returned in this case.
     *
     * @param result return location for point
     * @return `TRUE` if @result was filled
     * @since 4.14
     */
    @GskVersion4_14
    public fun getEndPoint(result: PathPoint): Boolean =
        gsk_path_get_end_point(gskPathPointer.reinterpret(), result.gskPathPointPointer.reinterpret()).asBoolean()

    /**
     * Gets the start point of the path.
     *
     * An empty path has no points, so `FALSE`
     * is returned in this case.
     *
     * @param result return location for point
     * @return `TRUE` if @result was filled
     * @since 4.14
     */
    @GskVersion4_14
    public fun getStartPoint(result: PathPoint): Boolean =
        gsk_path_get_start_point(gskPathPointer.reinterpret(), result.gskPathPointPointer.reinterpret()).asBoolean()

    /**
     * Computes the bounds for stroking the given path with the
     * parameters in @stroke.
     *
     * The returned bounds may be larger than necessary, because this
     * function aims to be fast, not accurate. The bounds are guaranteed
     * to contain the area affected by the stroke, including protrusions
     * like miters.
     *
     * @param stroke stroke parameters
     * @param bounds the bounds to fill in
     * @return `TRUE` if the path has bounds, `FALSE` if the path is known
     *   to be empty and have no bounds.
     * @since 4.14
     */
    @GskVersion4_14
    public fun getStrokeBounds(stroke: Stroke, bounds: Rect): Boolean = gsk_path_get_stroke_bounds(
        gskPathPointer.reinterpret(),
        stroke.gskStrokePointer.reinterpret(),
        bounds.grapheneRectPointer.reinterpret()
    ).asBoolean()

    /**
     * Returns whether the given point is inside the area
     * that would be affected if the path was filled according
     * to @fill_rule.
     *
     * Note that this function assumes that filling a contour
     * implicitly closes it.
     *
     * @param point the point to test
     * @param fillRule the fill rule to follow
     * @return `TRUE` if @point is inside
     * @since 4.14
     */
    @GskVersion4_14
    public fun inFill(point: Point, fillRule: FillRule): Boolean = gsk_path_in_fill(
        gskPathPointer.reinterpret(),
        point.graphenePointPointer.reinterpret(),
        fillRule.nativeValue
    ).asBoolean()

    /**
     * Returns if the path represents a single closed
     * contour.
     *
     * @return `TRUE` if the path is closed
     * @since 4.14
     */
    @GskVersion4_14
    public fun isClosed(): Boolean = gsk_path_is_closed(gskPathPointer.reinterpret()).asBoolean()

    /**
     * Checks if the path is empty, i.e. contains no lines or curves.
     *
     * @return `TRUE` if the path is empty
     * @since 4.14
     */
    @GskVersion4_14
    public fun isEmpty(): Boolean = gsk_path_is_empty(gskPathPointer.reinterpret()).asBoolean()

    /**
     * Converts @self into a human-readable string representation suitable
     * for printing.
     *
     * The string is compatible with (a superset of)
     * [SVG path syntax](https://www.w3.org/TR/SVG11/paths.html#PathData),
     * see [func@Gsk.Path.parse] for a summary of the syntax.
     *
     * @param string The string to print into
     * @since 4.14
     */
    @GskVersion4_14
    public fun print(string: GlibString): Unit =
        gsk_path_print(gskPathPointer.reinterpret(), string.glibStringPointer.reinterpret())

    /**
     * Increases the reference count of a `GskPath` by one.
     *
     * @return the passed in `GskPath`.
     * @since 4.14
     */
    @GskVersion4_14
    public fun ref(): Path = gsk_path_ref(gskPathPointer.reinterpret())!!.run {
        Path(reinterpret())
    }

    /**
     * Converts the path into a string that is suitable for printing.
     *
     * You can use this function in a debugger to get a quick overview
     * of the path.
     *
     * This is a wrapper around [method@Gsk.Path.print], see that function
     * for details.
     *
     * @return A new string for @self
     * @since 4.14
     */
    @Suppress("POTENTIALLY_NON_REPORTED_ANNOTATION")
    @GskVersion4_14
    override fun toString(): KotlinString =
        gsk_path_to_string(gskPathPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Decreases the reference count of a `GskPath` by one.
     *
     * If the resulting reference count is zero, frees the path.
     *
     * @since 4.14
     */
    @GskVersion4_14
    public fun unref(): Unit = gsk_path_unref(gskPathPointer.reinterpret())

    public companion object {
        /**
         * This is a convenience function that constructs a `GskPath`
         * from a serialized form.
         *
         * The string is expected to be in (a superset of)
         * [SVG path syntax](https://www.w3.org/TR/SVG11/paths.html#PathData),
         * as e.g. produced by [method@Gsk.Path.to_string].
         *
         * A high-level summary of the syntax:
         *
         * - `M x y` Move to `(x, y)`
         * - `L x y` Add a line from the current point to `(x, y)`
         * - `Q x1 y1 x2 y2` Add a quadratic Bézier from the current point to `(x2, y2)`, with control point `(x1, y1)`
         * - `C x1 y1 x2 y2 x3 y3` Add a cubic Bézier from the current point to `(x3, y3)`, with control points `(x1, y1)` and `(x2, y2)`
         * - `Z` Close the contour by drawing a line back to the start point
         * - `H x` Add a horizontal line from the current point to the given x value
         * - `V y` Add a vertical line from the current point to the given y value
         * - `T x2 y2` Add a quadratic Bézier, using the reflection of the previous segments' control point as control point
         * - `S x2 y2 x3 y3` Add a cubic Bézier, using the reflection of the previous segments' second control point as first control point
         * - `A rx ry r l s x y` Add an elliptical arc from the current point to `(x, y)` with radii rx and ry. See the SVG documentation for how the other parameters influence the arc.
         * - `O x1 y1 x2 y2 w` Add a rational quadratic Bézier from the current point to `(x2, y2)` with control point `(x1, y1)` and weight `w`.
         *
         * All the commands have lowercase variants that interpret coordinates
         * relative to the current point.
         *
         * The `O` command is an extension that is not supported in SVG.
         *
         * @param string a string
         * @return a new `GskPath`, or `NULL` if @string could not be parsed
         * @since 4.14
         */
        @GskVersion4_14
        public fun parse(string: KotlinString): Path? = gsk_path_parse(string)?.run {
            Path(reinterpret())
        }

        /**
         * Get the GType of Path
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_path_get_type()
    }
}
