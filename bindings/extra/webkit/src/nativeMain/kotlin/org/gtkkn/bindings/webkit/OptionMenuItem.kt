// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_18
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitOptionMenuItem
import org.gtkkn.native.webkit.webkit_option_menu_item_copy
import org.gtkkn.native.webkit.webkit_option_menu_item_free
import org.gtkkn.native.webkit.webkit_option_menu_item_get_label
import org.gtkkn.native.webkit.webkit_option_menu_item_get_tooltip
import org.gtkkn.native.webkit.webkit_option_menu_item_get_type
import org.gtkkn.native.webkit.webkit_option_menu_item_is_enabled
import org.gtkkn.native.webkit.webkit_option_menu_item_is_group_child
import org.gtkkn.native.webkit.webkit_option_menu_item_is_group_label
import org.gtkkn.native.webkit.webkit_option_menu_item_is_selected
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * One item of a #WebKitOptionMenu.
 *
 * The #WebKitOptionMenu is composed of WebKitOptionMenuItem<!-- -->s.
 * A WebKitOptionMenuItem always has a label and can contain a tooltip text.
 * You can use the WebKitOptionMenuItem of a #WebKitOptionMenu to build your
 * own menus.
 * @since 2.18
 */
@WebKitVersion2_18
public class OptionMenuItem(pointer: CPointer<WebKitOptionMenuItem>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<WebKitOptionMenuItem> = pointer

    /**
     * Make a copy of the #WebKitOptionMenuItem.
     *
     * @return A copy of passed in #WebKitOptionMenuItem
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun copy(): OptionMenuItem = webkit_option_menu_item_copy(gPointer)!!.run {
        OptionMenuItem(this)
    }

    /**
     * Free the #WebKitOptionMenuItem.
     *
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun free(): Unit = webkit_option_menu_item_free(gPointer)

    /**
     * Get the label of a #WebKitOptionMenuItem.
     *
     * @return The label of @item.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun getLabel(): String =
        webkit_option_menu_item_get_label(gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Get the tooltip of a #WebKitOptionMenuItem.
     *
     * @return The tooltip of @item, or null.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun getTooltip(): String =
        webkit_option_menu_item_get_tooltip(gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Whether a #WebKitOptionMenuItem is enabled.
     *
     * @return true if the @item is enabled or false otherwise.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun isEnabled(): Boolean = webkit_option_menu_item_is_enabled(gPointer).asBoolean()

    /**
     * Whether a #WebKitOptionMenuItem is a group child.
     *
     * @return true if the @item is a group child or false otherwise.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun isGroupChild(): Boolean = webkit_option_menu_item_is_group_child(gPointer).asBoolean()

    /**
     * Whether a #WebKitOptionMenuItem is a group label.
     *
     * @return true if the @item is a group label or false otherwise.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun isGroupLabel(): Boolean = webkit_option_menu_item_is_group_label(gPointer).asBoolean()

    /**
     * Whether a #WebKitOptionMenuItem is the currently selected one.
     *
     * @return true if the @item is selected or false otherwise.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun isSelected(): Boolean = webkit_option_menu_item_is_selected(gPointer).asBoolean()

    public companion object {
        /**
         * Get the GType of OptionMenuItem
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_option_menu_item_get_type()
    }
}
