// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkPopoverMenu
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_popover_menu_add_child
import org.gtkkn.native.gtk.gtk_popover_menu_get_flags
import org.gtkkn.native.gtk.gtk_popover_menu_get_menu_model
import org.gtkkn.native.gtk.gtk_popover_menu_get_type
import org.gtkkn.native.gtk.gtk_popover_menu_new_from_model
import org.gtkkn.native.gtk.gtk_popover_menu_new_from_model_full
import org.gtkkn.native.gtk.gtk_popover_menu_remove_child
import org.gtkkn.native.gtk.gtk_popover_menu_set_flags
import org.gtkkn.native.gtk.gtk_popover_menu_set_menu_model
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GtkPopoverMenu` is a subclass of `GtkPopover` that implements menu
 * behavior.
 *
 * ![An example GtkPopoverMenu](menu.png)
 *
 * `GtkPopoverMenu` treats its children like menus and allows switching
 * between them. It can open submenus as traditional, nested submenus,
 * or in a more touch-friendly sliding fashion.
 * The property [property@Gtk.PopoverMenu:flags] controls this appearance.
 *
 * `GtkPopoverMenu` is meant to be used primarily with menu models,
 * using [ctor@Gtk.PopoverMenu.new_from_model]. If you need to put
 * other widgets such as a `GtkSpinButton` or a `GtkSwitch` into a popover,
 * you can use [method@Gtk.PopoverMenu.add_child].
 *
 * For more dialog-like behavior, use a plain `GtkPopover`.
 *
 * ## Menu models
 *
 * The XML format understood by `GtkBuilder` for `GMenuModel` consists
 * of a toplevel `<menu>` element, which contains one or more `<item>`
 * elements. Each `<item>` element contains `<attribute>` and `<link>`
 * elements with a mandatory name attribute. `<link>` elements have the
 * same content model as `<menu>`. Instead of `<link name="submenu">`
 * or `<link name="section">`, you can use `<submenu>` or `<section>`
 * elements.
 *
 * ```xml
 * <menu id='app-menu'>
 *   <section>
 *     <item>
 *       <attribute name='label' translatable='yes'>_New Window</attribute>
 *       <attribute name='action'>app.new</attribute>
 *     </item>
 *     <item>
 *       <attribute name='label' translatable='yes'>_About Sunny</attribute>
 *       <attribute name='action'>app.about</attribute>
 *     </item>
 *     <item>
 *       <attribute name='label' translatable='yes'>_Quit</attribute>
 *       <attribute name='action'>app.quit</attribute>
 *     </item>
 *   </section>
 * </menu>
 * ```
 *
 * Attribute values can be translated using gettext, like other `GtkBuilder`
 * content. `<attribute>` elements can be marked for translation with a
 * `translatable="yes"` attribute. It is also possible to specify message
 * context and translator comments, using the context and comments attributes.
 * To make use of this, the `GtkBuilder` must have been given the gettext
 * domain to use.
 *
 * The following attributes are used when constructing menu items:
 *
 * - "label": a user-visible string to display
 * - "use-markup": whether the text in the menu item includes [Pango
 * markup](https://docs.gtk.org/Pango/pango_markup.html)
 * - "action": the prefixed name of the action to trigger
 * - "target": the parameter to use when activating the action
 * - "icon" and "verb-icon": names of icons that may be displayed
 * - "submenu-action": name of an action that may be used to track
 *      whether a submenu is open
 * - "hidden-when": a string used to determine when the item will be hidden.
 *      Possible values include "action-disabled", "action-missing", "macos-menubar".
 *      This is mainly useful for exported menus, see [method@Gtk.Application.set_menubar].
 * - "custom": a string used to match against the ID of a custom child added with
 *      [method@Gtk.PopoverMenu.add_child], [method@Gtk.PopoverMenuBar.add_child],
 *      or in the ui file with `<child type="ID">`.
 *
 * The following attributes are used when constructing sections:
 *
 * - "label": a user-visible string to use as section heading
 * - "display-hint": a string used to determine special formatting for the section.
 *     Possible values include "horizontal-buttons", "circular-buttons" and
 *     "inline-buttons". They all indicate that section should be
 *     displayed as a horizontal row of buttons.
 * - "text-direction": a string used to determine the `GtkTextDirection` to use
 *     when "display-hint" is set to "horizontal-buttons". Possible values
 *     include "rtl", "ltr", and "none".
 *
 * The following attributes are used when constructing submenus:
 *
 * - "label": a user-visible string to display
 * - "icon": icon name to display
 *
 * Menu items will also show accelerators, which are usually associated
 * with actions via [method@Gtk.Application.set_accels_for_action],
 * [method@WidgetClass.add_binding_action] or
 * [method@Gtk.ShortcutController.add_shortcut].
 *
 * # CSS Nodes
 *
 * `GtkPopoverMenu` is just a subclass of `GtkPopover` that adds custom content
 * to it, therefore it has the same CSS nodes. It is one of the cases that add
 * a `.menu` style class to the main `popover` node.
 *
 * Menu items have nodes with name `button` and class `.model`. If a section
 * display-hint is set, the section gets a node `box` with class `horizontal`
 * plus a class with the same text as the display hint. Note that said box may
 * not be the direct ancestor of the item `button`s. Thus, for example, to style
 * items in an `inline-buttons` section, select `.inline-buttons button.model`.
 * Other things that may be of interest to style in menus include `label` nodes.
 *
 * # Accessibility
 *
 * `GtkPopoverMenu` uses the %GTK_ACCESSIBLE_ROLE_MENU role, and its
 * items use the %GTK_ACCESSIBLE_ROLE_MENU_ITEM,
 * %GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX or
 * %GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO roles, depending on the
 * action they are connected to.
 *
 * ## Skipped during bindings generation
 *
 * - method `visible-submenu`: Property has no getter nor setter
 */
public open class PopoverMenu(
    pointer: CPointer<GtkPopoverMenu>,
) : Popover(pointer.reinterpret()), KGTyped {
    public val gtkPopoverMenuPointer: CPointer<GtkPopoverMenu>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gPointer.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = gPointer.reinterpret()

    /**
     * The flags that @popover uses to create/display a menu from its model.
     *
     * If a model is set and the flags change, contents are rebuilt, so if setting
     * properties individually, set flags before model to avoid a redundant rebuild.
     *
     * @since 4.14
     */
    public open var flags: PopoverMenuFlags
        /**
         * Returns the flags that @popover uses to create/display a menu from its model.
         *
         * @return the `GtkPopoverMenuFlags`
         * @since 4.14
         */
        get() =
            gtk_popover_menu_get_flags(gtkPopoverMenuPointer.reinterpret()).run {
                PopoverMenuFlags(this)
            }

        /**
         * Sets the flags that @popover uses to create/display a menu from its model.
         *
         * If a model is set and the flags change, contents are rebuilt, so if setting
         * properties individually, set flags before model to avoid a redundant rebuild.
         *
         * @param flags a set of `GtkPopoverMenuFlags`
         * @since 4.14
         */
        set(flags) = gtk_popover_menu_set_flags(gtkPopoverMenuPointer.reinterpret(), flags.mask)

    /**
     * The model from which the menu is made.
     */
    public open var menuModel: MenuModel?
        /**
         * Returns the menu model used to populate the popover.
         *
         * @return the menu model of @popover
         */
        get() =
            gtk_popover_menu_get_menu_model(gtkPopoverMenuPointer.reinterpret())?.run {
                MenuModel(reinterpret())
            }

        /**
         * Sets a new menu model on @popover.
         *
         * The existing contents of @popover are removed, and
         * the @popover is populated with new contents according
         * to @model.
         *
         * @param model a `GMenuModel`
         */
        set(model) =
            gtk_popover_menu_set_menu_model(
                gtkPopoverMenuPointer.reinterpret(),
                model?.gioMenuModelPointer?.reinterpret()
            )

    /**
     * Creates a `GtkPopoverMenu` and populates it according to @model.
     *
     * The created buttons are connected to actions found in the
     * `GtkApplicationWindow` to which the popover belongs - typically
     * by means of being attached to a widget that is contained within
     * the `GtkApplicationWindow`s widget hierarchy.
     *
     * Actions can also be added using [method@Gtk.Widget.insert_action_group]
     * on the menus attach widget or on any of its parent widgets.
     *
     * This function creates menus with sliding submenus.
     * See [ctor@Gtk.PopoverMenu.new_from_model_full] for a way
     * to control this.
     *
     * @param model a `GMenuModel`
     * @return the new `GtkPopoverMenu`
     */
    public constructor(model: MenuModel? = null) :
        this(gtk_popover_menu_new_from_model(model?.gioMenuModelPointer?.reinterpret())!!.reinterpret())

    /**
     * Creates a `GtkPopoverMenu` and populates it according to @model.
     *
     * The created buttons are connected to actions found in the
     * action groups that are accessible from the parent widget.
     * This includes the `GtkApplicationWindow` to which the popover
     * belongs. Actions can also be added using [method@Gtk.Widget.insert_action_group]
     * on the parent widget or on any of its parent widgets.
     *
     * @param model a `GMenuModel`
     * @param flags flags that affect how the menu is created
     * @return the new `GtkPopoverMenu`
     */
    public constructor(model: MenuModel, flags: PopoverMenuFlags) :
        this(
            gtk_popover_menu_new_from_model_full(
                model.gioMenuModelPointer.reinterpret(),
                flags.mask
            )!!.reinterpret()
        )

    /**
     * Adds a custom widget to a generated menu.
     *
     * For this to work, the menu model of @popover must have
     * an item with a `custom` attribute that matches @id.
     *
     * @param child the `GtkWidget` to add
     * @param id the ID to insert @child at
     * @return true if @id was found and the widget added
     */
    public open fun addChild(
        child: Widget,
        id: String,
    ): Boolean =
        gtk_popover_menu_add_child(
            gtkPopoverMenuPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            id
        ).asBoolean()

    /**
     * Returns the flags that @popover uses to create/display a menu from its model.
     *
     * @return the `GtkPopoverMenuFlags`
     * @since 4.14
     */
    public open fun getFlags(): PopoverMenuFlags =
        gtk_popover_menu_get_flags(gtkPopoverMenuPointer.reinterpret()).run {
            PopoverMenuFlags(this)
        }

    /**
     * Returns the menu model used to populate the popover.
     *
     * @return the menu model of @popover
     */
    public open fun getMenuModel(): MenuModel? =
        gtk_popover_menu_get_menu_model(gtkPopoverMenuPointer.reinterpret())?.run {
            MenuModel(reinterpret())
        }

    /**
     * Removes a widget that has previously been added with
     * [method@Gtk.PopoverMenu.add_child()]
     *
     * @param child the `GtkWidget` to remove
     * @return true if the widget was removed
     */
    public open fun removeChild(child: Widget): Boolean =
        gtk_popover_menu_remove_child(
            gtkPopoverMenuPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        ).asBoolean()

    /**
     * Sets the flags that @popover uses to create/display a menu from its model.
     *
     * If a model is set and the flags change, contents are rebuilt, so if setting
     * properties individually, set flags before model to avoid a redundant rebuild.
     *
     * @param flags a set of `GtkPopoverMenuFlags`
     * @since 4.14
     */
    public open fun setFlags(flags: PopoverMenuFlags): Unit =
        gtk_popover_menu_set_flags(gtkPopoverMenuPointer.reinterpret(), flags.mask)

    /**
     * Sets a new menu model on @popover.
     *
     * The existing contents of @popover are removed, and
     * the @popover is populated with new contents according
     * to @model.
     *
     * @param model a `GMenuModel`
     */
    public open fun setMenuModel(model: MenuModel? = null): Unit =
        gtk_popover_menu_set_menu_model(
            gtkPopoverMenuPointer.reinterpret(),
            model?.gioMenuModelPointer?.reinterpret()
        )

    public companion object : TypeCompanion<PopoverMenu> {
        override val type: GeneratedClassKGType<PopoverMenu> =
            GeneratedClassKGType(gtk_popover_menu_get_type()) { PopoverMenu(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
