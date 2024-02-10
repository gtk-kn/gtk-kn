// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
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
 * <object class="GtkWindow">
 *   <child type="titlebar">
 *     <object class="AdwHeaderBar">
 *       <property name="centering-policy">strict</property>
 *       <child type="title">
 *         <object class="AdwViewSwitcherTitle" id="title">
 *           <property name="stack">stack</property>
 *         </object>
 *       </child>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="AdwViewStack" id="stack"/>
 *       </child>
 *       <child>
 *         <object class="AdwViewSwitcherBar">
 *           <property name="stack">stack</property>
 *           <binding name="reveal">
 *             <lookup name="title-visible">title</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * ## CSS nodes
 *
 * `AdwViewSwitcherTitle` has a single CSS node with name `viewswitchertitle`.
 * @since 1.0
 */
public class ViewSwitcherTitle(
    pointer: CPointer<AdwViewSwitcherTitle>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val adwViewSwitcherTitlePointer: CPointer<AdwViewSwitcherTitle>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The stack the view switcher controls.
     *
     * @since 1.0
     */
    public var stack: ViewStack?
        /**
         * Gets the stack controlled by @self.
         *
         * @return the stack
         * @since 1.0
         */
        get() =
            adw_view_switcher_title_get_stack(adwViewSwitcherTitlePointer.reinterpret())?.run {
                ViewStack(reinterpret())
            }

        /**
         * Sets the stack controlled by @self.
         *
         * @param stack a stack
         * @since 1.0
         */
        set(stack) =
            adw_view_switcher_title_set_stack(
                adwViewSwitcherTitlePointer.reinterpret(),
                stack?.adwViewStackPointer?.reinterpret()
            )

    /**
     * The subtitle to display.
     *
     * The subtitle should give a user additional details.
     *
     * @since 1.0
     */
    public var subtitle: String
        /**
         * Gets the subtitle of @self.
         *
         * @return the subtitle
         * @since 1.0
         */
        get() =
            adw_view_switcher_title_get_subtitle(adwViewSwitcherTitlePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the subtitle of @self.
         *
         * @param subtitle a subtitle
         * @since 1.0
         */
        set(subtitle) =
            adw_view_switcher_title_set_subtitle(
                adwViewSwitcherTitlePointer.reinterpret(),
                subtitle
            )

    /**
     * The title to display.
     *
     * The title should give a user additional details. A good title should not
     * include the application name.
     *
     * @since 1.0
     */
    public var title: String
        /**
         * Gets the title of @self.
         *
         * @return the title
         * @since 1.0
         */
        get() =
            adw_view_switcher_title_get_title(adwViewSwitcherTitlePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title of @self.
         *
         * @param title a title
         * @since 1.0
         */
        set(title) =
            adw_view_switcher_title_set_title(
                adwViewSwitcherTitlePointer.reinterpret(),
                title
            )

    /**
     * Whether the title is currently visible.
     *
     * If the title is visible, it means the view switcher is hidden an it may be
     * wanted to show an alternative switcher, e.g. a [class@ViewSwitcherBar].
     *
     * @since 1.0
     */
    public val titleVisible: Boolean
        /**
         * Gets whether the title of @self is currently visible.
         *
         * @return whether the title of @self is currently visible
         * @since 1.0
         */
        get() =
            adw_view_switcher_title_get_title_visible(adwViewSwitcherTitlePointer.reinterpret()).asBoolean()

    /**
     * Whether the view switcher is enabled.
     *
     * If it is disabled, the title will be displayed instead. This allows to
     * programmatically hide the view switcher even if it fits in the available
     * space.
     *
     * This can be used e.g. to ensure the view switcher is hidden below a certain
     * window width, or any other constraint you find suitable.
     *
     * @since 1.0
     */
    public var viewSwitcherEnabled: Boolean
        /**
         * Gets whether @self's view switcher is enabled.
         *
         * @return whether the view switcher is enabled
         * @since 1.0
         */
        get() =
            adw_view_switcher_title_get_view_switcher_enabled(adwViewSwitcherTitlePointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self's view switcher is enabled.
         *
         * @param enabled whether the view switcher is enabled
         * @since 1.0
         */
        set(enabled) =
            adw_view_switcher_title_set_view_switcher_enabled(
                adwViewSwitcherTitlePointer.reinterpret(),
                enabled.asGBoolean()
            )

    /**
     * Creates a new `AdwViewSwitcherTitle`.
     *
     * @return the newly created `AdwViewSwitcherTitle`
     * @since 1.0
     */
    public constructor() : this(adw_view_switcher_title_new()!!.reinterpret())

    /**
     * Gets the stack controlled by @self.
     *
     * @return the stack
     * @since 1.0
     */
    public fun getStack(): ViewStack? =
        adw_view_switcher_title_get_stack(adwViewSwitcherTitlePointer.reinterpret())?.run {
            ViewStack(reinterpret())
        }

    /**
     * Gets the subtitle of @self.
     *
     * @return the subtitle
     * @since 1.0
     */
    public fun getSubtitle(): String =
        adw_view_switcher_title_get_subtitle(adwViewSwitcherTitlePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the title of @self.
     *
     * @return the title
     * @since 1.0
     */
    public fun getTitle(): String =
        adw_view_switcher_title_get_title(adwViewSwitcherTitlePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets whether the title of @self is currently visible.
     *
     * @return whether the title of @self is currently visible
     * @since 1.0
     */
    public fun getTitleVisible(): Boolean =
        adw_view_switcher_title_get_title_visible(adwViewSwitcherTitlePointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self's view switcher is enabled.
     *
     * @return whether the view switcher is enabled
     * @since 1.0
     */
    public fun getViewSwitcherEnabled(): Boolean =
        adw_view_switcher_title_get_view_switcher_enabled(adwViewSwitcherTitlePointer.reinterpret()).asBoolean()

    /**
     * Sets the stack controlled by @self.
     *
     * @param stack a stack
     * @since 1.0
     */
    public fun setStack(stack: ViewStack? = null): Unit =
        adw_view_switcher_title_set_stack(
            adwViewSwitcherTitlePointer.reinterpret(),
            stack?.adwViewStackPointer?.reinterpret()
        )

    /**
     * Sets the subtitle of @self.
     *
     * @param subtitle a subtitle
     * @since 1.0
     */
    public fun setSubtitle(subtitle: String): Unit =
        adw_view_switcher_title_set_subtitle(
            adwViewSwitcherTitlePointer.reinterpret(),
            subtitle
        )

    /**
     * Sets the title of @self.
     *
     * @param title a title
     * @since 1.0
     */
    public fun setTitle(title: String): Unit =
        adw_view_switcher_title_set_title(adwViewSwitcherTitlePointer.reinterpret(), title)

    /**
     * Sets whether @self's view switcher is enabled.
     *
     * @param enabled whether the view switcher is enabled
     * @since 1.0
     */
    public fun setViewSwitcherEnabled(enabled: Boolean): Unit =
        adw_view_switcher_title_set_view_switcher_enabled(
            adwViewSwitcherTitlePointer.reinterpret(),
            enabled.asGBoolean()
        )

    public companion object : TypeCompanion<ViewSwitcherTitle> {
        override val type: GeneratedClassKGType<ViewSwitcherTitle> =
            GeneratedClassKGType(adw_view_switcher_title_get_type()) {
                ViewSwitcherTitle(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
