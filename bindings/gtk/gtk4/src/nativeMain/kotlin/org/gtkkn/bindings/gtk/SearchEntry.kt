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
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
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
import kotlin.UInt
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
public open class SearchEntry(
    pointer: CPointer<GtkSearchEntry>,
) : Widget(pointer.reinterpret()), Editable, KGTyped {
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
    public open var inputHints: InputHints
        /**
         * Gets the input purpose for @entry.
         *
         * @return The input hints
         * @since 4.14
         */
        get() =
            gtk_search_entry_get_input_hints(gtkSearchEntryPointer.reinterpret()).run {
                InputHints(this)
            }

        /**
         * Sets the input hints for @entry.
         *
         * @param hints the new input hints
         * @since 4.14
         */
        set(hints) =
            gtk_search_entry_set_input_hints(
                gtkSearchEntryPointer.reinterpret(),
                hints.mask
            )

    /**
     * The purpose for the `GtkSearchEntry` input used to alter the
     * behaviour of input methods.
     *
     * @since 4.14
     */
    public open var inputPurpose: InputPurpose
        /**
         * Gets the input purpose of @entry.
         *
         * @return The input hints
         * @since 4.14
         */
        get() =
            gtk_search_entry_get_input_purpose(gtkSearchEntryPointer.reinterpret()).run {
                InputPurpose.fromNativeValue(this)
            }

        /**
         * Sets the input purpose of @entry.
         *
         * @param purpose the new input purpose
         * @since 4.14
         */
        set(purpose) =
            gtk_search_entry_set_input_purpose(
                gtkSearchEntryPointer.reinterpret(),
                purpose.nativeValue
            )

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
        get() =
            gtk_search_entry_get_placeholder_text(gtkSearchEntryPointer.reinterpret())?.toKString()

        /**
         * Sets the placeholder text associated with @entry.
         *
         * @param text the text to set as a placeholder
         * @since 4.10
         */
        set(text) = gtk_search_entry_set_placeholder_text(gtkSearchEntryPointer.reinterpret(), text)

    /**
     * The delay in milliseconds from last keypress to the search
     * changed signal.
     *
     * @since 4.8
     */
    public open var searchDelay: UInt
        /**
         * Get the delay to be used between the last keypress and the
         * [signal@Gtk.SearchEntry::search-changed] signal being emitted.
         *
         * @return a delay in milliseconds.
         * @since 4.8
         */
        get() = gtk_search_entry_get_search_delay(gtkSearchEntryPointer.reinterpret())

        /**
         * Set the delay to be used between the last keypress and the
         * [signal@Gtk.SearchEntry::search-changed] signal being emitted.
         *
         * @param delay a delay in milliseconds
         * @since 4.8
         */
        set(delay) = gtk_search_entry_set_search_delay(gtkSearchEntryPointer.reinterpret(), delay)

    /**
     * Creates a `GtkSearchEntry`.
     *
     * @return a new `GtkSearchEntry`
     */
    public constructor() : this(gtk_search_entry_new()!!.reinterpret())

    /**
     * Gets the input purpose for @entry.
     *
     * @return The input hints
     * @since 4.14
     */
    public open fun getInputHints(): InputHints =
        gtk_search_entry_get_input_hints(gtkSearchEntryPointer.reinterpret()).run {
            InputHints(this)
        }

    /**
     * Gets the input purpose of @entry.
     *
     * @return The input hints
     * @since 4.14
     */
    public open fun getInputPurpose(): InputPurpose =
        gtk_search_entry_get_input_purpose(gtkSearchEntryPointer.reinterpret()).run {
            InputPurpose.fromNativeValue(this)
        }

    /**
     * Gets the widget that @entry is capturing key events from.
     *
     * @return The key capture widget.
     */
    public open fun getKeyCaptureWidget(): Widget? =
        gtk_search_entry_get_key_capture_widget(gtkSearchEntryPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the placeholder text associated with @entry.
     *
     * @return The placeholder text.
     * @since 4.10
     */
    public open fun getPlaceholderText(): String? =
        gtk_search_entry_get_placeholder_text(gtkSearchEntryPointer.reinterpret())?.toKString()

    /**
     * Get the delay to be used between the last keypress and the
     * [signal@Gtk.SearchEntry::search-changed] signal being emitted.
     *
     * @return a delay in milliseconds.
     * @since 4.8
     */
    public open fun getSearchDelay(): UInt = gtk_search_entry_get_search_delay(gtkSearchEntryPointer.reinterpret())

    /**
     * Sets the input hints for @entry.
     *
     * @param hints the new input hints
     * @since 4.14
     */
    public open fun setInputHints(hints: InputHints): Unit =
        gtk_search_entry_set_input_hints(gtkSearchEntryPointer.reinterpret(), hints.mask)

    /**
     * Sets the input purpose of @entry.
     *
     * @param purpose the new input purpose
     * @since 4.14
     */
    public open fun setInputPurpose(purpose: InputPurpose): Unit =
        gtk_search_entry_set_input_purpose(
            gtkSearchEntryPointer.reinterpret(),
            purpose.nativeValue
        )

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
        gtk_search_entry_set_key_capture_widget(
            gtkSearchEntryPointer.reinterpret(),
            widget?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the placeholder text associated with @entry.
     *
     * @param text the text to set as a placeholder
     * @since 4.10
     */
    public open fun setPlaceholderText(text: String? = null): Unit =
        gtk_search_entry_set_placeholder_text(gtkSearchEntryPointer.reinterpret(), text)

    /**
     * Set the delay to be used between the last keypress and the
     * [signal@Gtk.SearchEntry::search-changed] signal being emitted.
     *
     * @param delay a delay in milliseconds
     * @since 4.8
     */
    public open fun setSearchDelay(delay: UInt): Unit =
        gtk_search_entry_set_search_delay(gtkSearchEntryPointer.reinterpret(), delay)

    /**
     * Emitted when the entry is activated.
     *
     * The keybindings for this signal are all forms of the Enter key.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate",
            connectActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectNextMatch(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "next-match",
            connectNextMatchFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectPreviousMatch(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "previous-match",
            connectPreviousMatchFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted with a delay. The length of the delay can be
     * changed with the [property@Gtk.SearchEntry:search-delay]
     * property.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSearchChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "search-changed",
            connectSearchChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user initiated a search on the entry.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSearchStarted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "search-started",
            connectSearchStartedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectStopSearch(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "stop-search",
            connectStopSearchFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<SearchEntry> {
        override val type: GeneratedClassKGType<SearchEntry> =
            GeneratedClassKGType(gtk_search_entry_get_type()) { SearchEntry(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectActivateFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectNextMatchFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectPreviousMatchFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectSearchChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectSearchStartedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectStopSearchFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
