// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.javascriptcore.Value
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_24
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_26
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_32
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.javascriptcore.JSCValue
import org.gtkkn.native.webkit.WebKitScriptMessageReply
import org.gtkkn.native.webkit.WebKitUserContentManager
import org.gtkkn.native.webkit.webkit_user_content_manager_add_filter
import org.gtkkn.native.webkit.webkit_user_content_manager_add_script
import org.gtkkn.native.webkit.webkit_user_content_manager_add_style_sheet
import org.gtkkn.native.webkit.webkit_user_content_manager_get_type
import org.gtkkn.native.webkit.webkit_user_content_manager_new
import org.gtkkn.native.webkit.webkit_user_content_manager_register_script_message_handler
import org.gtkkn.native.webkit.webkit_user_content_manager_register_script_message_handler_with_reply
import org.gtkkn.native.webkit.webkit_user_content_manager_remove_all_filters
import org.gtkkn.native.webkit.webkit_user_content_manager_remove_all_scripts
import org.gtkkn.native.webkit.webkit_user_content_manager_remove_all_style_sheets
import org.gtkkn.native.webkit.webkit_user_content_manager_remove_filter
import org.gtkkn.native.webkit.webkit_user_content_manager_remove_filter_by_id
import org.gtkkn.native.webkit.webkit_user_content_manager_remove_script
import org.gtkkn.native.webkit.webkit_user_content_manager_remove_style_sheet
import org.gtkkn.native.webkit.webkit_user_content_manager_unregister_script_message_handler
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Manages user-defined content which affects web pages.
 *
 * Using a #WebKitUserContentManager user CSS style sheets can be set to
 * be injected in the web pages loaded by a #WebKitWebView, by
 * webkit_user_content_manager_add_style_sheet().
 *
 * To use a #WebKitUserContentManager, it must be created using
 * webkit_user_content_manager_new(), and then used to construct
 * a #WebKitWebView. User style sheets can be created with
 * webkit_user_style_sheet_new().
 *
 * User style sheets can be added and removed at any time, but
 * they will affect the web pages loaded afterwards.
 * @since 2.6
 */
