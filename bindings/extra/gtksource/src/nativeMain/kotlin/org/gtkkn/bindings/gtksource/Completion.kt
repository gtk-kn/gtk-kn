// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.AttrList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtksource.GtkSourceCompletion
import org.gtkkn.native.gtksource.GtkSourceCompletionProvider
import org.gtkkn.native.gtksource.gtk_source_completion_add_provider
import org.gtkkn.native.gtksource.gtk_source_completion_block_interactive
import org.gtkkn.native.gtksource.gtk_source_completion_fuzzy_highlight
import org.gtkkn.native.gtksource.gtk_source_completion_get_buffer
import org.gtkkn.native.gtksource.gtk_source_completion_get_page_size
import org.gtkkn.native.gtksource.gtk_source_completion_get_type
import org.gtkkn.native.gtksource.gtk_source_completion_get_view
import org.gtkkn.native.gtksource.gtk_source_completion_hide
import org.gtkkn.native.gtksource.gtk_source_completion_remove_provider
import org.gtkkn.native.gtksource.gtk_source_completion_set_page_size
import org.gtkkn.native.gtksource.gtk_source_completion_show
import org.gtkkn.native.gtksource.gtk_source_completion_unblock_interactive
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Main Completion Object.
 *
 * The completion system helps the user when they writes some text,
 * such as words, command names, functions, and suchlike. Proposals can
 * be shown, to complete the text the user is writing. Each proposal can
 * contain an additional piece of information (for example
 * documentation), that is displayed when the "Details" button is
 * clicked.
 *
 * Proposals are created via a [iface@CompletionProvider]. There can
 * be for example a provider to complete words (see [class@CompletionWords]),
 * another provider for the completion of
 * function names, etc. To add a provider, call
 * [method@Completion.add_provider].
 *
 * The [iface@CompletionProposal] interface represents a proposal.
 *
 * If a proposal contains extra information (see
 * %GTK_SOURCE_COMPLETION_COLUMN_DETAILS), it will be
 * displayed in a supplemental details window, which appears when
 * the "Details" button is clicked.
 *
 * Each [class@View] object is associated with a [class@Completion]
 * instance. This instance can be obtained with
 * [method@View.get_completion]. The [class@View] class contains also the
 * [signal@View::show-completion] signal.
 *
 * A same [iface@CompletionProvider] object can be used for several
 * `GtkSourceCompletion`'s.
 *
 * ## Skipped during bindings generation
 *
 * - method `remember-info-visibility`: Property has no getter nor setter
 * - method `select-on-show`: Property has no getter nor setter
 * - method `show-icons`: Property has no getter nor setter
 * - parameter `priority`: priority: Out parameter is not supported
 */
public open class Completion(pointer: CPointer<GtkSourceCompletion>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtksourceCompletionPointer: CPointer<GtkSourceCompletion>
        get() = gPointer.reinterpret()

    /**
     * The #GtkTextBuffer for the #GtkSourceCompletion:view.
     * This is a convenience property for providers.
     */
    public open val buffer: Buffer
        /**
         * Gets the connected [class@View]'s [class@Buffer]
         *
         * @return A #GtkSourceBuffer
         */
        get() = gtk_source_completion_get_buffer(gtksourceCompletionPointer.reinterpret())!!.run {
            Buffer(reinterpret())
        }

    /**
     * The number of rows to display to the user before scrolling.
     */
    public open var pageSize: guint
        get() = gtk_source_completion_get_page_size(gtksourceCompletionPointer.reinterpret())
        set(pageSize) = gtk_source_completion_set_page_size(gtksourceCompletionPointer.reinterpret(), pageSize)

    /**
     * The "view" property is the #GtkTextView for which this #GtkSourceCompletion
     * is providing completion features.
     */
    public open val view: View
        /**
         * Gets the [class@View] that owns the [class@Completion].
         *
         * @return A #GtkSourceView
         */
        get() = gtk_source_completion_get_view(gtksourceCompletionPointer.reinterpret())!!.run {
            View(reinterpret())
        }

    /**
     * Adds a [iface@CompletionProvider] to the list of providers to be queried
     * for completion results.
     *
     * @param provider a #GtkSourceCompletionProvider
     */
    public open fun addProvider(provider: CompletionProvider): Unit = gtk_source_completion_add_provider(
        gtksourceCompletionPointer.reinterpret(),
        provider.gtksourceCompletionProviderPointer
    )

    public open fun blockInteractive(): Unit =
        gtk_source_completion_block_interactive(gtksourceCompletionPointer.reinterpret())

    /**
     * Emits the "hide" signal.
     *
     * When the "hide" signal is emitted, the completion window will be
     * dismissed.
     */
    public open fun hide(): Unit = gtk_source_completion_hide(gtksourceCompletionPointer.reinterpret())

    /**
     * Removes a [iface@CompletionProvider] previously added with
     * [method@Completion.add_provider].
     *
     * @param provider a #GtkSourceCompletionProvider
     */
    public open fun removeProvider(provider: CompletionProvider): Unit = gtk_source_completion_remove_provider(
        gtksourceCompletionPointer.reinterpret(),
        provider.gtksourceCompletionProviderPointer
    )

    /**
     * Emits the "show" signal.
     *
     * When the "show" signal is emitted, the completion window will be
     * displayed if there are any results available.
     */
    public open fun show(): Unit = gtk_source_completion_show(gtksourceCompletionPointer.reinterpret())

    public open fun unblockInteractive(): Unit =
        gtk_source_completion_unblock_interactive(gtksourceCompletionPointer.reinterpret())

    /**
     * The "hide" signal is emitted when the completion window should
     * be hidden.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectHide(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "hide",
            connectHideFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "provided-added" signal is emitted when a new provider is
     * added to the completion.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `provider` a #GtkSourceCompletionProvider
     */
    public fun connectProviderAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (provider: CompletionProvider) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "provider-added",
        connectProviderAddedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The "provided-removed" signal is emitted when a provider has
     * been removed from the completion.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `provider` a #GtkSourceCompletionProvider
     */
    public fun connectProviderRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (provider: CompletionProvider) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "provider-removed",
        connectProviderRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The "show" signal is emitted when the completion window should
     * be shown.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectShow(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "show",
            connectShowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Completion> {
        override val type: GeneratedClassKGType<Completion> =
            GeneratedClassKGType(gtk_source_completion_get_type()) { Completion(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * This will add `<b>` tags around matched characters in @haystack
         * based on @casefold_query.
         *
         * @param haystack the string to be highlighted
         * @param casefoldQuery the typed-text used to highlight @haystack
         * @return a #PangoAttrList or null
         */
        public fun fuzzyHighlight(haystack: String, casefoldQuery: String): AttrList? =
            gtk_source_completion_fuzzy_highlight(haystack, casefoldQuery)?.run {
                AttrList(reinterpret())
            }

        /**
         * Get the GType of Completion
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_completion_get_type()
    }
}

private val connectHideFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectProviderAddedFunc:
    CPointer<CFunction<(CPointer<GtkSourceCompletionProvider>) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            provider: CPointer<GtkSourceCompletionProvider>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(provider: CompletionProvider) -> Unit>().get().invoke(
            provider!!.run {
                CompletionProvider.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectProviderRemovedFunc:
    CPointer<CFunction<(CPointer<GtkSourceCompletionProvider>) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            provider: CPointer<GtkSourceCompletionProvider>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(provider: CompletionProvider) -> Unit>().get().invoke(
            provider!!.run {
                CompletionProvider.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectShowFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
