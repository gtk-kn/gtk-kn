// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitFindController
import org.gtkkn.native.webkit.webkit_find_controller_count_matches
import org.gtkkn.native.webkit.webkit_find_controller_get_max_match_count
import org.gtkkn.native.webkit.webkit_find_controller_get_options
import org.gtkkn.native.webkit.webkit_find_controller_get_search_text
import org.gtkkn.native.webkit.webkit_find_controller_get_type
import org.gtkkn.native.webkit.webkit_find_controller_get_web_view
import org.gtkkn.native.webkit.webkit_find_controller_search
import org.gtkkn.native.webkit.webkit_find_controller_search_finish
import org.gtkkn.native.webkit.webkit_find_controller_search_next
import org.gtkkn.native.webkit.webkit_find_controller_search_previous
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Controls text search in a #WebKitWebView.
 *
 * A #WebKitFindController is used to search text in a #WebKitWebView. You
 * can get a #WebKitWebView<!-- -->'s #WebKitFindController with
 * webkit_web_view_get_find_controller(), and later use it to search
 * for text using webkit_find_controller_search(), or get the
 * number of matches using webkit_find_controller_count_matches(). The
 * operations are asynchronous and trigger signals when ready, such as
 * #WebKitFindController::found-text,
 * #WebKitFindController::failed-to-find-text or
 * #WebKitFindController::counted-matches<!-- -->.
 *
 * ## Skipped during bindings generation
 *
 * - method `text`: Property has no getter nor setter
 */
