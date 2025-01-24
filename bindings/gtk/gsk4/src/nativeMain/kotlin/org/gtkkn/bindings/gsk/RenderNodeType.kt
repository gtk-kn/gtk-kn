// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskRenderNodeType
import org.gtkkn.native.gsk.gsk_render_node_type_get_type

/**
 * The type of a node determines what the node is rendering.
 */
public enum class RenderNodeType(public val nativeValue: GskRenderNodeType) {
    /**
     * Error type. No node will ever have this type.
     */
    NOT_A_RENDER_NODE(GskRenderNodeType.GSK_NOT_A_RENDER_NODE),

    /**
     * A node containing a stack of children
     */
    CONTAINER_NODE(GskRenderNodeType.GSK_CONTAINER_NODE),

    /**
     * A node drawing a `cairo_surface_t`
     */
    CAIRO_NODE(GskRenderNodeType.GSK_CAIRO_NODE),

    /**
     * A node drawing a single color rectangle
     */
    COLOR_NODE(GskRenderNodeType.GSK_COLOR_NODE),

    /**
     * A node drawing a linear gradient
     */
    LINEAR_GRADIENT_NODE(GskRenderNodeType.GSK_LINEAR_GRADIENT_NODE),

    /**
     * A node drawing a repeating linear gradient
     */
    REPEATING_LINEAR_GRADIENT_NODE(GskRenderNodeType.GSK_REPEATING_LINEAR_GRADIENT_NODE),

    /**
     * A node drawing a radial gradient
     */
    RADIAL_GRADIENT_NODE(GskRenderNodeType.GSK_RADIAL_GRADIENT_NODE),

    /**
     * A node drawing a repeating radial gradient
     */
    REPEATING_RADIAL_GRADIENT_NODE(GskRenderNodeType.GSK_REPEATING_RADIAL_GRADIENT_NODE),

    /**
     * A node drawing a conic gradient
     */
    CONIC_GRADIENT_NODE(GskRenderNodeType.GSK_CONIC_GRADIENT_NODE),

    /**
     * A node stroking a border around an area
     */
    BORDER_NODE(GskRenderNodeType.GSK_BORDER_NODE),

    /**
     * A node drawing a `GdkTexture`
     */
    TEXTURE_NODE(GskRenderNodeType.GSK_TEXTURE_NODE),

    /**
     * A node drawing an inset shadow
     */
    INSET_SHADOW_NODE(GskRenderNodeType.GSK_INSET_SHADOW_NODE),

    /**
     * A node drawing an outset shadow
     */
    OUTSET_SHADOW_NODE(GskRenderNodeType.GSK_OUTSET_SHADOW_NODE),

    /**
     * A node that renders its child after applying a matrix transform
     */
    TRANSFORM_NODE(GskRenderNodeType.GSK_TRANSFORM_NODE),

    /**
     * A node that changes the opacity of its child
     */
    OPACITY_NODE(GskRenderNodeType.GSK_OPACITY_NODE),

    /**
     * A node that applies a color matrix to every pixel
     */
    COLOR_MATRIX_NODE(GskRenderNodeType.GSK_COLOR_MATRIX_NODE),

    /**
     * A node that repeats the child's contents
     */
    REPEAT_NODE(GskRenderNodeType.GSK_REPEAT_NODE),

    /**
     * A node that clips its child to a rectangular area
     */
    CLIP_NODE(GskRenderNodeType.GSK_CLIP_NODE),

    /**
     * A node that clips its child to a rounded rectangle
     */
    ROUNDED_CLIP_NODE(GskRenderNodeType.GSK_ROUNDED_CLIP_NODE),

    /**
     * A node that draws a shadow below its child
     */
    SHADOW_NODE(GskRenderNodeType.GSK_SHADOW_NODE),

    /**
     * A node that blends two children together
     */
    BLEND_NODE(GskRenderNodeType.GSK_BLEND_NODE),

    /**
     * A node that cross-fades between two children
     */
    CROSS_FADE_NODE(GskRenderNodeType.GSK_CROSS_FADE_NODE),

    /**
     * A node containing a glyph string
     */
    TEXT_NODE(GskRenderNodeType.GSK_TEXT_NODE),

    /**
     * A node that applies a blur
     */
    BLUR_NODE(GskRenderNodeType.GSK_BLUR_NODE),

    /**
     * Debug information that does not affect the rendering
     */
    DEBUG_NODE(GskRenderNodeType.GSK_DEBUG_NODE),

