// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Settings
import org.gtkkn.native.adw.AdwLengthUnit
import org.gtkkn.native.adw.adw_length_unit_from_px
import org.gtkkn.native.adw.adw_length_unit_get_type
import org.gtkkn.native.adw.adw_length_unit_to_px
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType

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
@AdwVersion1_4
public enum class LengthUnit(public val nativeValue: AdwLengthUnit) {
    /**
     * pixels
     */
    PX(AdwLengthUnit.ADW_LENGTH_UNIT_PX),

    /**
     * points, changes with text scale factor
     */
    PT(AdwLengthUnit.ADW_LENGTH_UNIT_PT),

    /**
     * scale independent pixels, changes with text scale factor
     */
    SP(AdwLengthUnit.ADW_LENGTH_UNIT_SP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwLengthUnit): LengthUnit = when (nativeValue) {
            AdwLengthUnit.ADW_LENGTH_UNIT_PX -> PX
            AdwLengthUnit.ADW_LENGTH_UNIT_PT -> PT
            AdwLengthUnit.ADW_LENGTH_UNIT_SP -> SP
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
        @AdwVersion1_4
        public fun fromPx(unit: LengthUnit, `value`: gdouble, settings: Settings? = null): gdouble =
            adw_length_unit_from_px(unit.nativeValue, `value`, settings?.gtkSettingsPointer)

        /**
         * Converts @value from @unit to pixels.
         *
         * @param unit a length unit
         * @param value a value in @unit
         * @param settings settings to use, or `NULL` for default settings
         * @return the length in pixels
         * @since 1.4
         */
        @AdwVersion1_4
        public fun toPx(unit: LengthUnit, `value`: gdouble, settings: Settings? = null): gdouble =
            adw_length_unit_to_px(unit.nativeValue, `value`, settings?.gtkSettingsPointer)

        /**
         * Get the GType of LengthUnit
         *
         * @return the GType
         */
        public fun getType(): GType = adw_length_unit_get_type()
    }
}
