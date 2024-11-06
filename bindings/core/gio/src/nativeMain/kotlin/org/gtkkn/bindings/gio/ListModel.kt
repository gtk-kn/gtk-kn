// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gio.g_list_model_get_item_type
import org.gtkkn.native.gio.g_list_model_get_n_items
import org.gtkkn.native.gio.g_list_model_get_object
import org.gtkkn.native.gio.g_list_model_get_type
import org.gtkkn.native.gio.g_list_model_items_changed
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * `GListModel` is an interface that represents a mutable list of
 * [class@GObject.Object]. Its main intention is as a model for various widgets
 * in user interfaces, such as list views, but it can also be used as a
 * convenient method of returning lists of data, with support for
 * updates.
 *
 * Each object in the list may also report changes in itself via some
 * mechanism (normally the [signal@GObject.Object::notify] signal).  Taken
 * together with the [signal@Gio.ListModel::items-changed] signal, this provides
 * for a list that can change its membership, and in which the members can
 * change their individual properties.
 *
 * A good example would be the list of visible wireless network access
 * points, where each access point can report dynamic properties such as
 * signal strength.
 *
 * It is important to note that the `GListModel` itself does not report
 * changes to the individual items.  It only reports changes to the list
 * membership.  If you want to observe changes to the objects themselves
 * then you need to connect signals to the objects that you are
 * interested in.
 *
 * All items in a `GListModel` are of (or derived from) the same type.
 * [method@Gio.ListModel.get_item_type] returns that type.  The type may be an
 * interface, in which case all objects in the list must implement it.
 *
 * The semantics are close to that of an array:
 * [method@Gio.ListModel.get_n_items] returns the number of items in the list
 * and [method@Gio.ListModel.get_item] returns an item at a (0-based) position.
 * In order to allow implementations to calculate the list length lazily,
 * you can also iterate over items: starting from 0, repeatedly call
 * [method@Gio.ListModel.get_item] until it returns `NULL`.
 *
 * An implementation may create objects lazily, but must take care to
 * return the same object for a given position until all references to
 * it are gone.
 *
 * On the other side, a consumer is expected only to hold references on
 * objects that are currently ‘user visible’, in order to facilitate the
 * maximum level of laziness in the implementation of the list and to
 * reduce the required number of signal connections at a given time.
 *
 * This interface is intended only to be used from a single thread.  The
 * thread in which it is appropriate to use it depends on the particular
 * implementation, but typically it will be from the thread that owns
 * the thread-default main context (see
 * [method@GLib.MainContext.push_thread_default]) in effect at the time that the
 * model was created.
 *
 * Over time, it has established itself as good practice for list model
 * implementations to provide properties `item-type` and `n-items` to
 * ease working with them. While it is not required, it is recommended
 * that implementations provide these two properties. They should return
 * the values of [method@Gio.ListModel.get_item_type] and
 * [method@Gio.ListModel.get_n_items] respectively and be defined as such:
 *
 * ```c
 * properties[PROP_ITEM_TYPE] =
 *   g_param_spec_gtype ("item-type", NULL, NULL, G_TYPE_OBJECT,
 *                       G_PARAM_CONSTRUCT_ONLY | G_PARAM_READWRITE | G_PARAM_STATIC_STRINGS);
 * properties[PROP_N_ITEMS] =
 *   g_param_spec_uint ("n-items", NULL, NULL, 0, G_MAXUINT, 0,
 *                      G_PARAM_READABLE | G_PARAM_STATIC_STRINGS);
 * ```
 */
public interface ListModel :
    Interface,
    KGTyped {
    public val gioListModelPointer: CPointer<GListModel>

    /**
     * Gets the type of the items in @list.
     *
     * All items returned from g_list_model_get_item() are of the type
     * returned by this function, or a subtype, or if the type is an
     * interface, they are an implementation of that interface.
     *
     * The item type of a #GListModel can not change during the life of the
     * model.
     *
     * @return the #GType of the items contained in @list.
     * @since 2.44
     */
    @GioVersion2_44
    public fun getItemType(): ULong = g_list_model_get_item_type(gioListModelPointer.reinterpret())

    /**
     * Gets the number of items in @list.
     *
     * Depending on the model implementation, calling this function may be
     * less efficient than iterating the list with increasing values for
     * @position until g_list_model_get_item() returns null.
     *
     * @return the number of items in @list.
     * @since 2.44
     */
    @GioVersion2_44
    public fun getNItems(): UInt = g_list_model_get_n_items(gioListModelPointer.reinterpret())

    /**
     * Get the item at @position.
     *
     * If @position is greater than the number of items in @list, null is
     * returned.
     *
     * null is never returned for an index that is smaller than the length
     * of the list.
     *
     * This function is meant to be used by language bindings in place
     * of g_list_model_get_item().
     *
     * See also: g_list_model_get_n_items()
     *
     * @param position the position of the item to fetch
     * @return the object at @position.
     * @since 2.44
     */
    @GioVersion2_44
    public fun getItem(position: UInt): Object? =
        g_list_model_get_object(gioListModelPointer.reinterpret(), position)?.run {
            Object(reinterpret())
        }

    /**
     * Emits the #GListModel::items-changed signal on @list.
     *
     * This function should only be called by classes implementing
     * #GListModel. It has to be called after the internal representation
     * of @list has been updated, because handlers connected to this signal
     * might query the new state of the list.
     *
     * Implementations must only make changes to the model (as visible to
     * its consumer) in places that will not cause problems for that
     * consumer.  For models that are driven directly by a write API (such
     * as #GListStore), changes can be reported in response to uses of that
     * API.  For models that represent remote data, changes should only be
     * made from a fresh mainloop dispatch.  It is particularly not
     * permitted to make changes in response to a call to the #GListModel
     * consumer API.
     *
     * Stated another way: in general, it is assumed that code making a
     * series of accesses to the model via the API, without returning to the
     * mainloop, and without calling other code, will continue to view the
     * same contents of the model.
     *
     * @param position the position at which @list changed
     * @param removed the number of items removed
     * @param added the number of items added
     * @since 2.44
     */
    @GioVersion2_44
    public fun itemsChanged(
        position: UInt,
        removed: UInt,
        added: UInt,
    ): Unit = g_list_model_items_changed(gioListModelPointer.reinterpret(), position, removed, added)

    /**
     * This signal is emitted whenever items were added to or removed
     * from @list. At @position, @removed items were removed and @added
     * items were added in their place.
     *
     * Note: If `removed != added`, the positions of all later items
     * in the model change.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `position` the position at which @list changed; `removed` the number of items removed; `added` the number of items added
     * @since 2.44
     */
    @GioVersion2_44
    public fun connectItemsChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            position: UInt,
            removed: UInt,
            added: UInt,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gioListModelPointer.reinterpret(),
            "items-changed",
            connectItemsChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<GListModel>,
    ) : ListModel {
        override val gioListModelPointer: CPointer<GListModel> = pointer
    }

    public companion object : TypeCompanion<ListModel> {
        override val type: GeneratedInterfaceKGType<ListModel> =
            GeneratedInterfaceKGType(g_list_model_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GListModel>): ListModel = Wrapper(pointer)
    }
}

private val connectItemsChangedFunc: CPointer<
    CFunction<
        (
            UInt,
            UInt,
            UInt,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            position: UInt,
            removed: UInt,
            added: UInt,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    position: UInt,
                    removed: UInt,
                    added: UInt,
                ) -> Unit
            >()
            .get()
            .invoke(position, removed, added)
    }.reinterpret()
