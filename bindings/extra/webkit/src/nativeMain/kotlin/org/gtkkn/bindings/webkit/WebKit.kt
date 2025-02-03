// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_24
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_32
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_34
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.TypeCache
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.webkit.WebKitURISchemeRequest
import org.gtkkn.native.webkit.webkit_get_major_version
import org.gtkkn.native.webkit.webkit_get_micro_version
import org.gtkkn.native.webkit.webkit_get_minor_version
import org.gtkkn.native.webkit.webkit_media_key_system_permission_get_name
import org.gtkkn.native.webkit.webkit_uri_for_display
import org.gtkkn.native.webkit.webkit_user_media_permission_is_for_audio_device
import org.gtkkn.native.webkit.webkit_user_media_permission_is_for_display_device
import org.gtkkn.native.webkit.webkit_user_media_permission_is_for_video_device
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - record `AuthenticationRequestClass`: glib type struct are ignored
 * - record `AutomationSessionClass`: glib type struct are ignored
 * - record `BackForwardListClass`: glib type struct are ignored
 * - record `BackForwardListItemClass`: glib type struct are ignored
 * - record `ClipboardPermissionRequestClass`: glib type struct are ignored
 * - record `ColorChooserRequestClass`: glib type struct are ignored
 * - record `ContextMenuClass`: glib type struct are ignored
 * - record `ContextMenuItemClass`: glib type struct are ignored
 * - record `CookieManagerClass`: glib type struct are ignored
 * - record `DeviceInfoPermissionRequestClass`: glib type struct are ignored
 * - record `DownloadClass`: glib type struct are ignored
 * - record `EditorStateClass`: glib type struct are ignored
 * - record `FaviconDatabaseClass`: glib type struct are ignored
 * - record `FileChooserRequestClass`: glib type struct are ignored
 * - record `FindControllerClass`: glib type struct are ignored
 * - record `FormSubmissionRequestClass`: glib type struct are ignored
 * - record `GeolocationManagerClass`: glib type struct are ignored
 * - record `GeolocationPermissionRequestClass`: glib type struct are ignored
 * - record `HitTestResultClass`: glib type struct are ignored
 * - record `InputMethodContextClass`: glib type struct are ignored
 * - record `MediaKeySystemPermissionRequestClass`: glib type struct are ignored
 * - record `NavigationPolicyDecisionClass`: glib type struct are ignored
 * - record `NetworkSessionClass`: glib type struct are ignored
 * - record `NotificationClass`: glib type struct are ignored
 * - record `NotificationPermissionRequestClass`: glib type struct are ignored
 * - record `OptionMenuClass`: glib type struct are ignored
 * - record `PermissionRequestInterface`: glib type struct are ignored
 * - record `PointerLockPermissionRequestClass`: glib type struct are ignored
 * - record `PolicyDecisionClass`: glib type struct are ignored
 * - record `PrintOperationClass`: glib type struct are ignored
 * - record `ResponsePolicyDecisionClass`: glib type struct are ignored
 * - record `SecurityManagerClass`: glib type struct are ignored
 * - record `SettingsClass`: glib type struct are ignored
 * - record `URIRequestClass`: glib type struct are ignored
 * - record `URIResponseClass`: glib type struct are ignored
 * - record `URISchemeRequestClass`: glib type struct are ignored
 * - record `URISchemeResponseClass`: glib type struct are ignored
 * - record `UserContentFilterStoreClass`: glib type struct are ignored
 * - record `UserContentManagerClass`: glib type struct are ignored
 * - record `UserMediaPermissionRequestClass`: glib type struct are ignored
 * - record `UserMessageClass`: glib type struct are ignored
 * - record `WebContextClass`: glib type struct are ignored
 * - record `WebInspectorClass`: glib type struct are ignored
 * - record `WebResourceClass`: glib type struct are ignored
 * - record `WebViewBaseClass`: glib type struct are ignored
 * - record `WebViewClass`: glib type struct are ignored
 * - record `WebsiteDataAccessPermissionRequestClass`: glib type struct are ignored
 * - record `WebsiteDataManagerClass`: glib type struct are ignored
 * - record `WebsitePoliciesClass`: glib type struct are ignored
 * - record `WindowPropertiesClass`: glib type struct are ignored
 */
