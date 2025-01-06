// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.bindings.gtksource.GtkSource.resolveException
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.gunichar
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceCompletionProvider
import org.gtkkn.native.gtksource.gtk_source_completion_provider_activate
import org.gtkkn.native.gtksource.gtk_source_completion_provider_display
import org.gtkkn.native.gtksource.gtk_source_completion_provider_get_priority
import org.gtkkn.native.gtksource.gtk_source_completion_provider_get_title
import org.gtkkn.native.gtksource.gtk_source_completion_provider_get_type
import org.gtkkn.native.gtksource.gtk_source_completion_provider_is_trigger
import org.gtkkn.native.gtksource.gtk_source_completion_provider_key_activates
import org.gtkkn.native.gtksource.gtk_source_completion_provider_populate_async
import org.gtkkn.native.gtksource.gtk_source_completion_provider_populate_finish
import org.gtkkn.native.gtksource.gtk_source_completion_provider_refilter
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * Completion provider interface.
 *
 * You must implement this interface to provide proposals to [class@Completion].
 *
 * In most cases, implementations of this interface will want to use
 * [vfunc@CompletionProvider.populate_async] to asynchronously populate the results
 * to avoid blocking the main loop.
 *
 * ## Skipped during bindings generation
 *
 * - method `list_alternates`: GLib.PtrArray parameter of type CompletionProposal is not supported
 */
