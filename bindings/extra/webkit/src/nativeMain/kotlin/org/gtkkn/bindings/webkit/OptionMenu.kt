// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_18
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.webkit.WebKitOptionMenu
import org.gtkkn.native.webkit.webkit_option_menu_activate_item
import org.gtkkn.native.webkit.webkit_option_menu_close
import org.gtkkn.native.webkit.webkit_option_menu_get_event
import org.gtkkn.native.webkit.webkit_option_menu_get_item
import org.gtkkn.native.webkit.webkit_option_menu_get_n_items
import org.gtkkn.native.webkit.webkit_option_menu_get_type
import org.gtkkn.native.webkit.webkit_option_menu_select_item
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * Represents the dropdown menu of a `select` element in a #WebKitWebView.
 *
 * When a select element in a #WebKitWebView needs to display a dropdown menu, the signal
 * #WebKitWebView::show-option-menu is emitted, providing a WebKitOptionMenu with the
 * #WebKitOptionMenuItem<!-- -->s that should be displayed.
 * @since 2.18
 */
@WebKitVersion2_18
public class OptionMenu(
    pointer: CPointer<WebKitOptionMenu>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val webkitOptionMenuPointer: CPointer<WebKitOptionMenu>
        get() = gPointer.reinterpret()

    /**
     * Activates the #WebKitOptionMenuItem at @index in @menu.
     *
     * Activating an item changes the value
     * of the element making the item the active one. You are expected to close the menu with
     * webkit_option_menu_close() after activating an item, calling this function again will have no
     * effect.
     *
     * @param index the index of the item
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun activateItem(index: UInt): Unit =
        webkit_option_menu_activate_item(webkitOptionMenuPointer.reinterpret(), index)

    /**
     * Request to close a #WebKitOptionMenu.
     *
     * This emits WebKitOptionMenu::close signal.
     * This function should always be called to notify WebKit that the associated
     * menu has been closed. If the menu is closed and neither webkit_option_menu_select_item()
     * nor webkit_option_menu_activate_item() have been called, the element value remains
     * unchanged.
     *
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun close(): Unit = webkit_option_menu_close(webkitOptionMenuPointer.reinterpret())

    /**
     * Gets the #GdkEvent that triggered the dropdown menu.
     * If @menu was not triggered by a user interaction, like a mouse click,
     * null is returned.
     *
     * @return the menu event or null.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getEvent(): Event =
        webkit_option_menu_get_event(webkitOptionMenuPointer.reinterpret())!!.run {
            Event(reinterpret())
        }

    /**
     * Returns the #WebKitOptionMenuItem at @index in @menu.
     *
     * @param index the index of the item
     * @return a #WebKitOptionMenuItem of @menu.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun getItem(index: UInt): OptionMenuItem =
        webkit_option_menu_get_item(webkitOptionMenuPointer.reinterpret(), index)!!.run {
            OptionMenuItem(reinterpret())
        }

    /**
     * Gets the length of the @menu.
     *
     * @return the number of #WebKitOptionMenuItem<!-- -->s in @menu
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun getNItems(): UInt = webkit_option_menu_get_n_items(webkitOptionMenuPointer.reinterpret())

    /**
     * Selects the #WebKitOptionMenuItem at @index in @menu.
     *
     * Selecting an item changes the
     * text shown by the combo button, but it doesn't change the value of the element. You need to
     * explicitly activate the item with webkit_option_menu_select_item() or close the menu with
     * webkit_option_menu_close() in which case the currently selected item will be activated.
     *
     * @param index the index of the item
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun selectItem(index: UInt): Unit =
        webkit_option_menu_select_item(webkitOptionMenuPointer.reinterpret(), index)

    /**
     * Emitted when closing a #WebKitOptionMenu is requested. This can happen
     * when the user explicitly calls webkit_option_menu_close() or when the
     * element is detached from the current page.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun connectClose(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "close",
            connectCloseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<OptionMenu> {
        override val type: GeneratedClassKGType<OptionMenu> =
            GeneratedClassKGType(webkit_option_menu_get_type()) { OptionMenu(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }
    }
}

private val connectCloseFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
