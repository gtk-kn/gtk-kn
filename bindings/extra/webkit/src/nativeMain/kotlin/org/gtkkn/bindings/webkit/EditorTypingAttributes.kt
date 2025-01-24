// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_10
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WEBKIT_EDITOR_TYPING_ATTRIBUTE_BOLD
import org.gtkkn.native.webkit.WEBKIT_EDITOR_TYPING_ATTRIBUTE_ITALIC
import org.gtkkn.native.webkit.WEBKIT_EDITOR_TYPING_ATTRIBUTE_NONE
import org.gtkkn.native.webkit.WEBKIT_EDITOR_TYPING_ATTRIBUTE_STRIKETHROUGH
import org.gtkkn.native.webkit.WEBKIT_EDITOR_TYPING_ATTRIBUTE_UNDERLINE
import org.gtkkn.native.webkit.WebKitEditorTypingAttributes
import org.gtkkn.native.webkit.webkit_editor_typing_attributes_get_type

/**
 * Enum values with flags representing typing attributes.
 * @since 2.10
 */
public class EditorTypingAttributes(public val mask: WebKitEditorTypingAttributes) : Bitfield<EditorTypingAttributes> {
    override infix fun or(other: EditorTypingAttributes): EditorTypingAttributes = EditorTypingAttributes(
        mask or other.mask
    )

    @WebKitVersion2_10
    public companion object {
        /**
         * No typing attributes.
         */
        public val NONE: EditorTypingAttributes =
            EditorTypingAttributes(WEBKIT_EDITOR_TYPING_ATTRIBUTE_NONE)

        /**
         * Bold typing attribute.
         */
        public val BOLD: EditorTypingAttributes =
            EditorTypingAttributes(WEBKIT_EDITOR_TYPING_ATTRIBUTE_BOLD)

        /**
         * Italic typing attribute.
         */
        public val ITALIC: EditorTypingAttributes =
            EditorTypingAttributes(WEBKIT_EDITOR_TYPING_ATTRIBUTE_ITALIC)

        /**
         * Underline typing attribute.
         */
        public val UNDERLINE: EditorTypingAttributes =
            EditorTypingAttributes(WEBKIT_EDITOR_TYPING_ATTRIBUTE_UNDERLINE)

        /**
         * Strikethrough typing attribute.
         */
        public val STRIKETHROUGH: EditorTypingAttributes =
            EditorTypingAttributes(WEBKIT_EDITOR_TYPING_ATTRIBUTE_STRIKETHROUGH)

        /**
         * Get the GType of EditorTypingAttributes
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_editor_typing_attributes_get_type()
    }
}
