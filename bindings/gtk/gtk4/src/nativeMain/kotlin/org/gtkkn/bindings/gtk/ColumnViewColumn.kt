// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkColumnViewColumn
import org.gtkkn.native.gtk.gtk_column_view_column_get_column_view
import org.gtkkn.native.gtk.gtk_column_view_column_get_expand
import org.gtkkn.native.gtk.gtk_column_view_column_get_factory
import org.gtkkn.native.gtk.gtk_column_view_column_get_fixed_width
import org.gtkkn.native.gtk.gtk_column_view_column_get_header_menu
import org.gtkkn.native.gtk.gtk_column_view_column_get_id
import org.gtkkn.native.gtk.gtk_column_view_column_get_resizable
import org.gtkkn.native.gtk.gtk_column_view_column_get_sorter
import org.gtkkn.native.gtk.gtk_column_view_column_get_title
import org.gtkkn.native.gtk.gtk_column_view_column_get_type
import org.gtkkn.native.gtk.gtk_column_view_column_get_visible
import org.gtkkn.native.gtk.gtk_column_view_column_new
import org.gtkkn.native.gtk.gtk_column_view_column_set_expand
import org.gtkkn.native.gtk.gtk_column_view_column_set_factory
import org.gtkkn.native.gtk.gtk_column_view_column_set_fixed_width
import org.gtkkn.native.gtk.gtk_column_view_column_set_header_menu
import org.gtkkn.native.gtk.gtk_column_view_column_set_id
import org.gtkkn.native.gtk.gtk_column_view_column_set_resizable
import org.gtkkn.native.gtk.gtk_column_view_column_set_sorter
import org.gtkkn.native.gtk.gtk_column_view_column_set_title
import org.gtkkn.native.gtk.gtk_column_view_column_set_visible
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * `GtkColumnViewColumn` represents the columns being added to a `GtkColumnView`.
 *
 * The main ingredient for a `GtkColumnViewColumn` is the `GtkListItemFactory`
 * that tells the columnview how to create cells for this column from items in
 * the model.
 *
 * Columns have a title, and can optionally have a header menu set
 * with [method@Gtk.ColumnViewColumn.set_header_menu].
 *
 * A sorter can be associated with a column using
 * [method@Gtk.ColumnViewColumn.set_sorter], to let users influence sorting
 * by clicking on the column header.
 */
