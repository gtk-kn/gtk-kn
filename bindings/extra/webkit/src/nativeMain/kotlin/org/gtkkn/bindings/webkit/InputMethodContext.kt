// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

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
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitInputMethodContext
import org.gtkkn.native.webkit.webkit_input_method_context_filter_key_event
import org.gtkkn.native.webkit.webkit_input_method_context_get_input_hints
import org.gtkkn.native.webkit.webkit_input_method_context_get_input_purpose
import org.gtkkn.native.webkit.webkit_input_method_context_get_type
import org.gtkkn.native.webkit.webkit_input_method_context_notify_cursor_area
import org.gtkkn.native.webkit.webkit_input_method_context_notify_focus_in
import org.gtkkn.native.webkit.webkit_input_method_context_notify_focus_out
import org.gtkkn.native.webkit.webkit_input_method_context_notify_surrounding
import org.gtkkn.native.webkit.webkit_input_method_context_reset
import org.gtkkn.native.webkit.webkit_input_method_context_set_enable_preedit
import org.gtkkn.native.webkit.webkit_input_method_context_set_input_hints
import org.gtkkn.native.webkit.webkit_input_method_context_set_input_purpose
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Base class for input method contexts.
 *
 * WebKitInputMethodContext defines the interface to implement WebKit input methods.
 * The input methods are used by WebKit, when editable content is focused, to map from
 * key events to Unicode character strings.
 *
 * An input method may consume multiple key events in sequence and finally
 * output the composed result. This is called preediting, and an input method
 * may provide feedback about this process by displaying the intermediate
 * composition states as preedit text.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `text`: text: Out parameter is not supported
 *
 * @since 2.28
 */
