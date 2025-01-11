// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwNavigationPage
import org.gtkkn.native.adw.adw_navigation_page_get_can_pop
import org.gtkkn.native.adw.adw_navigation_page_get_child
import org.gtkkn.native.adw.adw_navigation_page_get_tag
import org.gtkkn.native.adw.adw_navigation_page_get_title
import org.gtkkn.native.adw.adw_navigation_page_get_type
import org.gtkkn.native.adw.adw_navigation_page_new
import org.gtkkn.native.adw.adw_navigation_page_new_with_tag
import org.gtkkn.native.adw.adw_navigation_page_set_can_pop
import org.gtkkn.native.adw.adw_navigation_page_set_child
import org.gtkkn.native.adw.adw_navigation_page_set_tag
import org.gtkkn.native.adw.adw_navigation_page_set_title
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

/**
 * A page within [class@NavigationView] or [class@NavigationSplitView].
 *
 * Each page has a child widget, a title and optionally a tag.
 *
 * The [signal@NavigationPage::showing], [signal@NavigationPage::shown],
 * [signal@NavigationPage::hiding] and [signal@NavigationPage::hidden] signals
 * can be used to track the page's visibility within its `AdwNavigationView`.
 *
 * ## Header Bar Integration
 *
 * When placed inside `AdwNavigationPage`, [class@HeaderBar] will display the
 * page title instead of window title.
 *
 * When used together with [class@NavigationView], it will also display a back
 * button that can be used to go back to the previous page. Set
 * [property@HeaderBar:show-back-button] to `FALSE` to disable that behavior if
 * it's unwanted.
 *
 * ## CSS Nodes
 *
 * `AdwNavigationPage` has a single CSS node with name
 * `navigation-view-page`.
 *
 * ## Accessibility
 *
 * `AdwNavigationPage` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * @since 1.4
 */