public interface CompletionProvider :
    Interface,
    KGTyped {
    public val gtksourceCompletionProviderPointer: CPointer<GtkSourceCompletionProvider>

    /**
     * This function requests @proposal to be activated by the
     * #GtkSourceCompletionProvider.
     *
     * What the provider does to activate the proposal is specific to that
     * provider. Many providers may choose to insert a #GtkSourceSnippet with
     * edit points the user may cycle through.
     *
     * See also: [class@Snippet], [class@SnippetChunk], [method@View.push_snippet]
     *
     * @param context a #GtkSourceCompletionContext
     * @param proposal a #GtkSourceCompletionProposal
     */
    public fun activate(context: CompletionContext, proposal: CompletionProposal): Unit =
        gtk_source_completion_provider_activate(
            gtksourceCompletionProviderPointer.reinterpret(),
            context.gtksourceCompletionContextPointer.reinterpret(),
            proposal.gtksourceCompletionProposalPointer
        )

    /**
     * This function requests that the #GtkSourceCompletionProvider prepares
     * @cell to display the contents of @proposal.
     *
     * Based on @cells column type, you may want to display different information.
     *
     * This allows for columns of information among completion proposals
     * resulting in better alignment of similar content (icons, return types,
     * method names, and parameter lists).
     *
     * @param context a #GtkSourceCompletionContext
     * @param proposal a #GtkSourceCompletionProposal
     * @param cell a #GtkSourceCompletionCell
     */
    public fun display(context: CompletionContext, proposal: CompletionProposal, cell: CompletionCell): Unit =
        gtk_source_completion_provider_display(
            gtksourceCompletionProviderPointer.reinterpret(),
            context.gtksourceCompletionContextPointer.reinterpret(),
            proposal.gtksourceCompletionProposalPointer,
            cell.gtksourceCompletionCellPointer.reinterpret()
        )

    /**
     * This function should return the priority of @self in @context.
     *
     * The priority is used to sort groups of completion proposals by
     * provider so that higher priority providers results are shown
     * above lower priority providers.
     *
     * Higher value indicates higher priority.
     *
     * @param context a #GtkSourceCompletionContext
     */
    public fun getPriority(context: CompletionContext): gint = gtk_source_completion_provider_get_priority(
        gtksourceCompletionProviderPointer.reinterpret(),
        context.gtksourceCompletionContextPointer.reinterpret()
    )

    /**
     * Gets the title of the completion provider, if any.
     *
     * Currently, titles are not displayed in the completion results, but may be
     * at some point in the future when non-null.
     *
     * @return a title for the provider or null
     */
    public fun getTitle(): String? =
        gtk_source_completion_provider_get_title(gtksourceCompletionProviderPointer.reinterpret())?.toKString()

    /**
     * This function is used to determine if a character inserted into the text
     * editor should cause a new completion request to be triggered.
     *
     * An example would be period '.' which might indicate that the user wants
     * to complete method or field names of an object.
     *
     * This method will only trigger when text is inserted into the #GtkTextBuffer
     * while the completion list is visible and a proposal is selected. Incremental
     * key-presses (like shift, control, or alt) are not triggerable.
     *
     * @param iter a #GtkTextIter
     * @param ch a #gunichar of the character inserted
     */
    public fun isTrigger(iter: TextIter, ch: gunichar): Boolean = gtk_source_completion_provider_is_trigger(
        gtksourceCompletionProviderPointer.reinterpret(),
        iter.gPointer.reinterpret(),
        ch
    ).asBoolean()

    /**
     * This function is used to determine if a key typed by the user should
     * activate @proposal (resulting in committing the text to the editor).
     *
     * This is useful when using languages where convention may lead to less
     * typing by the user. One example may be the use of "." or "-" to expand
     * a field access in the C programming language.
     *
     * @param context a #GtkSourceCompletionContext
     * @param proposal a #GtkSourceCompletionProposal
     * @param keyval a keyval such as [const@Gdk.KEY_period]
     * @param state a #GdkModifierType or 0
     */
    public fun keyActivates(
        context: CompletionContext,
        proposal: CompletionProposal,
        keyval: guint,
        state: ModifierType,
    ): Boolean = gtk_source_completion_provider_key_activates(
        gtksourceCompletionProviderPointer.reinterpret(),
        context.gtksourceCompletionContextPointer.reinterpret(),
        proposal.gtksourceCompletionProposalPointer,
        keyval,
        state.mask
    ).asBoolean()

    /**
     * Asynchronously requests that the provider populates the completion
     * results for @context.
     *
     * For providers that would like to populate a [iface@Gio.ListModel] while those
     * results are displayed to the user,
     * [method@CompletionContext.set_proposals_for_provider] may be used
     * to reduce latency until the user sees results.
     *
     * @param context a #GtkSourceCompletionContext
     * @param cancellable a #GCancellable or null
     * @param callback a callback to execute upon completion
     */
    public fun populateAsync(
        context: CompletionContext,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_source_completion_provider_populate_async(
        gtksourceCompletionProviderPointer.reinterpret(),
        context.gtksourceCompletionContextPointer.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Completes an asynchronous operation to populate a completion provider.
     *
     * @param result a #GAsyncResult provided to callback
     * @return a #GListModel of #GtkSourceCompletionProposal
     */
    public fun populateFinish(result: AsyncResult): Result<ListModel> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_source_completion_provider_populate_finish(
            gtksourceCompletionProviderPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            ListModel.wrap(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * This function can be used to filter results previously provided to
     * the [class@CompletionContext] by the #GtkSourceCompletionProvider.
     *
     * This can happen as the user types additional text onto the word so
     * that previously matched items may be removed from the list instead of
     * generating new [iface@Gio.ListModel] of results.
     *
     * @param context a #GtkSourceCompletionContext
     * @param model a #GListModel
     */
    public fun refilter(context: CompletionContext, model: ListModel): Unit = gtk_source_completion_provider_refilter(
        gtksourceCompletionProviderPointer.reinterpret(),
        context.gtksourceCompletionContextPointer.reinterpret(),
        model.gioListModelPointer
    )

    private data class Wrapper(private val pointer: CPointer<GtkSourceCompletionProvider>) : CompletionProvider {
        override val gtksourceCompletionProviderPointer: CPointer<GtkSourceCompletionProvider> =
            pointer
    }

    public companion object : TypeCompanion<CompletionProvider> {
        override val type: GeneratedInterfaceKGType<CompletionProvider> =
            GeneratedInterfaceKGType(gtk_source_completion_provider_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkSourceCompletionProvider>): CompletionProvider = Wrapper(pointer)

        /**
         * Get the GType of CompletionProvider
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_completion_provider_get_type()
    }
}
