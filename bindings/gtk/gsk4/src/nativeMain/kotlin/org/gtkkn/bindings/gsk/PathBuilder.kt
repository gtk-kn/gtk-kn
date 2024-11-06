// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.bindings.pango.Layout
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gsk.GskPathBuilder
import org.gtkkn.native.gsk.gsk_path_builder_add_circle
import org.gtkkn.native.gsk.gsk_path_builder_add_layout
import org.gtkkn.native.gsk.gsk_path_builder_add_path
import org.gtkkn.native.gsk.gsk_path_builder_add_rect
import org.gtkkn.native.gsk.gsk_path_builder_add_reverse_path
import org.gtkkn.native.gsk.gsk_path_builder_add_rounded_rect
import org.gtkkn.native.gsk.gsk_path_builder_add_segment
import org.gtkkn.native.gsk.gsk_path_builder_arc_to
import org.gtkkn.native.gsk.gsk_path_builder_close
import org.gtkkn.native.gsk.gsk_path_builder_conic_to
import org.gtkkn.native.gsk.gsk_path_builder_cubic_to
import org.gtkkn.native.gsk.gsk_path_builder_get_current_point
import org.gtkkn.native.gsk.gsk_path_builder_html_arc_to
import org.gtkkn.native.gsk.gsk_path_builder_line_to
import org.gtkkn.native.gsk.gsk_path_builder_move_to
import org.gtkkn.native.gsk.gsk_path_builder_new
import org.gtkkn.native.gsk.gsk_path_builder_quad_to
import org.gtkkn.native.gsk.gsk_path_builder_ref
import org.gtkkn.native.gsk.gsk_path_builder_rel_arc_to
import org.gtkkn.native.gsk.gsk_path_builder_rel_conic_to
import org.gtkkn.native.gsk.gsk_path_builder_rel_cubic_to
import org.gtkkn.native.gsk.gsk_path_builder_rel_html_arc_to
import org.gtkkn.native.gsk.gsk_path_builder_rel_line_to
import org.gtkkn.native.gsk.gsk_path_builder_rel_move_to
import org.gtkkn.native.gsk.gsk_path_builder_rel_quad_to
import org.gtkkn.native.gsk.gsk_path_builder_rel_svg_arc_to
import org.gtkkn.native.gsk.gsk_path_builder_svg_arc_to
import org.gtkkn.native.gsk.gsk_path_builder_to_path
import org.gtkkn.native.gsk.gsk_path_builder_unref
import kotlin.Boolean
import kotlin.Float
import kotlin.Unit

/**
 * `GskPathBuilder` is an auxiliary object for constructing
 * `GskPath` objects.
 *
 * A path is constructed like this:
 *
 * |[<!-- language="C" -->
 * GskPath *
 * construct_path (void)
 * {
 *   GskPathBuilder *builder;
 *
 *   builder = gsk_path_builder_new ();
 *
 *   // add contours to the path here
 *
 *   return gsk_path_builder_free_to_path (builder);
 * ]|
 *
 * Adding contours to the path can be done in two ways.
 * The easiest option is to use the `gsk_path_builder_add_*` group
 * of functions that add predefined contours to the current path,
 * either common shapes like [method@Gsk.PathBuilder.add_circle]
 * or by adding from other paths like [method@Gsk.PathBuilder.add_path].
 *
 * The `gsk_path_builder_add_*` methods always add complete contours,
 * and do not use or modify the current point.
 *
 * The other option is to define each line and curve manually with
 * the `gsk_path_builder_*_to` group of functions. You start with
 * a call to [method@Gsk.PathBuilder.move_to] to set the starting point
 * and then use multiple calls to any of the drawing functions to
 * move the pen along the plane. Once you are done, you can call
 * [method@Gsk.PathBuilder.close] to close the path by connecting it
 * back with a line to the starting point.
 *
 * This is similar to how paths are drawn in Cairo.
 *
 * Note that `GskPathBuilder` will reduce the degree of added Bézier
 * curves as much as possible, to simplify rendering.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `path`: cairo.Path
 *
 * @since 4.14
 */