@AdwVersion1_4
public open class NavigationPage(public val adwNavigationPagePointer: CPointer<AdwNavigationPage>) :
    Widget(adwNavigationPagePointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether the page can be popped from navigation stack.
     *
     * Set it to `FALSE` to disable shortcuts and gestures, as well as remove the
     * back button from [class@HeaderBar].
     *
     * Manually calling [method@NavigationView.pop] or using the `navigation.pop`
     * action will still work.
     *
     * See [property@HeaderBar:show-back-button] for removing only the back
     * button, but not shortcuts.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public open var canPop: Boolean
        /**
         * Gets whether @self can be popped from navigation stack.
         *
         * @return whether the page can be popped from navigation stack
         * @since 1.4
         */
        get() = adw_navigation_page_get_can_pop(adwNavigationPagePointer).asBoolean()

        /**
         * Sets whether @self can be popped from navigation stack.
         *
         * Set it to `FALSE` to disable shortcuts and gestures, as well as remove the
         * back button from [class@HeaderBar].
         *
         * Manually calling [method@NavigationView.pop] or using the `navigation.pop`
         * action will still work.
         *
         * See [property@HeaderBar:show-back-button] for removing only the back button,
         * but not shortcuts.
         *
         * @param canPop whether the page can be popped from navigation stack
         * @since 1.4
         */
        @AdwVersion1_4
        set(canPop) = adw_navigation_page_set_can_pop(adwNavigationPagePointer, canPop.asGBoolean())

    /**
     * The child widget.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public open var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         * @since 1.4
         */
        get() = adw_navigation_page_get_child(adwNavigationPagePointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         * @since 1.4
         */
        @AdwVersion1_4
        set(child) = adw_navigation_page_set_child(adwNavigationPagePointer, child?.gtkWidgetPointer)

    /**
     * The page tag.
     *
     * The tag can be used to retrieve the page with
     * [method@NavigationView.find_page], as well as with
     * [method@NavigationView.push_by_tag], [method@NavigationView.pop_to_tag] or
     * [method@NavigationView.replace_with_tags].
     *
     * Tags must be unique within each [class@NavigationView].
     *
     * The tag also must be set to use the `navigation.push` action.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public open var tag: String?
        /**
         * Gets the tag of @self.
         *
         * @return the page tag
         * @since 1.4
         */
        get() = adw_navigation_page_get_tag(adwNavigationPagePointer)?.toKString()

        /**
         * Sets the tag for @self.
         *
         * The tag can be used to retrieve the page with
         * [method@NavigationView.find_page], as well as with
         * [method@NavigationView.push_by_tag], [method@NavigationView.pop_to_tag] or
         * [method@NavigationView.replace_with_tags].
         *
         * Tags must be unique within each [class@NavigationView].
         *
         * The tag also must be set to use the `navigation.push` action.
         *
         * @param tag the page tag
         * @since 1.4
         */
        @AdwVersion1_4
        set(tag) = adw_navigation_page_set_tag(adwNavigationPagePointer, tag)

    /**
     * The page title.
     *
     * It's displayed in [class@HeaderBar] instead of the window title, and used
     * as the tooltip on the next page's back button, as well as by screen reader.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public open var title: String
        /**
         * Gets the title of @self.
         *
         * @return the title of @self
         * @since 1.4
         */
        get() = adw_navigation_page_get_title(adwNavigationPagePointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the title of @self.
         *
         * It's displayed in [class@HeaderBar] instead of the window title, and used as
         * the tooltip on the next page's back button, as well as by screen reader.
         *
         * @param title the title
         * @since 1.4
         */
        @AdwVersion1_4
        set(title) = adw_navigation_page_set_title(adwNavigationPagePointer, title)

    /**
     * Creates a new `AdwNavigationPage`.
     *
     * @param child the child widget
     * @param title the page title
     * @return the new created `AdwNavigationPage`
     * @since 1.4
     */
    public constructor(
        child: Widget,
        title: String,
    ) : this(adw_navigation_page_new(child.gtkWidgetPointer, title)!!.reinterpret())

    /**
     * Creates a new `AdwNavigationPage` with provided tag.
     *
     * @param child the child widget
     * @param title the page title
     * @param tag the page tag
     * @return the new created `AdwNavigationPage`
     * @since 1.4
     */
    public constructor(
        child: Widget,
        title: String,
        tag: String,
    ) : this(adw_navigation_page_new_with_tag(child.gtkWidgetPointer, title, tag)!!.reinterpret())

    /**
     * Emitted when the navigation view transition has been completed and the page
     * is fully hidden.
     *
     * It will always be preceded by [signal@NavigationPage::hiding] or
     * [signal@NavigationPage::showing].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onHidden(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwNavigationPagePointer,
            "hidden",
            onHiddenFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "hidden" signal. See [onHidden].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun emitHidden() {
        g_signal_emit_by_name(adwNavigationPagePointer.reinterpret(), "hidden")
    }

    /**
     * Emitted when the page starts hiding at the beginning of the navigation view
     * transition.
     *
     * It will always be followed by [signal@NavigationPage::hidden] or
     * [signal@NavigationPage::shown].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onHiding(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwNavigationPagePointer,
            "hiding",
            onHidingFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "hiding" signal. See [onHiding].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun emitHiding() {
        g_signal_emit_by_name(adwNavigationPagePointer.reinterpret(), "hiding")
    }

    /**
     * Emitted when the page shows at the beginning of the navigation view
     * transition.
     *
     * It will always be followed by [signal@NavigationPage::shown] or
     * [signal@NavigationPage::hidden].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onShowing(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwNavigationPagePointer,
            "showing",
            onShowingFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "showing" signal. See [onShowing].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun emitShowing() {
        g_signal_emit_by_name(adwNavigationPagePointer.reinterpret(), "showing")
    }

    /**
     * Emitted when the navigation view transition has been completed and the page
     * is fully shown.
     *
     * It will always be preceded by [signal@NavigationPage::showing] or
     * [signal@NavigationPage::hiding].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onShown(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwNavigationPagePointer,
            "shown",
            onShownFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "shown" signal. See [onShown].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun emitShown() {
        g_signal_emit_by_name(adwNavigationPagePointer.reinterpret(), "shown")
    }

    public companion object : TypeCompanion<NavigationPage> {
        override val type: GeneratedClassKGType<NavigationPage> =
            GeneratedClassKGType(adw_navigation_page_get_type()) { NavigationPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of NavigationPage
         *
         * @return the GType
         */
        public fun getType(): GType = adw_navigation_page_get_type()
    }
}

private val onHiddenFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onHidingFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onShowingFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onShownFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
