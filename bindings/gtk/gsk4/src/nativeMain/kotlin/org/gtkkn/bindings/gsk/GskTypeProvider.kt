// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object GskTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (BlendNode.getTypeOrNull() != null) put(BlendNode::class, BlendNode.type)
        if (BlurNode.getTypeOrNull() != null) put(BlurNode::class, BlurNode.type)
        if (BorderNode.getTypeOrNull() != null) put(BorderNode::class, BorderNode.type)
        if (CairoNode.getTypeOrNull() != null) put(CairoNode::class, CairoNode.type)
        if (CairoRenderer.getTypeOrNull() != null) put(CairoRenderer::class, CairoRenderer.type)
        if (ClipNode.getTypeOrNull() != null) put(ClipNode::class, ClipNode.type)
        if (ColorMatrixNode.getTypeOrNull() != null) put(ColorMatrixNode::class, ColorMatrixNode.type)
        if (ColorNode.getTypeOrNull() != null) put(ColorNode::class, ColorNode.type)
        if (ConicGradientNode.getTypeOrNull() != null) put(ConicGradientNode::class, ConicGradientNode.type)
        if (ContainerNode.getTypeOrNull() != null) put(ContainerNode::class, ContainerNode.type)
        if (CrossFadeNode.getTypeOrNull() != null) put(CrossFadeNode::class, CrossFadeNode.type)
        if (DebugNode.getTypeOrNull() != null) put(DebugNode::class, DebugNode.type)
        if (FillNode.getTypeOrNull() != null) put(FillNode::class, FillNode.type)
        if (GlRenderer.getTypeOrNull() != null) put(GlRenderer::class, GlRenderer.type)
        if (GlShader.getTypeOrNull() != null) put(GlShader::class, GlShader.type)
        if (GlShaderNode.getTypeOrNull() != null) put(GlShaderNode::class, GlShaderNode.type)
        if (InsetShadowNode.getTypeOrNull() != null) put(InsetShadowNode::class, InsetShadowNode.type)
        if (LinearGradientNode.getTypeOrNull() != null) put(LinearGradientNode::class, LinearGradientNode.type)
        if (MaskNode.getTypeOrNull() != null) put(MaskNode::class, MaskNode.type)
        if (NglRenderer.getTypeOrNull() != null) put(NglRenderer::class, NglRenderer.type)
        if (OpacityNode.getTypeOrNull() != null) put(OpacityNode::class, OpacityNode.type)
        if (OutsetShadowNode.getTypeOrNull() != null) put(OutsetShadowNode::class, OutsetShadowNode.type)
        if (RadialGradientNode.getTypeOrNull() != null) put(RadialGradientNode::class, RadialGradientNode.type)
        if (RenderNode.getTypeOrNull() != null) put(RenderNode::class, RenderNode.type)
        if (Renderer.getTypeOrNull() != null) put(Renderer::class, Renderer.type)
        if (RepeatNode.getTypeOrNull() != null) put(RepeatNode::class, RepeatNode.type)
        if (RepeatingLinearGradientNode.getTypeOrNull() !=
            null
        ) {
            put(RepeatingLinearGradientNode::class, RepeatingLinearGradientNode.type)
        }
        if (RepeatingRadialGradientNode.getTypeOrNull() !=
            null
        ) {
            put(RepeatingRadialGradientNode::class, RepeatingRadialGradientNode.type)
        }
        if (RoundedClipNode.getTypeOrNull() != null) put(RoundedClipNode::class, RoundedClipNode.type)
        if (ShadowNode.getTypeOrNull() != null) put(ShadowNode::class, ShadowNode.type)
        if (StrokeNode.getTypeOrNull() != null) put(StrokeNode::class, StrokeNode.type)
        if (SubsurfaceNode.getTypeOrNull() != null) put(SubsurfaceNode::class, SubsurfaceNode.type)
        if (TextNode.getTypeOrNull() != null) put(TextNode::class, TextNode.type)
        if (TextureNode.getTypeOrNull() != null) put(TextureNode::class, TextureNode.type)
        if (TextureScaleNode.getTypeOrNull() != null) put(TextureScaleNode::class, TextureScaleNode.type)
        if (TransformNode.getTypeOrNull() != null) put(TransformNode::class, TransformNode.type)
        if (VulkanRenderer.getTypeOrNull() != null) put(VulkanRenderer::class, VulkanRenderer.type)
    }
}
