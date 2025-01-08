// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.SelectionModel
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public class ViewStackPages(pointer: CPointer<AdwViewStackPages>) :
    Object(pointer.reinterpret()),
    ListModel,
    SelectionModel,
    KGTyped {
    public val adwViewStackPagesPointer: CPointer<AdwViewStackPages>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkSelectionModelPointer: CPointer<GtkSelectionModel>
        get() = gPointer.reinterpret()

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
            ViewStackPage(this)
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
            GeneratedClassKGType(adw_view_stack_pages_get_type()) { ViewStackPages(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ViewStackPages
         *
         * @return the GType
         */
        public fun getType(): GType = adw_view_stack_pages_get_type()
    }
}
