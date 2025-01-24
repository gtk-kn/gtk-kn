// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.graphene

import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_2
import org.gtkkn.native.graphene.graphene_euler_order_t

/**
 * Specify the order of the rotations on each axis.
 *
 * The %GRAPHENE_EULER_ORDER_DEFAULT value is special, and is used
 * as an alias for one of the other orders.
 * @since 1.2
 */
@GrapheneVersion1_2
public enum class EulerOrder(public val nativeValue: graphene_euler_order_t) {
    /**
     * Rotate in the default order; the
     *   default order is one of the following enumeration values
     */
    DEFAULT(graphene_euler_order_t.GRAPHENE_EULER_ORDER_DEFAULT),

    /**
     * Rotate in the X, Y, and Z order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SXYZ
     */
    XYZ(graphene_euler_order_t.GRAPHENE_EULER_ORDER_XYZ),

    /**
     * Rotate in the Y, Z, and X order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SYZX
     */
    YZX(graphene_euler_order_t.GRAPHENE_EULER_ORDER_YZX),

    /**
     * Rotate in the Z, X, and Y order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SZXY
     */
    ZXY(graphene_euler_order_t.GRAPHENE_EULER_ORDER_ZXY),

    /**
     * Rotate in the X, Z, and Y order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SXZY
     */
    XZY(graphene_euler_order_t.GRAPHENE_EULER_ORDER_XZY),

    /**
     * Rotate in the Y, X, and Z order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SYXZ
     */
    YXZ(graphene_euler_order_t.GRAPHENE_EULER_ORDER_YXZ),

    /**
     * Rotate in the Z, Y, and X order. Deprecated in
     *   Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SZYX
     */
    ZYX(graphene_euler_order_t.GRAPHENE_EULER_ORDER_ZYX),

    /**
     * Defines a static rotation along the X, Y, and Z axes (Since: 1.10)
     */
    SXYZ(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXYZ),

    /**
     * Defines a static rotation along the X, Y, and X axes (Since: 1.10)
     */
    SXYX(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXYX),

    /**
     * Defines a static rotation along the X, Z, and Y axes (Since: 1.10)
     */
    SXZY(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXZY),

    /**
     * Defines a static rotation along the X, Z, and X axes (Since: 1.10)
     */
    SXZX(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXZX),

    /**
     * Defines a static rotation along the Y, Z, and X axes (Since: 1.10)
     */
    SYZX(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYZX),

    /**
     * Defines a static rotation along the Y, Z, and Y axes (Since: 1.10)
     */
    SYZY(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYZY),

    /**
     * Defines a static rotation along the Y, X, and Z axes (Since: 1.10)
     */
    SYXZ(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYXZ),

    /**
     * Defines a static rotation along the Y, X, and Y axes (Since: 1.10)
     */
    SYXY(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYXY),

    /**
     * Defines a static rotation along the Z, X, and Y axes (Since: 1.10)
     */
    SZXY(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZXY),

    /**
     * Defines a static rotation along the Z, X, and Z axes (Since: 1.10)
     */
    SZXZ(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZXZ),

    /**
     * Defines a static rotation along the Z, Y, and X axes (Since: 1.10)
     */
    SZYX(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZYX),

    /**
     * Defines a static rotation along the Z, Y, and Z axes (Since: 1.10)
     */
    SZYZ(graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZYZ),

    /**
     * Defines a relative rotation along the Z, Y, and X axes (Since: 1.10)
     */
    RZYX(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZYX),

    /**
     * Defines a relative rotation along the X, Y, and X axes (Since: 1.10)
     */
    RXYX(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXYX),

    /**
     * Defines a relative rotation along the Y, Z, and X axes (Since: 1.10)
     */
    RYZX(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYZX),

    /**
     * Defines a relative rotation along the X, Z, and X axes (Since: 1.10)
     */
    RXZX(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXZX),

    /**
     * Defines a relative rotation along the X, Z, and Y axes (Since: 1.10)
     */
    RXZY(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXZY),

    /**
     * Defines a relative rotation along the Y, Z, and Y axes (Since: 1.10)
     */
    RYZY(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYZY),

    /**
     * Defines a relative rotation along the Z, X, and Y axes (Since: 1.10)
     */
    RZXY(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZXY),

    /**
     * Defines a relative rotation along the Y, X, and Y axes (Since: 1.10)
     */
    RYXY(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYXY),

    /**
     * Defines a relative rotation along the Y, X, and Z axes (Since: 1.10)
     */
    RYXZ(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYXZ),

    /**
     * Defines a relative rotation along the Z, X, and Z axes (Since: 1.10)
     */
    RZXZ(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZXZ),

    /**
     * Defines a relative rotation along the X, Y, and Z axes (Since: 1.10)
     */
    RXYZ(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXYZ),

    /**
     * Defines a relative rotation along the Z, Y, and Z axes (Since: 1.10)
     */
    RZYZ(graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZYZ),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: graphene_euler_order_t): EulerOrder = when (nativeValue) {
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_DEFAULT -> DEFAULT
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_XYZ -> XYZ
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_YZX -> YZX
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_ZXY -> ZXY
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_XZY -> XZY
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_YXZ -> YXZ
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_ZYX -> ZYX
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXYZ -> SXYZ
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXYX -> SXYX
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXZY -> SXZY
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SXZX -> SXZX
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYZX -> SYZX
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYZY -> SYZY
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYXZ -> SYXZ
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SYXY -> SYXY
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZXY -> SZXY
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZXZ -> SZXZ
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZYX -> SZYX
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_SZYZ -> SZYZ
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZYX -> RZYX
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXYX -> RXYX
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYZX -> RYZX
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXZX -> RXZX
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXZY -> RXZY
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYZY -> RYZY
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZXY -> RZXY
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYXY -> RYXY
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RYXZ -> RYXZ
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZXZ -> RZXZ
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RXYZ -> RXYZ
            graphene_euler_order_t.GRAPHENE_EULER_ORDER_RZYZ -> RZYZ
            else -> error("invalid nativeValue")
        }
    }
}
