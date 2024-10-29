// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_ALL_SHORTCUTS
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_ALT_DIGITS
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_ALT_ZERO
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_CONTROL_END
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_CONTROL_HOME
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_DOWN
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_UP
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_END
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_HOME
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_DOWN
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_UP
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_TAB
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_CONTROL_TAB
import org.gtkkn.native.adw.ADW_TAB_VIEW_SHORTCUT_NONE
import org.gtkkn.native.adw.AdwTabViewShortcuts

/**
 * Describes available shortcuts in an [class@TabView].
 *
 * Shortcuts can be set with [property@TabView:shortcuts], or added/removed
 * individually with [method@TabView.add_shortcuts] and
 * [method@TabView.remove_shortcuts].
 *
 * New values may be added to this enumeration over time.
 * @since 1.2
 */
public class TabViewShortcuts(
    public val mask: AdwTabViewShortcuts,
) : Bitfield<TabViewShortcuts> {
    override infix fun or(other: TabViewShortcuts): TabViewShortcuts = TabViewShortcuts(mask or other.mask)

    public companion object {
        /**
         * No shortcuts
         */
        public val NONE: TabViewShortcuts = TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_NONE)

        /**
         * <kbd>Ctrl</kbd>+<kbd>Tab</kbd> - switch to the next page
         */
        public val CONTROL_TAB: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_CONTROL_TAB)

        /**
         * <kbd>Shift</kbd>+<kbd>Ctrl</kbd>+<kbd>Tab</kbd> - switch to the previous
         *   page
         */
        public val CONTROL_SHIFT_TAB: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_TAB)

        /**
         * <kbd>Ctrl</kbd>+<kbd>Page Up</kbd> - switch to the previous page
         */
        public val CONTROL_PAGE_UP: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_UP)

        /**
         * <kbd>Ctrl</kbd>+<kbd>Page Down</kbd> - switch to the next page
         */
        public val CONTROL_PAGE_DOWN: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_DOWN)

        /**
         * <kbd>Ctrl</kbd>+<kbd>Home</kbd> - switch to the first page
         */
        public val CONTROL_HOME: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_CONTROL_HOME)

        /**
         * <kbd>Ctrl</kbd>+<kbd>End</kbd> - switch to the last page
         */
        public val CONTROL_END: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_CONTROL_END)

        /**
         * <kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>Page Up</kbd> - move the selected
         *   page backward
         */
        public val CONTROL_SHIFT_PAGE_UP: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_UP)

        /**
         * <kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>Page Down</kbd> - move the selected
         *   page forward
         */
        public val CONTROL_SHIFT_PAGE_DOWN: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_DOWN)

        /**
         * <kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>Home</kbd> - move the selected page
         *   at the start
         */
        public val CONTROL_SHIFT_HOME: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_HOME)

        /**
         * <kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>End</kbd> - move the current page at
         *   the end
         */
        public val CONTROL_SHIFT_END: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_END)

        /**
         * <kbd>Alt</kbd>+<kbd>1</kbd>⋯<kbd>9</kbd> - switch to pages 1-9
         */
        public val ALT_DIGITS: TabViewShortcuts = TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_ALT_DIGITS)

        /**
         * <kbd>Alt</kbd>+<kbd>0</kbd> - switch to page 10
         */
        public val ALT_ZERO: TabViewShortcuts = TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_ALT_ZERO)

        /**
         * All of the shortcuts
         */
        public val ALL_SHORTCUTS: TabViewShortcuts =
            TabViewShortcuts(ADW_TAB_VIEW_SHORTCUT_ALL_SHORTCUTS)
    }
}
