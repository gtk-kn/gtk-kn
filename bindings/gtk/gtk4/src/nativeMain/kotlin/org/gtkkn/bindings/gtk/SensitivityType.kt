// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSensitivityType
import org.gtkkn.native.gtk.gtk_sensitivity_type_get_type

/**
 * Determines how GTK handles the sensitivity of various controls,
 * such as combo box buttons.
 */
public enum class SensitivityType(public val nativeValue: GtkSensitivityType) {
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
        public fun fromNativeValue(nativeValue: GtkSensitivityType): SensitivityType = when (nativeValue) {
            GtkSensitivityType.GTK_SENSITIVITY_AUTO -> AUTO
            GtkSensitivityType.GTK_SENSITIVITY_ON -> ON
            GtkSensitivityType.GTK_SENSITIVITY_OFF -> OFF
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SensitivityType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_sensitivity_type_get_type()
    }
}
