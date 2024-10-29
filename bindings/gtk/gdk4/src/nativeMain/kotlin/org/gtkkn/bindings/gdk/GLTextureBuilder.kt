// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkGLTextureBuilder
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_context
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_format
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_has_mipmap
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_height
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_id
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_type
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_update_texture
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_width
import org.gtkkn.native.gdk.gdk_gl_texture_builder_new
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_context
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_format
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_has_mipmap
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_height
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_id
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_update_texture
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_width
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit

/**
 * `GdkGLTextureBuilder` is a builder used to construct [class@Gdk.Texture] objects from
 * GL textures.
 *
 * The operation is quite simple: Create a texture builder, set all the necessary
 * properties - keep in mind that the properties [property@Gdk.GLTextureBuilder:context],
 * [property@Gdk.GLTextureBuilder:id], [property@Gdk.GLTextureBuilder:width], and
 * [property@Gdk.GLTextureBuilder:height] are mandatory - and then call
 * [method@Gdk.GLTextureBuilder.build] to create the new texture.
 *
 * `GdkGLTextureBuilder` can be used for quick one-shot construction of
 * textures as well as kept around and reused to construct multiple textures.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `destroy`: GLib.DestroyNotify
 * - method `get_sync`: Return type gpointer is unsupported
 * - method `get_update_region`: Return type cairo.Region is unsupported
 * - parameter `sync`: gpointer
 * - parameter `region`: cairo.Region
 * - method `sync`: Property has no getter nor setter
 * - method `update-region`: Property has no getter nor setter
 *
 * @since 4.12
 */
