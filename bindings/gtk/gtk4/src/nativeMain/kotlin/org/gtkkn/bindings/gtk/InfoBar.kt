// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkInfoBar
import org.gtkkn.native.gtk.gtk_info_bar_add_action_widget
import org.gtkkn.native.gtk.gtk_info_bar_add_button
import org.gtkkn.native.gtk.gtk_info_bar_add_child
import org.gtkkn.native.gtk.gtk_info_bar_get_message_type
import org.gtkkn.native.gtk.gtk_info_bar_get_revealed
import org.gtkkn.native.gtk.gtk_info_bar_get_show_close_button
import org.gtkkn.native.gtk.gtk_info_bar_get_type
import org.gtkkn.native.gtk.gtk_info_bar_new
import org.gtkkn.native.gtk.gtk_info_bar_remove_action_widget
import org.gtkkn.native.gtk.gtk_info_bar_remove_child
import org.gtkkn.native.gtk.gtk_info_bar_response
import org.gtkkn.native.gtk.gtk_info_bar_set_default_response
import org.gtkkn.native.gtk.gtk_info_bar_set_message_type
import org.gtkkn.native.gtk.gtk_info_bar_set_response_sensitive
import org.gtkkn.native.gtk.gtk_info_bar_set_revealed
import org.gtkkn.native.gtk.gtk_info_bar_set_show_close_button
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkInfoBar` can be used to show messages to the user without a dialog.
 *
 * ![An example GtkInfoBar](info-bar.png)
 *
 * It is often temporarily shown at the top or bottom of a document.
 * In contrast to [class@Gtk.Dialog], which has an action area at the
 * bottom, `GtkInfoBar` has an action area at the side.
 *
 * The API of `GtkInfoBar` is very similar to `GtkDialog`, allowing you
 * to add buttons to the action area with [method@Gtk.InfoBar.add_button]
 * or [ctor@Gtk.InfoBar.new_with_buttons]. The sensitivity of action widgets
 * can be controlled with [method@Gtk.InfoBar.set_response_sensitive].
 *
 * To add widgets to the main content area of a `GtkInfoBar`, use
 * [method@Gtk.InfoBar.add_child].
 *
 * Similar to [class@Gtk.MessageDialog], the contents of a `GtkInfoBar`
 * can by classified as error message, warning, informational message, etc,
 * by using [method@Gtk.InfoBar.set_message_type]. GTK may use the message
 * type to determine how the message is displayed.
 *
 * A simple example for using a `GtkInfoBar`:
 * ```c
 * GtkWidget *message_label;
 * GtkWidget *widget;
 * GtkWidget *grid;
 * GtkInfoBar *bar;
 *
 * // set up info bar
 * widget = gtk_info_bar_new ();
 * bar = GTK_INFO_BAR (widget);
 * grid = gtk_grid_new ();
 *
 * message_label = gtk_label_new ("");
 * gtk_info_bar_add_child (bar, message_label);
 * gtk_info_bar_add_button (bar,
 *                          _("_OK"),
 *                          GTK_RESPONSE_OK);
 * g_signal_connect (bar,
 *                   "response",
 *                   G_CALLBACK (gtk_widget_hide),
 *                   NULL);
 * gtk_grid_attach (GTK_GRID (grid),
 *                  widget,
 *                  0, 2, 1, 1);
 *
 * // ...
 *
 * // show an error message
 * gtk_label_set_text (GTK_LABEL (message_label), "An error occurred!");
 * gtk_info_bar_set_message_type (bar, GTK_MESSAGE_ERROR);
 * gtk_widget_show (bar);
 * ```
 *
 * # GtkInfoBar as GtkBuildable
 *
 * `GtkInfoBar` supports a custom `<action-widgets>` element, which can contain
 * multiple `<action-widget>` elements. The “response” attribute specifies a
 * numeric response, and the content of the element is the id of widget
 * (which should be a child of the dialogs @action_area).
 *
 * `GtkInfoBar` supports adding action widgets by specifying “action” as
 * the “type” attribute of a `<child>` element. The widget will be added
 * either to the action area. The response id has to be associated
 * with the action widget using the `<action-widgets>` element.
 *
 * # CSS nodes
 *
 * `GtkInfoBar` has a single CSS node with name infobar. The node may get
 * one of the style classes .info, .warning, .error or .question, depending
 * on the message type.
 * If the info bar shows a close button, that button will have the .close
 * style class applied.
 *
 * ## Skipped during bindings generation
 *
 * - method `add_buttons`: Varargs parameter is not supported
 * - constructor `new_with_buttons`: Varargs parameter is not supported
 */
public open class InfoBar(pointer: CPointer<GtkInfoBar>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkInfoBarPointer: CPointer<GtkInfoBar>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The type of the message.
     *
     * The type may be used to determine the appearance of the info bar.
     */
    public open var messageType: MessageType
        /**
         * Returns the message type of the message area.
         *
         * @return the message type of the message area.
         */
        get() = gtk_info_bar_get_message_type(gtkInfoBarPointer.reinterpret()).run {
            MessageType.fromNativeValue(this)
        }

        /**
         * Sets the message type of the message area.
         *
         * GTK uses this type to determine how the message is displayed.
         *
         * @param messageType a `GtkMessageType`
         */
        set(messageType) = gtk_info_bar_set_message_type(gtkInfoBarPointer.reinterpret(), messageType.nativeValue)

    /**
     * Whether the info bar shows its contents.
     */
    public open var revealed: Boolean
        /**
         * Returns whether the info bar is currently revealed.
         *
         * @return the current value of the [property@Gtk.InfoBar:revealed] property
         */
        get() = gtk_info_bar_get_revealed(gtkInfoBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the `GtkInfoBar` is revealed.
         *
         * Changing this will make @info_bar reveal or conceal
         * itself via a sliding transition.
         *
         * Note: this does not show or hide @info_bar in the
         * [property@Gtk.Widget:visible] sense, so revealing has no effect
         * if [property@Gtk.Widget:visible] is false.
         *
         * @param revealed The new value of the property
         */
        set(revealed) = gtk_info_bar_set_revealed(gtkInfoBarPointer.reinterpret(), revealed.asGBoolean())

    /**
     * Whether to include a standard close button.
     */
    public open var showCloseButton: Boolean
        /**
         * Returns whether the widget will display a standard close button.
         *
         * @return true if the widget displays standard close button
         */
        get() = gtk_info_bar_get_show_close_button(gtkInfoBarPointer.reinterpret()).asBoolean()

        /**
         * If true, a standard close button is shown.
         *
         * When clicked it emits the response %GTK_RESPONSE_CLOSE.
         *
         * @param setting true to include a close button
         */
        set(setting) = gtk_info_bar_set_show_close_button(gtkInfoBarPointer.reinterpret(), setting.asGBoolean())

    /**
     * Creates a new `GtkInfoBar` object.
     *
     * @return a new `GtkInfoBar` object
     */
    public constructor() : this(gtk_info_bar_new()!!.reinterpret())

    /**
     * Add an activatable widget to the action area of a `GtkInfoBar`.
     *
     * This also connects a signal handler that will emit the
     * [signal@Gtk.InfoBar::response] signal on the message area
     * when the widget is activated. The widget is appended to the
     * end of the message areas action area.
     *
     * @param child an activatable widget
     * @param responseId response ID for @child
     */
    public open fun addActionWidget(child: Widget, responseId: gint): Unit = gtk_info_bar_add_action_widget(
        gtkInfoBarPointer.reinterpret(),
        child.gtkWidgetPointer.reinterpret(),
        responseId
    )

    /**
     * Adds a button with the given text.
     *
     * Clicking the button will emit the [signal@Gtk.InfoBar::response]
     * signal with the given response_id. The button is appended to the
     * end of the info bar's action area. The button widget is returned,
     * but usually you don't need it.
     *
     * @param buttonText text of button
     * @param responseId response ID for the button
     * @return the `GtkButton` widget
     * that was added
     */
    public open fun addButton(buttonText: String, responseId: gint): Button =
        gtk_info_bar_add_button(gtkInfoBarPointer.reinterpret(), buttonText, responseId)!!.run {
            Button(reinterpret())
        }

    /**
     * Adds a widget to the content area of the info bar.
     *
     * @param widget the child to be added
     */
    public open fun addChild(widget: Widget): Unit =
        gtk_info_bar_add_child(gtkInfoBarPointer.reinterpret(), widget.gtkWidgetPointer.reinterpret())

    /**
     * Removes a widget from the action area of @info_bar.
     *
     * The widget must have been put there by a call to
     * [method@Gtk.InfoBar.add_action_widget] or [method@Gtk.InfoBar.add_button].
     *
     * @param widget an action widget to remove
     */
    public open fun removeActionWidget(widget: Widget): Unit =
        gtk_info_bar_remove_action_widget(gtkInfoBarPointer.reinterpret(), widget.gtkWidgetPointer.reinterpret())

    /**
     * Removes a widget from the content area of the info bar.
     *
     * @param widget a child that has been added to the content area
     */
    public open fun removeChild(widget: Widget): Unit =
        gtk_info_bar_remove_child(gtkInfoBarPointer.reinterpret(), widget.gtkWidgetPointer.reinterpret())

    /**
     * Emits the “response” signal with the given @response_id.
     *
     * @param responseId a response ID
     */
    public open fun response(responseId: gint): Unit =
        gtk_info_bar_response(gtkInfoBarPointer.reinterpret(), responseId)

    /**
     * Sets the last widget in the info bar’s action area with
     * the given response_id as the default widget for the dialog.
     *
     * Pressing “Enter” normally activates the default widget.
     *
     * Note that this function currently requires @info_bar to
     * be added to a widget hierarchy.
     *
     * @param responseId a response ID
     */
    public open fun setDefaultResponse(responseId: gint): Unit =
        gtk_info_bar_set_default_response(gtkInfoBarPointer.reinterpret(), responseId)

    /**
     * Sets the sensitivity of action widgets for @response_id.
     *
     * Calls `gtk_widget_set_sensitive (widget, setting)` for each
     * widget in the info bars’s action area with the given @response_id.
     * A convenient way to sensitize/desensitize buttons.
     *
     * @param responseId a response ID
     * @param setting TRUE for sensitive
     */
    public open fun setResponseSensitive(responseId: gint, setting: Boolean): Unit =
        gtk_info_bar_set_response_sensitive(gtkInfoBarPointer.reinterpret(), responseId, setting.asGBoolean())

    /**
     * Gets emitted when the user uses a keybinding to dismiss the info bar.
     *
     * The ::close signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is the Escape key.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectClose(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "close",
            connectCloseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when an action widget is clicked.
     *
     * The signal is also emitted when the application programmer
     * calls [method@Gtk.InfoBar.response]. The @response_id depends
     * on which action widget was clicked.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `responseId` the response ID
     */
    public fun connectResponse(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (responseId: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "response",
        connectResponseFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<InfoBar> {
        override val type: GeneratedClassKGType<InfoBar> =
            GeneratedClassKGType(gtk_info_bar_get_type()) { InfoBar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of InfoBar
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_info_bar_get_type()
    }
}

private val connectCloseFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectResponseFunc: CPointer<CFunction<(gint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        responseId: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(responseId: gint) -> Unit>().get().invoke(responseId)
}
    .reinterpret()
