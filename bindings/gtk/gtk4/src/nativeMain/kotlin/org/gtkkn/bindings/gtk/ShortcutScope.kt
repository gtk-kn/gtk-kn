// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkShortcutScope
import org.gtkkn.native.gtk.gtk_shortcut_scope_get_type

/**
 * Describes where [class@Shortcut]s added to a
 * [class@ShortcutController] get handled.
 */
public enum class ShortcutScope(public val nativeValue: GtkShortcutScope) {
    /**
     * Shortcuts are handled inside
     *   the widget the controller belongs to.
     */
    LOCAL(GtkShortcutScope.GTK_SHORTCUT_SCOPE_LOCAL),

    /**
     * Shortcuts are handled by
     *   the first ancestor that is a [iface@ShortcutManager]
     */
    MANAGED(GtkShortcutScope.GTK_SHORTCUT_SCOPE_MANAGED),

    /**
     * Shortcuts are handled by
     *   the root widget.
     */
    GLOBAL(GtkShortcutScope.GTK_SHORTCUT_SCOPE_GLOBAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkShortcutScope): ShortcutScope = when (nativeValue) {
            GtkShortcutScope.GTK_SHORTCUT_SCOPE_LOCAL -> LOCAL
            GtkShortcutScope.GTK_SHORTCUT_SCOPE_MANAGED -> MANAGED
            GtkShortcutScope.GTK_SHORTCUT_SCOPE_GLOBAL -> GLOBAL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ShortcutScope
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcut_scope_get_type()
    }
}
