// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.graphene.Vec2
import org.gtkkn.bindings.graphene.Vec3
import org.gtkkn.bindings.graphene.Vec4
import org.gtkkn.bindings.gsk.Gsk.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gsk.GskGLShader
import org.gtkkn.native.gsk.gsk_gl_shader_compile
import org.gtkkn.native.gsk.gsk_gl_shader_find_uniform_by_name
import org.gtkkn.native.gsk.gsk_gl_shader_get_arg_bool
import org.gtkkn.native.gsk.gsk_gl_shader_get_arg_float
import org.gtkkn.native.gsk.gsk_gl_shader_get_arg_int
import org.gtkkn.native.gsk.gsk_gl_shader_get_arg_uint
import org.gtkkn.native.gsk.gsk_gl_shader_get_arg_vec2
import org.gtkkn.native.gsk.gsk_gl_shader_get_arg_vec3
import org.gtkkn.native.gsk.gsk_gl_shader_get_arg_vec4
import org.gtkkn.native.gsk.gsk_gl_shader_get_args_size
import org.gtkkn.native.gsk.gsk_gl_shader_get_n_textures
import org.gtkkn.native.gsk.gsk_gl_shader_get_n_uniforms
import org.gtkkn.native.gsk.gsk_gl_shader_get_resource
import org.gtkkn.native.gsk.gsk_gl_shader_get_source
import org.gtkkn.native.gsk.gsk_gl_shader_get_type
import org.gtkkn.native.gsk.gsk_gl_shader_get_uniform_name
import org.gtkkn.native.gsk.gsk_gl_shader_get_uniform_offset
import org.gtkkn.native.gsk.gsk_gl_shader_get_uniform_type
import org.gtkkn.native.gsk.gsk_gl_shader_new_from_bytes
import org.gtkkn.native.gsk.gsk_gl_shader_new_from_resource
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * A `GskGLShader` is a snippet of GLSL that is meant to run in the
 * fragment shader of the rendering pipeline.
 *
 * A fragment shader gets the coordinates being rendered as input and
 * produces the pixel values for that particular pixel. Additionally,
 * the shader can declare a set of other input arguments, called
 * uniforms (as they are uniform over all the calls to your shader in
 * each instance of use). A shader can also receive up to 4
 * textures that it can use as input when producing the pixel data.
 *
 * `GskGLShader` is usually used with gtk_snapshot_push_gl_shader()
 * to produce a [class@Gsk.GLShaderNode] in the rendering hierarchy,
 * and then its input textures are constructed by rendering the child
 * nodes to textures before rendering the shader node itself. (You can
 * pass texture nodes as children if you want to directly use a texture
 * as input).
 *
 * The actual shader code is GLSL code that gets combined with
 * some other code into the fragment shader. Since the exact
 * capabilities of the GPU driver differs between different OpenGL
 * drivers and hardware, GTK adds some defines that you can use
 * to ensure your GLSL code runs on as many drivers as it can.
 *
 * If the OpenGL driver is GLES, then the shader language version
 * is set to 100, and GSK_GLES will be defined in the shader.
 *
 * Otherwise, if the OpenGL driver does not support the 3.2 core profile,
 * then the shader will run with language version 110 for GL2 and 130 for GL3,
 * and GSK_LEGACY will be defined in the shader.
 *
 * If the OpenGL driver supports the 3.2 code profile, it will be used,
 * the shader language version is set to 150, and GSK_GL3 will be defined
 * in the shader.
 *
 * The main function the shader must implement is:
 *
 * ```glsl
 *  void mainImage(out vec4 fragColor,
 *                 in vec2 fragCoord,
 *                 in vec2 resolution,
 *                 in vec2 uv)
 * ```
 *
 * Where the input @fragCoord is the coordinate of the pixel we're
 * currently rendering, relative to the boundary rectangle that was
 * specified in the `GskGLShaderNode`, and @resolution is the width and
 * height of that rectangle. This is in the typical GTK coordinate
 * system with the origin in the top left. @uv contains the u and v
 * coordinates that can be used to index a texture at the
 * corresponding point. These coordinates are in the [0..1]x[0..1]
 * region, with 0, 0 being in the lower left corder (which is typical
 * for OpenGL).
 *
 * The output @fragColor should be a RGBA color (with
 * premultiplied alpha) that will be used as the output for the
 * specified pixel location. Note that this output will be
 * automatically clipped to the clip region of the glshader node.
 *
 * In addition to the function arguments the shader can define
 * up to 4 uniforms for textures which must be called u_textureN
 * (i.e. u_texture1 to u_texture4) as well as any custom uniforms
 * you want of types int, uint, bool, float, vec2, vec3 or vec4.
 *
 * All textures sources contain premultiplied alpha colors, but if some
 * there are outer sources of colors there is a gsk_premultiply() helper
 * to compute premultiplication when needed.
 *
 * Note that GTK parses the uniform declarations, so each uniform has to
 * be on a line by itself with no other code, like so:
 *
 * ```glsl
 * uniform float u_time;
 * uniform vec3 u_color;
 * uniform sampler2D u_texture1;
 * uniform sampler2D u_texture2;
 * ```
 *
 * GTK uses the "gsk" namespace in the symbols it uses in the
 * shader, so your code should not use any symbols with the prefix gsk
 * or GSK. There are some helper functions declared that you can use:
 *
 * ```glsl
 * vec4 GskTexture(sampler2D sampler, vec2 texCoords);
 * ```
 *
 * This samples a texture (e.g. u_texture1) at the specified
 * coordinates, and contains some helper ifdefs to ensure that
 * it works on all OpenGL versions.
 *
 * You can compile the shader yourself using [method@Gsk.GLShader.compile],
 * otherwise the GSK renderer will do it when it handling the glshader
 * node. If errors occurs, the returned @error will include the glsl
 * sources, so you can see what GSK was passing to the compiler. You
 * can also set GSK_DEBUG=shaders in the environment to see the sources
 * and other relevant information about all shaders that GSK is handling.
 *
 * # An example shader
 *
 * ```glsl
 * uniform float position;
 * uniform sampler2D u_texture1;
 * uniform sampler2D u_texture2;
 *
 * void mainImage(out vec4 fragColor,
 *                in vec2 fragCoord,
 *                in vec2 resolution,
 *                in vec2 uv) {
 *   vec4 source1 = GskTexture(u_texture1, uv);
 *   vec4 source2 = GskTexture(u_texture2, uv);
 *
 *   fragColor = position * source1 + (1.0 - position) * source2;
 * }
 * ```
 */
