// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupContentDecoder
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_content_decoder_get_type

/**
 * Handles decoding of HTTP messages.
 *
 * #SoupContentDecoder handles adding the "Accept-Encoding" header on
 * outgoing messages, and processing the "Content-Encoding" header on
 * incoming ones. Currently it supports the "gzip", "deflate", and "br"
 * content codings.
 *
 * A #SoupContentDecoder will automatically be
 * added to the session by default. (You can use
 * [method@Session.remove_feature_by_type] if you don't
 * want this.)
 *
 * If #SoupContentDecoder successfully decodes the Content-Encoding,
 * the message body will contain the decoded data; however, the message headers
 * will be unchanged (and so "Content-Encoding" will still be present,
 * "Content-Length" will describe the original encoded length, etc).
 *
 * If "Content-Encoding" contains any encoding types that
 * #SoupContentDecoder doesn't recognize, then none of the encodings
 * will be decoded.
 *
 * (Note that currently there is no way to (automatically) use
 * Content-Encoding when sending a request body, or to pick specific
 * encoding types to support.)
 */
public class ContentDecoder(public val soupContentDecoderPointer: CPointer<SoupContentDecoder>) :
    Object(soupContentDecoderPointer.reinterpret()),
    SessionFeature,
    KGTyped {
    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<ContentDecoder> {
        override val type: GeneratedClassKGType<ContentDecoder> =
            GeneratedClassKGType(soup_content_decoder_get_type()) { ContentDecoder(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of ContentDecoder
         *
         * @return the GType
         */
        public fun getType(): GType = soup_content_decoder_get_type()
    }
}