@GskVersion4_14
public class PathBuilder(
    pointer: CPointer<GskPathBuilder>,
) : Record {
    public val gskPathBuilderPointer: CPointer<GskPathBuilder> = pointer

    /**
     * Adds a circle with the @center and @radius.
     *
     * The path is going around the circle in clockwise direction.
     *
     * If @radius is zero, the contour will be a closed point.
     *
     * @param center the center of the circle
     * @param radius the radius of the circle
     * @since 4.14
     */
    @GskVersion4_14
    public fun addCircle(
        center: Point,
        radius: Float,
    ): Unit = gsk_path_builder_add_circle(gskPathBuilderPointer.reinterpret(), center.graphenePointPointer, radius)

    /**
     * Adds the outlines for the glyphs in @layout to the builder.
     *
     * @param layout the pango layout to add
     * @since 4.14
     */
    @GskVersion4_14
    public fun addLayout(layout: Layout): Unit =
        gsk_path_builder_add_layout(gskPathBuilderPointer.reinterpret(), layout.pangoLayoutPointer.reinterpret())

    /**
     * Appends all of @path to the builder.
     *
     * @param path the path to append
     * @since 4.14
     */
    @GskVersion4_14
    public fun addPath(path: Path): Unit =
        gsk_path_builder_add_path(gskPathBuilderPointer.reinterpret(), path.gskPathPointer)

    /**
     * Adds @rect as a new contour to the path built by the builder.
     *
     * The path is going around the rectangle in clockwise direction.
     *
     * If the the width or height are 0, the path will be a closed
     * horizontal or vertical line. If both are 0, it'll be a closed dot.
     *
     * @param rect The rectangle to create a path for
     * @since 4.14
     */
    @GskVersion4_14
    public fun addRect(rect: Rect): Unit =
        gsk_path_builder_add_rect(gskPathBuilderPointer.reinterpret(), rect.grapheneRectPointer)

    /**
     * Appends all of @path to the builder, in reverse order.
     *
     * @param path the path to append
     * @since 4.14
     */
    @GskVersion4_14
    public fun addReversePath(path: Path): Unit =
        gsk_path_builder_add_reverse_path(gskPathBuilderPointer.reinterpret(), path.gskPathPointer)

    /**
     * Adds @rect as a new contour to the path built in @self.
     *
     * The path is going around the rectangle in clockwise direction.
     *
     * @param rect the rounded rect
     * @since 4.14
     */
    @GskVersion4_14
    public fun addRoundedRect(rect: RoundedRect): Unit =
        gsk_path_builder_add_rounded_rect(gskPathBuilderPointer.reinterpret(), rect.gskRoundedRectPointer)

    /**
     * Adds to @self the segment of @path from @start to @end.
     *
     * If @start is equal to or after @end, the path will first add the
     * segment from @start to the end of the path, and then add the segment
     * from the beginning to @end. If the path is closed, these segments
     * will be connected.
     *
     * Note that this method always adds a path with the given start point
     * and end point. To add a closed path, use [method@Gsk.PathBuilder.add_path].
     *
     * @param path the `GskPath` to take the segment to
     * @param start the point on @path to start at
     * @param end the point on @path to end at
     * @since 4.14
     */
    @GskVersion4_14
    public fun addSegment(
        path: Path,
        start: PathPoint,
        end: PathPoint,
    ): Unit =
        gsk_path_builder_add_segment(
            gskPathBuilderPointer.reinterpret(),
            path.gskPathPointer,
            start.gskPathPointPointer,
            end.gskPathPointPointer
        )

    /**
     * Adds an elliptical arc from the current point to @x3, @y3
     * with @x1, @y1 determining the tangent directions.
     *
     * After this, @x3, @y3 will be the new current point.
     *
     * Note: Two points and their tangents do not determine
     * a unique ellipse, so GSK just picks one. If you need more
     * precise control, use [method@Gsk.PathBuilder.conic_to]
     * or [method@Gsk.PathBuilder.svg_arc_to].
     *
     * <picture>
     *   <source srcset="arc-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Arc To" src="arc-light.png">
     * </picture>
     *
     * @param x1 x coordinate of first control point
     * @param y1 y coordinate of first control point
     * @param x2 x coordinate of second control point
     * @param y2 y coordinate of second control point
     * @since 4.14
     */
    @GskVersion4_14
    public fun arcTo(
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
    ): Unit = gsk_path_builder_arc_to(gskPathBuilderPointer.reinterpret(), x1, y1, x2, y2)

    /**
     * Ends the current contour with a line back to the start point.
     *
     * Note that this is different from calling [method@Gsk.PathBuilder.line_to]
     * with the start point in that the contour will be closed. A closed
     * contour behaves differently from an open one. When stroking, its
     * start and end point are considered connected, so they will be
     * joined via the line join, and not ended with line caps.
     *
     * @since 4.14
     */
    @GskVersion4_14
    public fun close(): Unit = gsk_path_builder_close(gskPathBuilderPointer.reinterpret())

    /**
     * Adds a [conic curve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline)
     * from the current point to @x2, @y2 with the given @weight and @x1, @y1 as the
     * control point.
     *
     * The weight determines how strongly the curve is pulled towards the control point.
     * A conic with weight 1 is identical to a quadratic Bézier curve with the same points.
     *
     * Conic curves can be used to draw ellipses and circles. They are also known as
     * rational quadratic Bézier curves.
     *
     * After this, @x2, @y2 will be the new current point.
     *
     * <picture>
     *   <source srcset="conic-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Conic To" src="conic-light.png">
     * </picture>
     *
     * @param x1 x coordinate of control point
     * @param y1 y coordinate of control point
     * @param x2 x coordinate of the end of the curve
     * @param y2 y coordinate of the end of the curve
     * @param weight weight of the control point, must be greater than zero
     * @since 4.14
     */
    @GskVersion4_14
    public fun conicTo(
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
        weight: Float,
    ): Unit = gsk_path_builder_conic_to(gskPathBuilderPointer.reinterpret(), x1, y1, x2, y2, weight)

    /**
     * Adds a [cubic Bézier curve](https://en.wikipedia.org/wiki/B%C3%A9zier_curve)
     * from the current point to @x3, @y3 with @x1, @y1 and @x2, @y2 as the control
     * points.
     *
     * After this, @x3, @y3 will be the new current point.
     *
     * <picture>
     *   <source srcset="cubic-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Cubic To" src="cubic-light.png">
     * </picture>
     *
     * @param x1 x coordinate of first control point
     * @param y1 y coordinate of first control point
     * @param x2 x coordinate of second control point
     * @param y2 y coordinate of second control point
     * @param x3 x coordinate of the end of the curve
     * @param y3 y coordinate of the end of the curve
     * @since 4.14
     */
    @GskVersion4_14
    public fun cubicTo(
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
        x3: Float,
        y3: Float,
    ): Unit = gsk_path_builder_cubic_to(gskPathBuilderPointer.reinterpret(), x1, y1, x2, y2, x3, y3)

    /**
     * Gets the current point.
     *
     * The current point is used for relative drawing commands and
     * updated after every operation.
     *
     * When the builder is created, the default current point is set
     * to `0, 0`. Note that this is different from cairo, which starts
     * out without a current point.
     *
     * @return The current point
     * @since 4.14
     */
    @GskVersion4_14
    public fun getCurrentPoint(): Point =
        gsk_path_builder_get_current_point(gskPathBuilderPointer.reinterpret())!!.run {
            Point(reinterpret())
        }

    /**
     * Implements arc-to according to the HTML Canvas spec.
     *
     * A convenience function that implements the
     * [HTML arc_to](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-arcto-dev)
     * functionality.
     *
     * After this, the current point will be the point where
     * the circle with the given radius touches the line from
     * @x1, @y1 to @x2, @y2.
     *
     * @param x1 X coordinate of first control point
     * @param y1 Y coordinate of first control point
     * @param x2 X coordinate of second control point
     * @param y2 Y coordinate of second control point
     * @param radius Radius of the circle
     * @since 4.14
     */
    @GskVersion4_14
    public fun htmlArcTo(
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
        radius: Float,
    ): Unit = gsk_path_builder_html_arc_to(gskPathBuilderPointer.reinterpret(), x1, y1, x2, y2, radius)

    /**
     * Draws a line from the current point to @x, @y and makes it
     * the new current point.
     *
     * <picture>
     *   <source srcset="line-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Line To" src="line-light.png">
     * </picture>
     *
     * @param x x coordinate
     * @param y y coordinate
     * @since 4.14
     */
    @GskVersion4_14
    public fun lineTo(
        x: Float,
        y: Float,
    ): Unit = gsk_path_builder_line_to(gskPathBuilderPointer.reinterpret(), x, y)

    /**
     * Starts a new contour by placing the pen at @x, @y.
     *
     * If this function is called twice in succession, the first
     * call will result in a contour made up of a single point.
     * The second call will start a new contour.
     *
     * @param x x coordinate
     * @param y y coordinate
     * @since 4.14
     */
    @GskVersion4_14
    public fun moveTo(
        x: Float,
        y: Float,
    ): Unit = gsk_path_builder_move_to(gskPathBuilderPointer.reinterpret(), x, y)

    /**
     * Adds a [quadratic Bézier curve](https://en.wikipedia.org/wiki/B%C3%A9zier_curve)
     * from the current point to @x2, @y2 with @x1, @y1 as the control point.
     *
     * After this, @x2, @y2 will be the new current point.
     *
     * <picture>
     *   <source srcset="quad-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Quad To" src="quad-light.png">
     * </picture>
     *
     * @param x1 x coordinate of control point
     * @param y1 y coordinate of control point
     * @param x2 x coordinate of the end of the curve
     * @param y2 y coordinate of the end of the curve
     * @since 4.14
     */
    @GskVersion4_14
    public fun quadTo(
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
    ): Unit = gsk_path_builder_quad_to(gskPathBuilderPointer.reinterpret(), x1, y1, x2, y2)

    /**
     * Acquires a reference on the given builder.
     *
     * This function is intended primarily for language bindings.
     * `GskPathBuilder` objects should not be kept around.
     *
     * @return the given `GskPathBuilder` with
     *   its reference count increased
     * @since 4.14
     */
    @GskVersion4_14
    public fun ref(): PathBuilder =
        gsk_path_builder_ref(gskPathBuilderPointer.reinterpret())!!.run {
            PathBuilder(reinterpret())
        }

    /**
     * Adds an elliptical arc from the current point to @x3, @y3
     * with @x1, @y1 determining the tangent directions.
     *
     * All coordinates are given relative to the current point.
     *
     * This is the relative version of [method@Gsk.PathBuilder.arc_to].
     *
     * @param x1 x coordinate of first control point
     * @param y1 y coordinate of first control point
     * @param x2 x coordinate of second control point
     * @param y2 y coordinate of second control point
     * @since 4.14
     */
    @GskVersion4_14
    public fun relArcTo(
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
    ): Unit = gsk_path_builder_rel_arc_to(gskPathBuilderPointer.reinterpret(), x1, y1, x2, y2)

    /**
     * Adds a [conic curve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline)
     * from the current point to @x2, @y2 with the given @weight and @x1, @y1 as the
     * control point.
     *
     * All coordinates are given relative to the current point.
     *
     * This is the relative version of [method@Gsk.PathBuilder.conic_to].
     *
     * @param x1 x offset of control point
     * @param y1 y offset of control point
     * @param x2 x offset of the end of the curve
     * @param y2 y offset of the end of the curve
     * @param weight weight of the curve, must be greater than zero
     * @since 4.14
     */
    @GskVersion4_14
    public fun relConicTo(
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
        weight: Float,
    ): Unit = gsk_path_builder_rel_conic_to(gskPathBuilderPointer.reinterpret(), x1, y1, x2, y2, weight)

    /**
     * Adds a [cubic Bézier curve](https://en.wikipedia.org/wiki/B%C3%A9zier_curve)
     * from the current point to @x3, @y3 with @x1, @y1 and @x2, @y2 as the control
     * points.
     *
     * All coordinates are given relative to the current point.
     *
     * This is the relative version of [method@Gsk.PathBuilder.cubic_to].
     *
     * @param x1 x offset of first control point
     * @param y1 y offset of first control point
     * @param x2 x offset of second control point
     * @param y2 y offset of second control point
     * @param x3 x offset of the end of the curve
     * @param y3 y offset of the end of the curve
     * @since 4.14
     */
    @GskVersion4_14
    public fun relCubicTo(
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
        x3: Float,
        y3: Float,
    ): Unit = gsk_path_builder_rel_cubic_to(gskPathBuilderPointer.reinterpret(), x1, y1, x2, y2, x3, y3)

    /**
     * Implements arc-to according to the HTML Canvas spec.
     *
     * All coordinates are given relative to the current point.
     *
     * This is the relative version of [method@Gsk.PathBuilder.html_arc_to].
     *
     * @param x1 X coordinate of first control point
     * @param y1 Y coordinate of first control point
     * @param x2 X coordinate of second control point
     * @param y2 Y coordinate of second control point
     * @param radius Radius of the circle
     * @since 4.14
     */
    @GskVersion4_14
    public fun relHtmlArcTo(
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
        radius: Float,
    ): Unit = gsk_path_builder_rel_html_arc_to(gskPathBuilderPointer.reinterpret(), x1, y1, x2, y2, radius)

    /**
     * Draws a line from the current point to a point offset from it
     * by @x, @y and makes it the new current point.
     *
     * This is the relative version of [method@Gsk.PathBuilder.line_to].
     *
     * @param x x offset
     * @param y y offset
     * @since 4.14
     */
    @GskVersion4_14
    public fun relLineTo(
        x: Float,
        y: Float,
    ): Unit = gsk_path_builder_rel_line_to(gskPathBuilderPointer.reinterpret(), x, y)

    /**
     * Starts a new contour by placing the pen at @x, @y
     * relative to the current point.
     *
     * This is the relative version of [method@Gsk.PathBuilder.move_to].
     *
     * @param x x offset
     * @param y y offset
     * @since 4.14
     */
    @GskVersion4_14
    public fun relMoveTo(
        x: Float,
        y: Float,
    ): Unit = gsk_path_builder_rel_move_to(gskPathBuilderPointer.reinterpret(), x, y)

    /**
     * Adds a [quadratic Bézier curve](https://en.wikipedia.org/wiki/B%C3%A9zier_curve)
     * from the current point to @x2, @y2 with @x1, @y1 the control point.
     *
     * All coordinates are given relative to the current point.
     *
     * This is the relative version of [method@Gsk.PathBuilder.quad_to].
     *
     * @param x1 x offset of control point
     * @param y1 y offset of control point
     * @param x2 x offset of the end of the curve
     * @param y2 y offset of the end of the curve
     * @since 4.14
     */
    @GskVersion4_14
    public fun relQuadTo(
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
    ): Unit = gsk_path_builder_rel_quad_to(gskPathBuilderPointer.reinterpret(), x1, y1, x2, y2)

    /**
     * Implements arc-to according to the SVG spec.
     *
     * All coordinates are given relative to the current point.
     *
     * This is the relative version of [method@Gsk.PathBuilder.svg_arc_to].
     *
     * @param rx X radius
     * @param ry Y radius
     * @param xAxisRotation the rotation of the ellipsis
     * @param largeArc whether to add the large arc
     * @param positiveSweep whether to sweep in the positive direction
     * @param x the X coordinate of the endpoint
     * @param y the Y coordinate of the endpoint
     * @since 4.14
     */
    @GskVersion4_14
    public fun relSvgArcTo(
        rx: Float,
        ry: Float,
        xAxisRotation: Float,
        largeArc: Boolean,
        positiveSweep: Boolean,
        x: Float,
        y: Float,
    ): Unit =
        gsk_path_builder_rel_svg_arc_to(
            gskPathBuilderPointer.reinterpret(),
            rx,
            ry,
            xAxisRotation,
            largeArc.asGBoolean(),
            positiveSweep.asGBoolean(),
            x,
            y
        )

    /**
     * Implements arc-to according to the SVG spec.
     *
     * A convenience function that implements the
     * [SVG arc_to](https://www.w3.org/TR/SVG11/paths.html#PathDataEllipticalArcCommands)
     * functionality.
     *
     * After this, @x, @y will be the new current point.
     *
     * @param rx X radius
     * @param ry Y radius
     * @param xAxisRotation the rotation of the ellipsis
     * @param largeArc whether to add the large arc
     * @param positiveSweep whether to sweep in the positive direction
     * @param x the X coordinate of the endpoint
     * @param y the Y coordinate of the endpoint
     * @since 4.14
     */
    @GskVersion4_14
    public fun svgArcTo(
        rx: Float,
        ry: Float,
        xAxisRotation: Float,
        largeArc: Boolean,
        positiveSweep: Boolean,
        x: Float,
        y: Float,
    ): Unit =
        gsk_path_builder_svg_arc_to(
            gskPathBuilderPointer.reinterpret(),
            rx,
            ry,
            xAxisRotation,
            largeArc.asGBoolean(),
            positiveSweep.asGBoolean(),
            x,
            y
        )

    /**
     * Creates a new `GskPath` from the given builder.
     *
     * The given `GskPathBuilder` is reset once this function returns;
     * you cannot call this function multiple times on the same builder
     * instance.
     *
     * This function is intended primarily for language bindings.
     * C code should use [method@Gsk.PathBuilder.free_to_path].
     *
     * @return the newly created `GskPath`
     *   with all the contours added to the builder
     * @since 4.14
     */
    @GskVersion4_14
    public fun toPath(): Path =
        gsk_path_builder_to_path(gskPathBuilderPointer.reinterpret())!!.run {
            Path(reinterpret())
        }

    /**
     * Releases a reference on the given builder.
     *
     * @since 4.14
     */
    @GskVersion4_14
    public fun unref(): Unit = gsk_path_builder_unref(gskPathBuilderPointer.reinterpret())

    public companion object : RecordCompanion<PathBuilder, GskPathBuilder> {
        /**
         * Create a new `GskPathBuilder` object.
         *
         * The resulting builder would create an empty `GskPath`.
         * Use addition functions to add types to it.
         *
         * @return a new `GskPathBuilder`
         * @since 4.14
         */
        public fun new(): PathBuilder = PathBuilder(gsk_path_builder_new()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PathBuilder =
            PathBuilder(pointer.reinterpret())
    }
}
