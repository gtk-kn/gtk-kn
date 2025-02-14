// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_10
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_16
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.native.gdk.GdkTextureDownloader
import org.gtkkn.native.gdk.gdk_texture_downloader_copy
import org.gtkkn.native.gdk.gdk_texture_downloader_free
import org.gtkkn.native.gdk.gdk_texture_downloader_get_color_state
import org.gtkkn.native.gdk.gdk_texture_downloader_get_format
import org.gtkkn.native.gdk.gdk_texture_downloader_get_texture
import org.gtkkn.native.gdk.gdk_texture_downloader_get_type
import org.gtkkn.native.gdk.gdk_texture_downloader_new
import org.gtkkn.native.gdk.gdk_texture_downloader_set_color_state
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
public class TextureDownloader(public val gdkTextureDownloaderPointer: CPointer<GdkTextureDownloader>) :
    ProxyInstance(gdkTextureDownloaderPointer) {
    /**
     * Creates a new texture downloader for @texture.
     *
     * By default, the downloader will convert the data to
     * the default memory format, and to the sRGB color state.
     *
     * @param texture texture to download
     * @return A new texture downloader
     * @since 4.10
     */
    public constructor(texture: Texture) : this(gdk_texture_downloader_new(texture.gdkTexturePointer)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Creates a copy of the downloader.
     *
     * This function is meant for language bindings.
     *
     * @return A copy of the downloader
     * @since 4.10
     */
    @GdkVersion4_10
    public fun copy(): TextureDownloader = gdk_texture_downloader_copy(gdkTextureDownloaderPointer)!!.run {
        TextureDownloader(this)
    }

    /**
     * Frees the given downloader and all its associated resources.
     *
     * @since 4.10
     */
    @GdkVersion4_10
    public fun free(): Unit = gdk_texture_downloader_free(gdkTextureDownloaderPointer)

    /**
     * Gets the color state that the data will be downloaded in.
     *
     * @return The color state of the download
     * @since 4.16
     */
    @GdkVersion4_16
    public fun getColorState(): ColorState = gdk_texture_downloader_get_color_state(gdkTextureDownloaderPointer)!!.run {
        ColorState(this)
    }

    /**
     * Gets the format that the data will be downloaded in.
     *
     * @return The format of the download
     * @since 4.10
     */
    @GdkVersion4_10
    public fun getFormat(): MemoryFormat = gdk_texture_downloader_get_format(gdkTextureDownloaderPointer).run {
        MemoryFormat.fromNativeValue(this)
    }

    /**
     * Gets the texture that the downloader will download.
     *
     * @return The texture to download
     * @since 4.10
     */
    @GdkVersion4_10
    public fun getTexture(): Texture = gdk_texture_downloader_get_texture(gdkTextureDownloaderPointer)!!.run {
        InstanceCache.get(this, true) { Texture.TextureImpl(reinterpret()) }!!
    }

    /**
     * Sets the color state the downloader will convert the data to.
     *
     * By default, the sRGB colorstate returned by [func@ColorState.get_srgb]
     * is used.
     *
     * @param colorState the color state to use
     * @since 4.16
     */
    @GdkVersion4_16
    public fun setColorState(colorState: ColorState): Unit =
        gdk_texture_downloader_set_color_state(gdkTextureDownloaderPointer, colorState.gdkColorStatePointer)

    /**
     * Sets the format the downloader will download.
     *
     * By default, GDK_MEMORY_DEFAULT is set.
     *
     * @param format the format to use
     * @since 4.10
     */
    @GdkVersion4_10
    public fun setFormat(format: MemoryFormat): Unit =
        gdk_texture_downloader_set_format(gdkTextureDownloaderPointer, format.nativeValue)

    /**
     * Changes the texture the downloader will download.
     *
     * @param texture the new texture to download
     * @since 4.10
     */
    @GdkVersion4_10
    public fun setTexture(texture: Texture): Unit =
        gdk_texture_downloader_set_texture(gdkTextureDownloaderPointer, texture.gdkTexturePointer)

    public companion object {
        /**
         * Get the GType of TextureDownloader
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_texture_downloader_get_type()
    }
}
