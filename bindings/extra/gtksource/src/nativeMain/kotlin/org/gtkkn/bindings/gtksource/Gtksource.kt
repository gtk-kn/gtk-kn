// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.SList
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.gtksource.gtk_source_check_version
import org.gtkkn.native.gtksource.gtk_source_encoding_get_all
import org.gtkkn.native.gtksource.gtk_source_encoding_get_current
import org.gtkkn.native.gtksource.gtk_source_encoding_get_default_candidates
import org.gtkkn.native.gtksource.gtk_source_encoding_get_from_charset
import org.gtkkn.native.gtksource.gtk_source_encoding_get_utf8
import org.gtkkn.native.gtksource.gtk_source_file_loader_error_quark
import org.gtkkn.native.gtksource.gtk_source_file_saver_error_quark
import org.gtkkn.native.gtksource.gtk_source_finalize
import org.gtkkn.native.gtksource.gtk_source_get_major_version
import org.gtkkn.native.gtksource.gtk_source_get_micro_version
import org.gtkkn.native.gtksource.gtk_source_get_minor_version
import org.gtkkn.native.gtksource.gtk_source_init
import org.gtkkn.native.gtksource.gtk_source_scheduler_add
import org.gtkkn.native.gtksource.gtk_source_scheduler_add_full
import org.gtkkn.native.gtksource.gtk_source_scheduler_remove
import org.gtkkn.native.gtksource.gtk_source_utils_escape_search_text
import org.gtkkn.native.gtksource.gtk_source_utils_unescape_search_text
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - record `BufferClass`: glib type struct are ignored
 * - record `CompletionCellClass`: glib type struct are ignored
 * - record `CompletionClass`: glib type struct are ignored
 * - record `CompletionContextClass`: glib type struct are ignored
 * - record `CompletionProposalInterface`: glib type struct are ignored
 * - record `CompletionProviderInterface`: glib type struct are ignored
 * - record `CompletionSnippetsClass`: glib type struct are ignored
 * - record `CompletionWordsClass`: glib type struct are ignored
 * - record `FileClass`: glib type struct are ignored
 * - record `FileLoaderClass`: glib type struct are ignored
 * - record `FileSaverClass`: glib type struct are ignored
 * - record `GutterClass`: glib type struct are ignored
 * - record `GutterLinesClass`: glib type struct are ignored
 * - record `GutterRendererClass`: glib type struct are ignored
 * - record `GutterRendererPixbufClass`: glib type struct are ignored
 * - record `GutterRendererTextClass`: glib type struct are ignored
 * - record `HoverClass`: glib type struct are ignored
 * - record `HoverContextClass`: glib type struct are ignored
 * - record `HoverDisplayClass`: glib type struct are ignored
 * - record `HoverProviderInterface`: glib type struct are ignored
 * - record `IndenterInterface`: glib type struct are ignored
 * - record `LanguageClass`: glib type struct are ignored
 * - record `LanguageManagerClass`: glib type struct are ignored
 * - record `MapClass`: glib type struct are ignored
 * - record `MarkAttributesClass`: glib type struct are ignored
 * - record `MarkClass`: glib type struct are ignored
 * - record `PrintCompositorClass`: glib type struct are ignored
 * - record `RegionClass`: glib type struct are ignored
 * - record `SearchContextClass`: glib type struct are ignored
 * - record `SearchSettingsClass`: glib type struct are ignored
 * - record `SnippetChunkClass`: glib type struct are ignored
 * - record `SnippetClass`: glib type struct are ignored
 * - record `SnippetContextClass`: glib type struct are ignored
 * - record `SnippetManagerClass`: glib type struct are ignored
 * - record `SpaceDrawerClass`: glib type struct are ignored
 * - record `StyleClass`: glib type struct are ignored
 * - record `StyleSchemeChooserButtonClass`: glib type struct are ignored
 * - record `StyleSchemeChooserInterface`: glib type struct are ignored
 * - record `StyleSchemeChooserWidgetClass`: glib type struct are ignored
 * - record `StyleSchemeClass`: glib type struct are ignored
 * - record `StyleSchemeManagerClass`: glib type struct are ignored
 * - record `StyleSchemePreviewClass`: glib type struct are ignored
 * - record `TagClass`: glib type struct are ignored
 * - record `ViewClass`: glib type struct are ignored
 * - record `VimIMContextClass`: glib type struct are ignored
 */