public open class ColumnViewColumn(
    pointer: CPointer<GtkColumnViewColumn>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkColumnViewColumnPointer: CPointer<GtkColumnViewColumn>
        get() = gPointer.reinterpret()

    /**
     * The `GtkColumnView` this column is a part of.
     */
    public open val columnView: ColumnView?
        /**
         * Gets the column view that's currently displaying this column.
         *
         * If @self has not been added to a column view yet, null is returned.
         *
         * @return The column view displaying @self.
         */
        get() =
            gtk_column_view_column_get_column_view(gtkColumnViewColumnPointer.reinterpret())?.run {
                ColumnView(reinterpret())
            }

    /**
     * Column gets share of extra width allocated to the view.
     */
    public open var expand: Boolean
        /**
         * Returns whether this column should expand.
         *
         * @return true if this column expands
         */
        get() = gtk_column_view_column_get_expand(gtkColumnViewColumnPointer.reinterpret()).asBoolean()

        /**
         * Sets the column to take available extra space.
         *
         * The extra space is shared equally amongst all columns that
         * have the expand set to true.
         *
         * @param expand true if this column should expand to fill available sace
         */
        set(expand) = gtk_column_view_column_set_expand(gtkColumnViewColumnPointer.reinterpret(), expand.asGBoolean())

    /**
     * Factory for populating list items.
     */
    public open var factory: ListItemFactory?
        /**
         * Gets the factory that's currently used to populate list items for
         * this column.
         *
         * @return The factory in use
         */
        get() =
            gtk_column_view_column_get_factory(gtkColumnViewColumnPointer.reinterpret())?.run {
                ListItemFactory(reinterpret())
            }

        /**
         * Sets the `GtkListItemFactory` to use for populating list items for this
         * column.
         *
         * @param factory the factory to use
         */
        set(
            factory
        ) =
            gtk_column_view_column_set_factory(
                gtkColumnViewColumnPointer.reinterpret(),
                factory?.gtkListItemFactoryPointer?.reinterpret()
            )

    /**
     * If not -1, this is the width that the column is allocated,
     * regardless of the size of its content.
     */
    public open var fixedWidth: Int
        /**
         * Gets the fixed width of the column.
         *
         * @return the fixed with of the column
         */
        get() = gtk_column_view_column_get_fixed_width(gtkColumnViewColumnPointer.reinterpret())

        /**
         * If @fixed_width is not -1, sets the fixed width of @column;
         * otherwise unsets it.
         *
         * Setting a fixed width overrides the automatically calculated
         * width. Interactive resizing also sets the “fixed-width” property.
         *
         * @param fixedWidth the new fixed width, or -1
         */
        set(fixedWidth) = gtk_column_view_column_set_fixed_width(gtkColumnViewColumnPointer.reinterpret(), fixedWidth)

    /**
     * Menu model used to create the context menu for the column header.
     */
    public open var headerMenu: MenuModel?
        /**
         * Gets the menu model that is used to create the context menu
         * for the column header.
         *
         * @return the `GMenuModel`
         */
        get() =
            gtk_column_view_column_get_header_menu(gtkColumnViewColumnPointer.reinterpret())?.run {
                MenuModel(reinterpret())
            }

        /**
         * Sets the menu model that is used to create the context menu
         * for the column header.
         *
         * @param menu a `GMenuModel`
         */
        set(
            menu
        ) =
            gtk_column_view_column_set_header_menu(
                gtkColumnViewColumnPointer.reinterpret(),
                menu?.gioMenuModelPointer?.reinterpret()
            )

    /**
     * An ID for the column.
     *
     * GTK is not currently using the ID for anything, but
     * it can be used by applications when saving column view
     * configurations.
     *
     * It is up to applications to ensure uniqueness of IDs.
     *
     * @since 4.10
     */
    public open var id: String?
        /**
         * Returns the ID set with gtk_column_view_column_set_id().
         *
         * @return The column's ID
         * @since 4.10
         */
        get() = gtk_column_view_column_get_id(gtkColumnViewColumnPointer.reinterpret())?.toKString()

        /**
         * Sets the id of this column.
         *
         * GTK makes no use of this, but applications can use it when
         * storing column view configuration.
         *
         * It is up to callers to ensure uniqueness of IDs.
         *
         * @param id ID to use for this column
         * @since 4.10
         */
        set(id) = gtk_column_view_column_set_id(gtkColumnViewColumnPointer.reinterpret(), id)

    /**
     * Whether this column is resizable.
     */
    public open var resizable: Boolean
        /**
         * Returns whether this column is resizable.
         *
         * @return true if this column is resizable
         */
        get() = gtk_column_view_column_get_resizable(gtkColumnViewColumnPointer.reinterpret()).asBoolean()

        /**
         * Sets whether this column should be resizable by dragging.
         *
         * @param resizable whether this column should be resizable
         */
        set(
            resizable
        ) = gtk_column_view_column_set_resizable(gtkColumnViewColumnPointer.reinterpret(), resizable.asGBoolean())

    /**
     * Sorter for sorting items according to this column.
     */
    public open var sorter: Sorter?
        /**
         * Returns the sorter that is associated with the column.
         *
         * @return the `GtkSorter` of @self
         */
        get() =
            gtk_column_view_column_get_sorter(gtkColumnViewColumnPointer.reinterpret())?.run {
                Sorter(reinterpret())
            }

        /**
         * Associates a sorter with the column.
         *
         * If @sorter is null, the column will not let users change
         * the sorting by clicking on its header.
         *
         * This sorter can be made active by clicking on the column
         * header, or by calling [method@Gtk.ColumnView.sort_by_column].
         *
         * See [method@Gtk.ColumnView.get_sorter] for the necessary steps
         * for setting up customizable sorting for [class@Gtk.ColumnView].
         *
         * @param sorter the `GtkSorter` to associate with @column
         */
        set(
            sorter
        ) =
            gtk_column_view_column_set_sorter(
                gtkColumnViewColumnPointer.reinterpret(),
                sorter?.gtkSorterPointer?.reinterpret()
            )

    /**
     * Title displayed in the header.
     */
    public open var title: String?
        /**
         * Returns the title set with gtk_column_view_column_set_title().
         *
         * @return The column's title
         */
        get() = gtk_column_view_column_get_title(gtkColumnViewColumnPointer.reinterpret())?.toKString()

        /**
         * Sets the title of this column.
         *
         * The title is displayed in the header of a `GtkColumnView`
         * for this column and is therefore user-facing text that should
         * be translated.
         *
         * @param title Title to use for this column
         */
        set(title) = gtk_column_view_column_set_title(gtkColumnViewColumnPointer.reinterpret(), title)

    /**
     * Whether this column is visible.
     */
    public open var visible: Boolean
        /**
         * Returns whether this column is visible.
         *
         * @return true if this column is visible
         */
        get() = gtk_column_view_column_get_visible(gtkColumnViewColumnPointer.reinterpret()).asBoolean()

        /**
         * Sets whether this column should be visible in views.
         *
         * @param visible whether this column should be visible
         */
        set(
            visible
        ) = gtk_column_view_column_set_visible(gtkColumnViewColumnPointer.reinterpret(), visible.asGBoolean())

    /**
     * Creates a new `GtkColumnViewColumn` that uses the given @factory for
     * mapping items to widgets.
     *
     * You most likely want to call [method@Gtk.ColumnView.append_column] next.
     *
     * The function takes ownership of the argument, so you can write code like:
     *
     * ```c
     * column = gtk_column_view_column_new (_("Name"),
     *   gtk_builder_list_item_factory_new_from_resource ("/name.ui"));
     * ```
     *
     * @param title Title to use for this column
     * @param factory The factory to populate items with
     * @return a new `GtkColumnViewColumn` using the given @factory
     */
    public constructor(
        title: String? = null,
        factory: ListItemFactory? = null,
    ) : this(gtk_column_view_column_new(title, factory?.gtkListItemFactoryPointer?.reinterpret())!!.reinterpret())

    /**
     * Gets the column view that's currently displaying this column.
     *
     * If @self has not been added to a column view yet, null is returned.
     *
     * @return The column view displaying @self.
     */
    public open fun getColumnView(): ColumnView? =
        gtk_column_view_column_get_column_view(gtkColumnViewColumnPointer.reinterpret())?.run {
            ColumnView(reinterpret())
        }

    /**
     * Returns whether this column should expand.
     *
     * @return true if this column expands
     */
    public open fun getExpand(): Boolean =
        gtk_column_view_column_get_expand(gtkColumnViewColumnPointer.reinterpret()).asBoolean()

    /**
     * Gets the factory that's currently used to populate list items for
     * this column.
     *
     * @return The factory in use
     */
    public open fun getFactory(): ListItemFactory? =
        gtk_column_view_column_get_factory(gtkColumnViewColumnPointer.reinterpret())?.run {
            ListItemFactory(reinterpret())
        }

    /**
     * Gets the fixed width of the column.
     *
     * @return the fixed with of the column
     */
    public open fun getFixedWidth(): Int =
        gtk_column_view_column_get_fixed_width(gtkColumnViewColumnPointer.reinterpret())

    /**
     * Gets the menu model that is used to create the context menu
     * for the column header.
     *
     * @return the `GMenuModel`
     */
    public open fun getHeaderMenu(): MenuModel? =
        gtk_column_view_column_get_header_menu(gtkColumnViewColumnPointer.reinterpret())?.run {
            MenuModel(reinterpret())
        }

    /**
     * Returns the ID set with gtk_column_view_column_set_id().
     *
     * @return The column's ID
     * @since 4.10
     */
    public open fun getId(): String? =
        gtk_column_view_column_get_id(gtkColumnViewColumnPointer.reinterpret())?.toKString()

    /**
     * Returns whether this column is resizable.
     *
     * @return true if this column is resizable
     */
    public open fun getResizable(): Boolean =
        gtk_column_view_column_get_resizable(gtkColumnViewColumnPointer.reinterpret()).asBoolean()

    /**
     * Returns the sorter that is associated with the column.
     *
     * @return the `GtkSorter` of @self
     */
    public open fun getSorter(): Sorter? =
        gtk_column_view_column_get_sorter(gtkColumnViewColumnPointer.reinterpret())?.run {
            Sorter(reinterpret())
        }

    /**
     * Returns the title set with gtk_column_view_column_set_title().
     *
     * @return The column's title
     */
    public open fun getTitle(): String? =
        gtk_column_view_column_get_title(gtkColumnViewColumnPointer.reinterpret())?.toKString()

    /**
     * Returns whether this column is visible.
     *
     * @return true if this column is visible
     */
    public open fun getVisible(): Boolean =
        gtk_column_view_column_get_visible(gtkColumnViewColumnPointer.reinterpret()).asBoolean()

    /**
     * Sets the column to take available extra space.
     *
     * The extra space is shared equally amongst all columns that
     * have the expand set to true.
     *
     * @param expand true if this column should expand to fill available sace
     */
    public open fun setExpand(expand: Boolean): Unit =
        gtk_column_view_column_set_expand(gtkColumnViewColumnPointer.reinterpret(), expand.asGBoolean())

    /**
     * Sets the `GtkListItemFactory` to use for populating list items for this
     * column.
     *
     * @param factory the factory to use
     */
    public open fun setFactory(factory: ListItemFactory? = null): Unit =
        gtk_column_view_column_set_factory(
            gtkColumnViewColumnPointer.reinterpret(),
            factory?.gtkListItemFactoryPointer?.reinterpret()
        )

    /**
     * If @fixed_width is not -1, sets the fixed width of @column;
     * otherwise unsets it.
     *
     * Setting a fixed width overrides the automatically calculated
     * width. Interactive resizing also sets the “fixed-width” property.
     *
     * @param fixedWidth the new fixed width, or -1
     */
    public open fun setFixedWidth(fixedWidth: Int): Unit =
        gtk_column_view_column_set_fixed_width(gtkColumnViewColumnPointer.reinterpret(), fixedWidth)

    /**
     * Sets the menu model that is used to create the context menu
     * for the column header.
     *
     * @param menu a `GMenuModel`
     */
    public open fun setHeaderMenu(menu: MenuModel? = null): Unit =
        gtk_column_view_column_set_header_menu(
            gtkColumnViewColumnPointer.reinterpret(),
            menu?.gioMenuModelPointer?.reinterpret()
        )

    /**
     * Sets the id of this column.
     *
     * GTK makes no use of this, but applications can use it when
     * storing column view configuration.
     *
     * It is up to callers to ensure uniqueness of IDs.
     *
     * @param id ID to use for this column
     * @since 4.10
     */
    public open fun setId(id: String? = null): Unit =
        gtk_column_view_column_set_id(gtkColumnViewColumnPointer.reinterpret(), id)

    /**
     * Sets whether this column should be resizable by dragging.
     *
     * @param resizable whether this column should be resizable
     */
    public open fun setResizable(resizable: Boolean): Unit =
        gtk_column_view_column_set_resizable(gtkColumnViewColumnPointer.reinterpret(), resizable.asGBoolean())

    /**
     * Associates a sorter with the column.
     *
     * If @sorter is null, the column will not let users change
     * the sorting by clicking on its header.
     *
     * This sorter can be made active by clicking on the column
     * header, or by calling [method@Gtk.ColumnView.sort_by_column].
     *
     * See [method@Gtk.ColumnView.get_sorter] for the necessary steps
     * for setting up customizable sorting for [class@Gtk.ColumnView].
     *
     * @param sorter the `GtkSorter` to associate with @column
     */
    public open fun setSorter(sorter: Sorter? = null): Unit =
        gtk_column_view_column_set_sorter(
            gtkColumnViewColumnPointer.reinterpret(),
            sorter?.gtkSorterPointer?.reinterpret()
        )

    /**
     * Sets the title of this column.
     *
     * The title is displayed in the header of a `GtkColumnView`
     * for this column and is therefore user-facing text that should
     * be translated.
     *
     * @param title Title to use for this column
     */
    public open fun setTitle(title: String? = null): Unit =
        gtk_column_view_column_set_title(gtkColumnViewColumnPointer.reinterpret(), title)

    /**
     * Sets whether this column should be visible in views.
     *
     * @param visible whether this column should be visible
     */
    public open fun setVisible(visible: Boolean): Unit =
        gtk_column_view_column_set_visible(gtkColumnViewColumnPointer.reinterpret(), visible.asGBoolean())

    public companion object : TypeCompanion<ColumnViewColumn> {
        override val type: GeneratedClassKGType<ColumnViewColumn> =
            GeneratedClassKGType(gtk_column_view_column_get_type()) { ColumnViewColumn(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
