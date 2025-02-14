// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.gdk.annotations.GdkVersion4_14
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gdk.GdkDmabufError
import org.gtkkn.native.gdk.gdk_dmabuf_error_get_type
import org.gtkkn.native.gdk.gdk_dmabuf_error_quark
import org.gtkkn.native.gobject.GType

/**
 * Error enumeration for `GdkDmabufTexture`.
 * @since 4.14
 */
@GdkVersion4_14
public enum class DmabufError(public val nativeValue: GdkDmabufError) {
    /**
     * Dmabuf support is not available, because the OS
     *   is not Linux, or it was explicitly disabled at compile- or runtime
     */
    NOT_AVAILABLE(GdkDmabufError.GDK_DMABUF_ERROR_NOT_AVAILABLE),

    /**
     * The requested format is not supported
     */
    UNSUPPORTED_FORMAT(GdkDmabufError.GDK_DMABUF_ERROR_UNSUPPORTED_FORMAT),

    /**
     * GTK failed to create the resource for other
     *   reasons
     */
    CREATION_FAILED(GdkDmabufError.GDK_DMABUF_ERROR_CREATION_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkDmabufError): DmabufError = when (nativeValue) {
            GdkDmabufError.GDK_DMABUF_ERROR_NOT_AVAILABLE -> NOT_AVAILABLE
            GdkDmabufError.GDK_DMABUF_ERROR_UNSUPPORTED_FORMAT -> UNSUPPORTED_FORMAT
            GdkDmabufError.GDK_DMABUF_ERROR_CREATION_FAILED -> CREATION_FAILED
            else -> error("invalid nativeValue")
        }

        /**
         * Registers an error quark for [class@Gdk.DmabufTexture] errors.
         *
         * @return the error quark
         */
        public fun quark(): Quark = gdk_dmabuf_error_quark()

        /**
         * Get the GType of DmabufError
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_dmabuf_error_get_type()

        public fun fromErrorOrNull(error: Error): DmabufError? = if (error.domain != quark()) {
            null
        } else {
            DmabufError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
