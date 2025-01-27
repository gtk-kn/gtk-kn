// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_6
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceCompletionProposal
import org.gtkkn.native.gtksource.gtk_source_completion_proposal_get_type
import org.gtkkn.native.gtksource.gtk_source_completion_proposal_get_typed_text
import kotlin.String

/**
 * Interface for completion proposals.
 *
 * This interface is used to denote that an object is capable of being
 * a completion proposal for [class@Completion].
 *
 * Currently, no method or functions are required but additional methods
 * may be added in the future. Proposals created by
 * #GtkSourceCompletionProvider can use [func@GObject.IMPLEMENT_INTERFACE] to
 * implement this with null for the interface init function.
 */
public interface CompletionProposal :
    Proxy,
    KGTyped {
    public val gtksourceCompletionProposalPointer: CPointer<GtkSourceCompletionProposal>

    /**
     * Gets the typed-text for the proposal, if supported by the implementation.
     *
     * Implementing this virtual-function is optional, but can be useful to allow
     * external tooling to compare results.
     *
     * @return a newly allocated string, or null
     * @since 5.6
     */
    @GtkSourceVersion5_6
    public fun getTypedText(): String? =
        gtk_source_completion_proposal_get_typed_text(gtksourceCompletionProposalPointer)?.toKString()

    /**
     * The CompletionProposalImpl type represents a native instance of the CompletionProposal interface.
     *
     * @constructor Creates a new instance of CompletionProposal for the provided [CPointer].
     */
    public data class CompletionProposalImpl(
        override val gtksourceCompletionProposalPointer: CPointer<GtkSourceCompletionProposal>,
    ) : Object(gtksourceCompletionProposalPointer.reinterpret()),
        CompletionProposal

    public companion object : TypeCompanion<CompletionProposal> {
        override val type: GeneratedInterfaceKGType<CompletionProposal> =
            GeneratedInterfaceKGType(getTypeOrNull("gtk_source_completion_proposal_get_type")!!) {
                CompletionProposalImpl(it.reinterpret())
            }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of CompletionProposal
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_completion_proposal_get_type()
    }
}
