// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object SoupTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("soup_auth_get_type") != null) put(Auth::class, Auth.type)
        if (getTypeOrNull("soup_auth_basic_get_type") != null) put(AuthBasic::class, AuthBasic.type)
        if (getTypeOrNull("soup_auth_digest_get_type") != null) put(AuthDigest::class, AuthDigest.type)
        if (getTypeOrNull("soup_auth_domain_get_type") != null) put(AuthDomain::class, AuthDomain.type)
        if (getTypeOrNull("soup_auth_domain_basic_get_type") != null) put(AuthDomainBasic::class, AuthDomainBasic.type)
        if (getTypeOrNull("soup_auth_domain_digest_get_type") !=
            null
        ) {
            put(AuthDomainDigest::class, AuthDomainDigest.type)
        }
        if (getTypeOrNull("soup_auth_manager_get_type") != null) put(AuthManager::class, AuthManager.type)
        if (getTypeOrNull("soup_auth_ntlm_get_type") != null) put(AuthNtlm::class, AuthNtlm.type)
        if (getTypeOrNull("soup_auth_negotiate_get_type") != null) put(AuthNegotiate::class, AuthNegotiate.type)
        if (getTypeOrNull("soup_cache_get_type") != null) put(Cache::class, Cache.type)
        if (getTypeOrNull("soup_content_decoder_get_type") != null) put(ContentDecoder::class, ContentDecoder.type)
        if (getTypeOrNull("soup_content_sniffer_get_type") != null) put(ContentSniffer::class, ContentSniffer.type)
        if (getTypeOrNull("soup_cookie_jar_get_type") != null) put(CookieJar::class, CookieJar.type)
        if (getTypeOrNull("soup_cookie_jar_db_get_type") != null) put(CookieJarDb::class, CookieJarDb.type)
        if (getTypeOrNull("soup_cookie_jar_text_get_type") != null) put(CookieJarText::class, CookieJarText.type)
        if (getTypeOrNull("soup_hsts_enforcer_get_type") != null) put(HstsEnforcer::class, HstsEnforcer.type)
        if (getTypeOrNull("soup_hsts_enforcer_db_get_type") != null) put(HstsEnforcerDb::class, HstsEnforcerDb.type)
        if (getTypeOrNull("soup_logger_get_type") != null) put(Logger::class, Logger.type)
        if (getTypeOrNull("soup_message_get_type") != null) put(Message::class, Message.type)
        if (getTypeOrNull("soup_multipart_input_stream_get_type") !=
            null
        ) {
            put(MultipartInputStream::class, MultipartInputStream.type)
        }
        if (getTypeOrNull("soup_server_get_type") != null) put(Server::class, Server.type)
        if (getTypeOrNull("soup_server_message_get_type") != null) put(ServerMessage::class, ServerMessage.type)
        if (getTypeOrNull("soup_session_get_type") != null) put(Session::class, Session.type)
        if (getTypeOrNull("soup_websocket_connection_get_type") !=
            null
        ) {
            put(WebsocketConnection::class, WebsocketConnection.type)
        }
        if (getTypeOrNull("soup_websocket_extension_get_type") !=
            null
        ) {
            put(WebsocketExtension::class, WebsocketExtension.type)
        }
        if (getTypeOrNull("soup_websocket_extension_deflate_get_type") !=
            null
        ) {
            put(WebsocketExtensionDeflate::class, WebsocketExtensionDeflate.type)
        }
        if (getTypeOrNull("soup_websocket_extension_manager_get_type") !=
            null
        ) {
            put(WebsocketExtensionManager::class, WebsocketExtensionManager.type)
        }
        if (getTypeOrNull("soup_session_feature_get_type") != null) put(SessionFeature::class, SessionFeature.type)
    }
}
