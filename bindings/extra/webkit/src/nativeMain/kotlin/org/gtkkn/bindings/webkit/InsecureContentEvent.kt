// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitInsecureContentEvent
import org.gtkkn.native.webkit.webkit_insecure_content_event_get_type

/**
 * Enum values previously used to denote the different events which can trigger
 * the detection of insecure content. Since 2.46, WebKit generally no longer
 * loads insecure content in secure contexts.
 */
public enum class InsecureContentEvent(public val nativeValue: WebKitInsecureContentEvent) {
    /**
     * Insecure content has been detected by
     * trying to execute any kind of logic (e.g. a script) from an
     * untrusted source.
     */
    RUN(WebKitInsecureContentEvent.WEBKIT_INSECURE_CONTENT_RUN),

    /**
     * Insecure content has been
     * detected by trying to display any kind of resource (e.g. an image)
     * from an untrusted source.
     */
    DISPLAYED(WebKitInsecureContentEvent.WEBKIT_INSECURE_CONTENT_DISPLAYED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitInsecureContentEvent): InsecureContentEvent = when (nativeValue) {
            WebKitInsecureContentEvent.WEBKIT_INSECURE_CONTENT_RUN -> RUN
            WebKitInsecureContentEvent.WEBKIT_INSECURE_CONTENT_DISPLAYED -> DISPLAYED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of InsecureContentEvent
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_insecure_content_event_get_type()
    }
}