public class FindController(pointer: CPointer<WebKitFindController>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitFindControllerPointer: CPointer<WebKitFindController>
        get() = gPointer.reinterpret()

    /**
     * The maximum number of matches to report for a given search.
     */
    public val maxMatchCount: guint
        /**
         * Gets the maximum number of matches to report.
         *
         * Gets the maximum number of matches to report during a text
         * lookup. This number is passed as the last argument of
         * webkit_find_controller_search() or
         * webkit_find_controller_count_matches().
         *
         * @return the maximum number of matches to report.
         */
        get() = webkit_find_controller_get_max_match_count(webkitFindControllerPointer)

    /**
     * The options to be used in the search operation.
     */
    public val options: guint
        /**
         * Gets the #WebKitFindOptions for the current search.
         *
         * Gets a bitmask containing the #WebKitFindOptions associated with
         * the current search.
         *
         * @return a bitmask containing the #WebKitFindOptions associated
         * with the current search.
         */
        get() = webkit_find_controller_get_options(webkitFindControllerPointer)

    /**
     * The #WebKitWebView this controller is associated to.
     */
    public val webView: WebView
        /**
         * Gets the #WebKitWebView this find controller is associated to.
         *
         * Do
         * not dereference the returned instance as it belongs to the
         * #WebKitFindController.
         *
         * @return the #WebKitWebView.
         */
        get() = webkit_find_controller_get_web_view(webkitFindControllerPointer)!!.run {
            WebView(this)
        }

    /**
     * Counts the number of matches for @search_text.
     *
     * Counts the number of matches for @search_text found in the
     * #WebKitWebView with the provided @find_options. The number of
     * matches will be provided by the
     * #WebKitFindController::counted-matches signal.
     *
     * @param searchText the text to look for
     * @param findOptions a bitmask with the #WebKitFindOptions used in the search
     * @param maxMatchCount the maximum number of matches allowed in the search
     */
    public fun countMatches(searchText: String, findOptions: guint, maxMatchCount: guint): Unit =
        webkit_find_controller_count_matches(webkitFindControllerPointer, searchText, findOptions, maxMatchCount)

    /**
     * Gets the text that @find_controller is searching for.
     *
     * Gets the text that @find_controller is currently searching
     * for. This text is passed to either
     * webkit_find_controller_search() or
     * webkit_find_controller_count_matches().
     *
     * @return the text to look for in the #WebKitWebView.
     */
    public fun getSearchText(): String =
        webkit_find_controller_get_search_text(webkitFindControllerPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Looks for @search_text associated with @find_controller.
     *
     * Looks for @search_text in the #WebKitWebView associated with
     * @find_controller since the beginning of the document highlighting
     * up to @max_match_count matches. The outcome of the search will be
     * asynchronously provided by the #WebKitFindController::found-text
     * and #WebKitFindController::failed-to-find-text signals.
     *
     * To look for the next or previous occurrences of the same text
     * with the same find options use webkit_find_controller_search_next()
     * and/or webkit_find_controller_search_previous(). The
     * #WebKitFindController will use the same text and options for the
     * following searches unless they are modified by another call to this
     * method.
     *
     * Note that if the number of matches is higher than @max_match_count
     * then #WebKitFindController::found-text will report %G_MAXUINT matches
     * instead of the actual number.
     *
     * Callers should call webkit_find_controller_search_finish() to
     * finish the current search operation.
     *
     * @param searchText the text to look for
     * @param findOptions a bitmask with the #WebKitFindOptions used in the search
     * @param maxMatchCount the maximum number of matches allowed in the search
     */
    public fun search(searchText: String, findOptions: guint, maxMatchCount: guint): Unit =
        webkit_find_controller_search(webkitFindControllerPointer, searchText, findOptions, maxMatchCount)

    /**
     * Finishes a find operation.
     *
     * Finishes a find operation started by
     * webkit_find_controller_search(). It will basically unhighlight
     * every text match found.
     *
     * This method will be typically called when the search UI is
     * closed/hidden by the client application.
     */
    public fun searchFinish(): Unit = webkit_find_controller_search_finish(webkitFindControllerPointer)

    /**
     * Looks for the next occurrence of the search text.
     *
     * Calling this method before webkit_find_controller_search() or
     * webkit_find_controller_count_matches() is a programming error.
     */
    public fun searchNext(): Unit = webkit_find_controller_search_next(webkitFindControllerPointer)

    /**
     * Looks for the previous occurrence of the search text.
     *
     * Calling this method before webkit_find_controller_search() or
     * webkit_find_controller_count_matches() is a programming error.
     */
    public fun searchPrevious(): Unit = webkit_find_controller_search_previous(webkitFindControllerPointer)

    /**
     * This signal is emitted when the #WebKitFindController has
     * counted the number of matches for a given text after a call
     * to webkit_find_controller_count_matches().
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `matchCount` the number of matches of the search text
     */
    public fun onCountedMatches(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (matchCount: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "counted-matches",
        onCountedMatchesFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "counted-matches" signal. See [onCountedMatches].
     *
     * @param matchCount the number of matches of the search text
     */
    public fun emitCountedMatches(matchCount: guint) {
        g_signal_emit_by_name(gPointer.reinterpret(), "counted-matches", matchCount)
    }

    /**
     * This signal is emitted when a search operation does not find
     * any result for the given text. It will be issued if the text
     * is not found asynchronously after a call to
     * webkit_find_controller_search(), webkit_find_controller_search_next()
     * or webkit_find_controller_search_previous().
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onFailedToFindText(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "failed-to-find-text",
            onFailedToFindTextFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "failed-to-find-text" signal. See [onFailedToFindText].
     */
    public fun emitFailedToFindText() {
        g_signal_emit_by_name(gPointer.reinterpret(), "failed-to-find-text")
    }

    /**
     * This signal is emitted when a given text is found in the web
     * page text. It will be issued if the text is found
     * asynchronously after a call to webkit_find_controller_search(),
     * webkit_find_controller_search_next() or
     * webkit_find_controller_search_previous().
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `matchCount` the number of matches found of the search text
     */
    public fun onFoundText(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (matchCount: guint) -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "found-text",
            onFoundTextFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "found-text" signal. See [onFoundText].
     *
     * @param matchCount the number of matches found of the search text
     */
    public fun emitFoundText(matchCount: guint) {
        g_signal_emit_by_name(gPointer.reinterpret(), "found-text", matchCount)
    }

    public companion object : TypeCompanion<FindController> {
        override val type: GeneratedClassKGType<FindController> =
            GeneratedClassKGType(webkit_find_controller_get_type()) { FindController(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of FindController
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_find_controller_get_type()
    }
}

private val onCountedMatchesFunc: CPointer<CFunction<(guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        matchCount: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(matchCount: guint) -> Unit>().get().invoke(matchCount)
}
    .reinterpret()

private val onFailedToFindTextFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onFoundTextFunc: CPointer<CFunction<(guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        matchCount: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(matchCount: guint) -> Unit>().get().invoke(matchCount)
}
    .reinterpret()
