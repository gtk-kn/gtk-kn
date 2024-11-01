// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gdk.GdkGLError
import org.gtkkn.native.gdk.GdkGLError.GDK_GL_ERROR_COMPILATION_FAILED
import org.gtkkn.native.gdk.GdkGLError.GDK_GL_ERROR_LINK_FAILED
import org.gtkkn.native.gdk.GdkGLError.GDK_GL_ERROR_NOT_AVAILABLE
import org.gtkkn.native.gdk.GdkGLError.GDK_GL_ERROR_UNSUPPORTED_FORMAT
import org.gtkkn.native.gdk.GdkGLError.GDK_GL_ERROR_UNSUPPORTED_PROFILE
import org.gtkkn.native.gdk.gdk_gl_error_quark
import kotlin.UInt

/**
 * Error enumeration for `GdkGLContext`.
 */
public enum class GLError(
    public val nativeValue: GdkGLError,
) {
    /**
     * OpenGL support is not available
     */
    NOT_AVAILABLE(GDK_GL_ERROR_NOT_AVAILABLE),

    /**
     * The requested visual format is not supported
     */
    UNSUPPORTED_FORMAT(GDK_GL_ERROR_UNSUPPORTED_FORMAT),

    /**
     * The requested profile is not supported
     */
    UNSUPPORTED_PROFILE(GDK_GL_ERROR_UNSUPPORTED_PROFILE),

    /**
     * The shader compilation failed
     */
    COMPILATION_FAILED(GDK_GL_ERROR_COMPILATION_FAILED),

    /**
     * The shader linking failed
     */
    LINK_FAILED(GDK_GL_ERROR_LINK_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkGLError): GLError =
            when (nativeValue) {
                GDK_GL_ERROR_NOT_AVAILABLE -> NOT_AVAILABLE
                GDK_GL_ERROR_UNSUPPORTED_FORMAT -> UNSUPPORTED_FORMAT
                GDK_GL_ERROR_UNSUPPORTED_PROFILE -> UNSUPPORTED_PROFILE
                GDK_GL_ERROR_COMPILATION_FAILED -> COMPILATION_FAILED
                GDK_GL_ERROR_LINK_FAILED -> LINK_FAILED
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = gdk_gl_error_quark()

        public fun fromErrorOrNull(error: Error): GLError? =
            if (error.domain != quark()) {
                null
            } else {
                GLError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
