// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.adw.annotations.AdwVersion1_2
import org.gtkkn.bindings.adw.annotations.AdwVersion1_3
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.SelectionModel
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwTabPage
import org.gtkkn.native.adw.AdwTabView
import org.gtkkn.native.adw.adw_tab_view_add_page
import org.gtkkn.native.adw.adw_tab_view_add_shortcuts
import org.gtkkn.native.adw.adw_tab_view_append
import org.gtkkn.native.adw.adw_tab_view_append_pinned
import org.gtkkn.native.adw.adw_tab_view_close_other_pages
import org.gtkkn.native.adw.adw_tab_view_close_page
import org.gtkkn.native.adw.adw_tab_view_close_page_finish
import org.gtkkn.native.adw.adw_tab_view_close_pages_after
import org.gtkkn.native.adw.adw_tab_view_close_pages_before
import org.gtkkn.native.adw.adw_tab_view_get_default_icon
import org.gtkkn.native.adw.adw_tab_view_get_is_transferring_page
import org.gtkkn.native.adw.adw_tab_view_get_menu_model
import org.gtkkn.native.adw.adw_tab_view_get_n_pages
import org.gtkkn.native.adw.adw_tab_view_get_n_pinned_pages
import org.gtkkn.native.adw.adw_tab_view_get_nth_page
import org.gtkkn.native.adw.adw_tab_view_get_page
import org.gtkkn.native.adw.adw_tab_view_get_page_position
import org.gtkkn.native.adw.adw_tab_view_get_pages
import org.gtkkn.native.adw.adw_tab_view_get_selected_page
import org.gtkkn.native.adw.adw_tab_view_get_shortcuts
import org.gtkkn.native.adw.adw_tab_view_get_type
import org.gtkkn.native.adw.adw_tab_view_insert
import org.gtkkn.native.adw.adw_tab_view_insert_pinned
import org.gtkkn.native.adw.adw_tab_view_invalidate_thumbnails
import org.gtkkn.native.adw.adw_tab_view_new
import org.gtkkn.native.adw.adw_tab_view_prepend
import org.gtkkn.native.adw.adw_tab_view_prepend_pinned
import org.gtkkn.native.adw.adw_tab_view_remove_shortcuts
import org.gtkkn.native.adw.adw_tab_view_reorder_backward
import org.gtkkn.native.adw.adw_tab_view_reorder_first
import org.gtkkn.native.adw.adw_tab_view_reorder_forward
import org.gtkkn.native.adw.adw_tab_view_reorder_last
import org.gtkkn.native.adw.adw_tab_view_reorder_page
import org.gtkkn.native.adw.adw_tab_view_select_next_page
import org.gtkkn.native.adw.adw_tab_view_select_previous_page
import org.gtkkn.native.adw.adw_tab_view_set_default_icon
import org.gtkkn.native.adw.adw_tab_view_set_menu_model
import org.gtkkn.native.adw.adw_tab_view_set_page_pinned
import org.gtkkn.native.adw.adw_tab_view_set_selected_page
import org.gtkkn.native.adw.adw_tab_view_set_shortcuts
import org.gtkkn.native.adw.adw_tab_view_transfer_page
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * A dynamic tabbed container.
 *
 * `AdwTabView` is a container which shows one child at a time. While it
 * provides keyboard shortcuts for switching between pages, it does not provide
 * a visible tab switcher and relies on external widgets for that, such as
 * [class@TabBar], [class@TabOverview] and [class@TabButton].
 *
 * `AdwTabView` maintains a [class@TabPage] object for each page, which holds
 * additional per-page properties. You can obtain the `AdwTabPage` for a page
 * with [method@TabView.get_page], and as the return value for
 * [method@TabView.append] and other functions for adding children.
 *
 * `AdwTabView` only aims to be useful for dynamic tabs in multi-window
 * document-based applications, such as web browsers, file managers, text
 * editors or terminals. It does not aim to replace [class@Gtk.Notebook] for use
 * cases such as tabbed dialogs.
 *
 * As such, it does not support disabling page reordering or detaching.
 *
 * `AdwTabView` adds a number of global page switching and reordering shortcuts.
 * The [property@TabView:shortcuts] property can be used to manage them.
 *
 * See [flags@TabViewShortcuts] for the list of the available shortcuts. All of
 * the shortcuts are enabled by default.
 *
 * [method@TabView.add_shortcuts] and [method@TabView.remove_shortcuts] can be
 * used to manage shortcuts in a convenient way, for example:
 *
 * ```c
 * adw_tab_view_remove_shortcuts (view, ADW_TAB_VIEW_SHORTCUT_CONTROL_HOME |
 *                                      ADW_TAB_VIEW_SHORTCUT_CONTROL_END);
 * ```
 *
 * ## CSS nodes
 *
 * `AdwTabView` has a main CSS node with the name `tabview`.
 *
 * ## Accessibility
 *
 * `AdwTabView` uses the `GTK_ACCESSIBLE_ROLE_TAB_PANEL` for the tab pages which
 * are the accessible parent objects of the child widgets.
 *
 * ## Skipped during bindings generation
 *
 * - method `selected-page`: Property TypeInfo of getter and setter do not match
 */
