// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSensitivityType
import org.gtkkn.native.gtk.GtkSensitivityType.GTK_SENSITIVITY_AUTO
import org.gtkkn.native.gtk.GtkSensitivityType.GTK_SENSITIVITY_OFF
import org.gtkkn.native.gtk.GtkSensitivityType.GTK_SENSITIVITY_ON

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
    AUTO(GTK_SENSITIVITY_AUTO),

    /**
     * The control is always sensitive
     */
    ON(GTK_SENSITIVITY_ON),

    /**
     * The control is always insensitive
     */
    OFF(GTK_SENSITIVITY_OFF),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSensitivityType): SensitivityType =
            when (nativeValue) {
                GTK_SENSITIVITY_AUTO -> AUTO
                GTK_SENSITIVITY_ON -> ON
                GTK_SENSITIVITY_OFF -> OFF
                else -> error("invalid nativeValue")
            }
    }
}
