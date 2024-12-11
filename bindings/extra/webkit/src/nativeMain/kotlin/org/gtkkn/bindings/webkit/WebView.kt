// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.RGBA
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gdk.Texture
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.gio.TlsCertificate
import org.gtkkn.bindings.gio.TlsCertificateFlags
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.bindings.javascriptcore.Value
import org.gtkkn.bindings.webkit.WebKit.resolveException
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_10
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_12
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_18
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_2
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_20
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_34
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_38
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkRectangle
import org.gtkkn.native.gio.GTlsCertificate
import org.gtkkn.native.gio.GTlsCertificateFlags
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.gdouble
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gobject.guint64
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkWidget
import org.gtkkn.native.webkit.WebKitAuthenticationRequest
import org.gtkkn.native.webkit.WebKitColorChooserRequest
import org.gtkkn.native.webkit.WebKitContextMenu
import org.gtkkn.native.webkit.WebKitFileChooserRequest
import org.gtkkn.native.webkit.WebKitFormSubmissionRequest
import org.gtkkn.native.webkit.WebKitHitTestResult
import org.gtkkn.native.webkit.WebKitInsecureContentEvent
import org.gtkkn.native.webkit.WebKitLoadEvent
import org.gtkkn.native.webkit.WebKitNavigationAction
import org.gtkkn.native.webkit.WebKitNotification
import org.gtkkn.native.webkit.WebKitOptionMenu
import org.gtkkn.native.webkit.WebKitPermissionRequest
import org.gtkkn.native.webkit.WebKitPermissionStateQuery
import org.gtkkn.native.webkit.WebKitPolicyDecision
import org.gtkkn.native.webkit.WebKitPolicyDecisionType
import org.gtkkn.native.webkit.WebKitPrintOperation
import org.gtkkn.native.webkit.WebKitScriptDialog
import org.gtkkn.native.webkit.WebKitURIRequest
import org.gtkkn.native.webkit.WebKitUserMessage
import org.gtkkn.native.webkit.WebKitWebProcessTerminationReason
import org.gtkkn.native.webkit.WebKitWebResource
import org.gtkkn.native.webkit.WebKitWebView
import org.gtkkn.native.webkit.webkit_web_view_call_async_javascript_function
import org.gtkkn.native.webkit.webkit_web_view_call_async_javascript_function_finish
import org.gtkkn.native.webkit.webkit_web_view_can_execute_editing_command
import org.gtkkn.native.webkit.webkit_web_view_can_execute_editing_command_finish
import org.gtkkn.native.webkit.webkit_web_view_can_go_back
import org.gtkkn.native.webkit.webkit_web_view_can_go_forward
import org.gtkkn.native.webkit.webkit_web_view_can_show_mime_type
import org.gtkkn.native.webkit.webkit_web_view_download_uri
import org.gtkkn.native.webkit.webkit_web_view_evaluate_javascript
import org.gtkkn.native.webkit.webkit_web_view_evaluate_javascript_finish
import org.gtkkn.native.webkit.webkit_web_view_execute_editing_command
import org.gtkkn.native.webkit.webkit_web_view_execute_editing_command_with_argument
import org.gtkkn.native.webkit.webkit_web_view_get_automation_presentation_type
import org.gtkkn.native.webkit.webkit_web_view_get_back_forward_list
import org.gtkkn.native.webkit.webkit_web_view_get_background_color
import org.gtkkn.native.webkit.webkit_web_view_get_camera_capture_state
import org.gtkkn.native.webkit.webkit_web_view_get_context
import org.gtkkn.native.webkit.webkit_web_view_get_custom_charset
import org.gtkkn.native.webkit.webkit_web_view_get_default_content_security_policy
import org.gtkkn.native.webkit.webkit_web_view_get_display_capture_state
import org.gtkkn.native.webkit.webkit_web_view_get_editor_state
import org.gtkkn.native.webkit.webkit_web_view_get_estimated_load_progress
import org.gtkkn.native.webkit.webkit_web_view_get_favicon
import org.gtkkn.native.webkit.webkit_web_view_get_find_controller
import org.gtkkn.native.webkit.webkit_web_view_get_input_method_context
import org.gtkkn.native.webkit.webkit_web_view_get_inspector
import org.gtkkn.native.webkit.webkit_web_view_get_is_muted
import org.gtkkn.native.webkit.webkit_web_view_get_is_web_process_responsive
import org.gtkkn.native.webkit.webkit_web_view_get_main_resource
import org.gtkkn.native.webkit.webkit_web_view_get_microphone_capture_state
import org.gtkkn.native.webkit.webkit_web_view_get_network_session
import org.gtkkn.native.webkit.webkit_web_view_get_page_id
import org.gtkkn.native.webkit.webkit_web_view_get_session_state
import org.gtkkn.native.webkit.webkit_web_view_get_settings
import org.gtkkn.native.webkit.webkit_web_view_get_snapshot
import org.gtkkn.native.webkit.webkit_web_view_get_snapshot_finish
import org.gtkkn.native.webkit.webkit_web_view_get_title
import org.gtkkn.native.webkit.webkit_web_view_get_type
import org.gtkkn.native.webkit.webkit_web_view_get_uri
import org.gtkkn.native.webkit.webkit_web_view_get_user_content_manager
import org.gtkkn.native.webkit.webkit_web_view_get_web_extension_mode
import org.gtkkn.native.webkit.webkit_web_view_get_website_policies
import org.gtkkn.native.webkit.webkit_web_view_get_window_properties
import org.gtkkn.native.webkit.webkit_web_view_get_zoom_level
import org.gtkkn.native.webkit.webkit_web_view_go_back
import org.gtkkn.native.webkit.webkit_web_view_go_forward
import org.gtkkn.native.webkit.webkit_web_view_go_to_back_forward_list_item
import org.gtkkn.native.webkit.webkit_web_view_is_controlled_by_automation
import org.gtkkn.native.webkit.webkit_web_view_is_editable
import org.gtkkn.native.webkit.webkit_web_view_is_loading
import org.gtkkn.native.webkit.webkit_web_view_is_playing_audio
import org.gtkkn.native.webkit.webkit_web_view_load_alternate_html
import org.gtkkn.native.webkit.webkit_web_view_load_bytes
import org.gtkkn.native.webkit.webkit_web_view_load_html
import org.gtkkn.native.webkit.webkit_web_view_load_plain_text
import org.gtkkn.native.webkit.webkit_web_view_load_request
import org.gtkkn.native.webkit.webkit_web_view_load_uri
import org.gtkkn.native.webkit.webkit_web_view_new
import org.gtkkn.native.webkit.webkit_web_view_reload
import org.gtkkn.native.webkit.webkit_web_view_reload_bypass_cache
import org.gtkkn.native.webkit.webkit_web_view_restore_session_state
import org.gtkkn.native.webkit.webkit_web_view_save
import org.gtkkn.native.webkit.webkit_web_view_save_finish
import org.gtkkn.native.webkit.webkit_web_view_save_to_file
import org.gtkkn.native.webkit.webkit_web_view_save_to_file_finish
import org.gtkkn.native.webkit.webkit_web_view_send_message_to_page
import org.gtkkn.native.webkit.webkit_web_view_send_message_to_page_finish
import org.gtkkn.native.webkit.webkit_web_view_set_background_color
import org.gtkkn.native.webkit.webkit_web_view_set_camera_capture_state
import org.gtkkn.native.webkit.webkit_web_view_set_cors_allowlist
import org.gtkkn.native.webkit.webkit_web_view_set_custom_charset
import org.gtkkn.native.webkit.webkit_web_view_set_display_capture_state
import org.gtkkn.native.webkit.webkit_web_view_set_editable
import org.gtkkn.native.webkit.webkit_web_view_set_input_method_context
import org.gtkkn.native.webkit.webkit_web_view_set_is_muted
import org.gtkkn.native.webkit.webkit_web_view_set_microphone_capture_state
import org.gtkkn.native.webkit.webkit_web_view_set_settings
import org.gtkkn.native.webkit.webkit_web_view_set_zoom_level
import org.gtkkn.native.webkit.webkit_web_view_stop_loading
import org.gtkkn.native.webkit.webkit_web_view_terminate_web_process
import org.gtkkn.native.webkit.webkit_web_view_try_close
import kotlin.Boolean
import kotlin.Long
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * The central class of the WPE WebKit and WebKitGTK APIs.
 *
 * #WebKitWebView is the central class of the WPE WebKit and WebKitGTK
 * APIs. It is responsible for managing the drawing of the content and
 * forwarding of events. You can load any URI into the #WebKitWebView or
 * a data string. With #WebKitSettings you can control various aspects
 * of the rendering and loading of the content.
 *
 * Note that in WebKitGTK, #WebKitWebView is scrollable by itself, so
 * you don't need to embed it in a #GtkScrolledWindow.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `certificate`: certificate: Out parameter is not supported
 * - method `editable`: Property has no getter
 * - method `is-controlled-by-automation`: Property has no getter nor setter
 * - method `is-loading`: Property has no getter nor setter
 * - method `is-playing-audio`: Property has no getter nor setter
 * - method `related-view`: Property has no getter nor setter
 * - method `settings`: Property has no getter
 * - method `web-context`: Property has no getter nor setter
 */
