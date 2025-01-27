// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object GskTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("gsk_blend_node_get_type") != null) put(BlendNode::class, BlendNode.type)
        if (getTypeOrNull("gsk_blur_node_get_type") != null) put(BlurNode::class, BlurNode.type)
        if (getTypeOrNull("gsk_border_node_get_type") != null) put(BorderNode::class, BorderNode.type)
        if (getTypeOrNull("gsk_broadway_renderer_get_type") != null) put(BroadwayRenderer::class, BroadwayRenderer.type)
        if (getTypeOrNull("gsk_cairo_node_get_type") != null) put(CairoNode::class, CairoNode.type)
        if (getTypeOrNull("gsk_cairo_renderer_get_type") != null) put(CairoRenderer::class, CairoRenderer.type)
        if (getTypeOrNull("gsk_clip_node_get_type") != null) put(ClipNode::class, ClipNode.type)
        if (getTypeOrNull("gsk_color_matrix_node_get_type") != null) put(ColorMatrixNode::class, ColorMatrixNode.type)
        if (getTypeOrNull("gsk_color_node_get_type") != null) put(ColorNode::class, ColorNode.type)
        if (getTypeOrNull("gsk_conic_gradient_node_get_type") !=
            null
        ) {
            put(ConicGradientNode::class, ConicGradientNode.type)
        }
        if (getTypeOrNull("gsk_container_node_get_type") != null) put(ContainerNode::class, ContainerNode.type)
        if (getTypeOrNull("gsk_cross_fade_node_get_type") != null) put(CrossFadeNode::class, CrossFadeNode.type)
        if (getTypeOrNull("gsk_debug_node_get_type") != null) put(DebugNode::class, DebugNode.type)
        if (getTypeOrNull("gsk_fill_node_get_type") != null) put(FillNode::class, FillNode.type)
        if (getTypeOrNull("gsk_gl_renderer_get_type") != null) put(GlRenderer::class, GlRenderer.type)
        if (getTypeOrNull("gsk_gl_shader_get_type") != null) put(GlShader::class, GlShader.type)
        if (getTypeOrNull("gsk_gl_shader_node_get_type") != null) put(GlShaderNode::class, GlShaderNode.type)
        if (getTypeOrNull("gsk_inset_shadow_node_get_type") != null) put(InsetShadowNode::class, InsetShadowNode.type)
        if (getTypeOrNull("gsk_linear_gradient_node_get_type") !=
            null
        ) {
            put(LinearGradientNode::class, LinearGradientNode.type)
        }
        if (getTypeOrNull("gsk_mask_node_get_type") != null) put(MaskNode::class, MaskNode.type)
        if (getTypeOrNull("gsk_ngl_renderer_get_type") != null) put(NglRenderer::class, NglRenderer.type)
        if (getTypeOrNull("gsk_opacity_node_get_type") != null) put(OpacityNode::class, OpacityNode.type)
        if (getTypeOrNull("gsk_outset_shadow_node_get_type") !=
            null
        ) {
            put(OutsetShadowNode::class, OutsetShadowNode.type)
        }
        if (getTypeOrNull("gsk_radial_gradient_node_get_type") !=
            null
        ) {
            put(RadialGradientNode::class, RadialGradientNode.type)
        }
        if (getTypeOrNull("gsk_render_node_get_type") != null) put(RenderNode::class, RenderNode.type)
        if (getTypeOrNull("gsk_renderer_get_type") != null) put(Renderer::class, Renderer.type)
        if (getTypeOrNull("gsk_repeat_node_get_type") != null) put(RepeatNode::class, RepeatNode.type)
        if (getTypeOrNull("gsk_repeating_linear_gradient_node_get_type") !=
            null
        ) {
            put(RepeatingLinearGradientNode::class, RepeatingLinearGradientNode.type)
        }
        if (getTypeOrNull("gsk_repeating_radial_gradient_node_get_type") !=
            null
        ) {
            put(RepeatingRadialGradientNode::class, RepeatingRadialGradientNode.type)
        }
        if (getTypeOrNull("gsk_rounded_clip_node_get_type") != null) put(RoundedClipNode::class, RoundedClipNode.type)
        if (getTypeOrNull("gsk_shadow_node_get_type") != null) put(ShadowNode::class, ShadowNode.type)
        if (getTypeOrNull("gsk_stroke_node_get_type") != null) put(StrokeNode::class, StrokeNode.type)
        if (getTypeOrNull("gsk_subsurface_node_get_type") != null) put(SubsurfaceNode::class, SubsurfaceNode.type)
        if (getTypeOrNull("gsk_text_node_get_type") != null) put(TextNode::class, TextNode.type)
        if (getTypeOrNull("gsk_texture_node_get_type") != null) put(TextureNode::class, TextureNode.type)
        if (getTypeOrNull("gsk_texture_scale_node_get_type") !=
            null
        ) {
            put(TextureScaleNode::class, TextureScaleNode.type)
        }
        if (getTypeOrNull("gsk_transform_node_get_type") != null) put(TransformNode::class, TransformNode.type)
        if (getTypeOrNull("gsk_vulkan_renderer_get_type") != null) put(VulkanRenderer::class, VulkanRenderer.type)
    }
}