public object WebKit {
    init {
        registerTypes()
    }

    /**
     * The copy clipboard command. Copies the current selection inside
     * a #WebKitWebView to the clipboard.
     * You can check whether it's possible to execute the command with
     * webkit_web_view_can_execute_editing_command(). In general it's
     * possible to copy to the clipboard when there is an active selection
     * inside the #WebKitWebView.
     */
    public const val EDITING_COMMAND_COPY: String = "Copy"

    /**
     * The create link command. Creates a link element that is inserted at
     * the current cursor position. If there's a selection, the selected text
     * will be used as the link text, otherwise the URL itself will be used.
     * It receives the link URL as argument. This command should be executed
     * with webkit_web_view_execute_editing_command_with_argument()
     *
     * @since 2.10
     */
    public const val EDITING_COMMAND_CREATE_LINK: String = "CreateLink"

    /**
     * The cut clipboard command. Copies the current selection inside
     * a #WebKitWebView to the clipboard and deletes the selected content.
     * You can check whether it's possible to execute the command with
     * webkit_web_view_can_execute_editing_command(). In general it's
     * possible to cut to the clipboard when the #WebKitWebView content is
     * editable and there is an active selection.
     */
    public const val EDITING_COMMAND_CUT: String = "Cut"

    /**
     * The insert image command. Creates an image element that is inserted at
     * the current cursor position. It receives an URI as argument,
     * that is used as the image source. This command should be executed with
     * webkit_web_view_execute_editing_command_with_argument().
     *
     * @since 2.10
     */
    public const val EDITING_COMMAND_INSERT_IMAGE: String = "InsertImage"

    /**
     * The paste clipboard command. Pastes the contents of the clipboard to
     * a #WebKitWebView.
     * You can check whether it's possible to execute the command with
     * webkit_web_view_can_execute_editing_command(). In general it's possible
     * to paste from the clipboard when the #WebKitWebView content is editable
     * and clipboard is not empty.
     */
    public const val EDITING_COMMAND_PASTE: String = "Paste"

    /**
     * The paste as plaintext clipboard command. Pastes the contents of the
     * clipboard to a #WebKitWebView, with formatting removed.
     * You can check whether it's possible to execute the command with
     * webkit_web_view_can_execute_editing_command(). In general it's possible
     * to paste from the clipboard when the #WebKitWebView content is editable
     * and clipboard is not empty.
     *
     * @since 2.30
     */
    public const val EDITING_COMMAND_PASTE_AS_PLAIN_TEXT: String = "PasteAsPlainText"

    /**
     * The redo command. Redoes a previously undone editing command in
     * a #WebKitWebView.
     * You can check whether it's possible to execute the command with
     * webkit_web_view_can_execute_editing_command(). It's only possible
     * to redo a command when it has been previously undone.
     */
    public const val EDITING_COMMAND_REDO: String = "Redo"

    /**
     * The select all command. Selects all the content of the current text field in
     * a #WebKitWebView.
     * It is always possible to select all text, no matter whether the
     * #WebKitWebView content is editable or not. You can still check it
     * with webkit_web_view_can_execute_editing_command().
     */
    public const val EDITING_COMMAND_SELECT_ALL: String = "SelectAll"

    /**
     * The undo command. Undoes the last editing command in a #WebKitWebView.
     * You can check whether it's possible to execute the command with
     * webkit_web_view_can_execute_editing_command(). It's only possible
     * to undo a command after a previously executed editing operation.
     */
    public const val EDITING_COMMAND_UNDO: String = "Undo"

    /**
     * Like webkit_get_major_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MAJOR_VERSION: gint = 2

    /**
     * Like webkit_get_micro_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MICRO_VERSION: gint = 5

    /**
     * Like webkit_get_minor_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MINOR_VERSION: gint = 46

    /**
     * Returns the major version number of the WebKit library.
     *
     * (e.g. in WebKit version 1.8.3 this is 1.)
     *
     * This function is in the library, so it represents the WebKit library
     * your code is running against. Contrast with the #WEBKIT_MAJOR_VERSION
     * macro, which represents the major version of the WebKit headers you
     * have included when compiling your code.
     *
     * @return the major version number of the WebKit library
     */
    public fun getMajorVersion(): guint = webkit_get_major_version()