    /**
     * A node that uses OpenGL fragment shaders to render
     */
    GL_SHADER_NODE(GskRenderNodeType.GSK_GL_SHADER_NODE),

    /**
     * A node drawing a `GdkTexture` scaled and filtered.
     * @since 4.10
     */
    TEXTURE_SCALE_NODE(GskRenderNodeType.GSK_TEXTURE_SCALE_NODE),

    /**
     * A node that masks one child with another.
     * @since 4.10
     */
    MASK_NODE(GskRenderNodeType.GSK_MASK_NODE),

    /**
     * A node that fills a path.
     * @since 4.14
     */
    FILL_NODE(GskRenderNodeType.GSK_FILL_NODE),

    /**
     * A node that strokes a path.
     * @since 4.14
     */
    STROKE_NODE(GskRenderNodeType.GSK_STROKE_NODE),

    /**
     * A node that possibly redirects part of the scene graph to a subsurface.
     * @since 4.14
     */
    SUBSURFACE_NODE(GskRenderNodeType.GSK_SUBSURFACE_NODE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskRenderNodeType): RenderNodeType = when (nativeValue) {
            GskRenderNodeType.GSK_NOT_A_RENDER_NODE -> NOT_A_RENDER_NODE
            GskRenderNodeType.GSK_CONTAINER_NODE -> CONTAINER_NODE
            GskRenderNodeType.GSK_CAIRO_NODE -> CAIRO_NODE
            GskRenderNodeType.GSK_COLOR_NODE -> COLOR_NODE
            GskRenderNodeType.GSK_LINEAR_GRADIENT_NODE -> LINEAR_GRADIENT_NODE
            GskRenderNodeType.GSK_REPEATING_LINEAR_GRADIENT_NODE -> REPEATING_LINEAR_GRADIENT_NODE
            GskRenderNodeType.GSK_RADIAL_GRADIENT_NODE -> RADIAL_GRADIENT_NODE
            GskRenderNodeType.GSK_REPEATING_RADIAL_GRADIENT_NODE -> REPEATING_RADIAL_GRADIENT_NODE
            GskRenderNodeType.GSK_CONIC_GRADIENT_NODE -> CONIC_GRADIENT_NODE
            GskRenderNodeType.GSK_BORDER_NODE -> BORDER_NODE
            GskRenderNodeType.GSK_TEXTURE_NODE -> TEXTURE_NODE
            GskRenderNodeType.GSK_INSET_SHADOW_NODE -> INSET_SHADOW_NODE
            GskRenderNodeType.GSK_OUTSET_SHADOW_NODE -> OUTSET_SHADOW_NODE
            GskRenderNodeType.GSK_TRANSFORM_NODE -> TRANSFORM_NODE
            GskRenderNodeType.GSK_OPACITY_NODE -> OPACITY_NODE
            GskRenderNodeType.GSK_COLOR_MATRIX_NODE -> COLOR_MATRIX_NODE
            GskRenderNodeType.GSK_REPEAT_NODE -> REPEAT_NODE
            GskRenderNodeType.GSK_CLIP_NODE -> CLIP_NODE
            GskRenderNodeType.GSK_ROUNDED_CLIP_NODE -> ROUNDED_CLIP_NODE
            GskRenderNodeType.GSK_SHADOW_NODE -> SHADOW_NODE
            GskRenderNodeType.GSK_BLEND_NODE -> BLEND_NODE
            GskRenderNodeType.GSK_CROSS_FADE_NODE -> CROSS_FADE_NODE
            GskRenderNodeType.GSK_TEXT_NODE -> TEXT_NODE
            GskRenderNodeType.GSK_BLUR_NODE -> BLUR_NODE
            GskRenderNodeType.GSK_DEBUG_NODE -> DEBUG_NODE
            GskRenderNodeType.GSK_GL_SHADER_NODE -> GL_SHADER_NODE
            GskRenderNodeType.GSK_TEXTURE_SCALE_NODE -> TEXTURE_SCALE_NODE
            GskRenderNodeType.GSK_MASK_NODE -> MASK_NODE
            GskRenderNodeType.GSK_FILL_NODE -> FILL_NODE
            GskRenderNodeType.GSK_STROKE_NODE -> STROKE_NODE
            GskRenderNodeType.GSK_SUBSURFACE_NODE -> SUBSURFACE_NODE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of RenderNodeType
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_render_node_type_get_type()
    }
}
