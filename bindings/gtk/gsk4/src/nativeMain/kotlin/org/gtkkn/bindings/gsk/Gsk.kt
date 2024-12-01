// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.bindings.gsk.annotations.GskVersion4_6
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.native.glib.GError
import org.gtkkn.native.graphene.graphene_point_t
import org.gtkkn.native.gsk.GskParseLocation
import org.gtkkn.native.gsk.GskPathOperation
import org.gtkkn.native.gsk.gsk_path_parse
import org.gtkkn.native.gsk.gsk_serialization_error_quark
import org.gtkkn.native.gsk.gsk_value_dup_render_node
import org.gtkkn.native.gsk.gsk_value_get_render_node
import org.gtkkn.native.gsk.gsk_value_set_render_node
import org.gtkkn.native.gsk.gsk_value_take_render_node
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - class `NglRenderer`: Missing cType on class
 * - parameter `stroke1`: gpointer
 * - parameter `out_transform`: out_transform: Out parameter is not supported
 * - record `BroadwayRendererClass`: glib type struct are ignored
 * - record `CairoRendererClass`: glib type struct are ignored
 * - record `GLRendererClass`: glib type struct are ignored
 * - record `GLShaderClass`: glib type struct are ignored
 * - record `RendererClass`: glib type struct are ignored
 * - record `VulkanRendererClass`: glib type struct are ignored
 */
public object Gsk {
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
    public fun pathParse(string: String): Path? =
        gsk_path_parse(string)?.run {
            Path(reinterpret())
        }

    public fun serializationErrorQuark(): Quark = gsk_serialization_error_quark()

    /**
     * Retrieves the `GskRenderNode` stored inside the given `value`, and acquires
     * a reference to it.
     *
     * @param value a [struct@GObject.Value] initialized with type `GSK_TYPE_RENDER_NODE`
     * @return a `GskRenderNode`
     * @since 4.6
     */
    @GskVersion4_6
    public fun valueDupRenderNode(`value`: Value): RenderNode? =
        gsk_value_dup_render_node(`value`.gobjectValuePointer.reinterpret())?.run {
            RenderNode(reinterpret())
        }

    /**
     * Retrieves the `GskRenderNode` stored inside the given `value`.
     *
     * @param value a `GValue` initialized with type `GSK_TYPE_RENDER_NODE`
     * @return a `GskRenderNode`
     * @since 4.6
     */
    @GskVersion4_6
    public fun valueGetRenderNode(`value`: Value): RenderNode? =
        gsk_value_get_render_node(`value`.gobjectValuePointer.reinterpret())?.run {
            RenderNode(reinterpret())
        }

    /**
     * Stores the given `GskRenderNode` inside `value`.
     *
     * The [struct@GObject.Value] will acquire a reference to the `node`.
     *
     * @param value a [struct@GObject.Value] initialized with type `GSK_TYPE_RENDER_NODE`
     * @param node a `GskRenderNode`
     * @since 4.6
     */
    @GskVersion4_6
    public fun valueSetRenderNode(
        `value`: Value,
        node: RenderNode,
    ): Unit = gsk_value_set_render_node(`value`.gobjectValuePointer.reinterpret(), node.gPointer.reinterpret())

    /**
     * Stores the given `GskRenderNode` inside `value`.
     *
     * This function transfers the ownership of the `node` to the `GValue`.
     *
     * @param value a [struct@GObject.Value] initialized with type `GSK_TYPE_RENDER_NODE`
     * @param node a `GskRenderNode`
     * @since 4.6
     */
    @GskVersion4_6
    public fun valueTakeRenderNode(
        `value`: Value,
        node: RenderNode? = null,
    ): Unit = gsk_value_take_render_node(`value`.gobjectValuePointer.reinterpret(), node?.gPointer?.reinterpret())

    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                SerializationError.quark() ->
                    SerializationError
                        .fromErrorOrNull(error)
                        ?.let {
                            SerializationErrorException(error, it)
                        }
                else -> null
            }
        return ex ?: GlibException(error)
    }
}

public val ParseErrorFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GskParseLocation>,
            CPointer<GskParseLocation>,
            CPointer<GError>,
        ) -> Unit
    >
> =
    staticCFunction {
            start: CPointer<GskParseLocation>?,
            end: CPointer<GskParseLocation>?,
            error: CPointer<GError>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    start: ParseLocation,
                    end: ParseLocation,
                    error: Error,
                ) -> Unit
            >()
            .get()
            .invoke(
                start!!.run {
                    ParseLocation(reinterpret())
                },
                end!!.run {
                    ParseLocation(reinterpret())
                },
                error!!.run {
                    Error(reinterpret())
                }
            )
    }.reinterpret()

public val PathForeachFuncFunc: CPointer<
    CFunction<
        (
            GskPathOperation,
            CPointer<graphene_point_t>,
            ULong,
            Float,
        ) -> Int
    >
> =
    staticCFunction {
            op: GskPathOperation,
            pts: CPointer<graphene_point_t>?,
            nPts: ULong,
            weight: Float,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    op: PathOperation,
                    pts: Point,
                    nPts: ULong,
                    weight: Float,
                ) -> Boolean
            >()
            .get()
            .invoke(
                op.run {
                    PathOperation.fromNativeValue(this)
                },
                pts!!.run {
                    Point(reinterpret())
                },
                nPts,
                weight
            ).asGBoolean()
    }.reinterpret()

/**
 * Type of callback that is called when an error occurs
 * during node deserialization.
 *
 * - param `start` start of the error location
 * - param `end` end of the error location
 * - param `error` the error
 */
public typealias ParseErrorFunc = (
    start: ParseLocation,
    end: ParseLocation,
    error: Error,
) -> Unit

/**
 * Prototype of the callback to iterate through the operations of
 * a path.
 *
 * For each operation, the callback is given the @op itself, the points
 * that the operation is applied to in @pts, and a @weight for conic
 * curves. The @n_pts argument is somewhat redundant, since the number
 * of points can be inferred from the operation.
 *
 * Each contour of the path starts with a @GSK_PATH_MOVE operation.
 * Closed contours end with a @GSK_PATH_CLOSE operation.
 *
 * - param `op` The operation
 * - param `pts` The points of the operation
 * - param `nPts` The number of points
 * - param `weight` The weight for conic curves, or unused if not a conic curve
 * - return true to continue iterating the path, false to
 *   immediately abort and not call the function again.
 */
public typealias PathForeachFunc = (
    op: PathOperation,
    pts: Point,
    nPts: ULong,
    weight: Float,
) -> Boolean
