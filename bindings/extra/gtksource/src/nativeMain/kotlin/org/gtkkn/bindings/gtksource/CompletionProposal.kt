// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_6
import org.gtkkn.extensions.glib.Interface
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
    Interface,
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

    private data class Wrapper(private val pointer: CPointer<GtkSourceCompletionProposal>) : CompletionProposal {
        override val gtksourceCompletionProposalPointer: CPointer<GtkSourceCompletionProposal> =
            pointer
    }

    public companion object : TypeCompanion<CompletionProposal> {
        override val type: GeneratedInterfaceKGType<CompletionProposal> =
            GeneratedInterfaceKGType(gtk_source_completion_proposal_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkSourceCompletionProposal>): CompletionProposal = Wrapper(pointer)

        /**
         * Get the GType of CompletionProposal
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_completion_proposal_get_type()
    }
}
