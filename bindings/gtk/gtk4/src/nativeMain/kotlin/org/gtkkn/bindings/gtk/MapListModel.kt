// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gtk.GtkMapListModel
import org.gtkkn.native.gtk.GtkSectionModel
import org.gtkkn.native.gtk.gtk_map_list_model_get_model
import org.gtkkn.native.gtk.gtk_map_list_model_get_type
import org.gtkkn.native.gtk.gtk_map_list_model_has_map
import org.gtkkn.native.gtk.gtk_map_list_model_new
import org.gtkkn.native.gtk.gtk_map_list_model_set_map_func
import org.gtkkn.native.gtk.gtk_map_list_model_set_model
import kotlin.Boolean
import kotlin.Unit

/**
 * A `GtkMapListModel` maps the items in a list model to different items.
 *
 * `GtkMapListModel` uses a [callback@Gtk.MapListModelMapFunc].
 *
 * Example: Create a list of `GtkEventControllers`
 * ```c
 * static gpointer
 * map_to_controllers (gpointer widget,
 *                     gpointer data)
 * {
 *   gpointer result = gtk_widget_observe_controllers (widget);
 *   g_object_unref (widget);
 *   return result;
 * }
 *
 * widgets = gtk_widget_observe_children (widget);
 *
 * controllers = gtk_map_list_model_new (widgets,
 *                                       map_to_controllers,
 *                                       NULL, NULL);
 *
 * model = gtk_flatten_list_model_new (GTK_TYPE_EVENT_CONTROLLER,
 *                                     controllers);
 * ```
 *
 * `GtkMapListModel` will attempt to discard the mapped objects as soon as
 * they are no longer needed and recreate them if necessary.
 *
 * `GtkMapListModel` passes through sections from the underlying model.
 *
 * ## Skipped during bindings generation
 *
 * - method `has-map`: Property has no getter nor setter
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class MapListModel(
    pointer: CPointer<GtkMapListModel>,
) : Object(pointer.reinterpret()),
    ListModel,
    SectionModel,
    KGTyped {
    public val gtkMapListModelPointer: CPointer<GtkMapListModel>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkSectionModelPointer: CPointer<GtkSectionModel>
        get() = gPointer.reinterpret()

    /**
     * The model being mapped.
     */
    public open val model: ListModel?
        /**
         * Gets the model that is currently being mapped or null if none.
         *
         * @return The model that gets mapped
         */
        get() =
            gtk_map_list_model_get_model(gtkMapListModelPointer.reinterpret())?.run {
                ListModel.wrap(reinterpret())
            }

    /**
     * Creates a new `GtkMapListModel` for the given arguments.
     *
     * @param model The model to map
     * @param mapFunc map function
     * @return a new `GtkMapListModel`
     */
    public constructor(
        model: ListModel? = null,
        mapFunc: MapListModelMapFunc,
    ) : this(
        gtk_map_list_model_new(
            model?.gioListModelPointer,
            MapListModelMapFuncFunc.reinterpret(),
            StableRef.create(mapFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Gets the model that is currently being mapped or null if none.
     *
     * @return The model that gets mapped
     */
    public open fun getModel(): ListModel? =
        gtk_map_list_model_get_model(gtkMapListModelPointer.reinterpret())?.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Checks if a map function is currently set on @self.
     *
     * @return true if a map function is set
     */
    public open fun hasMap(): Boolean = gtk_map_list_model_has_map(gtkMapListModelPointer.reinterpret()).asBoolean()

    /**
     * Sets the function used to map items.
     *
     * The function will be called whenever an item needs to be mapped
     * and must return the item to use for the given input item.
     *
     * Note that `GtkMapListModel` may call this function multiple times
     * on the same item, because it may delete items it doesn't need anymore.
     *
     * GTK makes no effort to ensure that @map_func conforms to the item type
     * of @self. It assumes that the caller knows what they are doing and the map
     * function returns items of the appropriate type.
     *
     * @param mapFunc map function
     */
    public open fun setMapFunc(mapFunc: MapListModelMapFunc): Unit =
        gtk_map_list_model_set_map_func(
            gtkMapListModelPointer.reinterpret(),
            MapListModelMapFuncFunc.reinterpret(),
            StableRef.create(mapFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Sets the model to be mapped.
     *
     * GTK makes no effort to ensure that @model conforms to the item type
     * expected by the map function. It assumes that the caller knows what
     * they are doing and have set up an appropriate map function.
     *
     * @param model The model to be mapped
     */
    public open fun setModel(model: ListModel? = null): Unit =
        gtk_map_list_model_set_model(gtkMapListModelPointer.reinterpret(), model?.gioListModelPointer)

    public companion object : TypeCompanion<MapListModel> {
        override val type: GeneratedClassKGType<MapListModel> =
            GeneratedClassKGType(gtk_map_list_model_get_type()) { MapListModel(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
