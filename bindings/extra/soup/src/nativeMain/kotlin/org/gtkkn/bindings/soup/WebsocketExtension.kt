// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.HashTable
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.Soup.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupWebsocketExtension
import org.gtkkn.native.soup.soup_websocket_extension_configure
import org.gtkkn.native.soup.soup_websocket_extension_get_request_params
import org.gtkkn.native.soup.soup_websocket_extension_get_response_params
import org.gtkkn.native.soup.soup_websocket_extension_get_type
import kotlin.Boolean
import kotlin.Result
import kotlin.String

/**
 * A WebSocket extension
 *
 * #SoupWebsocketExtension is the base class for WebSocket extension objects.
 *
 * ## Skipped during bindings generation
 *
 * - method `process_incoming_message`: In/Out parameter is not supported
 * - method `process_outgoing_message`: In/Out parameter is not supported
 */
public open class WebsocketExtension(pointer: CPointer<SoupWebsocketExtension>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val soupWebsocketExtensionPointer: CPointer<SoupWebsocketExtension>
        get() = gPointer.reinterpret()

    /**
     * Configures @extension with the given @params.
     *
     * @param connectionType either %SOUP_WEBSOCKET_CONNECTION_CLIENT or %SOUP_WEBSOCKET_CONNECTION_SERVER
     * @param params the parameters
     * @return true if extension could be configured with the given parameters, or false otherwise
     */
    public open fun configure(connectionType: WebsocketConnectionType, params: HashTable? = null): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = soup_websocket_extension_configure(
                soupWebsocketExtensionPointer.reinterpret(),
                connectionType.nativeValue,
                params?.glibHashTablePointer?.reinterpret(),
                gError.ptr
            ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Get the parameters strings to be included in the request header.
     *
     * If the extension doesn't include any parameter in the request, this function
     * returns null.
     *
     * @return a new allocated string with the parameters
     */
    public open fun getRequestParams(): String? =
        soup_websocket_extension_get_request_params(soupWebsocketExtensionPointer.reinterpret())?.toKString()

    /**
     * Get the parameters strings to be included in the response header.
     *
     * If the extension doesn't include any parameter in the response, this function
     * returns null.
     *
     * @return a new allocated string with the parameters
     */
    public open fun getResponseParams(): String? =
        soup_websocket_extension_get_response_params(soupWebsocketExtensionPointer.reinterpret())?.toKString()

    public companion object : TypeCompanion<WebsocketExtension> {
        override val type: GeneratedClassKGType<WebsocketExtension> =
            GeneratedClassKGType(soup_websocket_extension_get_type()) { WebsocketExtension(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of WebsocketExtension
         *
         * @return the GType
         */
        public fun getType(): GType = soup_websocket_extension_get_type()
    }
}