@WebKitVersion2_28
public abstract class InputMethodContext(
    public val webkitInputMethodContextPointer: CPointer<WebKitInputMethodContext>,
) : Object(webkitInputMethodContextPointer.reinterpret()),
    KGTyped {
    /**
     * The #WebKitInputHints of the input associated with this context.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public open var inputHints: InputHints
        /**
         * Get the value of the #WebKitInputMethodContext:input-hints property.
         *
         * @return the #WebKitInputHints of the input associated with @context
         * @since 2.28
         */
        get() = webkit_input_method_context_get_input_hints(webkitInputMethodContextPointer).run {
            InputHints(this)
        }

        /**
         * Set the value of the #WebKitInputMethodContext:input-hints property.
         *
         * @param hints a #WebKitInputHints
         * @since 2.28
         */
        @WebKitVersion2_28
        set(hints) = webkit_input_method_context_set_input_hints(webkitInputMethodContextPointer, hints.mask)

    /**
     * The #WebKitInputPurpose of the input associated with this context.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public open var inputPurpose: InputPurpose
        /**
         * Get the value of the #WebKitInputMethodContext:input-purpose property.
         *
         * @return the #WebKitInputPurpose of the input associated with @context
         * @since 2.28
         */
        get() = webkit_input_method_context_get_input_purpose(webkitInputMethodContextPointer).run {
            InputPurpose.fromNativeValue(this)
        }

        /**
         * Set the value of the #WebKitInputMethodContext:input-purpose property.
         *
         * @param purpose a #WebKitInputPurpose
         * @since 2.28
         */
        @WebKitVersion2_28
        set(
            purpose
        ) = webkit_input_method_context_set_input_purpose(webkitInputMethodContextPointer, purpose.nativeValue)

    /**
     * Allow @key_event to be handled by the input method.
     *
     * If true is returned, then no further processing should be
     * done for the key event.
     *
     * @param keyEvent the key event to filter
     * @return true if the key event was handled, or false otherwise
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun filterKeyEvent(keyEvent: Event): Boolean = webkit_input_method_context_filter_key_event(
        webkitInputMethodContextPointer,
        keyEvent.gdkEventPointer
    ).asBoolean()

    /**
     * Notify @context that cursor area changed in input associated.
     *
     * @param x the x coordinate of cursor location
     * @param y the y coordinate of cursor location
     * @param width the width of cursor area
     * @param height the height of cursor area
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun notifyCursorArea(x: gint, y: gint, width: gint, height: gint): Unit =
        webkit_input_method_context_notify_cursor_area(webkitInputMethodContextPointer, x, y, width, height)

    /**
     * Notify @context that input associated has gained focus.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun notifyFocusIn(): Unit = webkit_input_method_context_notify_focus_in(webkitInputMethodContextPointer)

    /**
     * Notify @context that input associated has lost focus.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun notifyFocusOut(): Unit =
        webkit_input_method_context_notify_focus_out(webkitInputMethodContextPointer)

    /**
     * Notify @context that the context surrounding the cursor has changed.
     *
     * If there's no selection @selection_index is the same as @cursor_index.
     *
     * @param text text surrounding the insertion point
     * @param length the length of @text, or -1 if @text is nul-terminated
     * @param cursorIndex the byte index of the insertion cursor within @text.
     * @param selectionIndex the byte index of the selection cursor within @text.
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun notifySurrounding(text: String, length: gint, cursorIndex: guint, selectionIndex: guint): Unit =
        webkit_input_method_context_notify_surrounding(
            webkitInputMethodContextPointer,
            text,
            length,
            cursorIndex,
            selectionIndex
        )

    /**
     * Reset the @context.
     *
     * This will typically cause the input to clear the preedit state.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun reset(): Unit = webkit_input_method_context_reset(webkitInputMethodContextPointer)

    /**
     * Set whether @context should enable preedit to display feedback.
     *
     * @param enabled whether to enable preedit
     * @since 2.28
     */
    @WebKitVersion2_28
    public open fun setEnablePreedit(enabled: Boolean): Unit =
        webkit_input_method_context_set_enable_preedit(webkitInputMethodContextPointer, enabled.asGBoolean())

    /**
     * Emitted when a complete input sequence has been entered by the user.
     * This can be a single character immediately after a key press or the
     * final result of preediting.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `text` the string result
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun onCommitted(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (text: String) -> Unit): ULong =
        g_signal_connect_data(
            webkitInputMethodContextPointer,
            "committed",
            onCommittedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "committed" signal. See [onCommitted].
     *
     * @param text the string result
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun emitCommitted(text: String) {
        g_signal_emit_by_name(webkitInputMethodContextPointer.reinterpret(), "committed", text.cstr)
    }

    /**
     * Emitted when the input method wants to delete the context surrounding the cursor.
     * If @offset is a negative value, it means a position before the cursor.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `offset` the character offset from the cursor position of the text to be deleted.; `nChars` the number of characters to be deleted
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun onDeleteSurrounding(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (offset: gint, nChars: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        webkitInputMethodContextPointer,
        "delete-surrounding",
        onDeleteSurroundingFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "delete-surrounding" signal. See [onDeleteSurrounding].
     *
     * @param offset the character offset from the cursor position of the text to be deleted.
     * @param nChars the number of characters to be deleted
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun emitDeleteSurrounding(offset: gint, nChars: guint) {
        g_signal_emit_by_name(webkitInputMethodContextPointer.reinterpret(), "delete-surrounding", offset, nChars)
    }

    /**
     * Emitted whenever the preedit sequence currently being entered has changed.
     * It is also emitted at the end of a preedit sequence, in which case
     * webkit_input_method_context_get_preedit() returns the empty string.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun onPreeditChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            webkitInputMethodContextPointer,
            "preedit-changed",
            onPreeditChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "preedit-changed" signal. See [onPreeditChanged].
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun emitPreeditChanged() {
        g_signal_emit_by_name(webkitInputMethodContextPointer.reinterpret(), "preedit-changed")
    }

    /**
     * Emitted when a preediting sequence has been completed or canceled.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun onPreeditFinished(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            webkitInputMethodContextPointer,
            "preedit-finished",
            onPreeditFinishedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "preedit-finished" signal. See [onPreeditFinished].
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun emitPreeditFinished() {
        g_signal_emit_by_name(webkitInputMethodContextPointer.reinterpret(), "preedit-finished")
    }

    /**
     * Emitted when a new preediting sequence starts.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun onPreeditStarted(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            webkitInputMethodContextPointer,
            "preedit-started",
            onPreeditStartedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "preedit-started" signal. See [onPreeditStarted].
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun emitPreeditStarted() {
        g_signal_emit_by_name(webkitInputMethodContextPointer.reinterpret(), "preedit-started")
    }

    /**
     * The InputMethodContextImpl type represents a native instance of the abstract InputMethodContext class.
     *
     * @constructor Creates a new instance of InputMethodContext for the provided [CPointer].
     */
    public class InputMethodContextImpl(pointer: CPointer<WebKitInputMethodContext>) : InputMethodContext(pointer)

    public companion object : TypeCompanion<InputMethodContext> {
        override val type: GeneratedClassKGType<InputMethodContext> =
            GeneratedClassKGType(webkit_input_method_context_get_type()) {
                InputMethodContextImpl(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of InputMethodContext
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_input_method_context_get_type()
    }
}

private val onCommittedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        text: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            text: String,
        ) -> Unit
        >().get().invoke(text?.toKString() ?: error("Expected not null string"))
}
    .reinterpret()

private val onDeleteSurroundingFunc: CPointer<CFunction<(gint, guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        offset: gint,
        nChars: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(offset: gint, nChars: guint) -> Unit>().get().invoke(offset, nChars)
}
    .reinterpret()

private val onPreeditChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPreeditFinishedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPreeditStartedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
