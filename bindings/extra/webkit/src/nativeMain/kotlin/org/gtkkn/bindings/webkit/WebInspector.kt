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
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitWebInspector
import org.gtkkn.native.webkit.webkit_web_inspector_attach
import org.gtkkn.native.webkit.webkit_web_inspector_close
import org.gtkkn.native.webkit.webkit_web_inspector_detach
import org.gtkkn.native.webkit.webkit_web_inspector_get_attached_height
import org.gtkkn.native.webkit.webkit_web_inspector_get_can_attach
import org.gtkkn.native.webkit.webkit_web_inspector_get_inspected_uri
import org.gtkkn.native.webkit.webkit_web_inspector_get_type
import org.gtkkn.native.webkit.webkit_web_inspector_get_web_view
import org.gtkkn.native.webkit.webkit_web_inspector_is_attached
import org.gtkkn.native.webkit.webkit_web_inspector_show
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Access to the WebKit inspector.
 *
 * The WebKit Inspector is a graphical tool to inspect and change the
 * content of a #WebKitWebView. It also includes an interactive
 * JavaScript debugger. Using this class one can get a #GtkWidget
 * which can be embedded into an application to show the inspector.
 *
 * The inspector is available when the #WebKitSettings of the
 * #WebKitWebView has set the #WebKitSettings:enable-developer-extras
 * to true, otherwise no inspector is available.
 *
 * ```c
 * // Enable the developer extras
 * WebKitSettings *settings = webkit_web_view_get_settings (WEBKIT_WEB_VIEW(my_webview));
 * g_object_set (G_OBJECT(settings), "enable-developer-extras", TRUE, NULL);
 *
 * // Load some data or reload to be able to inspect the page
 * webkit_web_view_load_uri (WEBKIT_WEB_VIEW(my_webview), "http://www.gnome.org");
 *
 * // Show the inspector
 * WebKitWebInspector *inspector = webkit_web_view_get_inspector (WEBKIT_WEB_VIEW(my_webview));
 * webkit_web_inspector_show (WEBKIT_WEB_INSPECTOR(inspector));
 * ```
 */