public class TabView(pointer: CPointer<AdwTabView>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val adwTabViewPointer: CPointer<AdwTabView>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Default page icon.
     *
     * If a page doesn't provide its own icon via [property@TabPage:icon], a
     * default icon may be used instead for contexts where having an icon is
     * necessary.
     *
     * [class@TabBar] will use default icon for pinned tabs in case the page is
     * not loading, doesn't have an icon and an indicator. Default icon is never
     * used for tabs that aren't pinned.
     *
     * [class@TabOverview] will use default icon for pages with missing
     * thumbnails.
     *
     * By default, the `adw-tab-icon-missing-symbolic` icon is used.
     */
    public var defaultIcon: Icon
        /**
         * Gets the default icon of @self.
         *
         * @return the default icon of @self.
         */
        get() = adw_tab_view_get_default_icon(adwTabViewPointer.reinterpret())!!.run {
            Icon.wrap(reinterpret())
        }

        /**
         * Sets the default page icon for @self.
         *
         * If a page doesn't provide its own icon via [property@TabPage:icon], a default
         * icon may be used instead for contexts where having an icon is necessary.
         *
         * [class@TabBar] will use default icon for pinned tabs in case the page is not
         * loading, doesn't have an icon and an indicator. Default icon is never used
         * for tabs that aren't pinned.
         *
         * [class@TabOverview] will use default icon for pages with missing thumbnails.
         *
         * By default, the `adw-tab-icon-missing-symbolic` icon is used.
         *
         * @param defaultIcon the default icon
         */
        set(defaultIcon) = adw_tab_view_set_default_icon(adwTabViewPointer.reinterpret(), defaultIcon.gioIconPointer)

    /**
     * Whether a page is being transferred.
     *
     * This property will be set to `TRUE` when a drag-n-drop tab transfer starts
     * on any `AdwTabView`, and to `FALSE` after it ends.
     *
     * During the transfer, children cannot receive pointer input and a tab can
     * be safely dropped on the tab view.
     */
    public val isTransferringPage: Boolean
        /**
         * Whether a page is being transferred.
         *
         * The corresponding property will be set to `TRUE` when a drag-n-drop tab
         * transfer starts on any `AdwTabView`, and to `FALSE` after it ends.
         *
         * During the transfer, children cannot receive pointer input and a tab can
         * be safely dropped on the tab view.
         *
         * @return whether a page is being transferred
         */
        get() = adw_tab_view_get_is_transferring_page(adwTabViewPointer.reinterpret()).asBoolean()

    /**
     * Tab context menu model.
     *
     * When a context menu is shown for a tab, it will be constructed from the
     * provided menu model. Use the [signal@TabView::setup-menu] signal to set up
     * the menu actions for the particular tab.
     */
    public var menuModel: MenuModel?
        /**
         * Gets the tab context menu model for @self.
         *
         * @return the tab context menu model for @self
         */
        get() = adw_tab_view_get_menu_model(adwTabViewPointer.reinterpret())?.run {
            MenuModel(reinterpret())
        }

        /**
         * Sets the tab context menu model for @self.
         *
         * When a context menu is shown for a tab, it will be constructed from the
         * provided menu model. Use the [signal@TabView::setup-menu] signal to set up
         * the menu actions for the particular tab.
         *
         * @param menuModel a menu model
         */
        set(
            menuModel
        ) = adw_tab_view_set_menu_model(adwTabViewPointer.reinterpret(), menuModel?.gioMenuModelPointer?.reinterpret())

    /**
     * The number of pages in the tab view.
     */
    public val nPages: gint
        /**
         * Gets the number of pages in @self.
         *
         * @return the number of pages in @self
         */
        get() = adw_tab_view_get_n_pages(adwTabViewPointer.reinterpret())

    /**
     * The number of pinned pages in the tab view.
     *
     * See [method@TabView.set_page_pinned].
     */
    public val nPinnedPages: gint
        /**
         * Gets the number of pinned pages in @self.
         *
         * See [method@TabView.set_page_pinned].
         *
         * @return the number of pinned pages in @self
         */
        get() = adw_tab_view_get_n_pinned_pages(adwTabViewPointer.reinterpret())

    /**
     * A selection model with the tab view's pages.
     *
     * This can be used to keep an up-to-date view. The model also implements
     * [iface@Gtk.SelectionModel] and can be used to track and change the selected
     * page.
     */
    public val pages: SelectionModel
        /**
         * Returns a [iface@Gio.ListModel] that contains the pages of @self.
         *
         * This can be used to keep an up-to-date view. The model also implements
         * [iface@Gtk.SelectionModel] and can be used to track and change the selected
         * page.
         *
         * @return a `GtkSelectionModel` for the pages of @self
         */
        get() = adw_tab_view_get_pages(adwTabViewPointer.reinterpret())!!.run {
            SelectionModel.wrap(reinterpret())
        }

    /**
     * The enabled shortcuts.
     *
     * See [flags@TabViewShortcuts] for the list of the available shortcuts. All
     * of the shortcuts are enabled by default.
     *
     * [method@TabView.add_shortcuts] and [method@TabView.remove_shortcuts]
     * provide a convenient way to manage individual shortcuts.
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public var shortcuts: TabViewShortcuts
        /**
         * Gets the enabled shortcuts for @self.
         *
         * @return the shortcut mask
         * @since 1.2
         */
        get() = adw_tab_view_get_shortcuts(adwTabViewPointer.reinterpret()).run {
            TabViewShortcuts(this)
        }

        /**
         * Sets the enabled shortcuts for @self.
         *
         * See [flags@TabViewShortcuts] for the list of the available shortcuts. All of
         * the shortcuts are enabled by default.
         *
         * [method@TabView.add_shortcuts] and [method@TabView.remove_shortcuts] provide
         * a convenient way to manage individual shortcuts.
         *
         * @param shortcuts the new shortcuts
         * @since 1.2
         */
        @AdwVersion1_2
        set(shortcuts) = adw_tab_view_set_shortcuts(adwTabViewPointer.reinterpret(), shortcuts.mask)

    /**
     * Creates a new `AdwTabView`.
     *
     * @return the newly created `AdwTabView`
     */
    public constructor() : this(adw_tab_view_new()!!.reinterpret())

    /**
     * Adds @child to @self with @parent as the parent.
     *
     * This function can be used to automatically position new pages, and to select
     * the correct page when this page is closed while being selected (see
     * [method@TabView.close_page]).
     *
     * If @parent is `NULL`, this function is equivalent to [method@TabView.append].
     *
     * @param child a widget to add
     * @param parent a parent page for @child
     * @return the page object representing @child
     */
    public fun addPage(child: Widget, parent: TabPage? = null): TabPage = adw_tab_view_add_page(
        adwTabViewPointer.reinterpret(),
        child.gtkWidgetPointer.reinterpret(),
        parent?.adwTabPagePointer?.reinterpret()
    )!!.run {
        TabPage(reinterpret())
    }

    /**
     * Adds @shortcuts for @self.
     *
     * See [property@TabView:shortcuts] for details.
     *
     * @param shortcuts the shortcuts to add
     * @since 1.2
     */
    @AdwVersion1_2
    public fun addShortcuts(shortcuts: TabViewShortcuts): Unit =
        adw_tab_view_add_shortcuts(adwTabViewPointer.reinterpret(), shortcuts.mask)

    /**
     * Inserts @child as the last non-pinned page.
     *
     * @param child a widget to add
     * @return the page object representing @child
     */
    public fun append(child: Widget): TabPage =
        adw_tab_view_append(adwTabViewPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())!!.run {
            TabPage(reinterpret())
        }

    /**
     * Inserts @child as the last pinned page.
     *
     * @param child a widget to add
     * @return the page object representing @child
     */
    public fun appendPinned(child: Widget): TabPage =
        adw_tab_view_append_pinned(adwTabViewPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())!!.run {
            TabPage(reinterpret())
        }

    /**
     * Requests to close all pages other than @page.
     *
     * @param page a page of @self
     */
    public fun closeOtherPages(page: TabPage): Unit =
        adw_tab_view_close_other_pages(adwTabViewPointer.reinterpret(), page.adwTabPagePointer.reinterpret())

    /**
     * Requests to close @page.
     *
     * Calling this function will result in the [signal@TabView::close-page] signal
     * being emitted for @page. Closing the page can then be confirmed or
     * denied via [method@TabView.close_page_finish].
     *
     * If the page is waiting for a [method@TabView.close_page_finish] call, this
     * function will do nothing.
     *
     * The default handler for [signal@TabView::close-page] will immediately confirm
     * closing the page if it's non-pinned, or reject it if it's pinned. This
     * behavior can be changed by registering your own handler for that signal.
     *
     * If @page was selected, another page will be selected instead:
     *
     * If the [property@TabPage:parent] value is `NULL`, the next page will be
     * selected when possible, or if the page was already last, the previous page
     * will be selected instead.
     *
     * If it's not `NULL`, the previous page will be selected if it's a descendant
     * (possibly indirect) of the parent. If both the previous page and the parent
     * are pinned, the parent will be selected instead.
     *
     * @param page a page of @self
     */
    public fun closePage(page: TabPage): Unit =
        adw_tab_view_close_page(adwTabViewPointer.reinterpret(), page.adwTabPagePointer.reinterpret())

    /**
     * Completes a [method@TabView.close_page] call for @page.
     *
     * If @confirm is `TRUE`, @page will be closed. If it's `FALSE`, it will be
     * reverted to its previous state and [method@TabView.close_page] can be called
     * for it again.
     *
     * This function should not be called unless a custom handler for
     * [signal@TabView::close-page] is used.
     *
     * @param page a page of @self
     * @param confirm whether to confirm or deny closing @page
     */
    public fun closePageFinish(page: TabPage, confirm: Boolean): Unit = adw_tab_view_close_page_finish(
        adwTabViewPointer.reinterpret(),
        page.adwTabPagePointer.reinterpret(),
        confirm.asGBoolean()
    )

    /**
     * Requests to close all pages after @page.
     *
     * @param page a page of @self
     */
    public fun closePagesAfter(page: TabPage): Unit =
        adw_tab_view_close_pages_after(adwTabViewPointer.reinterpret(), page.adwTabPagePointer.reinterpret())

    /**
     * Requests to close all pages before @page.
     *
     * @param page a page of @self
     */
    public fun closePagesBefore(page: TabPage): Unit =
        adw_tab_view_close_pages_before(adwTabViewPointer.reinterpret(), page.adwTabPagePointer.reinterpret())

    /**
     * Gets the [class@TabPage] representing the child at @position.
     *
     * @param position the index of the page in @self, starting from 0
     * @return the page object at @position
     */
    public fun getNthPage(position: gint): TabPage =
        adw_tab_view_get_nth_page(adwTabViewPointer.reinterpret(), position)!!.run {
            TabPage(reinterpret())
        }

    /**
     * Gets the [class@TabPage] object representing @child.
     *
     * @param child a child in @self
     * @return the page object for @child
     */
    public fun getPage(child: Widget): TabPage =
        adw_tab_view_get_page(adwTabViewPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())!!.run {
            TabPage(reinterpret())
        }

    /**
     * Finds the position of @page in @self, starting from 0.
     *
     * @param page a page of @self
     * @return the position of @page in @self
     */
    public fun getPagePosition(page: TabPage): gint =
        adw_tab_view_get_page_position(adwTabViewPointer.reinterpret(), page.adwTabPagePointer.reinterpret())

    /**
     * Gets the currently selected page in @self.
     *
     * @return the selected page
     */
    public fun getSelectedPage(): TabPage? = adw_tab_view_get_selected_page(adwTabViewPointer.reinterpret())?.run {
        TabPage(reinterpret())
    }

    /**
     * Inserts a non-pinned page at @position.
     *
     * It's an error to try to insert a page before a pinned page, in that case
     * [method@TabView.insert_pinned] should be used instead.
     *
     * @param child a widget to add
     * @param position the position to add @child at, starting from 0
     * @return the page object representing @child
     */
    public fun insert(child: Widget, position: gint): TabPage =
        adw_tab_view_insert(adwTabViewPointer.reinterpret(), child.gtkWidgetPointer.reinterpret(), position)!!.run {
            TabPage(reinterpret())
        }

    /**
     * Inserts a pinned page at @position.
     *
     * It's an error to try to insert a pinned page after a non-pinned page, in
     * that case [method@TabView.insert] should be used instead.
     *
     * @param child a widget to add
     * @param position the position to add @child at, starting from 0
     * @return the page object representing @child
     */
    public fun insertPinned(child: Widget, position: gint): TabPage = adw_tab_view_insert_pinned(
        adwTabViewPointer.reinterpret(),
        child.gtkWidgetPointer.reinterpret(),
        position
    )!!.run {
        TabPage(reinterpret())
    }

    /**
     * Invalidates thumbnails for all pages in @self.
     *
     * This is a convenience method, equivalent to calling
     * [method@TabPage.invalidate_thumbnail] on each page.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public fun invalidateThumbnails(): Unit = adw_tab_view_invalidate_thumbnails(adwTabViewPointer.reinterpret())

    /**
     * Inserts @child as the first non-pinned page.
     *
     * @param child a widget to add
     * @return the page object representing @child
     */
    public fun prepend(child: Widget): TabPage =
        adw_tab_view_prepend(adwTabViewPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())!!.run {
            TabPage(reinterpret())
        }

    /**
     * Inserts @child as the first pinned page.
     *
     * @param child a widget to add
     * @return the page object representing @child
     */
    public fun prependPinned(child: Widget): TabPage =
        adw_tab_view_prepend_pinned(adwTabViewPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())!!.run {
            TabPage(reinterpret())
        }

    /**
     * Removes @shortcuts from @self.
     *
     * See [property@TabView:shortcuts] for details.
     *
     * @param shortcuts the shortcuts to reomve
     * @since 1.2
     */
    @AdwVersion1_2
    public fun removeShortcuts(shortcuts: TabViewShortcuts): Unit =
        adw_tab_view_remove_shortcuts(adwTabViewPointer.reinterpret(), shortcuts.mask)

    /**
     * Reorders @page to before its previous page if possible.
     *
     * @param page a page of @self
     * @return whether @page was moved
     */
    public fun reorderBackward(page: TabPage): Boolean =
        adw_tab_view_reorder_backward(adwTabViewPointer.reinterpret(), page.adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * Reorders @page to the first possible position.
     *
     * @param page a page of @self
     * @return whether @page was moved
     */
    public fun reorderFirst(page: TabPage): Boolean =
        adw_tab_view_reorder_first(adwTabViewPointer.reinterpret(), page.adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * Reorders @page to after its next page if possible.
     *
     * @param page a page of @self
     * @return whether @page was moved
     */
    public fun reorderForward(page: TabPage): Boolean =
        adw_tab_view_reorder_forward(adwTabViewPointer.reinterpret(), page.adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * Reorders @page to the last possible position.
     *
     * @param page a page of @self
     * @return whether @page was moved
     */
    public fun reorderLast(page: TabPage): Boolean =
        adw_tab_view_reorder_last(adwTabViewPointer.reinterpret(), page.adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * Reorders @page to @position.
     *
     * It's a programmer error to try to reorder a pinned page after a non-pinned
     * one, or a non-pinned page before a pinned one.
     *
     * @param page a page of @self
     * @param position the position to insert the page at, starting at 0
     * @return whether @page was moved
     */
    public fun reorderPage(page: TabPage, position: gint): Boolean = adw_tab_view_reorder_page(
        adwTabViewPointer.reinterpret(),
        page.adwTabPagePointer.reinterpret(),
        position
    ).asBoolean()

    /**
     * Selects the page after the currently selected page.
     *
     * If the last page was already selected, this function does nothing.
     *
     * @return whether the selected page was changed
     */
    public fun selectNextPage(): Boolean = adw_tab_view_select_next_page(adwTabViewPointer.reinterpret()).asBoolean()

    /**
     * Selects the page before the currently selected page.
     *
     * If the first page was already selected, this function does nothing.
     *
     * @return whether the selected page was changed
     */
    public fun selectPreviousPage(): Boolean =
        adw_tab_view_select_previous_page(adwTabViewPointer.reinterpret()).asBoolean()

    /**
     * Pins or unpins @page.
     *
     * Pinned pages are guaranteed to be placed before all non-pinned pages; at any
     * given moment the first [property@TabView:n-pinned-pages] pages in @self are
     * guaranteed to be pinned.
     *
     * When a page is pinned or unpinned, it's automatically reordered: pinning a
     * page moves it after other pinned pages; unpinning a page moves it before
     * other non-pinned pages.
     *
     * Pinned pages can still be reordered between each other.
     *
     * [class@TabBar] will display pinned pages in a compact form, never showing the
     * title or close button, and only showing a single icon, selected in the
     * following order:
     *
     * 1. [property@TabPage:indicator-icon]
     * 2. A spinner if [property@TabPage:loading] is `TRUE`
     * 3. [property@TabPage:icon]
     * 4. [property@TabView:default-icon]
     *
     * [class@TabOverview] will not show a thumbnail for pinned pages, and replace
     * the close button with an unpin button. Unlike `AdwTabBar`, it will still
     * display the page's title, icon and indicator separately.
     *
     * Pinned pages cannot be closed by default, see [signal@TabView::close-page]
     * for how to override that behavior.
     *
     * Changes the value of the [property@TabPage:pinned] property.
     *
     * @param page a page of @self
     * @param pinned whether @page should be pinned
     */
    public fun setPagePinned(page: TabPage, pinned: Boolean): Unit = adw_tab_view_set_page_pinned(
        adwTabViewPointer.reinterpret(),
        page.adwTabPagePointer.reinterpret(),
        pinned.asGBoolean()
    )

    /**
     * Sets the currently selected page in @self.
     *
     * @param selectedPage a page in @self
     */
    public fun setSelectedPage(selectedPage: TabPage): Unit =
        adw_tab_view_set_selected_page(adwTabViewPointer.reinterpret(), selectedPage.adwTabPagePointer.reinterpret())

    /**
     * Transfers @page from @self to @other_view.
     *
     * The @page object will be reused.
     *
     * It's a programmer error to try to insert a pinned page after a non-pinned
     * one, or a non-pinned page before a pinned one.
     *
     * @param page a page of @self
     * @param otherView the tab view to transfer the page to
     * @param position the position to insert the page at, starting at 0
     */
    public fun transferPage(page: TabPage, otherView: TabView, position: gint): Unit = adw_tab_view_transfer_page(
        adwTabViewPointer.reinterpret(),
        page.adwTabPagePointer.reinterpret(),
        otherView.adwTabViewPointer.reinterpret(),
        position
    )

    /**
     * Emitted after [method@TabView.close_page] has been called for @page.
     *
     * The handler is expected to call [method@TabView.close_page_finish] to
     * confirm or reject the closing.
     *
     * The default handler will immediately confirm closing for non-pinned pages,
     * or reject it for pinned pages, equivalent to the following example:
     *
     * ```c
     * static gboolean
     * close_page_cb (AdwTabView *view,
     *                AdwTabPage *page,
     *                gpointer    user_data)
     * {
     *   adw_tab_view_close_page_finish (view, page, !adw_tab_page_get_pinned (page));
     *
     *   return GDK_EVENT_STOP;
     * }
     * ```
     *
     * The [method@TabView.close_page_finish] call doesn't have to happen inside
     * the handler, so can be used to do asynchronous checks before confirming the
     * closing.
     *
     * A typical reason to connect to this signal is to show a confirmation dialog
     * for closing a tab.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` a page of @self
     */
    public fun connectClosePage(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "close-page",
        connectClosePageFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when a tab should be transferred into a new window.
     *
     * This can happen after a tab has been dropped on desktop.
     *
     * The signal handler is expected to create a new window, position it as
     * needed and return its `AdwTabView` that the page will be transferred into.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns the `AdwTabView` from the new window
     */
    public fun connectCreateWindow(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> TabView?): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "create-window",
            connectCreateWindowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after the indicator icon on @page has been activated.
     *
     * See [property@TabPage:indicator-icon] and
     * [property@TabPage:indicator-activatable].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` a page of @self
     */
    public fun connectIndicatorActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "indicator-activated",
        connectIndicatorActivatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when a page has been created or transferred to @self.
     *
     * A typical reason to connect to this signal would be to connect to page
     * signals for things such as updating window title.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` a page of @self; `position` the position of the page, starting from 0
     */
    public fun connectPageAttached(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage, position: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "page-attached",
        connectPageAttachedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when a page has been removed or transferred to another view.
     *
     * A typical reason to connect to this signal would be to disconnect signal
     * handlers connected in the [signal@TabView::page-attached] handler.
     *
     * It is important not to try and destroy the page child in the handler of
     * this function as the child might merely be moved to another window; use
     * child dispose handler for that or do it in sync with your
     * [method@TabView.close_page_finish] calls.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` a page of @self; `position` the position of the removed page, starting from 0
     */
    public fun connectPageDetached(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage, position: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "page-detached",
        connectPageDetachedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted after @page has been reordered to @position.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` a page of @self; `position` the position @page was moved to, starting at 0
     */
    public fun connectPageReordered(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage, position: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "page-reordered",
        connectPageReorderedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when a context menu is opened or closed for @page.
     *
     * If the menu has been closed, @page will be set to `NULL`.
     *
     * It can be used to set up menu actions before showing the menu, for example
     * disable actions not applicable to @page.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` a page of @self
     */
    public fun connectSetupMenu(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage?) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "setup-menu",
        connectSetupMenuFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<TabView> {
        override val type: GeneratedClassKGType<TabView> =
            GeneratedClassKGType(adw_tab_view_get_type()) { TabView(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of TabView
         *
         * @return the GType
         */
        public fun getType(): GType = adw_tab_view_get_type()
    }
}

private val connectClosePageFunc: CPointer<CFunction<(CPointer<AdwTabPage>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwTabPage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: TabPage) -> Boolean>().get().invoke(
            page!!.run {
                TabPage(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectCreateWindowFunc: CPointer<CFunction<() -> CPointer<AdwTabView>?>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> TabView?>().get().invoke()?.adwTabViewPointer
    }
        .reinterpret()

private val connectIndicatorActivatedFunc: CPointer<CFunction<(CPointer<AdwTabPage>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwTabPage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: TabPage) -> Unit>().get().invoke(
            page!!.run {
                TabPage(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectPageAttachedFunc: CPointer<CFunction<(CPointer<AdwTabPage>, gint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwTabPage>?,
            position: gint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: TabPage, position: gint) -> Unit>().get().invoke(
            page!!.run {
                TabPage(reinterpret())
            },
            position
        )
    }
        .reinterpret()

private val connectPageDetachedFunc: CPointer<CFunction<(CPointer<AdwTabPage>, gint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwTabPage>?,
            position: gint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: TabPage, position: gint) -> Unit>().get().invoke(
            page!!.run {
                TabPage(reinterpret())
            },
            position
        )
    }
        .reinterpret()

private val connectPageReorderedFunc: CPointer<CFunction<(CPointer<AdwTabPage>, gint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwTabPage>?,
            position: gint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: TabPage, position: gint) -> Unit>().get().invoke(
            page!!.run {
                TabPage(reinterpret())
            },
            position
        )
    }
        .reinterpret()

private val connectSetupMenuFunc: CPointer<CFunction<(CPointer<AdwTabPage>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwTabPage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: TabPage?) -> Unit>().get().invoke(
            page?.run {
                TabPage(reinterpret())
            }
        )
    }
        .reinterpret()
