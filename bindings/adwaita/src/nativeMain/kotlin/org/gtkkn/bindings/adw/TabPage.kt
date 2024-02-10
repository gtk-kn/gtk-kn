// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwTabPage
import org.gtkkn.native.adw.adw_tab_page_get_child
import org.gtkkn.native.adw.adw_tab_page_get_icon
import org.gtkkn.native.adw.adw_tab_page_get_indicator_activatable
import org.gtkkn.native.adw.adw_tab_page_get_indicator_icon
import org.gtkkn.native.adw.adw_tab_page_get_loading
import org.gtkkn.native.adw.adw_tab_page_get_needs_attention
import org.gtkkn.native.adw.adw_tab_page_get_parent
import org.gtkkn.native.adw.adw_tab_page_get_pinned
import org.gtkkn.native.adw.adw_tab_page_get_selected
import org.gtkkn.native.adw.adw_tab_page_get_title
import org.gtkkn.native.adw.adw_tab_page_get_tooltip
import org.gtkkn.native.adw.adw_tab_page_get_type
import org.gtkkn.native.adw.adw_tab_page_set_icon
import org.gtkkn.native.adw.adw_tab_page_set_indicator_activatable
import org.gtkkn.native.adw.adw_tab_page_set_indicator_icon
import org.gtkkn.native.adw.adw_tab_page_set_loading
import org.gtkkn.native.adw.adw_tab_page_set_needs_attention
import org.gtkkn.native.adw.adw_tab_page_set_title
import org.gtkkn.native.adw.adw_tab_page_set_tooltip
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * An auxiliary class used by [class@TabView].
 *
 * ## Skipped during bindings generation
 *
 * - method `tooltip`: Property TypeInfo of getter and setter do not match
 */
