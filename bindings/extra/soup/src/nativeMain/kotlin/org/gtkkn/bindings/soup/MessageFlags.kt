// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SOUP_MESSAGE_COLLECT_METRICS
import org.gtkkn.native.soup.SOUP_MESSAGE_DO_NOT_USE_AUTH_CACHE
import org.gtkkn.native.soup.SOUP_MESSAGE_IDEMPOTENT
import org.gtkkn.native.soup.SOUP_MESSAGE_NEW_CONNECTION
import org.gtkkn.native.soup.SOUP_MESSAGE_NO_REDIRECT
import org.gtkkn.native.soup.SoupMessageFlags
import org.gtkkn.native.soup.soup_message_flags_get_type

/**
 * Various flags that can be set on a #SoupMessage to alter its
 * behavior.
 */
public class MessageFlags(public val mask: SoupMessageFlags) : Bitfield<MessageFlags> {
    override infix fun or(other: MessageFlags): MessageFlags = MessageFlags(mask or other.mask)

    public companion object {
        /**
         * The session should not follow redirect
         *   (3xx) responses received by this message.
         */
        public val NO_REDIRECT: MessageFlags = MessageFlags(SOUP_MESSAGE_NO_REDIRECT)

        /**
         * Requests that the message should be
         *   sent on a newly-created connection, not reusing an existing
         *   persistent connection. Note that messages with non-idempotent
         *   [property@Message:method]s behave this way by default, unless
         *   #SOUP_MESSAGE_IDEMPOTENT is set.
         */
        public val NEW_CONNECTION: MessageFlags = MessageFlags(SOUP_MESSAGE_NEW_CONNECTION)

        /**
         * The message is considered idempotent,
         *   regardless its [property@Message:method], and allows reuse of existing
         *   idle connections, instead of always requiring a new one, unless
         *   #SOUP_MESSAGE_NEW_CONNECTION is set.
         */
        public val IDEMPOTENT: MessageFlags = MessageFlags(SOUP_MESSAGE_IDEMPOTENT)

        /**
         * The [class@AuthManager] should not use
         *   the credentials cache for this message, neither to use cached credentials
         *   to automatically authenticate this message nor to cache the credentials
         *   after the message is successfully authenticated. This applies to both server
         *   and proxy authentication. Note that [signal@Message::authenticate] signal will
         *   be emitted, if you want to disable authentication for a message use
         *   [method@Message.disable_feature] passing #SOUP_TYPE_AUTH_MANAGER instead.
         */
        public val DO_NOT_USE_AUTH_CACHE: MessageFlags =
            MessageFlags(SOUP_MESSAGE_DO_NOT_USE_AUTH_CACHE)

        /**
         * Metrics will be collected for this message.
         */
        public val COLLECT_METRICS: MessageFlags = MessageFlags(SOUP_MESSAGE_COLLECT_METRICS)

        /**
         * Get the GType of MessageFlags
         *
         * @return the GType
         */
        public fun getType(): GType = soup_message_flags_get_type()
    }
}
