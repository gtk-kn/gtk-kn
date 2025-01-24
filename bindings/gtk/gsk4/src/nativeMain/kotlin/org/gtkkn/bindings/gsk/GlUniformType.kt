// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskGLUniformType
import org.gtkkn.native.gsk.gsk_gl_uniform_type_get_type

/**
 * This defines the types of the uniforms that `GskGLShaders`
 * declare.
 *
 * It defines both what the type is called in the GLSL shader
 * code, and what the corresponding C type is on the Gtk side.
 */
public enum class GlUniformType(public val nativeValue: GskGLUniformType) {
    /**
     * No type, used for uninitialized or unspecified values.
     */
    NONE(GskGLUniformType.GSK_GL_UNIFORM_TYPE_NONE),

    /**
     * A float uniform
     */
    FLOAT(GskGLUniformType.GSK_GL_UNIFORM_TYPE_FLOAT),

    /**
     * A GLSL int / gint32 uniform
     */
    INT(GskGLUniformType.GSK_GL_UNIFORM_TYPE_INT),

    /**
     * A GLSL uint / guint32 uniform
     */
    UINT(GskGLUniformType.GSK_GL_UNIFORM_TYPE_UINT),

    /**
     * A GLSL bool / gboolean uniform
     */
    BOOL(GskGLUniformType.GSK_GL_UNIFORM_TYPE_BOOL),

    /**
     * A GLSL vec2 / graphene_vec2_t uniform
     */
    VEC2(GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC2),

    /**
     * A GLSL vec3 / graphene_vec3_t uniform
     */
    VEC3(GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC3),

    /**
     * A GLSL vec4 / graphene_vec4_t uniform
     */
    VEC4(GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC4),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskGLUniformType): GlUniformType = when (nativeValue) {
            GskGLUniformType.GSK_GL_UNIFORM_TYPE_NONE -> NONE
            GskGLUniformType.GSK_GL_UNIFORM_TYPE_FLOAT -> FLOAT
            GskGLUniformType.GSK_GL_UNIFORM_TYPE_INT -> INT
            GskGLUniformType.GSK_GL_UNIFORM_TYPE_UINT -> UINT
            GskGLUniformType.GSK_GL_UNIFORM_TYPE_BOOL -> BOOL
            GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC2 -> VEC2
            GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC3 -> VEC3
            GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC4 -> VEC4
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of GLUniformType
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_gl_uniform_type_get_type()
    }
}
