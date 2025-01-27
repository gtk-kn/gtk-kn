// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    override val gtksourceCompletionProviderPointer: CPointer<GtkSourceCompletionProvider>
        get() = handle.reinterpret()

    public constructor() : this(gtk_source_completion_snippets_new()!!.reinterpret())

    public companion object : TypeCompanion<CompletionSnippets> {
        override val type: GeneratedClassKGType<CompletionSnippets> =
            GeneratedClassKGType(getTypeOrNull("gtk_source_completion_snippets_get_type")!!) {
                CompletionSnippets(it.reinterpret())
            }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of CompletionSnippets
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_completion_snippets_get_type()
    }
}
