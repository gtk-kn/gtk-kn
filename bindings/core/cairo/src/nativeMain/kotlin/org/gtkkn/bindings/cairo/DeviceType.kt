// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.CAIRO_DEVICE_TYPE_COGL
import org.gtkkn.native.cairo.CAIRO_DEVICE_TYPE_DRM
import org.gtkkn.native.cairo.CAIRO_DEVICE_TYPE_GL
import org.gtkkn.native.cairo.CAIRO_DEVICE_TYPE_INVALID
import org.gtkkn.native.cairo.CAIRO_DEVICE_TYPE_SCRIPT
import org.gtkkn.native.cairo.CAIRO_DEVICE_TYPE_WIN32
import org.gtkkn.native.cairo.CAIRO_DEVICE_TYPE_XCB
import org.gtkkn.native.cairo.CAIRO_DEVICE_TYPE_XLIB
import org.gtkkn.native.cairo.CAIRO_DEVICE_TYPE_XML
import org.gtkkn.native.cairo.cairo_device_type_t
import org.gtkkn.native.cairo.cairo_gobject_device_type_get_type
import org.gtkkn.native.gobject.GType

public enum class DeviceType(public val nativeValue: cairo_device_type_t) {
    DRM(CAIRO_DEVICE_TYPE_DRM),
    GL(CAIRO_DEVICE_TYPE_GL),
    SCRIPT(CAIRO_DEVICE_TYPE_SCRIPT),
    XCB(CAIRO_DEVICE_TYPE_XCB),
    XLIB(CAIRO_DEVICE_TYPE_XLIB),
    XML(CAIRO_DEVICE_TYPE_XML),
    COGL(CAIRO_DEVICE_TYPE_COGL),
    WIN32(CAIRO_DEVICE_TYPE_WIN32),
    INVALID(CAIRO_DEVICE_TYPE_INVALID),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_device_type_t): DeviceType = when (nativeValue) {
            CAIRO_DEVICE_TYPE_DRM -> DRM
            CAIRO_DEVICE_TYPE_GL -> GL
            CAIRO_DEVICE_TYPE_SCRIPT -> SCRIPT
            CAIRO_DEVICE_TYPE_XCB -> XCB
            CAIRO_DEVICE_TYPE_XLIB -> XLIB
            CAIRO_DEVICE_TYPE_XML -> XML
            CAIRO_DEVICE_TYPE_COGL -> COGL
            CAIRO_DEVICE_TYPE_WIN32 -> WIN32
            CAIRO_DEVICE_TYPE_INVALID -> INVALID
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DeviceType
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_device_type_get_type()
    }
}
