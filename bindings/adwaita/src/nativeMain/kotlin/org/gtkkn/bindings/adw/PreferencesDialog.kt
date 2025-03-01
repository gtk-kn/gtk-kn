// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_5
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwPreferencesDialog
import org.gtkkn.native.adw.adw_preferences_dialog_add
import org.gtkkn.native.adw.adw_preferences_dialog_add_toast
import org.gtkkn.native.adw.adw_preferences_dialog_get_search_enabled
import org.gtkkn.native.adw.adw_preferences_dialog_get_type
import org.gtkkn.native.adw.adw_preferences_dialog_get_visible_page
import org.gtkkn.native.adw.adw_preferences_dialog_get_visible_page_name
import org.gtkkn.native.adw.adw_preferences_dialog_new
import org.gtkkn.native.adw.adw_preferences_dialog_pop_subpage
import org.gtkkn.native.adw.adw_preferences_dialog_push_subpage
import org.gtkkn.native.adw.adw_preferences_dialog_remove
import org.gtkkn.native.adw.adw_preferences_dialog_set_search_enabled
import org.gtkkn.native.adw.adw_preferences_dialog_set_visible_page
import org.gtkkn.native.adw.adw_preferences_dialog_set_visible_page_name
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A dialog showing application's preferences.
 *
 * <picture>
 *   <source srcset="preferences-dialog-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="preferences-dialog.png" alt="preferences-dialog">
 * </picture>
 *
 * The `AdwPreferencesDialog` widget presents an application's preferences
 * gathered into pages and groups. The preferences are searchable by the user.
 *
 * ## CSS nodes
 *
 * `AdwPreferencesDialog` has a main CSS node with the name `dialog` and the
 * style class `.preferences`.
 *
 * ## Skipped during bindings generation
 *
 * - method `visible-page`: Property TypeInfo of getter and setter do not match
 * - method `visible-page-name`: Property TypeInfo of getter and setter do not match
 *
 * @since 1.5
 */
@AdwVersion1_5
public open class PreferencesDialog(public val adwPreferencesDialogPointer: CPointer<AdwPreferencesDialog>) :
    Dialog(adwPreferencesDialogPointer.reinterpret()),
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

    /**
     * Whether search is enabled.
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open var searchEnabled: Boolean
        /**
         * Gets whether search is enabled for @self.
         *
         * @return whether search is enabled for @self.
         * @since 1.5
         */
        get() = adw_preferences_dialog_get_search_enabled(adwPreferencesDialogPointer).asBoolean()

        /**
         * Sets whether search is enabled for @self.
         *
         * @param searchEnabled whether search is enabled
         * @since 1.5
         */
        @AdwVersion1_5
        set(
            searchEnabled
        ) = adw_preferences_dialog_set_search_enabled(adwPreferencesDialogPointer, searchEnabled.asGBoolean())

    /**
     * Creates a new `AdwPreferencesDialog`.
     *
     * @return the newly created `AdwPreferencesDialog`
     * @since 1.5
     */
    public constructor() : this(adw_preferences_dialog_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Adds a preferences page to @self.
     *
     * @param page the page to add
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun add(page: PreferencesPage): Unit =
        adw_preferences_dialog_add(adwPreferencesDialogPointer, page.adwPreferencesPagePointer)

    /**
     * Displays @toast.
     *
     * See [method@ToastOverlay.add_toast].
     *
     * @param toast a toast
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun addToast(toast: Toast): Unit =
        adw_preferences_dialog_add_toast(adwPreferencesDialogPointer, toast.adwToastPointer)

    /**
     * Gets the currently visible page of @self.
     *
     * @return the visible page
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun getVisiblePage(): PreferencesPage? =
        adw_preferences_dialog_get_visible_page(adwPreferencesDialogPointer)?.run {
            InstanceCache.get(this, true) { PreferencesPage(reinterpret()) }!!
        }

    /**
     * Gets the name of currently visible page of @self.
     *
     * @return the name of the visible page
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun getVisiblePageName(): String? =
        adw_preferences_dialog_get_visible_page_name(adwPreferencesDialogPointer)?.toKString()

    /**
     * Pop the visible page from the subpage stack of @self.
     *
     * @return `TRUE` if a page has been popped
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun popSubpage(): Boolean = adw_preferences_dialog_pop_subpage(adwPreferencesDialogPointer).asBoolean()

    /**
     * Pushes @page onto the subpage stack of @self.
     *
     * The page will be automatically removed when popped.
     *
     * @param page the subpage
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun pushSubpage(page: NavigationPage): Unit =
        adw_preferences_dialog_push_subpage(adwPreferencesDialogPointer, page.adwNavigationPagePointer)

    /**
     * Removes a page from @self.
     *
     * @param page the page to remove
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun remove(page: PreferencesPage): Unit =
        adw_preferences_dialog_remove(adwPreferencesDialogPointer, page.adwPreferencesPagePointer)

    /**
     * Makes @page the visible page of @self.
     *
     * @param page a page of @self
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun setVisiblePage(page: PreferencesPage): Unit =
        adw_preferences_dialog_set_visible_page(adwPreferencesDialogPointer, page.adwPreferencesPagePointer)

    /**
     * Makes the page with the given name visible.
     *
     * See [property@PreferencesDialog:visible-page].
     *
     * @param name the name of the page to make visible
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun setVisiblePageName(name: String): Unit =
        adw_preferences_dialog_set_visible_page_name(adwPreferencesDialogPointer, name)

    public companion object : TypeCompanion<PreferencesDialog> {
        override val type: GeneratedClassKGType<PreferencesDialog> =
            GeneratedClassKGType(getTypeOrNull()!!) { PreferencesDialog(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of PreferencesDialog
         *
         * @return the GType
         */
        public fun getType(): GType = adw_preferences_dialog_get_type()

        /**
         * Gets the GType of from the symbol `adw_preferences_dialog_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_preferences_dialog_get_type")
    }
}