public class TabPage(
    pointer: CPointer<AdwTabPage>,
) : Object(pointer.reinterpret()), KGTyped {
    public val adwTabPagePointer: CPointer<AdwTabPage>
        get() = gPointer.reinterpret()

    /**
     * The child of the page.
     *
     * @since 1.0
     */
    public val child: Widget
        /**
         * Gets the child of @self.
         *
         * @return the child of @self
         * @since 1.0
         */
        get() =
            adw_tab_page_get_child(adwTabPagePointer.reinterpret())!!.run {
                Widget(reinterpret())
            }

    /**
     * The icon of the page.
     *
     * [class@TabBar] displays the icon next to the title.
     *
     * It will not show the icon if [property@TabPage:loading] is set to `TRUE`,
     * or if the page is pinned and [propertyTabPage:indicator-icon] is set.
     *
     * @since 1.0
     */
    public var icon: Icon?
        /**
         * Gets the icon of @self.
         *
         * @return the icon of @self
         * @since 1.0
         */
        get() =
            adw_tab_page_get_icon(adwTabPagePointer.reinterpret())?.run {
                Icon.wrap(reinterpret())
            }

        /**
         * Sets the icon of @self.
         *
         * @param icon the icon of @self
         * @since 1.0
         */
        set(icon) = adw_tab_page_set_icon(adwTabPagePointer.reinterpret(), icon?.gioIconPointer)

    /**
     * Whether the indicator icon is activatable.
     *
     * If set to `TRUE`, [signal@TabView::indicator-activated] will be emitted
     * when the indicator icon is clicked.
     *
     * If [property@TabPage:indicator-icon] is not set, does nothing.
     *
     * @since 1.0
     */
    public var indicatorActivatable: Boolean
        /**
         * Gets whether the indicator of @self is activatable.
         *
         * @return whether the indicator is activatable
         * @since 1.0
         */
        get() = adw_tab_page_get_indicator_activatable(adwTabPagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether the indicator of @self is activatable.
         *
         * @param activatable whether the indicator is activatable
         * @since 1.0
         */
        set(activatable) =
            adw_tab_page_set_indicator_activatable(
                adwTabPagePointer.reinterpret(),
                activatable.asGBoolean()
            )

    /**
     * An indicator icon for the page.
     *
     * A common use case is an audio or camera indicator in a web browser.
     *
     * [class@TabBar] will show it at the beginning of the tab, alongside icon
     * representing [property@TabPage:icon] or loading spinner.
     *
     * If the page is pinned, the indicator will be shown instead of icon or
     * spinner.
     *
     * If [property@TabPage:indicator-activatable] is set to `TRUE`, the
     * indicator icon can act as a button.
     *
     * @since 1.0
     */
    public var indicatorIcon: Icon?
        /**
         * Gets the indicator icon of @self.
         *
         * @return the indicator icon of @self
         * @since 1.0
         */
        get() =
            adw_tab_page_get_indicator_icon(adwTabPagePointer.reinterpret())?.run {
                Icon.wrap(reinterpret())
            }

        /**
         * Sets the indicator icon of @self.
         *
         * @param indicatorIcon the indicator icon of @self
         * @since 1.0
         */
        set(indicatorIcon) =
            adw_tab_page_set_indicator_icon(
                adwTabPagePointer.reinterpret(),
                indicatorIcon?.gioIconPointer
            )

    /**
     * Whether the page is loading.
     *
     * If set to `TRUE`, [class@TabBar] will display a spinner in place of icon.
     *
     * If the page is pinned and [property@TabPage:indicator-icon] is set, the
     * loading status will not be visible.
     *
     * @since 1.0
     */
    public var loading: Boolean
        /**
         * Gets whether @self is loading.
         *
         * @return whether @self is loading
         * @since 1.0
         */
        get() = adw_tab_page_get_loading(adwTabPagePointer.reinterpret()).asBoolean()

        /**
         * Sets wether @self is loading.
         *
         * @param loading whether @self is loading
         * @since 1.0
         */
        set(loading) =
            adw_tab_page_set_loading(
                adwTabPagePointer.reinterpret(),
                loading.asGBoolean()
            )

    /**
     * Whether the page needs attention.
     *
     * [class@TabBar] will display a glow under the tab representing the page if
     * set to `TRUE`. If the tab is not visible, the corresponding edge of the tab
     * bar will be highlighted.
     *
     * @since 1.0
     */
    public var needsAttention: Boolean
        /**
         * Gets whether @self needs attention.
         *
         * @return whether @self needs attention
         * @since 1.0
         */
        get() = adw_tab_page_get_needs_attention(adwTabPagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self needs attention.
         *
         * @param needsAttention whether @self needs attention
         * @since 1.0
         */
        set(needsAttention) =
            adw_tab_page_set_needs_attention(
                adwTabPagePointer.reinterpret(),
                needsAttention.asGBoolean()
            )

    /**
     * The parent page of the page.
     *
     * See [method@TabView.add_page] and [method@TabView.close_page].
     *
     * @since 1.0
     */
    public val parent: TabPage?
        /**
         * Gets the parent page of @self.
         *
         * @return the parent page
         * @since 1.0
         */
        get() =
            adw_tab_page_get_parent(adwTabPagePointer.reinterpret())?.run {
                TabPage(reinterpret())
            }

    /**
     * Whether the page is pinned.
     *
     * See [method@TabView.set_page_pinned].
     *
     * @since 1.0
     */
    public val pinned: Boolean
        /**
         * Gets whether @self is pinned.
         *
         * @return whether @self is pinned
         * @since 1.0
         */
        get() = adw_tab_page_get_pinned(adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * Whether the page is selected.
     *
     * @since 1.0
     */
    public val selected: Boolean
        /**
         * Gets whether @self is selected.
         *
         * @return whether @self is selected
         * @since 1.0
         */
        get() = adw_tab_page_get_selected(adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * The title of the page.
     *
     * [class@TabBar] will display it in the center of the tab unless it's pinned,
     * and will use it as a tooltip unless [property@TabPage:tooltip] is set.
     *
     * @since 1.0
     */
    public var title: String
        /**
         * Gets the title of @self.
         *
         * @return the title of @self
         * @since 1.0
         */
        get() =
            adw_tab_page_get_title(adwTabPagePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title of @self.
         *
         * @param title the title of @self
         * @since 1.0
         */
        set(title) = adw_tab_page_set_title(adwTabPagePointer.reinterpret(), title)

    /**
     * Gets the child of @self.
     *
     * @return the child of @self
     * @since 1.0
     */
    public fun getChild(): Widget =
        adw_tab_page_get_child(adwTabPagePointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     * Gets the icon of @self.
     *
     * @return the icon of @self
     * @since 1.0
     */
    public fun getIcon(): Icon? =
        adw_tab_page_get_icon(adwTabPagePointer.reinterpret())?.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Gets whether the indicator of @self is activatable.
     *
     * @return whether the indicator is activatable
     * @since 1.0
     */
    public fun getIndicatorActivatable(): Boolean =
        adw_tab_page_get_indicator_activatable(adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * Gets the indicator icon of @self.
     *
     * @return the indicator icon of @self
     * @since 1.0
     */
    public fun getIndicatorIcon(): Icon? =
        adw_tab_page_get_indicator_icon(adwTabPagePointer.reinterpret())?.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Gets whether @self is loading.
     *
     * @return whether @self is loading
     * @since 1.0
     */
    public fun getLoading(): Boolean = adw_tab_page_get_loading(adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self needs attention.
     *
     * @return whether @self needs attention
     * @since 1.0
     */
    public fun getNeedsAttention(): Boolean =
        adw_tab_page_get_needs_attention(adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * Gets the parent page of @self.
     *
     * @return the parent page
     * @since 1.0
     */
    public fun getParent(): TabPage? =
        adw_tab_page_get_parent(adwTabPagePointer.reinterpret())?.run {
            TabPage(reinterpret())
        }

    /**
     * Gets whether @self is pinned.
     *
     * @return whether @self is pinned
     * @since 1.0
     */
    public fun getPinned(): Boolean = adw_tab_page_get_pinned(adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self is selected.
     *
     * @return whether @self is selected
     * @since 1.0
     */
    public fun getSelected(): Boolean = adw_tab_page_get_selected(adwTabPagePointer.reinterpret()).asBoolean()

    /**
     * Gets the title of @self.
     *
     * @return the title of @self
     * @since 1.0
     */
    public fun getTitle(): String =
        adw_tab_page_get_title(adwTabPagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the tooltip of @self.
     *
     * @return the tooltip of @self
     * @since 1.0
     */
    public fun getTooltip(): String? = adw_tab_page_get_tooltip(adwTabPagePointer.reinterpret())?.toKString()

    /**
     * Sets the icon of @self.
     *
     * @param icon the icon of @self
     * @since 1.0
     */
    public fun setIcon(icon: Icon? = null): Unit =
        adw_tab_page_set_icon(adwTabPagePointer.reinterpret(), icon?.gioIconPointer)

    /**
     * Sets whether the indicator of @self is activatable.
     *
     * @param activatable whether the indicator is activatable
     * @since 1.0
     */
    public fun setIndicatorActivatable(activatable: Boolean): Unit =
        adw_tab_page_set_indicator_activatable(
            adwTabPagePointer.reinterpret(),
            activatable.asGBoolean()
        )

    /**
     * Sets the indicator icon of @self.
     *
     * @param indicatorIcon the indicator icon of @self
     * @since 1.0
     */
    public fun setIndicatorIcon(indicatorIcon: Icon? = null): Unit =
        adw_tab_page_set_indicator_icon(
            adwTabPagePointer.reinterpret(),
            indicatorIcon?.gioIconPointer
        )

    /**
     * Sets wether @self is loading.
     *
     * @param loading whether @self is loading
     * @since 1.0
     */
    public fun setLoading(loading: Boolean): Unit =
        adw_tab_page_set_loading(adwTabPagePointer.reinterpret(), loading.asGBoolean())

    /**
     * Sets whether @self needs attention.
     *
     * @param needsAttention whether @self needs attention
     * @since 1.0
     */
    public fun setNeedsAttention(needsAttention: Boolean): Unit =
        adw_tab_page_set_needs_attention(
            adwTabPagePointer.reinterpret(),
            needsAttention.asGBoolean()
        )

    /**
     * Sets the title of @self.
     *
     * @param title the title of @self
     * @since 1.0
     */
    public fun setTitle(title: String): Unit = adw_tab_page_set_title(adwTabPagePointer.reinterpret(), title)

    /**
     * Sets the tooltip of @self.
     *
     * @param tooltip the tooltip of @self
     * @since 1.0
     */
    public fun setTooltip(tooltip: String): Unit = adw_tab_page_set_tooltip(adwTabPagePointer.reinterpret(), tooltip)

    public companion object : TypeCompanion<TabPage> {
        override val type: GeneratedClassKGType<TabPage> =
            GeneratedClassKGType(adw_tab_page_get_type()) { TabPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
