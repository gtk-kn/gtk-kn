// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupContentSniffer
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_content_sniffer_get_type
import org.gtkkn.native.soup.soup_content_sniffer_new

/**
 * Sniffs the mime type of messages.
 *
 * A #SoupContentSniffer tries to detect the actual content type of
 * the files that are being downloaded by looking at some of the data
 * before the [class@Message] emits its [signal@Message::got-headers] signal.
 * #SoupContentSniffer implements [iface@SessionFeature], so you can add
 * content sniffing to a session with [method@Session.add_feature] or
 * [method@Session.add_feature_by_type].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `params`: params: Out parameter is not supported
 */
public class ContentSniffer(pointer: CPointer<SoupContentSniffer>) :
    Object(pointer.reinterpret()),
    SessionFeature,
    KGTyped {
    public val soupContentSnifferPointer: CPointer<SoupContentSniffer>
        get() = gPointer.reinterpret()

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #SoupContentSniffer.
     *
     * @return a new #SoupContentSniffer
     */
    public constructor() : this(soup_content_sniffer_new()!!.reinterpret())

    public companion object : TypeCompanion<ContentSniffer> {
        override val type: GeneratedClassKGType<ContentSniffer> =
            GeneratedClassKGType(soup_content_sniffer_get_type()) { ContentSniffer(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of ContentSniffer
         *
         * @return the GType
         */
        public fun getType(): GType = soup_content_sniffer_get_type()
    }
}
