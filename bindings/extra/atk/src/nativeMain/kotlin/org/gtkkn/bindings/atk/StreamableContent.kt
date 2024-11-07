// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.atk.annotations.AtkVersion1_12
import org.gtkkn.bindings.glib.IOChannel
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkStreamableContent
import org.gtkkn.native.atk.atk_streamable_content_get_mime_type
import org.gtkkn.native.atk.atk_streamable_content_get_n_mime_types
import org.gtkkn.native.atk.atk_streamable_content_get_stream
import org.gtkkn.native.atk.atk_streamable_content_get_type
import org.gtkkn.native.atk.atk_streamable_content_get_uri
import kotlin.Int
import kotlin.String

/**
 * The ATK interface which provides access to streamable content.
 *
 * An interface whereby an object allows its backing content to be
 * streamed to clients.  Typical implementors would be images or
 * icons, HTML content, or multimedia display/rendering widgets.
 *
 * Negotiation of content type is allowed. Clients may examine the
 * backing data and transform, convert, or parse the content in order
 * to present it in an alternate form to end-users.
 *
 * The AtkStreamableContent interface is particularly useful for
 * saving, printing, or post-processing entire documents, or for
 * persisting alternate views of a document. If document content
 * itself is being serialized, stored, or converted, then use of the
 * AtkStreamableContent interface can help address performance
 * issues. Unlike most ATK interfaces, this interface is not strongly
 * tied to the current user-agent view of the a particular document,
 * but may in some cases give access to the underlying model data.
 */
public interface StreamableContent :
    Interface,
    KGTyped {
    public val atkStreamableContentPointer: CPointer<AtkStreamableContent>

    /**
     * Gets the character string of the specified mime type. The first mime
     * type is at position 0, the second at position 1, and so on.
     *
     * @param i a gint representing the position of the mime type starting from 0
     * @return a gchar* representing the specified mime type; the caller
     * should not free the character string.
     */
    public fun getMimeType(i: Int): String =
        atk_streamable_content_get_mime_type(atkStreamableContentPointer.reinterpret(), i)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the number of mime types supported by this object.
     *
     * @return a gint which is the number of mime types supported by the object.
     */
    public fun getNMimeTypes(): Int = atk_streamable_content_get_n_mime_types(atkStreamableContentPointer.reinterpret())

    /**
     * Gets the content in the specified mime type.
     *
     * @param mimeType a gchar* representing the mime type
     * @return A #GIOChannel which contains the content in the
     * specified mime type.
     */
    public fun getStream(mimeType: String): IOChannel =
        atk_streamable_content_get_stream(atkStreamableContentPointer.reinterpret(), mimeType)!!.run {
            IOChannel(reinterpret())
        }

    /**
     * Get a string representing a URI in IETF standard format
     * (see http://www.ietf.org/rfc/rfc2396.txt) from which the object's content
     * may be streamed in the specified mime-type, if one is available.
     * If mime_type is NULL, the URI for the default (and possibly only) mime-type is
     * returned.
     *
     * Note that it is possible for get_uri to return NULL but for
     * get_stream to work nonetheless, since not all GIOChannels connect to URIs.
     *
     * @param mimeType a gchar* representing the mime type, or NULL to request a URI
     * for the default mime type.
     * @return Returns a string representing a URI, or null
     * if no corresponding URI can be constructed.
     * @since 1.12
     */
    @AtkVersion1_12
    public fun getUri(mimeType: String): String? =
        atk_streamable_content_get_uri(atkStreamableContentPointer.reinterpret(), mimeType)?.toKString()

    private data class Wrapper(
        private val pointer: CPointer<AtkStreamableContent>,
    ) : StreamableContent {
        override val atkStreamableContentPointer: CPointer<AtkStreamableContent> = pointer
    }

    public companion object : TypeCompanion<StreamableContent> {
        override val type: GeneratedInterfaceKGType<StreamableContent> =
            GeneratedInterfaceKGType(atk_streamable_content_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkStreamableContent>): StreamableContent = Wrapper(pointer)
    }
}
