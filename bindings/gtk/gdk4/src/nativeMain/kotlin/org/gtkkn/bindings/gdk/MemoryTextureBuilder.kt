// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.Region
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_16
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkMemoryTextureBuilder
import org.gtkkn.native.gdk.gdk_memory_texture_builder_build
import org.gtkkn.native.gdk.gdk_memory_texture_builder_get_bytes
import org.gtkkn.native.gdk.gdk_memory_texture_builder_get_color_state
import org.gtkkn.native.gdk.gdk_memory_texture_builder_get_format
import org.gtkkn.native.gdk.gdk_memory_texture_builder_get_height
import org.gtkkn.native.gdk.gdk_memory_texture_builder_get_stride
import org.gtkkn.native.gdk.gdk_memory_texture_builder_get_type
import org.gtkkn.native.gdk.gdk_memory_texture_builder_get_update_region
import org.gtkkn.native.gdk.gdk_memory_texture_builder_get_update_texture
import org.gtkkn.native.gdk.gdk_memory_texture_builder_get_width
import org.gtkkn.native.gdk.gdk_memory_texture_builder_new
import org.gtkkn.native.gdk.gdk_memory_texture_builder_set_bytes
import org.gtkkn.native.gdk.gdk_memory_texture_builder_set_color_state
import org.gtkkn.native.gdk.gdk_memory_texture_builder_set_format
import org.gtkkn.native.gdk.gdk_memory_texture_builder_set_height
import org.gtkkn.native.gdk.gdk_memory_texture_builder_set_stride
import org.gtkkn.native.gdk.gdk_memory_texture_builder_set_update_region
import org.gtkkn.native.gdk.gdk_memory_texture_builder_set_update_texture
import org.gtkkn.native.gdk.gdk_memory_texture_builder_set_width
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * `GdkMemoryTextureBuilder` is a builder used to construct [class@Gdk.Texture] objects
 * from system memory provided via [struct@GLib.Bytes].
 *
 * The operation is quite simple: Create a texture builder, set all the necessary
 * properties - keep in mind that the properties [property@Gdk.MemoryTextureBuilder:bytes],
 * [property@Gdk.MemoryTextureBuilder:stride], [property@Gdk.MemoryTextureBuilder:width],
 * and [property@Gdk.MemoryTextureBuilder:height] are mandatory - and then call
 * [method@Gdk.MemoryTextureBuilder.build] to create the new texture.
 *
 * `GdkMemoryTextureBuilder` can be used for quick one-shot construction of
 * textures as well as kept around and reused to construct multiple textures.
 *
 * ## Skipped during bindings generation
 *
 * - method `color-state`: Property TypeInfo of getter and setter do not match
 *
 * @since 4.16
 */