public object Gtksource {
    /**
     * Like gtk_source_get_major_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MAJOR_VERSION: Int = 5

    /**
     * Like gtk_source_get_micro_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MICRO_VERSION: Int = 0

    /**
     * Like gtk_source_get_minor_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MINOR_VERSION: Int = 12

    /**
     * Like GTK_SOURCE_CHECK_VERSION, but the check for gtk_source_check_version is
     * at runtime instead of compile time. This is useful for compiling
     * against older versions of GtkSourceView, but using features from newer
     * versions.
     *
     * @param major the major version to check
     * @param minor the minor version to check
     * @param micro the micro version to check
     * @return true if the version of the GtkSourceView currently loaded
     * is the same as or newer than the passed-in version.
     */
    public fun checkVersion(
        major: UInt,
        minor: UInt,
        micro: UInt,
    ): Boolean = gtk_source_check_version(major, minor, micro).asBoolean()

    /**
     * Gets all encodings.
     *
     * @return a list of
     * all #GtkSourceEncoding's. Free with g_slist_free().
     */
    public fun encodingGetAll(): SList =
        gtk_source_encoding_get_all()!!.run {
            SList(reinterpret())
        }

    /**
     * Gets the #GtkSourceEncoding for the current locale.
     *
     * See also [func@GLib.get_charset].
     *
     * @return the current locale encoding.
     */
    public fun encodingGetCurrent(): Encoding =
        gtk_source_encoding_get_current()!!.run {
            Encoding(reinterpret())
        }

    /**
     * Gets the list of default candidate encodings to try when loading a file.
     *
     * See [method@FileLoader.set_candidate_encodings].
     *
     * This function returns a different list depending on the current locale (i.e.
     * language, country and default encoding). The UTF-8 encoding and the current
     * locale encoding are guaranteed to be present in the returned list.
     *
     * @return the list of
     * default candidate encodings. Free with g_slist_free().
     */
    public fun encodingGetDefaultCandidates(): SList =
        gtk_source_encoding_get_default_candidates()!!.run {
            SList(reinterpret())
        }

    /**
     * Gets a #GtkSourceEncoding from a character set such as "UTF-8" or
     * "ISO-8859-1".
     *
     * @param charset a character set.
     * @return the corresponding #GtkSourceEncoding, or null
     * if not found.
     */
    public fun encodingGetFromCharset(charset: String): Encoding? =
        gtk_source_encoding_get_from_charset(charset)?.run {
            Encoding(reinterpret())
        }

    /**
     *
     *
     * @return the UTF-8 encoding.
     */
    public fun encodingGetUtf8(): Encoding =
        gtk_source_encoding_get_utf8()!!.run {
            Encoding(reinterpret())
        }

    public fun fileLoaderErrorQuark(): UInt = gtk_source_file_loader_error_quark()

    public fun fileSaverErrorQuark(): UInt = gtk_source_file_saver_error_quark()

    /**
     * Free the resources allocated by GtkSourceView. For example it unrefs the
     * singleton objects.
     *
     * It is not mandatory to call this function, it's just to be friendlier to
     * memory debugging tools. This function is meant to be called at the end of
     * main(). It can be called several times.
     */
    public fun finalize(): Unit = gtk_source_finalize()

    /**
     * Returns the major version number of the GtkSourceView library.
     * (e.g. in GtkSourceView version 3.20.0 this is 3.)
     *
     * This function is in the library, so it represents the GtkSourceView library
     * your code is running against. Contrast with the #GTK_SOURCE_MAJOR_VERSION
     * macro, which represents the major version of the GtkSourceView headers you
     * have included when compiling your code.
     *
     * @return the major version number of the GtkSourceView library
     */
    public fun getMajorVersion(): UInt = gtk_source_get_major_version()

    /**
     * Returns the micro version number of the GtkSourceView library.
     * (e.g. in GtkSourceView version 3.20.0 this is 0.)
     *
     * This function is in the library, so it represents the GtkSourceView library
     * your code is running against. Contrast with the #GTK_SOURCE_MICRO_VERSION
     * macro, which represents the micro version of the GtkSourceView headers you
     * have included when compiling your code.
     *
     * @return the micro version number of the GtkSourceView library
     */
    public fun getMicroVersion(): UInt = gtk_source_get_micro_version()

