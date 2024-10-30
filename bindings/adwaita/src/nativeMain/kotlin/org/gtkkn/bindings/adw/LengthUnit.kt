// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Settings
import org.gtkkn.native.adw.AdwLengthUnit
import org.gtkkn.native.adw.AdwLengthUnit.ADW_LENGTH_UNIT_PT
import org.gtkkn.native.adw.AdwLengthUnit.ADW_LENGTH_UNIT_PX
import org.gtkkn.native.adw.AdwLengthUnit.ADW_LENGTH_UNIT_SP
import org.gtkkn.native.adw.adw_length_unit_from_px
import org.gtkkn.native.adw.adw_length_unit_to_px
import kotlin.Double

/**
 * Describes length units.
 *
 * | Unit | Regular Text | Large Text |
 * | ---- | ------------ | ---------- |
 * | 1px  | 1px          | 1px        |
 * | 1pt  | 1.333333px   | 1.666667px |
 * | 1sp  | 1px          | 1.25px     |
 *
 * New values may be added to this enumeration over time.
 * @since 1.4
 */
public enum class LengthUnit(
    public val nativeValue: AdwLengthUnit,
) {
    /**
     * pixels
     */
    PX(ADW_LENGTH_UNIT_PX),

    /**
     * points, changes with text scale factor
     */
    PT(ADW_LENGTH_UNIT_PT),

    /**
     * scale independent pixels, changes with text scale factor
     */
    SP(ADW_LENGTH_UNIT_SP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwLengthUnit): LengthUnit =
            when (nativeValue) {
                ADW_LENGTH_UNIT_PX -> PX
                ADW_LENGTH_UNIT_PT -> PT
                ADW_LENGTH_UNIT_SP -> SP
                else -> error("invalid nativeValue")
            }

        /**
         * Converts @value from pixels to @unit.
         *
         * @param unit a length unit
         * @param value a value in pixels
         * @param settings settings to use, or `NULL` for default settings
         * @return the length in @unit
         * @since 1.4
         */
        public fun fromPx(
            unit: LengthUnit,
            `value`: Double,
            settings: Settings? = null,
        ): Double = adw_length_unit_from_px(unit.nativeValue, `value`, settings?.gtkSettingsPointer?.reinterpret())

        /**
         * Converts @value from @unit to pixels.
         *
         * @param unit a length unit
         * @param value a value in @unit
         * @param settings settings to use, or `NULL` for default settings
         * @return the length in pixels
         * @since 1.4
         */
        public fun toPx(
            unit: LengthUnit,
            `value`: Double,
            settings: Settings? = null,
        ): Double = adw_length_unit_to_px(unit.nativeValue, `value`, settings?.gtkSettingsPointer?.reinterpret())
    }
}
