// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitMediaError
import org.gtkkn.native.webkit.webkit_media_error_get_type
import org.gtkkn.native.webkit.webkit_media_error_quark

/**
 * Enum values used to denote the various media errors.
 * @since 2.40
 */
@WebKitVersion2_40
public enum class MediaError(public val nativeValue: WebKitMediaError) {
    /**
     * Preliminary load failure for media content types. A new load will be started to perform the media load. Since: 2.40
     */
    LOAD(WebKitMediaError.WEBKIT_MEDIA_ERROR_WILL_HANDLE_LOAD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitMediaError): MediaError = when (nativeValue) {
            WebKitMediaError.WEBKIT_MEDIA_ERROR_WILL_HANDLE_LOAD -> LOAD
            else -> error("invalid nativeValue")
        }

        /**
         * Gets the quark for the domain of media errors.
         *
         * @return media error domin.
         * @since 2.40
         */
        @WebKitVersion2_40
        public fun quark(): Quark = webkit_media_error_quark()

        /**
         * Get the GType of MediaError
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_media_error_get_type()

        public fun fromErrorOrNull(error: Error): MediaError? = if (error.domain != quark()) {
            null
        } else {
            MediaError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
