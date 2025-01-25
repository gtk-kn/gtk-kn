// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.gsk.annotations.GskVersion4_6
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.TypeCache
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.graphene.graphene_point_t
import org.gtkkn.native.gsk.GskParseLocation
import org.gtkkn.native.gsk.GskPathOperation
import org.gtkkn.native.gsk.gsk_value_dup_render_node
import org.gtkkn.native.gsk.gsk_value_get_render_node
import org.gtkkn.native.gsk.gsk_value_set_render_node
import org.gtkkn.native.gsk.gsk_value_take_render_node

/**
 * ## Skipped during bindings generation
 *
 * - record `BroadwayRendererClass`: glib type struct are ignored
 * - record `CairoRendererClass`: glib type struct are ignored
 * - record `GLRendererClass`: glib type struct are ignored
 * - record `GLShaderClass`: glib type struct are ignored
 * - record `RendererClass`: glib type struct are ignored
 * - record `VulkanRendererClass`: glib type struct are ignored
 */
public object Gsk {
    init {
        registerTypes()
    }

    /**
     * Retrieves the `GskRenderNode` stored inside the given `value`, and acquires
     * a reference to it.
     *
     * @param value a [struct@GObject.Value] initialized with type `GSK_TYPE_RENDER_NODE`
     * @return a `GskRenderNode`
     * @since 4.6
     */
    @GskVersion4_6
    public fun valueDupRenderNode(`value`: Value): RenderNode? = gsk_value_dup_render_node(`value`.gobjectValuePointer)?.run {
        RenderNode.RenderNodeImpl(this)}

