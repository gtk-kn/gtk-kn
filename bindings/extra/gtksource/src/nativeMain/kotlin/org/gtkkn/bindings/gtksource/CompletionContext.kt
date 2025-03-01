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
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_6
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtksource.GtkSourceCompletionContext
import org.gtkkn.native.gtksource.GtkSourceCompletionProvider
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_activation
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_bounds
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_buffer
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_busy
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_completion
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_empty
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_language
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_proposals_for_provider
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_type
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_view
import org.gtkkn.native.gtksource.gtk_source_completion_context_get_word
import org.gtkkn.native.gtksource.gtk_source_completion_context_list_providers
import org.gtkkn.native.gtksource.gtk_source_completion_context_set_proposals_for_provider
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The context of a completion.
 *
 * `GtkSourceCompletionContext` contains information about an attept to display
 * completion proposals to the user based on typed text in the [class@View].
 *
 * When typing, [class@Completion] may use registered
 * [iface@CompletionProvider] to determine if there may be results which
 * could be displayed. If so, a `GtkSourceCompletionContext` is created with
 * information that is provided to the [iface@CompletionProvider] to populate
 * results which might be useful to the user.
 *
 * [iface@CompletionProvider] are expected to provide [iface@Gio.ListModel] with
 * [iface@CompletionProposal] which may be joined together in a list of
 * results for the user. They are also responsible for how the contents are
 * displayed using [class@CompletionCell] which allows for some level of
 * customization.
 */
