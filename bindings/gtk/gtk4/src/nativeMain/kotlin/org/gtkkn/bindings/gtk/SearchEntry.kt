// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_8
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEditable
import org.gtkkn.native.gtk.GtkSearchEntry
import org.gtkkn.native.gtk.gtk_search_entry_get_input_hints
import org.gtkkn.native.gtk.gtk_search_entry_get_input_purpose
import org.gtkkn.native.gtk.gtk_search_entry_get_key_capture_widget
import org.gtkkn.native.gtk.gtk_search_entry_get_placeholder_text
import org.gtkkn.native.gtk.gtk_search_entry_get_search_delay
import org.gtkkn.native.gtk.gtk_search_entry_get_type
import org.gtkkn.native.gtk.gtk_search_entry_new
import org.gtkkn.native.gtk.gtk_search_entry_set_input_hints
import org.gtkkn.native.gtk.gtk_search_entry_set_input_purpose
import org.gtkkn.native.gtk.gtk_search_entry_set_key_capture_widget
import org.gtkkn.native.gtk.gtk_search_entry_set_placeholder_text
import org.gtkkn.native.gtk.gtk_search_entry_set_search_delay
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkSearchEntry` is an entry widget that has been tailored for use
 * as a search entry.
 *
 * The main API for interacting with a `GtkSearchEntry` as entry
 * is the `GtkEditable` interface.
 *
 * ![An example GtkSearchEntry](search-entry.png)
 *
 * It will show an inactive symbolic “find” icon when the search
 * entry is empty, and a symbolic “clear” icon when there is text.
 * Clicking on the “clear” icon will empty the search entry.
 *
 * To make filtering appear more reactive, it is a good idea to
 * not react to every change in the entry text immediately, but
 * only after a short delay. To support this, `GtkSearchEntry`
 * emits the [signal@Gtk.SearchEntry::search-changed] signal which
 * can be used instead of the [signal@Gtk.Editable::changed] signal.
 *
 * The [signal@Gtk.SearchEntry::previous-match],
 * [signal@Gtk.SearchEntry::next-match] and
 * [signal@Gtk.SearchEntry::stop-search] signals can be used to
 * implement moving between search results and ending the search.
 *
 * Often, `GtkSearchEntry` will be fed events by means of being
 * placed inside a [class@Gtk.SearchBar]. If that is not the case,
 * you can use [method@Gtk.SearchEntry.set_key_capture_widget] to
 * let it capture key input from another widget.
 *
 * `GtkSearchEntry` provides only minimal API and should be used with
 * the [iface@Gtk.Editable] API.
 *
 * ## CSS Nodes
 *
 * ```
 * entry.search
 * ╰── text
 * ```
 *
 * `GtkSearchEntry` has a single CSS node with name entry that carries
 * a `.search` style class, and the text node is a child of that.
 *
 * ## Accessibility
 *
 * `GtkSearchEntry` uses the %GTK_ACCESSIBLE_ROLE_SEARCH_BOX role.
 *
 * ## Skipped during bindings generation
 *
 * - method `activates-default`: Property has no getter nor setter
 */
public open class SearchEntry(pointer: CPointer<GtkSearchEntry>) :
    Widget(pointer.reinterpret()),
    Editable,
    KGTyped {
    public val gtkSearchEntryPointer: CPointer<GtkSearchEntry>
        get() = gPointer.reinterpret()

    override val gtkEditablePointer: CPointer<GtkEditable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The hints about input for the `GtkSearchEntry` used to alter the
     * behaviour of input methods.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var inputHints: InputHints
        /**
         * Gets the input purpose for @entry.
         *
         * @return The input hints
         * @since 4.14
         */
        get() = gtk_search_entry_get_input_hints(gtkSearchEntryPointer).run {
            InputHints(this)
        }

        /**
         * Sets the input hints for @entry.
         *
         * @param hints the new input hints
         * @since 4.14
         */
        @GtkVersion4_14
        set(hints) = gtk_search_entry_set_input_hints(gtkSearchEntryPointer, hints.mask)

    /**
     * The purpose for the `GtkSearchEntry` input used to alter the
     * behaviour of input methods.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var inputPurpose: InputPurpose
        /**
         * Gets the input purpose of @entry.
         *
         * @return The input hints
         * @since 4.14
         */
        get() = gtk_search_entry_get_input_purpose(gtkSearchEntryPointer).run {
            InputPurpose.fromNativeValue(this)
        }

        /**
         * Sets the input purpose of @entry.
         *
         * @param purpose the new input purpose
         * @since 4.14
         */
        @GtkVersion4_14
        set(purpose) = gtk_search_entry_set_input_purpose(gtkSearchEntryPointer, purpose.nativeValue)

    /**
     * The text that will be displayed in the `GtkSearchEntry`
     * when it is empty and unfocused.
     */
    public open var placeholderText: String?
        /**
         * Gets the placeholder text associated with @entry.
         *
         * @return The placeholder text.
         * @since 4.10
         */
        get() = gtk_search_entry_get_placeholder_text(gtkSearchEntryPointer)?.toKString()

        /**
         * Sets the placeholder text associated with @entry.
         *
         * @param text the text to set as a placeholder
         * @since 4.10
         */
        @GtkVersion4_10
        set(text) = gtk_search_entry_set_placeholder_text(gtkSearchEntryPointer, text)

    /**
     * The delay in milliseconds from last keypress to the search
     * changed signal.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var searchDelay: guint
        /**
         * Get the delay to be used between the last keypress and the
         * [signal@Gtk.SearchEntry::search-changed] signal being emitted.
         *
         * @return a delay in milliseconds.
         * @since 4.8
         */
        get() = gtk_search_entry_get_search_delay(gtkSearchEntryPointer)

        /**
         * Set the delay to be used between the last keypress and the
         * [signal@Gtk.SearchEntry::search-changed] signal being emitted.
         *
         * @param delay a delay in milliseconds
         * @since 4.8
         */
        @GtkVersion4_8
        set(delay) = gtk_search_entry_set_search_delay(gtkSearchEntryPointer, delay)

    /**
     * Creates a `GtkSearchEntry`.
     *
     * @return a new `GtkSearchEntry`
     */
    public constructor() : this(gtk_search_entry_new()!!.reinterpret())

    /**
     * Gets the widget that @entry is capturing key events from.
     *
     * @return The key capture widget.
     */
    public open fun getKeyCaptureWidget(): Widget? =
        gtk_search_entry_get_key_capture_widget(gtkSearchEntryPointer)?.run {
            Widget(this)
        }

    /**
     * Sets @widget as the widget that @entry will capture key
     * events from.
     *
     * Key events are consumed by the search entry to start or
     * continue a search.
     *
     * If the entry is part of a `GtkSearchBar`, it is preferable
     * to call [method@Gtk.SearchBar.set_key_capture_widget] instead,
     * which will reveal the entry in addition to triggering the
     * search entry.
     *
     * Note that despite the name of this function, the events
     * are only 'captured' in the bubble phase, which means that
     * editable child widgets of @widget will receive text input
     * before it gets captured. If that is not desired, you can
     * capture and forward the events yourself with
     * [method@Gtk.EventControllerKey.forward].
     *
     * @param widget a `GtkWidget`
     */
    public open fun setKeyCaptureWidget(widget: Widget? = null): Unit =
        gtk_search_entry_set_key_capture_widget(gtkSearchEntryPointer, widget?.gtkWidgetPointer)

    /**
     * Emitted when the entry is activated.
     *
     * The keybindings for this signal are all forms of the Enter key.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     */
    public fun emitActivate() {
        g_signal_emit_by_name(gPointer.reinterpret(), "activate")
    }

    /**
     * Emitted when the user initiates a move to the next match
     * for the current search string.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * Applications should connect to it, to implement moving
     * between matches.
     *
     * The default bindings for this signal is Ctrl-g.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onNextMatch(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "next-match",
            onNextMatchFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "next-match" signal. See [onNextMatch].
     */
    public fun emitNextMatch() {
        g_signal_emit_by_name(gPointer.reinterpret(), "next-match")
    }

    /**
     * Emitted when the user initiates a move to the previous match
     * for the current search string.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * Applications should connect to it, to implement moving
     * between matches.
     *
     * The default bindings for this signal is Ctrl-Shift-g.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPreviousMatch(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "previous-match",
            onPreviousMatchFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "previous-match" signal. See [onPreviousMatch].
     */
    public fun emitPreviousMatch() {
        g_signal_emit_by_name(gPointer.reinterpret(), "previous-match")
    }

    /**
     * Emitted with a delay. The length of the delay can be
     * changed with the [property@Gtk.SearchEntry:search-delay]
     * property.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSearchChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "search-changed",
            onSearchChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "search-changed" signal. See [onSearchChanged].
     */
    public fun emitSearchChanged() {
        g_signal_emit_by_name(gPointer.reinterpret(), "search-changed")
    }

    /**
     * Emitted when the user initiated a search on the entry.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSearchStarted(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "search-started",
            onSearchStartedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "search-started" signal. See [onSearchStarted].
     */
    public fun emitSearchStarted() {
        g_signal_emit_by_name(gPointer.reinterpret(), "search-started")
    }

    /**
     * Emitted when the user stops a search via keyboard input.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * Applications should connect to it, to implement hiding
     * the search entry in this case.
     *
     * The default bindings for this signal is Escape.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onStopSearch(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "stop-search",
            onStopSearchFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "stop-search" signal. See [onStopSearch].
     */
    public fun emitStopSearch() {
        g_signal_emit_by_name(gPointer.reinterpret(), "stop-search")
    }

    public companion object : TypeCompanion<SearchEntry> {
        override val type: GeneratedClassKGType<SearchEntry> =
            GeneratedClassKGType(gtk_search_entry_get_type()) { SearchEntry(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of SearchEntry
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_search_entry_get_type()
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onNextMatchFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPreviousMatchFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onSearchChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onSearchStartedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onStopSearchFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