    /**
     * Returns the micro version number of the WebKit library.
     *
     * (e.g. in WebKit version 1.8.3 this is 3.)
     *
     * This function is in the library, so it represents the WebKit library
     * your code is running against. Contrast with the #WEBKIT_MICRO_VERSION
     * macro, which represents the micro version of the WebKit headers you
     * have included when compiling your code.
     *
     * @return the micro version number of the WebKit library
     */
    public fun getMicroVersion(): guint = webkit_get_micro_version()

    /**
     * Returns the minor version number of the WebKit library.
     *
     * (e.g. in WebKit version 1.8.3 this is 8.)
     *
     * This function is in the library, so it represents the WebKit library
     * your code is running against. Contrast with the #WEBKIT_MINOR_VERSION
     * macro, which represents the minor version of the WebKit headers you
     * have included when compiling your code.
     *
     * @return the minor version number of the WebKit library
     */
    public fun getMinorVersion(): guint = webkit_get_minor_version()

    /**
     * Get the key system for which access permission is being requested.
     *
     * @param request a #WebKitMediaKeySystemPermissionRequest
     * @return the key system name for @request
     * @since 2.32
     */
    @WebKitVersion2_32
    public fun mediaKeySystemPermissionGetName(request: MediaKeySystemPermissionRequest): String =
        webkit_media_key_system_permission_get_name(request.webkitMediaKeySystemPermissionRequestPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Use this function to format a URI for display.
     *
     * The URIs used internally by
     * WebKit may contain percent-encoded characters or Punycode, which are not
     * generally suitable to display to users. This function provides protection
     * against IDN homograph attacks, so in some cases the host part of the returned
     * URI may be in Punycode if the safety check fails.
     *
     * @param uri the URI to be converted
     * @return @uri suitable for display, or null in
     *    case of error.
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun uriForDisplay(uri: String): String? = webkit_uri_for_display(uri)?.toKString()

    /**
     * Check whether the permission request is for an audio device.
     *
     * @param request a #WebKitUserMediaPermissionRequest
     * @return true if access to an audio device was requested.
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun userMediaPermissionIsForAudioDevice(request: UserMediaPermissionRequest): Boolean =
        webkit_user_media_permission_is_for_audio_device(request.webkitUserMediaPermissionRequestPointer).asBoolean()

    /**
     * Check whether the permission request is for a display device.
     *
     * @param request a #WebKitUserMediaPermissionRequest
     * @return true if access to a display device was requested.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun userMediaPermissionIsForDisplayDevice(request: UserMediaPermissionRequest): Boolean =
        webkit_user_media_permission_is_for_display_device(request.webkitUserMediaPermissionRequestPointer).asBoolean()

    /**
     * Check whether the permission request is for a video device.
     *
     * @param request a #WebKitUserMediaPermissionRequest
     * @return true if access to a video device was requested.
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun userMediaPermissionIsForVideoDevice(request: UserMediaPermissionRequest): Boolean =
        webkit_user_media_permission_is_for_video_device(request.webkitUserMediaPermissionRequestPointer).asBoolean()

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            DownloadError.quark() -> DownloadError.fromErrorOrNull(error)
                ?.let {
                    DownloadErrorException(error, it)
                }
            FaviconDatabaseError.quark() -> FaviconDatabaseError.fromErrorOrNull(error)
                ?.let {
                    FaviconDatabaseErrorException(error, it)
                }
            JavascriptError.quark() -> JavascriptError.fromErrorOrNull(error)
                ?.let {
                    JavascriptErrorException(error, it)
                }
            MediaError.quark() -> MediaError.fromErrorOrNull(error)
                ?.let {
                    MediaErrorException(error, it)
                }
            NetworkError.quark() -> NetworkError.fromErrorOrNull(error)
                ?.let {
                    NetworkErrorException(error, it)
                }
            PolicyError.quark() -> PolicyError.fromErrorOrNull(error)
                ?.let {
                    PolicyErrorException(error, it)
                }
            PrintError.quark() -> PrintError.fromErrorOrNull(error)
                ?.let {
                    PrintErrorException(error, it)
                }
            SnapshotError.quark() -> SnapshotError.fromErrorOrNull(error)
                ?.let {
                    SnapshotErrorException(error, it)
                }
            UserContentFilterError.quark() -> UserContentFilterError.fromErrorOrNull(error)
                ?.let {
                    UserContentFilterErrorException(error, it)
                }
            UserMessageError.quark() -> UserMessageError.fromErrorOrNull(error)
                ?.let {
                    UserMessageErrorException(error, it)
                }
            else -> null
        }
        return ex ?: GLibException(error)
    }

    private fun registerTypes() {
        AuthenticationRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AuthenticationRequest::class, gtype) { AuthenticationRequest(it.reinterpret()) }
        }
        AutomationSession.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AutomationSession::class, gtype) { AutomationSession(it.reinterpret()) }
        }
        BackForwardList.getTypeOrNull()?.let { gtype ->
            TypeCache.register(BackForwardList::class, gtype) { BackForwardList(it.reinterpret()) }
        }
        BackForwardListItem.getTypeOrNull()?.let { gtype ->
            TypeCache.register(BackForwardListItem::class, gtype) { BackForwardListItem(it.reinterpret()) }
        }
        ClipboardPermissionRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ClipboardPermissionRequest::class, gtype) {
                ClipboardPermissionRequest(it.reinterpret())
            }
        }
        ColorChooserRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ColorChooserRequest::class, gtype) { ColorChooserRequest(it.reinterpret()) }
        }
        ContextMenu.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ContextMenu::class, gtype) { ContextMenu(it.reinterpret()) }
        }
        ContextMenuItem.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ContextMenuItem::class, gtype) { ContextMenuItem(it.reinterpret()) }
        }
        CookieManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CookieManager::class, gtype) { CookieManager(it.reinterpret()) }
        }
        DeviceInfoPermissionRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(DeviceInfoPermissionRequest::class, gtype) {
                DeviceInfoPermissionRequest(it.reinterpret())
            }
        }
        Download.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Download::class, gtype) { Download(it.reinterpret()) }
        }
        EditorState.getTypeOrNull()?.let { gtype ->
            TypeCache.register(EditorState::class, gtype) { EditorState(it.reinterpret()) }
        }
        FaviconDatabase.getTypeOrNull()?.let { gtype ->
            TypeCache.register(FaviconDatabase::class, gtype) { FaviconDatabase(it.reinterpret()) }
        }
        FileChooserRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(FileChooserRequest::class, gtype) { FileChooserRequest(it.reinterpret()) }
        }
        FindController.getTypeOrNull()?.let { gtype ->
            TypeCache.register(FindController::class, gtype) { FindController(it.reinterpret()) }
        }
        FormSubmissionRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(FormSubmissionRequest::class, gtype) { FormSubmissionRequest(it.reinterpret()) }
        }
        GeolocationManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(GeolocationManager::class, gtype) { GeolocationManager(it.reinterpret()) }
        }
        GeolocationPermissionRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(GeolocationPermissionRequest::class, gtype) {
                GeolocationPermissionRequest(it.reinterpret())
            }
        }
        HitTestResult.getTypeOrNull()?.let { gtype ->
            TypeCache.register(HitTestResult::class, gtype) { HitTestResult(it.reinterpret()) }
        }
        InputMethodContext.getTypeOrNull()?.let { gtype ->
            TypeCache.register(InputMethodContext::class, gtype) {
                InputMethodContext.InputMethodContextImpl(it.reinterpret())
            }
        }
        MediaKeySystemPermissionRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(MediaKeySystemPermissionRequest::class, gtype) {
                MediaKeySystemPermissionRequest(it.reinterpret())
            }
        }
        NavigationPolicyDecision.getTypeOrNull()?.let { gtype ->
            TypeCache.register(NavigationPolicyDecision::class, gtype) { NavigationPolicyDecision(it.reinterpret()) }
        }
        NetworkSession.getTypeOrNull()?.let { gtype ->
            TypeCache.register(NetworkSession::class, gtype) { NetworkSession(it.reinterpret()) }
        }
        Notification.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Notification::class, gtype) { Notification(it.reinterpret()) }
        }
        NotificationPermissionRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(NotificationPermissionRequest::class, gtype) {
                NotificationPermissionRequest(it.reinterpret())
            }
        }
        OptionMenu.getTypeOrNull()?.let { gtype ->
            TypeCache.register(OptionMenu::class, gtype) { OptionMenu(it.reinterpret()) }
        }
        PointerLockPermissionRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PointerLockPermissionRequest::class, gtype) {
                PointerLockPermissionRequest(it.reinterpret())
            }
        }
        PolicyDecision.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PolicyDecision::class, gtype) { PolicyDecision.PolicyDecisionImpl(it.reinterpret()) }
        }
        PrintOperation.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PrintOperation::class, gtype) { PrintOperation(it.reinterpret()) }
        }
        ResponsePolicyDecision.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ResponsePolicyDecision::class, gtype) { ResponsePolicyDecision(it.reinterpret()) }
        }
        SecurityManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SecurityManager::class, gtype) { SecurityManager(it.reinterpret()) }
        }
        Settings.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Settings::class, gtype) { Settings(it.reinterpret()) }
        }
        UriRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(UriRequest::class, gtype) { UriRequest(it.reinterpret()) }
        }
        UriResponse.getTypeOrNull()?.let { gtype ->
            TypeCache.register(UriResponse::class, gtype) { UriResponse(it.reinterpret()) }
        }
        UriSchemeRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(UriSchemeRequest::class, gtype) { UriSchemeRequest(it.reinterpret()) }
        }
        UriSchemeResponse.getTypeOrNull()?.let { gtype ->
            TypeCache.register(UriSchemeResponse::class, gtype) { UriSchemeResponse(it.reinterpret()) }
        }
        UserContentFilterStore.getTypeOrNull()?.let { gtype ->
            TypeCache.register(UserContentFilterStore::class, gtype) { UserContentFilterStore(it.reinterpret()) }
        }
        UserContentManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(UserContentManager::class, gtype) { UserContentManager(it.reinterpret()) }
        }
        UserMediaPermissionRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(UserMediaPermissionRequest::class, gtype) {
                UserMediaPermissionRequest(it.reinterpret())
            }
        }
        UserMessage.getTypeOrNull()?.let { gtype ->
            TypeCache.register(UserMessage::class, gtype) { UserMessage(it.reinterpret()) }
        }
        WebContext.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebContext::class, gtype) { WebContext(it.reinterpret()) }
        }
        WebInspector.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebInspector::class, gtype) { WebInspector(it.reinterpret()) }
        }
        WebResource.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebResource::class, gtype) { WebResource(it.reinterpret()) }
        }
        WebView.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebView::class, gtype) { WebView(it.reinterpret()) }
        }
        WebViewBase.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebViewBase::class, gtype) { WebViewBase(it.reinterpret()) }
        }
        WebsiteDataAccessPermissionRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebsiteDataAccessPermissionRequest::class, gtype) {
                WebsiteDataAccessPermissionRequest(it.reinterpret())
            }
        }
        WebsiteDataManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebsiteDataManager::class, gtype) { WebsiteDataManager(it.reinterpret()) }
        }
        WebsitePolicies.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebsitePolicies::class, gtype) { WebsitePolicies(it.reinterpret()) }
        }
        WindowProperties.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WindowProperties::class, gtype) { WindowProperties(it.reinterpret()) }
        }
        PermissionRequest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PermissionRequest::class, gtype) {
                PermissionRequest.PermissionRequestImpl(it.reinterpret())
            }
        }
    }
}

public val UriSchemeRequestCallbackFunc:
    CPointer<CFunction<(CPointer<WebKitURISchemeRequest>) -> Unit>> = staticCFunction {
            request: CPointer<WebKitURISchemeRequest>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(request: UriSchemeRequest) -> Unit>().get().invoke(
            request!!.run {
                InstanceCache.get(this, false) { UriSchemeRequest(reinterpret()) }!!
            }
        )
    }
        .reinterpret()

/**
 * Type definition for a function that will be called back when an URI request is
 * made for a user registered URI scheme.
 *
 * - param `request` the #WebKitURISchemeRequest
 */
public typealias UriSchemeRequestCallback = (request: UriSchemeRequest) -> Unit
