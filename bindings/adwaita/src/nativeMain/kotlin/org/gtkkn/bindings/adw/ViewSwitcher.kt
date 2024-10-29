// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwViewSwitcher
import org.gtkkn.native.adw.adw_view_switcher_get_policy
import org.gtkkn.native.adw.adw_view_switcher_get_stack
import org.gtkkn.native.adw.adw_view_switcher_get_type
import org.gtkkn.native.adw.adw_view_switcher_new
import org.gtkkn.native.adw.adw_view_switcher_set_policy
import org.gtkkn.native.adw.adw_view_switcher_set_stack
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Unit

/**
 * An adaptive view switcher.
 *
 * <picture>
 *   <source srcset="view-switcher-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="view-switcher.png" alt="view-switcher">
 * </picture>
 *
 * An adaptive view switcher designed to switch between multiple views
 * contained in a [class@ViewStack] in a similar fashion to
 * [class@Gtk.StackSwitcher].
 *
 * `AdwViewSwitcher` buttons always have an icon and a label. They can be
 * displayed side by side, or icon on top of the label. This can be controlled
 * via the [property@ViewSwitcher:policy] property.
 *
 * `AdwViewSwitcher` is intended to be used in a header bar together with
 * [class@ViewSwitcherBar] at the bottom of the window, and a [class@Breakpoint]
 * showing the view switcher bar on narrow sizes, while removing the view
 * switcher from the header bar, as follows:
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
 * `AdwViewSwitcher` has a single CSS node with name `viewswitcher`. It can have
 * the style classes `.wide` and `.narrow`, matching its policy.
 *
 * ## Accessibility
 *
 * `AdwViewSwitcher` uses the `GTK_ACCESSIBLE_ROLE_TAB_LIST` role and uses the
 * `GTK_ACCESSIBLE_ROLE_TAB` for its buttons.
 */
public class ViewSwitcher(
    pointer: CPointer<AdwViewSwitcher>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val adwViewSwitcherPointer: CPointer<AdwViewSwitcher>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The policy to determine which mode to use.
     */
    public var policy: ViewSwitcherPolicy
        /**
         * Gets the policy of @self.
         *
         * @return the policy of @self
         */
        get() =
            adw_view_switcher_get_policy(adwViewSwitcherPointer.reinterpret()).run {
                ViewSwitcherPolicy.fromNativeValue(this)
            }

        /**
         * Sets the policy of @self.
         *
         * @param policy the new policy
         */
        set(policy) =
            adw_view_switcher_set_policy(
                adwViewSwitcherPointer.reinterpret(),
                policy.nativeValue
            )

    /**
     * The stack the view switcher controls.
     */
    public var stack: ViewStack?
        /**
         * Gets the stack controlled by @self.
         *
         * @return the stack
         */
        get() =
            adw_view_switcher_get_stack(adwViewSwitcherPointer.reinterpret())?.run {
                ViewStack(reinterpret())
            }

        /**
         * Sets the stack controlled by @self.
         *
         * @param stack a stack
         */
        set(stack) =
            adw_view_switcher_set_stack(
                adwViewSwitcherPointer.reinterpret(),
                stack?.adwViewStackPointer?.reinterpret()
            )

    /**
     * Creates a new `AdwViewSwitcher`.
     *
     * @return the newly created `AdwViewSwitcher`
     */
    public constructor() : this(adw_view_switcher_new()!!.reinterpret())

    /**
     * Gets the policy of @self.
     *
     * @return the policy of @self
     */
    public fun getPolicy(): ViewSwitcherPolicy =
        adw_view_switcher_get_policy(adwViewSwitcherPointer.reinterpret()).run {
            ViewSwitcherPolicy.fromNativeValue(this)
        }

    /**
     * Gets the stack controlled by @self.
     *
     * @return the stack
     */
    public fun getStack(): ViewStack? =
        adw_view_switcher_get_stack(adwViewSwitcherPointer.reinterpret())?.run {
            ViewStack(reinterpret())
        }

    /**
     * Sets the policy of @self.
     *
     * @param policy the new policy
     */
    public fun setPolicy(policy: ViewSwitcherPolicy): Unit =
        adw_view_switcher_set_policy(adwViewSwitcherPointer.reinterpret(), policy.nativeValue)

    /**
     * Sets the stack controlled by @self.
     *
     * @param stack a stack
     */
    public fun setStack(stack: ViewStack? = null): Unit =
        adw_view_switcher_set_stack(
            adwViewSwitcherPointer.reinterpret(),
            stack?.adwViewStackPointer?.reinterpret()
        )

    public companion object : TypeCompanion<ViewSwitcher> {
        override val type: GeneratedClassKGType<ViewSwitcher> =
            GeneratedClassKGType(adw_view_switcher_get_type()) {
                ViewSwitcher(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
