// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkDirectionType
import org.gtkkn.native.gtk.GtkNotebook
import org.gtkkn.native.gtk.GtkNotebookTab
import org.gtkkn.native.gtk.GtkWidget
import org.gtkkn.native.gtk.gtk_notebook_append_page
import org.gtkkn.native.gtk.gtk_notebook_append_page_menu
import org.gtkkn.native.gtk.gtk_notebook_detach_tab
import org.gtkkn.native.gtk.gtk_notebook_get_action_widget
import org.gtkkn.native.gtk.gtk_notebook_get_current_page
import org.gtkkn.native.gtk.gtk_notebook_get_group_name
import org.gtkkn.native.gtk.gtk_notebook_get_menu_label
import org.gtkkn.native.gtk.gtk_notebook_get_menu_label_text
import org.gtkkn.native.gtk.gtk_notebook_get_n_pages
import org.gtkkn.native.gtk.gtk_notebook_get_nth_page
import org.gtkkn.native.gtk.gtk_notebook_get_page
import org.gtkkn.native.gtk.gtk_notebook_get_pages
import org.gtkkn.native.gtk.gtk_notebook_get_scrollable
import org.gtkkn.native.gtk.gtk_notebook_get_show_border
import org.gtkkn.native.gtk.gtk_notebook_get_show_tabs
import org.gtkkn.native.gtk.gtk_notebook_get_tab_detachable
import org.gtkkn.native.gtk.gtk_notebook_get_tab_label
import org.gtkkn.native.gtk.gtk_notebook_get_tab_label_text
import org.gtkkn.native.gtk.gtk_notebook_get_tab_pos
import org.gtkkn.native.gtk.gtk_notebook_get_tab_reorderable
import org.gtkkn.native.gtk.gtk_notebook_get_type
import org.gtkkn.native.gtk.gtk_notebook_insert_page
import org.gtkkn.native.gtk.gtk_notebook_insert_page_menu
import org.gtkkn.native.gtk.gtk_notebook_new
import org.gtkkn.native.gtk.gtk_notebook_next_page
import org.gtkkn.native.gtk.gtk_notebook_page_num
import org.gtkkn.native.gtk.gtk_notebook_popup_disable
import org.gtkkn.native.gtk.gtk_notebook_popup_enable
import org.gtkkn.native.gtk.gtk_notebook_prepend_page
import org.gtkkn.native.gtk.gtk_notebook_prepend_page_menu
import org.gtkkn.native.gtk.gtk_notebook_prev_page
import org.gtkkn.native.gtk.gtk_notebook_remove_page
import org.gtkkn.native.gtk.gtk_notebook_reorder_child
import org.gtkkn.native.gtk.gtk_notebook_set_action_widget
import org.gtkkn.native.gtk.gtk_notebook_set_current_page
import org.gtkkn.native.gtk.gtk_notebook_set_group_name
import org.gtkkn.native.gtk.gtk_notebook_set_menu_label
import org.gtkkn.native.gtk.gtk_notebook_set_menu_label_text
import org.gtkkn.native.gtk.gtk_notebook_set_scrollable
import org.gtkkn.native.gtk.gtk_notebook_set_show_border
import org.gtkkn.native.gtk.gtk_notebook_set_show_tabs
import org.gtkkn.native.gtk.gtk_notebook_set_tab_detachable
import org.gtkkn.native.gtk.gtk_notebook_set_tab_label
import org.gtkkn.native.gtk.gtk_notebook_set_tab_label_text
import org.gtkkn.native.gtk.gtk_notebook_set_tab_pos
import org.gtkkn.native.gtk.gtk_notebook_set_tab_reorderable
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkNotebook` is a container whose children are pages switched
 * between using tabs.
 *
 * ![An example GtkNotebook](notebook.png)
 *
 * There are many configuration options for `GtkNotebook`. Among
 * other things, you can choose on which edge the tabs appear
 * (see [method@Gtk.Notebook.set_tab_pos]), whether, if there are
 * too many tabs to fit the notebook should be made bigger or scrolling
 * arrows added (see [method@Gtk.Notebook.set_scrollable]), and whether
 * there will be a popup menu allowing the users to switch pages.
 * (see [method@Gtk.Notebook.popup_enable]).
 *
 * # GtkNotebook as GtkBuildable
 *
 * The `GtkNotebook` implementation of the `GtkBuildable` interface
 * supports placing children into tabs by specifying “tab” as the
 * “type” attribute of a `<child>` element. Note that the content
 * of the tab must be created before the tab can be filled.
 * A tab child can be specified without specifying a `<child>`
 * type attribute.
 *
 * To add a child widget in the notebooks action area, specify
 * "action-start" or “action-end” as the “type” attribute of the
 * `<child>` element.
 *
 * An example of a UI definition fragment with `GtkNotebook`:
 *
 * ```xml
 * <object class="GtkNotebook">
 *   <child>
 *     <object class="GtkLabel" id="notebook-content">
 *       <property name="label">Content</property>
 *     </object>
 *   </child>
 *   <child type="tab">
 *     <object class="GtkLabel" id="notebook-tab">
 *       <property name="label">Tab</property>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * # CSS nodes
 *
 * ```
 * notebook
 * ├── header.top
 * │   ├── [<action widget>]
 * │   ├── tabs
 * │   │   ├── [arrow]
 * │   │   ├── tab
 * │   │   │   ╰── <tab label>
 * ┊   ┊   ┊
 * │   │   ├── tab[.reorderable-page]
 * │   │   │   ╰── <tab label>
 * │   │   ╰── [arrow]
 * │   ╰── [<action widget>]
 * │
 * ╰── stack
 *     ├── <child>
 *     ┊
 *     ╰── <child>
 * ```
 *
 * `GtkNotebook` has a main CSS node with name `notebook`, a subnode
 * with name `header` and below that a subnode with name `tabs` which
 * contains one subnode per tab with name `tab`.
 *
 * If action widgets are present, their CSS nodes are placed next
 * to the `tabs` node. If the notebook is scrollable, CSS nodes with
 * name `arrow` are placed as first and last child of the `tabs` node.
 *
 * The main node gets the `.frame` style class when the notebook
 * has a border (see [method@Gtk.Notebook.set_show_border]).
 *
 * The header node gets one of the style class `.top`, `.bottom`,
 * `.left` or `.right`, depending on where the tabs are placed. For
 * reorderable pages, the tab node gets the `.reorderable-page` class.
 *
 * A `tab` node gets the `.dnd` style class while it is moved with drag-and-drop.
 *
 * The nodes are always arranged from left-to-right, regardless of text direction.
 *
 * # Accessibility
 *
 * `GtkNotebook` uses the following roles:
 *
 *  - %GTK_ACCESSIBLE_ROLE_GROUP for the notebook widget
 *  - %GTK_ACCESSIBLE_ROLE_TAB_LIST for the list of tabs
 *  - %GTK_ACCESSIBLE_ROLE_TAB role for each tab
 *  - %GTK_ACCESSIBLE_ROLE_TAB_PANEL for each page
 *
 * ## Skipped during bindings generation
 *
 * - method `enable-popup`: Property has no getter nor setter
 * - method `page`: Property has no getter nor setter
 */
