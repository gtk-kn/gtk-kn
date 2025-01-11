// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkPopoverMenuBar
import org.gtkkn.native.gtk.gtk_popover_menu_bar_add_child
import org.gtkkn.native.gtk.gtk_popover_menu_bar_get_menu_model
import org.gtkkn.native.gtk.gtk_popover_menu_bar_get_type
import org.gtkkn.native.gtk.gtk_popover_menu_bar_new_from_model
import org.gtkkn.native.gtk.gtk_popover_menu_bar_remove_child
import org.gtkkn.native.gtk.gtk_popover_menu_bar_set_menu_model
import kotlin.Boolean
import kotlin.String

/**
 * `GtkPopoverMenuBar` presents a horizontal bar of items that pop
 * up popover menus when clicked.
 *
 * ![An example GtkPopoverMenuBar](menubar.png)
 *
 * The only way to create instances of `GtkPopoverMenuBar` is
 * from a `GMenuModel`.
 *
 * # CSS nodes
 *
 * ```
 * menubar
 * ├── item[.active]
 * ┊   ╰── popover
 * ╰── item
 *     ╰── popover
 * ```
 *
 * `GtkPopoverMenuBar` has a single CSS node with name menubar, below which
 * each item has its CSS node, and below that the corresponding popover.
 *
 * The item whose popover is currently open gets the .active
 * style class.
 *
 * # Accessibility
 *
 * `GtkPopoverMenuBar` uses the %GTK_ACCESSIBLE_ROLE_MENU_BAR role,
 * the menu items use the %GTK_ACCESSIBLE_ROLE_MENU_ITEM role and
 * the menus use the %GTK_ACCESSIBLE_ROLE_MENU role.
 */
public open class PopoverMenuBar(public val gtkPopoverMenuBarPointer: CPointer<GtkPopoverMenuBar>) :
    Widget(gtkPopoverMenuBarPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The `GMenuModel` from which the menu bar is created.
     *
     * The model should only contain submenus as toplevel elements.
     */
    public open var menuModel: MenuModel?
        /**
         * Returns the model from which the contents of @bar are taken.
         *
         * @return a `GMenuModel`
         */
        get() = gtk_popover_menu_bar_get_menu_model(gtkPopoverMenuBarPointer)?.run {
            MenuModel.MenuModelImpl(this)
        }

        /**
         * Sets a menu model from which @bar should take
         * its contents.
         *
         * @param model a `GMenuModel`
         */
        set(model) = gtk_popover_menu_bar_set_menu_model(gtkPopoverMenuBarPointer, model?.gioMenuModelPointer)

    /**
     * Creates a `GtkPopoverMenuBar` from a `GMenuModel`.
     *
     * @param model a `GMenuModel`
     * @return a new `GtkPopoverMenuBar`
     */
    public constructor(
        model: MenuModel? = null,
    ) : this(gtk_popover_menu_bar_new_from_model(model?.gioMenuModelPointer)!!.reinterpret())

    /**
     * Adds a custom widget to a generated menubar.
     *
     * For this to work, the menu model of @bar must have an
     * item with a `custom` attribute that matches @id.
     *
     * @param child the `GtkWidget` to add
     * @param id the ID to insert @child at
     * @return true if @id was found and the widget added
     */
    public open fun addChild(child: Widget, id: String): Boolean =
        gtk_popover_menu_bar_add_child(gtkPopoverMenuBarPointer, child.gtkWidgetPointer, id).asBoolean()

    /**
     * Removes a widget that has previously been added with
     * gtk_popover_menu_bar_add_child().
     *
     * @param child the `GtkWidget` to remove
     * @return true if the widget was removed
     */
    public open fun removeChild(child: Widget): Boolean =
        gtk_popover_menu_bar_remove_child(gtkPopoverMenuBarPointer, child.gtkWidgetPointer).asBoolean()

    public companion object : TypeCompanion<PopoverMenuBar> {
        override val type: GeneratedClassKGType<PopoverMenuBar> =
            GeneratedClassKGType(gtk_popover_menu_bar_get_type()) { PopoverMenuBar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PopoverMenuBar
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_popover_menu_bar_get_type()
    }
}
