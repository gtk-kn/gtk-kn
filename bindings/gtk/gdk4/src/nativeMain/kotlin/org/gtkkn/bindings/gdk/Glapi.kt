// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.gdk.annotations.GdkVersion4_6
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_GL_API_GL
import org.gtkkn.native.gdk.GDK_GL_API_GLES
import org.gtkkn.native.gdk.GdkGLAPI
import org.gtkkn.native.gdk.gdk_gl_api_get_type
import org.gtkkn.native.gobject.GType

/**
 * The list of the different APIs that GdkGLContext can potentially support.
 * @since 4.6
 */
public class Glapi(public val mask: GdkGLAPI) : Bitfield<Glapi> {
    override infix fun or(other: Glapi): Glapi = Glapi(mask or other.mask)

    @GdkVersion4_6
    public companion object {
        /**
         * The OpenGL API
         */
        public val GL: Glapi = Glapi(GDK_GL_API_GL)

        /**
         * The OpenGL ES API
         */
        public val GLES: Glapi = Glapi(GDK_GL_API_GLES)

        /**
         * Get the GType of GLAPI
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_gl_api_get_type()
    }
}
