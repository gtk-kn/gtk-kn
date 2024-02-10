// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gsk.GskGLUniformType
import org.gtkkn.native.gsk.GskGLUniformType.GSK_GL_UNIFORM_TYPE_BOOL
import org.gtkkn.native.gsk.GskGLUniformType.GSK_GL_UNIFORM_TYPE_FLOAT
import org.gtkkn.native.gsk.GskGLUniformType.GSK_GL_UNIFORM_TYPE_INT
import org.gtkkn.native.gsk.GskGLUniformType.GSK_GL_UNIFORM_TYPE_NONE
import org.gtkkn.native.gsk.GskGLUniformType.GSK_GL_UNIFORM_TYPE_UINT
import org.gtkkn.native.gsk.GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC2
import org.gtkkn.native.gsk.GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC3
import org.gtkkn.native.gsk.GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC4

/**
 * This defines the types of the uniforms that `GskGLShaders`
 * declare.
 *
 * It defines both what the type is called in the GLSL shader
 * code, and what the corresponding C type is on the Gtk side.
 */
public enum class GLUniformType(
    public val nativeValue: GskGLUniformType,
) {
    /**
     * No type, used for uninitialized or unspecified values.
     */
    NONE(GSK_GL_UNIFORM_TYPE_NONE),

    /**
     * A float uniform
     */
    FLOAT(GSK_GL_UNIFORM_TYPE_FLOAT),

    /**
     * A GLSL int / gint32 uniform
     */
    INT(GSK_GL_UNIFORM_TYPE_INT),

    /**
     * A GLSL uint / guint32 uniform
     */
    UINT(GSK_GL_UNIFORM_TYPE_UINT),

    /**
     * A GLSL bool / gboolean uniform
     */
    BOOL(GSK_GL_UNIFORM_TYPE_BOOL),

    /**
     * A GLSL vec2 / graphene_vec2_t uniform
     */
    VEC2(GSK_GL_UNIFORM_TYPE_VEC2),

    /**
     * A GLSL vec3 / graphene_vec3_t uniform
     */
    VEC3(GSK_GL_UNIFORM_TYPE_VEC3),

    /**
     * A GLSL vec4 / graphene_vec4_t uniform
     */
    VEC4(GSK_GL_UNIFORM_TYPE_VEC4),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskGLUniformType): GLUniformType =
            when (nativeValue) {
                GSK_GL_UNIFORM_TYPE_NONE -> NONE
                GSK_GL_UNIFORM_TYPE_FLOAT -> FLOAT
                GSK_GL_UNIFORM_TYPE_INT -> INT
                GSK_GL_UNIFORM_TYPE_UINT -> UINT
                GSK_GL_UNIFORM_TYPE_BOOL -> BOOL
                GSK_GL_UNIFORM_TYPE_VEC2 -> VEC2
                GSK_GL_UNIFORM_TYPE_VEC3 -> VEC3
                GSK_GL_UNIFORM_TYPE_VEC4 -> VEC4
                else -> error("invalid nativeValue")
            }
    }
}
