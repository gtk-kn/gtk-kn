// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_12
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.webkit.WebKitWebViewSessionState
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
public class WebViewSessionState(
    pointer: CPointer<WebKitWebViewSessionState>,
) : Record {
    public val webkitWebViewSessionStatePointer: CPointer<WebKitWebViewSessionState> = pointer

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
    public fun ref(): WebViewSessionState =
        webkit_web_view_session_state_ref(webkitWebViewSessionStatePointer.reinterpret())!!.run {
            WebViewSessionState(reinterpret())
        }

    /**
     * Serializes a #WebKitWebViewSessionState.
     *
     * @return a #GBytes containing the @state serialized.
     * @since 2.12
     */
    @WebKitVersion2_12
    public fun serialize(): Bytes =
        webkit_web_view_session_state_serialize(webkitWebViewSessionStatePointer.reinterpret())!!.run {
            Bytes(reinterpret())
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
    public fun unref(): Unit = webkit_web_view_session_state_unref(webkitWebViewSessionStatePointer.reinterpret())

    public companion object : RecordCompanion<WebViewSessionState, WebKitWebViewSessionState> {
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

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): WebViewSessionState =
            WebViewSessionState(pointer.reinterpret())
    }
}
