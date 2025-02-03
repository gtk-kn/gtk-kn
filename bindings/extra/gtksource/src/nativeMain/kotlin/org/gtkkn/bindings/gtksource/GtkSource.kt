// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.MountOperation
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_2
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.TypeCache
import org.gtkkn.native.gio.GMountOperation
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gtksource.GtkSourceFile
import org.gtkkn.native.gtksource.gtk_source_check_version
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
import kotlin.String
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
public object GtkSource {
    init {
        registerTypes()
    }

    /**
     * Like gtk_source_get_major_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MAJOR_VERSION: gint = 5

    /**
     * Like gtk_source_get_micro_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MICRO_VERSION: gint = 0

    /**
     * Like gtk_source_get_minor_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MINOR_VERSION: gint = 12

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
    public fun checkVersion(major: guint, minor: guint, micro: guint): Boolean =
        gtk_source_check_version(major, minor, micro).asBoolean()

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
    public fun getMajorVersion(): guint = gtk_source_get_major_version()

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
    public fun getMicroVersion(): guint = gtk_source_get_micro_version()

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
    public fun getMinorVersion(): guint = gtk_source_get_minor_version()

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
    @GtkSourceVersion5_2
    public fun schedulerAdd(callback: SchedulerCallback): gsize =
        gtk_source_scheduler_add(SchedulerCallbackFunc.reinterpret(), StableRef.create(callback).asCPointer())

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
    @GtkSourceVersion5_2
    public fun schedulerAddFull(callback: SchedulerCallback): gsize = gtk_source_scheduler_add_full(
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
    @GtkSourceVersion5_2
    public fun schedulerRemove(handlerId: gsize): Unit = gtk_source_scheduler_remove(handlerId)

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
        gtk_source_utils_escape_search_text(text)?.toKString() ?: error("Expected not null string")

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
        gtk_source_utils_unescape_search_text(text)?.toKString() ?: error("Expected not null string")

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            FileLoaderError.quark() -> FileLoaderError.fromErrorOrNull(error)
                ?.let {
                    FileLoaderErrorException(error, it)
                }
            FileSaverError.quark() -> FileSaverError.fromErrorOrNull(error)
                ?.let {
                    FileSaverErrorException(error, it)
                }
            else -> null
        }
        return ex ?: GLibException(error)
    }

    private fun registerTypes() {
        Buffer.getTypeOrNull()?.let { gtype -> TypeCache.register(Buffer::class, gtype) { Buffer(it.reinterpret()) } }
        Completion.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Completion::class, gtype) { Completion(it.reinterpret()) }
        }
        CompletionCell.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CompletionCell::class, gtype) { CompletionCell(it.reinterpret()) }
        }
        CompletionContext.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CompletionContext::class, gtype) { CompletionContext(it.reinterpret()) }
        }
        CompletionSnippets.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CompletionSnippets::class, gtype) { CompletionSnippets(it.reinterpret()) }
        }
        CompletionWords.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CompletionWords::class, gtype) { CompletionWords(it.reinterpret()) }
        }
        File.getTypeOrNull()?.let { gtype -> TypeCache.register(File::class, gtype) { File(it.reinterpret()) } }
        FileLoader.getTypeOrNull()?.let { gtype ->
            TypeCache.register(FileLoader::class, gtype) { FileLoader(it.reinterpret()) }
        }
        FileSaver.getTypeOrNull()?.let { gtype ->
            TypeCache.register(FileSaver::class, gtype) { FileSaver(it.reinterpret()) }
        }
        Gutter.getTypeOrNull()?.let { gtype -> TypeCache.register(Gutter::class, gtype) { Gutter(it.reinterpret()) } }
        GutterLines.getTypeOrNull()?.let { gtype ->
            TypeCache.register(GutterLines::class, gtype) { GutterLines(it.reinterpret()) }
        }
        GutterRenderer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(GutterRenderer::class, gtype) { GutterRenderer.GutterRendererImpl(it.reinterpret()) }
        }
        GutterRendererPixbuf.getTypeOrNull()?.let { gtype ->
            TypeCache.register(GutterRendererPixbuf::class, gtype) { GutterRendererPixbuf(it.reinterpret()) }
        }
        GutterRendererText.getTypeOrNull()?.let { gtype ->
            TypeCache.register(GutterRendererText::class, gtype) { GutterRendererText(it.reinterpret()) }
        }
        Hover.getTypeOrNull()?.let { gtype -> TypeCache.register(Hover::class, gtype) { Hover(it.reinterpret()) } }
        HoverContext.getTypeOrNull()?.let { gtype ->
            TypeCache.register(HoverContext::class, gtype) { HoverContext(it.reinterpret()) }
        }
        HoverDisplay.getTypeOrNull()?.let { gtype ->
            TypeCache.register(HoverDisplay::class, gtype) { HoverDisplay(it.reinterpret()) }
        }
        Language.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Language::class, gtype) { Language(it.reinterpret()) }
        }
        LanguageManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(LanguageManager::class, gtype) { LanguageManager(it.reinterpret()) }
        }
        Map.getTypeOrNull()?.let { gtype -> TypeCache.register(Map::class, gtype) { Map(it.reinterpret()) } }
        Mark.getTypeOrNull()?.let { gtype -> TypeCache.register(Mark::class, gtype) { Mark(it.reinterpret()) } }
        MarkAttributes.getTypeOrNull()?.let { gtype ->
            TypeCache.register(MarkAttributes::class, gtype) { MarkAttributes(it.reinterpret()) }
        }
        PrintCompositor.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PrintCompositor::class, gtype) { PrintCompositor(it.reinterpret()) }
        }
        Region.getTypeOrNull()?.let { gtype -> TypeCache.register(Region::class, gtype) { Region(it.reinterpret()) } }
        SearchContext.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SearchContext::class, gtype) { SearchContext(it.reinterpret()) }
        }
        SearchSettings.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SearchSettings::class, gtype) { SearchSettings(it.reinterpret()) }
        }
        Snippet.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Snippet::class, gtype) { Snippet(it.reinterpret()) }
        }
        SnippetChunk.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SnippetChunk::class, gtype) { SnippetChunk(it.reinterpret()) }
        }
        SnippetContext.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SnippetContext::class, gtype) { SnippetContext(it.reinterpret()) }
        }
        SnippetManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SnippetManager::class, gtype) { SnippetManager(it.reinterpret()) }
        }
        SpaceDrawer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SpaceDrawer::class, gtype) { SpaceDrawer(it.reinterpret()) }
        }
        Style.getTypeOrNull()?.let { gtype -> TypeCache.register(Style::class, gtype) { Style(it.reinterpret()) } }
        StyleScheme.getTypeOrNull()?.let { gtype ->
            TypeCache.register(StyleScheme::class, gtype) { StyleScheme(it.reinterpret()) }
        }
        StyleSchemeChooserButton.getTypeOrNull()?.let { gtype ->
            TypeCache.register(StyleSchemeChooserButton::class, gtype) { StyleSchemeChooserButton(it.reinterpret()) }
        }
        StyleSchemeChooserWidget.getTypeOrNull()?.let { gtype ->
            TypeCache.register(StyleSchemeChooserWidget::class, gtype) { StyleSchemeChooserWidget(it.reinterpret()) }
        }
        StyleSchemeManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(StyleSchemeManager::class, gtype) { StyleSchemeManager(it.reinterpret()) }
        }
        StyleSchemePreview.getTypeOrNull()?.let { gtype ->
            TypeCache.register(StyleSchemePreview::class, gtype) { StyleSchemePreview(it.reinterpret()) }
        }
        Tag.getTypeOrNull()?.let { gtype -> TypeCache.register(Tag::class, gtype) { Tag(it.reinterpret()) } }
        View.getTypeOrNull()?.let { gtype -> TypeCache.register(View::class, gtype) { View(it.reinterpret()) } }
        VimImContext.getTypeOrNull()?.let { gtype ->
            TypeCache.register(VimImContext::class, gtype) { VimImContext(it.reinterpret()) }
        }
        CompletionProposal.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CompletionProposal::class, gtype) {
                CompletionProposal.CompletionProposalImpl(it.reinterpret())
            }
        }
        CompletionProvider.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CompletionProvider::class, gtype) {
                CompletionProvider.CompletionProviderImpl(it.reinterpret())
            }
        }
        HoverProvider.getTypeOrNull()?.let { gtype ->
            TypeCache.register(HoverProvider::class, gtype) { HoverProvider.HoverProviderImpl(it.reinterpret()) }
        }
        Indenter.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Indenter::class, gtype) { Indenter.IndenterImpl(it.reinterpret()) }
        }
        StyleSchemeChooser.getTypeOrNull()?.let { gtype ->
            TypeCache.register(StyleSchemeChooser::class, gtype) {
                StyleSchemeChooser.StyleSchemeChooserImpl(it.reinterpret())
            }
        }
    }
}

public val MountOperationFactoryFunc:
    CPointer<CFunction<(CPointer<GtkSourceFile>, gpointer?) -> CPointer<GMountOperation>>> =
    staticCFunction {
            `file`: CPointer<GtkSourceFile>?,
            userdata: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`file`: File, userdata: gpointer?) -> MountOperation>().get().invoke(
            `file`!!.run {
                InstanceCache.get(this, false) { File(reinterpret()) }!!
            },
            userdata
        ).gioMountOperationPointer
    }
        .reinterpret()

public val SchedulerCallbackFunc: CPointer<CFunction<(gint64) -> gboolean>> = staticCFunction {
        deadline: gint64,
        userData: gpointer?,
    ->
    userData!!.asStableRef<(deadline: gint64) -> Boolean>().get().invoke(deadline).asGBoolean()
}
    .reinterpret()

/**
 * Type definition for a function that will be called to create a
 * [class@Gio.MountOperation]. This is useful for creating a [class@Gtk.MountOperation].
 *
 * - param `file` a #GtkSourceFile.
 * - param `userdata` user data
 */
public typealias MountOperationFactory = (`file`: File, userdata: gpointer?) -> MountOperation

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
public typealias SchedulerCallback = (deadline: gint64) -> Boolean
