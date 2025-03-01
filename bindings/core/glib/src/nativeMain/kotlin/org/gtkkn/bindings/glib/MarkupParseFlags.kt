// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GMarkupParseFlags
import org.gtkkn.native.glib.G_MARKUP_DEFAULT_FLAGS
import org.gtkkn.native.glib.G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG
import org.gtkkn.native.glib.G_MARKUP_IGNORE_QUALIFIED
import org.gtkkn.native.glib.G_MARKUP_PREFIX_ERROR_POSITION
import org.gtkkn.native.glib.G_MARKUP_TREAT_CDATA_AS_TEXT

/**
 * Flags that affect the behaviour of the parser.
 */
public class MarkupParseFlags(public val mask: GMarkupParseFlags) : Bitfield<MarkupParseFlags> {
    override infix fun or(other: MarkupParseFlags): MarkupParseFlags = MarkupParseFlags(mask or other.mask)

    public companion object {
        /**
         * No special behaviour. Since: 2.74
         */
        public val DEFAULT_FLAGS: MarkupParseFlags = MarkupParseFlags(G_MARKUP_DEFAULT_FLAGS)

        /**
         * flag you should not use
         */
        public val DO_NOT_USE_THIS_UNSUPPORTED_FLAG: MarkupParseFlags =
            MarkupParseFlags(G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG)

        /**
         * When this flag is set, CDATA marked
         *     sections are not passed literally to the @passthrough function of
         *     the parser. Instead, the content of the section (without the
         *     `<![CDATA[` and `]]>`) is
         *     passed to the @text function. This flag was added in GLib 2.12
         */
        public val TREAT_CDATA_AS_TEXT: MarkupParseFlags =
            MarkupParseFlags(G_MARKUP_TREAT_CDATA_AS_TEXT)

        /**
         * Normally errors caught by GMarkup
         *     itself have line/column information prefixed to them to let the
         *     caller know the location of the error. When this flag is set the
         *     location information is also prefixed to errors generated by the
         *     #GMarkupParser implementation functions
         */
        public val PREFIX_ERROR_POSITION: MarkupParseFlags =
            MarkupParseFlags(G_MARKUP_PREFIX_ERROR_POSITION)

        /**
         * Ignore (don't report) qualified
         *     attributes and tags, along with their contents.  A qualified
         *     attribute or tag is one that contains ':' in its name (ie: is in
         *     another namespace).  Since: 2.40.
         */
        public val IGNORE_QUALIFIED: MarkupParseFlags = MarkupParseFlags(G_MARKUP_IGNORE_QUALIFIED)
    }
}
