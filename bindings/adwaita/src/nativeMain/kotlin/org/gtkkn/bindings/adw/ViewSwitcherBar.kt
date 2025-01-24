// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwViewSwitcherBar
import org.gtkkn.native.adw.adw_view_switcher_bar_get_reveal
import org.gtkkn.native.adw.adw_view_switcher_bar_get_stack
import org.gtkkn.native.adw.adw_view_switcher_bar_get_type
import org.gtkkn.native.adw.adw_view_switcher_bar_new
import org.gtkkn.native.adw.adw_view_switcher_bar_set_reveal
import org.gtkkn.native.adw.adw_view_switcher_bar_set_stack
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean

/**
 * A view switcher action bar.
 *
 * <picture>
 *   <source srcset="view-switcher-bar-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="view-switcher-bar.png" alt="view-switcher-bar">
 * </picture>
 *
 * An action bar letting you switch between multiple views contained in a
 * [class@ViewStack], via an [class@ViewSwitcher]. It is designed to be put at
 * the bottom of a window and to be revealed only on really narrow windows, e.g.
 * on mobile phones. It can't be revealed if there are less than two pages.
 *
 * `AdwViewSwitcherBar` is intended to be used together with
 * `AdwViewSwitcher` in a header bar, and a [class@Breakpoint] showing the view
 * switcher bar on narrow sizes, while removing the view switcher from the
 * header bar, as follows:
 *
 * ```xml
 * <object class="AdwWindow">
 *   <property name="width-request">360</property>
 *   <property name="height-request">200</property>
 *   <child>
 *     <object class="AdwBreakpoint">
 *       <condition>max-width: 550sp</condition>
 *       <setter object="switcher_bar" property="reveal">True</setter>
 *       <setter object="header_bar" property="title-widget"/>
 *     </object>
 *   </child>
 *   <property name="content">
 *     <object class="AdwToolbarView">
 *       <child type="top">
 *         <object class="AdwHeaderBar" id="header_bar">
 *           <property name="title-widget">
 *             <object class="AdwViewSwitcher">
 *               <property name="stack">stack</property>
 *               <property name="policy">wide</property>
 *             </object>
 *           </property>
 *         </object>
 *       </child>
 *       <property name="content">
 *         <object class="AdwViewStack" id="stack"/>
 *       </property>
 *       <child type="bottom">
 *         <object class="AdwViewSwitcherBar" id="switcher_bar">
 *           <property name="stack">stack</property>
 *         </object>
 *       </child>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * It's recommended to set [property@ViewSwitcher:policy] to
 * `ADW_VIEW_SWITCHER_POLICY_WIDE` in this case.
 *
 * You may have to adjust the breakpoint condition for your specific pages.
 *
 * ## CSS nodes
 *
 * `AdwViewSwitcherBar` has a single CSS node with name` viewswitcherbar`.
 */
public class ViewSwitcherBar(public val adwViewSwitcherBarPointer: CPointer<AdwViewSwitcherBar>) :
    Widget(adwViewSwitcherBarPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether the bar should be revealed or hidden.
     */
    public var reveal: Boolean
        /**
         * Gets whether @self should be revealed or hidden.
         *
         * @return whether @self is revealed
         */
        get() = adw_view_switcher_bar_get_reveal(adwViewSwitcherBarPointer).asBoolean()

        /**
         * Sets whether @self should be revealed or hidden.
         *
         * @param reveal whether to reveal @self
         */
        set(reveal) = adw_view_switcher_bar_set_reveal(adwViewSwitcherBarPointer, reveal.asGBoolean())

    /**
     * The stack the view switcher controls.
     */
    public var stack: ViewStack?
        /**
         * Gets the stack controlled by @self.
         *
         * @return the stack
         */
        get() = adw_view_switcher_bar_get_stack(adwViewSwitcherBarPointer)?.run {
            ViewStack(this)
        }

        /**
         * Sets the stack controlled by @self.
         *
         * @param stack a stack
         */
        set(stack) = adw_view_switcher_bar_set_stack(adwViewSwitcherBarPointer, stack?.adwViewStackPointer)

    /**
     * Creates a new `AdwViewSwitcherBar`.
     *
     * @return the newly created `AdwViewSwitcherBar`
     */
    public constructor() : this(adw_view_switcher_bar_new()!!.reinterpret())

    public companion object : TypeCompanion<ViewSwitcherBar> {
        override val type: GeneratedClassKGType<ViewSwitcherBar> =
            GeneratedClassKGType(adw_view_switcher_bar_get_type()) { ViewSwitcherBar(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ViewSwitcherBar
         *
         * @return the GType
         */
        public fun getType(): GType = adw_view_switcher_bar_get_type()
    }
}
