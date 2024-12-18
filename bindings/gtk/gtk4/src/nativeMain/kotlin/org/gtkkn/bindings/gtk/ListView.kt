// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkListView
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.gtk_list_view_get_enable_rubberband
import org.gtkkn.native.gtk.gtk_list_view_get_factory
import org.gtkkn.native.gtk.gtk_list_view_get_header_factory
import org.gtkkn.native.gtk.gtk_list_view_get_model
import org.gtkkn.native.gtk.gtk_list_view_get_show_separators
import org.gtkkn.native.gtk.gtk_list_view_get_single_click_activate
import org.gtkkn.native.gtk.gtk_list_view_get_tab_behavior
import org.gtkkn.native.gtk.gtk_list_view_get_type
import org.gtkkn.native.gtk.gtk_list_view_new
import org.gtkkn.native.gtk.gtk_list_view_scroll_to
import org.gtkkn.native.gtk.gtk_list_view_set_enable_rubberband
import org.gtkkn.native.gtk.gtk_list_view_set_factory
import org.gtkkn.native.gtk.gtk_list_view_set_header_factory
import org.gtkkn.native.gtk.gtk_list_view_set_model
import org.gtkkn.native.gtk.gtk_list_view_set_show_separators
import org.gtkkn.native.gtk.gtk_list_view_set_single_click_activate
import org.gtkkn.native.gtk.gtk_list_view_set_tab_behavior
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkListView` presents a large dynamic list of items.
 *
 * `GtkListView` uses its factory to generate one row widget for each visible
 * item and shows them in a linear display, either vertically or horizontally.
 *
 * The [property@Gtk.ListView:show-separators] property offers a simple way to
 * display separators between the rows.
 *
 * `GtkListView` allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on _rubberband selection_, using
 * [property@Gtk.ListView:enable-rubberband].
 *
 * If you need multiple columns with headers, see [class@Gtk.ColumnView].
 *
 * To learn more about the list widget framework, see the
 * [overview](section-list-widget.html).
 *
 * An example of using `GtkListView`:
 * ```c
 * static void
 * setup_listitem_cb (GtkListItemFactory *factory,
 *                    GtkListItem        *list_item)
 * {
 *   GtkWidget *image;
 *
 *   image = gtk_image_new ();
 *   gtk_image_set_icon_size (GTK_IMAGE (image), GTK_ICON_SIZE_LARGE);
 *   gtk_list_item_set_child (list_item, image);
 * }
 *
 * static void
 * bind_listitem_cb (GtkListItemFactory *factory,
 *                   GtkListItem        *list_item)
 * {
 *   GtkWidget *image;
 *   GAppInfo *app_info;
 *
 *   image = gtk_list_item_get_child (list_item);
 *   app_info = gtk_list_item_get_item (list_item);
 *   gtk_image_set_from_gicon (GTK_IMAGE (image), g_app_info_get_icon (app_info));
 * }
 *
 * static void
 * activate_cb (GtkListView  *list,
 *              guint         position,
 *              gpointer      unused)
 * {
 *   GAppInfo *app_info;
 *
 *   app_info = g_list_model_get_item (G_LIST_MODEL (gtk_list_view_get_model (list)), position);
 *   g_app_info_launch (app_info, NULL, NULL, NULL);
 *   g_object_unref (app_info);
 * }
 *
 * ...
 *
 *   model = create_application_list ();
 *
 *   factory = gtk_signal_list_item_factory_new ();
 *   g_signal_connect (factory, "setup", G_CALLBACK (setup_listitem_cb), NULL);
 *   g_signal_connect (factory, "bind", G_CALLBACK (bind_listitem_cb), NULL);
 *
 *   list = gtk_list_view_new (GTK_SELECTION_MODEL (gtk_single_selection_new (model)), factory);
 *
 *   g_signal_connect (list, "activate", G_CALLBACK (activate_cb), NULL);
 *
 *   gtk_scrolled_window_set_child (GTK_SCROLLED_WINDOW (sw), list);
 * ```
 *
 * # CSS nodes
 *
 * ```
 * listview[.separators][.rich-list][.navigation-sidebar][.data-table]
 * ├── row[.activatable]
 * │
 * ├── row[.activatable]
 * │
 * ┊
 * ╰── [rubberband]
 * ```
 *
 * `GtkListView` uses a single CSS node named `listview`. It may carry the
 * `.separators` style class, when [property@Gtk.ListView:show-separators]
 * property is set. Each child widget uses a single CSS node named `row`.
 * If the [property@Gtk.ListItem:activatable] property is set, the
 * corresponding row will have the `.activatable` style class. For
 * rubberband selection, a node with name `rubberband` is used.
 *
 * The main listview node may also carry style classes to select
 * the style of [list presentation](ListContainers.html#list-styles):
 * .rich-list, .navigation-sidebar or .data-table.
 *
 * # Accessibility
 *
 * `GtkListView` uses the %GTK_ACCESSIBLE_ROLE_LIST role, and the list
 * items use the %GTK_ACCESSIBLE_ROLE_LIST_ITEM role.
 */
public open class ListView(pointer: CPointer<GtkListView>) :
    ListBase(pointer.reinterpret()),
    KGTyped {
    public val gtkListViewPointer: CPointer<GtkListView>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = gPointer.reinterpret()

    /**
     * Allow rubberband selection.
     */
    public open var enableRubberband: Boolean
        /**
         * Returns whether rows can be selected by dragging with the mouse.
         *
         * @return true if rubberband selection is enabled
         */
        get() = gtk_list_view_get_enable_rubberband(gtkListViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether selections can be changed by dragging with the mouse.
         *
         * @param enableRubberband true to enable rubberband selection
         */
        set(
            enableRubberband
        ) = gtk_list_view_set_enable_rubberband(gtkListViewPointer.reinterpret(), enableRubberband.asGBoolean())

    /**
     * Factory for populating list items.
     */
    public open var factory: ListItemFactory?
        /**
         * Gets the factory that's currently used to populate list items.
         *
         * @return The factory in use
         */
        get() = gtk_list_view_get_factory(gtkListViewPointer.reinterpret())?.run {
            ListItemFactory(reinterpret())
        }

        /**
         * Sets the `GtkListItemFactory` to use for populating list items.
         *
         * @param factory the factory to use
         */
        set(
            factory
        ) = gtk_list_view_set_factory(
            gtkListViewPointer.reinterpret(),
            factory?.gtkListItemFactoryPointer?.reinterpret()
        )

    /**
     * Factory for creating header widgets.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var headerFactory: ListItemFactory?
        /**
         * Gets the factory that's currently used to populate section headers.
         *
         * @return The factory in use
         * @since 4.12
         */
        get() = gtk_list_view_get_header_factory(gtkListViewPointer.reinterpret())?.run {
            ListItemFactory(reinterpret())
        }

        /**
         * Sets the `GtkListItemFactory` to use for populating the
         * [class@Gtk.ListHeader] objects used in section headers.
         *
         * If this factory is set to null, the list will not show section headers.
         *
         * @param factory the factory to use
         * @since 4.12
         */
        @GtkVersion4_12
        set(
            factory
        ) = gtk_list_view_set_header_factory(
            gtkListViewPointer.reinterpret(),
            factory?.gtkListItemFactoryPointer?.reinterpret()
        )

    /**
     * Model for the items displayed.
     */
    public open var model: SelectionModel?
        /**
         * Gets the model that's currently used to read the items displayed.
         *
         * @return The model in use
         */
        get() = gtk_list_view_get_model(gtkListViewPointer.reinterpret())?.run {
            SelectionModel.wrap(reinterpret())
        }

        /**
         * Sets the model to use.
         *
         * This must be a [iface@Gtk.SelectionModel] to use.
         *
         * @param model the model to use
         */
        set(model) = gtk_list_view_set_model(gtkListViewPointer.reinterpret(), model?.gtkSelectionModelPointer)

    /**
     * Show separators between rows.
     */
    public open var showSeparators: Boolean
        /**
         * Returns whether the list box should show separators
         * between rows.
         *
         * @return true if the list box shows separators
         */
        get() = gtk_list_view_get_show_separators(gtkListViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the list box should show separators
         * between rows.
         *
         * @param showSeparators true to show separators
         */
        set(
            showSeparators
        ) = gtk_list_view_set_show_separators(gtkListViewPointer.reinterpret(), showSeparators.asGBoolean())

    /**
     * Activate rows on single click and select them on hover.
     */
    public open var singleClickActivate: Boolean
        /**
         * Returns whether rows will be activated on single click and
         * selected on hover.
         *
         * @return true if rows are activated on single click
         */
        get() = gtk_list_view_get_single_click_activate(gtkListViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether rows should be activated on single click and
         * selected on hover.
         *
         * @param singleClickActivate true to activate items on single click
         */
        set(
            singleClickActivate
        ) = gtk_list_view_set_single_click_activate(gtkListViewPointer.reinterpret(), singleClickActivate.asGBoolean())

    /**
     * Behavior of the <kbd>Tab</kbd> key
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var tabBehavior: ListTabBehavior
        /**
         * Gets the behavior set for the <kbd>Tab</kbd> key.
         *
         * @return The behavior of the <kbd>Tab</kbd> key
         * @since 4.12
         */
        get() = gtk_list_view_get_tab_behavior(gtkListViewPointer.reinterpret()).run {
            ListTabBehavior.fromNativeValue(this)
        }

        /**
         * Sets the behavior of the <kbd>Tab</kbd> and <kbd>Shift</kbd>+<kbd>Tab</kbd> keys.
         *
         * @param tabBehavior The desired tab behavior
         * @since 4.12
         */
        @GtkVersion4_12
        set(tabBehavior) = gtk_list_view_set_tab_behavior(gtkListViewPointer.reinterpret(), tabBehavior.nativeValue)

    /**
     * Creates a new `GtkListView` that uses the given @factory for
     * mapping items to widgets.
     *
     * The function takes ownership of the
     * arguments, so you can write code like
     * ```c
     * list_view = gtk_list_view_new (create_model (),
     *   gtk_builder_list_item_factory_new_from_resource ("/resource.ui"));
     * ```
     *
     * @param model the model to use
     * @param factory The factory to populate items with
     * @return a new `GtkListView` using the given @model and @factory
     */
    public constructor(
        model: SelectionModel? = null,
        factory: ListItemFactory? = null,
    ) : this(
        gtk_list_view_new(
            model?.gtkSelectionModelPointer,
            factory?.gtkListItemFactoryPointer?.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Scrolls to the item at the given position and performs the actions
     * specified in @flags.
     *
     * This function works no matter if the listview is shown or focused.
     * If it isn't, then the changes will take effect once that happens.
     *
     * @param pos position of the item
     * @param flags actions to perform
     * @param scroll details of how to perform
     *   the scroll operation or null to scroll into view
     * @since 4.12
     */
    @GtkVersion4_12
    public open fun scrollTo(pos: guint, flags: ListScrollFlags, scroll: ScrollInfo? = null): Unit =
        gtk_list_view_scroll_to(
            gtkListViewPointer.reinterpret(),
            pos,
            flags.mask,
            scroll?.gtkScrollInfoPointer?.reinterpret()
        )

    /**
     * Emitted when a row has been activated by the user,
     * usually via activating the GtkListView|list.activate-item action.
     *
     * This allows for a convenient way to handle activation in a listview.
     * See [method@Gtk.ListItem.set_activatable] for details on how to use
     * this signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `position` position of item to activate
     */
    public fun connectActivate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (position: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "activate",
        connectActivateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<ListView> {
        override val type: GeneratedClassKGType<ListView> =
            GeneratedClassKGType(gtk_list_view_get_type()) { ListView(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ListView
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_list_view_get_type()
    }
}

private val connectActivateFunc: CPointer<CFunction<(guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        position: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(position: guint) -> Unit>().get().invoke(position)
}
    .reinterpret()
