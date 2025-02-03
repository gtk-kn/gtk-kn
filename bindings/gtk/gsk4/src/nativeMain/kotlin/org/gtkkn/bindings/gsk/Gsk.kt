// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

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
import kotlin.Boolean
import kotlin.Unit

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
    public fun valueDupRenderNode(`value`: Value): RenderNode? =
        gsk_value_dup_render_node(`value`.gobjectValuePointer)?.run {
            RenderNode.RenderNodeImpl(this)
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
        gsk_value_get_render_node(`value`.gobjectValuePointer)?.run {
            RenderNode.RenderNodeImpl(this)
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
    public fun valueSetRenderNode(`value`: Value, node: RenderNode): Unit =
        gsk_value_set_render_node(`value`.gobjectValuePointer, node.gskRenderNodePointer)

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
    public fun valueTakeRenderNode(`value`: Value, node: RenderNode? = null): Unit =
        gsk_value_take_render_node(`value`.gobjectValuePointer, node?.gskRenderNodePointer)

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
        BlendNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(BlendNode::class, gtype) { BlendNode(it.reinterpret()) }
        }
        BlurNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(BlurNode::class, gtype) { BlurNode(it.reinterpret()) }
        }
        BorderNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(BorderNode::class, gtype) { BorderNode(it.reinterpret()) }
        }
        BroadwayRenderer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(BroadwayRenderer::class, gtype) { BroadwayRenderer(it.reinterpret()) }
        }
        CairoNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CairoNode::class, gtype) { CairoNode(it.reinterpret()) }
        }
        CairoRenderer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CairoRenderer::class, gtype) { CairoRenderer(it.reinterpret()) }
        }
        ClipNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ClipNode::class, gtype) { ClipNode(it.reinterpret()) }
        }
        ColorMatrixNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ColorMatrixNode::class, gtype) { ColorMatrixNode(it.reinterpret()) }
        }
        ColorNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ColorNode::class, gtype) { ColorNode(it.reinterpret()) }
        }
        ConicGradientNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ConicGradientNode::class, gtype) { ConicGradientNode(it.reinterpret()) }
        }
        ContainerNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ContainerNode::class, gtype) { ContainerNode(it.reinterpret()) }
        }
        CrossFadeNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CrossFadeNode::class, gtype) { CrossFadeNode(it.reinterpret()) }
        }
        DebugNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(DebugNode::class, gtype) { DebugNode(it.reinterpret()) }
        }
        FillNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(FillNode::class, gtype) { FillNode(it.reinterpret()) }
        }
        GlRenderer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(GlRenderer::class, gtype) { GlRenderer(it.reinterpret()) }
        }
        GlShader.getTypeOrNull()?.let { gtype ->
            TypeCache.register(GlShader::class, gtype) { GlShader(it.reinterpret()) }
        }
        GlShaderNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(GlShaderNode::class, gtype) { GlShaderNode(it.reinterpret()) }
        }
        InsetShadowNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(InsetShadowNode::class, gtype) { InsetShadowNode(it.reinterpret()) }
        }
        LinearGradientNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(LinearGradientNode::class, gtype) { LinearGradientNode(it.reinterpret()) }
        }
        MaskNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(MaskNode::class, gtype) { MaskNode(it.reinterpret()) }
        }
        NglRenderer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(NglRenderer::class, gtype) { NglRenderer(it.reinterpret()) }
        }
        OpacityNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(OpacityNode::class, gtype) { OpacityNode(it.reinterpret()) }
        }
        OutsetShadowNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(OutsetShadowNode::class, gtype) { OutsetShadowNode(it.reinterpret()) }
        }
        RadialGradientNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(RadialGradientNode::class, gtype) { RadialGradientNode(it.reinterpret()) }
        }
        RenderNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(RenderNode::class, gtype) { RenderNode.RenderNodeImpl(it.reinterpret()) }
        }
        Renderer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Renderer::class, gtype) { Renderer.RendererImpl(it.reinterpret()) }
        }
        RepeatNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(RepeatNode::class, gtype) { RepeatNode(it.reinterpret()) }
        }
        RepeatingLinearGradientNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(RepeatingLinearGradientNode::class, gtype) {
                RepeatingLinearGradientNode(it.reinterpret())
            }
        }
        RepeatingRadialGradientNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(RepeatingRadialGradientNode::class, gtype) {
                RepeatingRadialGradientNode(it.reinterpret())
            }
        }
        RoundedClipNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(RoundedClipNode::class, gtype) { RoundedClipNode(it.reinterpret()) }
        }
        ShadowNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ShadowNode::class, gtype) { ShadowNode(it.reinterpret()) }
        }
        StrokeNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(StrokeNode::class, gtype) { StrokeNode(it.reinterpret()) }
        }
        SubsurfaceNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SubsurfaceNode::class, gtype) { SubsurfaceNode(it.reinterpret()) }
        }
        TextNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(TextNode::class, gtype) { TextNode(it.reinterpret()) }
        }
        TextureNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(TextureNode::class, gtype) { TextureNode(it.reinterpret()) }
        }
        TextureScaleNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(TextureScaleNode::class, gtype) { TextureScaleNode(it.reinterpret()) }
        }
        TransformNode.getTypeOrNull()?.let { gtype ->
            TypeCache.register(TransformNode::class, gtype) { TransformNode(it.reinterpret()) }
        }
        VulkanRenderer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(VulkanRenderer::class, gtype) { VulkanRenderer(it.reinterpret()) }
        }
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
    > = staticCFunction {
        start: CPointer<GskParseLocation>?,
        end: CPointer<GskParseLocation>?,
        error: CPointer<GError>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            start: ParseLocation,
            end: ParseLocation,
            error: Error,
        ) -> Unit
        >().get().invoke(
        start!!.run {
            ParseLocation(this)
        },
        end!!.run {
            ParseLocation(this)
        },
        error!!.run {
            Error(this)
        }
    )
}
    .reinterpret()

public val PathForeachFuncFunc: CPointer<
    CFunction<
        (
            GskPathOperation,
            CPointer<graphene_point_t>,
            gsize,
            gfloat,
        ) -> gboolean
        >
    > = staticCFunction {
        op: GskPathOperation,
        pts: CPointer<graphene_point_t>?,
        nPts: gsize,
        weight: gfloat,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            op: PathOperation,
            pts: Point,
            nPts: gsize,
            weight: gfloat,
        ) -> Boolean
        >().get().invoke(
        op.run {
            PathOperation.fromNativeValue(this)
        },
        pts!!.run {
            Point(this)
        },
        nPts,
        weight
    ).asGBoolean()
}
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