@WebKitVersion2_6
public class UserContentManager(pointer: CPointer<WebKitUserContentManager>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitUserContentManagerPointer: CPointer<WebKitUserContentManager>
        get() = gPointer.reinterpret()

    /**
     * Creates a new user content manager.
     *
     * @return A #WebKitUserContentManager
     * @since 2.6
     */
    public constructor() : this(webkit_user_content_manager_new()!!.reinterpret())

    /**
     * Adds a #WebKitUserContentFilter to the given #WebKitUserContentManager.
     *
     * The same #WebKitUserContentFilter can be reused with multiple
     * #WebKitUserContentManager instances.
     *
     * Filters need to be saved and loaded from #WebKitUserContentFilterStore.
     *
     * @param filter A #WebKitUserContentFilter
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun addFilter(filter: UserContentFilter): Unit = webkit_user_content_manager_add_filter(
        webkitUserContentManagerPointer.reinterpret(),
        filter.webkitUserContentFilterPointer.reinterpret()
    )

    /**
     * Adds a #WebKitUserScript to the given #WebKitUserContentManager.
     *
     * The same #WebKitUserScript can be reused with multiple
     * #WebKitUserContentManager instances.
     *
     * @param script A #WebKitUserScript
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun addScript(script: UserScript): Unit = webkit_user_content_manager_add_script(
        webkitUserContentManagerPointer.reinterpret(),
        script.webkitUserScriptPointer.reinterpret()
    )

    /**
     * Adds a #WebKitUserStyleSheet to the given #WebKitUserContentManager.
     *
     * The same #WebKitUserStyleSheet can be reused with multiple
     * #WebKitUserContentManager instances.
     *
     * @param stylesheet A #WebKitUserStyleSheet
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun addStyleSheet(stylesheet: UserStyleSheet): Unit = webkit_user_content_manager_add_style_sheet(
        webkitUserContentManagerPointer.reinterpret(),
        stylesheet.webkitUserStyleSheetPointer.reinterpret()
    )

    /**
     * Registers a new user script message handler in script world.
     *
     * After it is registered,
     * scripts can use `window.webkit.messageHandlers.<name>.postMessage(value)`
     * to send messages. Those messages are received by connecting handlers
     * to the #WebKitUserContentManager::script-message-received signal. The
     * handler name is used as the detail of the signal. To avoid race
     * conditions between registering the handler name, and starting to
     * receive the signals, it is recommended to connect to the signal
     * *before* registering the handler name:
     *
     * ```c
     * WebKitWebView *view = webkit_web_view_new ();
     * WebKitUserContentManager *manager = webkit_web_view_get_user_content_manager ();
     * g_signal_connect (manager, "script-message-received::foobar",
     *                   G_CALLBACK (handle_script_message), NULL);
     * webkit_user_content_manager_register_script_message_handler (manager, "foobar");
     * ```
     *
     * Registering a script message handler will fail if the requested
     * name has been already registered before.
     *
     * If null is passed as the @world_name, the default world will be used.
     *
     * The registered handler can be unregistered by using
     * webkit_user_content_manager_unregister_script_message_handler().
     *
     * @param name Name of the script message channel
     * @param worldName the name of a #WebKitScriptWorld
     * @return true if message handler was registered successfully, or false otherwise.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun registerScriptMessageHandler(name: String, worldName: String? = null): Boolean =
        webkit_user_content_manager_register_script_message_handler(
            webkitUserContentManagerPointer.reinterpret(),
            name,
            worldName
        ).asBoolean()

    /**
     * Registers a new user script message handler in script world with name @world_name.
     *
     * Different from webkit_user_content_manager_register_script_message_handler(),
     * when using this function to register the handler, the connected signal is
     * script-message-with-reply-received, and a reply provided by the user is expected.
     * Otherwise, the user will receive a default undefined value.
     *
     * If null is passed as the @world_name, the default world will be used.
     * See webkit_user_content_manager_register_script_message_handler() for full description.
     *
     * Registering a script message handler will fail if the requested
     * name has been already registered before.
     *
     * The registered handler can be unregistered by using
     * webkit_user_content_manager_unregister_script_message_handler().
     *
     * @param name Name of the script message channel
     * @param worldName the name of a #WebKitScriptWorld
     * @return true if message handler was registered successfully, or false otherwise.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun registerScriptMessageHandlerWithReply(name: String, worldName: String? = null): Boolean =
        webkit_user_content_manager_register_script_message_handler_with_reply(
            webkitUserContentManagerPointer.reinterpret(),
            name,
            worldName
        ).asBoolean()

    /**
     * Removes all content filters from the given #WebKitUserContentManager.
     *
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun removeAllFilters(): Unit =
        webkit_user_content_manager_remove_all_filters(webkitUserContentManagerPointer.reinterpret())

    /**
     * Removes all user scripts from the given #WebKitUserContentManager
     *
     * See also webkit_user_content_manager_remove_script().
     *
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun removeAllScripts(): Unit =
        webkit_user_content_manager_remove_all_scripts(webkitUserContentManagerPointer.reinterpret())

    /**
     * Removes all user style sheets from the given #WebKitUserContentManager.
     *
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun removeAllStyleSheets(): Unit =
        webkit_user_content_manager_remove_all_style_sheets(webkitUserContentManagerPointer.reinterpret())

    /**
     * Removes a filter from the given #WebKitUserContentManager.
     *
     * Since 2.24
     *
     * @param filter A #WebKitUserContentFilter
     */
    public fun removeFilter(filter: UserContentFilter): Unit = webkit_user_content_manager_remove_filter(
        webkitUserContentManagerPointer.reinterpret(),
        filter.webkitUserContentFilterPointer.reinterpret()
    )

    /**
     * Removes a filter by the given identifier.
     *
     * Removes a filter from the given #WebKitUserContentManager given the
     * identifier of a #WebKitUserContentFilter as returned by
     * webkit_user_content_filter_get_identifier().
     *
     * @param filterId Filter identifier
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun removeFilterById(filterId: String): Unit =
        webkit_user_content_manager_remove_filter_by_id(webkitUserContentManagerPointer.reinterpret(), filterId)

    /**
     * Removes a #WebKitUserScript from the given #WebKitUserContentManager.
     *
     * See also webkit_user_content_manager_remove_all_scripts().
     *
     * @param script A #WebKitUserScript
     * @since 2.32
     */
    @WebKitVersion2_32
    public fun removeScript(script: UserScript): Unit = webkit_user_content_manager_remove_script(
        webkitUserContentManagerPointer.reinterpret(),
        script.webkitUserScriptPointer.reinterpret()
    )

    /**
     * Removes a #WebKitUserStyleSheet from the given #WebKitUserContentManager.
     *
     * See also webkit_user_content_manager_remove_all_style_sheets().
     *
     * @param stylesheet A #WebKitUserStyleSheet
     * @since 2.32
     */
    @WebKitVersion2_32
    public fun removeStyleSheet(stylesheet: UserStyleSheet): Unit = webkit_user_content_manager_remove_style_sheet(
        webkitUserContentManagerPointer.reinterpret(),
        stylesheet.webkitUserStyleSheetPointer.reinterpret()
    )

    /**
     * Unregisters a previously registered message handler in script world with name @world_name.
     * If null is passed as the @world_name, the default world will be used.
     *
     * Note that this does *not* disconnect handlers for the
     * #WebKitUserContentManager::script-message-received signal;
     * they will be kept connected, but the signal will not be emitted
     * unless the handler name is registered again.
     *
     * See also webkit_user_content_manager_register_script_message_handler().
     *
     * @param name Name of the script message channel
     * @param worldName the name of a #WebKitScriptWorld
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun unregisterScriptMessageHandler(name: String, worldName: String? = null): Unit =
        webkit_user_content_manager_unregister_script_message_handler(
            webkitUserContentManagerPointer.reinterpret(),
            name,
            worldName
        )

    /**
     * This signal is emitted when JavaScript in a web view calls
     * <code>window.webkit.messageHandlers.<name>.postMessage()</code>, after registering
     * <code><name></code> using
     * webkit_user_content_manager_register_script_message_handler()
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `value` the value received from the JavaScript world.
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun connectScriptMessageReceived(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`value`: Value) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "script-message-received",
        connectScriptMessageReceivedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when JavaScript in a web view calls
     * <code>window.webkit.messageHandlers.<name>.postMessage()</code>, after registering
     * <code><name></code> using
     * webkit_user_content_manager_register_script_message_handler_with_reply()
     *
     * The given @reply can be used to send a return value with
     * webkit_script_message_reply_return_value() or an error message with
     * webkit_script_message_reply_return_error_message(). If none of them are
     * called, an automatic reply with an undefined value will be sent.
     *
     * It is possible to handle the reply asynchronously, by simply calling
     * g_object_ref() on the @reply and returning true.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `value` the value received from the JavaScript world.; `reply` the #WebKitScriptMessageReply to send the reply to the script message.. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun connectScriptMessageWithReplyReceived(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`value`: Value, reply: ScriptMessageReply) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "script-message-with-reply-received",
        connectScriptMessageWithReplyReceivedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<UserContentManager> {
        override val type: GeneratedClassKGType<UserContentManager> =
            GeneratedClassKGType(webkit_user_content_manager_get_type()) { UserContentManager(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of UserContentManager
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_content_manager_get_type()
    }
}

private val connectScriptMessageReceivedFunc: CPointer<CFunction<(CPointer<JSCValue>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `value`: CPointer<JSCValue>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`value`: Value) -> Unit>().get().invoke(
            `value`!!.run {
                Value(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectScriptMessageWithReplyReceivedFunc:
    CPointer<CFunction<(CPointer<JSCValue>, CPointer<WebKitScriptMessageReply>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            `value`: CPointer<JSCValue>?,
            reply: CPointer<WebKitScriptMessageReply>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`value`: Value, reply: ScriptMessageReply) -> Boolean>().get().invoke(
            `value`!!.run {
                Value(reinterpret())
            },
            reply!!.run {
                ScriptMessageReply(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()
