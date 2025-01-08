// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_10
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkTextureDownloader
import org.gtkkn.native.gdk.gdk_texture_downloader_copy
import org.gtkkn.native.gdk.gdk_texture_downloader_free
import org.gtkkn.native.gdk.gdk_texture_downloader_get_format
import org.gtkkn.native.gdk.gdk_texture_downloader_get_texture
import org.gtkkn.native.gdk.gdk_texture_downloader_get_type
import org.gtkkn.native.gdk.gdk_texture_downloader_new
import org.gtkkn.native.gdk.gdk_texture_downloader_set_format
import org.gtkkn.native.gdk.gdk_texture_downloader_set_texture
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * The `GdkTextureDownloader` is used to download the contents of a
 * [class@Gdk.Texture].
 *
 * It is intended to be created as a short-term object for a single download,
 * but can be used for multiple downloads of different textures or with different
 * settings.
 *
 * `GdkTextureDownloader` can be used to convert data between different formats.
 * Create a `GdkTexture` for the existing format and then download it in a
 * different format.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_stride`: out_stride: Out parameter is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 *
 * @since 4.10
 */
@GdkVersion4_10
public class TextureDownloader(pointer: CPointer<GdkTextureDownloader>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GdkTextureDownloader> = pointer

    /**
     * Creates a copy of the downloader.
     *
     * This function is meant for language bindings.
     *
     * @return A copy of the downloader
     * @since 4.10
     */
    @GdkVersion4_10
    public fun copy(): TextureDownloader = gdk_texture_downloader_copy(gPointer)!!.run {
        TextureDownloader(this)
    }

    /**
     * Frees the given downloader and all its associated resources.
     *
     * @since 4.10
     */
    @GdkVersion4_10
    public fun free(): Unit = gdk_texture_downloader_free(gPointer)

    /**
     * Gets the format that the data will be downloaded in.
     *
     * @return The format of the download
     * @since 4.10
     */
    @GdkVersion4_10
    public fun getFormat(): MemoryFormat = gdk_texture_downloader_get_format(gPointer).run {
        MemoryFormat.fromNativeValue(this)
    }

    /**
     * Gets the texture that the downloader will download.
     *
     * @return The texture to download
     * @since 4.10
     */
    @GdkVersion4_10
    public fun getTexture(): Texture = gdk_texture_downloader_get_texture(gPointer)!!.run {
        Texture(this)
    }

    /**
     * Sets the format the downloader will download.
     *
     * By default, GDK_MEMORY_DEFAULT is set.
     *
     * @param format the format to use
     * @since 4.10
     */
    @GdkVersion4_10
    public fun setFormat(format: MemoryFormat): Unit = gdk_texture_downloader_set_format(gPointer, format.nativeValue)

    /**
     * Changes the texture the downloader will download.
     *
     * @param texture the new texture to download
     * @since 4.10
     */
    @GdkVersion4_10
    public fun setTexture(texture: Texture): Unit =
        gdk_texture_downloader_set_texture(gPointer, texture.gdkTexturePointer)

    public companion object {
        /**
         * Creates a new texture downloader for @texture.
         *
         * @param texture texture to download
         * @return A new texture downloader
         * @since 4.10
         */
        public fun new(texture: Texture): TextureDownloader =
            TextureDownloader(gdk_texture_downloader_new(texture.gdkTexturePointer)!!.reinterpret())

        /**
         * Get the GType of TextureDownloader
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_texture_downloader_get_type()
    }
}
