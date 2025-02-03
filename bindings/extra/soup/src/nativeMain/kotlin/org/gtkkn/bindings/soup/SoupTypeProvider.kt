// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object SoupTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (Auth.getTypeOrNull() != null) put(Auth::class, Auth.type)
        if (AuthBasic.getTypeOrNull() != null) put(AuthBasic::class, AuthBasic.type)
        if (AuthDigest.getTypeOrNull() != null) put(AuthDigest::class, AuthDigest.type)
        if (AuthDomain.getTypeOrNull() != null) put(AuthDomain::class, AuthDomain.type)
        if (AuthDomainBasic.getTypeOrNull() != null) put(AuthDomainBasic::class, AuthDomainBasic.type)
        if (AuthDomainDigest.getTypeOrNull() != null) put(AuthDomainDigest::class, AuthDomainDigest.type)
        if (AuthManager.getTypeOrNull() != null) put(AuthManager::class, AuthManager.type)
        if (AuthNtlm.getTypeOrNull() != null) put(AuthNtlm::class, AuthNtlm.type)
        if (AuthNegotiate.getTypeOrNull() != null) put(AuthNegotiate::class, AuthNegotiate.type)
        if (Cache.getTypeOrNull() != null) put(Cache::class, Cache.type)
        if (ContentDecoder.getTypeOrNull() != null) put(ContentDecoder::class, ContentDecoder.type)
        if (ContentSniffer.getTypeOrNull() != null) put(ContentSniffer::class, ContentSniffer.type)
        if (CookieJar.getTypeOrNull() != null) put(CookieJar::class, CookieJar.type)
        if (CookieJarDb.getTypeOrNull() != null) put(CookieJarDb::class, CookieJarDb.type)
        if (CookieJarText.getTypeOrNull() != null) put(CookieJarText::class, CookieJarText.type)
        if (HstsEnforcer.getTypeOrNull() != null) put(HstsEnforcer::class, HstsEnforcer.type)
        if (HstsEnforcerDb.getTypeOrNull() != null) put(HstsEnforcerDb::class, HstsEnforcerDb.type)
        if (Logger.getTypeOrNull() != null) put(Logger::class, Logger.type)
        if (Message.getTypeOrNull() != null) put(Message::class, Message.type)
        if (MultipartInputStream.getTypeOrNull() != null) put(MultipartInputStream::class, MultipartInputStream.type)
        if (Server.getTypeOrNull() != null) put(Server::class, Server.type)
        if (ServerMessage.getTypeOrNull() != null) put(ServerMessage::class, ServerMessage.type)
        if (Session.getTypeOrNull() != null) put(Session::class, Session.type)
        if (WebsocketConnection.getTypeOrNull() != null) put(WebsocketConnection::class, WebsocketConnection.type)
        if (WebsocketExtension.getTypeOrNull() != null) put(WebsocketExtension::class, WebsocketExtension.type)
        if (WebsocketExtensionDeflate.getTypeOrNull() !=
            null
        ) {
            put(WebsocketExtensionDeflate::class, WebsocketExtensionDeflate.type)
        }
        if (WebsocketExtensionManager.getTypeOrNull() !=
            null
        ) {
            put(WebsocketExtensionManager::class, WebsocketExtensionManager.type)
        }
        if (SessionFeature.getTypeOrNull() != null) put(SessionFeature::class, SessionFeature.type)
    }
}
