// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkGLTexture
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gdk.gdk_gl_texture_get_type
import org.gtkkn.native.gdk.gdk_gl_texture_release
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * A GdkTexture representing a GL texture object.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `destroy`: GLib.DestroyNotify
 */
public open class GlTexture(public val gdkGlTexturePointer: CPointer<GdkGLTexture>) :
    Texture(gdkGlTexturePointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = handle.reinterpret()

    override val gioIconPointer: CPointer<GIcon>
        get() = handle.reinterpret()

    override val gioLoadableIconPointer: CPointer<GLoadableIcon>
        get() = handle.reinterpret()

    /**
     * Releases the GL resources held by a `GdkGLTexture`.
     *
     * The texture contents are still available via the
     * [method@Gdk.Texture.download] function, after this
     * function has been called.
     */
    public open fun release(): Unit = gdk_gl_texture_release(gdkGlTexturePointer)

    public companion object : TypeCompanion<GlTexture> {
        override val type: GeneratedClassKGType<GlTexture> =
            GeneratedClassKGType(getTypeOrNull()!!) { GlTexture(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of GLTexture
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_gl_texture_get_type()

        /**
         * Gets the GType of from the symbol `gdk_gl_texture_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_gl_texture_get_type")
    }
}
