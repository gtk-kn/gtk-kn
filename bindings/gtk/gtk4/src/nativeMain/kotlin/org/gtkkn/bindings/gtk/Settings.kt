// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSettings
import org.gtkkn.native.gtk.GtkStyleProvider
import org.gtkkn.native.gtk.gtk_settings_get_default
import org.gtkkn.native.gtk.gtk_settings_get_for_display
import org.gtkkn.native.gtk.gtk_settings_get_type
import org.gtkkn.native.gtk.gtk_settings_reset_property
import kotlin.String
import kotlin.Unit

/**
 * `GtkSettings` provides a mechanism to share global settings between
 * applications.
 *
 * On the X window system, this sharing is realized by an
 * [XSettings](http://www.freedesktop.org/wiki/Specifications/xsettings-spec)
 * manager that is usually part of the desktop environment, along with
 * utilities that let the user change these settings.
 *
 * On Wayland, the settings are obtained either via a settings portal,
 * or by reading desktop settings from DConf.
 *
 * On macOS, the settings are obtained from `NSUserDefaults`.
 *
 * In the absence of these sharing mechanisms, GTK reads default values for
 * settings from `settings.ini` files in `/etc/gtk-4.0`, `$XDG_CONFIG_DIRS/gtk-4.0`
 * and `$XDG_CONFIG_HOME/gtk-4.0`. These files must be valid key files (see
 * `GKeyFile`), and have a section called Settings. Themes can also provide
 * default values for settings by installing a `settings.ini` file
 * next to their `gtk.css` file.
 *
 * Applications can override system-wide settings by setting the property
 * of the `GtkSettings` object with g_object_set(). This should be restricted
 * to special cases though; `GtkSettings` are not meant as an application
 * configuration facility.
 *
 * There is one `GtkSettings` instance per display. It can be obtained with
 * [func@Gtk.Settings.get_for_display], but in many cases, it is more
 * convenient to use [method@Gtk.Widget.get_settings].
 *
 * ## Skipped during bindings generation
 *
 * - method `gtk-alternative-button-order`: Property has no getter nor setter
 * - method `gtk-alternative-sort-arrows`: Property has no getter nor setter
 * - method `gtk-application-prefer-dark-theme`: Property has no getter nor setter
 * - method `gtk-cursor-aspect-ratio`: Property has no getter nor setter
 * - method `gtk-cursor-blink`: Property has no getter nor setter
 * - method `gtk-cursor-blink-time`: Property has no getter nor setter
 * - method `gtk-cursor-blink-timeout`: Property has no getter nor setter
 * - method `gtk-cursor-theme-name`: Property has no getter nor setter
 * - method `gtk-cursor-theme-size`: Property has no getter nor setter
 * - method `gtk-decoration-layout`: Property has no getter nor setter
 * - method `gtk-dialogs-use-header`: Property has no getter nor setter
 * - method `gtk-dnd-drag-threshold`: Property has no getter nor setter
 * - method `gtk-double-click-distance`: Property has no getter nor setter
 * - method `gtk-double-click-time`: Property has no getter nor setter
 * - method `gtk-enable-accels`: Property has no getter nor setter
 * - method `gtk-enable-animations`: Property has no getter nor setter
 * - method `gtk-enable-event-sounds`: Property has no getter nor setter
 * - method `gtk-enable-input-feedback-sounds`: Property has no getter nor setter
 * - method `gtk-enable-primary-paste`: Property has no getter nor setter
 * - method `gtk-entry-password-hint-timeout`: Property has no getter nor setter
 * - method `gtk-entry-select-on-focus`: Property has no getter nor setter
 * - method `gtk-error-bell`: Property has no getter nor setter
 * - method `gtk-font-name`: Property has no getter nor setter
 * - method `gtk-fontconfig-timestamp`: Property has no getter nor setter
 * - method `gtk-hint-font-metrics`: Property has no getter nor setter
 * - method `gtk-icon-theme-name`: Property has no getter nor setter
 * - method `gtk-im-module`: Property has no getter nor setter
 * - method `gtk-keynav-use-caret`: Property has no getter nor setter
 * - method `gtk-label-select-on-focus`: Property has no getter nor setter
 * - method `gtk-long-press-time`: Property has no getter nor setter
 * - method `gtk-overlay-scrolling`: Property has no getter nor setter
 * - method `gtk-primary-button-warps-slider`: Property has no getter nor setter
 * - method `gtk-print-backends`: Property has no getter nor setter
 * - method `gtk-print-preview-command`: Property has no getter nor setter
 * - method `gtk-recent-files-enabled`: Property has no getter nor setter
 * - method `gtk-recent-files-max-age`: Property has no getter nor setter
 * - method `gtk-shell-shows-app-menu`: Property has no getter nor setter
 * - method `gtk-shell-shows-desktop`: Property has no getter nor setter
 * - method `gtk-shell-shows-menubar`: Property has no getter nor setter
 * - method `gtk-show-status-shapes`: Property has no getter nor setter
 * - method `gtk-sound-theme-name`: Property has no getter nor setter
 * - method `gtk-split-cursor`: Property has no getter nor setter
 * - method `gtk-theme-name`: Property has no getter nor setter
 * - method `gtk-titlebar-double-click`: Property has no getter nor setter
 * - method `gtk-titlebar-middle-click`: Property has no getter nor setter
 * - method `gtk-titlebar-right-click`: Property has no getter nor setter
 * - method `gtk-xft-antialias`: Property has no getter nor setter
 * - method `gtk-xft-dpi`: Property has no getter nor setter
 * - method `gtk-xft-hinting`: Property has no getter nor setter
 * - method `gtk-xft-hintstyle`: Property has no getter nor setter
 * - method `gtk-xft-rgba`: Property has no getter nor setter
 */
public open class Settings(public val gtkSettingsPointer: CPointer<GtkSettings>) :
    Object(gtkSettingsPointer.reinterpret()),
    StyleProvider,
    KGTyped {
    override val gtkStyleProviderPointer: CPointer<GtkStyleProvider>
        get() = handle.reinterpret()

    /**
     * Undoes the effect of calling g_object_set() to install an
     * application-specific value for a setting.
     *
     * After this call, the setting will again follow the session-wide
     * value for this setting.
     *
     * @param name the name of the setting to reset
     */
    public open fun resetProperty(name: String): Unit = gtk_settings_reset_property(gtkSettingsPointer, name)

    public companion object : TypeCompanion<Settings> {
        override val type: GeneratedClassKGType<Settings> =
            GeneratedClassKGType(getTypeOrNull("gtk_settings_get_type")!!) { Settings(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets the `GtkSettings` object for the default display, creating
         * it if necessary.
         *
         * See [func@Gtk.Settings.get_for_display].
         *
         * @return a `GtkSettings` object. If there is
         *   no default display, then returns null.
         */
        public fun getDefault(): Settings? = gtk_settings_get_default()?.run {
            Settings(this)
        }

        /**
         * Gets the `GtkSettings` object for @display, creating it if necessary.
         *
         * @param display a `GdkDisplay`
         * @return a `GtkSettings` object
         */
        public fun getForDisplay(display: Display): Settings =
            gtk_settings_get_for_display(display.gdkDisplayPointer)!!.run {
                Settings(this)
            }

        /**
         * Get the GType of Settings
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_settings_get_type()
    }
}
