// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwNavigationPage
import org.gtkkn.native.adw.AdwNavigationView
import org.gtkkn.native.adw.AdwSwipeable
import org.gtkkn.native.adw.adw_navigation_view_add
import org.gtkkn.native.adw.adw_navigation_view_find_page
import org.gtkkn.native.adw.adw_navigation_view_get_animate_transitions
import org.gtkkn.native.adw.adw_navigation_view_get_navigation_stack
import org.gtkkn.native.adw.adw_navigation_view_get_pop_on_escape
import org.gtkkn.native.adw.adw_navigation_view_get_previous_page
import org.gtkkn.native.adw.adw_navigation_view_get_type
import org.gtkkn.native.adw.adw_navigation_view_get_visible_page
import org.gtkkn.native.adw.adw_navigation_view_new
import org.gtkkn.native.adw.adw_navigation_view_pop
import org.gtkkn.native.adw.adw_navigation_view_pop_to_page
import org.gtkkn.native.adw.adw_navigation_view_pop_to_tag
import org.gtkkn.native.adw.adw_navigation_view_push
import org.gtkkn.native.adw.adw_navigation_view_push_by_tag
import org.gtkkn.native.adw.adw_navigation_view_remove
import org.gtkkn.native.adw.adw_navigation_view_replace_with_tags
import org.gtkkn.native.adw.adw_navigation_view_set_animate_transitions
import org.gtkkn.native.adw.adw_navigation_view_set_pop_on_escape
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * A page-based navigation container.
 *
 * <picture>
 *   <source srcset="navigation-view-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="navigation-view.png" alt="navigation-view">
 * </picture>
 *
 * `AdwNavigationView` presents one child at a time, similar to
 * [class@Gtk.Stack].
 *
 * `AdwNavigationView` can only contain [class@NavigationPage] children.
 *
 * It maintains a navigation stack that can be controlled with
 * [method@NavigationView.push] and [method@NavigationView.pop]. The whole
 * navigation stack can also be replaced using [method@NavigationView.replace].
 *
 * `AdwNavigationView` allows to manage pages statically or dynamically.
 *
 * Static pages can be added using the [method@NavigationView.add] method. The
 * `AdwNavigationView` will keep a reference to these pages, but they aren't
 * accessible to the user until [method@NavigationView.push] is called (except
 * for the first page, which is pushed automatically). Use the
 * [method@NavigationView.remove] method to remove them. This is useful for
 * applications that have a small number of unique pages and just need
 * navigation between them.
 *
 * Dynamic pages are automatically destroyed once they are popped off the
 * navigation stack. To add a page like this, push it using the
 * [method@NavigationView.push] method without calling
 * [method@NavigationView.add] first.
 *
 * ## Tags
 *
 * Static pages, as well as any pages in the navigation stack, can be accessed
 * by their [property@NavigationPage:tag]. For example,
 * [method@NavigationView.push_by_tag] can be used to push a static page that's
 * not in the navigation stack without having to keep a reference to it manually.
 *
 * ## Header Bar Integration
 *
 * When used inside `AdwNavigationView`, [class@HeaderBar] will automatically
 * display a back button that can be used to go back to the previous page when
 * possible. The button also has a context menu, allowing to pop multiple pages
 * at once, potentially across multiple navigation views.
 *
 * Set [property@HeaderBar:show-back-button] to `FALSE` to disable this behavior
 * in rare scenarios where it's unwanted.
 *
 * `AdwHeaderBar` will also display the title of the `AdwNavigationPage` it's
 * placed into, so most applications shouldn't need to customize it at all.
 *
 * ## Shortcuts and Gestures
 *
 * `AdwNavigationView` supports the following shortcuts for going to the
 * previous page:
 *
 * - <kbd>Escape</kbd> (unless [property@NavigationView:pop-on-escape] is set to
 *   `FALSE`)
 * - <kbd>Alt</kbd>+<kbd>←</kbd>
 * - Back mouse button
 *
 * Additionally, it supports interactive gestures:
 *
 * - One-finger swipe towards the right on touchscreens
 * - Scrolling towards the right on touchpads (usually two-finger swipe)
 *
 * These gestures have transitions enabled regardless of the
 * [property@NavigationView:animate-transitions] value.
 *
 * Applications can also enable shortcuts for pushing another page onto the
 * navigation stack via connecting to the [signal@NavigationView::get-next-page]
 * signal, in that case the following shortcuts are supported:
 *
 * - <kbd>Alt</kbd>+<kbd>→</kbd>
 * - Forward mouse button
 * - Swipe/scrolling towards the left
 *
 * For right-to-left locales, the gestures and shortcuts are reversed.
 *
 * [property@NavigationPage:can-pop] can be used to disable them, along with the
 * header bar back buttons.
 *
 * ## Actions
 *
 * `AdwNavigationView` defines actions for controlling the navigation stack.
 * actions for controlling the navigation stack:
 *
 * - `navigation.push` takes a string parameter specifying the tag of the page to
 * push, and is equivalent to calling [method@NavigationView.push_by_tag].
 *
 * - `navigation.pop` doesn't take any parameters and pops the current page from
 * the navigation stack, equivalent to calling [method@NavigationView.pop].
 *
 * ## `AdwNavigationView` as `GtkBuildable`
 *
 * `AdwNavigationView` allows to add pages as children, equivalent to using the
 * [method@NavigationView.add] method.
 *
 * Example of an `AdwNavigationView` UI definition:
 *
 * ```xml
 * <object class="AdwNavigationView">
 *   <child>
 *     <object class="AdwNavigationPage">
 *       <property name="title" translatable="yes">Page 1</property>
 *       <property name="child">
 *         <object class="AdwToolbarView">
 *           <child type="top">
 *             <object class="AdwHeaderBar"/>
 *           </child>
 *           <property name="content">
 *             <object class="GtkButton">
 *               <property name="label" translatable="yes">Open Page 2</property>
 *               <property name="halign">center</property>
 *               <property name="valign">center</property>
 *               <property name="action-name">navigation.push</property>
 *               <property name="action-target">'page-2'</property>
 *               <style>
 *                 <class name="pill"/>
 *                </style>
 *             </object>
 *           </property>
 *         </object>
 *       </property>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="AdwNavigationPage">
 *       <property name="title" translatable="yes">Page 2</property>
 *       <property name="tag">page-2</property>
 *       <property name="child">
 *         <object class="AdwToolbarView">
 *           <child type="top">
 *             <object class="AdwHeaderBar"/>
 *           </child>
 *           <property name="content">
 *             <!-- ... -->
 *           </property>
 *         </object>
 *       </property>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * <picture>
 *   <source srcset="navigation-view-example-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="navigation-view-example.png" alt="navigation-view-example">
 * </picture>
 *
 * ## CSS nodes
 *
 * `AdwNavigationView` has a single CSS node with the name `navigation-view`.
 *
 * ## Accessibility
 *
 * `AdwNavigationView` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `pages`: Array parameter of type NavigationPage is not supported
 *
 * @since 1.4
 */
@AdwVersion1_4
public class NavigationView(pointer: CPointer<AdwNavigationView>) :
    Widget(pointer.reinterpret()),
    Swipeable,
    KGTyped {
    public val adwNavigationViewPointer: CPointer<AdwNavigationView>
        get() = gPointer.reinterpret()

    override val adwSwipeablePointer: CPointer<AdwSwipeable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether to animate page transitions.
     *
     * Gesture-based transitions are always animated.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var animateTransitions: Boolean
        /**
         * Gets whether @self animates page transitions.
         *
         * @return whether to animate page transitions
         * @since 1.4
         */
        get() = adw_navigation_view_get_animate_transitions(adwNavigationViewPointer).asBoolean()

        /**
         * Sets whether @self should animate page transitions.
         *
         * Gesture-based transitions are always animated.
         *
         * @param animateTransitions whether to animate page transitions
         * @since 1.4
         */
        @AdwVersion1_4
        set(
            animateTransitions
        ) = adw_navigation_view_set_animate_transitions(adwNavigationViewPointer, animateTransitions.asGBoolean())

    /**
     * A list model that contains the pages in navigation stack.
     *
     * The pages are sorted from root page to visible page.
     *
     * This can be used to keep an up-to-date view.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public val navigationStack: ListModel
        /**
         * Returns a [iface@Gio.ListModel] that contains the pages in navigation stack.
         *
         * The pages are sorted from root page to visible page.
         *
         * This can be used to keep an up-to-date view.
         *
         * @return a list model for the navigation stack
         * @since 1.4
         */
        get() = adw_navigation_view_get_navigation_stack(adwNavigationViewPointer)!!.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Whether pressing Escape pops the current page.
     *
     * Applications using `AdwNavigationView` to implement a browser may want to
     * disable it.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var popOnEscape: Boolean
        /**
         * Gets whether pressing Escape pops the current page on @self.
         *
         * @return whether to pop the current page
         * @since 1.4
         */
        get() = adw_navigation_view_get_pop_on_escape(adwNavigationViewPointer).asBoolean()

        /**
         * Sets whether pressing Escape pops the current page on @self.
         *
         * Applications using `AdwNavigationView` to implement a browser may want to
         * disable it.
         *
         * @param popOnEscape whether to pop the current page when pressing Escape
         * @since 1.4
         */
        @AdwVersion1_4
        set(popOnEscape) = adw_navigation_view_set_pop_on_escape(adwNavigationViewPointer, popOnEscape.asGBoolean())

    /**
     * The currently visible page.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public val visiblePage: NavigationPage?
        /**
         * Gets the currently visible page in @self.
         *
         * @return the currently visible page
         * @since 1.4
         */
        get() = adw_navigation_view_get_visible_page(adwNavigationViewPointer)?.run {
            NavigationPage(this)
        }

    /**
     * Creates a new `AdwNavigationView`.
     *
     * @return the new created `AdwNavigationView`
     * @since 1.4
     */
    public constructor() : this(adw_navigation_view_new()!!.reinterpret())

    /**
     * Permanently adds @page to @self.
     *
     * Any page that has been added will stay in @self even after being popped from
     * the navigation stack.
     *
     * Adding a page while no page is visible will automatically push it to the
     * navigation stack.
     *
     * See [method@NavigationView.remove].
     *
     * @param page the page to add
     * @since 1.4
     */
    @AdwVersion1_4
    public fun add(page: NavigationPage): Unit =
        adw_navigation_view_add(adwNavigationViewPointer, page.adwNavigationPagePointer)

    /**
     * Finds a page in @self by its tag.
     *
     * See [property@NavigationPage:tag].
     *
     * @param tag a page tag
     * @return the page with the given tag
     * @since 1.4
     */
    @AdwVersion1_4
    public fun findPage(tag: String): NavigationPage? =
        adw_navigation_view_find_page(adwNavigationViewPointer, tag)?.run {
            NavigationPage(this)
        }

    /**
     * Gets the previous page for @page.
     *
     * If @page is in the navigation stack, returns the page popping @page will
     * reveal.
     *
     * If @page is the root page or is not in the navigation stack, returns `NULL`.
     *
     * @param page a page in @self
     * @return the previous page
     * @since 1.4
     */
    @AdwVersion1_4
    public fun getPreviousPage(page: NavigationPage): NavigationPage? =
        adw_navigation_view_get_previous_page(adwNavigationViewPointer, page.adwNavigationPagePointer)?.run {
            NavigationPage(this)
        }

    /**
     * Pops the visible page from the navigation stack.
     *
     * Does nothing if the navigation stack contains less than two pages.
     *
     * If [method@NavigationView.add] hasn't been called, the page is automatically
     * removed.
     *
     * [signal@NavigationView::popped] will be emitted for the current visible page.
     *
     * See [method@NavigationView.pop_to_page] and
     * [method@NavigationView.pop_to_tag].
     *
     * @return `TRUE` if a page has been popped
     * @since 1.4
     */
    @AdwVersion1_4
    public fun pop(): Boolean = adw_navigation_view_pop(adwNavigationViewPointer).asBoolean()

    /**
     * Pops pages from the navigation stack until @page is visible.
     *
     * @page must be in the navigation stack.
     *
     * If [method@NavigationView.add] hasn't been called for any of the popped pages,
     * they are automatically removed.
     *
     * [signal@NavigationView::popped] will be be emitted for each of the popped
     * pages.
     *
     * See [method@NavigationView.pop] and [method@NavigationView.pop_to_tag].
     *
     * @param page the page to pop to
     * @return `TRUE` if any pages have been popped
     * @since 1.4
     */
    @AdwVersion1_4
    public fun popToPage(page: NavigationPage): Boolean =
        adw_navigation_view_pop_to_page(adwNavigationViewPointer, page.adwNavigationPagePointer).asBoolean()

    /**
     * Pops pages from the navigation stack until page with the tag @tag is visible.
     *
     * The page must be in the navigation stack.
     *
     * If [method@NavigationView.add] hasn't been called for any of the popped pages,
     * they are automatically removed.
     *
     * [signal@NavigationView::popped] will be emitted for each of the popped pages.
     *
     * See [method@NavigationView.pop_to_page] and [property@NavigationPage:tag].
     *
     * @param tag a page tag
     * @return `TRUE` if any pages have been popped
     * @since 1.4
     */
    @AdwVersion1_4
    public fun popToTag(tag: String): Boolean =
        adw_navigation_view_pop_to_tag(adwNavigationViewPointer, tag).asBoolean()

    /**
     * Pushes @page onto the navigation stack.
     *
     * If [method@NavigationView.add] hasn't been called, the page is automatically
     * removed once it's popped.
     *
     * [signal@NavigationView::pushed] will be emitted for @page.
     *
     * See [method@NavigationView.push_by_tag].
     *
     * @param page the page to push
     * @since 1.4
     */
    @AdwVersion1_4
    public fun push(page: NavigationPage): Unit =
        adw_navigation_view_push(adwNavigationViewPointer, page.adwNavigationPagePointer)

    /**
     * Pushes the page with the tag @tag onto the navigation stack.
     *
     * If [method@NavigationView.add] hasn't been called, the page is automatically
     * removed once it's popped.
     *
     * [signal@NavigationView::pushed] will be emitted for the page.
     *
     * See [method@NavigationView.push] and [property@NavigationPage:tag].
     *
     * @param tag the page tag
     * @since 1.4
     */
    @AdwVersion1_4
    public fun pushByTag(tag: String): Unit = adw_navigation_view_push_by_tag(adwNavigationViewPointer, tag)

    /**
     * Removes @page from @self.
     *
     * If @page is currently in the navigation stack, it will be removed once it's
     * popped. Otherwise, it's removed immediately.
     *
     * See [method@NavigationView.add].
     *
     * @param page the page to remove
     * @since 1.4
     */
    @AdwVersion1_4
    public fun remove(page: NavigationPage): Unit =
        adw_navigation_view_remove(adwNavigationViewPointer, page.adwNavigationPagePointer)

    /**
     * Replaces the current navigation stack with pages with the tags @tags.
     *
     * The last page becomes the visible page.
     *
     * Replacing the navigation stack has no animation.
     *
     * If [method@NavigationView.add] hasn't been called for any pages that are no
     * longer in the navigation stack, they are automatically removed.
     *
     * @n_tags can be 0, in that case no page will be visible after calling this
     * method. This can be useful for removing all pages from @self.
     *
     * The [signal@NavigationView::replaced] signal will be emitted.
     *
     * See [method@NavigationView.replace] and [property@NavigationPage:tag].
     *
     * @param tags tags of the pages in the
     *   navigation stack
     * @param nTags the number of tags
     * @since 1.4
     */
    @AdwVersion1_4
    public fun replaceWithTags(tags: List<String>, nTags: gint): Unit = memScoped {
        return adw_navigation_view_replace_with_tags(adwNavigationViewPointer, tags.toCStringList(this), nTags)
    }

    /**
     * Emitted when a push shortcut or a gesture is triggered.
     *
     * To support the push shortcuts and gestures, the application is expected to
     * return the page to push in the handler.
     *
     * This signal can be emitted multiple times for the gestures, for example
     * when the gesture is cancelled by the user. As such, the application must
     * not make any irreversible changes in the handler, such as removing the page
     * from a forward stack.
     *
     * Instead, it should be done in the [signal@NavigationView::pushed] handler.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns the page to push
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onGetNextPage(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> NavigationPage?): ULong =
        g_signal_connect_data(
            gPointer,
            "get-next-page",
            onGetNextPageFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after @page has been popped from the navigation stack.
     *
     * See [method@NavigationView.pop].
     *
     * When using [method@NavigationView.pop_to_page] or
     * [method@NavigationView.pop_to_tag], this signal is emitted for each of the
     * popped pages.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` the popped page
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onPopped(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (page: NavigationPage) -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "popped",
            onPoppedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "popped" signal. See [onPopped].
     *
     * @param page the popped page
     * @since 1.4
     */
    @AdwVersion1_4
    public fun emitPopped(page: NavigationPage) {
        g_signal_emit_by_name(gPointer.reinterpret(), "popped", page.adwNavigationPagePointer)
    }

    /**
     * Emitted after a page has been pushed to the navigation stack.
     *
     * See [method@NavigationView.push].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onPushed(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "pushed",
            onPushedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "pushed" signal. See [onPushed].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun emitPushed() {
        g_signal_emit_by_name(gPointer.reinterpret(), "pushed")
    }

    /**
     * Emitted after the navigation stack has been replaced.
     *
     * See [method@NavigationView.replace].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onReplaced(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "replaced",
            onReplacedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "replaced" signal. See [onReplaced].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun emitReplaced() {
        g_signal_emit_by_name(gPointer.reinterpret(), "replaced")
    }

    public companion object : TypeCompanion<NavigationView> {
        override val type: GeneratedClassKGType<NavigationView> =
            GeneratedClassKGType(adw_navigation_view_get_type()) { NavigationView(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of NavigationView
         *
         * @return the GType
         */
        public fun getType(): GType = adw_navigation_view_get_type()
    }
}

private val onGetNextPageFunc: CPointer<CFunction<() -> CPointer<AdwNavigationPage>?>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> NavigationPage?>().get().invoke()?.adwNavigationPagePointer
    }
        .reinterpret()

private val onPoppedFunc: CPointer<CFunction<(CPointer<AdwNavigationPage>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwNavigationPage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: NavigationPage) -> Unit>().get().invoke(
            page!!.run {
                NavigationPage(this)
            }
        )
    }
        .reinterpret()

private val onPushedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onReplacedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
