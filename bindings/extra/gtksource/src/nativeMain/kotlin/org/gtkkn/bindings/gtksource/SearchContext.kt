// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.bindings.gtksource.GtkSource.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtksource.GtkSourceSearchContext
import org.gtkkn.native.gtksource.gtk_source_search_context_backward_async
import org.gtkkn.native.gtksource.gtk_source_search_context_forward_async
import org.gtkkn.native.gtksource.gtk_source_search_context_get_buffer
import org.gtkkn.native.gtksource.gtk_source_search_context_get_highlight
import org.gtkkn.native.gtksource.gtk_source_search_context_get_match_style
import org.gtkkn.native.gtksource.gtk_source_search_context_get_occurrence_position
import org.gtkkn.native.gtksource.gtk_source_search_context_get_occurrences_count
import org.gtkkn.native.gtksource.gtk_source_search_context_get_regex_error
import org.gtkkn.native.gtksource.gtk_source_search_context_get_settings
import org.gtkkn.native.gtksource.gtk_source_search_context_get_type
import org.gtkkn.native.gtksource.gtk_source_search_context_new
import org.gtkkn.native.gtksource.gtk_source_search_context_replace
import org.gtkkn.native.gtksource.gtk_source_search_context_replace_all
import org.gtkkn.native.gtksource.gtk_source_search_context_set_highlight
import org.gtkkn.native.gtksource.gtk_source_search_context_set_match_style
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * Search context.
 *
 * A `GtkSourceSearchContext` is used for the search and replace in a
 * [class@Buffer]. The search settings are represented by a
 * [class@SearchSettings] object. There can be a many-to-many relationship
 * between buffers and search settings, with the search contexts in-between: a
 * search settings object can be shared between several search contexts; and a
 * buffer can contain several search contexts at the same time.
 *
 * The total number of search occurrences can be retrieved with
 * [method@SearchContext.get_occurrences_count]. To know the position of a
 * certain match, use [method@SearchContext.get_occurrence_position].
 *
 * The buffer is scanned asynchronously, so it doesn't block the user interface.
 * For each search, the buffer is scanned at most once. After that, navigating
 * through the occurrences doesn't require to re-scan the buffer entirely.
 *
 * To search forward, use [method@SearchContext.forward] or
 * [method@SearchContext.forward_async] for the asynchronous version.
 * The backward search is done similarly. To replace a search match, or all
 * matches, use [method@SearchContext.replace] and
 * [method@SearchContext.replace_all].
 *
 * The search occurrences are highlighted by default. To disable it, use
 * [method@SearchContext.set_highlight]. You can enable the search
 * highlighting for several `GtkSourceSearchContext`s attached to the
 * same buffer. Moreover, each of those `GtkSourceSearchContext`s can
 * have a different text style associated. Use
 * [method@SearchContext.set_match_style] to specify the [class@Style]
 * to apply on search matches.
 *
 * Note that the [property@SearchContext:highlight] and
 * [property@SearchContext:match-style] properties are in the
 * `GtkSourceSearchContext` class, not [class@SearchSettings]. Appearance
 * settings should be tied to one, and only one buffer, as different buffers can
 * have different style scheme associated (a [class@SearchSettings] object
 * can be bound indirectly to several buffers).
 *
 * The concept of "current match" doesn't exist yet. A way to highlight
 * differently the current match is to select it.
 *
 * A search occurrence's position doesn't depend on the cursor position or other
 * parameters. Take for instance the buffer "aaaa" with the search text "aa".
 * The two occurrences are at positions [0:2] and [2:4]. If you begin to search
 * at position 1, you will get the occurrence [2:4], not [1:3]. This is a
 * prerequisite for regular expression searches. The pattern ".*" matches the
 * entire line. If the cursor is at the middle of the line, you don't want the
 * rest of the line as the occurrence, you want an entire line. (As a side note,
 * regular expression searches can also match multiple lines.)
 *
 * In the GtkSourceView source code, there is an example of how to use the
 * search and replace API: see the tests/test-search.c file. It is a mini
 * application for the search and replace, with a basic user interface.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `has_wrapped_around`: has_wrapped_around: Out parameter is not supported
 * - parameter `has_wrapped_around`: has_wrapped_around: Out parameter is not supported
 * - parameter `has_wrapped_around`: has_wrapped_around: Out parameter is not supported
 * - parameter `has_wrapped_around`: has_wrapped_around: Out parameter is not supported
 * - method `match-style`: Property TypeInfo of getter and setter do not match
 */
