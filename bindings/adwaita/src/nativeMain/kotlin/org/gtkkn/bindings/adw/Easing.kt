// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwEasing
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_BACK
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_BOUNCE
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_CIRC
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_CUBIC
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_ELASTIC
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_EXPO
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_OUT_BACK
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_OUT_BOUNCE
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_OUT_CIRC
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_OUT_CUBIC
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_OUT_ELASTIC
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_OUT_EXPO
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_OUT_QUAD
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_OUT_QUART
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_OUT_QUINT
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_OUT_SINE
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_QUAD
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_QUART
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_QUINT
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_IN_SINE
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_OUT_BACK
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_OUT_BOUNCE
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_OUT_CIRC
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_OUT_CUBIC
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_OUT_ELASTIC
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_OUT_EXPO
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_OUT_QUAD
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_OUT_QUART
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_OUT_QUINT
import org.gtkkn.native.adw.AdwEasing.ADW_EASE_OUT_SINE
import org.gtkkn.native.adw.AdwEasing.ADW_LINEAR
import org.gtkkn.native.adw.adw_easing_ease
import kotlin.Double

/**
 * Describes the available easing functions for use with
 * [class@TimedAnimation].
 *
 * New values may be added to this enumeration over time.
 * @since 1.0
 */
public enum class Easing(
    public val nativeValue: AdwEasing,
) {
    /**
     * Linear tweening.
     */
    LINEAR(ADW_LINEAR),

    /**
     * Quadratic tweening.
     */
    EASE_IN_QUAD(ADW_EASE_IN_QUAD),

    /**
     * Quadratic tweening, inverse of `ADW_EASE_IN_QUAD`.
     */
    EASE_OUT_QUAD(ADW_EASE_OUT_QUAD),

    /**
     * Quadratic tweening, combining `ADW_EASE_IN_QUAD` and
     *   `ADW_EASE_OUT_QUAD`.
     */
    EASE_IN_OUT_QUAD(ADW_EASE_IN_OUT_QUAD),

    /**
     * Cubic tweening.
     */
    EASE_IN_CUBIC(ADW_EASE_IN_CUBIC),

    /**
     * Cubic tweening, inverse of `ADW_EASE_IN_CUBIC`.
     */
    EASE_OUT_CUBIC(ADW_EASE_OUT_CUBIC),

    /**
     * Cubic tweening, combining `ADW_EASE_IN_CUBIC` and
     *   `ADW_EASE_OUT_CUBIC`.
     */
    EASE_IN_OUT_CUBIC(ADW_EASE_IN_OUT_CUBIC),

    /**
     * Quartic tweening.
     */
    EASE_IN_QUART(ADW_EASE_IN_QUART),

    /**
     * Quartic tweening, inverse of `ADW_EASE_IN_QUART`.
     */
    EASE_OUT_QUART(ADW_EASE_OUT_QUART),

    /**
     * Quartic tweening, combining `ADW_EASE_IN_QUART` and
     *   `ADW_EASE_OUT_QUART`.
     */
    EASE_IN_OUT_QUART(ADW_EASE_IN_OUT_QUART),

    /**
     * Quintic tweening.
     */
    EASE_IN_QUINT(ADW_EASE_IN_QUINT),

    /**
     * Quintic tweening, inverse of `ADW_EASE_IN_QUINT`.
     */
    EASE_OUT_QUINT(ADW_EASE_OUT_QUINT),

    /**
     * Quintic tweening, combining `ADW_EASE_IN_QUINT` and
     *   `ADW_EASE_OUT_QUINT`.
     */
    EASE_IN_OUT_QUINT(ADW_EASE_IN_OUT_QUINT),

    /**
     * Sine wave tweening.
     */
    EASE_IN_SINE(ADW_EASE_IN_SINE),

    /**
     * Sine wave tweening, inverse of `ADW_EASE_IN_SINE`.
     */
    EASE_OUT_SINE(ADW_EASE_OUT_SINE),

    /**
     * Sine wave tweening, combining `ADW_EASE_IN_SINE` and
     *   `ADW_EASE_OUT_SINE`.
     */
    EASE_IN_OUT_SINE(ADW_EASE_IN_OUT_SINE),

    /**
     * Exponential tweening.
     */
    EASE_IN_EXPO(ADW_EASE_IN_EXPO),

    /**
     * Exponential tweening, inverse of `ADW_EASE_IN_EXPO`.
     */
    EASE_OUT_EXPO(ADW_EASE_OUT_EXPO),

    /**
     * Exponential tweening, combining `ADW_EASE_IN_EXPO` and
     *   `ADW_EASE_OUT_EXPO`.
     */
    EASE_IN_OUT_EXPO(ADW_EASE_IN_OUT_EXPO),

    /**
     * Circular tweening.
     */
    EASE_IN_CIRC(ADW_EASE_IN_CIRC),

    /**
     * Circular tweening, inverse of `ADW_EASE_IN_CIRC`.
     */
    EASE_OUT_CIRC(ADW_EASE_OUT_CIRC),

    /**
     * Circular tweening, combining `ADW_EASE_IN_CIRC` and
     *   `ADW_EASE_OUT_CIRC`.
     */
    EASE_IN_OUT_CIRC(ADW_EASE_IN_OUT_CIRC),

    /**
     * Elastic tweening, with offshoot on start.
     */
    EASE_IN_ELASTIC(ADW_EASE_IN_ELASTIC),

    /**
     * Elastic tweening, with offshoot on end, inverse of
     *   `ADW_EASE_IN_ELASTIC`.
     */
    EASE_OUT_ELASTIC(ADW_EASE_OUT_ELASTIC),

    /**
     * Elastic tweening, with offshoot on both ends,
     *   combining `ADW_EASE_IN_ELASTIC` and `ADW_EASE_OUT_ELASTIC`.
     */
    EASE_IN_OUT_ELASTIC(ADW_EASE_IN_OUT_ELASTIC),

    /**
     * Overshooting cubic tweening, with backtracking on start.
     */
    EASE_IN_BACK(ADW_EASE_IN_BACK),

    /**
     * Overshooting cubic tweening, with backtracking on end,
     *   inverse of `ADW_EASE_IN_BACK`.
     */
    EASE_OUT_BACK(ADW_EASE_OUT_BACK),

    /**
     * Overshooting cubic tweening, with backtracking on both
     *   ends, combining `ADW_EASE_IN_BACK` and `ADW_EASE_OUT_BACK`.
     */
    EASE_IN_OUT_BACK(ADW_EASE_IN_OUT_BACK),

    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   on start.
     */
    EASE_IN_BOUNCE(ADW_EASE_IN_BOUNCE),

    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   with bounce on end, inverse of `ADW_EASE_IN_BOUNCE`.
     */
    EASE_OUT_BOUNCE(ADW_EASE_OUT_BOUNCE),

    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   with bounce on both ends, combining `ADW_EASE_IN_BOUNCE` and
     *   `ADW_EASE_OUT_BOUNCE`.
     */
    EASE_IN_OUT_BOUNCE(ADW_EASE_IN_OUT_BOUNCE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwEasing): Easing =
            when (nativeValue) {
                ADW_LINEAR -> LINEAR
                ADW_EASE_IN_QUAD -> EASE_IN_QUAD
                ADW_EASE_OUT_QUAD -> EASE_OUT_QUAD
                ADW_EASE_IN_OUT_QUAD -> EASE_IN_OUT_QUAD
                ADW_EASE_IN_CUBIC -> EASE_IN_CUBIC
                ADW_EASE_OUT_CUBIC -> EASE_OUT_CUBIC
                ADW_EASE_IN_OUT_CUBIC -> EASE_IN_OUT_CUBIC
                ADW_EASE_IN_QUART -> EASE_IN_QUART
                ADW_EASE_OUT_QUART -> EASE_OUT_QUART
                ADW_EASE_IN_OUT_QUART -> EASE_IN_OUT_QUART
                ADW_EASE_IN_QUINT -> EASE_IN_QUINT
                ADW_EASE_OUT_QUINT -> EASE_OUT_QUINT
                ADW_EASE_IN_OUT_QUINT -> EASE_IN_OUT_QUINT
                ADW_EASE_IN_SINE -> EASE_IN_SINE
                ADW_EASE_OUT_SINE -> EASE_OUT_SINE
                ADW_EASE_IN_OUT_SINE -> EASE_IN_OUT_SINE
                ADW_EASE_IN_EXPO -> EASE_IN_EXPO
                ADW_EASE_OUT_EXPO -> EASE_OUT_EXPO
                ADW_EASE_IN_OUT_EXPO -> EASE_IN_OUT_EXPO
                ADW_EASE_IN_CIRC -> EASE_IN_CIRC
                ADW_EASE_OUT_CIRC -> EASE_OUT_CIRC
                ADW_EASE_IN_OUT_CIRC -> EASE_IN_OUT_CIRC
                ADW_EASE_IN_ELASTIC -> EASE_IN_ELASTIC
                ADW_EASE_OUT_ELASTIC -> EASE_OUT_ELASTIC
                ADW_EASE_IN_OUT_ELASTIC -> EASE_IN_OUT_ELASTIC
                ADW_EASE_IN_BACK -> EASE_IN_BACK
                ADW_EASE_OUT_BACK -> EASE_OUT_BACK
                ADW_EASE_IN_OUT_BACK -> EASE_IN_OUT_BACK
                ADW_EASE_IN_BOUNCE -> EASE_IN_BOUNCE
                ADW_EASE_OUT_BOUNCE -> EASE_OUT_BOUNCE
                ADW_EASE_IN_OUT_BOUNCE -> EASE_IN_OUT_BOUNCE
                else -> error("invalid nativeValue")
            }

        /**
         * Computes easing with @easing for @value.
         *
         * @value should generally be in the [0, 1] range.
         *
         * @param self an easing value
         * @param value a value to ease
         * @return the easing for @value
         * @since 1.0
         */
        public fun ease(
            self: Easing,
            `value`: Double,
        ): Double =
            adw_easing_ease(
                self.nativeValue,
                `value`
            )
    }
}
