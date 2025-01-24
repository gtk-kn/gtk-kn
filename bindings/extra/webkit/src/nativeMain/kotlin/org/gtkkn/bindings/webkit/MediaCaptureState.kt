// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_34
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitMediaCaptureState
import org.gtkkn.native.webkit.webkit_media_capture_state_get_type

/**
 * Enum values used to specify the capture state of a media device.
 * @since 2.34
 */
@WebKitVersion2_34
public enum class MediaCaptureState(public val nativeValue: WebKitMediaCaptureState) {
    /**
     * Media capture is disabled.
     */
    NONE(WebKitMediaCaptureState.WEBKIT_MEDIA_CAPTURE_STATE_NONE),

    /**
     * Media capture is active.
     */
    ACTIVE(WebKitMediaCaptureState.WEBKIT_MEDIA_CAPTURE_STATE_ACTIVE),

    /**
     * Media capture is muted.
     */
    MUTED(WebKitMediaCaptureState.WEBKIT_MEDIA_CAPTURE_STATE_MUTED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitMediaCaptureState): MediaCaptureState = when (nativeValue) {
            WebKitMediaCaptureState.WEBKIT_MEDIA_CAPTURE_STATE_NONE -> NONE
            WebKitMediaCaptureState.WEBKIT_MEDIA_CAPTURE_STATE_ACTIVE -> ACTIVE
            WebKitMediaCaptureState.WEBKIT_MEDIA_CAPTURE_STATE_MUTED -> MUTED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of MediaCaptureState
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_media_capture_state_get_type()
    }
}