    /**
     * Returns the minor version number of the GtkSourceView library.
     * (e.g. in GtkSourceView version 3.20.0 this is 20.)
     *
     * This function is in the library, so it represents the GtkSourceView library
     * your code is running against. Contrast with the #GTK_SOURCE_MINOR_VERSION
     * macro, which represents the minor version of the GtkSourceView headers you
     * have included when compiling your code.
     *
     * @return the minor version number of the GtkSourceView library
     */
    public fun getMinorVersion(): UInt = gtk_source_get_minor_version()

    /**
     * Initializes the GtkSourceView library (e.g. for the internationalization).
     *
     * This function can be called several times, but is meant to be called at the
     * beginning of main(), before any other GtkSourceView function call.
     */
    public fun `init`(): Unit = gtk_source_init()

    /**
     * Simplified version of [func@scheduler_add_full].
     *
     * @param callback the callback to execute
     * @since 5.2
     */
    public fun schedulerAdd(callback: SchedulerCallback): ULong =
        gtk_source_scheduler_add(
            SchedulerCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Adds a new callback that will be executed as time permits on the main thread.
     *
     * This is useful when you need to do a lot of background work but want to do
     * it incrementally.
     *
     * @callback will be provided a deadline that it should complete it's work by
     * (or near) and can be checked using [func@GLib.get_monotonic_time] for comparison.
     *
     * Use [func@scheduler_remove] to remove the handler.
     *
     * @param callback the callback to execute
     * @since 5.2
     */
    public fun schedulerAddFull(callback: SchedulerCallback): ULong =
        gtk_source_scheduler_add_full(
            SchedulerCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Removes a scheduler callback previously registered with
     * [func@scheduler_add] or [func@scheduler_add_full].
     *
     * @param handlerId the handler id
     * @since 5.2
     */
    public fun schedulerRemove(handlerId: ULong): Unit = gtk_source_scheduler_remove(handlerId)

    /**
     * Use this function to escape the following characters: `\n`, `\r`, `\t` and `\`.
     *
     * For a regular expression search, use g_regex_escape_string() instead.
     *
     * One possible use case is to take the #GtkTextBuffer's selection and put it in a
     * search entry. The selection can contain tabulations, newlines, etc. So it's
     * better to escape those special characters to better fit in the search entry.
     *
     * See also: [func@utils_unescape_search_text].
     *
     * <warning>
     * Warning: the escape and unescape functions are not reciprocal! For example,
     * escape (unescape (\)) = \\. So avoid cycles such as: search entry -> unescape
     * -> search settings -> escape -> search entry. The original search entry text
     * may be modified.
     * </warning>
     *
     * @param text the text to escape.
     * @return the escaped @text.
     */
    public fun utilsEscapeSearchText(text: String): String =
        gtk_source_utils_escape_search_text(text)?.toKString()
            ?: error("Expected not null string")

    /**
     * Use this function before [method@SearchSettings.set_search_text], to
     * unescape the following sequences of characters: `\n`, `\r`, `\t` and `\\`.
     * The purpose is to easily write those characters in a search entry.
     *
     * Note that unescaping the search text is not needed for regular expression
     * searches.
     *
     * See also: [func@utils_escape_search_text].
     *
     * @param text the text to unescape.
     * @return the unescaped @text.
     */
    public fun utilsUnescapeSearchText(text: String): String =
        gtk_source_utils_unescape_search_text(text)?.toKString()
            ?: error("Expected not null string")

    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                FileLoaderError.quark() ->
                    FileLoaderError.fromErrorOrNull(error)
                        ?.let {
                            FileLoaderErrorException(error, it)
                        }
                FileSaverError.quark() ->
                    FileSaverError.fromErrorOrNull(error)
                        ?.let {
                            FileSaverErrorException(error, it)
                        }
                else -> null
            }
        return ex ?: GlibException(error)
    }
}

public val SchedulerCallbackFunc: CPointer<CFunction<(Long) -> Int>> =
    staticCFunction {
            deadline: Long,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(deadline: Long) -> Boolean>().get().invoke(deadline).asGBoolean()
    }
        .reinterpret()

/**
 * This function is called incrementally to process additional background work.
 * A deadline is provided which can be checked using [func@GLib.get_monotonic_time] so
 * that additional work can be processed each frame.
 *
 * This is useful for situations where you are incrementally performing
 * background work such as spell checking or semantic syntax highlighting.
 *
 * - param `deadline` the time the callback should complete by
 * - return true if there is more work to process, otherwise false and the
 *   handler is unregistered.
 */
public typealias SchedulerCallback = (deadline: Long) -> Boolean
