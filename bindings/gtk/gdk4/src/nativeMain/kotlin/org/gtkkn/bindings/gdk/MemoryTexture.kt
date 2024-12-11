// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkMemoryTexture
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gdk.gdk_memory_texture_get_type
import org.gtkkn.native.gdk.gdk_memory_texture_new
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.gsize

/**
 * A `GdkTexture` representing image data in memory.
 */
public open class MemoryTexture(pointer: CPointer<GdkMemoryTexture>) :
    Texture(pointer.reinterpret()),
    KGTyped {
    public val gdkMemoryTexturePointer: CPointer<GdkMemoryTexture>
        get() = gPointer.reinterpret()

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = gPointer.reinterpret()

    override val gioIconPointer: CPointer<GIcon>
        get() = gPointer.reinterpret()

    override val gioLoadableIconPointer: CPointer<GLoadableIcon>
        get() = gPointer.reinterpret()

    /**
     * Creates a new texture for a blob of image data.
     *
     * The `GBytes` must contain @stride × @height pixels
     * in the given format.
     *
     * @param width the width of the texture
     * @param height the height of the texture
     * @param format the format of the data
     * @param bytes the `GBytes` containing the pixel data
     * @param stride rowstride for the data
     * @return A newly-created `GdkTexture`
     */
    public constructor(
        width: gint,
        height: gint,
        format: MemoryFormat,
        bytes: Bytes,
        stride: gsize,
    ) : this(
        gdk_memory_texture_new(
            width,
            height,
            format.nativeValue,
            bytes.glibBytesPointer.reinterpret(),
            stride
        )!!.reinterpret()
    )

    public companion object : TypeCompanion<MemoryTexture> {
        override val type: GeneratedClassKGType<MemoryTexture> =
            GeneratedClassKGType(gdk_memory_texture_get_type()) { MemoryTexture(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of MemoryTexture
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_memory_texture_get_type()
    }
}
