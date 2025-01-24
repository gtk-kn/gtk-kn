// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_12
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitWebViewSessionState
import org.gtkkn.native.webkit.webkit_web_view_session_state_get_type
import org.gtkkn.native.webkit.webkit_web_view_session_state_new
import org.gtkkn.native.webkit.webkit_web_view_session_state_ref
import org.gtkkn.native.webkit.webkit_web_view_session_state_serialize
import org.gtkkn.native.webkit.webkit_web_view_session_state_unref
import kotlin.Unit

/**
 * Handles serialization of a web view's browsing state.
 * @since 2.12
 */
@WebKitVersion2_12
public class WebViewSessionState(public val webkitWebViewSessionStatePointer: CPointer<WebKitWebViewSessionState>) :
    ProxyInstance(webkitWebViewSessionStatePointer) {
    /**
     * Atomically increments the reference count of @state by one.
     *
     * This
     * function is MT-safe and may be called from any thread.
     *
     * @return The passed in #WebKitWebViewSessionState
     * @since 2.12
     */
    @WebKitVersion2_12
    public fun ref(): WebViewSessionState = webkit_web_view_session_state_ref(webkitWebViewSessionStatePointer)!!.run {
        WebViewSessionState(this)
    }

    /**
     * Serializes a #WebKitWebViewSessionState.
     *
     * @return a #GBytes containing the @state serialized.
     * @since 2.12
     */
    @WebKitVersion2_12
    public fun serialize(): Bytes = webkit_web_view_session_state_serialize(webkitWebViewSessionStatePointer)!!.run {
        Bytes(this)
    }

    /**
     * Atomically decrements the reference count of @state by one.
     *
     * If the
     * reference count drops to 0, all memory allocated by the #WebKitWebViewSessionState is
     * released. This function is MT-safe and may be called from any thread.
     *
     * @since 2.12
     */
    @WebKitVersion2_12
    public fun unref(): Unit = webkit_web_view_session_state_unref(webkitWebViewSessionStatePointer)

    public companion object {
        /**
         * Creates a new #WebKitWebViewSessionState from serialized data.
         *
         * @param data a #GBytes
         * @return a new #WebKitWebViewSessionState, or null if @data doesn't contain a
         *     valid serialized #WebKitWebViewSessionState.
         * @since 2.12
         */
        public fun new(`data`: Bytes): WebViewSessionState =
            WebViewSessionState(webkit_web_view_session_state_new(`data`.glibBytesPointer)!!.reinterpret())

        /**
         * Get the GType of WebViewSessionState
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_web_view_session_state_get_type()
    }
}
