// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_14
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDmabufTexture
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gdk.gdk_dmabuf_texture_get_type
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon

/**
 * A `GdkTexture` representing a DMA buffer.
 *
 * To create a `GdkDmabufTexture`, use the auxiliary
 * [class@Gdk.DmabufTextureBuilder] object.
 *
 * Dma-buf textures can only be created on Linux.
 * @since 4.14
 */
@GdkVersion4_14
public open class DmabufTexture(
    pointer: CPointer<GdkDmabufTexture>,
) : Texture(pointer.reinterpret()),
    KGTyped {
    public val gdkDmabufTexturePointer: CPointer<GdkDmabufTexture>
        get() = gPointer.reinterpret()

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = gPointer.reinterpret()

    override val gioIconPointer: CPointer<GIcon>
        get() = gPointer.reinterpret()

    override val gioLoadableIconPointer: CPointer<GLoadableIcon>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<DmabufTexture> {
        override val type: GeneratedClassKGType<DmabufTexture> =
            GeneratedClassKGType(gdk_dmabuf_texture_get_type()) { DmabufTexture(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