public open class GLShader(
    pointer: CPointer<GskGLShader>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gskGLShaderPointer: CPointer<GskGLShader>
        get() = gPointer.reinterpret()

    /**
     * Resource containing the source code for the shader.
     *
     * If the shader source is not coming from a resource, this
     * will be null.
     */
    public open val resource: String?
        /**
         * Gets the resource path for the GLSL sourcecode being used
         * to render this shader.
         *
         * @return The resource path for the shader
         */
        get() = gsk_gl_shader_get_resource(gskGLShaderPointer.reinterpret())?.toKString()

    public open val source: Bytes
        /**
         * Gets the GLSL sourcecode being used to render this shader.
         *
         * @return The source code for the shader
         */
        get() =
            gsk_gl_shader_get_source(gskGLShaderPointer.reinterpret())!!.run {
                Bytes(reinterpret())
            }

    /**
     * Creates a `GskGLShader` that will render pixels using the specified code.
     *
     * @param sourcecode GLSL sourcecode for the shader, as a `GBytes`
     * @return A new `GskGLShader`
     */
    public constructor(
        sourcecode: Bytes,
    ) : this(gsk_gl_shader_new_from_bytes(sourcecode.glibBytesPointer)!!.reinterpret())

    /**
     * Creates a `GskGLShader` that will render pixels using the specified code.
     *
     * @param resourcePath path to a resource that contains the GLSL sourcecode for
     *     the shader
     * @return A new `GskGLShader`
     */
    public constructor(resourcePath: String) : this(gsk_gl_shader_new_from_resource(resourcePath)!!.reinterpret())

    /**
     * Tries to compile the @shader for the given @renderer.
     *
     * If there is a problem, this function returns false and reports
     * an error. You should use this function before relying on the shader
     * for rendering and use a fallback with a simpler shader or without
     * shaders if it fails.
     *
     * Note that this will modify the rendering state (for example
     * change the current GL context) and requires the renderer to be
     * set up. This means that the widget has to be realized. Commonly you
     * want to call this from the realize signal of a widget, or during
     * widget snapshot.
     *
     * @param renderer a `GskRenderer`
     * @return true on success, false if an error occurred
     */
    public open fun compile(renderer: Renderer): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gsk_gl_shader_compile(
                    gskGLShaderPointer.reinterpret(),
                    renderer.gskRendererPointer.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Looks for a uniform by the name @name, and returns the index
     * of the uniform, or -1 if it was not found.
     *
     * @param name uniform name
     * @return The index of the uniform, or -1
     */
    public open fun findUniformByName(name: String): Int =
        gsk_gl_shader_find_uniform_by_name(gskGLShaderPointer.reinterpret(), name)

    /**
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of bool type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public open fun getArgBool(
        args: Bytes,
        idx: Int,
    ): Boolean = gsk_gl_shader_get_arg_bool(gskGLShaderPointer.reinterpret(), args.glibBytesPointer, idx).asBoolean()

    /**
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of float type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public open fun getArgFloat(
        args: Bytes,
        idx: Int,
    ): Float = gsk_gl_shader_get_arg_float(gskGLShaderPointer.reinterpret(), args.glibBytesPointer, idx)

    /**
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of int type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public open fun getArgInt(
        args: Bytes,
        idx: Int,
    ): Int = gsk_gl_shader_get_arg_int(gskGLShaderPointer.reinterpret(), args.glibBytesPointer, idx)

    /**
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of uint type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public open fun getArgUint(
        args: Bytes,
        idx: Int,
    ): UInt = gsk_gl_shader_get_arg_uint(gskGLShaderPointer.reinterpret(), args.glibBytesPointer, idx)

    /**
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of vec2 type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param outValue location to store the uniform value in
     */
    public open fun getArgVec2(
        args: Bytes,
        idx: Int,
        outValue: Vec2,
    ): Unit =
        gsk_gl_shader_get_arg_vec2(
            gskGLShaderPointer.reinterpret(),
            args.glibBytesPointer,
            idx,
            outValue.grapheneVec2Pointer
        )

    /**
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of vec3 type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param outValue location to store the uniform value in
     */
    public open fun getArgVec3(
        args: Bytes,
        idx: Int,
        outValue: Vec3,
    ): Unit =
        gsk_gl_shader_get_arg_vec3(
            gskGLShaderPointer.reinterpret(),
            args.glibBytesPointer,
            idx,
            outValue.grapheneVec3Pointer
        )

    /**
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of vec4 type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param outValue location to store set the uniform value in
     */
    public open fun getArgVec4(
        args: Bytes,
        idx: Int,
        outValue: Vec4,
    ): Unit =
        gsk_gl_shader_get_arg_vec4(
            gskGLShaderPointer.reinterpret(),
            args.glibBytesPointer,
            idx,
            outValue.grapheneVec4Pointer
        )

    /**
     * Get the size of the data block used to specify arguments for this shader.
     *
     * @return The size of the data block
     */
    public open fun getArgsSize(): ULong = gsk_gl_shader_get_args_size(gskGLShaderPointer.reinterpret())

    /**
     * Returns the number of textures that the shader requires.
     *
     * This can be used to check that the a passed shader works
     * in your usecase. It is determined by looking at the highest
     * u_textureN value that the shader defines.
     *
     * @return The number of texture inputs required by @shader
     */
    public open fun getNTextures(): Int = gsk_gl_shader_get_n_textures(gskGLShaderPointer.reinterpret())

    /**
     * Get the number of declared uniforms for this shader.
     *
     * @return The number of declared uniforms
     */
    public open fun getNUniforms(): Int = gsk_gl_shader_get_n_uniforms(gskGLShaderPointer.reinterpret())

    /**
     * Gets the resource path for the GLSL sourcecode being used
     * to render this shader.
     *
     * @return The resource path for the shader
     */
    public open fun getResource(): String? = gsk_gl_shader_get_resource(gskGLShaderPointer.reinterpret())?.toKString()

    /**
     * Gets the GLSL sourcecode being used to render this shader.
     *
     * @return The source code for the shader
     */
    public open fun getSource(): Bytes =
        gsk_gl_shader_get_source(gskGLShaderPointer.reinterpret())!!.run {
            Bytes(reinterpret())
        }

    /**
     * Get the name of the declared uniform for this shader at index @idx.
     *
     * @param idx index of the uniform
     * @return The name of the declared uniform
     */
    public open fun getUniformName(idx: Int): String =
        gsk_gl_shader_get_uniform_name(gskGLShaderPointer.reinterpret(), idx)?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the offset into the data block where data for this uniforms is stored.
     *
     * @param idx index of the uniform
     * @return The data offset
     */
    public open fun getUniformOffset(idx: Int): Int =
        gsk_gl_shader_get_uniform_offset(gskGLShaderPointer.reinterpret(), idx)

    /**
     * Get the type of the declared uniform for this shader at index @idx.
     *
     * @param idx index of the uniform
     * @return The type of the declared uniform
     */
    public open fun getUniformType(idx: Int): GLUniformType =
        gsk_gl_shader_get_uniform_type(gskGLShaderPointer.reinterpret(), idx).run {
            GLUniformType.fromNativeValue(this)
        }

    public companion object : TypeCompanion<GLShader> {
        override val type: GeneratedClassKGType<GLShader> =
            GeneratedClassKGType(gsk_gl_shader_get_type()) { GLShader(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
