// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSystemSetting
import org.gtkkn.native.gtk.gtk_system_setting_get_type

/**
 * Values that can be passed to the [vfunc@Gtk.Widget.system_setting_changed]
 * vfunc.
 *
 * The values indicate which system setting has changed.
 * Widgets may need to drop caches, or react otherwise.
 *
 * Most of the values correspond to [class@Settings] properties.
 *
 * More values may be added over time.
 */
public enum class SystemSetting(public val nativeValue: GtkSystemSetting) {
    /**
     * the [property@Gtk.Settings:gtk-xft-dpi] setting has changed
     */
    DPI(GtkSystemSetting.GTK_SYSTEM_SETTING_DPI),

    /**
     * The [property@Gtk.Settings:gtk-font-name] setting has changed
     */
    FONT_NAME(GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_NAME),

    /**
     * The font configuration has changed in a way that
     *   requires text to be redrawn. This can be any of the
     *   [property@Gtk.Settings:gtk-xft-antialias],
     *   [property@Gtk.Settings:gtk-xft-hinting],
     *   [property@Gtk.Settings:gtk-xft-hintstyle],
     *   [property@Gtk.Settings:gtk-xft-rgba] or
     *   [property@Gtk.Settings:gtk-fontconfig-timestamp] settings
     */
    FONT_CONFIG(GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_CONFIG),

    /**
     * The display has changed
     */
    DISPLAY(GtkSystemSetting.GTK_SYSTEM_SETTING_DISPLAY),

    /**
     * The icon theme has changed in a way that requires
     *   icons to be looked up again
     */
    ICON_THEME(GtkSystemSetting.GTK_SYSTEM_SETTING_ICON_THEME),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSystemSetting): SystemSetting = when (nativeValue) {
            GtkSystemSetting.GTK_SYSTEM_SETTING_DPI -> DPI
            GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_NAME -> FONT_NAME
            GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_CONFIG -> FONT_CONFIG
            GtkSystemSetting.GTK_SYSTEM_SETTING_DISPLAY -> DISPLAY
            GtkSystemSetting.GTK_SYSTEM_SETTING_ICON_THEME -> ICON_THEME
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SystemSetting
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_system_setting_get_type()
    }
}
