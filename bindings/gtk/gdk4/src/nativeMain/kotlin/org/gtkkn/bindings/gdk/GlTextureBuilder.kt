// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.Region
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_12
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkGLTextureBuilder
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_context
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_format
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_has_mipmap
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_height
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_id
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_sync
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_type
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_update_region
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_update_texture
import org.gtkkn.native.gdk.gdk_gl_texture_builder_get_width
import org.gtkkn.native.gdk.gdk_gl_texture_builder_new
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_context
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_format
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_has_mipmap
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_height
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_id
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_sync
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_update_region
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_update_texture
import org.gtkkn.native.gdk.gdk_gl_texture_builder_set_width
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

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
 *
 * @since 4.12
 */
@GdkVersion4_12
public open class GlTextureBuilder(public val gdkGlTextureBuilderPointer: CPointer<GdkGLTextureBuilder>) :
    Object(gdkGlTextureBuilderPointer.reinterpret()),
    KGTyped {
    /**
     * The context owning the texture.
     *
     * @since 4.12
     */
    @GdkVersion4_12
    public open var context: GlContext?
        /**
         * Gets the context previously set via gdk_gl_texture_builder_set_context() or
         * null if none was set.
         *
         * @return The context
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_context(gdkGlTextureBuilderPointer)?.run {
            GlContext.GlContextImpl(this)
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
        @GdkVersion4_12
        set(context) = gdk_gl_texture_builder_set_context(gdkGlTextureBuilderPointer, context?.gdkGlContextPointer)

    /**
     * The format when downloading the texture.
     *
     * @since 4.12
     */
    @GdkVersion4_12
    public open var format: MemoryFormat
        /**
         * Gets the format previously set via gdk_gl_texture_builder_set_format().
         *
         * @return The format
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_format(gdkGlTextureBuilderPointer).run {
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
        @GdkVersion4_12
        set(format) = gdk_gl_texture_builder_set_format(gdkGlTextureBuilderPointer, format.nativeValue)

    /**
     * If the texture has a mipmap.
     *
     * @since 4.12
     */
    @GdkVersion4_12
    public open var hasMipmap: Boolean
        /**
         * Gets whether the texture has a mipmap.
         *
         * @return Whether the texture has a mipmap
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_has_mipmap(gdkGlTextureBuilderPointer).asBoolean()

        /**
         * Sets whether the texture has a mipmap. This allows the renderer and other users of the
         * generated texture to use a higher quality downscaling.
         *
         * Typically, the `glGenerateMipmap` function is used to generate a mimap.
         *
         * @param hasMipmap Whether the texture has a mipmap
         * @since 4.12
         */
        @GdkVersion4_12
        set(hasMipmap) = gdk_gl_texture_builder_set_has_mipmap(gdkGlTextureBuilderPointer, hasMipmap.asGBoolean())

    /**
     * The height of the texture.
     *
     * @since 4.12
     */
    @GdkVersion4_12
    public open var height: gint
        /**
         * Gets the height previously set via gdk_gl_texture_builder_set_height() or
         * 0 if the height wasn't set.
         *
         * @return The height
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_height(gdkGlTextureBuilderPointer)

        /**
         * Sets the height of the texture.
         *
         * The height must be set before calling [method@Gdk.GLTextureBuilder.build].
         *
         * @param height The texture's height or 0 to unset
         * @since 4.12
         */
        @GdkVersion4_12
        set(height) = gdk_gl_texture_builder_set_height(gdkGlTextureBuilderPointer, height)

    /**
     * The texture ID to use.
     *
     * @since 4.12
     */
    @GdkVersion4_12
    public open var id: guint
        /**
         * Gets the texture id previously set via gdk_gl_texture_builder_set_id() or
         * 0 if the id wasn't set.
         *
         * @return The id
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_id(gdkGlTextureBuilderPointer)

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
        @GdkVersion4_12
        set(id) = gdk_gl_texture_builder_set_id(gdkGlTextureBuilderPointer, id)

    /**
     * An optional `GLSync` object.
     *
     * If this is set, GTK will wait on it before using the texture.
     *
     * @since 4.12
     */
    @GdkVersion4_12
    public open var sync: gpointer?
        /**
         * Gets the `GLsync` previously set via gdk_gl_texture_builder_set_sync().
         *
         * @return the `GLSync`
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_sync(gdkGlTextureBuilderPointer)

        /**
         * Sets the GLSync object to use for the texture.
         *
         * GTK will wait on this object before using the created `GdkTexture`.
         *
         * The `destroy` function that is passed to [method@Gdk.GLTextureBuilder.build]
         * is responsible for freeing the sync object when it is no longer needed.
         * The texture builder does not destroy it and it is the callers
         * responsibility to make sure it doesn't leak.
         *
         * @param sync the GLSync object
         * @since 4.12
         */
        @GdkVersion4_12
        set(sync) = gdk_gl_texture_builder_set_sync(gdkGlTextureBuilderPointer, sync)

    /**
     * The update region for [property@Gdk.GLTextureBuilder:update-texture].
     *
     * @since 4.12
     */
    @GdkVersion4_12
    public open var updateRegion: Region?
        /**
         * Gets the region previously set via gdk_gl_texture_builder_set_update_region() or
         * null if none was set.
         *
         * @return The region
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_update_region(gdkGlTextureBuilderPointer)?.run {
            Region(this)
        }

        /**
         * Sets the region to be updated by this texture. Together with
         * [property@Gdk.GLTextureBuilder:update-texture] this describes an
         * update of a previous texture.
         *
         * When rendering animations of large textures, it is possible that
         * consecutive textures are only updating contents in parts of the texture.
         * It is then possible to describe this update via these two properties,
         * so that GTK can avoid rerendering parts that did not change.
         *
         * An example would be a screen recording where only the mouse pointer moves.
         *
         * @param region the region to update
         * @since 4.12
         */
        @GdkVersion4_12
        set(region) = gdk_gl_texture_builder_set_update_region(gdkGlTextureBuilderPointer, region?.cairoRegionPointer)

    /**
     * The texture [property@Gdk.GLTextureBuilder:update-region] is an update for.
     *
     * @since 4.12
     */
    @GdkVersion4_12
    public open var updateTexture: Texture?
        /**
         * Gets the texture previously set via gdk_gl_texture_builder_set_update_texture() or
         * null if none was set.
         *
         * @return The texture
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_update_texture(gdkGlTextureBuilderPointer)?.run {
            Texture.TextureImpl(this)
        }

        /**
         * Sets the texture to be updated by this texture. See
         * [method@Gdk.GLTextureBuilder.set_update_region] for an explanation.
         *
         * @param texture the texture to update
         * @since 4.12
         */
        @GdkVersion4_12
        set(texture) = gdk_gl_texture_builder_set_update_texture(gdkGlTextureBuilderPointer, texture?.gdkTexturePointer)

    /**
     * The width of the texture.
     *
     * @since 4.12
     */
    @GdkVersion4_12
    public open var width: gint
        /**
         * Gets the width previously set via gdk_gl_texture_builder_set_width() or
         * 0 if the width wasn't set.
         *
         * @return The width
         * @since 4.12
         */
        get() = gdk_gl_texture_builder_get_width(gdkGlTextureBuilderPointer)

        /**
         * Sets the width of the texture.
         *
         * The width must be set before calling [method@Gdk.GLTextureBuilder.build].
         *
         * @param width The texture's width or 0 to unset
         * @since 4.12
         */
        @GdkVersion4_12
        set(width) = gdk_gl_texture_builder_set_width(gdkGlTextureBuilderPointer, width)

    /**
     * Creates a new texture builder.
     *
     * @return the new `GdkTextureBuilder`
     * @since 4.12
     */
    public constructor() : this(gdk_gl_texture_builder_new()!!.reinterpret())

    public companion object : TypeCompanion<GlTextureBuilder> {
        override val type: GeneratedClassKGType<GlTextureBuilder> =
            GeneratedClassKGType(gdk_gl_texture_builder_get_type()) { GlTextureBuilder(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of GLTextureBuilder
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_gl_texture_builder_get_type()
    }
}
