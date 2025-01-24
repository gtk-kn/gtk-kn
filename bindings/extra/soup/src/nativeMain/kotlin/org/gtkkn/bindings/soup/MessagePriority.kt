// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupMessagePriority
import org.gtkkn.native.soup.soup_message_priority_get_type

/**
 * Priorities that can be set on a [class@Message] to instruct the message queue
 * to process it before any other message with lower priority.
 */
public enum class MessagePriority(public val nativeValue: SoupMessagePriority) {
    /**
     * The lowest priority, the messages
     *   with this priority will be the last ones to be attended.
     */
    VERY_LOW(SoupMessagePriority.SOUP_MESSAGE_PRIORITY_VERY_LOW),

    /**
     * Use this for low priority messages, a
     *   #SoupMessage with the default priority will be processed first.
     */
    LOW(SoupMessagePriority.SOUP_MESSAGE_PRIORITY_LOW),

    /**
     * The default priotity, this is the
     *   priority assigned to the #SoupMessage by default.
     */
    NORMAL(SoupMessagePriority.SOUP_MESSAGE_PRIORITY_NORMAL),

    /**
     * High priority, a #SoupMessage with
     *   this priority will be processed before the ones with the default
     *   priority.
     */
    HIGH(SoupMessagePriority.SOUP_MESSAGE_PRIORITY_HIGH),

    /**
     * The highest priority, use this
     *   for very urgent #SoupMessage as they will be the first ones to be
     *   attended.
     */
    VERY_HIGH(SoupMessagePriority.SOUP_MESSAGE_PRIORITY_VERY_HIGH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupMessagePriority): MessagePriority = when (nativeValue) {
            SoupMessagePriority.SOUP_MESSAGE_PRIORITY_VERY_LOW -> VERY_LOW
            SoupMessagePriority.SOUP_MESSAGE_PRIORITY_LOW -> LOW
            SoupMessagePriority.SOUP_MESSAGE_PRIORITY_NORMAL -> NORMAL
            SoupMessagePriority.SOUP_MESSAGE_PRIORITY_HIGH -> HIGH
            SoupMessagePriority.SOUP_MESSAGE_PRIORITY_VERY_HIGH -> VERY_HIGH
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of MessagePriority
         *
         * @return the GType
         */
        public fun getType(): GType = soup_message_priority_get_type()
    }
}
