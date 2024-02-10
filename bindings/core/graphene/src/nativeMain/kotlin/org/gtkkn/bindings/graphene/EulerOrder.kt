// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import org.gtkkn.native.graphene.graphene_euler_order_t
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_DEFAULT
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXYX
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXYZ
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXZX
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXZY
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYXY
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYXZ
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYZX
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYZY
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZXY
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZXZ
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZYX
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZYZ
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXYX
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXYZ
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXZX
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXZY
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYXY
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYXZ
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYZX
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYZY
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZXY
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZXZ
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZYX
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZYZ
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_XYZ
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_XZY
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_YXZ
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_YZX
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_ZXY
import org.gtkkn.native.graphene.graphene_euler_order_t.GRAPHENE_EULER_ORDER_ZYX

/**
 * Specify the order of the rotations on each axis.
 *
 * The %GRAPHENE_EULER_ORDER_DEFAULT value is special, and is used
 * as an alias for one of the other orders.
 * @since 1.2
 */
public enum class EulerOrder(
    public val nativeValue: graphene_euler_order_t,
) {
    /**
     * Rotate in the default order; the
     *   default order is one of the following enumeration values
     */
    DEFAULT(GRAPHENE_EULER_ORDER_DEFAULT),

    /**
     * Rotate in the X, Y, and Z order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SXYZ
     */
    XYZ(GRAPHENE_EULER_ORDER_XYZ),

    /**
     * Rotate in the Y, Z, and X order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SYZX
     */
    YZX(GRAPHENE_EULER_ORDER_YZX),

    /**
     * Rotate in the Z, X, and Y order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SZXY
     */
    ZXY(GRAPHENE_EULER_ORDER_ZXY),

    /**
     * Rotate in the X, Z, and Y order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SXZY
     */
    XZY(GRAPHENE_EULER_ORDER_XZY),

    /**
     * Rotate in the Y, X, and Z order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SYXZ
     */
    YXZ(GRAPHENE_EULER_ORDER_YXZ),

    /**
     * Rotate in the Z, Y, and X order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SZYX
     */
    ZYX(GRAPHENE_EULER_ORDER_ZYX),

    /**
     * Defines a static rotation along the X, Y, and Z axes (Since: 1.10)
     */
    SXYZ(GRAPHENE_EULER_ORDER_SXYZ),

    /**
     * Defines a static rotation along the X, Y, and X axes (Since: 1.10)
     */
    SXYX(GRAPHENE_EULER_ORDER_SXYX),

    /**
     * Defines a static rotation along the X, Z, and Y axes (Since: 1.10)
     */
    SXZY(GRAPHENE_EULER_ORDER_SXZY),

    /**
     * Defines a static rotation along the X, Z, and X axes (Since: 1.10)
     */
    SXZX(GRAPHENE_EULER_ORDER_SXZX),

    /**
     * Defines a static rotation along the Y, Z, and X axes (Since: 1.10)
     */
    SYZX(GRAPHENE_EULER_ORDER_SYZX),

    /**
     * Defines a static rotation along the Y, Z, and Y axes (Since: 1.10)
     */
    SYZY(GRAPHENE_EULER_ORDER_SYZY),

    /**
     * Defines a static rotation along the Y, X, and Z axes (Since: 1.10)
     */
    SYXZ(GRAPHENE_EULER_ORDER_SYXZ),

    /**
     * Defines a static rotation along the Y, X, and Y axes (Since: 1.10)
     */
    SYXY(GRAPHENE_EULER_ORDER_SYXY),

    /**
     * Defines a static rotation along the Z, X, and Y axes (Since: 1.10)
     */
    SZXY(GRAPHENE_EULER_ORDER_SZXY),

    /**
     * Defines a static rotation along the Z, X, and Z axes (Since: 1.10)
     */
    SZXZ(GRAPHENE_EULER_ORDER_SZXZ),

    /**
     * Defines a static rotation along the Z, Y, and X axes (Since: 1.10)
     */
    SZYX(GRAPHENE_EULER_ORDER_SZYX),

    /**
     * Defines a static rotation along the Z, Y, and Z axes (Since: 1.10)
     */
    SZYZ(GRAPHENE_EULER_ORDER_SZYZ),

    /**
     * Defines a relative rotation along the Z, Y, and X axes (Since: 1.10)
     */
    RZYX(GRAPHENE_EULER_ORDER_RZYX),

    /**
     * Defines a relative rotation along the X, Y, and X axes (Since: 1.10)
     */
    RXYX(GRAPHENE_EULER_ORDER_RXYX),

    /**
     * Defines a relative rotation along the Y, Z, and X axes (Since: 1.10)
     */
    RYZX(GRAPHENE_EULER_ORDER_RYZX),

    /**
     * Defines a relative rotation along the X, Z, and X axes (Since: 1.10)
     */
    RXZX(GRAPHENE_EULER_ORDER_RXZX),

    /**
     * Defines a relative rotation along the X, Z, and Y axes (Since: 1.10)
     */
    RXZY(GRAPHENE_EULER_ORDER_RXZY),

    /**
     * Defines a relative rotation along the Y, Z, and Y axes (Since: 1.10)
     */
    RYZY(GRAPHENE_EULER_ORDER_RYZY),

    /**
     * Defines a relative rotation along the Z, X, and Y axes (Since: 1.10)
     */
    RZXY(GRAPHENE_EULER_ORDER_RZXY),

    /**
     * Defines a relative rotation along the Y, X, and Y axes (Since: 1.10)
     */
    RYXY(GRAPHENE_EULER_ORDER_RYXY),

    /**
     * Defines a relative rotation along the Y, X, and Z axes (Since: 1.10)
     */
    RYXZ(GRAPHENE_EULER_ORDER_RYXZ),

    /**
     * Defines a relative rotation along the Z, X, and Z axes (Since: 1.10)
     */
    RZXZ(GRAPHENE_EULER_ORDER_RZXZ),

    /**
     * Defines a relative rotation along the X, Y, and Z axes (Since: 1.10)
     */
    RXYZ(GRAPHENE_EULER_ORDER_RXYZ),

    /**
     * Defines a relative rotation along the Z, Y, and Z axes (Since: 1.10)
     */
    RZYZ(GRAPHENE_EULER_ORDER_RZYZ),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: graphene_euler_order_t): EulerOrder =
            when (nativeValue) {
                GRAPHENE_EULER_ORDER_DEFAULT -> DEFAULT
                GRAPHENE_EULER_ORDER_XYZ -> XYZ
                GRAPHENE_EULER_ORDER_YZX -> YZX
                GRAPHENE_EULER_ORDER_ZXY -> ZXY
                GRAPHENE_EULER_ORDER_XZY -> XZY
                GRAPHENE_EULER_ORDER_YXZ -> YXZ
                GRAPHENE_EULER_ORDER_ZYX -> ZYX
                GRAPHENE_EULER_ORDER_SXYZ -> SXYZ
                GRAPHENE_EULER_ORDER_SXYX -> SXYX
                GRAPHENE_EULER_ORDER_SXZY -> SXZY
                GRAPHENE_EULER_ORDER_SXZX -> SXZX
                GRAPHENE_EULER_ORDER_SYZX -> SYZX
                GRAPHENE_EULER_ORDER_SYZY -> SYZY
                GRAPHENE_EULER_ORDER_SYXZ -> SYXZ
                GRAPHENE_EULER_ORDER_SYXY -> SYXY
                GRAPHENE_EULER_ORDER_SZXY -> SZXY
                GRAPHENE_EULER_ORDER_SZXZ -> SZXZ
                GRAPHENE_EULER_ORDER_SZYX -> SZYX
                GRAPHENE_EULER_ORDER_SZYZ -> SZYZ
                GRAPHENE_EULER_ORDER_RZYX -> RZYX
                GRAPHENE_EULER_ORDER_RXYX -> RXYX
                GRAPHENE_EULER_ORDER_RYZX -> RYZX
                GRAPHENE_EULER_ORDER_RXZX -> RXZX
                GRAPHENE_EULER_ORDER_RXZY -> RXZY
                GRAPHENE_EULER_ORDER_RYZY -> RYZY
                GRAPHENE_EULER_ORDER_RZXY -> RZXY
                GRAPHENE_EULER_ORDER_RYXY -> RYXY
                GRAPHENE_EULER_ORDER_RYXZ -> RYXZ
                GRAPHENE_EULER_ORDER_RZXZ -> RZXZ
                GRAPHENE_EULER_ORDER_RXYZ -> RXYZ
                GRAPHENE_EULER_ORDER_RZYZ -> RZYZ
                else -> error("invalid nativeValue")
            }
    }
}
