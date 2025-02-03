// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_18
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_46
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitAutomationSession
import org.gtkkn.native.webkit.WebKitWebView
import org.gtkkn.native.webkit.webkit_automation_session_get_application_info
import org.gtkkn.native.webkit.webkit_automation_session_get_id
import org.gtkkn.native.webkit.webkit_automation_session_get_type
import org.gtkkn.native.webkit.webkit_automation_session_set_application_info
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Automation Session.
 *
 * WebKitAutomationSession represents an automation session of a WebKitWebContext.
 * When a new session is requested, a WebKitAutomationSession is created and the signal
 * WebKitWebContext::automation-started is emitted with the WebKitAutomationSession as
 * argument. Then, the automation client can request the session to create a new
 * #WebKitWebView to interact with it. When this happens the signal #WebKitAutomationSession::create-web-view
 * is emitted.
 * @since 2.18
 */
@WebKitVersion2_18
public class AutomationSession(public val webkitAutomationSessionPointer: CPointer<WebKitAutomationSession>) :
    Object(webkitAutomationSessionPointer.reinterpret()),
    KGTyped {
    init {
        WebKit
    }

    /**
     * The session unique identifier.
     *
     * @since 2.18
     */
    @WebKitVersion2_18
    public val id: String
        /**
         * Get the unique identifier of a #WebKitAutomationSession
         *
         * @return the unique identifier of @session
         * @since 2.18
         */
        get() = webkit_automation_session_get_id(webkitAutomationSessionPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the the previously set #WebKitAutomationSession.
     *
     * Get the #WebKitAutomationSession previously set with webkit_automation_session_set_application_info().
     *
     * @return the #WebKitAutomationSession of @session, or null if no one has been set.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun getApplicationInfo(): ApplicationInfo =
        webkit_automation_session_get_application_info(webkitAutomationSessionPointer)!!.run {
            ApplicationInfo(this)
        }

    /**
     * Set the application information to @session.
     *
     * This information will be used by the driver service
     * to match the requested capabilities with the actual application information. If this information
     * is not provided to the session when a new automation session is requested, the creation might fail
     * if the client requested a specific browser name or version. This will not have any effect when called
     * after the automation session has been fully created, so this must be called in the callback of
     * #WebKitWebContext::automation-started signal.
     *
     * @param info a #WebKitApplicationInfo
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun setApplicationInfo(info: ApplicationInfo): Unit = webkit_automation_session_set_application_info(
        webkitAutomationSessionPointer,
        info.webkitApplicationInfoPointer
    )

    /**
     * This signal is emitted when the automation client requests a new
     * browsing context to interact with it. The callback handler should
     * return a #WebKitWebView created with #WebKitWebView:is-controlled-by-automation
     * construct property enabled and #WebKitWebView:automation-presentation-type construct
     * property set if needed.
     *
     * If the signal is emitted with "tab" detail, the returned #WebKitWebView should be
     * a new web view added to a new tab of the current browsing context window.
     * If the signal is emitted with "window" detail, the returned #WebKitWebView should be
     * a new web view added to a new window.
     * When creating a new web view and there's an active browsing context, the new window
     * or tab shouldn't be focused.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param detail the signal detail
     * @param handler the Callback to connect. Returns a #WebKitWebView widget.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun onCreateWebView(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        detail: String? = null,
        handler: () -> WebView,
    ): ULong = g_signal_connect_data(
        webkitAutomationSessionPointer,
        "create-web-view" + (
            detail?.let {
                "::$it"
            } ?: ""
            ),
        onCreateWebViewFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when the given automation session is about to finish.
     * It allows clients to perform any cleanup tasks before the session is destroyed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.46
     */
    @WebKitVersion2_46
    public fun onWillClose(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            webkitAutomationSessionPointer,
            "will-close",
            onWillCloseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "will-close" signal. See [onWillClose].
     *
     * @since 2.46
     */
    @WebKitVersion2_46
    public fun emitWillClose() {
        g_signal_emit_by_name(webkitAutomationSessionPointer.reinterpret(), "will-close")
    }

    public companion object : TypeCompanion<AutomationSession> {
        override val type: GeneratedClassKGType<AutomationSession> =
            GeneratedClassKGType(getTypeOrNull()!!) { AutomationSession(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of AutomationSession
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_automation_session_get_type()

        /**
         * Gets the GType of from the symbol `webkit_automation_session_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_automation_session_get_type")
    }
}

private val onCreateWebViewFunc: CPointer<CFunction<() -> CPointer<WebKitWebView>>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> WebView>().get().invoke().webkitWebViewPointer
    }
        .reinterpret()

private val onWillCloseFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
