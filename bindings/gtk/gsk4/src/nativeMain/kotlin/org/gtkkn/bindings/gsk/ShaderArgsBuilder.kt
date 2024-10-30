// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.graphene.Vec2
import org.gtkkn.bindings.graphene.Vec3
import org.gtkkn.bindings.graphene.Vec4
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gsk.GskShaderArgsBuilder
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
import kotlin.Float
import kotlin.Int
import kotlin.UInt
import kotlin.Unit

/**
 * An object to build the uniforms data for a `GskGLShader`.
 */
public class ShaderArgsBuilder(
    pointer: CPointer<GskShaderArgsBuilder>,
) : Record {
    public val gskShaderArgsBuilderPointer: CPointer<GskShaderArgsBuilder> = pointer

    /**
     * Increases the reference count of a `GskShaderArgsBuilder` by one.
     *
     * @return the passed in `GskShaderArgsBuilder`
     */
    public fun ref(): ShaderArgsBuilder =
        gsk_shader_args_builder_ref(gskShaderArgsBuilderPointer.reinterpret())!!.run {
            ShaderArgsBuilder(reinterpret())
        }

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of bool type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public fun setBool(
        idx: Int,
        `value`: Boolean,
    ): Unit = gsk_shader_args_builder_set_bool(gskShaderArgsBuilderPointer.reinterpret(), idx, `value`.asGBoolean())

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of float type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public fun setFloat(
        idx: Int,
        `value`: Float,
    ): Unit = gsk_shader_args_builder_set_float(gskShaderArgsBuilderPointer.reinterpret(), idx, `value`)

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of int type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public fun setInt(
        idx: Int,
        `value`: Int,
    ): Unit = gsk_shader_args_builder_set_int(gskShaderArgsBuilderPointer.reinterpret(), idx, `value`)

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of uint type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public fun setUint(
        idx: Int,
        `value`: UInt,
    ): Unit = gsk_shader_args_builder_set_uint(gskShaderArgsBuilderPointer.reinterpret(), idx, `value`)

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of vec2 type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform too
     */
    public fun setVec2(
        idx: Int,
        `value`: Vec2,
    ): Unit =
        gsk_shader_args_builder_set_vec2(gskShaderArgsBuilderPointer.reinterpret(), idx, `value`.grapheneVec2Pointer)

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of vec3 type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform too
     */
    public fun setVec3(
        idx: Int,
        `value`: Vec3,
    ): Unit =
        gsk_shader_args_builder_set_vec3(gskShaderArgsBuilderPointer.reinterpret(), idx, `value`.grapheneVec3Pointer)

    /**
     * Sets the value of the uniform @idx.
     *
     * The uniform must be of vec4 type.
     *
     * @param idx index of the uniform
     * @param value value to set the uniform too
     */
    public fun setVec4(
        idx: Int,
        `value`: Vec4,
    ): Unit =
        gsk_shader_args_builder_set_vec4(gskShaderArgsBuilderPointer.reinterpret(), idx, `value`.grapheneVec4Pointer)

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
    public fun toArgs(): Bytes =
        gsk_shader_args_builder_to_args(gskShaderArgsBuilderPointer.reinterpret())!!.run {
            Bytes(reinterpret())
        }

    /**
     * Decreases the reference count of a `GskShaderArgBuilder` by one.
     *
     * If the resulting reference count is zero, frees the builder.
     */
    public fun unref(): Unit = gsk_shader_args_builder_unref(gskShaderArgsBuilderPointer.reinterpret())

    public companion object : RecordCompanion<ShaderArgsBuilder, GskShaderArgsBuilder> {
        /**
         * Allocates a builder that can be used to construct a new uniform data
         * chunk.
         *
         * @param shader a `GskGLShader`
         * @param initialValues optional `GBytes` with initial values
         * @return The newly allocated builder, free with
         *     [method@Gsk.ShaderArgsBuilder.unref]
         */
        public fun new(
            shader: GLShader,
            initialValues: Bytes? = null,
        ): ShaderArgsBuilder =
            ShaderArgsBuilder(
                gsk_shader_args_builder_new(
                    shader.gskGLShaderPointer.reinterpret(),
                    initialValues?.glibBytesPointer
                )!!.reinterpret()
            )

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ShaderArgsBuilder =
            ShaderArgsBuilder(pointer.reinterpret())
    }
}