public open class Notebook(pointer: CPointer<GtkNotebook>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkNotebookPointer: CPointer<GtkNotebook>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Group name for tab drag and drop.
     */
    public open var groupName: String?
        /**
         * Gets the current group name for @notebook.
         *
         * @return the group name,
         *   or null if none is set
         */
        get() = gtk_notebook_get_group_name(gtkNotebookPointer)?.toKString()

        /**
         * Sets a group name for @notebook.
         *
         * Notebooks with the same name will be able to exchange tabs
         * via drag and drop. A notebook with a null group name will
         * not be able to exchange tabs with any other notebook.
         *
         * @param groupName the name of the notebook group,
         *   or null to unset it
         */
        set(groupName) = gtk_notebook_set_group_name(gtkNotebookPointer, groupName)

    /**
     * A selection model with the pages.
     */
    public open val pages: ListModel
        /**
         * Returns a `GListModel` that contains the pages of the notebook.
         *
         * This can be used to keep an up-to-date view. The model also
         * implements [iface@Gtk.SelectionModel] and can be used to track
         * and modify the visible page.
         *
         * @return a
         *   `GListModel` for the notebook's children
         */
        get() = gtk_notebook_get_pages(gtkNotebookPointer)!!.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * If true, scroll arrows are added if there are too many pages to fit.
     */
    public open var scrollable: Boolean
        /**
         * Returns whether the tab label area has arrows for scrolling.
         *
         * @return true if arrows for scrolling are present
         */
        get() = gtk_notebook_get_scrollable(gtkNotebookPointer).asBoolean()

        /**
         * Sets whether the tab label area will have arrows for
         * scrolling if there are too many tabs to fit in the area.
         *
         * @param scrollable true if scroll arrows should be added
         */
        set(scrollable) = gtk_notebook_set_scrollable(gtkNotebookPointer, scrollable.asGBoolean())

    /**
     * Whether the border should be shown.
     */
    public open var showBorder: Boolean
        /**
         * Returns whether a bevel will be drawn around the notebook pages.
         *
         * @return true if the bevel is drawn
         */
        get() = gtk_notebook_get_show_border(gtkNotebookPointer).asBoolean()

        /**
         * Sets whether a bevel will be drawn around the notebook pages.
         *
         * This only has a visual effect when the tabs are not shown.
         *
         * @param showBorder true if a bevel should be drawn around the notebook
         */
        set(showBorder) = gtk_notebook_set_show_border(gtkNotebookPointer, showBorder.asGBoolean())

    /**
     * Whether tabs should be shown.
     */
    public open var showTabs: Boolean
        /**
         * Returns whether the tabs of the notebook are shown.
         *
         * @return true if the tabs are shown
         */
        get() = gtk_notebook_get_show_tabs(gtkNotebookPointer).asBoolean()

        /**
         * Sets whether to show the tabs for the notebook or not.
         *
         * @param showTabs true if the tabs should be shown
         */
        set(showTabs) = gtk_notebook_set_show_tabs(gtkNotebookPointer, showTabs.asGBoolean())

    /**
     * Which side of the notebook holds the tabs.
     */
    public open var tabPos: PositionType
        /**
         * Gets the edge at which the tabs are drawn.
         *
         * @return the edge at which the tabs are drawn
         */
        get() = gtk_notebook_get_tab_pos(gtkNotebookPointer).run {
            PositionType.fromNativeValue(this)
        }

        /**
         * Sets the edge at which the tabs are drawn.
         *
         * @param pos the edge to draw the tabs at
         */
        set(pos) = gtk_notebook_set_tab_pos(gtkNotebookPointer, pos.nativeValue)

    /**
     * Creates a new `GtkNotebook` widget with no pages.
     *
     * @return the newly created `GtkNotebook`
     */
    public constructor() : this(gtk_notebook_new()!!.reinterpret())

    /**
     * Appends a page to @notebook.
     *
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tabLabel the `GtkWidget` to be used as the label
     *   for the page, or null to use the default label, “page N”
     * @return the index (starting from 0) of the appended
     *   page in the notebook, or -1 if function fails
     */
    public open fun appendPage(child: Widget, tabLabel: Widget? = null): gint =
        gtk_notebook_append_page(gtkNotebookPointer, child.gtkWidgetPointer, tabLabel?.gtkWidgetPointer)

    /**
     * Appends a page to @notebook, specifying the widget to use as the
     * label in the popup menu.
     *
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tabLabel the `GtkWidget` to be used as the label
     *   for the page, or null to use the default label, “page N”
     * @param menuLabel the widget to use as a label for the
     *   page-switch menu, if that is enabled. If null, and @tab_label
     *   is a `GtkLabel` or null, then the menu label will be a newly
     *   created label with the same text as @tab_label; if @tab_label
     *   is not a `GtkLabel`, @menu_label must be specified if the
     *   page-switch menu is to be used.
     * @return the index (starting from 0) of the appended
     *   page in the notebook, or -1 if function fails
     */
    public open fun appendPageMenu(child: Widget, tabLabel: Widget? = null, menuLabel: Widget? = null): gint =
        gtk_notebook_append_page_menu(
            gtkNotebookPointer,
            child.gtkWidgetPointer,
            tabLabel?.gtkWidgetPointer,
            menuLabel?.gtkWidgetPointer
        )

    /**
     * Removes the child from the notebook.
     *
     * This function is very similar to [method@Gtk.Notebook.remove_page],
     * but additionally informs the notebook that the removal
     * is happening as part of a tab DND operation, which should
     * not be cancelled.
     *
     * @param child a child
     */
    public open fun detachTab(child: Widget): Unit = gtk_notebook_detach_tab(gtkNotebookPointer, child.gtkWidgetPointer)

    /**
     * Gets one of the action widgets.
     *
     * See [method@Gtk.Notebook.set_action_widget].
     *
     * @param packType pack type of the action widget to receive
     * @return The action widget
     *   with the given @pack_type or null when this action
     *   widget has not been set
     */
    public open fun getActionWidget(packType: PackType): Widget? =
        gtk_notebook_get_action_widget(gtkNotebookPointer, packType.nativeValue)?.run {
            Widget(this)
        }

    /**
     * Returns the page number of the current page.
     *
     * @return the index (starting from 0) of the current
     *   page in the notebook. If the notebook has no pages,
     *   then -1 will be returned.
     */
    public open fun getCurrentPage(): gint = gtk_notebook_get_current_page(gtkNotebookPointer)

    /**
     * Retrieves the menu label widget of the page containing @child.
     *
     * @param child a widget contained in a page of @notebook
     * @return the menu label, or null
     *   if the notebook page does not have a menu label other than
     *   the default (the tab label).
     */
    public open fun getMenuLabel(child: Widget): Widget? =
        gtk_notebook_get_menu_label(gtkNotebookPointer, child.gtkWidgetPointer)?.run {
            Widget(this)
        }

    /**
     * Retrieves the text of the menu label for the page containing
     * @child.
     *
     * @param child the child widget of a page of the notebook.
     * @return the text of the tab label, or null if
     *   the widget does not have a menu label other than the default
     *   menu label, or the menu label widget is not a `GtkLabel`.
     *   The string is owned by the widget and must not be freed.
     */
    public open fun getMenuLabelText(child: Widget): String? =
        gtk_notebook_get_menu_label_text(gtkNotebookPointer, child.gtkWidgetPointer)?.toKString()

    /**
     * Gets the number of pages in a notebook.
     *
     * @return the number of pages in the notebook
     */
    public open fun getNPages(): gint = gtk_notebook_get_n_pages(gtkNotebookPointer)

    /**
     * Returns the child widget contained in page number @page_num.
     *
     * @param pageNum the index of a page in the notebook, or -1
     *   to get the last page
     * @return the child widget, or null if @page_num
     * is out of bounds
     */
    public open fun getNthPage(pageNum: gint): Widget? = gtk_notebook_get_nth_page(gtkNotebookPointer, pageNum)?.run {
        Widget(this)
    }

    /**
     * Returns the `GtkNotebookPage` for @child.
     *
     * @param child a child of @notebook
     * @return the `GtkNotebookPage` for @child
     */
    public open fun getPage(child: Widget): NotebookPage =
        gtk_notebook_get_page(gtkNotebookPointer, child.gtkWidgetPointer)!!.run {
            NotebookPage(this)
        }

    /**
     * Returns whether the tab contents can be detached from @notebook.
     *
     * @param child a child `GtkWidget`
     * @return true if the tab is detachable.
     */
    public open fun getTabDetachable(child: Widget): Boolean =
        gtk_notebook_get_tab_detachable(gtkNotebookPointer, child.gtkWidgetPointer).asBoolean()

    /**
     * Returns the tab label widget for the page @child.
     *
     * null is returned if @child is not in @notebook or
     * if no tab label has specifically been set for @child.
     *
     * @param child the page
     * @return the tab label
     */
    public open fun getTabLabel(child: Widget): Widget? =
        gtk_notebook_get_tab_label(gtkNotebookPointer, child.gtkWidgetPointer)?.run {
            Widget(this)
        }

    /**
     * Retrieves the text of the tab label for the page containing
     * @child.
     *
     * @param child a widget contained in a page of @notebook
     * @return the text of the tab label, or null if
     *   the tab label widget is not a `GtkLabel`. The string is owned
     *   by the widget and must not be freed.
     */
    public open fun getTabLabelText(child: Widget): String? =
        gtk_notebook_get_tab_label_text(gtkNotebookPointer, child.gtkWidgetPointer)?.toKString()

    /**
     * Gets whether the tab can be reordered via drag and drop or not.
     *
     * @param child a child `GtkWidget`
     * @return true if the tab is reorderable.
     */
    public open fun getTabReorderable(child: Widget): Boolean =
        gtk_notebook_get_tab_reorderable(gtkNotebookPointer, child.gtkWidgetPointer).asBoolean()

    /**
     * Insert a page into @notebook at the given position.
     *
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tabLabel the `GtkWidget` to be used as the label
     *   for the page, or null to use the default label, “page N”
     * @param position the index (starting at 0) at which to insert the page,
     *   or -1 to append the page after all other pages
     * @return the index (starting from 0) of the inserted
     *   page in the notebook, or -1 if function fails
     */
    public open fun insertPage(child: Widget, tabLabel: Widget? = null, position: gint): gint =
        gtk_notebook_insert_page(gtkNotebookPointer, child.gtkWidgetPointer, tabLabel?.gtkWidgetPointer, position)

    /**
     * Insert a page into @notebook at the given position, specifying
     * the widget to use as the label in the popup menu.
     *
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tabLabel the `GtkWidget` to be used as the label
     *   for the page, or null to use the default label, “page N”
     * @param menuLabel the widget to use as a label for the
     *   page-switch menu, if that is enabled. If null, and @tab_label
     *   is a `GtkLabel` or null, then the menu label will be a newly
     *   created label with the same text as @tab_label; if @tab_label
     *   is not a `GtkLabel`, @menu_label must be specified if the
     *   page-switch menu is to be used.
     * @param position the index (starting at 0) at which to insert the page,
     *   or -1 to append the page after all other pages.
     * @return the index (starting from 0) of the inserted
     *   page in the notebook
     */
    public open fun insertPageMenu(
        child: Widget,
        tabLabel: Widget? = null,
        menuLabel: Widget? = null,
        position: gint,
    ): gint = gtk_notebook_insert_page_menu(
        gtkNotebookPointer,
        child.gtkWidgetPointer,
        tabLabel?.gtkWidgetPointer,
        menuLabel?.gtkWidgetPointer,
        position
    )

    /**
     * Switches to the next page.
     *
     * Nothing happens if the current page is the last page.
     */
    public open fun nextPage(): Unit = gtk_notebook_next_page(gtkNotebookPointer)

    /**
     * Finds the index of the page which contains the given child
     * widget.
     *
     * @param child a `GtkWidget`
     * @return the index of the page containing @child, or
     *   -1 if @child is not in the notebook
     */
    public open fun pageNum(child: Widget): gint = gtk_notebook_page_num(gtkNotebookPointer, child.gtkWidgetPointer)

    /**
     * Disables the popup menu.
     */
    public open fun popupDisable(): Unit = gtk_notebook_popup_disable(gtkNotebookPointer)

    /**
     * Enables the popup menu.
     *
     * If the user clicks with the right mouse button on the tab labels,
     * a menu with all the pages will be popped up.
     */
    public open fun popupEnable(): Unit = gtk_notebook_popup_enable(gtkNotebookPointer)

    /**
     * Prepends a page to @notebook.
     *
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tabLabel the `GtkWidget` to be used as the label
     *   for the page, or null to use the default label, “page N”
     * @return the index (starting from 0) of the prepended
     *   page in the notebook, or -1 if function fails
     */
    public open fun prependPage(child: Widget, tabLabel: Widget? = null): gint =
        gtk_notebook_prepend_page(gtkNotebookPointer, child.gtkWidgetPointer, tabLabel?.gtkWidgetPointer)

    /**
     * Prepends a page to @notebook, specifying the widget to use as the
     * label in the popup menu.
     *
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tabLabel the `GtkWidget` to be used as the label
     *   for the page, or null to use the default label, “page N”
     * @param menuLabel the widget to use as a label for the
     *   page-switch menu, if that is enabled. If null, and @tab_label
     *   is a `GtkLabel` or null, then the menu label will be a newly
     *   created label with the same text as @tab_label; if @tab_label
     *   is not a `GtkLabel`, @menu_label must be specified if the
     *   page-switch menu is to be used.
     * @return the index (starting from 0) of the prepended
     *   page in the notebook, or -1 if function fails
     */
    public open fun prependPageMenu(child: Widget, tabLabel: Widget? = null, menuLabel: Widget? = null): gint =
        gtk_notebook_prepend_page_menu(
            gtkNotebookPointer,
            child.gtkWidgetPointer,
            tabLabel?.gtkWidgetPointer,
            menuLabel?.gtkWidgetPointer
        )

    /**
     * Switches to the previous page.
     *
     * Nothing happens if the current page is the first page.
     */
    public open fun prevPage(): Unit = gtk_notebook_prev_page(gtkNotebookPointer)

    /**
     * Removes a page from the notebook given its index
     * in the notebook.
     *
     * @param pageNum the index of a notebook page, starting
     *   from 0. If -1, the last page will be removed.
     */
    public open fun removePage(pageNum: gint): Unit = gtk_notebook_remove_page(gtkNotebookPointer, pageNum)

    /**
     * Reorders the page containing @child, so that it appears in position
     * @position.
     *
     * If @position is greater than or equal to the number of children in
     * the list or negative, @child will be moved to the end of the list.
     *
     * @param child the child to move
     * @param position the new position, or -1 to move to the end
     */
    public open fun reorderChild(child: Widget, position: gint): Unit =
        gtk_notebook_reorder_child(gtkNotebookPointer, child.gtkWidgetPointer, position)

    /**
     * Sets @widget as one of the action widgets.
     *
     * Depending on the pack type the widget will be placed before
     * or after the tabs. You can use a `GtkBox` if you need to pack
     * more than one widget on the same side.
     *
     * @param widget a `GtkWidget`
     * @param packType pack type of the action widget
     */
    public open fun setActionWidget(widget: Widget, packType: PackType): Unit =
        gtk_notebook_set_action_widget(gtkNotebookPointer, widget.gtkWidgetPointer, packType.nativeValue)

    /**
     * Switches to the page number @page_num.
     *
     * Note that due to historical reasons, GtkNotebook refuses
     * to switch to a page unless the child widget is visible.
     * Therefore, it is recommended to show child widgets before
     * adding them to a notebook.
     *
     * @param pageNum index of the page to switch to, starting from 0.
     *   If negative, the last page will be used. If greater
     *   than the number of pages in the notebook, nothing
     *   will be done.
     */
    public open fun setCurrentPage(pageNum: gint): Unit = gtk_notebook_set_current_page(gtkNotebookPointer, pageNum)

    /**
     * Changes the menu label for the page containing @child.
     *
     * @param child the child widget
     * @param menuLabel the menu label, or null for default
     */
    public open fun setMenuLabel(child: Widget, menuLabel: Widget? = null): Unit =
        gtk_notebook_set_menu_label(gtkNotebookPointer, child.gtkWidgetPointer, menuLabel?.gtkWidgetPointer)

    /**
     * Creates a new label and sets it as the menu label of @child.
     *
     * @param child the child widget
     * @param menuText the label text
     */
    public open fun setMenuLabelText(child: Widget, menuText: String): Unit =
        gtk_notebook_set_menu_label_text(gtkNotebookPointer, child.gtkWidgetPointer, menuText)

    /**
     * Sets whether the tab can be detached from @notebook to another
     * notebook or widget.
     *
     * Note that two notebooks must share a common group identifier
     * (see [method@Gtk.Notebook.set_group_name]) to allow automatic tabs
     * interchange between them.
     *
     * If you want a widget to interact with a notebook through DnD
     * (i.e.: accept dragged tabs from it) it must be set as a drop
     * destination by adding to it a [class@Gtk.DropTarget] controller that accepts
     * the GType `GTK_TYPE_NOTEBOOK_PAGE`. The `:value` of said drop target will be
     * preloaded with a [class@Gtk.NotebookPage] object that corresponds to the
     * dropped tab, so you can process the value via `::accept` or `::drop` signals.
     *
     * Note that you should use [method@Gtk.Notebook.detach_tab] instead
     * of [method@Gtk.Notebook.remove_page] if you want to remove the tab
     * from the source notebook as part of accepting a drop. Otherwise,
     * the source notebook will think that the dragged tab was removed
     * from underneath the ongoing drag operation, and will initiate a
     * drag cancel animation.
     *
     * ```c
     * static void
     * on_drag_data_received (GtkWidget        *widget,
     *                        GdkDrop          *drop,
     *                        GtkSelectionData *data,
     *                        guint             time,
     *                        gpointer          user_data)
     * {
     *   GtkDrag *drag;
     *   GtkWidget *notebook;
     *   GtkWidget **child;
     *
     *   drag = gtk_drop_get_drag (drop);
     *   notebook = g_object_get_data (drag, "gtk-notebook-drag-origin");
     *   child = (void*) gtk_selection_data_get_data (data);
     *
     *   // process_widget (*child);
     *
     *   gtk_notebook_detach_tab (GTK_NOTEBOOK (notebook), *child);
     * }
     * ```
     *
     * If you want a notebook to accept drags from other widgets,
     * you will have to set your own DnD code to do it.
     *
     * @param child a child `GtkWidget`
     * @param detachable whether the tab is detachable or not
     */
    public open fun setTabDetachable(child: Widget, detachable: Boolean): Unit =
        gtk_notebook_set_tab_detachable(gtkNotebookPointer, child.gtkWidgetPointer, detachable.asGBoolean())

    /**
     * Changes the tab label for @child.
     *
     * If null is specified for @tab_label, then the page will
     * have the label “page N”.
     *
     * @param child the page
     * @param tabLabel the tab label widget to use, or null
     *   for default tab label
     */
    public open fun setTabLabel(child: Widget, tabLabel: Widget? = null): Unit =
        gtk_notebook_set_tab_label(gtkNotebookPointer, child.gtkWidgetPointer, tabLabel?.gtkWidgetPointer)

    /**
     * Creates a new label and sets it as the tab label for the page
     * containing @child.
     *
     * @param child the page
     * @param tabText the label text
     */
    public open fun setTabLabelText(child: Widget, tabText: String): Unit =
        gtk_notebook_set_tab_label_text(gtkNotebookPointer, child.gtkWidgetPointer, tabText)

    /**
     * Sets whether the notebook tab can be reordered
     * via drag and drop or not.
     *
     * @param child a child `GtkWidget`
     * @param reorderable whether the tab is reorderable or not
     */
    public open fun setTabReorderable(child: Widget, reorderable: Boolean): Unit =
        gtk_notebook_set_tab_reorderable(gtkNotebookPointer, child.gtkWidgetPointer, reorderable.asGBoolean())

    /**
     *
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object`
     */
    public fun onChangeCurrentPage(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: gint) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer,
        "change-current-page",
        onChangeCurrentPageFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The ::create-window signal is emitted when a detachable
     * tab is dropped on the root window.
     *
     * A handler for this signal can create a window containing
     * a notebook where the tab will be attached. It is also
     * responsible for moving/resizing the window and adding the
     * necessary properties to the notebook (e.g. the
     * `GtkNotebook`:group-name ).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` the tab of @notebook that is being detached. Returns a `GtkNotebook` that
     *   @page should be added to
     */
    public fun onCreateWindow(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: Widget) -> Notebook?,
    ): ULong = g_signal_connect_data(
        gPointer,
        "create-window",
        onCreateWindowFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     *
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object`
     */
    public fun onFocusTab(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: NotebookTab) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer,
        "focus-tab",
        onFocusTabFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     *
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object`
     */
    public fun onMoveFocusOut(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: DirectionType) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "move-focus-out",
        onMoveFocusOutFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "move-focus-out" signal. See [onMoveFocusOut].
     *
     * @param object
     */
    public fun emitMoveFocusOut(`object`: DirectionType) {
        g_signal_emit_by_name(gPointer.reinterpret(), "move-focus-out", `object`.nativeValue)
    }

    /**
     * the ::page-added signal is emitted in the notebook
     * right after a page is added to the notebook.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `child` the child `GtkWidget` affected; `pageNum` the new page number for @child
     */
    public fun onPageAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (child: Widget, pageNum: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "page-added",
        onPageAddedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "page-added" signal. See [onPageAdded].
     *
     * @param child the child `GtkWidget` affected
     * @param pageNum the new page number for @child
     */
    public fun emitPageAdded(child: Widget, pageNum: guint) {
        g_signal_emit_by_name(gPointer.reinterpret(), "page-added", child.gtkWidgetPointer, pageNum)
    }

    /**
     * the ::page-removed signal is emitted in the notebook
     * right after a page is removed from the notebook.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `child` the child `GtkWidget` affected; `pageNum` the @child page number
     */
    public fun onPageRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (child: Widget, pageNum: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "page-removed",
        onPageRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "page-removed" signal. See [onPageRemoved].
     *
     * @param child the child `GtkWidget` affected
     * @param pageNum the @child page number
     */
    public fun emitPageRemoved(child: Widget, pageNum: guint) {
        g_signal_emit_by_name(gPointer.reinterpret(), "page-removed", child.gtkWidgetPointer, pageNum)
    }

    /**
     * the ::page-reordered signal is emitted in the notebook
     * right after a page has been reordered.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `child` the child `GtkWidget` affected; `pageNum` the new page number for @child
     */
    public fun onPageReordered(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (child: Widget, pageNum: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "page-reordered",
        onPageReorderedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "page-reordered" signal. See [onPageReordered].
     *
     * @param child the child `GtkWidget` affected
     * @param pageNum the new page number for @child
     */
    public fun emitPageReordered(child: Widget, pageNum: guint) {
        g_signal_emit_by_name(gPointer.reinterpret(), "page-reordered", child.gtkWidgetPointer, pageNum)
    }

    /**
     *
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` ; `p0`
     */
    public fun onReorderTab(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: DirectionType, p0: Boolean) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer,
        "reorder-tab",
        onReorderTabFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     *
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object`
     */
    public fun onSelectPage(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: Boolean) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer,
        "select-page",
        onSelectPageFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the user or a function changes the current page.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` the new current page; `pageNum` the index of the page
     */
    public fun onSwitchPage(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: Widget, pageNum: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "switch-page",
        onSwitchPageFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "switch-page" signal. See [onSwitchPage].
     *
     * @param page the new current page
     * @param pageNum the index of the page
     */
    public fun emitSwitchPage(page: Widget, pageNum: guint) {
        g_signal_emit_by_name(gPointer.reinterpret(), "switch-page", page.gtkWidgetPointer, pageNum)
    }

    public companion object : TypeCompanion<Notebook> {
        override val type: GeneratedClassKGType<Notebook> =
            GeneratedClassKGType(gtk_notebook_get_type()) { Notebook(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Notebook
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_notebook_get_type()
    }
}

private val onChangeCurrentPageFunc: CPointer<CFunction<(gint) -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        `object`: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`object`: gint) -> Boolean>().get().invoke(`object`).asGBoolean()
}
    .reinterpret()

private val onCreateWindowFunc: CPointer<CFunction<(CPointer<GtkWidget>) -> CPointer<GtkNotebook>?>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<GtkWidget>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: Widget) -> Notebook?>().get().invoke(
            page!!.run {
                Widget(this)
            }
        )?.gtkNotebookPointer
    }
        .reinterpret()

