// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_16
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_TEXT_BUFFER_NOTIFY_AFTER_DELETE
import org.gtkkn.native.gtk.GTK_TEXT_BUFFER_NOTIFY_AFTER_INSERT
import org.gtkkn.native.gtk.GTK_TEXT_BUFFER_NOTIFY_BEFORE_DELETE
import org.gtkkn.native.gtk.GTK_TEXT_BUFFER_NOTIFY_BEFORE_INSERT
import org.gtkkn.native.gtk.GtkTextBufferNotifyFlags
import org.gtkkn.native.gtk.gtk_text_buffer_notify_flags_get_type

/**
 * Values for [callback@Gtk.TextBufferCommitNotify] to denote the
 * point of the notification.
 * @since 4.16
 */
public class TextBufferNotifyFlags(public val mask: GtkTextBufferNotifyFlags) : Bitfield<TextBufferNotifyFlags> {
    override infix fun or(other: TextBufferNotifyFlags): TextBufferNotifyFlags = TextBufferNotifyFlags(
        mask or other.mask
    )

    @GtkVersion4_16
    public companion object {
        /**
         * Be notified before text
         *   is inserted into the underlying buffer.
         */
        public val BEFORE_INSERT: TextBufferNotifyFlags =
            TextBufferNotifyFlags(GTK_TEXT_BUFFER_NOTIFY_BEFORE_INSERT)

        /**
         * Be notified after text
         *   has been inserted into the underlying buffer.
         */
        public val AFTER_INSERT: TextBufferNotifyFlags =
            TextBufferNotifyFlags(GTK_TEXT_BUFFER_NOTIFY_AFTER_INSERT)

        /**
         * Be notified before text
         *   is deleted from the underlying buffer.
         */
        public val BEFORE_DELETE: TextBufferNotifyFlags =
            TextBufferNotifyFlags(GTK_TEXT_BUFFER_NOTIFY_BEFORE_DELETE)

        /**
         * Be notified after text
         *   has been deleted from the underlying buffer.
         */
        public val AFTER_DELETE: TextBufferNotifyFlags =
            TextBufferNotifyFlags(GTK_TEXT_BUFFER_NOTIFY_AFTER_DELETE)

        /**
         * Get the GType of TextBufferNotifyFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_buffer_notify_flags_get_type()
    }
}
