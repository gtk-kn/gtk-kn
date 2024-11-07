// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSensitivityType

/**
 * Determines how GTK handles the sensitivity of various controls,
 * such as combo box buttons.
 */
public enum class SensitivityType(
    public val nativeValue: GtkSensitivityType,
) {
    /**
     * The control is made insensitive if no
     *   action can be triggered
     */
    AUTO(GtkSensitivityType.GTK_SENSITIVITY_AUTO),

    /**
     * The control is always sensitive
     */
    ON(GtkSensitivityType.GTK_SENSITIVITY_ON),

    /**
     * The control is always insensitive
     */
    OFF(GtkSensitivityType.GTK_SENSITIVITY_OFF),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSensitivityType): SensitivityType =
            when (nativeValue) {
                GtkSensitivityType.GTK_SENSITIVITY_AUTO -> AUTO
                GtkSensitivityType.GTK_SENSITIVITY_ON -> ON
                GtkSensitivityType.GTK_SENSITIVITY_OFF -> OFF
                else -> error("invalid nativeValue")
            }
    }
}
