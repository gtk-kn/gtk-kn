// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.native.gio.GBusType
import org.gtkkn.native.gio.GBusType.G_BUS_TYPE_NONE
import org.gtkkn.native.gio.GBusType.G_BUS_TYPE_SESSION
import org.gtkkn.native.gio.GBusType.G_BUS_TYPE_STARTER
import org.gtkkn.native.gio.GBusType.G_BUS_TYPE_SYSTEM

/**
 * An enumeration for well-known message buses.
 * @since 2.26
 */
@GioVersion2_26
public enum class BusType(
    public val nativeValue: GBusType,
) {
    /**
     * An alias for the message bus that activated the process, if any.
     */
    STARTER(G_BUS_TYPE_STARTER),

    /**
     * Not a message bus.
     */
    NONE(G_BUS_TYPE_NONE),

    /**
     * The system-wide message bus.
     */
    SYSTEM(G_BUS_TYPE_SYSTEM),

    /**
     * The login session message bus.
     */
    SESSION(G_BUS_TYPE_SESSION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GBusType): BusType =
            when (nativeValue) {
                G_BUS_TYPE_STARTER -> STARTER
                G_BUS_TYPE_NONE -> NONE
                G_BUS_TYPE_SYSTEM -> SYSTEM
                G_BUS_TYPE_SESSION -> SESSION
                else -> error("invalid nativeValue")
            }
    }
}
