// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
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
public class AutomationSession(
    pointer: CPointer<WebKitAutomationSession>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val webkitAutomationSessionPointer: CPointer<WebKitAutomationSession>
        get() = gPointer.reinterpret()

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
        get() =
            webkit_automation_session_get_id(webkitAutomationSessionPointer.reinterpret())?.toKString()
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
        webkit_automation_session_get_application_info(webkitAutomationSessionPointer.reinterpret())!!.run {
            ApplicationInfo(reinterpret())
        }

    /**
     * Get the unique identifier of a #WebKitAutomationSession
     *
     * @return the unique identifier of @session
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun getId(): String =
        webkit_automation_session_get_id(webkitAutomationSessionPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

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
    public fun setApplicationInfo(info: ApplicationInfo): Unit =
        webkit_automation_session_set_application_info(
            webkitAutomationSessionPointer.reinterpret(),
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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns a #WebKitWebView widget.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun connectCreateWebView(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> WebView,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "create-web-view",
            connectCreateWebViewFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when the given automation session is about to finish.
     * It allows clients to perform any cleanup tasks before the session is destroyed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.46
     */
    @WebKitVersion2_46
    public fun connectWillClose(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "will-close",
            connectWillCloseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<AutomationSession> {
        override val type: GeneratedClassKGType<AutomationSession> =
            GeneratedClassKGType(webkit_automation_session_get_type()) { AutomationSession(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }
    }
}

private val connectCreateWebViewFunc: CPointer<CFunction<() -> CPointer<WebKitWebView>>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<() -> WebView>()
            .get()
            .invoke()
            .webkitWebViewPointer
    }.reinterpret()

private val connectWillCloseFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()