// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.gdk.annotations.GdkVersion4_6
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gdk.GdkTextureError
import org.gtkkn.native.gdk.gdk_texture_error_get_type
import org.gtkkn.native.gdk.gdk_texture_error_quark
import org.gtkkn.native.gobject.GType

/**
 * Possible errors that can be returned by `GdkTexture` constructors.
 * @since 4.6
 */
@GdkVersion4_6
public enum class TextureError(public val nativeValue: GdkTextureError) {
    /**
     * Not enough memory to handle this image
     */
    TOO_LARGE(GdkTextureError.GDK_TEXTURE_ERROR_TOO_LARGE),

    /**
     * The image data appears corrupted
     */
    CORRUPT_IMAGE(GdkTextureError.GDK_TEXTURE_ERROR_CORRUPT_IMAGE),

    /**
     * The image contains features
     *   that cannot be loaded
     */
    UNSUPPORTED_CONTENT(GdkTextureError.GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT),

    /**
     * The image format is not supported
     */
    UNSUPPORTED_FORMAT(GdkTextureError.GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkTextureError): TextureError = when (nativeValue) {
            GdkTextureError.GDK_TEXTURE_ERROR_TOO_LARGE -> TOO_LARGE
            GdkTextureError.GDK_TEXTURE_ERROR_CORRUPT_IMAGE -> CORRUPT_IMAGE
            GdkTextureError.GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT -> UNSUPPORTED_CONTENT
            GdkTextureError.GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT -> UNSUPPORTED_FORMAT
            else -> error("invalid nativeValue")
        }

        public fun quark(): Quark = gdk_texture_error_quark()

        /**
         * Get the GType of TextureError
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_texture_error_get_type()

        public fun fromErrorOrNull(error: Error): TextureError? = if (error.domain != quark()) {
            null
        } else {
            TextureError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
