// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Device
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gdk.Surface
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_2
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkIMContext
import org.gtkkn.native.gtk.gtk_im_context_activate_osk
import org.gtkkn.native.gtk.gtk_im_context_delete_surrounding
import org.gtkkn.native.gtk.gtk_im_context_filter_key
import org.gtkkn.native.gtk.gtk_im_context_filter_keypress
import org.gtkkn.native.gtk.gtk_im_context_focus_in
import org.gtkkn.native.gtk.gtk_im_context_focus_out
import org.gtkkn.native.gtk.gtk_im_context_get_type
import org.gtkkn.native.gtk.gtk_im_context_reset
import org.gtkkn.native.gtk.gtk_im_context_set_client_widget
import org.gtkkn.native.gtk.gtk_im_context_set_cursor_location
import org.gtkkn.native.gtk.gtk_im_context_set_surrounding
import org.gtkkn.native.gtk.gtk_im_context_set_surrounding_with_selection
import org.gtkkn.native.gtk.gtk_im_context_set_use_preedit
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkIMContext` defines the interface for GTK input methods.
 *
 * `GtkIMContext` is used by GTK text input widgets like `GtkText`
 * to map from key events to Unicode character strings.
 *
 * An input method may consume multiple key events in sequence before finally
 * outputting the composed result. This is called *preediting*, and an input
 * method may provide feedback about this process by displaying the intermediate
 * composition states as preedit text. To do so, the `GtkIMContext` will emit
 * [signal@Gtk.IMContext::preedit-start], [signal@Gtk.IMContext::preedit-changed]
 * and [signal@Gtk.IMContext::preedit-end] signals.
 *
 * For instance, the built-in GTK input method [class@Gtk.IMContextSimple]
 * implements the input of arbitrary Unicode code points by holding down the
 * <kbd>Control</kbd> and <kbd>Shift</kbd> keys and then typing <kbd>u</kbd>
 * followed by the hexadecimal digits of the code point. When releasing the
 * <kbd>Control</kbd> and <kbd>Shift</kbd> keys, preediting ends and the
 * character is inserted as text. For example,
 *
 *     Ctrl+Shift+u 2 0 A C
 *
 * results in the € sign.
 *
 * Additional input methods can be made available for use by GTK widgets as
 * loadable modules. An input method module is a small shared library which
 * provides a `GIOExtension` for the extension point named "gtk-im-module".
 *
 * To connect a widget to the users preferred input method, you should use
 * [class@Gtk.IMMulticontext].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `str`: str: Out parameter is not supported
 * - parameter `text`: text: Out parameter is not supported
 * - parameter `text`: text: Out parameter is not supported
 * - method `input-hints`: Property has no getter nor setter
 * - method `input-purpose`: Property has no getter nor setter
 */
public open class IMContext(
    pointer: CPointer<GtkIMContext>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkIMContextPointer: CPointer<GtkIMContext>
        get() = gPointer.reinterpret()

    /**
     * Requests the platform to show an on-screen keyboard for user input.
     *
     * This method will return true if this request was actually performed
     * to the platform, other environmental factors may result in an on-screen
     * keyboard effectively not showing up.
     *
     * @param event a [class@Gdk.Event]
     * @return true if an on-screen keyboard could be requested to the platform.
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun activateOsk(event: Event? = null): Boolean =
        gtk_im_context_activate_osk(gtkIMContextPointer.reinterpret(), event?.gPointer?.reinterpret()).asBoolean()

    /**
     * Asks the widget that the input context is attached to delete
     * characters around the cursor position by emitting the
     * `::delete_surrounding` signal.
     *
     * Note that @offset and @n_chars are in characters not in bytes
     * which differs from the usage other places in `GtkIMContext`.
     *
     * In order to use this function, you should first call
     * [method@Gtk.IMContext.get_surrounding] to get the current context,
     * and call this function immediately afterwards to make sure that you
     * know what you are deleting. You should also account for the fact
     * that even if the signal was handled, the input context might not
     * have deleted all the characters that were requested to be deleted.
     *
     * This function is used by an input method that wants to make
     * substitutions in the existing text in response to new input.
     * It is not useful for applications.
     *
     * @param offset offset from cursor position in chars;
     *    a negative value means start before the cursor.
     * @param nChars number of characters to delete.
     * @return true if the signal was handled.
     */
    public open fun deleteSurrounding(
        offset: Int,
        nChars: Int,
    ): Boolean = gtk_im_context_delete_surrounding(gtkIMContextPointer.reinterpret(), offset, nChars).asBoolean()

    /**
     * Allow an input method to forward key press and release events
     * to another input method without necessarily having a `GdkEvent`
     * available.
     *
     * @param press whether to forward a key press or release event
     * @param surface the surface the event is for
     * @param device the device that the event is for
     * @param time the timestamp for the event
     * @param keycode the keycode for the event
     * @param state modifier state for the event
     * @param group the active keyboard group for the event
     * @return true if the input method handled the key event.
     */
    public open fun filterKey(
        press: Boolean,
        surface: Surface,
        device: Device,
        time: UInt,
        keycode: UInt,
        state: ModifierType,
        group: Int,
    ): Boolean =
        gtk_im_context_filter_key(
            gtkIMContextPointer.reinterpret(),
            press.asGBoolean(),
            surface.gdkSurfacePointer.reinterpret(),
            device.gdkDevicePointer.reinterpret(),
            time,
            keycode,
            state.mask,
            group
        ).asBoolean()

    /**
     * Allow an input method to internally handle key press and release
     * events.
     *
     * If this function returns true, then no further processing
     * should be done for this key event.
     *
     * @param event the key event
     * @return true if the input method handled the key event.
     */
    public open fun filterKeypress(event: Event): Boolean =
        gtk_im_context_filter_keypress(gtkIMContextPointer.reinterpret(), event.gPointer.reinterpret()).asBoolean()

    /**
     * Notify the input method that the widget to which this
     * input context corresponds has gained focus.
     *
     * The input method may, for example, change the displayed
     * feedback to reflect this change.
     */
    public open fun focusIn(): Unit = gtk_im_context_focus_in(gtkIMContextPointer.reinterpret())

    /**
     * Notify the input method that the widget to which this
     * input context corresponds has lost focus.
     *
     * The input method may, for example, change the displayed
     * feedback or reset the contexts state to reflect this change.
     */
    public open fun focusOut(): Unit = gtk_im_context_focus_out(gtkIMContextPointer.reinterpret())

    /**
     * Notify the input method that a change such as a change in cursor
     * position has been made.
     *
     * This will typically cause the input method to clear the preedit state.
     */
    public open fun reset(): Unit = gtk_im_context_reset(gtkIMContextPointer.reinterpret())

    /**
     * Set the client widget for the input context.
     *
     * This is the `GtkWidget` holding the input focus. This widget is
     * used in order to correctly position status windows, and may
     * also be used for purposes internal to the input method.
     *
     * @param widget the client widget. This may be null to indicate
     *   that the previous client widget no longer exists.
     */
    public open fun setClientWidget(widget: Widget? = null): Unit =
        gtk_im_context_set_client_widget(gtkIMContextPointer.reinterpret(), widget?.gtkWidgetPointer?.reinterpret())

    /**
     * Notify the input method that a change in cursor
     * position has been made.
     *
     * The location is relative to the client widget.
     *
     * @param area new location
     */
    public open fun setCursorLocation(area: Rectangle): Unit =
        gtk_im_context_set_cursor_location(gtkIMContextPointer.reinterpret(), area.gdkRectanglePointer)

    /**
     * Sets surrounding context around the insertion point and preedit
     * string.
     *
     * This function is expected to be called in response to the
     * [signal@Gtk.IMContext::retrieve-surrounding] signal, and will
     * likely have no effect if called at other times.
     *
     * @param text text surrounding the insertion point, as UTF-8.
     *   the preedit string should not be included within @text
     * @param len the length of @text, or -1 if @text is nul-terminated
     * @param cursorIndex the byte index of the insertion cursor within @text.
     */
    public open fun setSurrounding(
        text: String,
        len: Int,
        cursorIndex: Int,
    ): Unit = gtk_im_context_set_surrounding(gtkIMContextPointer.reinterpret(), text, len, cursorIndex)

    /**
     * Sets surrounding context around the insertion point and preedit
     * string. This function is expected to be called in response to the
     * [signal@Gtk.IMContext::retrieve_surrounding] signal, and will likely
     * have no effect if called at other times.
     *
     * @param text text surrounding the insertion point, as UTF-8.
     *   the preedit string should not be included within @text
     * @param len the length of @text, or -1 if @text is nul-terminated
     * @param cursorIndex the byte index of the insertion cursor within @text
     * @param anchorIndex the byte index of the selection bound within @text
     * @since 4.2
     */
    @GtkVersion4_2
    public open fun setSurroundingWithSelection(
        text: String,
        len: Int,
        cursorIndex: Int,
        anchorIndex: Int,
    ): Unit =
        gtk_im_context_set_surrounding_with_selection(
            gtkIMContextPointer.reinterpret(),
            text,
            len,
            cursorIndex,
            anchorIndex
        )

    /**
     * Sets whether the IM context should use the preedit string
     * to display feedback.
     *
     * If @use_preedit is false (default is true), then the IM context
     * may use some other method to display feedback, such as displaying
     * it in a child of the root window.
     *
     * @param usePreedit whether the IM context should use the preedit string.
     */
    public open fun setUsePreedit(usePreedit: Boolean): Unit =
        gtk_im_context_set_use_preedit(gtkIMContextPointer.reinterpret(), usePreedit.asGBoolean())

    /**
     * The ::commit signal is emitted when a complete input sequence
     * has been entered by the user.
     *
     * If the commit comes after a preediting sequence, the
     * ::commit signal is emitted after ::preedit-end.
     *
     * This can be a single character immediately after a key press or
     * the final result of preediting.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `str` the completed character(s) entered by the user
     */
    public fun connectCommit(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (str: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "commit",
            connectCommitFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The ::delete-surrounding signal is emitted when the input method
     * needs to delete all or part of the context surrounding the cursor.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `offset` the character offset from the cursor position of the text
     *   to be deleted. A negative value indicates a position before
     *   the cursor.; `nChars` the number of characters to be deleted. Returns true if the signal was handled.
     */
    public fun connectDeleteSurrounding(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (offset: Int, nChars: Int) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "delete-surrounding",
            connectDeleteSurroundingFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The ::preedit-changed signal is emitted whenever the preedit sequence
     * currently being entered has changed.
     *
     * It is also emitted at the end of a preedit sequence, in which case
     * [method@Gtk.IMContext.get_preedit_string] returns the empty string.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectPreeditChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "preedit-changed",
            connectPreeditChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The ::preedit-end signal is emitted when a preediting sequence
     * has been completed or canceled.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectPreeditEnd(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "preedit-end",
            connectPreeditEndFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The ::preedit-start signal is emitted when a new preediting sequence
     * starts.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectPreeditStart(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "preedit-start",
            connectPreeditStartFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The ::retrieve-surrounding signal is emitted when the input method
     * requires the context surrounding the cursor.
     *
     * The callback should set the input method surrounding context by
     * calling the [method@Gtk.IMContext.set_surrounding] method.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true if the signal was handled.
     */
    public fun connectRetrieveSurrounding(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "retrieve-surrounding",
            connectRetrieveSurroundingFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<IMContext> {
        override val type: GeneratedClassKGType<IMContext> =
            GeneratedClassKGType(gtk_im_context_get_type()) { IMContext(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectCommitFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            str: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    str: String,
                ) -> Unit
            >()
            .get()
            .invoke(str?.toKString() ?: error("Expected not null string"))
    }.reinterpret()

private val connectDeleteSurroundingFunc: CPointer<CFunction<(Int, Int) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            offset: Int,
            nChars: Int,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(offset: Int, nChars: Int) -> Boolean>()
            .get()
            .invoke(offset, nChars)
            .asGBoolean()
    }.reinterpret()

private val connectPreeditChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectPreeditEndFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectPreeditStartFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectRetrieveSurroundingFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<() -> Boolean>()
            .get()
            .invoke()
            .asGBoolean()
    }.reinterpret()
