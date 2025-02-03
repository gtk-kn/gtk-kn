// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.SelectionModel
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwViewStackPages
import org.gtkkn.native.adw.adw_view_stack_pages_get_selected_page
import org.gtkkn.native.adw.adw_view_stack_pages_get_type
import org.gtkkn.native.adw.adw_view_stack_pages_set_selected_page
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSelectionModel
import kotlin.Unit

/**
 * An auxiliary class used by [class@ViewStack].
 *
 * See [property@ViewStack:pages].
 *
 * ## Skipped during bindings generation
 *
 * - method `selected-page`: Property TypeInfo of getter and setter do not match
 *
 * @since 1.4
 */
@AdwVersion1_4
public class ViewStackPages(public val adwViewStackPagesPointer: CPointer<AdwViewStackPages>) :
    Object(adwViewStackPagesPointer.reinterpret()),
    ListModel,
    SelectionModel,
    KGTyped {
    init {
        Adw
    }

    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    override val gtkSelectionModelPointer: CPointer<GtkSelectionModel>
        get() = handle.reinterpret()

    /**
     * Gets the [class@ViewStackPage] for the visible child of a view stack
     *
     * Gets the [class@ViewStackPage] for the visible child of the associated stack.
     *
     * Returns `NULL` if there's no selected page.
     *
     * @return the stack page
     * @since 1.4
     */
    @AdwVersion1_4
    public fun getSelectedPage(): ViewStackPage? =
        adw_view_stack_pages_get_selected_page(adwViewStackPagesPointer)?.run {
            InstanceCache.get(this, true) { ViewStackPage(reinterpret()) }!!
        }

    /**
     * Sets the visible child in the associated [class@ViewStack].
     *
     * See [property@ViewStack:visible-child].
     *
     * @param page a stack page within the associated stack
     * @since 1.4
     */
    @AdwVersion1_4
    public fun setSelectedPage(page: ViewStackPage): Unit =
        adw_view_stack_pages_set_selected_page(adwViewStackPagesPointer, page.adwViewStackPagePointer)

    public companion object : TypeCompanion<ViewStackPages> {
        override val type: GeneratedClassKGType<ViewStackPages> =
            GeneratedClassKGType(getTypeOrNull()!!) { ViewStackPages(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ViewStackPages
         *
         * @return the GType
         */
        public fun getType(): GType = adw_view_stack_pages_get_type()

        /**
         * Gets the GType of from the symbol `adw_view_stack_pages_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_view_stack_pages_get_type")
    }
}
