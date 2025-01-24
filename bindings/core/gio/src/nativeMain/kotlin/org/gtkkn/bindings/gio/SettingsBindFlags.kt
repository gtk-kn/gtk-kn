// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GSettingsBindFlags
import org.gtkkn.native.gio.G_SETTINGS_BIND_DEFAULT
import org.gtkkn.native.gio.G_SETTINGS_BIND_GET
import org.gtkkn.native.gio.G_SETTINGS_BIND_GET_NO_CHANGES
import org.gtkkn.native.gio.G_SETTINGS_BIND_INVERT_BOOLEAN
import org.gtkkn.native.gio.G_SETTINGS_BIND_NO_SENSITIVITY
import org.gtkkn.native.gio.G_SETTINGS_BIND_SET
import org.gtkkn.native.gio.g_settings_bind_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used when creating a binding. These flags determine in which
 * direction the binding works. The default is to synchronize in both
 * directions.
 */
public class SettingsBindFlags(public val mask: GSettingsBindFlags) : Bitfield<SettingsBindFlags> {
    override infix fun or(other: SettingsBindFlags): SettingsBindFlags = SettingsBindFlags(mask or other.mask)

    public companion object {
        /**
         * Equivalent to `G_SETTINGS_BIND_GET|G_SETTINGS_BIND_SET`
         */
        public val DEFAULT: SettingsBindFlags = SettingsBindFlags(G_SETTINGS_BIND_DEFAULT)

        /**
         * Update the #GObject property when the setting changes.
         *     It is an error to use this flag if the property is not writable.
         */
        public val GET: SettingsBindFlags = SettingsBindFlags(G_SETTINGS_BIND_GET)

        /**
         * Update the setting when the #GObject property changes.
         *     It is an error to use this flag if the property is not readable.
         */
        public val SET: SettingsBindFlags = SettingsBindFlags(G_SETTINGS_BIND_SET)

        /**
         * Do not try to bind a "sensitivity" property to the writability of the setting
         */
        public val NO_SENSITIVITY: SettingsBindFlags =
            SettingsBindFlags(G_SETTINGS_BIND_NO_SENSITIVITY)

        /**
         * When set in addition to %G_SETTINGS_BIND_GET, set the #GObject property
         *     value initially from the setting, but do not listen for changes of the setting
         */
        public val GET_NO_CHANGES: SettingsBindFlags =
            SettingsBindFlags(G_SETTINGS_BIND_GET_NO_CHANGES)

        /**
         * When passed to g_settings_bind(), uses a pair of mapping functions that invert
         *     the boolean value when mapping between the setting and the property.  The setting and property must both
         *     be booleans.  You cannot pass this flag to g_settings_bind_with_mapping().
         */
        public val INVERT_BOOLEAN: SettingsBindFlags =
            SettingsBindFlags(G_SETTINGS_BIND_INVERT_BOOLEAN)

        /**
         * Get the GType of SettingsBindFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_settings_bind_flags_get_type()
    }
}
