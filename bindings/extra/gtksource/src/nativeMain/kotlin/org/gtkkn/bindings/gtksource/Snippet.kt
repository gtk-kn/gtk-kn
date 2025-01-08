// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtksource.GtkSource.resolveException
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceSnippet
import org.gtkkn.native.gtksource.gtk_source_snippet_add_chunk
import org.gtkkn.native.gtksource.gtk_source_snippet_copy
import org.gtkkn.native.gtksource.gtk_source_snippet_get_context
import org.gtkkn.native.gtksource.gtk_source_snippet_get_description
import org.gtkkn.native.gtksource.gtk_source_snippet_get_focus_position
import org.gtkkn.native.gtksource.gtk_source_snippet_get_language_id
import org.gtkkn.native.gtksource.gtk_source_snippet_get_n_chunks
import org.gtkkn.native.gtksource.gtk_source_snippet_get_name
import org.gtkkn.native.gtksource.gtk_source_snippet_get_nth_chunk
import org.gtkkn.native.gtksource.gtk_source_snippet_get_trigger
import org.gtkkn.native.gtksource.gtk_source_snippet_get_type
import org.gtkkn.native.gtksource.gtk_source_snippet_new
import org.gtkkn.native.gtksource.gtk_source_snippet_new_parsed
import org.gtkkn.native.gtksource.gtk_source_snippet_set_description
import org.gtkkn.native.gtksource.gtk_source_snippet_set_language_id
import org.gtkkn.native.gtksource.gtk_source_snippet_set_name
import org.gtkkn.native.gtksource.gtk_source_snippet_set_trigger
import kotlin.String
import kotlin.Throws
import kotlin.Unit

/**
 * Quick insertion code snippets.
 *
 * The `GtkSourceSnippet` represents a series of chunks that can quickly be
 * inserted into the [class@View].
 *
 * Snippets are defined in XML files which are loaded by the
 * [class@SnippetManager]. Alternatively, applications can create snippets
 * on demand and insert them into the [class@View] using
 * [method@View.push_snippet].
 *
 * Snippet chunks can reference other snippet chunks as well as post-process
 * the values from other chunks such as capitalization.
 *
 * ## Skipped during bindings generation
 *
 * - method `buffer`: Property has no getter nor setter
 * - method `trigger`: Property TypeInfo of getter and setter do not match
 */
public open class Snippet(pointer: CPointer<GtkSourceSnippet>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtksourceSnippetPointer: CPointer<GtkSourceSnippet>
        get() = gPointer.reinterpret()

    public open var description: String
        /**
         * Gets the description for the snippet.
         */
        get() = gtk_source_snippet_get_description(gtksourceSnippetPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the description for the snippet.
         *
         * @param description the snippet description
         */
        set(description) = gtk_source_snippet_set_description(gtksourceSnippetPointer, description)

    public open val focusPosition: gint
        /**
         * Gets the current focus for the snippet.
         *
         * This is changed as the user tabs through focus locations.
         *
         * @return The focus position, or -1 if unset.
         */
        get() = gtk_source_snippet_get_focus_position(gtksourceSnippetPointer)

    public open var languageId: String
        /**
         * Gets the language-id used for the source snippet.
         *
         * The language identifier should be one that matches a
         * source language [property@Language:id] property.
         *
         * @return the language identifier
         */
        get() = gtk_source_snippet_get_language_id(gtksourceSnippetPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the language identifier for the snippet.
         *
         * This should match the [property@Language:id] identifier.
         *
         * @param languageId the language identifier for the snippet
         */
        set(languageId) = gtk_source_snippet_set_language_id(gtksourceSnippetPointer, languageId)

    public open var name: String
        /**
         * Gets the name for the snippet.
         */
        get() = gtk_source_snippet_get_name(gtksourceSnippetPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the name for the snippet.
         *
         * @param name the snippet name
         */
        set(name) = gtk_source_snippet_set_name(gtksourceSnippetPointer, name)

    /**
     * Creates a new #GtkSourceSnippet
     *
     * @param trigger the trigger word
     * @param languageId the source language
     * @return A new #GtkSourceSnippet
     */
    public constructor(
        trigger: String? = null,
        languageId: String? = null,
    ) : this(gtk_source_snippet_new(trigger, languageId)!!.reinterpret())

    /**
     * Parses the snippet formatted @text into a series of chunks and adds them
     * to a new #GtkSourceSnippet.
     *
     * @param text the formatted snippet text to parse
     * @return the newly parsed #GtkSourceSnippet, or null upon
     *   failure and @error is set.
     * @since 5.6
     */
    @Throws(GLibException::class)
    public constructor(text: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gtk_source_snippet_new_parsed(text, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Appends @chunk to the @snippet.
     *
     * This may only be called before the snippet has been expanded.
     *
     * @param chunk a #GtkSourceSnippetChunk
     */
    public open fun addChunk(chunk: SnippetChunk): Unit =
        gtk_source_snippet_add_chunk(gtksourceSnippetPointer, chunk.gtksourceSnippetChunkPointer)

    /**
     * Does a deep copy of the snippet.
     *
     * @return A new #GtkSourceSnippet
     */
    public open fun copy(): Snippet = gtk_source_snippet_copy(gtksourceSnippetPointer)!!.run {
        Snippet(this)
    }

    /**
     * Gets the context used for expanding the snippet.
     *
     * @return an #GtkSourceSnippetContext
     */
    public open fun getContext(): SnippetContext? = gtk_source_snippet_get_context(gtksourceSnippetPointer)?.run {
        SnippetContext(this)
    }

    /**
     * Gets the number of chunks in the snippet.
     *
     * Note that not all chunks are editable.
     *
     * @return The number of chunks.
     */
    public open fun getNChunks(): guint = gtk_source_snippet_get_n_chunks(gtksourceSnippetPointer)

    /**
     * Gets the chunk at @nth.
     *
     * @param nth the nth chunk to get
     * @return an #GtkSourceSnippetChunk
     */
    public open fun getNthChunk(nth: guint): SnippetChunk =
        gtk_source_snippet_get_nth_chunk(gtksourceSnippetPointer, nth)!!.run {
            SnippetChunk(this)
        }

    /**
     * Gets the trigger for the source snippet.
     *
     * A trigger is a word that can be expanded into the full snippet when
     * the user presses Tab.
     *
     * @return A string or null
     */
    public open fun getTrigger(): String? = gtk_source_snippet_get_trigger(gtksourceSnippetPointer)?.toKString()

    /**
     * Sets the trigger for the snippet.
     *
     * @param trigger the trigger word
     */
    public open fun setTrigger(trigger: String): Unit = gtk_source_snippet_set_trigger(gtksourceSnippetPointer, trigger)

    public companion object : TypeCompanion<Snippet> {
        override val type: GeneratedClassKGType<Snippet> =
            GeneratedClassKGType(gtk_source_snippet_get_type()) { Snippet(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of Snippet
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_snippet_get_type()
    }
}
