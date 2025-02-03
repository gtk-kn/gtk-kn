// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
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
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
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
import kotlin.String
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
public abstract class ImContext(public val gtkImContextPointer: CPointer<GtkIMContext>) :
    Object(gtkImContextPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

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
        gtk_im_context_activate_osk(gtkImContextPointer, event?.gdkEventPointer).asBoolean()

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
    public open fun deleteSurrounding(offset: gint, nChars: gint): Boolean =
        gtk_im_context_delete_surrounding(gtkImContextPointer, offset, nChars).asBoolean()

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
        time: guint,
        keycode: guint,
        state: ModifierType,
        group: gint,
    ): Boolean = gtk_im_context_filter_key(
        gtkImContextPointer,
        press.asGBoolean(),
        surface.gdkSurfacePointer,
        device.gdkDevicePointer,
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
        gtk_im_context_filter_keypress(gtkImContextPointer, event.gdkEventPointer).asBoolean()

    /**
     * Notify the input method that the widget to which this
     * input context corresponds has gained focus.
     *
     * The input method may, for example, change the displayed
     * feedback to reflect this change.
     */
    public open fun focusIn(): Unit = gtk_im_context_focus_in(gtkImContextPointer)

    /**
     * Notify the input method that the widget to which this
     * input context corresponds has lost focus.
     *
     * The input method may, for example, change the displayed
     * feedback or reset the contexts state to reflect this change.
     */
    public open fun focusOut(): Unit = gtk_im_context_focus_out(gtkImContextPointer)

    /**
     * Notify the input method that a change such as a change in cursor
     * position has been made.
     *
     * This will typically cause the input method to clear the preedit state.
     */
    public open fun reset(): Unit = gtk_im_context_reset(gtkImContextPointer)

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
        gtk_im_context_set_client_widget(gtkImContextPointer, widget?.gtkWidgetPointer)

    /**
     * Notify the input method that a change in cursor
     * position has been made.
     *
     * The location is relative to the client widget.
     *
     * @param area new location
     */
    public open fun setCursorLocation(area: Rectangle): Unit =
        gtk_im_context_set_cursor_location(gtkImContextPointer, area.gdkRectanglePointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.2.
     *
     * Use [method@Gtk.IMContext.set_surrounding_with_selection] instead
     * ---
     *
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
    public open fun setSurrounding(text: String, len: gint, cursorIndex: gint): Unit =
        gtk_im_context_set_surrounding(gtkImContextPointer, text, len, cursorIndex)

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
    public open fun setSurroundingWithSelection(text: String, len: gint, cursorIndex: gint, anchorIndex: gint): Unit =
        gtk_im_context_set_surrounding_with_selection(gtkImContextPointer, text, len, cursorIndex, anchorIndex)

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
        gtk_im_context_set_use_preedit(gtkImContextPointer, usePreedit.asGBoolean())

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
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `str` the completed character(s) entered by the user
     */
    public fun onCommit(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (str: String) -> Unit): ULong =
        g_signal_connect_data(
            gtkImContextPointer,
            "commit",
            onCommitFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "commit" signal. See [onCommit].
     *
     * @param str the completed character(s) entered by the user
     */
    public fun emitCommit(str: String) {
        g_signal_emit_by_name(gtkImContextPointer.reinterpret(), "commit", str.cstr)
    }

    /**
     * The ::delete-surrounding signal is emitted when the input method
     * needs to delete all or part of the context surrounding the cursor.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `offset` the character offset from the cursor position of the text
     *   to be deleted. A negative value indicates a position before
     *   the cursor.; `nChars` the number of characters to be deleted. Returns true if the signal was handled.
     */
    public fun onDeleteSurrounding(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (offset: gint, nChars: gint) -> Boolean,
    ): ULong = g_signal_connect_data(
        gtkImContextPointer,
        "delete-surrounding",
        onDeleteSurroundingFunc.reinterpret(),
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
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPreeditChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkImContextPointer,
            "preedit-changed",
            onPreeditChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "preedit-changed" signal. See [onPreeditChanged].
     */
    public fun emitPreeditChanged() {
        g_signal_emit_by_name(gtkImContextPointer.reinterpret(), "preedit-changed")
    }

    /**
     * The ::preedit-end signal is emitted when a preediting sequence
     * has been completed or canceled.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPreeditEnd(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkImContextPointer,
            "preedit-end",
            onPreeditEndFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "preedit-end" signal. See [onPreeditEnd].
     */
    public fun emitPreeditEnd() {
        g_signal_emit_by_name(gtkImContextPointer.reinterpret(), "preedit-end")
    }

    /**
     * The ::preedit-start signal is emitted when a new preediting sequence
     * starts.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPreeditStart(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkImContextPointer,
            "preedit-start",
            onPreeditStartFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "preedit-start" signal. See [onPreeditStart].
     */
    public fun emitPreeditStart() {
        g_signal_emit_by_name(gtkImContextPointer.reinterpret(), "preedit-start")
    }

    /**
     * The ::retrieve-surrounding signal is emitted when the input method
     * requires the context surrounding the cursor.
     *
     * The callback should set the input method surrounding context by
     * calling the [method@Gtk.IMContext.set_surrounding] method.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true if the signal was handled.
     */
    public fun onRetrieveSurrounding(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gtkImContextPointer,
            "retrieve-surrounding",
            onRetrieveSurroundingFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The ImContextImpl type represents a native instance of the abstract ImContext class.
     *
     * @constructor Creates a new instance of ImContext for the provided [CPointer].
     */
    public class ImContextImpl(pointer: CPointer<GtkIMContext>) : ImContext(pointer)

    public companion object : TypeCompanion<ImContext> {
        override val type: GeneratedClassKGType<ImContext> =
            GeneratedClassKGType(getTypeOrNull()!!) { ImContextImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of IMContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_im_context_get_type()

        /**
         * Gets the GType of from the symbol `gtk_im_context_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_im_context_get_type")
    }
}

private val onCommitFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        str: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(str: String) -> Unit>().get().invoke(str?.toKString() ?: error("Expected not null string"))
}
    .reinterpret()

private val onDeleteSurroundingFunc: CPointer<CFunction<(gint, gint) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            offset: gint,
            nChars: gint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(offset: gint, nChars: gint) -> Boolean>().get().invoke(offset, nChars).asGBoolean()
    }
        .reinterpret()

private val onPreeditChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPreeditEndFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPreeditStartFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onRetrieveSurroundingFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()
