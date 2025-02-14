// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 1.6.
 *
 * Use [class@PreferencesDialog].
 * ---
 *
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
public open class PreferencesWindow(public val adwPreferencesWindowPointer: CPointer<AdwPreferencesWindow>) :
    Window(adwPreferencesWindowPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = handle.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = handle.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = handle.reinterpret()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * Use [property@NavigationPage:can-pop] instead.
     * ---
     *
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
     *
     * Has no effect for subpages added with
     * [method@PreferencesWindow.push_subpage].
     */
    public open var canNavigateBack: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * Use [method@NavigationPage.get_can_pop] instead.
         * ---
         *
         * Gets whether gestures and shortcuts for closing subpages are enabled.
         *
         * @return whether gestures and shortcuts are enabled.
         */
        get() = adw_preferences_window_get_can_navigate_back(adwPreferencesWindowPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * Use [method@NavigationPage.set_can_pop] instead.
         * ---
         *
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
         * Has no effect for subpages added with [method@PreferencesWindow.push_subpage].
         *
         * @param canNavigateBack the new value
         */
        set(
            canNavigateBack
        ) = adw_preferences_window_set_can_navigate_back(adwPreferencesWindowPointer, canNavigateBack.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Whether search is enabled.
     */
    public open var searchEnabled: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.6.
         *
         * Use [class@PreferencesDialog].
         * ---
         *
         * Gets whether search is enabled for @self.
         *
         * @return whether search is enabled for @self.
         */
        get() = adw_preferences_window_get_search_enabled(adwPreferencesWindowPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.6.
         *
         * Use [class@PreferencesDialog].
         * ---
         *
         * Sets whether search is enabled for @self.
         *
         * @param searchEnabled whether search is enabled
         */
        set(
            searchEnabled
        ) = adw_preferences_window_set_search_enabled(adwPreferencesWindowPointer, searchEnabled.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Creates a new `AdwPreferencesWindow`.
     *
     * @return the newly created `AdwPreferencesWindow`
     */
    public constructor() : this(adw_preferences_window_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Adds a preferences page to @self.
     *
     * @param page the page to add
     */
    public open fun add(page: PreferencesPage): Unit =
        adw_preferences_window_add(adwPreferencesWindowPointer, page.adwPreferencesPagePointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Displays @toast.
     *
     * See [method@ToastOverlay.add_toast].
     *
     * @param toast a toast
     */
    public open fun addToast(toast: Toast): Unit =
        adw_preferences_window_add_toast(adwPreferencesWindowPointer, toast.adwToastPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * Use [method@PreferencesWindow.pop_subpage] instead.
     * ---
     *
     * Closes the current subpage.
     *
     * If there is no presented subpage, this does nothing.
     */
    public open fun closeSubpage(): Unit = adw_preferences_window_close_subpage(adwPreferencesWindowPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Gets the currently visible page of @self.
     *
     * @return the visible page
     */
    public open fun getVisiblePage(): PreferencesPage? =
        adw_preferences_window_get_visible_page(adwPreferencesWindowPointer)?.run {
            InstanceCache.get(this, true) { PreferencesPage(reinterpret()) }!!
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Gets the name of currently visible page of @self.
     *
     * @return the name of the visible page
     */
    public open fun getVisiblePageName(): String? =
        adw_preferences_window_get_visible_page_name(adwPreferencesWindowPointer)?.toKString()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Pop the visible page from the subpage stack of @self.
     *
     * @return `TRUE` if a page has been popped
     * @since 1.4
     */
    @AdwVersion1_4
    public open fun popSubpage(): Boolean = adw_preferences_window_pop_subpage(adwPreferencesWindowPointer).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * Use [method@PreferencesWindow.push_subpage] instead.
     * ---
     *
     * Sets @subpage as the window's subpage and opens it.
     *
     * The transition can be cancelled by the user, in which case visible child will
     * change back to the previously visible child.
     *
     * @param subpage the subpage
     */
    public open fun presentSubpage(subpage: Widget): Unit =
        adw_preferences_window_present_subpage(adwPreferencesWindowPointer, subpage.gtkWidgetPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Pushes @page onto the subpage stack of @self.
     *
     * The page will be automatically removed when popped.
     *
     * @param page the subpage
     * @since 1.4
     */
    @AdwVersion1_4
    public open fun pushSubpage(page: NavigationPage): Unit =
        adw_preferences_window_push_subpage(adwPreferencesWindowPointer, page.adwNavigationPagePointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Removes a page from @self.
     *
     * @param page the page to remove
     */
    public open fun remove(page: PreferencesPage): Unit =
        adw_preferences_window_remove(adwPreferencesWindowPointer, page.adwPreferencesPagePointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Makes @page the visible page of @self.
     *
     * @param page a page of @self
     */
    public open fun setVisiblePage(page: PreferencesPage): Unit =
        adw_preferences_window_set_visible_page(adwPreferencesWindowPointer, page.adwPreferencesPagePointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.6.
     *
     * Use [class@PreferencesDialog].
     * ---
     *
     * Makes the page with the given name visible.
     *
     * See [property@PreferencesWindow:visible-page].
     *
     * @param name the name of the page to make visible
     */
    public open fun setVisiblePageName(name: String): Unit =
        adw_preferences_window_set_visible_page_name(adwPreferencesWindowPointer, name)

    public companion object : TypeCompanion<PreferencesWindow> {
        override val type: GeneratedClassKGType<PreferencesWindow> =
            GeneratedClassKGType(getTypeOrNull()!!) { PreferencesWindow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of PreferencesWindow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_preferences_window_get_type()

        /**
         * Gets the GType of from the symbol `adw_preferences_window_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_preferences_window_get_type")
    }
}
