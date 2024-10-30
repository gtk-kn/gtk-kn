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
import org.gtkkn.native.gdk.GdkDmabufTextureBuilder
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_display
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_fd
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_fourcc
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_height
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_modifier
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_n_planes
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_offset
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_premultiplied
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_stride
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_type
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_update_texture
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_get_width
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_new
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_display
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_fd
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_fourcc
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_height
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_modifier
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_n_planes
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_offset
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_premultiplied
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_stride
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_update_texture
import org.gtkkn.native.gdk.gdk_dmabuf_texture_builder_set_width
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * `GdkDmabufTextureBuilder` is a builder used to construct [class@Gdk.Texture]
 * objects from DMA buffers.
 *
 * DMA buffers are commonly called **_dma-bufs_**.
 *
 * DMA buffers are a feature of the Linux kernel to enable efficient buffer and
 * memory sharing between hardware such as codecs, GPUs, displays, cameras and the
 * kernel drivers controlling them. For example, a decoder may want its output to
 * be directly shared with the display server for rendering without a copy.
 *
 * Any device driver which participates in DMA buffer sharing, can do so as either
 * the exporter or importer of buffers (or both).
 *
 * The memory that is shared via DMA buffers is usually stored in non-system memory
 * (maybe in device's local memory or something else not directly accessible by the
 * CPU), and accessing this memory from the CPU may have higher-than-usual overhead.
 *
 * In particular for graphics data, it is not uncommon that data consists of multiple
 * separate blocks of memory, for example one block for each of the red, green and
 * blue channels. These blocks are called **_planes_**. DMA buffers can have up to
 * four planes. Even if the memory is a single block, the data can be organized in
 * multiple planes, by specifying offsets from the beginning of the data.
 *
 * DMA buffers are exposed to user-space as file descriptors allowing to pass them
 * between processes. If a DMA buffer has multiple planes, there is one file
 * descriptor per plane.
 *
 * The format of the data (for graphics data, essentially its colorspace) is described
 * by a 32-bit integer. These format identifiers are defined in the header file `drm_fourcc.h`
 * and commonly referred to as **_fourcc_** values, since they are identified by 4 ASCII
 * characters. Additionally, each DMA buffer has a **_modifier_**, which is a 64-bit integer
 * that describes driver-specific details of the memory layout, such as tiling or compression.
 *
 * For historical reasons, some producers of dma-bufs don't provide an explicit modifier, but
 * instead return `DMA_FORMAT_MOD_INVALID` to indicate that their modifier is **_implicit_**.
 * GTK tries to accommodate this situation by accepting `DMA_FORMAT_MOD_INVALID` as modifier.
 *
 * The operation of `GdkDmabufTextureBuilder` is quite simple: Create a texture builder,
 * set all the necessary properties, and then call [method@Gdk.DmabufTextureBuilder.build]
 * to create the new texture.
 *
 * The required properties for a dma-buf texture are
 *
 *  * The width and height in pixels
 *
 *  * The `fourcc` code and `modifier` which identify the format and memory layout of the dma-buf
 *
 *  * The file descriptor, offset and stride for each of the planes
 *
 * `GdkDmabufTextureBuilder` can be used for quick one-shot construction of
 * textures as well as kept around and reused to construct multiple textures.
 *
 * For further information, see
 *
 * * The Linux kernel [documentation](https://docs.kernel.org/driver-api/dma-buf.html)
 *
 * * The header file [drm_fourcc.h](https://gitlab.freedesktop.org/mesa/drm/-/blob/main/include/drm/drm_fourcc.h)
 *
 * ## Skipped during bindings generation
 *
 * - parameter `destroy`: GLib.DestroyNotify
 * - method `get_update_region`: Return type cairo.Region is unsupported
 * - parameter `region`: cairo.Region
 * - method `update-region`: Property has no getter nor setter
 *
 * @since 4.14
 */
public open class DmabufTextureBuilder(
    pointer: CPointer<GdkDmabufTextureBuilder>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gdkDmabufTextureBuilderPointer: CPointer<GdkDmabufTextureBuilder>
        get() = gPointer.reinterpret()

    /**
     * The display that this texture will be used on.
     *
     * @since 4.14
     */
    public open var display: Display
        /**
         * Returns the display that this texture builder is
         * associated with.
         *
         * @return the display
         * @since 4.14
         */
        get() =
            gdk_dmabuf_texture_builder_get_display(gdkDmabufTextureBuilderPointer.reinterpret())!!.run {
                Display(reinterpret())
            }

        /**
         * Sets the display that this texture builder is
         * associated with.
         *
         * The display is used to determine the supported
         * dma-buf formats.
         *
         * @param display the display
         * @since 4.14
         */
        set(
            display
        ) =
            gdk_dmabuf_texture_builder_set_display(
                gdkDmabufTextureBuilderPointer.reinterpret(),
                display.gdkDisplayPointer.reinterpret()
            )

    /**
     * The format of the texture, as a fourcc value.
     *
     * @since 4.14
     */
    public open var fourcc: UInt
        /**
         * Gets the format previously set via gdk_dmabuf_texture_builder_set_fourcc()
         * or 0 if the format wasn't set.
         *
         * The format is specified as a fourcc code.
         *
         * @return The format
         * @since 4.14
         */
        get() = gdk_dmabuf_texture_builder_get_fourcc(gdkDmabufTextureBuilderPointer.reinterpret())

        /**
         * Sets the format of the texture.
         *
         * The format is specified as a fourcc code.
         *
         * The format must be set before calling [method@Gdk.GLTextureBuilder.build].
         *
         * @param fourcc the texture's format or 0 to unset
         * @since 4.14
         */
        set(fourcc) = gdk_dmabuf_texture_builder_set_fourcc(gdkDmabufTextureBuilderPointer.reinterpret(), fourcc)

    /**
     * The height of the texture.
     *
     * @since 4.14
     */
    public open var height: UInt
        /**
         * Gets the height previously set via gdk_dmabuf_texture_builder_set_height() or
         * 0 if the height wasn't set.
         *
         * @return The height
         * @since 4.14
         */
        get() = gdk_dmabuf_texture_builder_get_height(gdkDmabufTextureBuilderPointer.reinterpret())

        /**
         * Sets the height of the texture.
         *
         * The height must be set before calling [method@Gdk.GLTextureBuilder.build].
         *
         * @param height the texture's height or 0 to unset
         * @since 4.14
         */
        set(height) = gdk_dmabuf_texture_builder_set_height(gdkDmabufTextureBuilderPointer.reinterpret(), height)

    /**
     * The modifier.
     *
     * @since 4.14
     */
    public open var modifier: ULong
        /**
         * Gets the modifier value.
         *
         * @return the modifier
         * @since 4.14
         */
        get() = gdk_dmabuf_texture_builder_get_modifier(gdkDmabufTextureBuilderPointer.reinterpret())

        /**
         * Sets the modifier.
         *
         * @param modifier the modifier value
         * @since 4.14
         */
        set(modifier) = gdk_dmabuf_texture_builder_set_modifier(gdkDmabufTextureBuilderPointer.reinterpret(), modifier)

    /**
     * The number of planes of the texture.
     *
     * Note that you can set properties for other planes,
     * but they will be ignored when constructing the texture.
     *
     * @since 4.14
     */
    public open var nPlanes: UInt
        /**
         * Gets the number of planes.
         *
         * @return The number of planes
         * @since 4.14
         */
        get() = gdk_dmabuf_texture_builder_get_n_planes(gdkDmabufTextureBuilderPointer.reinterpret())

        /**
         * Sets the number of planes of the texture.
         *
         * @param nPlanes the number of planes
         * @since 4.14
         */
        set(nPlanes) = gdk_dmabuf_texture_builder_set_n_planes(gdkDmabufTextureBuilderPointer.reinterpret(), nPlanes)

    /**
     * Whether the alpha channel is premultiplied into the others.
     *
     * Only relevant if the format has alpha.
     *
     * @since 4.14
     */
    public open var premultiplied: Boolean
        /**
         * Whether the data is premultiplied.
         *
         * @return whether the data is premultiplied
         * @since 4.14
         */
        get() = gdk_dmabuf_texture_builder_get_premultiplied(gdkDmabufTextureBuilderPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the data is premultiplied.
         *
         * Unless otherwise specified, all formats including alpha channels are assumed
         * to be premultiplied.
         *
         * @param premultiplied whether the data is premultiplied
         * @since 4.14
         */
        set(
            premultiplied
        ) =
            gdk_dmabuf_texture_builder_set_premultiplied(
                gdkDmabufTextureBuilderPointer.reinterpret(),
                premultiplied.asGBoolean()
            )

    /**
     * The texture [property@Gdk.DmabufTextureBuilder:update-region] is an update for.
     *
     * @since 4.14
     */
    public open var updateTexture: Texture?
        /**
         * Gets the texture previously set via gdk_dmabuf_texture_builder_set_update_texture() or
         * null if none was set.
         *
         * @return The texture
         * @since 4.14
         */
        get() =
            gdk_dmabuf_texture_builder_get_update_texture(gdkDmabufTextureBuilderPointer.reinterpret())?.run {
                Texture(reinterpret())
            }

        /**
         * Sets the texture to be updated by this texture. See
         * [method@Gdk.DmabufTextureBuilder.set_update_region] for an explanation.
         *
         * @param texture the texture to update
         * @since 4.14
         */
        set(
            texture
        ) =
            gdk_dmabuf_texture_builder_set_update_texture(
                gdkDmabufTextureBuilderPointer.reinterpret(),
                texture?.gdkTexturePointer?.reinterpret()
            )

    /**
     * The width of the texture.
     *
     * @since 4.14
     */
    public open var width: UInt
        /**
         * Gets the width previously set via gdk_dmabuf_texture_builder_set_width() or
         * 0 if the width wasn't set.
         *
         * @return The width
         * @since 4.14
         */
        get() = gdk_dmabuf_texture_builder_get_width(gdkDmabufTextureBuilderPointer.reinterpret())

        /**
         * Sets the width of the texture.
         *
         * The width must be set before calling [method@Gdk.GLTextureBuilder.build].
         *
         * @param width The texture's width or 0 to unset
         * @since 4.14
         */
        set(width) = gdk_dmabuf_texture_builder_set_width(gdkDmabufTextureBuilderPointer.reinterpret(), width)

    /**
     * Creates a new texture builder.
     *
     * @return the new `GdkTextureBuilder`
     * @since 4.14
     */
    public constructor() : this(gdk_dmabuf_texture_builder_new()!!.reinterpret())

    /**
     * Returns the display that this texture builder is
     * associated with.
     *
     * @return the display
     * @since 4.14
     */
    public open fun getDisplay(): Display =
        gdk_dmabuf_texture_builder_get_display(gdkDmabufTextureBuilderPointer.reinterpret())!!.run {
            Display(reinterpret())
        }

    /**
     * Gets the file descriptor for a plane.
     *
     * @param plane the plane to get the fd for
     * @return the file descriptor
     * @since 4.14
     */
    public open fun getFd(plane: UInt): Int =
        gdk_dmabuf_texture_builder_get_fd(gdkDmabufTextureBuilderPointer.reinterpret(), plane)

    /**
     * Gets the format previously set via gdk_dmabuf_texture_builder_set_fourcc()
     * or 0 if the format wasn't set.
     *
     * The format is specified as a fourcc code.
     *
     * @return The format
     * @since 4.14
     */
    public open fun getFourcc(): UInt =
        gdk_dmabuf_texture_builder_get_fourcc(gdkDmabufTextureBuilderPointer.reinterpret())

    /**
     * Gets the height previously set via gdk_dmabuf_texture_builder_set_height() or
     * 0 if the height wasn't set.
     *
     * @return The height
     * @since 4.14
     */
    public open fun getHeight(): UInt =
        gdk_dmabuf_texture_builder_get_height(gdkDmabufTextureBuilderPointer.reinterpret())

    /**
     * Gets the modifier value.
     *
     * @return the modifier
     * @since 4.14
     */
    public open fun getModifier(): ULong =
        gdk_dmabuf_texture_builder_get_modifier(gdkDmabufTextureBuilderPointer.reinterpret())

    /**
     * Gets the number of planes.
     *
     * @return The number of planes
     * @since 4.14
     */
    public open fun getNPlanes(): UInt =
        gdk_dmabuf_texture_builder_get_n_planes(gdkDmabufTextureBuilderPointer.reinterpret())

    /**
     * Gets the offset value for a plane.
     *
     * @param plane the plane to get the offset for
     * @return the offset
     * @since 4.14
     */
    public open fun getOffset(plane: UInt): UInt =
        gdk_dmabuf_texture_builder_get_offset(gdkDmabufTextureBuilderPointer.reinterpret(), plane)

    /**
     * Whether the data is premultiplied.
     *
     * @return whether the data is premultiplied
     * @since 4.14
     */
    public open fun getPremultiplied(): Boolean =
        gdk_dmabuf_texture_builder_get_premultiplied(gdkDmabufTextureBuilderPointer.reinterpret()).asBoolean()

    /**
     * Gets the stride value for a plane.
     *
     * @param plane the plane to get the stride for
     * @return the stride
     * @since 4.14
     */
    public open fun getStride(plane: UInt): UInt =
        gdk_dmabuf_texture_builder_get_stride(gdkDmabufTextureBuilderPointer.reinterpret(), plane)

    /**
     * Gets the texture previously set via gdk_dmabuf_texture_builder_set_update_texture() or
     * null if none was set.
     *
     * @return The texture
     * @since 4.14
     */
    public open fun getUpdateTexture(): Texture? =
        gdk_dmabuf_texture_builder_get_update_texture(gdkDmabufTextureBuilderPointer.reinterpret())?.run {
            Texture(reinterpret())
        }

    /**
     * Gets the width previously set via gdk_dmabuf_texture_builder_set_width() or
     * 0 if the width wasn't set.
     *
     * @return The width
     * @since 4.14
     */
    public open fun getWidth(): UInt =
        gdk_dmabuf_texture_builder_get_width(gdkDmabufTextureBuilderPointer.reinterpret())

    /**
     * Sets the display that this texture builder is
     * associated with.
     *
     * The display is used to determine the supported
     * dma-buf formats.
     *
     * @param display the display
     * @since 4.14
     */
    public open fun setDisplay(display: Display): Unit =
        gdk_dmabuf_texture_builder_set_display(
            gdkDmabufTextureBuilderPointer.reinterpret(),
            display.gdkDisplayPointer.reinterpret()
        )

    /**
     * Sets the file descriptor for a plane.
     *
     * @param plane the plane to set the fd for
     * @param fd the file descriptor
     * @since 4.14
     */
    public open fun setFd(
        plane: UInt,
        fd: Int,
    ): Unit = gdk_dmabuf_texture_builder_set_fd(gdkDmabufTextureBuilderPointer.reinterpret(), plane, fd)

    /**
     * Sets the format of the texture.
     *
     * The format is specified as a fourcc code.
     *
     * The format must be set before calling [method@Gdk.GLTextureBuilder.build].
     *
     * @param fourcc the texture's format or 0 to unset
     * @since 4.14
     */
    public open fun setFourcc(fourcc: UInt): Unit =
        gdk_dmabuf_texture_builder_set_fourcc(gdkDmabufTextureBuilderPointer.reinterpret(), fourcc)

    /**
     * Sets the height of the texture.
     *
     * The height must be set before calling [method@Gdk.GLTextureBuilder.build].
     *
     * @param height the texture's height or 0 to unset
     * @since 4.14
     */
    public open fun setHeight(height: UInt): Unit =
        gdk_dmabuf_texture_builder_set_height(gdkDmabufTextureBuilderPointer.reinterpret(), height)

    /**
     * Sets the modifier.
     *
     * @param modifier the modifier value
     * @since 4.14
     */
    public open fun setModifier(modifier: ULong): Unit =
        gdk_dmabuf_texture_builder_set_modifier(gdkDmabufTextureBuilderPointer.reinterpret(), modifier)

    /**
     * Sets the number of planes of the texture.
     *
     * @param nPlanes the number of planes
     * @since 4.14
     */
    public open fun setNPlanes(nPlanes: UInt): Unit =
        gdk_dmabuf_texture_builder_set_n_planes(gdkDmabufTextureBuilderPointer.reinterpret(), nPlanes)

    /**
     * Sets the offset for a plane.
     *
     * @param plane the plane to set the offset for
     * @param offset the offset value
     * @since 4.14
     */
    public open fun setOffset(
        plane: UInt,
        offset: UInt,
    ): Unit = gdk_dmabuf_texture_builder_set_offset(gdkDmabufTextureBuilderPointer.reinterpret(), plane, offset)

    /**
     * Sets whether the data is premultiplied.
     *
     * Unless otherwise specified, all formats including alpha channels are assumed
     * to be premultiplied.
     *
     * @param premultiplied whether the data is premultiplied
     * @since 4.14
     */
    public open fun setPremultiplied(premultiplied: Boolean): Unit =
        gdk_dmabuf_texture_builder_set_premultiplied(
            gdkDmabufTextureBuilderPointer.reinterpret(),
            premultiplied.asGBoolean()
        )

    /**
     * Sets the stride for a plane.
     *
     * The stride must be set for all planes before calling [method@Gdk.GLTextureBuilder.build].
     *
     * @param plane the plane to set the stride for
     * @param stride the stride value
     * @since 4.14
     */
    public open fun setStride(
        plane: UInt,
        stride: UInt,
    ): Unit = gdk_dmabuf_texture_builder_set_stride(gdkDmabufTextureBuilderPointer.reinterpret(), plane, stride)

    /**
     * Sets the texture to be updated by this texture. See
     * [method@Gdk.DmabufTextureBuilder.set_update_region] for an explanation.
     *
     * @param texture the texture to update
     * @since 4.14
     */
    public open fun setUpdateTexture(texture: Texture? = null): Unit =
        gdk_dmabuf_texture_builder_set_update_texture(
            gdkDmabufTextureBuilderPointer.reinterpret(),
            texture?.gdkTexturePointer?.reinterpret()
        )

    /**
     * Sets the width of the texture.
     *
     * The width must be set before calling [method@Gdk.GLTextureBuilder.build].
     *
     * @param width The texture's width or 0 to unset
     * @since 4.14
     */
    public open fun setWidth(width: UInt): Unit =
        gdk_dmabuf_texture_builder_set_width(gdkDmabufTextureBuilderPointer.reinterpret(), width)

    public companion object : TypeCompanion<DmabufTextureBuilder> {
        override val type: GeneratedClassKGType<DmabufTextureBuilder> =
            GeneratedClassKGType(gdk_dmabuf_texture_builder_get_type()) { DmabufTextureBuilder(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