public open class CompletionContext(
    public val gtksourceCompletionContextPointer: CPointer<GtkSourceCompletionContext>,
) : Object(gtksourceCompletionContextPointer.reinterpret()),
    ListModel,
    KGTyped {
    init {
        GtkSource
    }

    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    /**
     * The "busy" property is true while the completion context is
     * populating completion proposals.
     */
    public open val busy: Boolean
        /**
         * Gets the "busy" property. This is set to true while the completion
         * context is actively fetching proposals from registered
         * #GtkSourceCompletionProvider's.
         *
         * @return true if the context is busy
         */
        get() = gtk_source_completion_context_get_busy(gtksourceCompletionContextPointer).asBoolean()

    /**
     * The "completion" is the #GtkSourceCompletion that was used to create the context.
     */
    public open val completion: Completion?
        /**
         * Gets the #GtkSourceCompletion that created the context.
         *
         * @return an #GtkSourceCompletion or null
         */
        get() = gtk_source_completion_context_get_completion(gtksourceCompletionContextPointer)?.run {
            InstanceCache.get(this, true) { Completion(reinterpret()) }!!
        }

    /**
     * The "empty" property is true when there are no results.
     *
     * It will be notified when the first result is added or the last
     * result is removed.
     */
    public open val empty: Boolean
        /**
         * Checks if any proposals have been provided to the context.
         *
         * Out of convenience, this function will return true if @self is null.
         *
         * @return true if there are no proposals in the context
         */
        get() = gtk_source_completion_context_get_empty(gtksourceCompletionContextPointer).asBoolean()

    /**
     * Gets the mode for which the context was activated.
     */
    public open fun getActivation(): CompletionActivation =
        gtk_source_completion_context_get_activation(gtksourceCompletionContextPointer).run {
            CompletionActivation.fromNativeValue(this)
        }

    /**
     * Gets the bounds for the completion, which is the beginning of the
     * current word (taking break characters into account) to the current
     * insertion cursor.
     *
     * If @begin is non-null, it will be set to the start position of the
     * current word being completed.
     *
     * If @end is non-null, it will be set to the insertion cursor for the
     * current word being completed.
     *
     * @param begin a #GtkTextIter
     * @param end a #GtkTextIter
     * @return true if the marks are still valid and @begin or @end was set.
     */
    public open fun getBounds(begin: TextIter?, end: TextIter?): Boolean = gtk_source_completion_context_get_bounds(
        gtksourceCompletionContextPointer,
        begin?.gtkTextIterPointer,
        end?.gtkTextIterPointer
    ).asBoolean()

    /**
     * Gets the underlying buffer used by the context.
     *
     * This is a convenience function to get the buffer via the #GtkSourceCompletion
     * property.
     *
     * @return a #GtkTextBuffer or null
     */
    public open fun getBuffer(): Buffer? =
        gtk_source_completion_context_get_buffer(gtksourceCompletionContextPointer)?.run {
            InstanceCache.get(this, true) { Buffer(reinterpret()) }!!
        }

    /**
     * Gets the language of the underlying buffer, if any.
     *
     * @return a #GtkSourceLanguage or null
     */
    public open fun getLanguage(): Language? =
        gtk_source_completion_context_get_language(gtksourceCompletionContextPointer)?.run {
            InstanceCache.get(this, true) { Language(reinterpret()) }!!
        }

    /**
     * Gets the #GListModel associated with the provider.
     *
     * You can connect to #GtkSourceCompletionContext::model-changed to receive
     * notifications about when the model has been replaced by a new model.
     *
     * @param provider a #GtkSourceCompletionProvider
     * @return a #GListModel or null
     * @since 5.6
     */
    @GtkSourceVersion5_6
    public open fun getProposalsForProvider(provider: CompletionProvider): ListModel? =
        gtk_source_completion_context_get_proposals_for_provider(
            gtksourceCompletionContextPointer,
            provider.gtksourceCompletionProviderPointer
        )?.run {
            ListModel.ListModelImpl(reinterpret())
        }

    /**
     * Gets the text view for the context.
     *
     * @return a #GtkSourceView or null
     */
    public open fun getView(): View? = gtk_source_completion_context_get_view(gtksourceCompletionContextPointer)?.run {
        InstanceCache.get(this, true) { View(reinterpret()) }!!
    }

    /**
     * Gets the word that is being completed up to the position of the insert mark.
     *
     * @return a string containing the current word
     */
    public open fun getWord(): String =
        gtk_source_completion_context_get_word(gtksourceCompletionContextPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the providers that are associated with the context.
     *
     * @return a #GListModel of #GtkSourceCompletionProvider
     * @since 5.6
     */
    @GtkSourceVersion5_6
    public open fun listProviders(): ListModel =
        gtk_source_completion_context_list_providers(gtksourceCompletionContextPointer)!!.run {
            ListModel.ListModelImpl(reinterpret())
        }

    /**
     * This function allows providers to update their results for a context
     * outside of a call to [method@CompletionProvider.populate_async].
     *
     * This can be used to immediately return results for a provider while it does
     * additional asynchronous work. Doing so will allow the completions to
     * update while the operation is in progress.
     *
     * @param provider an #GtkSourceCompletionProvider
     * @param results a #GListModel or null
     */
    public open fun setProposalsForProvider(provider: CompletionProvider, results: ListModel? = null): Unit =
        gtk_source_completion_context_set_proposals_for_provider(
            gtksourceCompletionContextPointer,
            provider.gtksourceCompletionProviderPointer,
            results?.gioListModelPointer
        )

    /**
     * Emitted when a provider changes a model.
     *
     * This signal is primarily useful for #GtkSourceCompletionProvider's
     * that want to track other providers in context. For example, it can
     * be used to create a "top results" provider.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `provider` a #GtkSourceCompletionProvider; `model` a #GListModel
     * @since 5.6
     */
    @GtkSourceVersion5_6
    public fun onProviderModelChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (provider: CompletionProvider, model: ListModel?) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceCompletionContextPointer,
        "provider-model-changed",
        onProviderModelChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "provider-model-changed" signal. See [onProviderModelChanged].
     *
     * @param provider a #GtkSourceCompletionProvider
     * @param model a #GListModel
     * @since 5.6
     */
    @GtkSourceVersion5_6
    public fun emitProviderModelChanged(provider: CompletionProvider, model: ListModel?) {
        g_signal_emit_by_name(
            gtksourceCompletionContextPointer.reinterpret(),
            "provider-model-changed",
            provider.gtksourceCompletionProviderPointer,
            model?.gioListModelPointer
        )
    }

    public companion object : TypeCompanion<CompletionContext> {
        override val type: GeneratedClassKGType<CompletionContext> =
            GeneratedClassKGType(getTypeOrNull()!!) { CompletionContext(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of CompletionContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_completion_context_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_completion_context_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_completion_context_get_type")
    }
}

private val onProviderModelChangedFunc:
    CPointer<CFunction<(CPointer<GtkSourceCompletionProvider>, CPointer<GListModel>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            provider: CPointer<GtkSourceCompletionProvider>?,
            model: CPointer<GListModel>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(provider: CompletionProvider, model: ListModel?) -> Unit>().get().invoke(
            provider!!.run {
                CompletionProvider.CompletionProviderImpl(reinterpret())
            },
            model?.run {
                ListModel.ListModelImpl(reinterpret())
            }
        )
    }
        .reinterpret()
