// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GIOFlags
import org.gtkkn.native.glib.G_IO_FLAG_APPEND
import org.gtkkn.native.glib.G_IO_FLAG_GET_MASK
import org.gtkkn.native.glib.G_IO_FLAG_IS_READABLE
import org.gtkkn.native.glib.G_IO_FLAG_IS_SEEKABLE
import org.gtkkn.native.glib.G_IO_FLAG_IS_WRITABLE
import org.gtkkn.native.glib.G_IO_FLAG_IS_WRITEABLE
import org.gtkkn.native.glib.G_IO_FLAG_MASK
import org.gtkkn.native.glib.G_IO_FLAG_NONBLOCK
import org.gtkkn.native.glib.G_IO_FLAG_SET_MASK

/**
 * Specifies properties of a #GIOChannel. Some of the flags can only be
 * read with g_io_channel_get_flags(), but not changed with
 * g_io_channel_set_flags().
 */
public class IOFlags(
    public val mask: GIOFlags,
) : Bitfield<IOFlags> {
    override infix fun or(other: IOFlags): IOFlags = IOFlags(mask or other.mask)

    public companion object {
        /**
         * turns on append mode, corresponds to %O_APPEND
         *     (see the documentation of the UNIX open() syscall)
         */
        public val APPEND: IOFlags = IOFlags(G_IO_FLAG_APPEND)

        /**
         * turns on nonblocking mode, corresponds to
         *     %O_NONBLOCK/%O_NDELAY (see the documentation of the UNIX open()
         *     syscall)
         */
        public val NONBLOCK: IOFlags = IOFlags(G_IO_FLAG_NONBLOCK)

        /**
         * indicates that the io channel is readable.
         *     This flag cannot be changed.
         */
        public val IS_READABLE: IOFlags = IOFlags(G_IO_FLAG_IS_READABLE)

        /**
         * indicates that the io channel is writable.
         *     This flag cannot be changed.
         */
        public val IS_WRITABLE: IOFlags = IOFlags(G_IO_FLAG_IS_WRITABLE)

        /**
         * a misspelled version of @G_IO_FLAG_IS_WRITABLE
         *     that existed before the spelling was fixed in GLib 2.30. It is kept
         *     here for compatibility reasons. Deprecated since 2.30
         */
        public val IS_WRITEABLE: IOFlags = IOFlags(G_IO_FLAG_IS_WRITEABLE)

        /**
         * indicates that the io channel is seekable,
         *     i.e. that g_io_channel_seek_position() can be used on it.
         *     This flag cannot be changed.
         */
        public val IS_SEEKABLE: IOFlags = IOFlags(G_IO_FLAG_IS_SEEKABLE)

        /**
         * the mask that specifies all the valid flags.
         */
        public val MASK: IOFlags = IOFlags(G_IO_FLAG_MASK)

        /**
         * the mask of the flags that are returned from
         *     g_io_channel_get_flags()
         */
        public val GET_MASK: IOFlags = IOFlags(G_IO_FLAG_GET_MASK)

        /**
         * the mask of the flags that the user can modify
         *     with g_io_channel_set_flags()
         */
        public val SET_MASK: IOFlags = IOFlags(G_IO_FLAG_SET_MASK)
    }
}
