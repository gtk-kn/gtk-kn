// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gsk.GskRenderNodeType
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_BLEND_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_BLUR_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_BORDER_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_CAIRO_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_CLIP_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_COLOR_MATRIX_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_COLOR_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_CONIC_GRADIENT_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_CONTAINER_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_CROSS_FADE_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_DEBUG_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_GL_SHADER_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_INSET_SHADOW_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_LINEAR_GRADIENT_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_NOT_A_RENDER_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_OPACITY_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_OUTSET_SHADOW_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_RADIAL_GRADIENT_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_REPEATING_LINEAR_GRADIENT_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_REPEATING_RADIAL_GRADIENT_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_REPEAT_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_ROUNDED_CLIP_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_SHADOW_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_TEXTURE_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_TEXT_NODE
import org.gtkkn.native.gsk.GskRenderNodeType.GSK_TRANSFORM_NODE

/**
 * The type of a node determines what the node is rendering.
 */
public enum class RenderNodeType(
    public val nativeValue: GskRenderNodeType,
) {
    /**
     * Error type. No node will ever have this type.
     */
    NOT_A_RENDER_NODE(GSK_NOT_A_RENDER_NODE),

    /**
     * A node containing a stack of children
     */
    CONTAINER_NODE(GSK_CONTAINER_NODE),

    /**
     * A node drawing a `cairo_surface_t`
     */
    CAIRO_NODE(GSK_CAIRO_NODE),

    /**
     * A node drawing a single color rectangle
     */
    COLOR_NODE(GSK_COLOR_NODE),

    /**
     * A node drawing a linear gradient
     */
    LINEAR_GRADIENT_NODE(GSK_LINEAR_GRADIENT_NODE),

    /**
     * A node drawing a repeating linear gradient
     */
    REPEATING_LINEAR_GRADIENT_NODE(GSK_REPEATING_LINEAR_GRADIENT_NODE),

    /**
     * A node drawing a radial gradient
     */
    RADIAL_GRADIENT_NODE(GSK_RADIAL_GRADIENT_NODE),

    /**
     * A node drawing a repeating radial gradient
     */
    REPEATING_RADIAL_GRADIENT_NODE(GSK_REPEATING_RADIAL_GRADIENT_NODE),

    /**
     * A node drawing a conic gradient
     */
    CONIC_GRADIENT_NODE(GSK_CONIC_GRADIENT_NODE),

    /**
     * A node stroking a border around an area
     */
    BORDER_NODE(GSK_BORDER_NODE),

    /**
     * A node drawing a `GdkTexture`
     */
    TEXTURE_NODE(GSK_TEXTURE_NODE),

    /**
     * A node drawing an inset shadow
     */
    INSET_SHADOW_NODE(GSK_INSET_SHADOW_NODE),

    /**
     * A node drawing an outset shadow
     */
    OUTSET_SHADOW_NODE(GSK_OUTSET_SHADOW_NODE),

    /**
     * A node that renders its child after applying a matrix transform
     */
    TRANSFORM_NODE(GSK_TRANSFORM_NODE),

    /**
     * A node that changes the opacity of its child
     */
    OPACITY_NODE(GSK_OPACITY_NODE),

    /**
     * A node that applies a color matrix to every pixel
     */
    COLOR_MATRIX_NODE(GSK_COLOR_MATRIX_NODE),

    /**
     * A node that repeats the child's contents
     */
    REPEAT_NODE(GSK_REPEAT_NODE),

    /**
     * A node that clips its child to a rectangular area
     */
    CLIP_NODE(GSK_CLIP_NODE),

    /**
     * A node that clips its child to a rounded rectangle
     */
    ROUNDED_CLIP_NODE(GSK_ROUNDED_CLIP_NODE),

    /**
     * A node that draws a shadow below its child
     */
    SHADOW_NODE(GSK_SHADOW_NODE),

    /**
     * A node that blends two children together
     */
    BLEND_NODE(GSK_BLEND_NODE),

    /**
     * A node that cross-fades between two children
     */
    CROSS_FADE_NODE(GSK_CROSS_FADE_NODE),

    /**
     * A node containing a glyph string
     */
    TEXT_NODE(GSK_TEXT_NODE),

    /**
     * A node that applies a blur
     */
    BLUR_NODE(GSK_BLUR_NODE),

    /**
     * Debug information that does not affect the rendering
     */
    DEBUG_NODE(GSK_DEBUG_NODE),

    /**
     * A node that uses OpenGL fragment shaders to render
     */
    GL_SHADER_NODE(GSK_GL_SHADER_NODE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskRenderNodeType): RenderNodeType =
            when (nativeValue) {
                GSK_NOT_A_RENDER_NODE -> NOT_A_RENDER_NODE
                GSK_CONTAINER_NODE -> CONTAINER_NODE
                GSK_CAIRO_NODE -> CAIRO_NODE
                GSK_COLOR_NODE -> COLOR_NODE
                GSK_LINEAR_GRADIENT_NODE -> LINEAR_GRADIENT_NODE
                GSK_REPEATING_LINEAR_GRADIENT_NODE -> REPEATING_LINEAR_GRADIENT_NODE
                GSK_RADIAL_GRADIENT_NODE -> RADIAL_GRADIENT_NODE
                GSK_REPEATING_RADIAL_GRADIENT_NODE -> REPEATING_RADIAL_GRADIENT_NODE
                GSK_CONIC_GRADIENT_NODE -> CONIC_GRADIENT_NODE
                GSK_BORDER_NODE -> BORDER_NODE
                GSK_TEXTURE_NODE -> TEXTURE_NODE
                GSK_INSET_SHADOW_NODE -> INSET_SHADOW_NODE
                GSK_OUTSET_SHADOW_NODE -> OUTSET_SHADOW_NODE
                GSK_TRANSFORM_NODE -> TRANSFORM_NODE
                GSK_OPACITY_NODE -> OPACITY_NODE
                GSK_COLOR_MATRIX_NODE -> COLOR_MATRIX_NODE
                GSK_REPEAT_NODE -> REPEAT_NODE
                GSK_CLIP_NODE -> CLIP_NODE
                GSK_ROUNDED_CLIP_NODE -> ROUNDED_CLIP_NODE
                GSK_SHADOW_NODE -> SHADOW_NODE
                GSK_BLEND_NODE -> BLEND_NODE
                GSK_CROSS_FADE_NODE -> CROSS_FADE_NODE
                GSK_TEXT_NODE -> TEXT_NODE
                GSK_BLUR_NODE -> BLUR_NODE
                GSK_DEBUG_NODE -> DEBUG_NODE
                GSK_GL_SHADER_NODE -> GL_SHADER_NODE
                else -> error("invalid nativeValue")
            }
    }
}
