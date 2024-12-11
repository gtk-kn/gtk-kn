// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.native.gio.GBusType
import org.gtkkn.native.gio.g_bus_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * An enumeration for well-known message buses.
 * @since 2.26
 */
@GioVersion2_26
public enum class BusType(public val nativeValue: GBusType) {
    /**
     * An alias for the message bus that activated the process, if any.
     */
    STARTER(GBusType.G_BUS_TYPE_STARTER),

    /**
     * Not a message bus.
     */
    NONE(GBusType.G_BUS_TYPE_NONE),

    /**
     * The system-wide message bus.
     */
    SYSTEM(GBusType.G_BUS_TYPE_SYSTEM),

    /**
     * The login session message bus.
     */
    SESSION(GBusType.G_BUS_TYPE_SESSION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GBusType): BusType = when (nativeValue) {
            GBusType.G_BUS_TYPE_STARTER -> STARTER
            GBusType.G_BUS_TYPE_NONE -> NONE
            GBusType.G_BUS_TYPE_SYSTEM -> SYSTEM
            GBusType.G_BUS_TYPE_SESSION -> SESSION
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of BusType
         *
         * @return the GType
         */
        public fun getType(): GType = g_bus_type_get_type()
    }
}
