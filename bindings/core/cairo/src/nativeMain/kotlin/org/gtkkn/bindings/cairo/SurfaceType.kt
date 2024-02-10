// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_surface_type_t
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_BEOS
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_COGL
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_DIRECTFB
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_DRM
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_GL
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_GLITZ
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_IMAGE
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_OS2
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_PDF
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_PS
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_QT
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_QUARTZ
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_QUARTZ_IMAGE
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_RECORDING
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_SCRIPT
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_SKIA
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_SUBSURFACE
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_SVG
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_TEE
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_VG
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_WIN32
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_WIN32_PRINTING
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_XCB
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_XLIB
import org.gtkkn.native.cairo.cairo_surface_type_t.CAIRO_SURFACE_TYPE_XML

public enum class SurfaceType(
    public val nativeValue: cairo_surface_type_t,
) {
    IMAGE(CAIRO_SURFACE_TYPE_IMAGE),
    PDF(CAIRO_SURFACE_TYPE_PDF),
    PS(CAIRO_SURFACE_TYPE_PS),
    XLIB(CAIRO_SURFACE_TYPE_XLIB),
    XCB(CAIRO_SURFACE_TYPE_XCB),
    GLITZ(CAIRO_SURFACE_TYPE_GLITZ),
    QUARTZ(CAIRO_SURFACE_TYPE_QUARTZ),
    WIN32(CAIRO_SURFACE_TYPE_WIN32),
    BEOS(CAIRO_SURFACE_TYPE_BEOS),
    DIRECTFB(CAIRO_SURFACE_TYPE_DIRECTFB),
    SVG(CAIRO_SURFACE_TYPE_SVG),
    OS2(CAIRO_SURFACE_TYPE_OS2),
    WIN32_PRINTING(CAIRO_SURFACE_TYPE_WIN32_PRINTING),
    QUARTZ_IMAGE(CAIRO_SURFACE_TYPE_QUARTZ_IMAGE),
    SCRIPT(CAIRO_SURFACE_TYPE_SCRIPT),
    QT(CAIRO_SURFACE_TYPE_QT),
    RECORDING(CAIRO_SURFACE_TYPE_RECORDING),
    VG(CAIRO_SURFACE_TYPE_VG),
    GL(CAIRO_SURFACE_TYPE_GL),
    DRM(CAIRO_SURFACE_TYPE_DRM),
    TEE(CAIRO_SURFACE_TYPE_TEE),
    XML(CAIRO_SURFACE_TYPE_XML),
    SKIA(CAIRO_SURFACE_TYPE_SKIA),
    SUBSURFACE(CAIRO_SURFACE_TYPE_SUBSURFACE),
    COGL(CAIRO_SURFACE_TYPE_COGL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_surface_type_t): SurfaceType =
            when (nativeValue) {
                CAIRO_SURFACE_TYPE_IMAGE -> IMAGE
                CAIRO_SURFACE_TYPE_PDF -> PDF
                CAIRO_SURFACE_TYPE_PS -> PS
                CAIRO_SURFACE_TYPE_XLIB -> XLIB
                CAIRO_SURFACE_TYPE_XCB -> XCB
                CAIRO_SURFACE_TYPE_GLITZ -> GLITZ
                CAIRO_SURFACE_TYPE_QUARTZ -> QUARTZ
                CAIRO_SURFACE_TYPE_WIN32 -> WIN32
                CAIRO_SURFACE_TYPE_BEOS -> BEOS
                CAIRO_SURFACE_TYPE_DIRECTFB -> DIRECTFB
                CAIRO_SURFACE_TYPE_SVG -> SVG
                CAIRO_SURFACE_TYPE_OS2 -> OS2
                CAIRO_SURFACE_TYPE_WIN32_PRINTING -> WIN32_PRINTING
                CAIRO_SURFACE_TYPE_QUARTZ_IMAGE -> QUARTZ_IMAGE
                CAIRO_SURFACE_TYPE_SCRIPT -> SCRIPT
                CAIRO_SURFACE_TYPE_QT -> QT
                CAIRO_SURFACE_TYPE_RECORDING -> RECORDING
                CAIRO_SURFACE_TYPE_VG -> VG
                CAIRO_SURFACE_TYPE_GL -> GL
                CAIRO_SURFACE_TYPE_DRM -> DRM
                CAIRO_SURFACE_TYPE_TEE -> TEE
                CAIRO_SURFACE_TYPE_XML -> XML
                CAIRO_SURFACE_TYPE_SKIA -> SKIA
                CAIRO_SURFACE_TYPE_SUBSURFACE -> SUBSURFACE
                CAIRO_SURFACE_TYPE_COGL -> COGL
                else -> error("invalid nativeValue")
            }
    }
}
