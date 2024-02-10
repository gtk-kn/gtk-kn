// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSystemSetting
import org.gtkkn.native.gtk.GtkSystemSetting.GTK_SYSTEM_SETTING_DISPLAY
import org.gtkkn.native.gtk.GtkSystemSetting.GTK_SYSTEM_SETTING_DPI
import org.gtkkn.native.gtk.GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_CONFIG
import org.gtkkn.native.gtk.GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_NAME
import org.gtkkn.native.gtk.GtkSystemSetting.GTK_SYSTEM_SETTING_ICON_THEME

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
public enum class SystemSetting(
    public val nativeValue: GtkSystemSetting,
) {
    /**
     * the [property@Gtk.Settings:gtk-xft-dpi] setting has changed
     */
    DPI(GTK_SYSTEM_SETTING_DPI),

    /**
     * The [property@Gtk.Settings:gtk-font-name] setting has changed
     */
    FONT_NAME(GTK_SYSTEM_SETTING_FONT_NAME),

    /**
     * The font configuration has changed in a way that
     *   requires text to be redrawn. This can be any of the
     *   [property@Gtk.Settings:gtk-xft-antialias],
     *   [property@Gtk.Settings:gtk-xft-hinting],
     *   [property@Gtk.Settings:gtk-xft-hintstyle],
     *   [property@Gtk.Settings:gtk-xft-rgba] or
     *   [property@Gtk.Settings:gtk-fontconfig-timestamp] settings
     */
    FONT_CONFIG(GTK_SYSTEM_SETTING_FONT_CONFIG),

    /**
     * The display has changed
     */
    DISPLAY(GTK_SYSTEM_SETTING_DISPLAY),

    /**
     * The icon theme has changed in a way that requires
     *   icons to be looked up again
     */
    ICON_THEME(GTK_SYSTEM_SETTING_ICON_THEME),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSystemSetting): SystemSetting =
            when (nativeValue) {
                GTK_SYSTEM_SETTING_DPI -> DPI
                GTK_SYSTEM_SETTING_FONT_NAME -> FONT_NAME
                GTK_SYSTEM_SETTING_FONT_CONFIG -> FONT_CONFIG
                GTK_SYSTEM_SETTING_DISPLAY -> DISPLAY
                GTK_SYSTEM_SETTING_ICON_THEME -> ICON_THEME
                else -> error("invalid nativeValue")
            }
    }
}
