// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_2
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_PIXBUF_FORMAT_SCALABLE
import org.gtkkn.native.gdk.GDK_PIXBUF_FORMAT_THREADSAFE
import org.gtkkn.native.gdk.GDK_PIXBUF_FORMAT_WRITABLE
import org.gtkkn.native.gdk.GdkPixbufFormatFlags

/**
 * Flags which allow a module to specify further details about the supported
 * operations.
 * @since 2.2
 */
public class PixbufFormatFlags(public val mask: GdkPixbufFormatFlags) : Bitfield<PixbufFormatFlags> {
    override infix fun or(other: PixbufFormatFlags): PixbufFormatFlags = PixbufFormatFlags(mask or other.mask)

    @GdkPixbufVersion2_2
    public companion object {
        /**
         * the module can write out images in the format.
         */
        public val WRITABLE: PixbufFormatFlags = PixbufFormatFlags(GDK_PIXBUF_FORMAT_WRITABLE)

        /**
         * the image format is scalable
         */
        public val SCALABLE: PixbufFormatFlags = PixbufFormatFlags(GDK_PIXBUF_FORMAT_SCALABLE)

        /**
         * the module is threadsafe. gdk-pixbuf
         *     ignores modules that are not marked as threadsafe. (Since 2.28).
         */
        public val THREADSAFE: PixbufFormatFlags = PixbufFormatFlags(GDK_PIXBUF_FORMAT_THREADSAFE)
    }
}
