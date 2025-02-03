// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.graphene.Vec2
import org.gtkkn.bindings.graphene.Vec3
import org.gtkkn.bindings.graphene.Vec4
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskShaderArgsBuilder
import org.gtkkn.native.gsk.gsk_shader_args_builder_free_to_args
import org.gtkkn.native.gsk.gsk_shader_args_builder_get_type
import org.gtkkn.native.gsk.gsk_shader_args_builder_new
import org.gtkkn.native.gsk.gsk_shader_args_builder_ref
import org.gtkkn.native.gsk.gsk_shader_args_builder_set_bool
import org.gtkkn.native.gsk.gsk_shader_args_builder_set_float
import org.gtkkn.native.gsk.gsk_shader_args_builder_set_int
import org.gtkkn.native.gsk.gsk_shader_args_builder_set_uint
import org.gtkkn.native.gsk.gsk_shader_args_builder_set_vec2
import org.gtkkn.native.gsk.gsk_shader_args_builder_set_vec3
import org.gtkkn.native.gsk.gsk_shader_args_builder_set_vec4
import org.gtkkn.native.gsk.gsk_shader_args_builder_to_args
import org.gtkkn.native.gsk.gsk_shader_args_builder_unref
import kotlin.Boolean
import kotlin.Unit

/**
 * An object to build the uniforms data for a `GskGLShader`.
 */
public class ShaderArgsBuilder(public val gskShaderArgsBuilderPointer: CPointer<GskShaderArgsBuilder>) :
    ProxyInstance(gskShaderArgsBuilderPointer) {
    /**
     * Allocates a builder that can be used to construct a new uniform data
     * chunk.
     *
     * @param shader a `GskGLShader`
     * @param initialValues optional `GBytes` with initial values
     * @return The newly allocated builder, free with
     *     [method@Gsk.ShaderArgsBuilder.unref]
     */
    public constructor(
        shader: GlShader,
        initialValues: Bytes? = null,
    ) : this(gsk_shader_args_builder_new(shader.gskGlShaderPointer, initialValues?.glibBytesPointer)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Creates a new `GBytes` args from the current state of the
     * given @builder, and frees the @builder instance.
     *
     * Any uniforms of the shader that have not been explicitly set
     * on the @builder are zero-initialized.
     *
     * @return the newly allocated buffer with
     *   all the args added to @builder
     */
    public fun freeToArgs(): Bytes = gsk_shader_args_builder_free_to_args(gskShaderArgsBuilderPointer)!!.run {
        Bytes(this)
    }

    /**
     * Increases the reference count of a `GskShaderArgsBuilder` by one.
     *
     * @return the passed in `GskShaderArgsBuilder`
     */
    public fun ref(): ShaderArgsBuilder = gsk_shader_args_builder_ref(gskShaderArgsBuilderPointer)!!.run {
        ShaderArgsBuilder(this)
    }

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of bool type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public fun setBool(idx: gint, `value`: Boolean): Unit =
        gsk_shader_args_builder_set_bool(gskShaderArgsBuilderPointer, idx, `value`.asGBoolean())

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of float type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public fun setFloat(idx: gint, `value`: gfloat): Unit =
        gsk_shader_args_builder_set_float(gskShaderArgsBuilderPointer, idx, `value`)

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of int type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public fun setInt(idx: gint, `value`: gint): Unit =
        gsk_shader_args_builder_set_int(gskShaderArgsBuilderPointer, idx, `value`)

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of uint type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public fun setUint(idx: gint, `value`: guint): Unit =
        gsk_shader_args_builder_set_uint(gskShaderArgsBuilderPointer, idx, `value`)

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of vec2 type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform too
     */
    public fun setVec2(idx: gint, `value`: Vec2): Unit =
        gsk_shader_args_builder_set_vec2(gskShaderArgsBuilderPointer, idx, `value`.grapheneVec2Pointer)

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of vec3 type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform too
     */
    public fun setVec3(idx: gint, `value`: Vec3): Unit =
        gsk_shader_args_builder_set_vec3(gskShaderArgsBuilderPointer, idx, `value`.grapheneVec3Pointer)

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of vec4 type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform too
     */
    public fun setVec4(idx: gint, `value`: Vec4): Unit =
        gsk_shader_args_builder_set_vec4(gskShaderArgsBuilderPointer, idx, `value`.grapheneVec4Pointer)

    /**
     * Creates a new `GBytes` args from the current state of the
     * given @builder.
     *
     * Any uniforms of the shader that have not been explicitly set on
     * the @builder are zero-initialized.
     *
     * The given `GskShaderArgsBuilder` is reset once this function returns;
     * you cannot call this function multiple times on the same @builder instance.
     *
     * This function is intended primarily for bindings. C code should use
     * [method@Gsk.ShaderArgsBuilder.free_to_args].
     *
     * @return the newly allocated buffer with
     *   all the args added to @builder
     */
    public fun toArgs(): Bytes = gsk_shader_args_builder_to_args(gskShaderArgsBuilderPointer)!!.run {
        Bytes(this)
    }

    /**
     * Decreases the reference count of a `GskShaderArgBuilder` by one.
     *
     * If the resulting reference count is zero, frees the builder.
     */
    public fun unref(): Unit = gsk_shader_args_builder_unref(gskShaderArgsBuilderPointer)

    public companion object {
        /**
         * Get the GType of ShaderArgsBuilder
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_shader_args_builder_get_type()
    }
}
