// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_2
import org.gtkkn.bindings.adw.annotations.AdwVersion1_3
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Accessible
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwTabPage
import org.gtkkn.native.adw.adw_tab_page_get_child
import org.gtkkn.native.adw.adw_tab_page_get_icon
import org.gtkkn.native.adw.adw_tab_page_get_indicator_activatable
import org.gtkkn.native.adw.adw_tab_page_get_indicator_icon
import org.gtkkn.native.adw.adw_tab_page_get_indicator_tooltip
import org.gtkkn.native.adw.adw_tab_page_get_keyword
import org.gtkkn.native.adw.adw_tab_page_get_live_thumbnail
import org.gtkkn.native.adw.adw_tab_page_get_loading
import org.gtkkn.native.adw.adw_tab_page_get_needs_attention
import org.gtkkn.native.adw.adw_tab_page_get_parent
import org.gtkkn.native.adw.adw_tab_page_get_pinned
import org.gtkkn.native.adw.adw_tab_page_get_selected
import org.gtkkn.native.adw.adw_tab_page_get_thumbnail_xalign
import org.gtkkn.native.adw.adw_tab_page_get_thumbnail_yalign
import org.gtkkn.native.adw.adw_tab_page_get_title
import org.gtkkn.native.adw.adw_tab_page_get_tooltip
import org.gtkkn.native.adw.adw_tab_page_get_type
import org.gtkkn.native.adw.adw_tab_page_invalidate_thumbnail
import org.gtkkn.native.adw.adw_tab_page_set_icon
import org.gtkkn.native.adw.adw_tab_page_set_indicator_activatable
import org.gtkkn.native.adw.adw_tab_page_set_indicator_icon
import org.gtkkn.native.adw.adw_tab_page_set_indicator_tooltip
import org.gtkkn.native.adw.adw_tab_page_set_keyword
import org.gtkkn.native.adw.adw_tab_page_set_live_thumbnail
import org.gtkkn.native.adw.adw_tab_page_set_loading
import org.gtkkn.native.adw.adw_tab_page_set_needs_attention
import org.gtkkn.native.adw.adw_tab_page_set_thumbnail_xalign
import org.gtkkn.native.adw.adw_tab_page_set_thumbnail_yalign
import org.gtkkn.native.adw.adw_tab_page_set_title
import org.gtkkn.native.adw.adw_tab_page_set_tooltip
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * An auxiliary class used by [class@TabView].
 *
 * ## Skipped during bindings generation
 *
 * - method `keyword`: Property TypeInfo of getter and setter do not match
 * - method `tooltip`: Property TypeInfo of getter and setter do not match
 */