@GdkVersion4_16
public open class MemoryTextureBuilder(public val gdkMemoryTextureBuilderPointer: CPointer<GdkMemoryTextureBuilder>) :
    Object(gdkMemoryTextureBuilderPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    /**
     * The bytes holding the data.
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var bytes: Bytes?
        /**
         * Gets the bytes previously set via gdk_memory_texture_builder_set_bytes()
         * or null if none was set.
         *
         * @return The bytes
         * @since 4.16
         */
        get() = gdk_memory_texture_builder_get_bytes(gdkMemoryTextureBuilderPointer)?.run {
            Bytes(this)
        }

        /**
         * Sets the data to be shown but the texture.
         *
         * The bytes must be set before calling [method@Gdk.MemoryTextureBuilder.build].
         *
         * @param bytes The bytes the texture shows or null to unset
         * @since 4.16
         */
        @GdkVersion4_16
        set(bytes) = gdk_memory_texture_builder_set_bytes(gdkMemoryTextureBuilderPointer, bytes?.glibBytesPointer)

    /**
     * The format of the data.
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var format: MemoryFormat
        /**
         * Gets the format previously set via gdk_memory_texture_builder_set_format().
         *
         * @return The format
         * @since 4.16
         */
        get() = gdk_memory_texture_builder_get_format(gdkMemoryTextureBuilderPointer).run {
            MemoryFormat.fromNativeValue(this)
        }

        /**
         * Sets the format of the bytes.
         *
         * The default is `GDK_MEMORY_R8G8B8A8_PREMULTIPLIED`.
         *
         * @param format The texture's format
         * @since 4.16
         */
        @GdkVersion4_16
        set(format) = gdk_memory_texture_builder_set_format(gdkMemoryTextureBuilderPointer, format.nativeValue)

    /**
     * The height of the texture.
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var height: gint
        /**
         * Gets the height previously set via gdk_memory_texture_builder_set_height()
         * or 0 if the height wasn't set.
         *
         * @return The height
         * @since 4.16
         */
        get() = gdk_memory_texture_builder_get_height(gdkMemoryTextureBuilderPointer)

        /**
         * Sets the height of the texture.
         *
         * The height must be set before calling [method@Gdk.MemoryTextureBuilder.build].
         *
         * @param height The texture's height or 0 to unset
         * @since 4.16
         */
        @GdkVersion4_16
        set(height) = gdk_memory_texture_builder_set_height(gdkMemoryTextureBuilderPointer, height)

    /**
     * The rowstride of the texture.
     *
     * The rowstride is the number of bytes between the first pixel
     * in a row of image data, and the first pixel in the next row.
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var stride: gsize
        /**
         * Gets the stride previously set via gdk_memory_texture_builder_set_stride().
         *
         * @return the stride
         * @since 4.16
         */
        get() = gdk_memory_texture_builder_get_stride(gdkMemoryTextureBuilderPointer)

        /**
         * Sets the rowstride of the bytes used.
         *
         * The rowstride must be set before calling [method@Gdk.MemoryTextureBuilder.build].
         *
         * @param stride the stride or 0 to unset
         * @since 4.16
         */
        @GdkVersion4_16
        set(stride) = gdk_memory_texture_builder_set_stride(gdkMemoryTextureBuilderPointer, stride)

    /**
     * The update region for [property@Gdk.MemoryTextureBuilder:update-texture].
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var updateRegion: Region?
        /**
         * Gets the region previously set via gdk_memory_texture_builder_set_update_region()
         * or null if none was set.
         *
         * @return The update region
         * @since 4.16
         */
        get() = gdk_memory_texture_builder_get_update_region(gdkMemoryTextureBuilderPointer)?.run {
            Region(this)
        }

        /**
         * Sets the region to be updated by this texture.
         *
         * Together with [property@Gdk.MemoryTextureBuilder:update-texture],
         * this describes an update of a previous texture.
         *
         * When rendering animations of large textures, it is possible that
         * consecutive textures are only updating contents in parts of the texture.
         * It is then possible to describe this update via these two properties,
         * so that GTK can avoid rerendering parts that did not change.
         *
         * An example would be a screen recording where only the mouse pointer moves.
         *
         * @param region the region to update
         * @since 4.16
         */
        @GdkVersion4_16
        set(
            region
        ) = gdk_memory_texture_builder_set_update_region(gdkMemoryTextureBuilderPointer, region?.cairoRegionPointer)

    /**
     * The texture [property@Gdk.MemoryTextureBuilder:update-region] is an update for.
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var updateTexture: Texture?
        /**
         * Gets the texture previously set via gdk_memory_texture_builder_set_update_texture()
         * or null if none was set.
         *
         * @return The update texture
         * @since 4.16
         */
        get() = gdk_memory_texture_builder_get_update_texture(gdkMemoryTextureBuilderPointer)?.run {
            InstanceCache.get(this, true) { Texture.TextureImpl(reinterpret()) }!!
        }

        /**
         * Sets the texture to be updated by this texture.
         *
         * See [method@Gdk.MemoryTextureBuilder.set_update_region] for an explanation.
         *
         * @param texture the texture to update
         * @since 4.16
         */
        @GdkVersion4_16
        set(
            texture
        ) = gdk_memory_texture_builder_set_update_texture(gdkMemoryTextureBuilderPointer, texture?.gdkTexturePointer)

    /**
     * The width of the texture.
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var width: gint
        /**
         * Gets the width previously set via gdk_memory_texture_builder_set_width()
         * or 0 if the width wasn't set.
         *
         * @return The width
         * @since 4.16
         */
        get() = gdk_memory_texture_builder_get_width(gdkMemoryTextureBuilderPointer)

        /**
         * Sets the width of the texture.
         *
         * The width must be set before calling [method@Gdk.MemoryTextureBuilder.build].
         *
         * @param width The texture's width or 0 to unset
         * @since 4.16
         */
        @GdkVersion4_16
        set(width) = gdk_memory_texture_builder_set_width(gdkMemoryTextureBuilderPointer, width)

    /**
     * Creates a new texture builder.
     *
     * @return the new `GdkTextureBuilder`
     * @since 4.16
     */
    public constructor() : this(gdk_memory_texture_builder_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * Builds a new `GdkTexture` with the values set up in the builder.
     *
     * Note that it is a programming error to call this function if any mandatory
     * property has not been set.
     *
     * It is possible to call this function multiple times to create multiple textures,
     * possibly with changing properties in between.
     *
     * @return a newly built `GdkTexture`
     * @since 4.16
     */
    @GdkVersion4_16
    public open fun build(): Texture = gdk_memory_texture_builder_build(gdkMemoryTextureBuilderPointer)!!.run {
        InstanceCache.get(this, true) { Texture.TextureImpl(reinterpret()) }!!
    }

    /**
     * Gets the colorstate previously set via gdk_memory_texture_builder_set_color_state().
     *
     * @return The colorstate
     * @since 4.16
     */
    @GdkVersion4_16
    public open fun getColorState(): ColorState =
        gdk_memory_texture_builder_get_color_state(gdkMemoryTextureBuilderPointer)!!.run {
            ColorState(this)
        }

    /**
     * Sets the colorstate describing the data.
     *
     * By default, the sRGB colorstate is used. If you don't know
     * what colorstates are, this is probably the right thing.
     *
     * @param colorState The colorstate describing the data
     * @since 4.16
     */
    @GdkVersion4_16
    public open fun setColorState(colorState: ColorState? = null): Unit =
        gdk_memory_texture_builder_set_color_state(gdkMemoryTextureBuilderPointer, colorState?.gdkColorStatePointer)

    public companion object : TypeCompanion<MemoryTextureBuilder> {
        override val type: GeneratedClassKGType<MemoryTextureBuilder> =
            GeneratedClassKGType(getTypeOrNull()!!) { MemoryTextureBuilder(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of MemoryTextureBuilder
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_memory_texture_builder_get_type()

        /**
         * Gets the GType of from the symbol `gdk_memory_texture_builder_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_memory_texture_builder_get_type")
    }
}
