// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object SoupTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = mapOf(
        Auth::class to Auth.type,
        AuthDomain::class to AuthDomain.type,
        AuthDomainBasic::class to AuthDomainBasic.type,
        AuthDomainDigest::class to AuthDomainDigest.type,
        AuthManager::class to AuthManager.type,
        Cache::class to Cache.type,
        ContentDecoder::class to ContentDecoder.type,
        ContentSniffer::class to ContentSniffer.type,
        CookieJar::class to CookieJar.type,
        CookieJarDB::class to CookieJarDB.type,
        CookieJarText::class to CookieJarText.type,
        HSTSEnforcer::class to HSTSEnforcer.type,
        HSTSEnforcerDB::class to HSTSEnforcerDB.type,
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
