// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.SelectionModel
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwViewStack
import org.gtkkn.native.adw.adw_view_stack_add
import org.gtkkn.native.adw.adw_view_stack_add_named
import org.gtkkn.native.adw.adw_view_stack_add_titled
import org.gtkkn.native.adw.adw_view_stack_add_titled_with_icon
import org.gtkkn.native.adw.adw_view_stack_get_child_by_name
import org.gtkkn.native.adw.adw_view_stack_get_hhomogeneous
import org.gtkkn.native.adw.adw_view_stack_get_page
import org.gtkkn.native.adw.adw_view_stack_get_pages
import org.gtkkn.native.adw.adw_view_stack_get_type
import org.gtkkn.native.adw.adw_view_stack_get_vhomogeneous
import org.gtkkn.native.adw.adw_view_stack_get_visible_child
import org.gtkkn.native.adw.adw_view_stack_get_visible_child_name
import org.gtkkn.native.adw.adw_view_stack_new
import org.gtkkn.native.adw.adw_view_stack_remove
import org.gtkkn.native.adw.adw_view_stack_set_hhomogeneous
import org.gtkkn.native.adw.adw_view_stack_set_vhomogeneous
import org.gtkkn.native.adw.adw_view_stack_set_visible_child
import org.gtkkn.native.adw.adw_view_stack_set_visible_child_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A view container for [class@ViewSwitcher].
 *
 * `AdwViewStack` is a container which only shows one page at a time.
 * It is typically used to hold an application's main views.
 *
 * It doesn't provide a way to transition between pages.
 * Instead, a separate widget such as [class@ViewSwitcher] can be used with
 * `AdwViewStack` to provide this functionality.
 *
 * `AdwViewStack` pages can have a title, an icon, an attention request, and a
 * numbered badge that [class@ViewSwitcher] will use to let users identify which
 * page is which. Set them using the [property@ViewStackPage:title],
 * [property@ViewStackPage:icon-name],
 * [property@ViewStackPage:needs-attention], and
 * [property@ViewStackPage:badge-number] properties.
 *
 * Unlike [class@Gtk.Stack], transitions between views are not animated.
 *
 * `AdwViewStack` maintains a [class@ViewStackPage] object for each added child,
 * which holds additional per-child properties. You obtain the
 * [class@ViewStackPage] for a child with [method@ViewStack.get_page] and you
 * can obtain a [iface@Gtk.SelectionModel] containing all the pages with
 * [method@ViewStack.get_pages].
 *
 * ## AdwViewStack as GtkBuildable
 *
 * To set child-specific properties in a .ui file, create
 * [class@ViewStackPage] objects explicitly, and set the child widget as a
 * property on it:
 *
 * ```xml
 *   <object class="AdwViewStack" id="stack">
 *     <child>
 *       <object class="AdwViewStackPage">
 *         <property name="name">overview</property>
 *         <property name="title">Overview</property>
 *         <property name="child">
 *           <object class="AdwStatusPage">
 *             <property name="title">Welcome!</property>
 *           </object>
 *         </property>
 *       </object>
 *     </child>
 *   </object>
 * ```
 *
 * ## CSS nodes
 *
 * `AdwViewStack` has a single CSS node named `stack`.
 *
 * ## Accessibility
 *
 * `AdwViewStack` uses the `GTK_ACCESSIBLE_ROLE_TAB_PANEL` for the stack pages
 * which are the accessible parent objects of the child widgets.
 *
 * ## Skipped during bindings generation
 *
 * - method `visible-child`: Property TypeInfo of getter and setter do not match
 * - method `visible-child-name`: Property TypeInfo of getter and setter do not match
 */
