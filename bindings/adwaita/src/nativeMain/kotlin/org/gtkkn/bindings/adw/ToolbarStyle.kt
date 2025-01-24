// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.native.adw.AdwToolbarStyle
import org.gtkkn.native.adw.adw_toolbar_style_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes the possible top or bottom bar styles in an [class@ToolbarView]
 * widget.
 *
 * `ADW_TOOLBAR_FLAT` is suitable for simple content, such as
 * [class@StatusPage] or [class@PreferencesPage], where the background at the
 * top and bottom parts of the page is uniform. Additionally, windows with
 * sidebars should always use this style.
 *
 * <picture style="min-width: 33%; display: inline-block;">
 *   <source srcset="toolbar-view-flat-1-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toolbar-view-flat-1.png" alt="toolbar-view-flat-1">
 * </picture>
 * <picture style="min-width: 33%; display: inline-block;">
 *   <source srcset="toolbar-view-flat-2-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toolbar-view-flat-2.png" alt="toolbar-view-flat-2">
 * </picture>
 *
 * `ADW_TOOLBAR_RAISED` style is suitable for content such as
 * [utility panes](https://developer.gnome.org/hig/patterns/containers/utility-panes.html),
 * where some elements are directly adjacent to the top/bottom bars, or
 * [class@TabView], where each page can have a different background.
 *
 * `ADW_TOOLBAR_RAISED_BORDER` style is similar to `ADW_TOOLBAR_RAISED`, but
 * with the shadow replaced with a more subtle border. It's intended to be used
 * in applications like image viewers, where a shadow over the content might be
 * undesired.
 *
 * <picture style="min-width: 33%; display: inline-block;">
 *   <source srcset="toolbar-view-raised-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toolbar-view-raised.png" alt="toolbar-view-raised">
 * </picture>
 * <picture style="min-width: 33%; display: inline-block;">
 *   <source srcset="toolbar-view-raised-border-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toolbar-view-raised-border.png" alt="toolbar-view-raised-border">
 * </picture>
 *
 * See [property@ToolbarView:top-bar-style] and
 * [property@ToolbarView:bottom-bar-style].
 *
 * New values may be added to this enumeration over time.
 * @since 1.4
 */
@AdwVersion1_4
public enum class ToolbarStyle(public val nativeValue: AdwToolbarStyle) {
    /**
     * No background, shadow only for scrolled content
     */
    FLAT(AdwToolbarStyle.ADW_TOOLBAR_FLAT),

    /**
     * Opaque background with a persistent shadow
     */
    RAISED(AdwToolbarStyle.ADW_TOOLBAR_RAISED),

    /**
     * Opaque background with a persistent border
     */
    RAISED_BORDER(AdwToolbarStyle.ADW_TOOLBAR_RAISED_BORDER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwToolbarStyle): ToolbarStyle = when (nativeValue) {
            AdwToolbarStyle.ADW_TOOLBAR_FLAT -> FLAT
            AdwToolbarStyle.ADW_TOOLBAR_RAISED -> RAISED
            AdwToolbarStyle.ADW_TOOLBAR_RAISED_BORDER -> RAISED_BORDER
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ToolbarStyle
         *
         * @return the GType
         */
        public fun getType(): GType = adw_toolbar_style_get_type()
    }
}
