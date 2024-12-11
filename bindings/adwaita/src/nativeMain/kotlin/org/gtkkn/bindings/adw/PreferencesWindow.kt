// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwPreferencesWindow
import org.gtkkn.native.adw.adw_preferences_window_add
import org.gtkkn.native.adw.adw_preferences_window_add_toast
import org.gtkkn.native.adw.adw_preferences_window_close_subpage
import org.gtkkn.native.adw.adw_preferences_window_get_can_navigate_back
import org.gtkkn.native.adw.adw_preferences_window_get_search_enabled
import org.gtkkn.native.adw.adw_preferences_window_get_type
import org.gtkkn.native.adw.adw_preferences_window_get_visible_page
import org.gtkkn.native.adw.adw_preferences_window_get_visible_page_name
import org.gtkkn.native.adw.adw_preferences_window_new
import org.gtkkn.native.adw.adw_preferences_window_pop_subpage
import org.gtkkn.native.adw.adw_preferences_window_present_subpage
import org.gtkkn.native.adw.adw_preferences_window_push_subpage
import org.gtkkn.native.adw.adw_preferences_window_remove
import org.gtkkn.native.adw.adw_preferences_window_set_can_navigate_back
import org.gtkkn.native.adw.adw_preferences_window_set_search_enabled
import org.gtkkn.native.adw.adw_preferences_window_set_visible_page
import org.gtkkn.native.adw.adw_preferences_window_set_visible_page_name
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A window to present an application's preferences.
 *
 * <picture>
 *   <source srcset="preferences-window-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="preferences-window.png" alt="preferences-window">
 * </picture>
 *
 * The `AdwPreferencesWindow` widget presents an application's preferences
 * gathered into pages and groups. The preferences are searchable by the user.
 *
 * ## CSS nodes
 *
 * `AdwPreferencesWindow` has a main CSS node with the name `window` and the
 * style class `.preferences`.
 *
 * ## Skipped during bindings generation
 *
 * - method `visible-page`: Property TypeInfo of getter and setter do not match
 * - method `visible-page-name`: Property TypeInfo of getter and setter do not match
 */
