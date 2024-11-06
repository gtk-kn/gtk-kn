// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.gdk.annotations.GdkVersion4_14
import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gdk.GdkDmabufError
import org.gtkkn.native.gdk.GdkDmabufError.GDK_DMABUF_ERROR_CREATION_FAILED
import org.gtkkn.native.gdk.GdkDmabufError.GDK_DMABUF_ERROR_NOT_AVAILABLE
import org.gtkkn.native.gdk.GdkDmabufError.GDK_DMABUF_ERROR_UNSUPPORTED_FORMAT
import org.gtkkn.native.gdk.gdk_dmabuf_error_quark
import kotlin.UInt

/**
 * Error enumeration for `GdkDmabufTexture`.
 * @since 4.14
 */
@GdkVersion4_14
public enum class DmabufError(
    public val nativeValue: GdkDmabufError,
) {
    /**
     * Dmabuf support is not available, because the OS
     *   is not Linux, or it was explicitly disabled at compile- or runtime
     */
    NOT_AVAILABLE(GDK_DMABUF_ERROR_NOT_AVAILABLE),

    /**
     * The requested format is not supported
     */
    UNSUPPORTED_FORMAT(GDK_DMABUF_ERROR_UNSUPPORTED_FORMAT),

    /**
     * GTK failed to create the resource for other
     *   reasons
     */
    CREATION_FAILED(GDK_DMABUF_ERROR_CREATION_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkDmabufError): DmabufError =
            when (nativeValue) {
                GDK_DMABUF_ERROR_NOT_AVAILABLE -> NOT_AVAILABLE
                GDK_DMABUF_ERROR_UNSUPPORTED_FORMAT -> UNSUPPORTED_FORMAT
                GDK_DMABUF_ERROR_CREATION_FAILED -> CREATION_FAILED
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = gdk_dmabuf_error_quark()

        public fun fromErrorOrNull(error: Error): DmabufError? =
            if (error.domain != quark()) {
                null
            } else {
                DmabufError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
