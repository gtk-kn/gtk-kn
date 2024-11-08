// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpDiscreteAxis

/**
 * The `XdpDiscreteAxis` enumeration is used to describe
 * the discrete scroll axes.
 */
public enum class DiscreteAxis(
    public val nativeValue: XdpDiscreteAxis,
) {
    /**
     * the horizontal scroll axis
     */
    HORIZONTAL_SCROLL(XdpDiscreteAxis.XDP_AXIS_HORIZONTAL_SCROLL),

    /**
     * the horizontal scroll axis
     */
    VERTICAL_SCROLL(XdpDiscreteAxis.XDP_AXIS_VERTICAL_SCROLL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpDiscreteAxis): DiscreteAxis =
            when (nativeValue) {
                XdpDiscreteAxis.XDP_AXIS_HORIZONTAL_SCROLL -> HORIZONTAL_SCROLL
                XdpDiscreteAxis.XDP_AXIS_VERTICAL_SCROLL -> VERTICAL_SCROLL
                else -> error("invalid nativeValue")
            }
    }
}
