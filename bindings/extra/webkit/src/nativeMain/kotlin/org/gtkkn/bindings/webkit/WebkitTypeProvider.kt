// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object WebkitTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("webkit_authentication_request_get_type") !=
            null
        ) {
            put(AuthenticationRequest::class, AuthenticationRequest.type)
        }
        if (getTypeOrNull("webkit_automation_session_get_type") !=
            null
        ) {
            put(AutomationSession::class, AutomationSession.type)
        }
        if (getTypeOrNull("webkit_back_forward_list_get_type") !=
            null
        ) {
            put(BackForwardList::class, BackForwardList.type)
        }
        if (getTypeOrNull("webkit_back_forward_list_item_get_type") !=
            null
        ) {
            put(BackForwardListItem::class, BackForwardListItem.type)
        }
        if (getTypeOrNull("webkit_clipboard_permission_request_get_type") !=
            null
        ) {
            put(ClipboardPermissionRequest::class, ClipboardPermissionRequest.type)
        }
        if (getTypeOrNull("webkit_color_chooser_request_get_type") !=
            null
        ) {
            put(ColorChooserRequest::class, ColorChooserRequest.type)
        }
        if (getTypeOrNull("webkit_context_menu_get_type") != null) put(ContextMenu::class, ContextMenu.type)
        if (getTypeOrNull("webkit_context_menu_item_get_type") !=
            null
        ) {
            put(ContextMenuItem::class, ContextMenuItem.type)
        }
        if (getTypeOrNull("webkit_cookie_manager_get_type") != null) put(CookieManager::class, CookieManager.type)
        if (getTypeOrNull("webkit_device_info_permission_request_get_type") !=
            null
        ) {
            put(DeviceInfoPermissionRequest::class, DeviceInfoPermissionRequest.type)
        }
        if (getTypeOrNull("webkit_download_get_type") != null) put(Download::class, Download.type)
        if (getTypeOrNull("webkit_editor_state_get_type") != null) put(EditorState::class, EditorState.type)
        if (getTypeOrNull("webkit_favicon_database_get_type") != null) put(FaviconDatabase::class, FaviconDatabase.type)
        if (getTypeOrNull("webkit_file_chooser_request_get_type") !=
            null
        ) {
            put(FileChooserRequest::class, FileChooserRequest.type)
        }
        if (getTypeOrNull("webkit_find_controller_get_type") != null) put(FindController::class, FindController.type)
        if (getTypeOrNull("webkit_form_submission_request_get_type") !=
            null
        ) {
            put(FormSubmissionRequest::class, FormSubmissionRequest.type)
        }
        if (getTypeOrNull("webkit_geolocation_manager_get_type") !=
            null
        ) {
            put(GeolocationManager::class, GeolocationManager.type)
        }
        if (getTypeOrNull("webkit_geolocation_permission_request_get_type") !=
            null
        ) {
            put(GeolocationPermissionRequest::class, GeolocationPermissionRequest.type)
        }
        if (getTypeOrNull("webkit_hit_test_result_get_type") != null) put(HitTestResult::class, HitTestResult.type)
        if (getTypeOrNull("webkit_input_method_context_get_type") !=
            null
        ) {
            put(InputMethodContext::class, InputMethodContext.type)
        }
        if (getTypeOrNull("webkit_media_key_system_permission_request_get_type") !=
            null
        ) {
            put(MediaKeySystemPermissionRequest::class, MediaKeySystemPermissionRequest.type)
        }
        if (getTypeOrNull("webkit_navigation_policy_decision_get_type") !=
            null
        ) {
            put(NavigationPolicyDecision::class, NavigationPolicyDecision.type)
        }
        if (getTypeOrNull("webkit_network_session_get_type") != null) put(NetworkSession::class, NetworkSession.type)
        if (getTypeOrNull("webkit_notification_get_type") != null) put(Notification::class, Notification.type)
        if (getTypeOrNull("webkit_notification_permission_request_get_type") !=
            null
        ) {
            put(NotificationPermissionRequest::class, NotificationPermissionRequest.type)
        }
        if (getTypeOrNull("webkit_option_menu_get_type") != null) put(OptionMenu::class, OptionMenu.type)
        if (getTypeOrNull("webkit_pointer_lock_permission_request_get_type") !=
            null
        ) {
            put(PointerLockPermissionRequest::class, PointerLockPermissionRequest.type)
        }
        if (getTypeOrNull("webkit_policy_decision_get_type") != null) put(PolicyDecision::class, PolicyDecision.type)
        if (getTypeOrNull("webkit_print_operation_get_type") != null) put(PrintOperation::class, PrintOperation.type)
        if (getTypeOrNull("webkit_response_policy_decision_get_type") !=
            null
        ) {
            put(ResponsePolicyDecision::class, ResponsePolicyDecision.type)
        }
        if (getTypeOrNull("webkit_security_manager_get_type") != null) put(SecurityManager::class, SecurityManager.type)
        if (getTypeOrNull("webkit_settings_get_type") != null) put(Settings::class, Settings.type)
        if (getTypeOrNull("webkit_uri_request_get_type") != null) put(UriRequest::class, UriRequest.type)
        if (getTypeOrNull("webkit_uri_response_get_type") != null) put(UriResponse::class, UriResponse.type)
        if (getTypeOrNull("webkit_uri_scheme_request_get_type") !=
            null
        ) {
            put(UriSchemeRequest::class, UriSchemeRequest.type)
        }
        if (getTypeOrNull("webkit_uri_scheme_response_get_type") !=
            null
        ) {
            put(UriSchemeResponse::class, UriSchemeResponse.type)
        }
        if (getTypeOrNull("webkit_user_content_filter_store_get_type") !=
            null
        ) {
            put(UserContentFilterStore::class, UserContentFilterStore.type)
        }
        if (getTypeOrNull("webkit_user_content_manager_get_type") !=
            null
        ) {
            put(UserContentManager::class, UserContentManager.type)
        }
        if (getTypeOrNull("webkit_user_media_permission_request_get_type") !=
            null
        ) {
            put(UserMediaPermissionRequest::class, UserMediaPermissionRequest.type)
        }
        if (getTypeOrNull("webkit_user_message_get_type") != null) put(UserMessage::class, UserMessage.type)
        if (getTypeOrNull("webkit_web_context_get_type") != null) put(WebContext::class, WebContext.type)
        if (getTypeOrNull("webkit_web_inspector_get_type") != null) put(WebInspector::class, WebInspector.type)
        if (getTypeOrNull("webkit_web_resource_get_type") != null) put(WebResource::class, WebResource.type)
        if (getTypeOrNull("webkit_web_view_get_type") != null) put(WebView::class, WebView.type)
        if (getTypeOrNull("webkit_web_view_base_get_type") != null) put(WebViewBase::class, WebViewBase.type)
        if (getTypeOrNull("webkit_website_data_access_permission_request_get_type") !=
            null
        ) {
            put(WebsiteDataAccessPermissionRequest::class, WebsiteDataAccessPermissionRequest.type)
        }
        if (getTypeOrNull("webkit_website_data_manager_get_type") !=
            null
        ) {
            put(WebsiteDataManager::class, WebsiteDataManager.type)
        }
        if (getTypeOrNull("webkit_website_policies_get_type") != null) put(WebsitePolicies::class, WebsitePolicies.type)
        if (getTypeOrNull("webkit_window_properties_get_type") !=
            null
        ) {
            put(WindowProperties::class, WindowProperties.type)
        }
        if (getTypeOrNull("webkit_permission_request_get_type") !=
            null
        ) {
            put(PermissionRequest::class, PermissionRequest.type)
        }
    }
}
