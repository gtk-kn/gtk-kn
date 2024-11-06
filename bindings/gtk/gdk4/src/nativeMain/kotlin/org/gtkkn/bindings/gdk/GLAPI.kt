// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.gdk.annotations.GdkVersion4_6
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_GL_API_GL
import org.gtkkn.native.gdk.GDK_GL_API_GLES
import org.gtkkn.native.gdk.GdkGLAPI

/**
 * The list of the different APIs that GdkGLContext can potentially support.
 * @since 4.6
 */
public class GLAPI(
    public val mask: GdkGLAPI,
) : Bitfield<GLAPI> {
    override infix fun or(other: GLAPI): GLAPI = GLAPI(mask or other.mask)

    @GdkVersion4_6
    public companion object {
        /**
         * The OpenGL API
         */
        public val GL: GLAPI = GLAPI(GDK_GL_API_GL)

        /**
         * The OpenGL ES API
         */
        public val GLES: GLAPI = GLAPI(GDK_GL_API_GLES)
    }
}