public open class GLTextureBuilder(
    pointer: CPointer<GdkGLTextureBuilder>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gdkGLTextureBuilderPointer: CPointer<GdkGLTextureBuilder>
        get() = gPointer.reinterpret()

    /**
     * The context owning the texture.
     *
     * @since 4.12
     */
    public open var context: GLContext?
        /**
         * Gets the context previously set via gdk_gl_texture_builder_set_context() or
         * null if none was set.
         *
         * @return The context
         * @since 4.12
         */
        get() =
            gdk_gl_texture_builder_get_context(gdkGLTextureBuilderPointer.reinterpret())?.run {
                GLContext(reinterpret())
            }

        /**
         * Sets the context to be used for the texture. This is the context that owns
         * the texture.
         *
         * The context must be set before calling [method@Gdk.GLTextureBuilder.build].
         *
         * @param context The context the texture beongs to or null to unset
         * @since 4.12
         */
        set(context) =
            gdk_gl_texture_builder_set_context(
                gdkGLTextureBuilderPointer.reinterpret(),
                context?.gdkGLContextPointer?.reinterpret()
            )

    /**
     * The format when downloading the texture.
     *
     * @since 4.12
     */
    public open var format: MemoryFormat
        /**
         * Gets the format previously set via gdk_gl_texture_builder_set_format().
         *
         * @return The format
         * @since 4.12
         */
        get() =
            gdk_gl_texture_builder_get_format(gdkGLTextureBuilderPointer.reinterpret()).run {
                MemoryFormat.fromNativeValue(this)
            }

        /**
         * Sets the format of the texture. The default is `GDK_MEMORY_R8G8B8A8_PREMULTIPLIED`.
         *
         * The format is the preferred format the texture data should be downloaded to. The
         * format must be supported by the GL version of [property@Gdk.GLTextureBuilder:context].
         *
         * GDK's texture download code assumes that the format corresponds to the storage
         * parameters of the GL texture in an obvious way. For example, a format of
         * `GDK_MEMORY_R16G16B16A16_PREMULTIPLIED` is expected to be stored as `GL_RGBA16`
         * texture, and `GDK_MEMORY_G8A8` is expected to be stored as `GL_RG8` texture.
         *
         * Setting the right format is particularly useful when using high bit depth textures
         * to preserve the bit depth, to set the correct value for unpremultiplied textures
         * and to make sure opaque textures are treated as such.
         *
         * Non-RGBA textures need to have swizzling parameters set up properly to be usable
         * in GSK's shaders.
         *
         * @param format The texture's format
         * @since 4.12
         */
        set(format) =
            gdk_gl_texture_builder_set_format(
                gdkGLTextureBuilderPointer.reinterpret(),
                format.nativeValue
            )

    /**
     * If the texture has a mipmap.
     *
     * @since 4.12
     */
    public open var hasMipmap: Boolean
        /**
         * Gets whether the texture has a mipmap.
         *
         * @return Whether the texture has a mipmap
         * @since 4.12
         */
        get() =
            gdk_gl_texture_builder_get_has_mipmap(gdkGLTextureBuilderPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the texture has a mipmap. This allows the renderer and other users of the
         * generated texture to use a higher quality downscaling.
         *
         * Typically, the `glGenerateMipmap` function is used to generate a mimap.
         *
         * @param hasMipmap Whether the texture has a mipmap
         * @since 4.12
         */
        set(hasMipmap) =
            gdk_gl_texture_builder_set_has_mipmap(
                gdkGLTextureBuilderPointer.reinterpret(),
                hasMipmap.asGBoolean()
            )

    /**
     * The height of the texture.
     *
     * @since 4.12
     */
    public open var height: Int
        /**
         * Gets the height previously set via gdk_gl_texture_builder_set_height() or
         * 0 if the height wasn't set.
         *
         * @return The height
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_height(gdkGLTextureBuilderPointer.reinterpret())

        /**
         * Sets the height of the texture.
         *
         * The height must be set before calling [method@Gdk.GLTextureBuilder.build].
         *
         * @param height The texture's height or 0 to unset
         * @since 4.12
         */
        set(height) =
            gdk_gl_texture_builder_set_height(
                gdkGLTextureBuilderPointer.reinterpret(),
                height
            )

    /**
     * The texture ID to use.
     *
     * @since 4.12
     */
    public open var id: UInt
        /**
         * Gets the texture id previously set via gdk_gl_texture_builder_set_id() or
         * 0 if the id wasn't set.
         *
         * @return The id
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_id(gdkGLTextureBuilderPointer.reinterpret())

        /**
         * Sets the texture id of the texture. The texture id must remain unmodified
         * until the texture was finalized. See [method@Gdk.GLTextureBuilder.build]
         * for a longer discussion.
         *
         * The id must be set before calling [method@Gdk.GLTextureBuilder.build].
         *
         * @param id The texture id to be used for creating the texture
         * @since 4.12
         */
        set(id) = gdk_gl_texture_builder_set_id(gdkGLTextureBuilderPointer.reinterpret(), id)

    /**
     * The texture [property@Gdk.GLTextureBuilder:update-region] is an update for.
     *
     * @since 4.12
     */
    public open var updateTexture: Texture?
        /**
         * Gets the texture previously set via gdk_gl_texture_builder_set_update_texture() or
         * null if none was set.
         *
         * @return The texture
         * @since 4.12
         */
        get() =
            gdk_gl_texture_builder_get_update_texture(gdkGLTextureBuilderPointer.reinterpret())?.run {
                Texture(reinterpret())
            }

        /**
         * Sets the texture to be updated by this texture. See
         * [method@Gdk.GLTextureBuilder.set_update_region] for an explanation.
         *
         * @param texture the texture to update
         * @since 4.12
         */
        set(texture) =
            gdk_gl_texture_builder_set_update_texture(
                gdkGLTextureBuilderPointer.reinterpret(),
                texture?.gdkTexturePointer?.reinterpret()
            )

    /**
     * The width of the texture.
     *
     * @since 4.12
     */
    public open var width: Int
        /**
         * Gets the width previously set via gdk_gl_texture_builder_set_width() or
         * 0 if the width wasn't set.
         *
         * @return The width
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_width(gdkGLTextureBuilderPointer.reinterpret())

        /**
         * Sets the width of the texture.
         *
         * The width must be set before calling [method@Gdk.GLTextureBuilder.build].
         *
         * @param width The texture's width or 0 to unset
         * @since 4.12
         */
        set(width) =
            gdk_gl_texture_builder_set_width(
                gdkGLTextureBuilderPointer.reinterpret(),
                width
            )

    /**
     * Creates a new texture builder.
     *
     * @return the new `GdkTextureBuilder`
     * @since 4.12
     */
    public constructor() : this(gdk_gl_texture_builder_new()!!.reinterpret())

    /**
     * Gets the context previously set via gdk_gl_texture_builder_set_context() or
     * null if none was set.
     *
     * @return The context
     * @since 4.12
     */
    public open fun getContext(): GLContext? =
        gdk_gl_texture_builder_get_context(gdkGLTextureBuilderPointer.reinterpret())?.run {
            GLContext(reinterpret())
        }

    /**
     * Gets the format previously set via gdk_gl_texture_builder_set_format().
     *
     * @return The format
     * @since 4.12
     */
    public open fun getFormat(): MemoryFormat =
        gdk_gl_texture_builder_get_format(gdkGLTextureBuilderPointer.reinterpret()).run {
            MemoryFormat.fromNativeValue(this)
        }

    /**
     * Gets whether the texture has a mipmap.
     *
     * @return Whether the texture has a mipmap
     * @since 4.12
     */
    public open fun getHasMipmap(): Boolean =
        gdk_gl_texture_builder_get_has_mipmap(gdkGLTextureBuilderPointer.reinterpret()).asBoolean()

    /**
     * Gets the height previously set via gdk_gl_texture_builder_set_height() or
     * 0 if the height wasn't set.
     *
     * @return The height
     * @since 4.12
     */
    public open fun getHeight(): Int = gdk_gl_texture_builder_get_height(gdkGLTextureBuilderPointer.reinterpret())

    /**
     * Gets the texture id previously set via gdk_gl_texture_builder_set_id() or
     * 0 if the id wasn't set.
     *
     * @return The id
     * @since 4.12
     */
    public open fun getId(): UInt = gdk_gl_texture_builder_get_id(gdkGLTextureBuilderPointer.reinterpret())

    /**
     * Gets the texture previously set via gdk_gl_texture_builder_set_update_texture() or
     * null if none was set.
     *
     * @return The texture
     * @since 4.12
     */
    public open fun getUpdateTexture(): Texture? =
        gdk_gl_texture_builder_get_update_texture(gdkGLTextureBuilderPointer.reinterpret())?.run {
            Texture(reinterpret())
        }

    /**
     * Gets the width previously set via gdk_gl_texture_builder_set_width() or
     * 0 if the width wasn't set.
     *
     * @return The width
     * @since 4.12
     */
    public open fun getWidth(): Int = gdk_gl_texture_builder_get_width(gdkGLTextureBuilderPointer.reinterpret())

    /**
     * Sets the context to be used for the texture. This is the context that owns
     * the texture.
     *
     * The context must be set before calling [method@Gdk.GLTextureBuilder.build].
     *
     * @param context The context the texture beongs to or null to unset
     * @since 4.12
     */
    public open fun setContext(context: GLContext? = null): Unit =
        gdk_gl_texture_builder_set_context(
            gdkGLTextureBuilderPointer.reinterpret(),
            context?.gdkGLContextPointer?.reinterpret()
        )

    /**
     * Sets the format of the texture. The default is `GDK_MEMORY_R8G8B8A8_PREMULTIPLIED`.
     *
     * The format is the preferred format the texture data should be downloaded to. The
     * format must be supported by the GL version of [property@Gdk.GLTextureBuilder:context].
     *
     * GDK's texture download code assumes that the format corresponds to the storage
     * parameters of the GL texture in an obvious way. For example, a format of
     * `GDK_MEMORY_R16G16B16A16_PREMULTIPLIED` is expected to be stored as `GL_RGBA16`
     * texture, and `GDK_MEMORY_G8A8` is expected to be stored as `GL_RG8` texture.
     *
     * Setting the right format is particularly useful when using high bit depth textures
     * to preserve the bit depth, to set the correct value for unpremultiplied textures
     * and to make sure opaque textures are treated as such.
     *
     * Non-RGBA textures need to have swizzling parameters set up properly to be usable
     * in GSK's shaders.
     *
     * @param format The texture's format
     * @since 4.12
     */
    public open fun setFormat(format: MemoryFormat): Unit =
        gdk_gl_texture_builder_set_format(
            gdkGLTextureBuilderPointer.reinterpret(),
            format.nativeValue
        )

    /**
     * Sets whether the texture has a mipmap. This allows the renderer and other users of the
     * generated texture to use a higher quality downscaling.
     *
     * Typically, the `glGenerateMipmap` function is used to generate a mimap.
     *
     * @param hasMipmap Whether the texture has a mipmap
     * @since 4.12
     */
    public open fun setHasMipmap(hasMipmap: Boolean): Unit =
        gdk_gl_texture_builder_set_has_mipmap(
            gdkGLTextureBuilderPointer.reinterpret(),
            hasMipmap.asGBoolean()
        )

    /**
     * Sets the height of the texture.
     *
     * The height must be set before calling [method@Gdk.GLTextureBuilder.build].
     *
     * @param height The texture's height or 0 to unset
     * @since 4.12
     */
    public open fun setHeight(height: Int): Unit =
        gdk_gl_texture_builder_set_height(gdkGLTextureBuilderPointer.reinterpret(), height)

    /**
     * Sets the texture id of the texture. The texture id must remain unmodified
     * until the texture was finalized. See [method@Gdk.GLTextureBuilder.build]
     * for a longer discussion.
     *
     * The id must be set before calling [method@Gdk.GLTextureBuilder.build].
     *
     * @param id The texture id to be used for creating the texture
     * @since 4.12
     */
    public open fun setId(id: UInt): Unit = gdk_gl_texture_builder_set_id(gdkGLTextureBuilderPointer.reinterpret(), id)

    /**
     * Sets the texture to be updated by this texture. See
     * [method@Gdk.GLTextureBuilder.set_update_region] for an explanation.
     *
     * @param texture the texture to update
     * @since 4.12
     */
    public open fun setUpdateTexture(texture: Texture? = null): Unit =
        gdk_gl_texture_builder_set_update_texture(
            gdkGLTextureBuilderPointer.reinterpret(),
            texture?.gdkTexturePointer?.reinterpret()
        )

    /**
     * Sets the width of the texture.
     *
     * The width must be set before calling [method@Gdk.GLTextureBuilder.build].
     *
     * @param width The texture's width or 0 to unset
     * @since 4.12
     */
    public open fun setWidth(width: Int): Unit =
        gdk_gl_texture_builder_set_width(gdkGLTextureBuilderPointer.reinterpret(), width)

    public companion object : TypeCompanion<GLTextureBuilder> {
        override val type: GeneratedClassKGType<GLTextureBuilder> =
            GeneratedClassKGType(gdk_gl_texture_builder_get_type()) {
                GLTextureBuilder(it.reinterpret())
            }

        init {
            GdkTypeProvider.register()
        }
    }
}
