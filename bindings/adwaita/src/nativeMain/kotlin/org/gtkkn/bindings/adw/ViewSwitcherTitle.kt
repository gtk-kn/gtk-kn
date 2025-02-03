// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwViewSwitcherTitle
import org.gtkkn.native.adw.adw_view_switcher_title_get_stack
import org.gtkkn.native.adw.adw_view_switcher_title_get_subtitle
import org.gtkkn.native.adw.adw_view_switcher_title_get_title
import org.gtkkn.native.adw.adw_view_switcher_title_get_title_visible
import org.gtkkn.native.adw.adw_view_switcher_title_get_type
import org.gtkkn.native.adw.adw_view_switcher_title_get_view_switcher_enabled
import org.gtkkn.native.adw.adw_view_switcher_title_new
import org.gtkkn.native.adw.adw_view_switcher_title_set_stack
import org.gtkkn.native.adw.adw_view_switcher_title_set_subtitle
import org.gtkkn.native.adw.adw_view_switcher_title_set_title
import org.gtkkn.native.adw.adw_view_switcher_title_set_view_switcher_enabled
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 1.4.
 *
 * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
 * ---
 *
 * A view switcher title.
 *
 * <picture>
 *   <source srcset="view-switcher-title-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="view-switcher-title.png" alt="view-switcher-title">
 * </picture>
 *
 * A widget letting you switch between multiple views contained by a
 * [class@ViewStack] via an [class@ViewSwitcher].
 *
 * It is designed to be used as the title widget of a [class@HeaderBar], and
 * will display the window's title when the window is too narrow to fit the view
 * switcher e.g. on mobile phones, or if there are less than two views.
 *
 * In order to center the title in narrow windows, the header bar should have
 * [property@HeaderBar:centering-policy] set to
 * `ADW_CENTERING_POLICY_STRICT`.
 *
 * `AdwViewSwitcherTitle` is intended to be used together with
 * [class@ViewSwitcherBar].
 *
 * A common use case is to bind the [property@ViewSwitcherBar:reveal] property
 * to [property@ViewSwitcherTitle:title-visible] to automatically reveal the
 * view switcher bar when the title label is displayed in place of the view
 * switcher, as follows:
 *
 * ```xml
 * <object class="AdwWindow">
 *   <property name="content">
 *     <object class="AdwToolbarView">
 *       <child type="top">
 *         <object class="AdwHeaderBar">
 *           <property name="centering-policy">strict</property>
 *           <property name="title-widget">
 *             <object class="AdwViewSwitcherTitle" id="title">
 *               <property name="stack">stack</property>
 *             </object>
 *           </property>
 *         </object>
 *       </child>
 *       <property name="content">
 *         <object class="AdwViewStack" id="stack"/>
 *       </property>
 *       <child type="bottom">
 *         <object class="AdwViewSwitcherBar">
 *           <property name="stack">stack</property>
 *           <binding name="reveal">
 *             <lookup name="title-visible">title</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * ## CSS nodes
 *
 * `AdwViewSwitcherTitle` has a single CSS node with name `viewswitchertitle`.
 */
public class ViewSwitcherTitle(public val adwViewSwitcherTitlePointer: CPointer<AdwViewSwitcherTitle>) :
    Widget(adwViewSwitcherTitlePointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
     * ---
     *
     * The stack the view switcher controls.
     */
    public var stack: ViewStack?
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
         * ---
         *
         * Gets the stack controlled by @self.
         *
         * @return the stack
         */
        get() = adw_view_switcher_title_get_stack(adwViewSwitcherTitlePointer)?.run {
            InstanceCache.get(this, true) { ViewStack(reinterpret()) }!!
        }

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
         * ---
         *
         * Sets the stack controlled by @self.
         *
         * @param stack a stack
         */
        set(stack) = adw_view_switcher_title_set_stack(adwViewSwitcherTitlePointer, stack?.adwViewStackPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
     * ---
     *
     * The subtitle to display.
     *
     * The subtitle should give the user additional details.
     */
    public var subtitle: String
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
         * ---
         *
         * Gets the subtitle of @self.
         *
         * @return the subtitle
         */
        get() = adw_view_switcher_title_get_subtitle(adwViewSwitcherTitlePointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
         * ---
         *
         * Sets the subtitle of @self.
         *
         * The subtitle should give the user additional details.
         *
         * @param subtitle a subtitle
         */
        set(subtitle) = adw_view_switcher_title_set_subtitle(adwViewSwitcherTitlePointer, subtitle)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
     * ---
     *
     * The title to display.
     *
     * The title typically identifies the current view or content item, and
     * generally does not use the application name.
     */
    public var title: String
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
         * ---
         *
         * Gets the title of @self.
         *
         * @return the title
         */
        get() = adw_view_switcher_title_get_title(adwViewSwitcherTitlePointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
         * ---
         *
         * Sets the title of @self.
         *
         * The title typically identifies the current view or content item, and
         * generally does not use the application name.
         *
         * @param title a title
         */
        set(title) = adw_view_switcher_title_set_title(adwViewSwitcherTitlePointer, title)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
     * ---
     *
     * Whether the title is currently visible.
     *
     * If the title is visible, it means the view switcher is hidden an it may be
     * wanted to show an alternative switcher, e.g. a [class@ViewSwitcherBar].
     */
    public val titleVisible: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
         * ---
         *
         * Gets whether the title of @self is currently visible.
         *
         * If the title is visible, it means the view switcher is hidden an it may be
         * wanted to show an alternative switcher, e.g. a [class@ViewSwitcherBar].
         *
         * @return whether the title of @self is currently visible
         */
        get() = adw_view_switcher_title_get_title_visible(adwViewSwitcherTitlePointer).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
     * ---
     *
     * Whether the view switcher is enabled.
     *
     * If it is disabled, the title will be displayed instead. This allows to
     * programmatically hide the view switcher even if it fits in the available
     * space.
     *
     * This can be used e.g. to ensure the view switcher is hidden below a certain
     * window width, or any other constraint you find suitable.
     */
    public var viewSwitcherEnabled: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
         * ---
         *
         * Gets whether @self's view switcher is enabled.
         *
         * @return whether the view switcher is enabled
         */
        get() = adw_view_switcher_title_get_view_switcher_enabled(adwViewSwitcherTitlePointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
         * ---
         *
         * Sets whether @self's view switcher is enabled.
         *
         * If it is disabled, the title will be displayed instead. This allows to
         * programmatically hide the view switcher even if it fits in the available
         * space.
         *
         * This can be used e.g. to ensure the view switcher is hidden below a certain
         * window width, or any other constraint you find suitable.
         *
         * @param enabled whether the view switcher is enabled
         */
        set(
            enabled
        ) = adw_view_switcher_title_set_view_switcher_enabled(adwViewSwitcherTitlePointer, enabled.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwviewswitchertitle)
     * ---
     *
     * Creates a new `AdwViewSwitcherTitle`.
     *
     * @return the newly created `AdwViewSwitcherTitle`
     */
    public constructor() : this(adw_view_switcher_title_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<ViewSwitcherTitle> {
        override val type: GeneratedClassKGType<ViewSwitcherTitle> =
            GeneratedClassKGType(getTypeOrNull()!!) { ViewSwitcherTitle(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ViewSwitcherTitle
         *
         * @return the GType
         */
        public fun getType(): GType = adw_view_switcher_title_get_type()

        /**
         * Gets the GType of from the symbol `adw_view_switcher_title_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_view_switcher_title_get_type")
    }
}
