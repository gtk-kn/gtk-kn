// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkShortcutScope
import org.gtkkn.native.gtk.GtkShortcutScope.GTK_SHORTCUT_SCOPE_GLOBAL
import org.gtkkn.native.gtk.GtkShortcutScope.GTK_SHORTCUT_SCOPE_LOCAL
import org.gtkkn.native.gtk.GtkShortcutScope.GTK_SHORTCUT_SCOPE_MANAGED

/**
 * Describes where [class@Shortcut]s added to a
 * [class@ShortcutController] get handled.
 */
public enum class ShortcutScope(
    public val nativeValue: GtkShortcutScope,
) {
    /**
     * Shortcuts are handled inside
     *   the widget the controller belongs to.
     */
    LOCAL(GTK_SHORTCUT_SCOPE_LOCAL),

    /**
     * Shortcuts are handled by
     *   the first ancestor that is a [iface@ShortcutManager]
     */
    MANAGED(GTK_SHORTCUT_SCOPE_MANAGED),

    /**
     * Shortcuts are handled by
     *   the root widget.
     */
    GLOBAL(GTK_SHORTCUT_SCOPE_GLOBAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkShortcutScope): ShortcutScope =
            when (nativeValue) {
                GTK_SHORTCUT_SCOPE_LOCAL -> LOCAL
                GTK_SHORTCUT_SCOPE_MANAGED -> MANAGED
                GTK_SHORTCUT_SCOPE_GLOBAL -> GLOBAL
                else -> error("invalid nativeValue")
            }
    }
}