public open class PreferencesWindow(pointer: CPointer<AdwPreferencesWindow>) :
    Window(pointer.reinterpret()),
    KGTyped {
    public val adwPreferencesWindowPointer: CPointer<AdwPreferencesWindow>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gPointer.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = gPointer.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = gPointer.reinterpret()

    /**
     * Whether gestures and shortcuts for closing subpages are enabled.
     *
     * The supported gestures are:
     *
     * - One-finger swipe on touchscreens
     * - Horizontal scrolling on touchpads (usually two-finger swipe)
     * - Back mouse button
     *
     * The keyboard back key is also supported, as well as the
     * <kbd>Alt</kbd>+<kbd>←</kbd> shortcut.
     *
     * For right-to-left locales, gestures and shortcuts are reversed.
     */
    public open var canNavigateBack: Boolean
        /**
         * Gets whether gestures and shortcuts for closing subpages are enabled.
         *
         * @return whether gestures and shortcuts are enabled.
         */
        get() = adw_preferences_window_get_can_navigate_back(adwPreferencesWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether gestures and shortcuts for closing subpages are enabled.
         *
         * The supported gestures are:
         *
         * - One-finger swipe on touchscreens
         * - Horizontal scrolling on touchpads (usually two-finger swipe)
         * - Back mouse button
         *
         * The keyboard back key is also supported, as well as the
         * <kbd>Alt</kbd>+<kbd>←</kbd> shortcut.
         *
         * For right-to-left locales, gestures and shortcuts are reversed.
         *
         * @param canNavigateBack the new value
         */
        set(
            canNavigateBack
        ) = adw_preferences_window_set_can_navigate_back(
            adwPreferencesWindowPointer.reinterpret(),
            canNavigateBack.asGBoolean()
        )

    /**
     * Whether search is enabled.
     */
    public open var searchEnabled: Boolean
        /**
         * Gets whether search is enabled for @self.
         *
         * @return whether search is enabled for @self.
         */
        get() = adw_preferences_window_get_search_enabled(adwPreferencesWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether search is enabled for @self.
         *
         * @param searchEnabled whether search is enabled
         */
        set(
            searchEnabled
        ) = adw_preferences_window_set_search_enabled(
            adwPreferencesWindowPointer.reinterpret(),
            searchEnabled.asGBoolean()
        )

    /**
     * Creates a new `AdwPreferencesWindow`.
     *
     * @return the newly created `AdwPreferencesWindow`
     */
    public constructor() : this(adw_preferences_window_new()!!.reinterpret())

    /**
     * Adds a preferences page to @self.
     *
     * @param page the page to add
     */
    public open fun add(page: PreferencesPage): Unit = adw_preferences_window_add(
        adwPreferencesWindowPointer.reinterpret(),
        page.adwPreferencesPagePointer.reinterpret()
    )

    /**
     * Displays @toast.
     *
     * See [method@ToastOverlay.add_toast].
     *
     * @param toast a toast
     */
    public open fun addToast(toast: Toast): Unit =
        adw_preferences_window_add_toast(adwPreferencesWindowPointer.reinterpret(), toast.adwToastPointer.reinterpret())

    /**
     * Closes the current subpage.
     *
     * If there is no presented subpage, this does nothing.
     */
    public open fun closeSubpage(): Unit =
        adw_preferences_window_close_subpage(adwPreferencesWindowPointer.reinterpret())

    /**
     * Gets the currently visible page of @self.
     *
     * @return the visible page
     */
    public open fun getVisiblePage(): PreferencesPage? =
        adw_preferences_window_get_visible_page(adwPreferencesWindowPointer.reinterpret())?.run {
            PreferencesPage(reinterpret())
        }

    /**
     * Gets the name of currently visible page of @self.
     *
     * @return the name of the visible page
     */
    public open fun getVisiblePageName(): String? =
        adw_preferences_window_get_visible_page_name(adwPreferencesWindowPointer.reinterpret())?.toKString()

    /**
     * Pop the visible page from the subpage stack of @self.
     *
     * @return `TRUE` if a page has been popped
     * @since 1.4
     */
    @AdwVersion1_4
    public open fun popSubpage(): Boolean =
        adw_preferences_window_pop_subpage(adwPreferencesWindowPointer.reinterpret()).asBoolean()

    /**
     * Sets @subpage as the window's subpage and opens it.
     *
     * The transition can be cancelled by the user, in which case visible child will
     * change back to the previously visible child.
     *
     * @param subpage the subpage
     */
    public open fun presentSubpage(subpage: Widget): Unit = adw_preferences_window_present_subpage(
        adwPreferencesWindowPointer.reinterpret(),
        subpage.gtkWidgetPointer.reinterpret()
    )

    /**
     * Pushes @page onto the subpage stack of @self.
     *
     * The page will be automatically removed when popped.
     *
     * @param page the subpage
     * @since 1.4
     */
    @AdwVersion1_4
    public open fun pushSubpage(page: NavigationPage): Unit = adw_preferences_window_push_subpage(
        adwPreferencesWindowPointer.reinterpret(),
        page.adwNavigationPagePointer.reinterpret()
    )

    /**
     * Removes a page from @self.
     *
     * @param page the page to remove
     */
    public open fun remove(page: PreferencesPage): Unit = adw_preferences_window_remove(
        adwPreferencesWindowPointer.reinterpret(),
        page.adwPreferencesPagePointer.reinterpret()
    )

    /**
     * Makes @page the visible page of @self.
     *
     * @param page a page of @self
     */
    public open fun setVisiblePage(page: PreferencesPage): Unit = adw_preferences_window_set_visible_page(
        adwPreferencesWindowPointer.reinterpret(),
        page.adwPreferencesPagePointer.reinterpret()
    )

    /**
     * Makes the page with the given name visible.
     *
     * See [property@PreferencesWindow:visible-page].
     *
     * @param name the name of the page to make visible
     */
    public open fun setVisiblePageName(name: String): Unit =
        adw_preferences_window_set_visible_page_name(adwPreferencesWindowPointer.reinterpret(), name)

    public companion object : TypeCompanion<PreferencesWindow> {
        override val type: GeneratedClassKGType<PreferencesWindow> =
            GeneratedClassKGType(adw_preferences_window_get_type()) { PreferencesWindow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of PreferencesWindow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_preferences_window_get_type()
    }
}
