// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
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
import kotlin.Result
import kotlin.String
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
 *
 * # Deprecation
 *
 * This feature was deprecated in GTK 4.16 after the new rendering infrastructure
 * introduced in 4.14 did not support it.
 * The lack of Vulkan integration would have made it a very hard feature to support.
 *
 * If you want to use OpenGL directly, you should look at [GtkGLArea](../gtk4/class.GLArea.html)
 * which uses a different approach and is still well supported.
 *
 * ## Skipped during bindings generation
 *
 * - method `format_args`: Varargs parameter is not supported
 * - parameter `uniforms`: va_list type is not supported
 */
public open class GlShader(public val gskGlShaderPointer: CPointer<GskGLShader>) :
    Object(gskGlShaderPointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Resource containing the source code for the shader.
     *
     * If the shader source is not coming from a resource, this
     * will be null.
     */
    public open val resource: String?
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.16.
         *
         * GTK's new Vulkan-focused rendering
         *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
         *   for OpenGL rendering.
         * ---
         *
         * Gets the resource path for the GLSL sourcecode being used
         * to render this shader.
         *
         * @return The resource path for the shader
         */
        get() = gsk_gl_shader_get_resource(gskGlShaderPointer)?.toKString()

    /**
     * The source code for the shader, as a `GBytes`.
     */
    public open val source: Bytes
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.16.
         *
         * GTK's new Vulkan-focused rendering
         *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
         *   for OpenGL rendering.
         * ---
         *
         * Gets the GLSL sourcecode being used to render this shader.
         *
         * @return The source code for the shader
         */
        get() = gsk_gl_shader_get_source(gskGlShaderPointer)!!.run {
            Bytes(this)
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Creates a `GskGLShader` that will render pixels using the specified code.
     *
     * @param sourcecode GLSL sourcecode for the shader, as a `GBytes`
     * @return A new `GskGLShader`
     */
    public constructor(sourcecode: Bytes) : this(gsk_gl_shader_new_from_bytes(sourcecode.glibBytesPointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Creates a `GskGLShader` that will render pixels using the specified code.
     *
     * @param resourcePath path to a resource that contains the GLSL sourcecode for
     *     the shader
     * @return A new `GskGLShader`
     */
    public constructor(resourcePath: String) : this(gsk_gl_shader_new_from_resource(resourcePath)!!) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
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
    public open fun compile(renderer: Renderer): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gsk_gl_shader_compile(gskGlShaderPointer, renderer.gskRendererPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Looks for a uniform by the name @name, and returns the index
     * of the uniform, or -1 if it was not found.
     *
     * @param name uniform name
     * @return The index of the uniform, or -1
     */
    public open fun findUniformByName(name: String): gint = gsk_gl_shader_find_uniform_by_name(gskGlShaderPointer, name)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of bool type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public open fun getArgBool(args: Bytes, idx: gint): Boolean =
        gsk_gl_shader_get_arg_bool(gskGlShaderPointer, args.glibBytesPointer, idx).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of float type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public open fun getArgFloat(args: Bytes, idx: gint): gfloat =
        gsk_gl_shader_get_arg_float(gskGlShaderPointer, args.glibBytesPointer, idx)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of int type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public open fun getArgInt(args: Bytes, idx: gint): gint =
        gsk_gl_shader_get_arg_int(gskGlShaderPointer, args.glibBytesPointer, idx)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of uint type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public open fun getArgUint(args: Bytes, idx: gint): guint =
        gsk_gl_shader_get_arg_uint(gskGlShaderPointer, args.glibBytesPointer, idx)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of vec2 type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param outValue location to store the uniform value in
     */
    public open fun getArgVec2(args: Bytes, idx: gint, outValue: Vec2): Unit =
        gsk_gl_shader_get_arg_vec2(gskGlShaderPointer, args.glibBytesPointer, idx, outValue.grapheneVec2Pointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of vec3 type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param outValue location to store the uniform value in
     */
    public open fun getArgVec3(args: Bytes, idx: gint, outValue: Vec3): Unit =
        gsk_gl_shader_get_arg_vec3(gskGlShaderPointer, args.glibBytesPointer, idx, outValue.grapheneVec3Pointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Gets the value of the uniform @idx in the @args block.
     *
     * The uniform must be of vec4 type.
     *
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param outValue location to store set the uniform value in
     */
    public open fun getArgVec4(args: Bytes, idx: gint, outValue: Vec4): Unit =
        gsk_gl_shader_get_arg_vec4(gskGlShaderPointer, args.glibBytesPointer, idx, outValue.grapheneVec4Pointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Get the size of the data block used to specify arguments for this shader.
     *
     * @return The size of the data block
     */
    public open fun getArgsSize(): gsize = gsk_gl_shader_get_args_size(gskGlShaderPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Returns the number of textures that the shader requires.
     *
     * This can be used to check that the a passed shader works
     * in your usecase. It is determined by looking at the highest
     * u_textureN value that the shader defines.
     *
     * @return The number of texture inputs required by @shader
     */
    public open fun getNTextures(): gint = gsk_gl_shader_get_n_textures(gskGlShaderPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Get the number of declared uniforms for this shader.
     *
     * @return The number of declared uniforms
     */
    public open fun getNUniforms(): gint = gsk_gl_shader_get_n_uniforms(gskGlShaderPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Get the name of the declared uniform for this shader at index @idx.
     *
     * @param idx index of the uniform
     * @return The name of the declared uniform
     */
    public open fun getUniformName(idx: gint): String =
        gsk_gl_shader_get_uniform_name(gskGlShaderPointer, idx)?.toKString() ?: error("Expected not null string")

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Get the offset into the data block where data for this uniforms is stored.
     *
     * @param idx index of the uniform
     * @return The data offset
     */
    public open fun getUniformOffset(idx: gint): gint = gsk_gl_shader_get_uniform_offset(gskGlShaderPointer, idx)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Get the type of the declared uniform for this shader at index @idx.
     *
     * @param idx index of the uniform
     * @return The type of the declared uniform
     */
    public open fun getUniformType(idx: gint): GlUniformType =
        gsk_gl_shader_get_uniform_type(gskGlShaderPointer, idx).run {
            GlUniformType.fromNativeValue(this)
        }

    public companion object : TypeCompanion<GlShader> {
        override val type: GeneratedClassKGType<GlShader> =
            GeneratedClassKGType(getTypeOrNull()!!) { GlShader(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of GLShader
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_gl_shader_get_type()

        /**
         * Gets the GType of from the symbol `gsk_gl_shader_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_gl_shader_get_type")
    }
}
