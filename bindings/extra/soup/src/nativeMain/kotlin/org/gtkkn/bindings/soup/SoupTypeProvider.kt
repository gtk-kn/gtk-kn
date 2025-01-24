// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object SoupTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = mapOf(
        Auth::class to Auth.type,
        AuthBasic::class to AuthBasic.type,
        AuthDigest::class to AuthDigest.type,
        AuthDomain::class to AuthDomain.type,
        AuthDomainBasic::class to AuthDomainBasic.type,
        AuthDomainDigest::class to AuthDomainDigest.type,
        AuthManager::class to AuthManager.type,
        AuthNtlm::class to AuthNtlm.type,
        AuthNegotiate::class to AuthNegotiate.type,
        Cache::class to Cache.type,
        ContentDecoder::class to ContentDecoder.type,
        ContentSniffer::class to ContentSniffer.type,
        CookieJar::class to CookieJar.type,
        CookieJarDb::class to CookieJarDb.type,
        CookieJarText::class to CookieJarText.type,
        HstsEnforcer::class to HstsEnforcer.type,
        HstsEnforcerDb::class to HstsEnforcerDb.type,
        Logger::class to Logger.type,
        Message::class to Message.type,
        MultipartInputStream::class to MultipartInputStream.type,
        Server::class to Server.type,
        ServerMessage::class to ServerMessage.type,
        Session::class to Session.type,
        WebsocketConnection::class to WebsocketConnection.type,
        WebsocketExtension::class to WebsocketExtension.type,
        WebsocketExtensionDeflate::class to WebsocketExtensionDeflate.type,
        WebsocketExtensionManager::class to WebsocketExtensionManager.type,
        SessionFeature::class to SessionFeature.type,
    )
}
