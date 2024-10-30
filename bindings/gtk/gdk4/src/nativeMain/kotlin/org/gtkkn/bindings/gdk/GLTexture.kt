// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkGLTexture
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gdk.gdk_gl_texture_get_type
import org.gtkkn.native.gdk.gdk_gl_texture_release
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon
import kotlin.Unit

/**
 * A GdkTexture representing a GL texture object.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `destroy`: GLib.DestroyNotify
 */
public open class GLTexture(
    pointer: CPointer<GdkGLTexture>,
) : Texture(pointer.reinterpret()),
    KGTyped {
    public val gdkGLTexturePointer: CPointer<GdkGLTexture>
        get() = gPointer.reinterpret()

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = gPointer.reinterpret()

    override val gioIconPointer: CPointer<GIcon>
        get() = gPointer.reinterpret()

    override val gioLoadableIconPointer: CPointer<GLoadableIcon>
        get() = gPointer.reinterpret()

    /**
     * Releases the GL resources held by a `GdkGLTexture`.
     *
     * The texture contents are still available via the
     * [method@Gdk.Texture.download] function, after this
     * function has been called.
     */
    public open fun release(): Unit = gdk_gl_texture_release(gdkGLTexturePointer.reinterpret())

    public companion object : TypeCompanion<GLTexture> {
        override val type: GeneratedClassKGType<GLTexture> =
            GeneratedClassKGType(gdk_gl_texture_get_type()) { GLTexture(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