public open class SearchContext(pointer: CPointer<GtkSourceSearchContext>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtksourceSearchContextPointer: CPointer<GtkSourceSearchContext>
        get() = gPointer.reinterpret()

    /**
     * The [class@Buffer] associated to the search context.
     */
    public open val buffer: Buffer
        /**
         *
         *
         * @return the associated buffer.
         */
        get() = gtk_source_search_context_get_buffer(gtksourceSearchContextPointer.reinterpret())!!.run {
            Buffer(reinterpret())
        }

    /**
     * Highlight the search occurrences.
     */
    public open var highlight: Boolean
        /**
         *
         *
         * @return whether to highlight the search occurrences.
         */
        get() = gtk_source_search_context_get_highlight(gtksourceSearchContextPointer.reinterpret()).asBoolean()

        /**
         * Enables or disables the search occurrences highlighting.
         *
         * @param highlight the setting.
         */
        set(
            highlight
        ) = gtk_source_search_context_set_highlight(gtksourceSearchContextPointer.reinterpret(), highlight.asGBoolean())

    /**
     * The total number of search occurrences. If the search is disabled,
     * the value is 0. If the buffer is not already fully scanned, the value
     * is -1.
     */
    public open val occurrencesCount: gint
        /**
         * Gets the total number of search occurrences.
         *
         * If the buffer is not already fully scanned, the total number of occurrences is
         * unknown, and -1 is returned.
         *
         * @return the total number of search occurrences, or -1 if unknown.
         */
        get() = gtk_source_search_context_get_occurrences_count(gtksourceSearchContextPointer.reinterpret())

    /**
     * If the regex search pattern doesn't follow all the rules, this
     * #GError property will be set. If the pattern is valid, the value is
     * null.
     *
     * Free with [method@GLib.Error.free].
     */
    public open val regexError: Error?
        /**
         * Regular expression patterns must follow certain rules. If
         * [property@SearchSettings:search-text] breaks a rule, the error can be
         * retrieved with this function.
         *
         * The error domain is [error@GLib.RegexError].
         *
         * Free the return value with [method@GLib.Error.free].
         *
         * @return the #GError, or null if the
         *   pattern is valid.
         */
        get() = gtk_source_search_context_get_regex_error(gtksourceSearchContextPointer.reinterpret())?.run {
            Error(reinterpret())
        }

    /**
     * The [class@SearchSettings] associated to the search context.
     *
     * This property is construct-only since version 4.0.
     */
    public open val settings: SearchSettings
        /**
         *
         *
         * @return the search settings.
         */
        get() = gtk_source_search_context_get_settings(gtksourceSearchContextPointer.reinterpret())!!.run {
            SearchSettings(reinterpret())
        }

    /**
     * Creates a new search context, associated with @buffer, and customized with
     * @settings.
     *
     * If @settings is null, a new [class@SearchSettings] object will
     * be created, that you can retrieve with [method@SearchContext.get_settings].
     *
     * @param buffer a #GtkSourceBuffer.
     * @param settings a #GtkSourceSearchSettings, or null.
     * @return a new search context.
     */
    public constructor(
        buffer: Buffer,
        settings: SearchSettings? = null,
    ) : this(
        gtk_source_search_context_new(
            buffer.gtksourceBufferPointer.reinterpret(),
            settings?.gtksourceSearchSettingsPointer?.reinterpret()
        )!!.reinterpret()
    )

    /**
     * The asynchronous version of [method@SearchContext.backward].
     *
     * See the [iface@Gio.AsyncResult] documentation to know how to use this function.
     *
     * If the operation is cancelled, the @callback will only be called if
     * @cancellable was not null. The method takes
     * ownership of @cancellable, so you can unref it after calling this function.
     *
     * @param iter start of search.
     * @param cancellable a #GCancellable, or null.
     * @param callback a #GAsyncReadyCallback to call when the operation is finished.
     */
    public open fun backwardAsync(
        iter: TextIter,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = gtk_source_search_context_backward_async(
        gtksourceSearchContextPointer.reinterpret(),
        iter.gtkTextIterPointer.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * The asynchronous version of [method@SearchContext.forward].
     *
     * See the [iface@Gio.AsyncResult] documentation to know how to use this function.
     *
     * If the operation is cancelled, the @callback will only be called if
     * @cancellable was not null. The method takes
     * ownership of @cancellable, so you can unref it after calling this function.
     *
     * @param iter start of search.
     * @param cancellable a #GCancellable, or null.
     * @param callback a #GAsyncReadyCallback to call when the operation is finished.
     */
    public open fun forwardAsync(
        iter: TextIter,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = gtk_source_search_context_forward_async(
        gtksourceSearchContextPointer.reinterpret(),
        iter.gtkTextIterPointer.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     *
     *
     * @return the #GtkSourceStyle to apply on search matches.
     */
    public open fun getMatchStyle(): Style =
        gtk_source_search_context_get_match_style(gtksourceSearchContextPointer.reinterpret())!!.run {
            Style(reinterpret())
        }

    /**
     * Gets the position of a search occurrence.
     *
     * If the buffer is not already fully scanned, the position may be unknown,
     * and -1 is returned. If 0 is returned, it means that this part of the buffer
     * has already been scanned, and that @match_start and @match_end don't delimit an occurrence.
     *
     * @param matchStart the start of the occurrence.
     * @param matchEnd the end of the occurrence.
     * @return the position of the search occurrence. The first occurrence has the
     * position 1 (not 0). Returns 0 if @match_start and @match_end don't delimit
     * an occurrence. Returns -1 if the position is not yet known.
     */
    public open fun getOccurrencePosition(matchStart: TextIter, matchEnd: TextIter): gint =
        gtk_source_search_context_get_occurrence_position(
            gtksourceSearchContextPointer.reinterpret(),
            matchStart.gtkTextIterPointer.reinterpret(),
            matchEnd.gtkTextIterPointer.reinterpret()
        )

    /**
     * Replaces a search match by another text. If @match_start and @match_end
     * doesn't correspond to a search match, false is returned.
     *
     * @match_start and @match_end iters are revalidated to point to the replacement
     * text boundaries.
     *
     * For a regular expression replacement, you can check if @replace is valid by
     * calling [func@GLib.Regex.check_replacement]. The @replace text can contain
     * backreferences.
     *
     * @param matchStart the start of the match to replace.
     * @param matchEnd the end of the match to replace.
     * @param replace the replacement text.
     * @param replaceLength the length of @replace in bytes, or -1.
     * @return whether the match has been replaced.
     */
    public open fun replace(
        matchStart: TextIter,
        matchEnd: TextIter,
        replace: String,
        replaceLength: gint,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_source_search_context_replace(
            gtksourceSearchContextPointer.reinterpret(),
            matchStart.gtkTextIterPointer.reinterpret(),
            matchEnd.gtkTextIterPointer.reinterpret(),
            replace,
            replaceLength,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Replaces all search matches by another text.
     *
     * It is a synchronous function, so it can block the user interface.
     *
     * For a regular expression replacement, you can check if @replace is valid by
     * calling [func@GLib.Regex.check_replacement]. The @replace text can contain
     * backreferences.
     *
     * @param replace the replacement text.
     * @param replaceLength the length of @replace in bytes, or -1.
     * @return the number of replaced matches.
     */
    public open fun replaceAll(replace: String, replaceLength: gint): Result<guint> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            gtk_source_search_context_replace_all(
                gtksourceSearchContextPointer.reinterpret(),
                replace,
                replaceLength,
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Set the style to apply on search matches.
     *
     * If @match_style is null, default theme's scheme 'match-style' will be used.
     * To enable or disable the search highlighting, use [method@SearchContext.set_highlight].
     *
     * @param matchStyle a #GtkSourceStyle, or null.
     */
    public open fun setMatchStyle(matchStyle: Style? = null): Unit = gtk_source_search_context_set_match_style(
        gtksourceSearchContextPointer.reinterpret(),
        matchStyle?.gtksourceStylePointer?.reinterpret()
    )

    public companion object : TypeCompanion<SearchContext> {
        override val type: GeneratedClassKGType<SearchContext> =
            GeneratedClassKGType(gtk_source_search_context_get_type()) { SearchContext(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of SearchContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_search_context_get_type()
    }
}
