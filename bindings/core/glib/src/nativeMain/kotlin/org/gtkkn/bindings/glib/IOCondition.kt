// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GIOCondition
import org.gtkkn.native.glib.G_IO_ERR
import org.gtkkn.native.glib.G_IO_HUP
import org.gtkkn.native.glib.G_IO_IN
import org.gtkkn.native.glib.G_IO_NVAL
import org.gtkkn.native.glib.G_IO_OUT
import org.gtkkn.native.glib.G_IO_PRI
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_io_condition_get_type

/**
 * A bitwise combination representing a condition to watch for on an
 * event source.
 */
public class IOCondition(public val mask: GIOCondition) : Bitfield<IOCondition> {
    override infix fun or(other: IOCondition): IOCondition = IOCondition(mask or other.mask)

    public companion object {
        /**
         * There is data to read.
         */
        public val IN: IOCondition = IOCondition(G_IO_IN)

        /**
         * Data can be written (without blocking).
         */
        public val OUT: IOCondition = IOCondition(G_IO_OUT)

        /**
         * There is urgent data to read.
         */
        public val PRI: IOCondition = IOCondition(G_IO_PRI)

        /**
         * Error condition.
         */
        public val ERR: IOCondition = IOCondition(G_IO_ERR)

        /**
         * Hung up (the connection has been broken, usually for
         *            pipes and sockets).
         */
        public val HUP: IOCondition = IOCondition(G_IO_HUP)

        /**
         * Invalid request. The file descriptor is not open.
         */
        public val NVAL: IOCondition = IOCondition(G_IO_NVAL)

        /**
         * Get the GType of IOCondition
         *
         * @return the GType
         */
        public fun getType(): GType = g_io_condition_get_type()
    }
}
