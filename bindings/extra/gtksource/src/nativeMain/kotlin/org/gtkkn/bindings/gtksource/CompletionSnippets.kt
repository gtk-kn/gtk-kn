// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceCompletionProvider
import org.gtkkn.native.gtksource.GtkSourceCompletionSnippets
import org.gtkkn.native.gtksource.gtk_source_completion_snippets_get_type
import org.gtkkn.native.gtksource.gtk_source_completion_snippets_new

/**
 * A [iface@CompletionProvider] for the completion of snippets.
 *
 * The `GtkSourceCompletionSnippets` is an example of an implementation of
 * the [iface@CompletionProvider] interface. The proposals are snippets
 * registered with the [class@SnippetManager].
 *
 * ## Skipped during bindings generation
 *
 * - method `priority`: Property has no getter nor setter
 * - method `title`: Property has no getter nor setter
 */
public open class CompletionSnippets(
    public val gtksourceCompletionSnippetsPointer: CPointer<GtkSourceCompletionSnippets>,
) : Object(gtksourceCompletionSnippetsPointer.reinterpret()),
    CompletionProvider,
    KGTyped {
    init {
        GtkSource
    }

    override val gtksourceCompletionProviderPointer: CPointer<GtkSourceCompletionProvider>
        get() = handle.reinterpret()

    public constructor() : this(gtk_source_completion_snippets_new()!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<CompletionSnippets> {
        override val type: GeneratedClassKGType<CompletionSnippets> =
            GeneratedClassKGType(getTypeOrNull()!!) { CompletionSnippets(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of CompletionSnippets
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_completion_snippets_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_completion_snippets_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_completion_snippets_get_type")
    }
}