public open class WebView(pointer: CPointer<WebKitWebView>) :
    WebViewBase(pointer.reinterpret()),
    KGTyped {
    public val webkitWebViewPointer: CPointer<WebKitWebView>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The #WebKitAutomationBrowsingContextPresentation of #WebKitWebView. This should only be used when
     * creating a new #WebKitWebView as a response to #WebKitAutomationSession::create-web-view
     * signal request. If the new WebView was added to a new tab of current browsing context window
     * %WEBKIT_AUTOMATION_BROWSING_CONTEXT_PRESENTATION_TAB should be used.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public open val automationPresentationType: AutomationBrowsingContextPresentation
        /**
         * Get the presentation type of #WebKitWebView when created for automation.
         *
         * @return a #WebKitAutomationBrowsingContextPresentation.
         * @since 2.28
         */
        get() = webkit_web_view_get_automation_presentation_type(webkitWebViewPointer.reinterpret()).run {
            AutomationBrowsingContextPresentation.fromNativeValue(this)
        }

    /**
     * Capture state of the camera device. Whenever the user grants a media-request sent by the web
     * page, requesting video capture capabilities (`navigator.mediaDevices.getUserMedia({video:
     * true})`) this property will be set to %WEBKIT_MEDIA_CAPTURE_STATE_ACTIVE.
     *
     * The application can monitor this property and provide a visual indicator allowing to optionally
     * deactivate or mute the capture device by setting this property respectively to
     * %WEBKIT_MEDIA_CAPTURE_STATE_NONE or %WEBKIT_MEDIA_CAPTURE_STATE_MUTED.
     *
     * If the capture state of the device is set to %WEBKIT_MEDIA_CAPTURE_STATE_NONE the web-page
     * can still re-request the permission to the user. Permission desision caching is left to the
     * application.
     *
     * @since 2.34
     */
    @WebKitVersion2_34
    public open var cameraCaptureState: MediaCaptureState
        /**
         * Get the camera capture state of a #WebKitWebView.
         *
         * @return The #WebKitMediaCaptureState of the camera device. If #WebKitSettings:enable-mediastream
         * is false, this method will return %WEBKIT_MEDIA_CAPTURE_STATE_NONE.
         * @since 2.34
         */
        get() = webkit_web_view_get_camera_capture_state(webkitWebViewPointer.reinterpret()).run {
            MediaCaptureState.fromNativeValue(this)
        }

        /**
         * Set the camera capture state of a #WebKitWebView.
         *
         * If #WebKitSettings:enable-mediastream is false, this method will have no visible effect. Once the
         * state of the device has been set to %WEBKIT_MEDIA_CAPTURE_STATE_NONE it cannot be changed
         * anymore. The page can however request capture again using the mediaDevices API.
         *
         * @param state a #WebKitMediaCaptureState
         * @since 2.34
         */
        @WebKitVersion2_34
        set(state) = webkit_web_view_set_camera_capture_state(webkitWebViewPointer.reinterpret(), state.nativeValue)

    /**
     * The default Content-Security-Policy used by the webview as if it were set
     * by an HTTP header.
     *
     * This applies to all content loaded including through navigation or via the various
     * webkit_web_view_load_\* APIs. However do note that many WebKit APIs bypass
     * Content-Security-Policy in general such as #WebKitUserContentManager and
     * webkit_web_view_run_javascript().
     *
     * Policies are additive so if a website sets its own policy it still applies
     * on top of the policy set here.
     *
     * @since 2.38
     */
    @WebKitVersion2_38
    public open val defaultContentSecurityPolicy: String?
        /**
         * Gets the configured default Content-Security-Policy.
         *
         * @return The default policy or null
         * @since 2.38
         */
        get() = webkit_web_view_get_default_content_security_policy(webkitWebViewPointer.reinterpret())?.toKString()

    /**
     * Capture state of the display device. Whenever the user grants a media-request sent by the web
     * page, requesting screencasting capabilities (`navigator.mediaDevices.getDisplayMedia() this
     * property will be set to %WEBKIT_MEDIA_CAPTURE_STATE_ACTIVE.
     *
     * The application can monitor this property and provide a visual indicator allowing to
     * optionally deactivate or mute the capture device by setting this property respectively to
     * %WEBKIT_MEDIA_CAPTURE_STATE_NONE or %WEBKIT_MEDIA_CAPTURE_STATE_MUTED.
     *
     * If the capture state of the device is set to %WEBKIT_MEDIA_CAPTURE_STATE_NONE the web-page
     * can still re-request the permission to the user. Permission desision caching is left to the
     * application.
     *
     * @since 2.34
     */
    @WebKitVersion2_34
    public open var displayCaptureState: MediaCaptureState
        /**
         * Get the display capture state of a #WebKitWebView.
         *
         * @return The #WebKitMediaCaptureState of the display device. If #WebKitSettings:enable-mediastream
         * is false, this method will return %WEBKIT_MEDIA_CAPTURE_STATE_NONE.
         * @since 2.34
         */
        get() = webkit_web_view_get_display_capture_state(webkitWebViewPointer.reinterpret()).run {
            MediaCaptureState.fromNativeValue(this)
        }

        /**
         * Set the display capture state of a #WebKitWebView.
         *
         * If #WebKitSettings:enable-mediastream is false, this method will have no visible effect. Once the
         * state of the device has been set to %WEBKIT_MEDIA_CAPTURE_STATE_NONE it cannot be changed
         * anymore. The page can however request capture again using the mediaDevices API.
         *
         * @param state a #WebKitMediaCaptureState
         * @since 2.34
         */
        @WebKitVersion2_34
        set(state) = webkit_web_view_set_display_capture_state(webkitWebViewPointer.reinterpret(), state.nativeValue)

    /**
     * An estimate of the percent completion for the current loading operation.
     * This value will range from 0.0 to 1.0 and, once a load completes,
     * will remain at 1.0 until a new load starts, at which point it
     * will be reset to 0.0.
     * The value is an estimate based on the total number of bytes expected
     * to be received for a document, including all its possible subresources
     * and child documents.
     */
    public open val estimatedLoadProgress: gdouble
        /**
         * Gets the value of the #WebKitWebView:estimated-load-progress property.
         *
         * You can monitor the estimated progress of a load operation by
         * connecting to the notify::estimated-load-progress signal of @web_view.
         *
         * @return an estimate of the of the percent complete for a document
         *     load as a range from 0.0 to 1.0.
         */
        get() = webkit_web_view_get_estimated_load_progress(webkitWebViewPointer.reinterpret())

    /**
     * The favicon currently associated to the #WebKitWebView.
     * See webkit_web_view_get_favicon() for more details.
     */
    public open val favicon: Texture
        /**
         * Returns favicon currently associated to @web_view.
         *
         * Returns favicon currently associated to @web_view, if any. You can
         * connect to notify::favicon signal of @web_view to be notified when
         * the favicon is available.
         *
         * @return the favicon image or null if there's no
         *    icon associated with @web_view.
         */
        get() = webkit_web_view_get_favicon(webkitWebViewPointer.reinterpret())!!.run {
            Texture(reinterpret())
        }

    /**
     * Whether the #WebKitWebView audio is muted. When true, audio is silenced.
     * It may still be playing, i.e. #WebKitWebView:is-playing-audio may be true.
     *
     * @since 2.30
     */
    @WebKitVersion2_30
    public open var isMuted: Boolean
        /**
         * Gets the mute state of @web_view.
         *
         * @return true if @web_view audio is muted or false is audio is not muted.
         * @since 2.30
         */
        get() = webkit_web_view_get_is_muted(webkitWebViewPointer.reinterpret()).asBoolean()

        /**
         * Sets the mute state of @web_view.
         *
         * @param muted mute flag
         * @since 2.30
         */
        @WebKitVersion2_30
        set(muted) = webkit_web_view_set_is_muted(webkitWebViewPointer.reinterpret(), muted.asGBoolean())

    /**
     * Whether the web process currently associated to the #WebKitWebView is responsive.
     *
     * @since 2.34
     */
    @WebKitVersion2_34
    public open val isWebProcessResponsive: Boolean
        /**
         * Get whether the current web process of a #WebKitWebView is responsive.
         *
         * @return true if the web process attached to @web_view is responsive, or false otherwise.
         * @since 2.34
         */
        get() = webkit_web_view_get_is_web_process_responsive(webkitWebViewPointer.reinterpret()).asBoolean()

    /**
     * Capture state of the microphone device. Whenever the user grants a media-request sent by the web
     * page, requesting audio capture capabilities (`navigator.mediaDevices.getUserMedia({audio:
     * true})`) this property will be set to %WEBKIT_MEDIA_CAPTURE_STATE_ACTIVE.
     *
     * The application can monitor this property and provide a visual indicator allowing to
     * optionally deactivate or mute the capture device by setting this property respectively to
     * %WEBKIT_MEDIA_CAPTURE_STATE_NONE or %WEBKIT_MEDIA_CAPTURE_STATE_MUTED.
     *
     * If the capture state of the device is set to %WEBKIT_MEDIA_CAPTURE_STATE_NONE the web-page
     * can still re-request the permission to the user. Permission desision caching is left to the
     * application.
     *
     * @since 2.34
     */
    @WebKitVersion2_34
    public open var microphoneCaptureState: MediaCaptureState
        /**
         * Get the microphone capture state of a #WebKitWebView.
         *
         * @return The #WebKitMediaCaptureState of the microphone device. If #WebKitSettings:enable-mediastream
         * is false, this method will return %WEBKIT_MEDIA_CAPTURE_STATE_NONE.
         * @since 2.34
         */
        get() = webkit_web_view_get_microphone_capture_state(webkitWebViewPointer.reinterpret()).run {
            MediaCaptureState.fromNativeValue(this)
        }

        /**
         * Set the microphone capture state of a #WebKitWebView.
         *
         * If #WebKitSettings:enable-mediastream is false, this method will have no visible effect. Once the
         * state of the device has been set to %WEBKIT_MEDIA_CAPTURE_STATE_NONE it cannot be changed
         * anymore. The page can however request capture again using the mediaDevices API.
         *
         * @param state a #WebKitMediaCaptureState
         * @since 2.34
         */
        @WebKitVersion2_34
        set(state) = webkit_web_view_set_microphone_capture_state(webkitWebViewPointer.reinterpret(), state.nativeValue)

    /**
     * The #WebKitNetworkSession of the view
     *
     * @since 2.40
     */
    @WebKitVersion2_40
    public open val networkSession: NetworkSession
        /**
         * Get the #WebKitNetworkSession associated to @web_view.
         *
         * @return a #WebKitNetworkSession
         * @since 2.40
         */
        get() = webkit_web_view_get_network_session(webkitWebViewPointer.reinterpret())!!.run {
            NetworkSession(reinterpret())
        }

    /**
     * The identifier of the #WebKitWebPage corresponding to the #WebKitWebView.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public open val pageId: guint64
        /**
         * Get the identifier of the #WebKitWebPage corresponding to
         * the #WebKitWebView
         *
         * @return the page ID of @web_view.
         */
        get() = webkit_web_view_get_page_id(webkitWebViewPointer.reinterpret())

    /**
     * The main frame document title of this #WebKitWebView. If
     * the title has not been received yet, it will be null.
     */
    public open val title: String
        /**
         * Gets the value of the #WebKitWebView:title property.
         *
         * You can connect to notify::title signal of @web_view to
         * be notified when the title has been received.
         *
         * @return The main frame document title of @web_view.
         */
        get() = webkit_web_view_get_title(webkitWebViewPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * The current active URI of the #WebKitWebView.
     * See webkit_web_view_get_uri() for more details.
     */
    public open val uri: String
        /**
         * Returns the current active URI of @web_view.
         *
         * The active URI might change during
         * a load operation:
         *
         * <orderedlist>
         * <listitem><para>
         *   When nothing has been loaded yet on @web_view the active URI is null.
         * </para></listitem>
         * <listitem><para>
         *   When a new load operation starts the active URI is the requested URI:
         *   <itemizedlist>
         *   <listitem><para>
         *     If the load operation was started by webkit_web_view_load_uri(),
         *     the requested URI is the given one.
         *   </para></listitem>
         *   <listitem><para>
         *     If the load operation was started by webkit_web_view_load_html(),
         *     the requested URI is "about:blank".
         *   </para></listitem>
         *   <listitem><para>
         *     If the load operation was started by webkit_web_view_load_alternate_html(),
         *     the requested URI is content URI provided.
         *   </para></listitem>
         *   <listitem><para>
         *     If the load operation was started by webkit_web_view_go_back() or
         *     webkit_web_view_go_forward(), the requested URI is the original URI
         *     of the previous/next item in the #WebKitBackForwardList of @web_view.
         *   </para></listitem>
         *   <listitem><para>
         *     If the load operation was started by
         *     webkit_web_view_go_to_back_forward_list_item(), the requested URI
         *     is the opriginal URI of the given #WebKitBackForwardListItem.
         *   </para></listitem>
         *   </itemizedlist>
         * </para></listitem>
         * <listitem><para>
         *   If there is a server redirection during the load operation,
         *   the active URI is the redirected URI. When the signal
         *   #WebKitWebView::load-changed is emitted with %WEBKIT_LOAD_REDIRECTED
         *   event, the active URI is already updated to the redirected URI.
         * </para></listitem>
         * <listitem><para>
         *   When the signal #WebKitWebView::load-changed is emitted
         *   with %WEBKIT_LOAD_COMMITTED event, the active URI is the final
         *   one and it will not change unless a new load operation is started
         *   or a navigation action within the same page is performed.
         * </para></listitem>
         * </orderedlist>
         *
         * You can monitor the active URI by connecting to the notify::uri
         * signal of @web_view.
         *
         * @return the current active URI of @web_view or null
         *    if nothing has been loaded yet.
         */
        get() = webkit_web_view_get_uri(webkitWebViewPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * The #WebKitUserContentManager of the view.
     *
     * @since 2.6
     */
    @WebKitVersion2_6
    public open val userContentManager: UserContentManager
        /**
         * Gets the user content manager associated to @web_view.
         *
         * @return the #WebKitUserContentManager associated with the view
         * @since 2.6
         */
        get() = webkit_web_view_get_user_content_manager(webkitWebViewPointer.reinterpret())!!.run {
            UserContentManager(reinterpret())
        }

    /**
     * This configures @web_view to treat the content as a WebExtension.
     *
     * Note that this refers to the web standard [WebExtensions](https://developer.mozilla.org/en-US/docs/Mozilla/Add-ons/WebExtensions)
     * and not WebKitWebExtensions.
     *
     * In practice this limits the Content-Security-Policies that are allowed to be set. Some details can be found in
     * [Chrome's documentation](https://developer.chrome.com/docs/extensions/mv3/intro/mv3-migration/#content-security-policy).
     *
     * @since 2.38
     */
    @WebKitVersion2_38
    public open val webExtensionMode: WebExtensionMode
        /**
         * Get the view's #WebKitWebExtensionMode.
         *
         * @return the #WebKitWebExtensionMode
         * @since 2.38
         */
        get() = webkit_web_view_get_web_extension_mode(webkitWebViewPointer.reinterpret()).run {
            WebExtensionMode.fromNativeValue(this)
        }

    /**
     * The #WebKitWebsitePolicies for the view.
     *
     * @since 2.30
     */
    @WebKitVersion2_30
    public open val websitePolicies: WebsitePolicies
        /**
         * Gets the default website policies.
         *
         * Gets the default website policies set on construction in the
         * @web_view. These can be overridden on a per-origin basis via the
         * #WebKitWebView::decide-policy signal handler.
         *
         * See also webkit_policy_decision_use_with_policies().
         *
         * @return the default #WebKitWebsitePolicies
         *     associated with the view.
         * @since 2.30
         */
        get() = webkit_web_view_get_website_policies(webkitWebViewPointer.reinterpret())!!.run {
            WebsitePolicies(reinterpret())
        }

    /**
     * The zoom level of the #WebKitWebView content.
     * See webkit_web_view_set_zoom_level() for more details.
     */
    public open var zoomLevel: gdouble
        /**
         * Set the zoom level of @web_view.
         *
         * Get the zoom level of @web_view, i.e. the factor by which the
         * view contents are scaled with respect to their original size.
         *
         * @return the current zoom level of @web_view
         */
        get() = webkit_web_view_get_zoom_level(webkitWebViewPointer.reinterpret())

        /**
         * Set the zoom level of @web_view.
         *
         * Set the zoom level of @web_view, i.e. the factor by which the
         * view contents are scaled with respect to their original size.
         *
         * @param zoomLevel the zoom level
         */
        set(zoomLevel) = webkit_web_view_set_zoom_level(webkitWebViewPointer.reinterpret(), zoomLevel)

    /**
     * Creates a new #WebKitWebView with the default #WebKitWebContext.
     *
     * Creates a new #WebKitWebView with the default #WebKitWebContext and
     * no #WebKitUserContentManager associated with it.
     * See also webkit_web_view_new_with_context(),
     * webkit_web_view_new_with_user_content_manager(), and
     * webkit_web_view_new_with_settings().
     *
     * @return The newly created #WebKitWebView widget
     */
    public constructor() : this(webkit_web_view_new()!!.reinterpret())

    /**
     * Asynchronously call @body with @arguments in the script world with name @world_name of the main frame current context in @web_view.
     * The @arguments values must be one of the following types, or contain only the following GVariant types: number, string and dictionary.
     * The result of the operation can be a Promise that will be properly passed to the callback.
     * If @world_name is null, the default world is used. Any value that is not null is a distin ct world.
     * The @source_uri will be shown in exceptions and doesn't affect the behavior of the script.
     * When not provided, the document URL is used.
     *
     * Note that if #WebKitSettings:enable-javascript is false, this method will do nothing.
     * If you want to use this method but still prevent web content from executing its own
     * JavaScript, then use #WebKitSettings:enable-javascript-markup.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_web_view_call_async_javascript_function_finish() to get the result of the operation.
     *
     * This is an example that shows how to pass arguments to a JS function that returns a Promise
     * that resolves with the passed argument:
     *
     * ```c
     * static void
     * web_view_javascript_finished (GObject      *object,
     *                               GAsyncResult *result,
     *                               gpointer      user_data)
     * {
     *     JSCValue               *value;
     *     GError                 *error = NULL;
     *
     *     value = webkit_web_view_call_async_javascript_function_finish (WEBKIT_WEB_VIEW (object), result, &error);
     *     if (!value) {
     *         g_warning ("Error running javascript: %s", error->message);
     *         g_error_free (error);
     *         return;
     *     }
     *
     *     if (jsc_value_is_number (value)) {
     *         gint32        int_value = jsc_value_to_string (value);
     *         JSCException *exception = jsc_context_get_exception (jsc_value_get_context (value));
     *         if (exception)
     *             g_warning ("Error running javascript: %s", jsc_exception_get_message (exception));
     *         else
     *             g_print ("Script result: %d\n", int_value);
     *         g_free (str_value);
     *     } else {
     *         g_warning ("Error running javascript: unexpected return value");
     *     }
     *     g_object_unref (value);
     * }
     *
     * static void
     * web_view_evaluate_promise (WebKitWebView *web_view)
     * {
     *     GVariantDict dict;
     *     g_variant_dict_init (&dict, NULL);
     *     g_variant_dict_insert (&dict, "count", "u", 42);
     *     GVariant *args = g_variant_dict_end (&dict);
     *     const gchar *body = "return new Promise((resolve) => { resolve(count); });";
     *     webkit_web_view_call_async_javascript_function (web_view, body, -1, arguments, NULL, NULL, NULL, web_view_javascript_finished, NULL);
     * }
     * ```
     *
     * @param body the function body
     * @param length length of @body, or -1 if @body is a nul-terminated string
     * @param arguments a #GVariant with format `a{sv}` storing the function arguments, or null
     * @param worldName the name of a #WebKitScriptWorld or null to use the default
     * @param sourceUri the source URI
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the script finished
     * @since 2.40
     */
    @WebKitVersion2_40
    public open fun callAsyncJavascriptFunction(
        body: String,
        length: Long,
        arguments: Variant? = null,
        worldName: String? = null,
        sourceUri: String? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = webkit_web_view_call_async_javascript_function(
        webkitWebViewPointer.reinterpret(), body, length, arguments?.glibVariantPointer?.reinterpret(), worldName, sourceUri, cancellable?.gioCancellablePointer?.reinterpret(), AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(
            callback
        ).asCPointer()
    )

    /**
     * Finish an asynchronous operation started with webkit_web_view_call_async_javascript_function().
     *
     * @param result a #GAsyncResult
     * @return a #JSCValue with the return value of the async function
     *    or null in case of error
     * @since 2.40
     */
    @WebKitVersion2_40
    public open fun callAsyncJavascriptFunctionFinish(result: AsyncResult): Result<Value> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_web_view_call_async_javascript_function_finish(
            webkitWebViewPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            Value(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously check if it is possible to execute the given editing command.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_web_view_can_execute_editing_command_finish() to get the result of the operation.
     *
     * @param command the command to check
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     */
    public open fun canExecuteEditingCommand(
        command: String,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = webkit_web_view_can_execute_editing_command(
        webkitWebViewPointer.reinterpret(),
        command,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finish an asynchronous operation started with webkit_web_view_can_execute_editing_command().
     *
     * @param result a #GAsyncResult
     * @return true if the editing command can be executed or false otherwise
     */
    public open fun canExecuteEditingCommandFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_web_view_can_execute_editing_command_finish(
            webkitWebViewPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Determines whether @web_view has a previous history item.
     *
     * @return true if able to move back or false otherwise.
     */
    public open fun canGoBack(): Boolean = webkit_web_view_can_go_back(webkitWebViewPointer.reinterpret()).asBoolean()

    /**
     * Determines whether @web_view has a next history item.
     *
     * @return true if able to move forward or false otherwise.
     */
    public open fun canGoForward(): Boolean =
        webkit_web_view_can_go_forward(webkitWebViewPointer.reinterpret()).asBoolean()

    /**
     * Whether or not a MIME type can be displayed in @web_view.
     *
     * @param mimeType a MIME type
     * @return true if the MIME type @mime_type can be displayed or false otherwise
     */
    public open fun canShowMimeType(mimeType: String): Boolean =
        webkit_web_view_can_show_mime_type(webkitWebViewPointer.reinterpret(), mimeType).asBoolean()

    /**
     * Requests downloading of the specified URI string for @web_view.
     *
     * @param uri the URI to download
     * @return a new #WebKitDownload representing
     *    the download operation.
     */
    public open fun downloadUri(uri: String): Download =
        webkit_web_view_download_uri(webkitWebViewPointer.reinterpret(), uri)!!.run {
            Download(reinterpret())
        }

    /**
     * Asynchronously evaluate @script in the script world with name @world_name of the main frame current context in @web_view.
     * If @world_name is null, the default world is used. Any value that is not null is a distinct world.
     * The @source_uri will be shown in exceptions and doesn't affect the behavior of the script.
     * When not provided, the document URL is used.
     *
     * Note that if #WebKitSettings:enable-javascript is false, this method will do nothing.
     * If you want to use this method but still prevent web content from executing its own
     * JavaScript, then use #WebKitSettings:enable-javascript-markup.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_web_view_evaluate_javascript_finish() to get the result of the operation.
     *
     * This is an example of using webkit_web_view_evaluate_javascript() with a script returning
     * a string:
     *
     * ```c
     * static void
     * web_view_javascript_finished (GObject      *object,
     *                               GAsyncResult *result,
     *                               gpointer      user_data)
     * {
     *     JSCValue               *value;
     *     GError                 *error = NULL;
     *
     *     value = webkit_web_view_evaluate_javascript_finish (WEBKIT_WEB_VIEW (object), result, &error);
     *     if (!value) {
     *         g_warning ("Error running javascript: %s", error->message);
     *         g_error_free (error);
     *         return;
     *     }
     *
     *     if (jsc_value_is_string (value)) {
     *         gchar        *str_value = jsc_value_to_string (value);
     *         JSCException *exception = jsc_context_get_exception (jsc_value_get_context (value));
     *         if (exception)
     *             g_warning ("Error running javascript: %s", jsc_exception_get_message (exception));
     *         else
     *             g_print ("Script result: %s\n", str_value);
     *         g_free (str_value);
     *     } else {
     *         g_warning ("Error running javascript: unexpected return value");
     *     }
     *     g_object_unref (value);
     * }
     *
     * static void
     * web_view_get_link_url (WebKitWebView *web_view,
     *                        const gchar   *link_id)
     * {
     *     gchar *script = g_strdup_printf ("window.document.getElementById('%s').href;", link_id);
     *     webkit_web_view_evaluate_javascript (web_view, script, -1, NULL, NULL, NULL, web_view_javascript_finished, NULL);
     *     g_free (script);
     * }
     * ```
     *
     * @param script the script to evaluate
     * @param length length of @script, or -1 if @script is a nul-terminated string
     * @param worldName the name of a #WebKitScriptWorld or null to use the default
     * @param sourceUri the source URI
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the script finished
     * @since 2.40
     */
    @WebKitVersion2_40
    public open fun evaluateJavascript(
        script: String,
        length: Long,
        worldName: String? = null,
        sourceUri: String? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = webkit_web_view_evaluate_javascript(
        webkitWebViewPointer.reinterpret(),
        script,
        length,
        worldName,
        sourceUri,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finish an asynchronous operation started with webkit_web_view_evaluate_javascript().
     *
     * @param result a #GAsyncResult
     * @return a #JSCValue with the result of the last executed statement in script
     *    or null in case of error
     * @since 2.40
     */
    @WebKitVersion2_40
    public open fun evaluateJavascriptFinish(result: AsyncResult): Result<Value> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_web_view_evaluate_javascript_finish(
            webkitWebViewPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            Value(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Request to execute the given @command for @web_view.
     *
     * You can use webkit_web_view_can_execute_editing_command() to check whether
     * it's possible to execute the command.
     *
     * @param command the command to execute
     */
    public open fun executeEditingCommand(command: String): Unit =
        webkit_web_view_execute_editing_command(webkitWebViewPointer.reinterpret(), command)

    /**
     * Request to execute the given @command with @argument for @web_view.
     *
     * You can use
     * webkit_web_view_can_execute_editing_command() to check whether
     * it's possible to execute the command.
     *
     * @param command the command to execute
     * @param argument the command argument
     * @since 2.10
     */
    @WebKitVersion2_10
    public open fun executeEditingCommandWithArgument(command: String, argument: String): Unit =
        webkit_web_view_execute_editing_command_with_argument(webkitWebViewPointer.reinterpret(), command, argument)

    /**
     * Obtains the #WebKitBackForwardList associated with the given #WebKitWebView.
     *
     * The #WebKitBackForwardList is owned by the #WebKitWebView.
     *
     * @return the #WebKitBackForwardList
     */
    public open fun getBackForwardList(): BackForwardList =
        webkit_web_view_get_back_forward_list(webkitWebViewPointer.reinterpret())!!.run {
            BackForwardList(reinterpret())
        }

    /**
     * Gets the color that is used to draw the @web_view background.
     *
     * Gets the color that is used to draw the @web_view background before
     * the actual contents are rendered.
     * For more information see also webkit_web_view_set_background_color()
     *
     * @param rgba a #GdkRGBA to fill in with the background color
     * @since 2.8
     */
    @WebKitVersion2_8
    public open fun getBackgroundColor(rgba: RGBA): Unit =
        webkit_web_view_get_background_color(webkitWebViewPointer.reinterpret(), rgba.gdkRGBAPointer.reinterpret())

    /**
     * Gets the web context of @web_view.
     *
     * @return the #WebKitWebContext of the view
     */
    public open fun getContext(): WebContext = webkit_web_view_get_context(webkitWebViewPointer.reinterpret())!!.run {
        WebContext(reinterpret())
    }

    /**
     * Returns the current custom character encoding name of @web_view.
     *
     * @return the current custom character encoding name or null if no
     *    custom character encoding has been set.
     */
    public open fun getCustomCharset(): String =
        webkit_web_view_get_custom_charset(webkitWebViewPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the web editor state of @web_view.
     *
     * @return the #WebKitEditorState of the view
     * @since 2.10
     */
    @WebKitVersion2_10
    public open fun getEditorState(): EditorState =
        webkit_web_view_get_editor_state(webkitWebViewPointer.reinterpret())!!.run {
            EditorState(reinterpret())
        }

    /**
     * Gets the #WebKitFindController.
     *
     * Gets the #WebKitFindController that will allow the caller to query
     * the #WebKitWebView for the text to look for.
     *
     * @return the #WebKitFindController associated to
     * this particular #WebKitWebView.
     */
    public open fun getFindController(): FindController =
        webkit_web_view_get_find_controller(webkitWebViewPointer.reinterpret())!!.run {
            FindController(reinterpret())
        }

    /**
     * Get the #WebKitInputMethodContext currently in use by @web_view.
     *
     * Get the #WebKitInputMethodContext currently in use by @web_view, or null if no input method is being used.
     *
     * @return a #WebKitInputMethodContext, or null
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun getInputMethodContext(): InputMethodContext? =
        webkit_web_view_get_input_method_context(webkitWebViewPointer.reinterpret())?.run {
            InputMethodContext(reinterpret())
        }

    /**
     * Get the #WebKitWebInspector associated to @web_view
     *
     * @return the #WebKitWebInspector of @web_view
     */
    public open fun getInspector(): WebInspector =
        webkit_web_view_get_inspector(webkitWebViewPointer.reinterpret())!!.run {
            WebInspector(reinterpret())
        }

    /**
     * Return the main resource of @web_view.
     *
     * @return the main #WebKitWebResource of the view
     *    or null if nothing has been loaded.
     */
    public open fun getMainResource(): WebResource =
        webkit_web_view_get_main_resource(webkitWebViewPointer.reinterpret())!!.run {
            WebResource(reinterpret())
        }

    /**
     * Gets the current session state of @web_view
     *
     * @return a #WebKitWebViewSessionState
     * @since 2.12
     */
    @WebKitVersion2_12
    public open fun getSessionState(): WebViewSessionState =
        webkit_web_view_get_session_state(webkitWebViewPointer.reinterpret())!!.run {
            WebViewSessionState(reinterpret())
        }

    /**
     * Gets the #WebKitSettings currently applied to @web_view.
     *
     * If no other #WebKitSettings have been explicitly applied to
     * @web_view with webkit_web_view_set_settings(), the default
     * #WebKitSettings will be returned. This method always returns
     * a valid #WebKitSettings object.
     * To modify any of the @web_view settings, you can either create
     * a new #WebKitSettings object with webkit_settings_new(), setting
     * the desired preferences, and then replace the existing @web_view
     * settings with webkit_web_view_set_settings() or get the existing
     * @web_view settings and update it directly. #WebKitSettings objects
     * can be shared by multiple #WebKitWebView<!-- -->s, so modifying
     * the settings of a #WebKitWebView would affect other
     * #WebKitWebView<!-- -->s using the same #WebKitSettings.
     *
     * @return the #WebKitSettings attached to @web_view
     */
    public open fun getWebViewSettings(): Settings =
        webkit_web_view_get_settings(webkitWebViewPointer.reinterpret())!!.run {
            Settings(reinterpret())
        }

    /**
     * Asynchronously retrieves a snapshot of @web_view for @region.
     *
     * @options specifies how the snapshot should be rendered.
     *
     * When the operation is finished, @callback will be called. You must
     * call webkit_web_view_get_snapshot_finish() to get the result of the
     * operation.
     *
     * @param region the #WebKitSnapshotRegion for this snapshot
     * @param options #WebKitSnapshotOptions for the snapshot
     * @param cancellable a #GCancellable
     * @param callback a #GAsyncReadyCallback
     */
    public open fun getSnapshot(
        region: SnapshotRegion,
        options: SnapshotOptions,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = webkit_web_view_get_snapshot(
        webkitWebViewPointer.reinterpret(),
        region.nativeValue,
        options.mask,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous operation started with webkit_web_view_get_snapshot().
     *
     * @param result a #GAsyncResult
     * @return an image with the retrieved snapshot, or null in case of error.
     */
    public open fun getSnapshotFinish(result: AsyncResult): Result<Texture> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_web_view_get_snapshot_finish(
            webkitWebViewPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            Texture(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Get the #WebKitWindowProperties object.
     *
     * Get the #WebKitWindowProperties object containing the properties
     * that the window containing @web_view should have.
     *
     * @return the #WebKitWindowProperties of @web_view
     */
    public open fun getWindowProperties(): WindowProperties =
        webkit_web_view_get_window_properties(webkitWebViewPointer.reinterpret())!!.run {
            WindowProperties(reinterpret())
        }

    /**
     * Loads the previous history item.
     *
     * You can monitor the load operation by connecting to
     * #WebKitWebView::load-changed signal.
     */
    public open fun goBack(): Unit = webkit_web_view_go_back(webkitWebViewPointer.reinterpret())

    /**
     * Loads the next history item.
     *
     * You can monitor the load operation by connecting to
     * #WebKitWebView::load-changed signal.
     */
    public open fun goForward(): Unit = webkit_web_view_go_forward(webkitWebViewPointer.reinterpret())

    /**
     * Loads the specific history item @list_item.
     *
     * You can monitor the load operation by connecting to
     * #WebKitWebView::load-changed signal.
     *
     * @param listItem a #WebKitBackForwardListItem
     */
    public open fun goToBackForwardListItem(listItem: BackForwardListItem): Unit =
        webkit_web_view_go_to_back_forward_list_item(
            webkitWebViewPointer.reinterpret(),
            listItem.webkitBackForwardListItemPointer.reinterpret()
        )

    /**
     * Get whether a #WebKitWebView was created with #WebKitWebView:is-controlled-by-automation
     * property enabled.
     *
     * Only #WebKitWebView<!-- -->s controlled by automation can be used in an
     * automation session.
     *
     * @return true if @web_view is controlled by automation, or false otherwise.
     * @since 2.18
     */
    @WebKitVersion2_18
    public open fun isControlledByAutomation(): Boolean =
        webkit_web_view_is_controlled_by_automation(webkitWebViewPointer.reinterpret()).asBoolean()

    /**
     * Gets whether the user is allowed to edit the HTML document.
     *
     * When @web_view is not editable an element in the HTML document can only be edited if the
     * CONTENTEDITABLE attribute has been set on the element or one of its parent
     * elements. By default a #WebKitWebView is not editable.
     *
     * @return true if the user is allowed to edit the HTML document, or false otherwise.
     * @since 2.8
     */
    @WebKitVersion2_8
    public open fun isEditable(): Boolean = webkit_web_view_is_editable(webkitWebViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the value of the #WebKitWebView:is-loading property.
     *
     * You can monitor when a #WebKitWebView is loading a page by connecting to
     * notify::is-loading signal of @web_view. This is useful when you are
     * interesting in knowing when the view is loading something but not in the
     * details about the status of the load operation, for example to start a spinner
     * when the view is loading a page and stop it when it finishes.
     *
     * @return true if @web_view is loading a page or false otherwise.
     */
    public open fun isLoading(): Boolean = webkit_web_view_is_loading(webkitWebViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the value of the #WebKitWebView:is-playing-audio property.
     *
     * You can monitor when a page in a #WebKitWebView is playing audio by
     * connecting to the notify::is-playing-audio signal of @web_view. This
     * is useful when the application wants to provide visual feedback when a
     * page is producing sound.
     *
     * @return true if a page in @web_view is playing audio or false otherwise.
     * @since 2.8
     */
    @WebKitVersion2_8
    public open fun isPlayingAudio(): Boolean =
        webkit_web_view_is_playing_audio(webkitWebViewPointer.reinterpret()).asBoolean()

    /**
     * Load the given @content string for the URI @content_uri.
     *
     * This allows clients to display page-loading errors in the #WebKitWebView itself.
     * When this method is called from #WebKitWebView::load-failed signal to show an
     * error page, then the back-forward list is maintained appropriately.
     * For everything else this method works the same way as webkit_web_view_load_html().
     *
     * @param content the new content to display as the main page of the @web_view
     * @param contentUri the URI for the alternate page content
     * @param baseUri the base URI for relative locations or null
     */
    public open fun loadAlternateHtml(content: String, contentUri: String, baseUri: String? = null): Unit =
        webkit_web_view_load_alternate_html(webkitWebViewPointer.reinterpret(), content, contentUri, baseUri)

    /**
     * Load the specified @bytes into @web_view using the given @mime_type and @encoding.
     *
     * When @mime_type is null, it defaults to "text/html".
     * When @encoding is null, it defaults to "UTF-8".
     * When @base_uri is null, it defaults to "about:blank".
     * You can monitor the load operation by connecting to #WebKitWebView::load-changed signal.
     *
     * @param bytes input data to load
     * @param mimeType the MIME type of @bytes, or null
     * @param encoding the character encoding of @bytes, or null
     * @param baseUri the base URI for relative locations or null
     * @since 2.6
     */
    @WebKitVersion2_6
    public open fun loadBytes(
        bytes: Bytes,
        mimeType: String? = null,
        encoding: String? = null,
        baseUri: String? = null,
    ): Unit = webkit_web_view_load_bytes(
        webkitWebViewPointer.reinterpret(),
        bytes.glibBytesPointer.reinterpret(),
        mimeType,
        encoding,
        baseUri
    )

    /**
     * Load the given @content string with the specified @base_uri.
     *
     * If @base_uri is not null, relative URLs in the @content will be
     * resolved against @base_uri and absolute local paths must be children of the @base_uri.
     * For security reasons absolute local paths that are not children of @base_uri
     * will cause the web process to terminate.
     * If you need to include URLs in @content that are local paths in a different
     * directory than @base_uri you can build a data URI for them. When @base_uri is null,
     * it defaults to "about:blank". The mime type of the document will be "text/html".
     * You can monitor the load operation by connecting to #WebKitWebView::load-changed signal.
     *
     * @param content The HTML string to load
     * @param baseUri The base URI for relative locations or null
     */
    public open fun loadHtml(content: String, baseUri: String? = null): Unit =
        webkit_web_view_load_html(webkitWebViewPointer.reinterpret(), content, baseUri)

    /**
     * Load the specified @plain_text string into @web_view.
     *
     * The mime type of document will be "text/plain". You can monitor the load
     * operation by connecting to #WebKitWebView::load-changed signal.
     *
     * @param plainText The plain text to load
     */
    public open fun loadPlainText(plainText: String): Unit =
        webkit_web_view_load_plain_text(webkitWebViewPointer.reinterpret(), plainText)

    /**
     * Requests loading of the specified #WebKitURIRequest.
     *
     * You can monitor the load operation by connecting to
     * #WebKitWebView::load-changed signal.
     *
     * @param request a #WebKitURIRequest to load
     */
    public open fun loadRequest(request: URIRequest): Unit =
        webkit_web_view_load_request(webkitWebViewPointer.reinterpret(), request.webkitURIRequestPointer.reinterpret())

    /**
     * Requests loading of the specified URI string.
     *
     * You can monitor the load operation by connecting to
     * #WebKitWebView::load-changed signal.
     *
     * @param uri an URI string
     */
    public open fun loadUri(uri: String): Unit = webkit_web_view_load_uri(webkitWebViewPointer.reinterpret(), uri)

    /**
     * Reloads the current contents of @web_view.
     *
     * See also webkit_web_view_reload_bypass_cache().
     */
    public open fun reload(): Unit = webkit_web_view_reload(webkitWebViewPointer.reinterpret())

    /**
     * Reloads the current contents of @web_view without
     * using any cached data.
     */
    public open fun reloadBypassCache(): Unit = webkit_web_view_reload_bypass_cache(webkitWebViewPointer.reinterpret())

    /**
     * Restore the @web_view session state from @state
     *
     * @param state a #WebKitWebViewSessionState
     * @since 2.12
     */
    @WebKitVersion2_12
    public open fun restoreSessionState(state: WebViewSessionState): Unit = webkit_web_view_restore_session_state(
        webkitWebViewPointer.reinterpret(),
        state.webkitWebViewSessionStatePointer.reinterpret()
    )

    /**
     * Asynchronously save the current web page.
     *
     * Asynchronously save the current web page associated to the
     * #WebKitWebView into a self-contained format using the mode
     * specified in @save_mode.
     *
     * When the operation is finished, @callback will be called. You can
     * then call webkit_web_view_save_finish() to get the result of the
     * operation.
     *
     * @param saveMode the #WebKitSaveMode specifying how the web page should be saved.
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     */
    public open fun save(saveMode: SaveMode, cancellable: Cancellable? = null, callback: AsyncReadyCallback): Unit =
        webkit_web_view_save(
            webkitWebViewPointer.reinterpret(),
            saveMode.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finish an asynchronous operation started with webkit_web_view_save().
     *
     * @param result a #GAsyncResult
     * @return a #GInputStream with the result of saving
     *    the current web page or null in case of error.
     */
    public open fun saveFinish(result: AsyncResult): Result<InputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_web_view_save_finish(
            webkitWebViewPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            InputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously save the current web page.
     *
     * Asynchronously save the current web page associated to the
     * #WebKitWebView into a self-contained format using the mode
     * specified in @save_mode and writing it to @file.
     *
     * When the operation is finished, @callback will be called. You can
     * then call webkit_web_view_save_to_file_finish() to get the result of the
     * operation.
     *
     * @param file the #GFile where the current web page should be saved to.
     * @param saveMode the #WebKitSaveMode specifying how the web page should be saved.
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     */
    public open fun saveToFile(
        `file`: File,
        saveMode: SaveMode,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = webkit_web_view_save_to_file(
        webkitWebViewPointer.reinterpret(),
        `file`.gioFilePointer,
        saveMode.nativeValue,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finish an asynchronous operation started with webkit_web_view_save_to_file().
     *
     * @param result a #GAsyncResult
     * @return true if the web page was successfully saved to a file or false otherwise.
     */
    public open fun saveToFileFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_web_view_save_to_file_finish(
            webkitWebViewPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Send @message to the #WebKitWebPage corresponding to @web_view.
     *
     * If @message is floating, it's consumed.
     * If you don't expect any reply, or you simply want to ignore it, you can pass null as @callback.
     * When the operation is finished, @callback will be called. You can then call
     * webkit_web_view_send_message_to_page_finish() to get the message reply.
     *
     * @param message a #WebKitUserMessage
     * @param cancellable a #GCancellable or null to ignore
     * @param callback (nullable): A #GAsyncReadyCallback to call when the request is satisfied or null
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun sendMessageToPage(
        message: UserMessage,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = webkit_web_view_send_message_to_page(
        webkitWebViewPointer.reinterpret(),
        message.webkitUserMessagePointer.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finish an asynchronous operation started with webkit_web_view_send_message_to_page().
     *
     * @param result a #GAsyncResult
     * @return a #WebKitUserMessage with the reply or null in case of error.
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun sendMessageToPageFinish(result: AsyncResult): Result<UserMessage> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_web_view_send_message_to_page_finish(
            webkitWebViewPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            UserMessage(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Sets the color that will be used to draw the @web_view background.
     *
     * Sets the color that will be used to draw the @web_view background before
     * the actual contents are rendered. Note that if the web page loaded in @web_view
     * specifies a background color, it will take precedence over the @rgba color.
     * By default the @web_view background color is opaque white.
     *
     * @param rgba a #GdkRGBA
     * @since 2.8
     */
    @WebKitVersion2_8
    public open fun setBackgroundColor(rgba: RGBA): Unit =
        webkit_web_view_set_background_color(webkitWebViewPointer.reinterpret(), rgba.gdkRGBAPointer.reinterpret())

    /**
     * Sets the @allowlist for CORS.
     *
     * Sets the @allowlist for which
     * [Cross-Origin Resource Sharing](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * checks are disabled in @web_view. URI patterns must be of the form
     * `[protocol]://[host]/[path]`, each component may contain the wildcard
     * character (`*`) to represent zero or more other characters. All three
     * components are required and must not be omitted from the URI
     * patterns.
     *
     * Disabling CORS checks permits resources from other origins to load
     * allowlisted resources. It does not permit the allowlisted resources
     * to load resources from other origins.
     *
     * If this function is called multiple times, only the allowlist set by
     * the most recent call will be effective.
     *
     * @param allowlist an allowlist of URI patterns, or null
     * @since 2.34
     */
    @WebKitVersion2_34
    public open fun setCorsAllowlist(allowlist: List<String>? = null): Unit = memScoped {
        return webkit_web_view_set_cors_allowlist(webkitWebViewPointer.reinterpret(), allowlist?.toCStringList(this))
    }

    /**
     * Sets the current custom character encoding override of @web_view.
     *
     * The custom character encoding will override any text encoding detected via HTTP headers or
     * META tags. Calling this method will stop any current load operation and reload the
     * current page. Setting the custom character encoding to null removes the character
     * encoding override.
     *
     * @param charset a character encoding name or null
     */
    public open fun setCustomCharset(charset: String? = null): Unit =
        webkit_web_view_set_custom_charset(webkitWebViewPointer.reinterpret(), charset)

    /**
     * Sets whether the user is allowed to edit the HTML document.
     *
     * If @editable is true, @web_view allows the user to edit the HTML document. If
     * @editable is false, an element in @web_view's document can only be edited if the
     * CONTENTEDITABLE attribute has been set on the element or one of its parent
     * elements. By default a #WebKitWebView is not editable.
     *
     * Normally, a HTML document is not editable unless the elements within the
     * document are editable. This function provides a way to make the contents
     * of a #WebKitWebView editable without altering the document or DOM structure.
     *
     * @param editable a #gboolean indicating the editable state
     * @since 2.8
     */
    @WebKitVersion2_8
    public open fun setEditable(editable: Boolean): Unit =
        webkit_web_view_set_editable(webkitWebViewPointer.reinterpret(), editable.asGBoolean())

    /**
     * Set the #WebKitInputMethodContext to be used by @web_view.
     *
     * Set the #WebKitInputMethodContext to be used by @web_view, or null to not use any input method.
     * Note that the same #WebKitInputMethodContext can't be set on more than one #WebKitWebView at the same time.
     *
     * @param context the #WebKitInputMethodContext to set, or null
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun setInputMethodContext(context: InputMethodContext? = null): Unit =
        webkit_web_view_set_input_method_context(
            webkitWebViewPointer.reinterpret(),
            context?.webkitInputMethodContextPointer?.reinterpret()
        )

    /**
     * Sets the #WebKitSettings to be applied to @web_view.
     *
     * The
     * existing #WebKitSettings of @web_view will be replaced by
     * @settings. New settings are applied immediately on @web_view.
     * The same #WebKitSettings object can be shared
     * by multiple #WebKitWebView<!-- -->s.
     *
     * @param settings a #WebKitSettings
     */
    public open fun setSettings(settings: Settings): Unit =
        webkit_web_view_set_settings(webkitWebViewPointer.reinterpret(), settings.webkitSettingsPointer.reinterpret())

    /**
     * Stops any ongoing loading operation in @web_view.
     *
     * This method does nothing if no content is being loaded.
     * If there is a loading operation in progress, it will be cancelled and
     * #WebKitWebView::load-failed signal will be emitted with
     * %WEBKIT_NETWORK_ERROR_CANCELLED error.
     */
    public open fun stopLoading(): Unit = webkit_web_view_stop_loading(webkitWebViewPointer.reinterpret())

    /**
     * Terminates the web process associated to @web_view.
     *
     * When the web process gets terminated
     * using this method, the #WebKitWebView::web-process-terminated signal is emitted with
     * %WEBKIT_WEB_PROCESS_TERMINATED_BY_API as the reason for termination.
     *
     * @since 2.34
     */
    @WebKitVersion2_34
    public open fun terminateWebProcess(): Unit =
        webkit_web_view_terminate_web_process(webkitWebViewPointer.reinterpret())

    /**
     * Tries to close the @web_view.
     *
     * This will fire the onbeforeunload event
     * to ask the user for confirmation to close the page. If there isn't an
     * onbeforeunload event handler or the user confirms to close the page,
     * the #WebKitWebView::close signal is emitted, otherwise nothing happens.
     *
     * @since 2.12
     */
    @WebKitVersion2_12
    public open fun tryClose(): Unit = webkit_web_view_try_close(webkitWebViewPointer.reinterpret())

    /**
     * This signal is emitted when the user is challenged with HTTP
     * authentication. To let the  application access or supply
     * the credentials as well as to allow the client application
     * to either cancel the request or perform the authentication,
     * the signal will pass an instance of the
     * #WebKitAuthenticationRequest in the @request argument.
     * To handle this signal asynchronously you should keep a ref
     * of the request and return true. To disable HTTP authentication
     * entirely, connect to this signal and simply return true.
     *
     * The default signal handler will run a default authentication
     * dialog asynchronously for the user to interact with.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `request` a #WebKitAuthenticationRequest. Returns true to stop other handlers from being invoked for the event.
     *   false to propagate the event further.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun connectAuthenticate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (request: AuthenticationRequest) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "authenticate",
        connectAuthenticateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when closing a #WebKitWebView is requested. This occurs when a
     * call is made from JavaScript's <function>window.close</function> function or
     * after trying to close the @web_view with webkit_web_view_try_close().
     * It is the owner's responsibility to handle this signal to hide or
     * destroy the #WebKitWebView, if necessary.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectClose(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "close",
            connectCloseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a context menu is about to be displayed to give the application
     * a chance to customize the proposed menu, prevent the menu from being displayed,
     * or build its own context menu.
     * <itemizedlist>
     * <listitem><para>
     *  To customize the proposed menu you can use webkit_context_menu_prepend(),
     *  webkit_context_menu_append() or webkit_context_menu_insert() to add new
     *  #WebKitContextMenuItem<!-- -->s to @context_menu, webkit_context_menu_move_item()
     *  to reorder existing items, or webkit_context_menu_remove() to remove an
     *  existing item. The signal handler should return false, and the menu represented
     *  by @context_menu will be shown.
     * </para></listitem>
     * <listitem><para>
     *  To prevent the menu from being displayed you can just connect to this signal
     *  and return true so that the proposed menu will not be shown.
     * </para></listitem>
     * <listitem><para>
     *  To build your own menu, you can remove all items from the proposed menu with
     *  webkit_context_menu_remove_all(), add your own items and return false so
     *  that the menu will be shown. You can also ignore the proposed #WebKitContextMenu,
     *  build your own #GtkMenu and return true to prevent the proposed menu from being shown.
     * </para></listitem>
     * <listitem><para>
     *  If you just want the default menu to be shown always, simply don't connect to this
     *  signal because showing the proposed context menu is the default behaviour.
     * </para></listitem>
     * </itemizedlist>
     *
     * If the signal handler returns false the context menu represented by @context_menu
     * will be shown, if it return true the context menu will not be shown.
     *
     * The proposed #WebKitContextMenu passed in @context_menu argument is only valid
     * during the signal emission.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `contextMenu` the proposed #WebKitContextMenu; `hitTestResult` a #WebKitHitTestResult. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     */
    public fun connectContextMenu(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (contextMenu: ContextMenu, hitTestResult: HitTestResult) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "context-menu",
        connectContextMenuFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted after #WebKitWebView::context-menu signal, if the context menu is shown,
     * to notify that the context menu is dismissed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectContextMenuDismissed(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "context-menu-dismissed",
            connectContextMenuDismissedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the creation of a new #WebKitWebView is requested.
     * If this signal is handled the signal handler should return the
     * newly created #WebKitWebView.
     *
     * The #WebKitNavigationAction parameter contains information about the
     * navigation action that triggered this signal.
     *
     * The new #WebKitWebView must be related to @web_view, see
     * #WebKitWebView:related-view for more details.
     *
     * The new #WebKitWebView should not be displayed to the user
     * until the #WebKitWebView::ready-to-show signal is emitted.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `navigationAction` a #WebKitNavigationAction. Returns a newly allocated #WebKitWebView widget
     *    or null to propagate the event further.
     */
    public fun connectCreate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (navigationAction: NavigationAction) -> Widget,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "create",
        connectCreateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when WebKit is requesting the client to decide a policy
     * decision, such as whether to navigate to a page, open a new window or whether or
     * not to download a resource. The #WebKitNavigationPolicyDecision passed in the
     * @decision argument is a generic type, but should be casted to a more
     * specific type when making the decision. For example:
     *
     * ```c
     * static gboolean
     * decide_policy_cb (WebKitWebView *web_view,
     *                   WebKitPolicyDecision *decision,
     *                   WebKitPolicyDecisionType type)
     * {
     *     switch (type) {
     *     case WEBKIT_POLICY_DECISION_TYPE_NAVIGATION_ACTION: {
     *         WebKitNavigationPolicyDecision *navigation_decision = WEBKIT_NAVIGATION_POLICY_DECISION (decision);
     *         // Make a policy decision here
     *         break;
     *     }
     *     case WEBKIT_POLICY_DECISION_TYPE_NEW_WINDOW_ACTION: {
     *         WebKitNavigationPolicyDecision *navigation_decision = WEBKIT_NAVIGATION_POLICY_DECISION (decision);
     *         // Make a policy decision here
     *         break;
     *     }
     *     case WEBKIT_POLICY_DECISION_TYPE_RESPONSE:
     *         WebKitResponsePolicyDecision *response = WEBKIT_RESPONSE_POLICY_DECISION (decision);
     *         // Make a policy decision here
     *         break;
     *     default:
     *         // Making no decision results in webkit_policy_decision_use()
     *         return FALSE;
     *     }
     *     return TRUE;
     * }
     * ```
     *
     * It is possible to make policy decision asynchronously, by simply calling g_object_ref()
     * on the @decision argument and returning true to block the default signal handler.
     * If the last reference is removed on a #WebKitPolicyDecision and no decision has been
     * made explicitly, webkit_policy_decision_use() will be the default policy decision. The
     * default signal handler will simply call webkit_policy_decision_use(). Only the first
     * policy decision chosen for a given #WebKitPolicyDecision will have any affect.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `decision` the #WebKitPolicyDecision; `decisionType` a #WebKitPolicyDecisionType denoting the type of @decision. Returns true to stop other handlers from being invoked for the event.
     *   false to propagate the event further.
     */
    public fun connectDecidePolicy(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (decision: PolicyDecision, decisionType: PolicyDecisionType) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "decide-policy",
        connectDecidePolicyFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when JavaScript code calls
     * <function>element.webkitRequestFullScreen</function>. If the
     * signal is not handled the #WebKitWebView will proceed to full screen
     * its top level window. This signal can be used by client code to
     * request permission to the user prior doing the full screen
     * transition and eventually prepare the top-level window
     * (e.g. hide some widgets that would otherwise be part of the
     * full screen window).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true to stop other handlers from being invoked for the event.
     *    false to continue emission of the event.
     */
    public fun connectEnterFullscreen(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "enter-fullscreen",
            connectEnterFullscreenFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Prior to 2.46, this signal was emitted when insecure content was
     * loaded in a secure content. Since 2.46, this signal is generally
     * no longer emitted.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `event` the #WebKitInsecureContentEvent
     */
    public fun connectInsecureContentDetected(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (event: InsecureContentEvent) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "insecure-content-detected",
        connectInsecureContentDetectedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the #WebKitWebView is about to restore its top level
     * window out of its full screen state. This signal can be used by
     * client code to restore widgets hidden during the
     * #WebKitWebView::enter-fullscreen stage for instance.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true to stop other handlers from being invoked for the event.
     *    false to continue emission of the event.
     */
    public fun connectLeaveFullscreen(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "leave-fullscreen",
            connectLeaveFullscreenFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a load operation in @web_view changes.
     * The signal is always emitted with %WEBKIT_LOAD_STARTED when a
     * new load request is made and %WEBKIT_LOAD_FINISHED when the load
     * finishes successfully or due to an error. When the ongoing load
     * operation fails #WebKitWebView::load-failed signal is emitted
     * before #WebKitWebView::load-changed is emitted with
     * %WEBKIT_LOAD_FINISHED.
     * If a redirection is received from the server, this signal is emitted
     * with %WEBKIT_LOAD_REDIRECTED after the initial emission with
     * %WEBKIT_LOAD_STARTED and before %WEBKIT_LOAD_COMMITTED.
     * When the page content starts arriving the signal is emitted with
     * %WEBKIT_LOAD_COMMITTED event.
     *
     * You can handle this signal and use a switch to track any ongoing
     * load operation.
     *
     * ```c
     * static void web_view_load_changed (WebKitWebView  *web_view,
     *                                    WebKitLoadEvent load_event,
     *                                    gpointer        user_data)
     * {
     *     switch (load_event) {
     *     case WEBKIT_LOAD_STARTED:
     *         // New load, we have now a provisional URI
     *         provisional_uri = webkit_web_view_get_uri (web_view);
     *         // Here we could start a spinner or update the
     *         // location bar with the provisional URI
     *         break;
     *     case WEBKIT_LOAD_REDIRECTED:
     *         redirected_uri = webkit_web_view_get_uri (web_view);
     *         break;
     *     case WEBKIT_LOAD_COMMITTED:
     *         // The load is being performed. Current URI is
     *         // the final one and it won't change unless a new
     *         // load is requested or a navigation within the
     *         // same page is performed
     *         uri = webkit_web_view_get_uri (web_view);
     *         break;
     *     case WEBKIT_LOAD_FINISHED:
     *         // Load finished, we can now stop the spinner
     *         break;
     *     }
     * }
     * ```
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `loadEvent` the #WebKitLoadEvent
     */
    public fun connectLoadChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (loadEvent: LoadEvent) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "load-changed",
        connectLoadChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when an error occurs during a load operation.
     * If the error happened when starting to load data for a page
     * @load_event will be %WEBKIT_LOAD_STARTED. If it happened while
     * loading a committed data source @load_event will be %WEBKIT_LOAD_COMMITTED.
     * Since a load error causes the load operation to finish, the signal
     * WebKitWebView::load-changed will always be emitted with
     * %WEBKIT_LOAD_FINISHED event right after this one.
     *
     * By default, if the signal is not handled, a stock error page will be displayed.
     * You need to handle the signal if you want to provide your own error page.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `loadEvent` the #WebKitLoadEvent of the load operation; `failingUri` the URI that failed to load; `error` the #GError that was triggered. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     */
    public fun connectLoadFailed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            loadEvent: LoadEvent,
            failingUri: String,
            error: Error,
        ) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "load-failed",
        connectLoadFailedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when a TLS error occurs during a load operation.
     * To allow an exception for this @certificate
     * and the host of @failing_uri use webkit_web_context_allow_tls_certificate_for_host().
     *
     * To handle this signal asynchronously you should call g_object_ref() on @certificate
     * and return true.
     *
     * If false is returned, #WebKitWebView::load-failed will be emitted. The load
     * will finish regardless of the returned value.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `failingUri` the URI that failed to load; `certificate` a #GTlsCertificate; `errors` a #GTlsCertificateFlags with the verification status of @certificate. Returns true to stop other handlers from being invoked for the event.
     *   false to propagate the event further.
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun connectLoadFailedWithTlsErrors(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            failingUri: String,
            certificate: TlsCertificate,
            errors: TlsCertificateFlags,
        ) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "load-failed-with-tls-errors",
        connectLoadFailedWithTlsErrorsFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when the mouse cursor moves over an
     * element such as a link, image or a media element. To determine
     * what type of element the mouse cursor is over, a Hit Test is performed
     * on the current mouse coordinates and the result is passed in the
     * @hit_test_result argument. The @modifiers argument is a bitmask of
     * #GdkModifierType flags indicating the state of modifier keys.
     * The signal is emitted again when the mouse is moved out of the
     * current element with a new @hit_test_result.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `hitTestResult` a #WebKitHitTestResult; `modifiers` a bitmask of #GdkModifierType
     */
    public fun connectMouseTargetChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (hitTestResult: HitTestResult, modifiers: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "mouse-target-changed",
        connectMouseTargetChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when WebKit is requesting the client to
     * decide about a permission request, such as allowing the browser
     * to switch to fullscreen mode, sharing its location or similar
     * operations.
     *
     * A possible way to use this signal could be through a dialog
     * allowing the user decide what to do with the request:
     *
     * ```c
     * static gboolean permission_request_cb (WebKitWebView *web_view,
     *                                        WebKitPermissionRequest *request,
     *                                        GtkWindow *parent_window)
     * {
     *     GtkWidget *dialog = gtk_message_dialog_new (parent_window,
     *                                                 GTK_DIALOG_MODAL,
     *                                                 GTK_MESSAGE_QUESTION,
     *                                                 GTK_BUTTONS_YES_NO,
     *                                                 "Allow Permission Request?");
     *     gtk_widget_show (dialog);
     *     gint result = gtk_dialog_run (GTK_DIALOG (dialog));
     *
     *     switch (result) {
     *     case GTK_RESPONSE_YES:
     *         webkit_permission_request_allow (request);
     *         break;
     *     default:
     *         webkit_permission_request_deny (request);
     *         break;
     *     }
     *     gtk_widget_destroy (dialog);
     *
     *     return TRUE;
     * }
     * ```
     *
     * It is possible to handle permission requests asynchronously, by
     * simply calling g_object_ref() on the @request argument and
     * returning true to block the default signal handler.  If the
     * last reference is removed on a #WebKitPermissionRequest and the
     * request has not been handled, webkit_permission_request_deny()
     * will be the default action.
     *
     * If the signal is not handled, the @request will be completed automatically
     * by the specific #WebKitPermissionRequest that could allow or deny it. Check the
     * documentation of classes implementing #WebKitPermissionRequest interface to know
     * their default action.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `request` the #WebKitPermissionRequest. Returns true to stop other handlers from being invoked for the event.
     *   false to propagate the event further.
     */
    public fun connectPermissionRequest(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (request: PermissionRequest) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "permission-request",
        connectPermissionRequestFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when printing is requested on @web_view, usually by a JavaScript call,
     * before the print dialog is shown. This signal can be used to set the initial
     * print settings and page setup of @print_operation to be used as default values in
     * the print dialog. You can call webkit_print_operation_set_print_settings() and
     * webkit_print_operation_set_page_setup() and then return false to propagate the
     * event so that the print dialog is shown.
     *
     * You can connect to this signal and return true to cancel the print operation
     * or implement your own print dialog.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `printOperation` the #WebKitPrintOperation that will handle the print request. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     */
    public fun connectPrint(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (printOperation: PrintOperation) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "print",
        connectPrintFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal allows the User-Agent to respond to permission requests for powerful features, as
     * specified by the [Permissions W3C Specification](https://w3c.github.io/permissions/).
     * You can reply to the query using webkit_permission_state_query_finish().
     *
     * You can handle the query asynchronously by calling webkit_permission_state_query_ref() on
     * @query and returning true. If the last reference of @query is removed and the query has not
     * been handled, the query result will be set to %WEBKIT_QUERY_PERMISSION_PROMPT.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `query` the #WebKitPermissionStateQuery. Returns true if the message was handled, or false otherwise.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun connectQueryPermissionState(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (query: PermissionStateQuery) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "query-permission-state",
        connectQueryPermissionStateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted after #WebKitWebView::create on the newly created #WebKitWebView
     * when it should be displayed to the user. When this signal is emitted
     * all the information about how the window should look, including
     * size, position, whether the location, status and scrollbars
     * should be displayed, is already set on the #WebKitWindowProperties
     * of @web_view. See also webkit_web_view_get_window_properties().
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectReadyToShow(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "ready-to-show",
            connectReadyToShowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a new resource is going to be loaded. The @request parameter
     * contains the #WebKitURIRequest that will be sent to the server.
     * You can monitor the load operation by connecting to the different signals
     * of @resource.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `resource` a #WebKitWebResource; `request` a #WebKitURIRequest
     */
    public fun connectResourceLoadStarted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (resource: WebResource, request: URIRequest) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "resource-load-started",
        connectResourceLoadStartedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted after #WebKitWebView::ready-to-show on the newly
     * created #WebKitWebView when JavaScript code calls
     * <function>window.showModalDialog</function>. The purpose of
     * this signal is to allow the client application to prepare the
     * new view to behave as modal. Once the signal is emitted a new
     * main loop will be run to block user interaction in the parent
     * #WebKitWebView until the new dialog is closed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectRunAsModal(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "run-as-modal",
            connectRunAsModalFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when the user interacts with a <input
     * type='color' /> HTML element, requesting from WebKit to show
     * a dialog to select a color. To let the application know the details of
     * the color chooser, as well as to allow the client application to either
     * cancel the request or perform an actual color selection, the signal will
     * pass an instance of the #WebKitColorChooserRequest in the @request
     * argument.
     *
     * It is possible to handle this request asynchronously by increasing the
     * reference count of the request.
     *
     * The default signal handler will asynchronously run a regular
     * #GtkColorChooser for the user to interact with.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `request` a #WebKitColorChooserRequest. Returns true to stop other handlers from being invoked for the event.
     *   false to propagate the event further.
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun connectRunColorChooser(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (request: ColorChooserRequest) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "run-color-chooser",
        connectRunColorChooserFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when the user interacts with a <input
     * type='file' /> HTML element, requesting from WebKit to show
     * a dialog to select one or more files to be uploaded. To let the
     * application know the details of the file chooser, as well as to
     * allow the client application to either cancel the request or
     * perform an actual selection of files, the signal will pass an
     * instance of the #WebKitFileChooserRequest in the @request
     * argument.
     *
     * The default signal handler will asynchronously run a regular
     * #GtkFileChooserDialog for the user to interact with.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `request` a #WebKitFileChooserRequest. Returns true to stop other handlers from being invoked for the event.
     *   false to propagate the event further.
     */
    public fun connectRunFileChooser(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (request: FileChooserRequest) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "run-file-chooser",
        connectRunFileChooserFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when JavaScript code calls <function>window.alert</function>,
     * <function>window.confirm</function> or <function>window.prompt</function>,
     * or when <function>onbeforeunload</function> event is fired.
     * The @dialog parameter should be used to build the dialog.
     * If the signal is not handled a different dialog will be built and shown depending
     * on the dialog type:
     * <itemizedlist>
     * <listitem><para>
     *  %WEBKIT_SCRIPT_DIALOG_ALERT: message dialog with a single Close button.
     * </para></listitem>
     * <listitem><para>
     *  %WEBKIT_SCRIPT_DIALOG_CONFIRM: message dialog with OK and Cancel buttons.
     * </para></listitem>
     * <listitem><para>
     *  %WEBKIT_SCRIPT_DIALOG_PROMPT: message dialog with OK and Cancel buttons and
     *  a text entry with the default text.
     * </para></listitem>
     * <listitem><para>
     *  %WEBKIT_SCRIPT_DIALOG_BEFORE_UNLOAD_CONFIRM: message dialog with Stay and Leave buttons.
     * </para></listitem>
     * </itemizedlist>
     *
     * It is possible to handle the script dialog request asynchronously, by simply
     * caling webkit_script_dialog_ref() on the @dialog argument and calling
     * webkit_script_dialog_close() when done.
     * If the last reference is removed on a #WebKitScriptDialog and the dialog has not been
     * closed, webkit_script_dialog_close() will be called.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `dialog` the #WebKitScriptDialog to show. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     */
    public fun connectScriptDialog(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (dialog: ScriptDialog) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "script-dialog",
        connectScriptDialogFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when a notification should be presented to the
     * user. The @notification is kept alive until either: 1) the web page cancels it
     * or 2) a navigation happens.
     *
     * The default handler will emit a notification using libnotify, if built with
     * support for it.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `notification` a #WebKitNotification. Returns true to stop other handlers from being invoked. false otherwise.
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun connectShowNotification(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (notification: Notification) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "show-notification",
        connectShowNotificationFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when a select element in @web_view needs to display a
     * dropdown menu. This signal can be used to show a custom menu, using @menu to get
     * the details of all items that should be displayed. The area of the element in the
     * #WebKitWebView is given as @rectangle parameter, it can be used to position the
     * menu.
     * To handle this signal asynchronously you should keep a ref of the @menu.
     *
     * The default signal handler will pop up a #GtkMenu.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `menu` the #WebKitOptionMenu; `rectangle` the option element area. Returns true to stop other handlers from being invoked for the event.
     *   false to propagate the event further.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun connectShowOptionMenu(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (menu: OptionMenu, rectangle: Rectangle) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "show-option-menu",
        connectShowOptionMenuFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when a form is about to be submitted. The @request
     * argument passed contains information about the text fields of the form. This
     * is typically used to store login information that can be used later to
     * pre-fill the form.
     * The form will not be submitted until webkit_form_submission_request_submit() is called.
     *
     * It is possible to handle the form submission request asynchronously, by
     * simply calling g_object_ref() on the @request argument and calling
     * webkit_form_submission_request_submit() when done to continue with the form submission.
     * If the last reference is removed on a #WebKitFormSubmissionRequest and the
     * form has not been submitted, webkit_form_submission_request_submit() will be called.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `request` a #WebKitFormSubmissionRequest
     */
    public fun connectSubmitForm(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (request: FormSubmissionRequest) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "submit-form",
        connectSubmitFormFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when a #WebKitUserMessage is received from the
     * #WebKitWebPage corresponding to @web_view. You can reply to the message
     * using webkit_user_message_send_reply().
     *
     * You can handle the user message asynchronously by calling g_object_ref() on
     * @message and returning true. If the last reference of @message is removed
     * and the message has not been replied to, the operation in the #WebKitWebPage will
     * finish with error %WEBKIT_USER_MESSAGE_UNHANDLED_MESSAGE.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `message` the #WebKitUserMessage received. Returns true if the message was handled, or false otherwise.
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun connectUserMessageReceived(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (message: UserMessage) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "user-message-received",
        connectUserMessageReceivedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when the web process terminates abnormally due
     * to @reason.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `reason` the a #WebKitWebProcessTerminationReason
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun connectWebProcessTerminated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (reason: WebProcessTerminationReason) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "web-process-terminated",
        connectWebProcessTerminatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<WebView> {
        override val type: GeneratedClassKGType<WebView> =
            GeneratedClassKGType(webkit_web_view_get_type()) { WebView(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of WebView
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_web_view_get_type()
    }
}

private val connectAuthenticateFunc:
    CPointer<CFunction<(CPointer<WebKitAuthenticationRequest>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            request: CPointer<WebKitAuthenticationRequest>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(request: AuthenticationRequest) -> Boolean>().get().invoke(
            request!!.run {
                AuthenticationRequest(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectCloseFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectContextMenuFunc:
    CPointer<CFunction<(CPointer<WebKitContextMenu>, CPointer<WebKitHitTestResult>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            contextMenu: CPointer<WebKitContextMenu>?,
            hitTestResult: CPointer<WebKitHitTestResult>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                contextMenu: ContextMenu,
                hitTestResult: HitTestResult,
            ) -> Boolean
            >().get().invoke(
            contextMenu!!.run {
                ContextMenu(reinterpret())
            },
            hitTestResult!!.run {
                HitTestResult(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectContextMenuDismissedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectCreateFunc:
    CPointer<CFunction<(CPointer<WebKitNavigationAction>) -> CPointer<GtkWidget>>> =
    staticCFunction {
            _: COpaquePointer,
            navigationAction: CPointer<WebKitNavigationAction>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(navigationAction: NavigationAction) -> Widget>().get().invoke(
            navigationAction!!.run {
                NavigationAction(reinterpret())
            }
        ).gtkWidgetPointer
    }
        .reinterpret()

private val connectDecidePolicyFunc:
    CPointer<CFunction<(CPointer<WebKitPolicyDecision>, WebKitPolicyDecisionType) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            decision: CPointer<WebKitPolicyDecision>?,
            decisionType: WebKitPolicyDecisionType,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                decision: PolicyDecision,
                decisionType: PolicyDecisionType,
            ) -> Boolean
            >().get().invoke(
            decision!!.run {
                PolicyDecision(reinterpret())
            },
            decisionType.run {
                PolicyDecisionType.fromNativeValue(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectEnterFullscreenFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val connectInsecureContentDetectedFunc:
    CPointer<CFunction<(WebKitInsecureContentEvent) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            event: WebKitInsecureContentEvent,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(event: InsecureContentEvent) -> Unit>().get().invoke(
            event.run {
                InsecureContentEvent.fromNativeValue(this)
            }
        )
    }
        .reinterpret()

private val connectLeaveFullscreenFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val connectLoadChangedFunc: CPointer<CFunction<(WebKitLoadEvent) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            loadEvent: WebKitLoadEvent,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(loadEvent: LoadEvent) -> Unit>().get().invoke(
            loadEvent.run {
                LoadEvent.fromNativeValue(this)
            }
        )
    }
        .reinterpret()

private val connectLoadFailedFunc: CPointer<
    CFunction<
        (
            WebKitLoadEvent,
            CPointer<ByteVar>,
            CPointer<org.gtkkn.native.glib.GError>,
        ) -> gboolean
        >
    > = staticCFunction {
        _: COpaquePointer,
        loadEvent: WebKitLoadEvent,
        failingUri: CPointer<ByteVar>?,
        error: CPointer<org.gtkkn.native.glib.GError>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            loadEvent: LoadEvent,
            failingUri: String,
            error: Error,
        ) -> Boolean
        >().get().invoke(
        loadEvent.run {
            LoadEvent.fromNativeValue(this)
        },
        failingUri?.toKString() ?: error("Expected not null string"),
        error!!.run {
            Error(reinterpret())
        }
    ).asGBoolean()
}
    .reinterpret()

private val connectLoadFailedWithTlsErrorsFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            CPointer<GTlsCertificate>,
            GTlsCertificateFlags,
        ) -> gboolean
        >
    > = staticCFunction {
        _: COpaquePointer,
        failingUri: CPointer<ByteVar>?,
        certificate: CPointer<GTlsCertificate>?,
        errors: GTlsCertificateFlags,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            failingUri: String,
            certificate: TlsCertificate,
            errors: TlsCertificateFlags,
        ) -> Boolean
        >().get().invoke(
        failingUri?.toKString() ?: error("Expected not null string"),
        certificate!!.run {
            TlsCertificate(reinterpret())
        },
        errors.run {
            TlsCertificateFlags(this)
        }
    ).asGBoolean()
}
    .reinterpret()

private val connectMouseTargetChangedFunc:
    CPointer<CFunction<(CPointer<WebKitHitTestResult>, guint) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            hitTestResult: CPointer<WebKitHitTestResult>?,
            modifiers: guint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(hitTestResult: HitTestResult, modifiers: guint) -> Unit>().get().invoke(
            hitTestResult!!.run {
                HitTestResult(reinterpret())
            },
            modifiers
        )
    }
        .reinterpret()

private val connectPermissionRequestFunc:
    CPointer<CFunction<(CPointer<WebKitPermissionRequest>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            request: CPointer<WebKitPermissionRequest>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(request: PermissionRequest) -> Boolean>().get().invoke(
            request!!.run {
                PermissionRequest.wrap(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectPrintFunc: CPointer<CFunction<(CPointer<WebKitPrintOperation>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            printOperation: CPointer<WebKitPrintOperation>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(printOperation: PrintOperation) -> Boolean>().get().invoke(
            printOperation!!.run {
                PrintOperation(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectQueryPermissionStateFunc:
    CPointer<CFunction<(CPointer<WebKitPermissionStateQuery>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            query: CPointer<WebKitPermissionStateQuery>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(query: PermissionStateQuery) -> Boolean>().get().invoke(
            query!!.run {
                PermissionStateQuery(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectReadyToShowFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectResourceLoadStartedFunc:
    CPointer<CFunction<(CPointer<WebKitWebResource>, CPointer<WebKitURIRequest>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            resource: CPointer<WebKitWebResource>?,
            request: CPointer<WebKitURIRequest>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(resource: WebResource, request: URIRequest) -> Unit>().get().invoke(
            resource!!.run {
                WebResource(reinterpret())
            },
            request!!.run {
                URIRequest(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectRunAsModalFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectRunColorChooserFunc:
    CPointer<CFunction<(CPointer<WebKitColorChooserRequest>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            request: CPointer<WebKitColorChooserRequest>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(request: ColorChooserRequest) -> Boolean>().get().invoke(
            request!!.run {
                ColorChooserRequest(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectRunFileChooserFunc:
    CPointer<CFunction<(CPointer<WebKitFileChooserRequest>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            request: CPointer<WebKitFileChooserRequest>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(request: FileChooserRequest) -> Boolean>().get().invoke(
            request!!.run {
                FileChooserRequest(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectScriptDialogFunc: CPointer<CFunction<(CPointer<WebKitScriptDialog>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            dialog: CPointer<WebKitScriptDialog>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(dialog: ScriptDialog) -> Boolean>().get().invoke(
            dialog!!.run {
                ScriptDialog(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectShowNotificationFunc:
    CPointer<CFunction<(CPointer<WebKitNotification>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            notification: CPointer<WebKitNotification>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(notification: Notification) -> Boolean>().get().invoke(
            notification!!.run {
                Notification(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectShowOptionMenuFunc:
    CPointer<CFunction<(CPointer<WebKitOptionMenu>, CPointer<GdkRectangle>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            menu: CPointer<WebKitOptionMenu>?,
            rectangle: CPointer<GdkRectangle>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(menu: OptionMenu, rectangle: Rectangle) -> Boolean>().get().invoke(
            menu!!.run {
                OptionMenu(reinterpret())
            },
            rectangle!!.run {
                Rectangle(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectSubmitFormFunc:
    CPointer<CFunction<(CPointer<WebKitFormSubmissionRequest>) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            request: CPointer<WebKitFormSubmissionRequest>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(request: FormSubmissionRequest) -> Unit>().get().invoke(
            request!!.run {
                FormSubmissionRequest(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectUserMessageReceivedFunc:
    CPointer<CFunction<(CPointer<WebKitUserMessage>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            message: CPointer<WebKitUserMessage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(message: UserMessage) -> Boolean>().get().invoke(
            message!!.run {
                UserMessage(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectWebProcessTerminatedFunc:
    CPointer<CFunction<(WebKitWebProcessTerminationReason) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            reason: WebKitWebProcessTerminationReason,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(reason: WebProcessTerminationReason) -> Unit>().get().invoke(
            reason.run {
                WebProcessTerminationReason.fromNativeValue(this)
            }
        )
    }
        .reinterpret()
