// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Action
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_18
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.webkit.WebKitContextMenuItem
import org.gtkkn.native.webkit.webkit_context_menu_item_get_gaction
import org.gtkkn.native.webkit.webkit_context_menu_item_get_stock_action
import org.gtkkn.native.webkit.webkit_context_menu_item_get_submenu
import org.gtkkn.native.webkit.webkit_context_menu_item_get_type
import org.gtkkn.native.webkit.webkit_context_menu_item_is_separator
import org.gtkkn.native.webkit.webkit_context_menu_item_new_from_gaction
import org.gtkkn.native.webkit.webkit_context_menu_item_new_from_stock_action
import org.gtkkn.native.webkit.webkit_context_menu_item_new_from_stock_action_with_label
import org.gtkkn.native.webkit.webkit_context_menu_item_new_separator
import org.gtkkn.native.webkit.webkit_context_menu_item_new_with_submenu
import org.gtkkn.native.webkit.webkit_context_menu_item_set_submenu
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * One item of a #WebKitContextMenu.
 *
 * The #WebKitContextMenu is composed of #WebKitContextMenuItem<!--
 * -->s. These items can be created from a #GtkAction, from a
 * #WebKitContextMenuAction or from a #WebKitContextMenuAction and a
 * label. These #WebKitContextMenuAction<!-- -->s denote stock actions
 * for the items. You can also create separators and submenus.
 */
public class ContextMenuItem(
    pointer: CPointer<WebKitContextMenuItem>,
) : InitiallyUnowned(pointer.reinterpret()),
    KGTyped {
    public val webkitContextMenuItemPointer: CPointer<WebKitContextMenuItem>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #WebKitContextMenuItem representing a separator.
     *
     * @return the newly created #WebKitContextMenuItem object.
     */
    public constructor() : this(webkit_context_menu_item_new_separator()!!.reinterpret())

    /**
     * Creates a new #WebKitContextMenuItem for the given @action and @label.
     *
     * On activation
     * @target will be passed as parameter to the callback.
     *
     * @param action a #GAction
     * @param label the menu item label text
     * @param target a #GVariant to use as the action target
     * @return the newly created #WebKitContextMenuItem object.
     * @since 2.18
     */
    public constructor(
        action: Action,
        label: String,
        target: Variant? = null,
    ) : this(
        webkit_context_menu_item_new_from_gaction(
            action.gioActionPointer,
            label,
            target?.glibVariantPointer
        )!!.reinterpret()
    )

    /**
     * Creates a new #WebKitContextMenuItem for the given stock action.
     *
     * Stock actions are handled automatically by WebKit so that, for example,
     * when a menu item created with a %WEBKIT_CONTEXT_MENU_ACTION_STOP is
     * activated the action associated will be handled by WebKit and the current
     * load operation will be stopped. You can get the #GAction of a
     * #WebKitContextMenuItem created with a #WebKitContextMenuAction with
     * webkit_context_menu_item_get_gaction() and connect to the #GSimpleAction::activate signal
     * to be notified when the item is activated, but you can't prevent the associated
     * action from being performed.
     *
     * @param action a #WebKitContextMenuAction stock action
     * @return the newly created #WebKitContextMenuItem object.
     */
    public constructor(
        action: ContextMenuAction,
    ) : this(webkit_context_menu_item_new_from_stock_action(action.nativeValue)!!.reinterpret())

    /**
     * Creates a new #WebKitContextMenuItem for the given stock action using the given @label.
     *
     * Stock actions have a predefined label, this method can be used to create a
     * #WebKitContextMenuItem for a #WebKitContextMenuAction but using a custom label.
     *
     * @param action a #WebKitContextMenuAction stock action
     * @param label a custom label text to use instead of the predefined one
     * @return the newly created #WebKitContextMenuItem object.
     */
    public constructor(
        action: ContextMenuAction,
        label: String,
    ) : this(webkit_context_menu_item_new_from_stock_action_with_label(action.nativeValue, label)!!.reinterpret())

    /**
     * Creates a new #WebKitContextMenuItem using the given @label with a submenu.
     *
     * @param label the menu item label text
     * @param submenu a #WebKitContextMenu to set
     * @return the newly created #WebKitContextMenuItem object.
     */
    public constructor(
        label: String,
        submenu: ContextMenu,
    ) : this(
        webkit_context_menu_item_new_with_submenu(label, submenu.webkitContextMenuPointer.reinterpret())!!.reinterpret()
    )

    /**
     * Gets the action associated to @item as a #GAction.
     *
     * @return the #GAction associated to the #WebKitContextMenuItem,
     *    or null if @item is a separator.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun getGaction(): Action =
        webkit_context_menu_item_get_gaction(webkitContextMenuItemPointer.reinterpret())!!.run {
            Action.wrap(reinterpret())
        }

    /**
     * Gets the #WebKitContextMenuAction of @item.
     *
     * If the #WebKitContextMenuItem was not
     * created for a stock action %WEBKIT_CONTEXT_MENU_ACTION_CUSTOM will be
     * returned. If the #WebKitContextMenuItem is a separator %WEBKIT_CONTEXT_MENU_ACTION_NO_ACTION
     * will be returned.
     *
     * @return the #WebKitContextMenuAction of @item
     */
    public fun getStockAction(): ContextMenuAction =
        webkit_context_menu_item_get_stock_action(webkitContextMenuItemPointer.reinterpret()).run {
            ContextMenuAction.fromNativeValue(this)
        }

    /**
     * Gets the submenu of @item.
     *
     * @return the #WebKitContextMenu representing the submenu of
     *    @item or null if @item doesn't have a submenu.
     */
    public fun getSubmenu(): ContextMenu =
        webkit_context_menu_item_get_submenu(webkitContextMenuItemPointer.reinterpret())!!.run {
            ContextMenu(reinterpret())
        }

    /**
     * Checks whether @item is a separator.
     *
     * @return true is @item is a separator or false otherwise
     */
    public fun isSeparator(): Boolean =
        webkit_context_menu_item_is_separator(webkitContextMenuItemPointer.reinterpret()).asBoolean()

    /**
     * Sets or replaces the @item submenu.
     *
     * If @submenu is null the current
     * submenu of @item is removed.
     *
     * @param submenu a #WebKitContextMenu
     */
    public fun setSubmenu(submenu: ContextMenu? = null): Unit =
        webkit_context_menu_item_set_submenu(
            webkitContextMenuItemPointer.reinterpret(),
            submenu?.webkitContextMenuPointer?.reinterpret()
        )

    public companion object : TypeCompanion<ContextMenuItem> {
        override val type: GeneratedClassKGType<ContextMenuItem> =
            GeneratedClassKGType(webkit_context_menu_item_get_type()) { ContextMenuItem(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }
    }
}
