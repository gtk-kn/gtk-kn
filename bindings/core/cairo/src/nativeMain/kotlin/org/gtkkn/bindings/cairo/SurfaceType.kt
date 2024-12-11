// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_gobject_surface_type_get_type
import org.gtkkn.native.cairo.cairo_surface_type_t
import org.gtkkn.native.gobject.GType

public enum class SurfaceType(public val nativeValue: cairo_surface_type_t) {
    IMAGE(cairo_surface_type_t.CAIRO_SURFACE_TYPE_IMAGE),
    PDF(cairo_surface_type_t.CAIRO_SURFACE_TYPE_PDF),
    PS(cairo_surface_type_t.CAIRO_SURFACE_TYPE_PS),
    XLIB(cairo_surface_type_t.CAIRO_SURFACE_TYPE_XLIB),
    XCB(cairo_surface_type_t.CAIRO_SURFACE_TYPE_XCB),
    GLITZ(cairo_surface_type_t.CAIRO_SURFACE_TYPE_GLITZ),
    QUARTZ(cairo_surface_type_t.CAIRO_SURFACE_TYPE_QUARTZ),
    WIN32(cairo_surface_type_t.CAIRO_SURFACE_TYPE_WIN32),
    BEOS(cairo_surface_type_t.CAIRO_SURFACE_TYPE_BEOS),
    DIRECTFB(cairo_surface_type_t.CAIRO_SURFACE_TYPE_DIRECTFB),
    SVG(cairo_surface_type_t.CAIRO_SURFACE_TYPE_SVG),
    OS2(cairo_surface_type_t.CAIRO_SURFACE_TYPE_OS2),
    WIN32_PRINTING(cairo_surface_type_t.CAIRO_SURFACE_TYPE_WIN32_PRINTING),
    QUARTZ_IMAGE(cairo_surface_type_t.CAIRO_SURFACE_TYPE_QUARTZ_IMAGE),
    SCRIPT(cairo_surface_type_t.CAIRO_SURFACE_TYPE_SCRIPT),
    QT(cairo_surface_type_t.CAIRO_SURFACE_TYPE_QT),
    RECORDING(cairo_surface_type_t.CAIRO_SURFACE_TYPE_RECORDING),
    VG(cairo_surface_type_t.CAIRO_SURFACE_TYPE_VG),
    GL(cairo_surface_type_t.CAIRO_SURFACE_TYPE_GL),
    DRM(cairo_surface_type_t.CAIRO_SURFACE_TYPE_DRM),
    TEE(cairo_surface_type_t.CAIRO_SURFACE_TYPE_TEE),
    XML(cairo_surface_type_t.CAIRO_SURFACE_TYPE_XML),
    SKIA(cairo_surface_type_t.CAIRO_SURFACE_TYPE_SKIA),
    SUBSURFACE(cairo_surface_type_t.CAIRO_SURFACE_TYPE_SUBSURFACE),
    COGL(cairo_surface_type_t.CAIRO_SURFACE_TYPE_COGL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_surface_type_t): SurfaceType = when (nativeValue) {
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_IMAGE -> IMAGE
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_PDF -> PDF
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_PS -> PS
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_XLIB -> XLIB
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_XCB -> XCB
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_GLITZ -> GLITZ
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_QUARTZ -> QUARTZ
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_WIN32 -> WIN32
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_BEOS -> BEOS
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_DIRECTFB -> DIRECTFB
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_SVG -> SVG
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_OS2 -> OS2
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_WIN32_PRINTING -> WIN32_PRINTING
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_QUARTZ_IMAGE -> QUARTZ_IMAGE
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_SCRIPT -> SCRIPT
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_QT -> QT
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_RECORDING -> RECORDING
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_VG -> VG
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_GL -> GL
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_DRM -> DRM
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_TEE -> TEE
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_XML -> XML
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_SKIA -> SKIA
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_SUBSURFACE -> SUBSURFACE
            cairo_surface_type_t.CAIRO_SURFACE_TYPE_COGL -> COGL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SurfaceType
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_type_get_type()
    }
}