private val onFocusTabFunc: CPointer<CFunction<(GtkNotebookTab) -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        `object`: GtkNotebookTab,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`object`: NotebookTab) -> Boolean>().get().invoke(
        `object`.run {
            NotebookTab.fromNativeValue(this)
        }
    ).asGBoolean()
}
    .reinterpret()

private val onMoveFocusOutFunc: CPointer<CFunction<(GtkDirectionType) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        `object`: GtkDirectionType,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`object`: DirectionType) -> Unit>().get().invoke(
        `object`.run {
            DirectionType.fromNativeValue(this)
        }
    )
}
    .reinterpret()

private val onPageAddedFunc: CPointer<CFunction<(CPointer<GtkWidget>, guint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            child: CPointer<GtkWidget>?,
            pageNum: guint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(child: Widget, pageNum: guint) -> Unit>().get().invoke(
            child!!.run {
                Widget(this)
            },
            pageNum
        )
    }
        .reinterpret()

private val onPageRemovedFunc: CPointer<CFunction<(CPointer<GtkWidget>, guint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            child: CPointer<GtkWidget>?,
            pageNum: guint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(child: Widget, pageNum: guint) -> Unit>().get().invoke(
            child!!.run {
                Widget(this)
            },
            pageNum
        )
    }
        .reinterpret()

private val onPageReorderedFunc: CPointer<CFunction<(CPointer<GtkWidget>, guint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            child: CPointer<GtkWidget>?,
            pageNum: guint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(child: Widget, pageNum: guint) -> Unit>().get().invoke(
            child!!.run {
                Widget(this)
            },
            pageNum
        )
    }
        .reinterpret()

private val onReorderTabFunc: CPointer<CFunction<(GtkDirectionType, gboolean) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            `object`: GtkDirectionType,
            p0: gboolean,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: DirectionType, p0: Boolean) -> Boolean>().get().invoke(
            `object`.run {
                DirectionType.fromNativeValue(this)
            },
            p0.asBoolean()
        ).asGBoolean()
    }
        .reinterpret()

private val onSelectPageFunc: CPointer<CFunction<(gboolean) -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        `object`: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`object`: Boolean) -> Boolean>().get().invoke(`object`.asBoolean()).asGBoolean()
}
    .reinterpret()

private val onSwitchPageFunc: CPointer<CFunction<(CPointer<GtkWidget>, guint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<GtkWidget>?,
            pageNum: guint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: Widget, pageNum: guint) -> Unit>().get().invoke(
            page!!.run {
                Widget(this)
            },
            pageNum
        )
    }
        .reinterpret()
