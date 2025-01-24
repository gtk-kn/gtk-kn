// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gdk.GdkPixbufError
import org.gtkkn.native.gdk.gdk_pixbuf_error_get_type
import org.gtkkn.native.gdk.gdk_pixbuf_error_quark
import org.gtkkn.native.gobject.GType

/**
 * An error code in the `GDK_PIXBUF_ERROR` domain.
 *
 * Many gdk-pixbuf operations can cause errors in this domain, or in
 * the `G_FILE_ERROR` domain.
 */
public enum class PixbufError(public val nativeValue: GdkPixbufError) {
    /**
     * An image file was broken somehow.
     */
    CORRUPT_IMAGE(GdkPixbufError.GDK_PIXBUF_ERROR_CORRUPT_IMAGE),

    /**
     * Not enough memory.
     */
    INSUFFICIENT_MEMORY(GdkPixbufError.GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY),

    /**
     * A bad option was passed to a pixbuf save module.
     */
    BAD_OPTION(GdkPixbufError.GDK_PIXBUF_ERROR_BAD_OPTION),

    /**
     * Unknown image type.
     */
    UNKNOWN_TYPE(GdkPixbufError.GDK_PIXBUF_ERROR_UNKNOWN_TYPE),

    /**
     * Don't know how to perform the
     *  given operation on the type of image at hand.
     */
    UNSUPPORTED_OPERATION(GdkPixbufError.GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION),

    /**
     * Generic failure code, something went wrong.
     */
    FAILED(GdkPixbufError.GDK_PIXBUF_ERROR_FAILED),

    /**
     * Only part of the animation was loaded.
     */
    INCOMPLETE_ANIMATION(GdkPixbufError.GDK_PIXBUF_ERROR_INCOMPLETE_ANIMATION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkPixbufError): PixbufError = when (nativeValue) {
            GdkPixbufError.GDK_PIXBUF_ERROR_CORRUPT_IMAGE -> CORRUPT_IMAGE
            GdkPixbufError.GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY -> INSUFFICIENT_MEMORY
            GdkPixbufError.GDK_PIXBUF_ERROR_BAD_OPTION -> BAD_OPTION
            GdkPixbufError.GDK_PIXBUF_ERROR_UNKNOWN_TYPE -> UNKNOWN_TYPE
            GdkPixbufError.GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION -> UNSUPPORTED_OPERATION
            GdkPixbufError.GDK_PIXBUF_ERROR_FAILED -> FAILED
            GdkPixbufError.GDK_PIXBUF_ERROR_INCOMPLETE_ANIMATION -> INCOMPLETE_ANIMATION
            else -> error("invalid nativeValue")
        }

        public fun quark(): Quark = gdk_pixbuf_error_quark()

        /**
         * Get the GType of PixbufError
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_error_get_type()

        public fun fromErrorOrNull(error: Error): PixbufError? = if (error.domain != quark()) {
            null
        } else {
            PixbufError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