    /**
     * Retrieves the `GskRenderNode` stored inside the given `value`.
     *
     * @param value a `GValue` initialized with type `GSK_TYPE_RENDER_NODE`
     * @return a `GskRenderNode`
     * @since 4.6
     */
    @GskVersion4_6
    public fun valueGetRenderNode(`value`: Value): RenderNode? = gsk_value_get_render_node(`value`.gobjectValuePointer)?.run {
        RenderNode.RenderNodeImpl(this)}

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
    public fun valueSetRenderNode(`value`: Value, node: RenderNode): Unit = gsk_value_set_render_node(`value`.gobjectValuePointer, node.gskRenderNodePointer)

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
    public fun valueTakeRenderNode(`value`: Value, node: RenderNode? = null): Unit = gsk_value_take_render_node(`value`.gobjectValuePointer, node?.gskRenderNodePointer)

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            SerializationError.quark() -> SerializationError.fromErrorOrNull(error)
            ?.let {
                SerializationErrorException(error, it)
            }
            else -> null
        }
        return ex ?: GLibException(error)
    }

    private fun registerTypes() {
        TypeCache.register(BlendNode::class, BlendNode.getType()) { BlendNode(it.reinterpret()) }
        TypeCache.register(BlurNode::class, BlurNode.getType()) { BlurNode(it.reinterpret()) }
        TypeCache.register(BorderNode::class, BorderNode.getType()) { BorderNode(it.reinterpret()) }
        TypeCache.register(BroadwayRenderer::class, BroadwayRenderer.getType()) { BroadwayRenderer(it.reinterpret()) }
        TypeCache.register(CairoNode::class, CairoNode.getType()) { CairoNode(it.reinterpret()) }
        TypeCache.register(CairoRenderer::class, CairoRenderer.getType()) { CairoRenderer(it.reinterpret()) }
        TypeCache.register(ClipNode::class, ClipNode.getType()) { ClipNode(it.reinterpret()) }
        TypeCache.register(ColorMatrixNode::class, ColorMatrixNode.getType()) { ColorMatrixNode(it.reinterpret()) }
        TypeCache.register(ColorNode::class, ColorNode.getType()) { ColorNode(it.reinterpret()) }
        TypeCache.register(ConicGradientNode::class, ConicGradientNode.getType()) { ConicGradientNode(it.reinterpret()) }
        TypeCache.register(ContainerNode::class, ContainerNode.getType()) { ContainerNode(it.reinterpret()) }
        TypeCache.register(CrossFadeNode::class, CrossFadeNode.getType()) { CrossFadeNode(it.reinterpret()) }
        TypeCache.register(DebugNode::class, DebugNode.getType()) { DebugNode(it.reinterpret()) }
        TypeCache.register(FillNode::class, FillNode.getType()) { FillNode(it.reinterpret()) }
        TypeCache.register(GlRenderer::class, GlRenderer.getType()) { GlRenderer(it.reinterpret()) }
        TypeCache.register(GlShader::class, GlShader.getType()) { GlShader(it.reinterpret()) }
        TypeCache.register(GlShaderNode::class, GlShaderNode.getType()) { GlShaderNode(it.reinterpret()) }
        TypeCache.register(InsetShadowNode::class, InsetShadowNode.getType()) { InsetShadowNode(it.reinterpret()) }
        TypeCache.register(LinearGradientNode::class, LinearGradientNode.getType()) { LinearGradientNode(it.reinterpret()) }
        TypeCache.register(MaskNode::class, MaskNode.getType()) { MaskNode(it.reinterpret()) }
        TypeCache.register(NglRenderer::class, NglRenderer.getType()) { NglRenderer(it.reinterpret()) }
        TypeCache.register(OpacityNode::class, OpacityNode.getType()) { OpacityNode(it.reinterpret()) }
        TypeCache.register(OutsetShadowNode::class, OutsetShadowNode.getType()) { OutsetShadowNode(it.reinterpret()) }
        TypeCache.register(RadialGradientNode::class, RadialGradientNode.getType()) { RadialGradientNode(it.reinterpret()) }
        TypeCache.register(RenderNode::class, RenderNode.getType()) { RenderNode.RenderNodeImpl(it.reinterpret()) }
        TypeCache.register(Renderer::class, Renderer.getType()) { Renderer.RendererImpl(it.reinterpret()) }
        TypeCache.register(RepeatNode::class, RepeatNode.getType()) { RepeatNode(it.reinterpret()) }
        TypeCache.register(RepeatingLinearGradientNode::class, RepeatingLinearGradientNode.getType()) { RepeatingLinearGradientNode(it.reinterpret()) }
        TypeCache.register(RepeatingRadialGradientNode::class, RepeatingRadialGradientNode.getType()) { RepeatingRadialGradientNode(it.reinterpret()) }
        TypeCache.register(RoundedClipNode::class, RoundedClipNode.getType()) { RoundedClipNode(it.reinterpret()) }
        TypeCache.register(ShadowNode::class, ShadowNode.getType()) { ShadowNode(it.reinterpret()) }
        TypeCache.register(StrokeNode::class, StrokeNode.getType()) { StrokeNode(it.reinterpret()) }
        TypeCache.register(SubsurfaceNode::class, SubsurfaceNode.getType()) { SubsurfaceNode(it.reinterpret()) }
        TypeCache.register(TextNode::class, TextNode.getType()) { TextNode(it.reinterpret()) }
        TypeCache.register(TextureNode::class, TextureNode.getType()) { TextureNode(it.reinterpret()) }
        TypeCache.register(TextureScaleNode::class, TextureScaleNode.getType()) { TextureScaleNode(it.reinterpret()) }
        TypeCache.register(TransformNode::class, TransformNode.getType()) { TransformNode(it.reinterpret()) }
        TypeCache.register(VulkanRenderer::class, VulkanRenderer.getType()) { VulkanRenderer(it.reinterpret()) }
    }
}

public val ParseErrorFuncFunc: CPointer<CFunction<(
    CPointer<GskParseLocation>,
    CPointer<GskParseLocation>,
    CPointer<GError>,
) -> Unit>> = staticCFunction {
    start: CPointer<GskParseLocation>?,
    end: CPointer<GskParseLocation>?,
    error: CPointer<GError>?,
    userData: gpointer?,
    ->
    userData!!.asStableRef<(
        start: ParseLocation,
        end: ParseLocation,
        error: Error,
    ) -> Unit>().get().invoke(start!!.run {
        ParseLocation(this)}
    , end!!.run {
        ParseLocation(this)}
    , error!!.run {
        Error(this)}
    )}
.reinterpret()

public val PathForeachFuncFunc: CPointer<CFunction<(
    GskPathOperation,
    CPointer<graphene_point_t>,
    gsize,
    gfloat,
) -> gboolean>> = staticCFunction {
    op: GskPathOperation,
    pts: CPointer<graphene_point_t>?,
    nPts: gsize,
    weight: gfloat,
    userData: gpointer?,
    ->
    userData!!.asStableRef<(
        op: PathOperation,
        pts: Point,
        nPts: gsize,
        weight: gfloat,
    ) -> Boolean>().get().invoke(op.run {
        PathOperation.fromNativeValue(this)}
    , pts!!.run {
        Point(this)}
    , nPts, weight).asGBoolean()}
.reinterpret()

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
    nPts: gsize,
    weight: gfloat,
) -> Boolean