public class TabPage(public val adwTabPagePointer: CPointer<AdwTabPage>) :
    Object(adwTabPagePointer.reinterpret()),
    Accessible,
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    /**
     * The child of the page.
     */
    public val child: Widget
        /**
         * Gets the child of @self.
         *
         * @return the child of @self
         */
        get() = adw_tab_page_get_child(adwTabPagePointer)!!.run {
            Widget.WidgetImpl(this)
        }

    /**
     * The icon of the page.
     *
     * [class@TabBar] and [class@TabOverview] display the icon next to the title,
     * unless [property@TabPage:loading] is set to `TRUE`.
     *
     * `AdwTabBar` also won't show the icon if the page is pinned and
     * [propertyTabPage:indicator-icon] is set.
     */
    public var icon: Icon?
        /**
         * Gets the icon of @self.
         *
         * @return the icon of @self
         */
        get() = adw_tab_page_get_icon(adwTabPagePointer)?.run {
            Icon.IconImpl(reinterpret())
        }

        /**
         * Sets the icon of @self.
         *
         * [class@TabBar] and [class@TabOverview] display the icon next to the title,
         * unless [property@TabPage:loading] is set to `TRUE`.
         *
         * `AdwTabBar` also won't show the icon if the page is pinned and
         * [propertyTabPage:indicator-icon] is set.
         *
         * @param icon the icon of @self
         */
        set(icon) = adw_tab_page_set_icon(adwTabPagePointer, icon?.gioIconPointer)

    /**
     * Whether the indicator icon is activatable.
     *
     * If set to `TRUE`, [signal@TabView::indicator-activated] will be emitted
     * when the indicator icon is clicked.
     *
     * If [property@TabPage:indicator-icon] is not set, does nothing.
     */
    public var indicatorActivatable: Boolean
        /**
         * Gets whether the indicator of @self is activatable.
         *
         * @return whether the indicator is activatable
         */
        get() = adw_tab_page_get_indicator_activatable(adwTabPagePointer).asBoolean()

        /**
         * Sets whether the indicator of @self is activatable.
         *
         * If set to `TRUE`, [signal@TabView::indicator-activated] will be emitted
         * when the indicator icon is clicked.
         *
         * If [property@TabPage:indicator-icon] is not set, does nothing.
         *
         * @param activatable whether the indicator is activatable
         */
        set(activatable) = adw_tab_page_set_indicator_activatable(adwTabPagePointer, activatable.asGBoolean())

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
     * [class@TabOverview] will show it at the at the top part of the thumbnail.
     *
     * [property@TabPage:indicator-tooltip] can be used to set the tooltip on the
     * indicator icon.
     *
     * If [property@TabPage:indicator-activatable] is set to `TRUE`, the
     * indicator icon can act as a button.
     */
    public var indicatorIcon: Icon?
        /**
         * Gets the indicator icon of @self.
         *
         * @return the indicator icon of @self
         */
        get() = adw_tab_page_get_indicator_icon(adwTabPagePointer)?.run {
            Icon.IconImpl(reinterpret())
        }

        /**
         * Sets the indicator icon of @self.
         *
         * A common use case is an audio or camera indicator in a web browser.
         *
         * [class@TabBar] will show it at the beginning of the tab, alongside icon
         * representing [property@TabPage:icon] or loading spinner.
         *
         * If the page is pinned, the indicator will be shown instead of icon or
         * spinner.
         *
         * [class@TabOverview] will show it at the at the top part of the thumbnail.
         *
         * [property@TabPage:indicator-tooltip] can be used to set the tooltip on the
         * indicator icon.
         *
         * If [property@TabPage:indicator-activatable] is set to `TRUE`, the
         * indicator icon can act as a button.
         *
         * @param indicatorIcon the indicator icon of @self
         */
        set(indicatorIcon) = adw_tab_page_set_indicator_icon(adwTabPagePointer, indicatorIcon?.gioIconPointer)

    /**
     * The tooltip of the indicator icon.
     *
     * The tooltip can be marked up with the Pango text markup language.
     *
     * See [property@TabPage:indicator-icon].
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public var indicatorTooltip: String
        /**
         * Gets the tooltip of the indicator icon of @self.
         *
         * @return the indicator tooltip of @self
         * @since 1.2
         */
        get() = adw_tab_page_get_indicator_tooltip(adwTabPagePointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the tooltip of the indicator icon of @self.
         *
         * The tooltip can be marked up with the Pango text markup language.
         *
         * See [property@TabPage:indicator-icon].
         *
         * @param tooltip the indicator tooltip of @self
         * @since 1.2
         */
        @AdwVersion1_2
        set(tooltip) = adw_tab_page_set_indicator_tooltip(adwTabPagePointer, tooltip)

    /**
     * Whether to enable live thumbnail for this page.
     *
     * When set to `TRUE`, the page's thumbnail in [class@TabOverview] will update
     * immediately when the page is redrawn or resized.
     *
     * If it's set to `FALSE`, the thumbnail will only be live when the page is
     * selected, and otherwise it will be static and will only update when
     * [method@TabPage.invalidate_thumbnail] or
     * [method@TabView.invalidate_thumbnails] is called.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var liveThumbnail: Boolean
        /**
         * Gets whether to live thumbnail is enabled @self.
         *
         * @return whether live thumbnail is enabled
         * @since 1.3
         */
        get() = adw_tab_page_get_live_thumbnail(adwTabPagePointer).asBoolean()

        /**
         * Sets whether to enable live thumbnail for @self.
         *
         * When set to `TRUE`, @self's thumbnail in [class@TabOverview] will update
         * immediately when @self is redrawn or resized.
         *
         * If it's set to `FALSE`, the thumbnail will only be live when the @self is
         * selected, and otherwise it will be static and will only update when
         * [method@TabPage.invalidate_thumbnail] or
         * [method@TabView.invalidate_thumbnails] is called.
         *
         * @param liveThumbnail whether to enable live thumbnail
         * @since 1.3
         */
        @AdwVersion1_3
        set(liveThumbnail) = adw_tab_page_set_live_thumbnail(adwTabPagePointer, liveThumbnail.asGBoolean())

    /**
     * Whether the page is loading.
     *
     * If set to `TRUE`, [class@TabBar] and [class@TabOverview] will display a
     * spinner in place of icon.
     *
     * If the page is pinned and [property@TabPage:indicator-icon] is set,
     * loading status will not be visible with `AdwTabBar`.
     */
    public var loading: Boolean
        /**
         * Gets whether @self is loading.
         *
         * @return whether @self is loading
         */
        get() = adw_tab_page_get_loading(adwTabPagePointer).asBoolean()

        /**
         * Sets whether @self is loading.
         *
         * If set to `TRUE`, [class@TabBar] and [class@TabOverview] will display a
         * spinner in place of icon.
         *
         * If the page is pinned and [property@TabPage:indicator-icon] is set, loading
         * status will not be visible with `AdwTabBar`.
         *
         * @param loading whether @self is loading
         */
        set(loading) = adw_tab_page_set_loading(adwTabPagePointer, loading.asGBoolean())

    /**
     * Whether the page needs attention.
     *
     * [class@TabBar] will display a line under the tab representing the page if
     * set to `TRUE`. If the tab is not visible, the corresponding edge of the tab
     * bar will be highlighted.
     *
     * [class@TabOverview] will display a dot in the corner of the thumbnail if set
     * to `TRUE`.
     *
     * [class@TabButton] will display a dot if any of the pages that aren't
     * selected have this property set to `TRUE`.
     */
    public var needsAttention: Boolean
        /**
         * Gets whether @self needs attention.
         *
         * @return whether @self needs attention
         */
        get() = adw_tab_page_get_needs_attention(adwTabPagePointer).asBoolean()

        /**
         * Sets whether @self needs attention.
         *
         * [class@TabBar] will display a line under the tab representing the page if
         * set to `TRUE`. If the tab is not visible, the corresponding edge of the tab
         * bar will be highlighted.
         *
         * [class@TabOverview] will display a dot in the corner of the thumbnail if set
         * to `TRUE`.
         *
         * [class@TabButton] will display a dot if any of the pages that aren't
         * selected have [property@TabPage:needs-attention] set to `TRUE`.
         *
         * @param needsAttention whether @self needs attention
         */
        set(needsAttention) = adw_tab_page_set_needs_attention(adwTabPagePointer, needsAttention.asGBoolean())

    /**
     * The parent page of the page.
     *
     * See [method@TabView.add_page] and [method@TabView.close_page].
     */
    public val parent: TabPage?
        /**
         * Gets the parent page of @self.
         *
         * See [method@TabView.add_page] and [method@TabView.close_page].
         *
         * @return the parent page
         */
        get() = adw_tab_page_get_parent(adwTabPagePointer)?.run {
            TabPage(this)
        }

    /**
     * Whether the page is pinned.
     *
     * See [method@TabView.set_page_pinned].
     */
    public val pinned: Boolean
        /**
         * Gets whether @self is pinned.
         *
         * See [method@TabView.set_page_pinned].
         *
         * @return whether @self is pinned
         */
        get() = adw_tab_page_get_pinned(adwTabPagePointer).asBoolean()

    /**
     * Whether the page is selected.
     */
    public val selected: Boolean
        /**
         * Gets whether @self is selected.
         *
         * @return whether @self is selected
         */
        get() = adw_tab_page_get_selected(adwTabPagePointer).asBoolean()

    /**
     * The horizontal alignment of the page thumbnail.
     *
     * If the page is so wide that [class@TabOverview] can't display it completely
     * and has to crop it, horizontal alignment will determine which part of the
     * page will be visible.
     *
     * For example, 0.5 means the center of the page will be visible, 0 means the
     * start edge will be visible and 1 means the end edge will be visible.
     *
     * The default horizontal alignment is 0.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var thumbnailXalign: gfloat
        /**
         * Gets the horizontal alignment of the thumbnail for @self.
         *
         * @return the horizontal alignment
         * @since 1.3
         */
        get() = adw_tab_page_get_thumbnail_xalign(adwTabPagePointer)

        /**
         * Sets the horizontal alignment of the thumbnail for @self.
         *
         * If the page is so wide that [class@TabOverview] can't display it completely
         * and has to crop it, horizontal alignment will determine which part of the
         * page will be visible.
         *
         * For example, 0.5 means the center of the page will be visible, 0 means the
         * start edge will be visible and 1 means the end edge will be visible.
         *
         * The default horizontal alignment is 0.
         *
         * @param xalign the new value
         * @since 1.3
         */
        @AdwVersion1_3
        set(xalign) = adw_tab_page_set_thumbnail_xalign(adwTabPagePointer, xalign)

    /**
     * The vertical alignment of the page thumbnail.
     *
     * If the page is so tall that [class@TabOverview] can't display it completely
     * and has to crop it, vertical alignment will determine which part of the
     * page will be visible.
     *
     * For example, 0.5 means the center of the page will be visible, 0 means the
     * top edge will be visible and 1 means the bottom edge will be visible.
     *
     * The default vertical alignment is 0.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var thumbnailYalign: gfloat
        /**
         * Gets the vertical alignment of the thumbnail for @self.
         *
         * @return the vertical alignment
         * @since 1.3
         */
        get() = adw_tab_page_get_thumbnail_yalign(adwTabPagePointer)

        /**
         * Sets the vertical alignment of the thumbnail for @self.
         *
         * If the page is so tall that [class@TabOverview] can't display it completely
         * and has to crop it, vertical alignment will determine which part of the page
         * will be visible.
         *
         * For example, 0.5 means the center of the page will be visible, 0 means the
         * top edge will be visible and 1 means the bottom edge will be visible.
         *
         * The default vertical alignment is 0.
         *
         * @param yalign the new value
         * @since 1.3
         */
        @AdwVersion1_3
        set(yalign) = adw_tab_page_set_thumbnail_yalign(adwTabPagePointer, yalign)

    /**
     * The title of the page.
     *
     * [class@TabBar] will display it in the center of the tab unless it's pinned,
     * and will use it as a tooltip unless [property@TabPage:tooltip] is set.
     *
     * [class@TabOverview] will display it below the thumbnail unless it's pinned,
     * or inside the card otherwise, and will use it as a tooltip unless
     * [property@TabPage:tooltip] is set.
     */
    public var title: String
        /**
         * Gets the title of @self.
         *
         * @return the title of @self
         */
        get() = adw_tab_page_get_title(adwTabPagePointer)?.toKString() ?: error("Expected not null string")

        /**
         * [class@TabBar] will display it in the center of the tab unless it's pinned,
         * and will use it as a tooltip unless [property@TabPage:tooltip] is set.
         *
         * [class@TabOverview] will display it below the thumbnail unless it's pinned,
         * or inside the card otherwise, and will use it as a tooltip unless
         * [property@TabPage:tooltip] is set.
         *
         * Sets the title of @self.
         *
         * @param title the title of @self
         */
        set(title) = adw_tab_page_set_title(adwTabPagePointer, title)

    /**
     * Gets the search keyword of @self.
     *
     * @return the search keyword of @self
     * @since 1.3
     */
    @AdwVersion1_3
    public fun getKeyword(): String? = adw_tab_page_get_keyword(adwTabPagePointer)?.toKString()

    /**
     * Gets the tooltip of @self.
     *
     * @return the tooltip of @self
     */
    public fun getTooltip(): String? = adw_tab_page_get_tooltip(adwTabPagePointer)?.toKString()

    /**
     * Invalidates thumbnail for @self.
     *
     * If an [class@TabOverview] is open, the thumbnail representing @self will be
     * immediately updated. Otherwise it will be update when opening the overview.
     *
     * Does nothing if [property@TabPage:live-thumbnail] is set to `TRUE`.
     *
     * See also [method@TabView.invalidate_thumbnails].
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public fun invalidateThumbnail(): Unit = adw_tab_page_invalidate_thumbnail(adwTabPagePointer)

    /**
     * Sets the search keyword for @self.
     *
     * [class@TabOverview] can search pages by their keywords in addition to their
     * titles and tooltips.
     *
     * Keywords allow to include e.g. page URLs into tab search in a web browser.
     *
     * @param keyword the search keyword
     * @since 1.3
     */
    @AdwVersion1_3
    public fun setKeyword(keyword: String): Unit = adw_tab_page_set_keyword(adwTabPagePointer, keyword)

    /**
     * Sets the tooltip of @self.
     *
     * The tooltip can be marked up with the Pango text markup language.
     *
     * If not set, [class@TabBar] and [class@TabOverview] will use
     * [property@TabPage:title] as a tooltip instead.
     *
     * @param tooltip the tooltip of @self
     */
    public fun setTooltip(tooltip: String): Unit = adw_tab_page_set_tooltip(adwTabPagePointer, tooltip)

    public companion object : TypeCompanion<TabPage> {
        override val type: GeneratedClassKGType<TabPage> =
            GeneratedClassKGType(getTypeOrNull("adw_tab_page_get_type")!!) { TabPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of TabPage
         *
         * @return the GType
         */
        public fun getType(): GType = adw_tab_page_get_type()
    }
}