public class WebInspector(public val webkitWebInspectorPointer: CPointer<WebKitWebInspector>) :
    Object(webkitWebInspectorPointer.reinterpret()),
    KGTyped {
    /**
     * The height that the inspector view should have when it is attached.
     */
    public val attachedHeight: guint
        /**
         * Get the height that the inspector view when attached.
         *
         * Get the height that the inspector view should have when
         * it's attached. If the inspector view is not attached this
         * returns 0.
         *
         * @return the height of the inspector view when attached
         */
        get() = webkit_web_inspector_get_attached_height(webkitWebInspectorPointer)

    /**
     * Whether the @inspector can be attached to the same window that contains
     * the inspected view.
     *
     * @since 2.8
     */
    @WebKitVersion2_8
    public val canAttach: Boolean
        /**
         * Whether the @inspector can be attached to the same window that contains
         * the inspected view.
         *
         * @return true if there is enough room for the inspector view inside the
         *     window that contains the inspected view, or false otherwise.
         * @since 2.8
         */
        get() = webkit_web_inspector_get_can_attach(webkitWebInspectorPointer).asBoolean()

    /**
     * The URI that is currently being inspected.
     */
    public val inspectedUri: String
        /**
         * Get the URI that is currently being inspected.
         *
         * This can be null if
         * nothing has been loaded yet in the inspected view, if the inspector
         * has been closed or when inspected view was loaded from a HTML string
         * instead of a URI.
         *
         * @return the URI that is currently being inspected or null
         */
        get() = webkit_web_inspector_get_inspected_uri(webkitWebInspectorPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Request @inspector to be attached.
     *
     * The signal #WebKitWebInspector::attach
     * will be emitted. If the inspector is already attached it does nothing.
     */
    public fun attach(): Unit = webkit_web_inspector_attach(webkitWebInspectorPointer)

    /**
     * Request @inspector to be closed.
     */
    public fun close(): Unit = webkit_web_inspector_close(webkitWebInspectorPointer)

    /**
     * Request @inspector to be detached.
     *
     * The signal #WebKitWebInspector::detach
     * will be emitted. If the inspector is already detached it does nothing.
     */
    public fun detach(): Unit = webkit_web_inspector_detach(webkitWebInspectorPointer)

    /**
     * Get the #WebKitWebViewBase used to display the inspector.
     *
     * This might be null if the inspector hasn't been loaded yet,
     * or it has been closed.
     *
     * @return the #WebKitWebViewBase used to display the inspector or null
     */
    public fun getWebView(): WebViewBase = webkit_web_inspector_get_web_view(webkitWebInspectorPointer)!!.run {
        WebViewBase(this)
    }

    /**
     * Whether the @inspector view is currently attached to the same window that contains
     * the inspected view.
     *
     * @return true if @inspector is currently attached or false otherwise
     */
    public fun isAttached(): Boolean = webkit_web_inspector_is_attached(webkitWebInspectorPointer).asBoolean()

    /**
     * Request @inspector to be shown.
     */
    public fun show(): Unit = webkit_web_inspector_show(webkitWebInspectorPointer)

    /**
     * Emitted when the inspector is requested to be attached to the window
     * where the inspected web view is.
     * If this signal is not handled the inspector view will be automatically
     * attached to the inspected view, so you only need to handle this signal
     * if you want to attach the inspector view yourself (for example, to add
     * the inspector view to a browser tab).
     *
     * To prevent the inspector view from being attached you can connect to this
     * signal and simply return true.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     */
    public fun onAttach(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            webkitWebInspectorPointer,
            "attach",
            onAttachFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the inspector should be shown.
     *
     * If the inspector is not attached the inspector window should be shown
     * on top of any other windows.
     * If the inspector is attached the inspector view should be made visible.
     * For example, if the inspector view is attached using a tab in a browser
     * window, the browser window should be raised and the tab containing the
     * inspector view should be the active one.
     * In both cases, if this signal is not handled, the default implementation
     * calls gtk_window_present() on the current toplevel #GtkWindow of the
     * inspector view.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     */
    public fun onBringToFront(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            webkitWebInspectorPointer,
            "bring-to-front",
            onBringToFrontFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the inspector page is closed. If you are using your own
     * inspector window, you should connect to this signal and destroy your
     * window.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onClosed(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            webkitWebInspectorPointer,
            "closed",
            onClosedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "closed" signal. See [onClosed].
     */
    public fun emitClosed() {
        g_signal_emit_by_name(webkitWebInspectorPointer.reinterpret(), "closed")
    }

    /**
     * Emitted when the inspector is requested to be detached from the window
     * it is currently attached to. The inspector is detached when the inspector page
     * is about to be closed, and this signal is emitted right before
     * #WebKitWebInspector::closed, or when the user clicks on the detach button
     * in the inspector view to show the inspector in a separate window. In this case
     * the signal #WebKitWebInspector::open-window is emitted after this one.
     *
     * To prevent the inspector view from being detached you can connect to this
     * signal and simply return true.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     */
    public fun onDetach(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            webkitWebInspectorPointer,
            "detach",
            onDetachFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the inspector is requested to open in a separate window.
     * If this signal is not handled, a #GtkWindow with the inspector will be
     * created and shown, so you only need to handle this signal if you want
     * to use your own window.
     * This signal is emitted after #WebKitWebInspector::detach to show
     * the inspector in a separate window after being detached.
     *
     * To prevent the inspector from being shown you can connect to this
     * signal and simply return true
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     */
    public fun onOpenWindow(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            webkitWebInspectorPointer,
            "open-window",
            onOpenWindowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<WebInspector> {
        override val type: GeneratedClassKGType<WebInspector> =
            GeneratedClassKGType(getTypeOrNull("webkit_web_inspector_get_type")!!) {
                WebInspector(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of WebInspector
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_web_inspector_get_type()
    }
}

private val onAttachFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val onBringToFrontFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val onClosedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onDetachFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val onOpenWindowFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()