public class ViewStack(
    pointer: CPointer<AdwViewStack>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val adwViewStackPointer: CPointer<AdwViewStack>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether the stack is horizontally homogeneous.
     *
     * If the stack is horizontally homogeneous, it allocates the same width for
     * all children.
     *
     * If it's `FALSE`, the stack may change width when a different child becomes
     * visible.
     */
    public var hhomogeneous: Boolean
        /**
         * Gets whether @self is horizontally homogeneous.
         *
         * @return whether @self is horizontally homogeneous
         */
        get() = adw_view_stack_get_hhomogeneous(adwViewStackPointer.reinterpret()).asBoolean()

        /**
         * Sets @self to be horizontally homogeneous or not.
         *
         * If the stack is horizontally homogeneous, it allocates the same width for
         * all children.
         *
         * If it's `FALSE`, the stack may change width when a different child becomes
         * visible.
         *
         * @param hhomogeneous whether to make @self horizontally homogeneous
         */
        set(hhomogeneous) =
            adw_view_stack_set_hhomogeneous(
                adwViewStackPointer.reinterpret(),
                hhomogeneous.asGBoolean()
            )

    /**
     * A selection model with the stack's pages.
     *
     * This can be used to keep an up-to-date view. The model also implements
     * [iface@Gtk.SelectionModel] and can be used to track and change the visible
     * page.
     */
    public val pages: SelectionModel
        /**
         * Returns a [iface@Gio.ListModel] that contains the pages of the stack.
         *
         * This can be used to keep an up-to-date view. The model also implements
         * [iface@Gtk.SelectionModel] and can be used to track and change the visible
         * page.
         *
         * @return a `GtkSelectionModel` for the stack's children
         */
        get() =
            adw_view_stack_get_pages(adwViewStackPointer.reinterpret())!!.run {
                SelectionModel.wrap(reinterpret())
            }

    /**
     * Whether the stack is vertically homogeneous.
     *
     * If the stack is vertically homogeneous, it allocates the same height for
     * all children.
     *
     * If it's `FALSE`, the stack may change height when a different child becomes
     * visible.
     */
    public var vhomogeneous: Boolean
        /**
         * Gets whether @self is vertically homogeneous.
         *
         * @return whether @self is vertically homogeneous
         */
        get() = adw_view_stack_get_vhomogeneous(adwViewStackPointer.reinterpret()).asBoolean()

        /**
         * Sets @self to be vertically homogeneous or not.
         *
         * If the stack is vertically homogeneous, it allocates the same height for
         * all children.
         *
         * If it's `FALSE`, the stack may change height when a different child becomes
         * visible.
         *
         * @param vhomogeneous whether to make @self vertically homogeneous
         */
        set(vhomogeneous) =
            adw_view_stack_set_vhomogeneous(
                adwViewStackPointer.reinterpret(),
                vhomogeneous.asGBoolean()
            )

    /**
     * Creates a new `AdwViewStack`.
     *
     * @return the newly created `AdwViewStack`
     */
    public constructor() : this(adw_view_stack_new()!!.reinterpret())

    /**
     * Adds a child to @self.
     *
     * @param child the widget to add
     * @return the [class@ViewStackPage] for @child
     */
    public fun add(child: Widget): ViewStackPage =
        adw_view_stack_add(
            adwViewStackPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )!!.run {
            ViewStackPage(reinterpret())
        }

    /**
     * Adds a child to @self.
     *
     * The child is identified by the @name.
     *
     * @param child the widget to add
     * @param name the name for @child
     * @return the `AdwViewStackPage` for @child
     */
    public fun addNamed(
        child: Widget,
        name: String? = null,
    ): ViewStackPage =
        adw_view_stack_add_named(
            adwViewStackPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            name
        )!!.run {
            ViewStackPage(reinterpret())
        }

    /**
     * Adds a child to @self.
     *
     * The child is identified by the @name. The @title will be used by
     * [class@ViewSwitcher] to represent @child, so it should be short.
     *
     * @param child the widget to add
     * @param name the name for @child
     * @param title a human-readable title for @child
     * @return the `AdwViewStackPage` for @child
     */
    public fun addTitled(
        child: Widget,
        name: String? = null,
        title: String,
    ): ViewStackPage =
        adw_view_stack_add_titled(
            adwViewStackPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            name,
            title
        )!!.run {
            ViewStackPage(reinterpret())
        }

    /**
     * Adds a child to @self.
     *
     * The child is identified by the @name. The @title and @icon_name will be used
     * by [class@ViewSwitcher] to represent @child.
     *
     * @param child the widget to add
     * @param name the name for @child
     * @param title a human-readable title for @child
     * @param iconName an icon name for @child
     * @return the `AdwViewStackPage` for @child
     * @since 1.2
     */
    public fun addTitledWithIcon(
        child: Widget,
        name: String? = null,
        title: String,
        iconName: String,
    ): ViewStackPage =
        adw_view_stack_add_titled_with_icon(
            adwViewStackPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            name,
            title,
            iconName
        )!!.run {
            ViewStackPage(reinterpret())
        }

    /**
     * Finds the child with @name in @self.
     *
     * @param name the name of the child to find
     * @return the requested child
     */
    public fun getChildByName(name: String): Widget? =
        adw_view_stack_get_child_by_name(adwViewStackPointer.reinterpret(), name)?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether @self is horizontally homogeneous.
     *
     * @return whether @self is horizontally homogeneous
     */
    public fun getHhomogeneous(): Boolean =
        adw_view_stack_get_hhomogeneous(adwViewStackPointer.reinterpret()).asBoolean()

    /**
     * Gets the [class@ViewStackPage] object for @child.
     *
     * @param child a child of @self
     * @return the page object for @child
     */
    public fun getPage(child: Widget): ViewStackPage =
        adw_view_stack_get_page(
            adwViewStackPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )!!.run {
            ViewStackPage(reinterpret())
        }

    /**
     * Returns a [iface@Gio.ListModel] that contains the pages of the stack.
     *
     * This can be used to keep an up-to-date view. The model also implements
     * [iface@Gtk.SelectionModel] and can be used to track and change the visible
     * page.
     *
     * @return a `GtkSelectionModel` for the stack's children
     */
    public fun getPages(): SelectionModel =
        adw_view_stack_get_pages(adwViewStackPointer.reinterpret())!!.run {
            SelectionModel.wrap(reinterpret())
        }

    /**
     * Gets whether @self is vertically homogeneous.
     *
     * @return whether @self is vertically homogeneous
     */
    public fun getVhomogeneous(): Boolean =
        adw_view_stack_get_vhomogeneous(adwViewStackPointer.reinterpret()).asBoolean()

    /**
     * Gets the currently visible child of @self, .
     *
     * @return the visible child
     */
    public fun getVisibleChild(): Widget? =
        adw_view_stack_get_visible_child(adwViewStackPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Returns the name of the currently visible child of @self.
     *
     * @return the name of the visible child
     */
    public fun getVisibleChildName(): String? =
        adw_view_stack_get_visible_child_name(adwViewStackPointer.reinterpret())?.toKString()

    /**
     * Removes a child widget from @self.
     *
     * @param child the child to remove
     */
    public fun remove(child: Widget): Unit =
        adw_view_stack_remove(
            adwViewStackPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Sets @self to be horizontally homogeneous or not.
     *
     * If the stack is horizontally homogeneous, it allocates the same width for
     * all children.
     *
     * If it's `FALSE`, the stack may change width when a different child becomes
     * visible.
     *
     * @param hhomogeneous whether to make @self horizontally homogeneous
     */
    public fun setHhomogeneous(hhomogeneous: Boolean): Unit =
        adw_view_stack_set_hhomogeneous(
            adwViewStackPointer.reinterpret(),
            hhomogeneous.asGBoolean()
        )

    /**
     * Sets @self to be vertically homogeneous or not.
     *
     * If the stack is vertically homogeneous, it allocates the same height for
     * all children.
     *
     * If it's `FALSE`, the stack may change height when a different child becomes
     * visible.
     *
     * @param vhomogeneous whether to make @self vertically homogeneous
     */
    public fun setVhomogeneous(vhomogeneous: Boolean): Unit =
        adw_view_stack_set_vhomogeneous(
            adwViewStackPointer.reinterpret(),
            vhomogeneous.asGBoolean()
        )

    /**
     * Makes @child the visible child of @self.
     *
     * @param child a child of @self
     */
    public fun setVisibleChild(child: Widget): Unit =
        adw_view_stack_set_visible_child(
            adwViewStackPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Makes the child with @name visible.
     *
     * See [property@ViewStack:visible-child].
     *
     * @param name the name of the child
     */
    public fun setVisibleChildName(name: String): Unit =
        adw_view_stack_set_visible_child_name(adwViewStackPointer.reinterpret(), name)

    public companion object : TypeCompanion<ViewStack> {
        override val type: GeneratedClassKGType<ViewStack> =
            GeneratedClassKGType(adw_view_stack_get_type()) { ViewStack(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
