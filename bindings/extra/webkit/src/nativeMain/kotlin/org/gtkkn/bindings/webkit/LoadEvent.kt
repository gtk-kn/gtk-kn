// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitLoadEvent
import org.gtkkn.native.webkit.webkit_load_event_get_type

/**
 * Enum values used to denote the different events that happen during a
 * #WebKitWebView load operation.
 */
public enum class LoadEvent(public val nativeValue: WebKitLoadEvent) {
    /**
     * A new load request has been made.
     * No data has been received yet, empty structures have
     * been allocated to perform the load; the load may still
     * fail due to transport issues such as not being able to
     * resolve a name, or connect to a port.
     */
    STARTED(WebKitLoadEvent.WEBKIT_LOAD_STARTED),

    /**
     * A provisional data source received
     * a server redirect.
     */
    REDIRECTED(WebKitLoadEvent.WEBKIT_LOAD_REDIRECTED),

    /**
     * The content started arriving for a page load.
     * The necessary transport requirements are established, and the
     * load is being performed.
     */
    COMMITTED(WebKitLoadEvent.WEBKIT_LOAD_COMMITTED),

    /**
     * Load completed. All resources are done loading
     * or there was an error during the load operation.
     */
    FINISHED(WebKitLoadEvent.WEBKIT_LOAD_FINISHED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitLoadEvent): LoadEvent = when (nativeValue) {
            WebKitLoadEvent.WEBKIT_LOAD_STARTED -> STARTED
            WebKitLoadEvent.WEBKIT_LOAD_REDIRECTED -> REDIRECTED
            WebKitLoadEvent.WEBKIT_LOAD_COMMITTED -> COMMITTED
            WebKitLoadEvent.WEBKIT_LOAD_FINISHED -> FINISHED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of LoadEvent
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_load_event_get_type()
    }
}
