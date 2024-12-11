// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkSectionModel
import org.gtkkn.native.gtk.GtkSelectionModel
import org.gtkkn.native.gtk.GtkSingleSelection
import org.gtkkn.native.gtk.gtk_single_selection_get_autoselect
import org.gtkkn.native.gtk.gtk_single_selection_get_can_unselect
import org.gtkkn.native.gtk.gtk_single_selection_get_model
import org.gtkkn.native.gtk.gtk_single_selection_get_selected
import org.gtkkn.native.gtk.gtk_single_selection_get_selected_item
import org.gtkkn.native.gtk.gtk_single_selection_get_type
import org.gtkkn.native.gtk.gtk_single_selection_new
import org.gtkkn.native.gtk.gtk_single_selection_set_autoselect
import org.gtkkn.native.gtk.gtk_single_selection_set_can_unselect
import org.gtkkn.native.gtk.gtk_single_selection_set_model
import org.gtkkn.native.gtk.gtk_single_selection_set_selected
import kotlin.Boolean

/**
 * `GtkSingleSelection` is a `GtkSelectionModel` that allows selecting a single
 * item.
 *
 * Note that the selection is *persistent* -- if the selected item is removed
 * and re-added in the same [signal@Gio.ListModel::items-changed] emission, it
 * stays selected. In particular, this means that changing the sort order of an
 * underlying sort model will preserve the selection.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class SingleSelection(pointer: CPointer<GtkSingleSelection>) :
    Object(pointer.reinterpret()),
    ListModel,
    SectionModel,
    SelectionModel,
    KGTyped {
    public val gtkSingleSelectionPointer: CPointer<GtkSingleSelection>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkSectionModelPointer: CPointer<GtkSectionModel>
        get() = gPointer.reinterpret()

    override val gtkSelectionModelPointer: CPointer<GtkSelectionModel>
        get() = gPointer.reinterpret()

    /**
     * If the selection will always select an item.
     */
    public open var autoselect: Boolean
        /**
         * Checks if autoselect has been enabled or disabled via
         * gtk_single_selection_set_autoselect().
         *
         * @return true if autoselect is enabled
         */
        get() = gtk_single_selection_get_autoselect(gtkSingleSelectionPointer.reinterpret()).asBoolean()

        /**
         * Enables or disables autoselect.
         *
         * If @autoselect is true, @self will enforce that an item is always
         * selected. It will select a new item when the currently selected
         * item is deleted and it will disallow unselecting the current item.
         *
         * @param autoselect true to always select an item
         */
        set(
            autoselect
        ) = gtk_single_selection_set_autoselect(gtkSingleSelectionPointer.reinterpret(), autoselect.asGBoolean())

    /**
     * If unselecting the selected item is allowed.
     */
    public open var canUnselect: Boolean
        /**
         * If true, gtk_selection_model_unselect_item() is supported and allows
         * unselecting the selected item.
         *
         * @return true to support unselecting
         */
        get() = gtk_single_selection_get_can_unselect(gtkSingleSelectionPointer.reinterpret()).asBoolean()

        /**
         * If true, unselecting the current item via
         * gtk_selection_model_unselect_item() is supported.
         *
         * Note that setting [property@Gtk.SingleSelection:autoselect] will
         * cause unselecting to not work, so it practically makes no sense
         * to set both at the same time the same time.
         *
         * @param canUnselect true to allow unselecting
         */
        set(
            canUnselect
        ) = gtk_single_selection_set_can_unselect(gtkSingleSelectionPointer.reinterpret(), canUnselect.asGBoolean())

    /**
     * The model being managed.
     */
    public open var model: ListModel?
        /**
         * Gets the model that @self is wrapping.
         *
         * @return The model being wrapped
         */
        get() = gtk_single_selection_get_model(gtkSingleSelectionPointer.reinterpret())?.run {
            ListModel.wrap(reinterpret())
        }

        /**
         * Sets the model that @self should wrap.
         *
         * If @model is null, @self will be empty.
         *
         * @param model A `GListModel` to wrap
         */
        set(model) = gtk_single_selection_set_model(gtkSingleSelectionPointer.reinterpret(), model?.gioListModelPointer)

    /**
     * Position of the selected item.
     */
    public open var selected: guint
        /**
         * Gets the position of the selected item.
         *
         * If no item is selected, %GTK_INVALID_LIST_POSITION is returned.
         *
         * @return The position of the selected item
         */
        get() = gtk_single_selection_get_selected(gtkSingleSelectionPointer.reinterpret())

        /**
         * Selects the item at the given position.
         *
         * If the list does not have an item at @position or
         * %GTK_INVALID_LIST_POSITION is given, the behavior depends on the
         * value of the [property@Gtk.SingleSelection:autoselect] property:
         * If it is set, no change will occur and the old item will stay
         * selected. If it is unset, the selection will be unset and no item
         * will be selected.
         *
         * @param position the item to select or %GTK_INVALID_LIST_POSITION
         */
        set(position) = gtk_single_selection_set_selected(gtkSingleSelectionPointer.reinterpret(), position)

    /**
     * The selected item.
     */
    public open val selectedItem: Object?
        /**
         * Gets the selected item.
         *
         * If no item is selected, null is returned.
         *
         * @return The selected item
         */
        get() = gtk_single_selection_get_selected_item(gtkSingleSelectionPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Creates a new selection to handle @model.
     *
     * @param model the `GListModel` to manage
     * @return a new `GtkSingleSelection`
     */
    public constructor(
        model: ListModel? = null,
    ) : this(gtk_single_selection_new(model?.gioListModelPointer)!!.reinterpret())

    public companion object : TypeCompanion<SingleSelection> {
        override val type: GeneratedClassKGType<SingleSelection> =
            GeneratedClassKGType(gtk_single_selection_get_type()) { SingleSelection(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of SingleSelection
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_single_selection_get_type()
    }
}
