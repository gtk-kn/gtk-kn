// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GIOCondition
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.G_IO_ERR
import org.gtkkn.native.gobject.G_IO_HUP
import org.gtkkn.native.gobject.G_IO_IN
import org.gtkkn.native.gobject.G_IO_NVAL
import org.gtkkn.native.gobject.G_IO_OUT
import org.gtkkn.native.gobject.G_IO_PRI
import org.gtkkn.native.gobject.g_io_condition_get_type

public class IOCondition(public val mask: GIOCondition) : Bitfield<IOCondition> {
    override infix fun or(other: IOCondition): IOCondition = IOCondition(mask or other.mask)

    public companion object {
        public val IN: IOCondition = IOCondition(G_IO_IN)

        public val OUT: IOCondition = IOCondition(G_IO_OUT)

        public val PRI: IOCondition = IOCondition(G_IO_PRI)

        public val ERR: IOCondition = IOCondition(G_IO_ERR)

        public val HUP: IOCondition = IOCondition(G_IO_HUP)

        public val NVAL: IOCondition = IOCondition(G_IO_NVAL)

        /**
         * Get the GType of IOCondition
         *
         * @return the GType
         */
        public fun getType(): GType = g_io_condition_get_type()
    }
}
