// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceSnippetChunk
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_copy
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_get_context
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_get_focus_position
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_get_spec
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_get_text
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_get_text_set
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_get_tooltip_text
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_get_type
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_new
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_set_context
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_set_focus_position
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_set_spec
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_set_text
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_set_text_set
import org.gtkkn.native.gtksource.gtk_source_snippet_chunk_set_tooltip_text
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A chunk of text within the source snippet.
 *
 * The `GtkSourceSnippetChunk` represents a single chunk of text that
 * may or may not be an edit point within the snippet. Chunks that are
 * an edit point (also called a tab stop) have the
 * [property@SnippetChunk:focus-position] property set.
 *
 * ## Skipped during bindings generation
 *
 * - method `spec`: Property TypeInfo of getter and setter do not match
 */
public open class SnippetChunk(public val gtksourceSnippetChunkPointer: CPointer<GtkSourceSnippetChunk>) :
    InitiallyUnowned(gtksourceSnippetChunkPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    public open var context: SnippetContext
        /**
         * Gets the context for the snippet insertion.
         *
         * @return A #GtkSourceSnippetContext
         */
        get() = gtk_source_snippet_chunk_get_context(gtksourceSnippetChunkPointer)!!.run {
            InstanceCache.get(this, true) { SnippetContext(reinterpret()) }!!
        }
        set(
            context
        ) = gtk_source_snippet_chunk_set_context(gtksourceSnippetChunkPointer, context.gtksourceSnippetContextPointer)

    public open var focusPosition: gint
        /**
         * Gets the [property@SnippetChunk:focus-position].
         *
         * The focus-position is used to determine how many tabs it takes for the
         * snippet to advanced to this chunk.
         *
         * A focus-position of zero will be the last focus position of the snippet
         * and snippet editing ends when it has been reached.
         *
         * A focus-position of -1 means the chunk cannot be focused by the user.
         *
         * @return the focus-position
         */
        get() = gtk_source_snippet_chunk_get_focus_position(gtksourceSnippetChunkPointer)

        /**
         * Sets the [property@SnippetChunk:focus-position] property.
         *
         * The focus-position is used to determine how many tabs it takes for the
         * snippet to advanced to this chunk.
         *
         * A focus-position of zero will be the last focus position of the snippet
         * and snippet editing ends when it has been reached.
         *
         * A focus-position of -1 means the chunk cannot be focused by the user.
         *
         * @param focusPosition the focus-position
         */
        set(focusPosition) = gtk_source_snippet_chunk_set_focus_position(gtksourceSnippetChunkPointer, focusPosition)

    public open var text: String
        /**
         * Gets the [property@SnippetChunk:text] property.
         *
         * The text property is updated when the user edits the text of the chunk.
         * If it has not been edited, the [property@SnippetChunk:spec] property is
         * returned.
         *
         * @return the text of the chunk
         */
        get() = gtk_source_snippet_chunk_get_text(gtksourceSnippetChunkPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the text for the snippet chunk.
         *
         * This is usually used by the snippet engine to update the text, but may
         * be useful when creating custom snippets to avoid expansion of any
         * specification.
         *
         * @param text the text of the property
         */
        set(text) = gtk_source_snippet_chunk_set_text(gtksourceSnippetChunkPointer, text)

    public open var textSet: Boolean
        /**
         * Gets the [property@SnippetChunk:text-set] property.
         *
         * This is typically set when the user has edited a snippet chunk.
         */
        get() = gtk_source_snippet_chunk_get_text_set(gtksourceSnippetChunkPointer).asBoolean()

        /**
         * Sets the [property@SnippetChunk:text-set] property.
         *
         * This is typically set when the user has edited a snippet chunk by the
         * snippet engine.
         *
         * @param textSet the property value
         */
        set(textSet) = gtk_source_snippet_chunk_set_text_set(gtksourceSnippetChunkPointer, textSet.asGBoolean())

    public open var tooltipText: String
        get() = gtk_source_snippet_chunk_get_tooltip_text(gtksourceSnippetChunkPointer)?.toKString()
            ?: error("Expected not null string")
        set(tooltipText) = gtk_source_snippet_chunk_set_tooltip_text(gtksourceSnippetChunkPointer, tooltipText)

    /**
     * Create a new `GtkSourceSnippetChunk` that can be added to
     * a [class@Snippet].
     */
    public constructor() : this(gtk_source_snippet_chunk_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * Copies the source snippet.
     *
     * @return A #GtkSourceSnippetChunk
     */
    public open fun copy(): SnippetChunk = gtk_source_snippet_chunk_copy(gtksourceSnippetChunkPointer)!!.run {
        InstanceCache.get(this, true) { SnippetChunk(reinterpret()) }!!
    }

    /**
     * Gets the specification for the chunk.
     *
     * The specification is evaluated for variables when other chunks are edited
     * within the snippet context. If the user has changed the text, the
     * [property@SnippetChunk:text] and [property@SnippetChunk:text-set] properties
     * are updated.
     *
     * @return the specification, if any
     */
    public open fun getSpec(): String? = gtk_source_snippet_chunk_get_spec(gtksourceSnippetChunkPointer)?.toKString()

    /**
     * Sets the specification for the chunk.
     *
     * The specification is evaluated for variables when other chunks are edited
     * within the snippet context. If the user has changed the text, the
     * [property@SnippetChunk:text and] [property@SnippetChunk:text-set] properties
     * are updated.
     *
     * @param spec the new specification for the chunk
     */
    public open fun setSpec(spec: String): Unit = gtk_source_snippet_chunk_set_spec(gtksourceSnippetChunkPointer, spec)

    public companion object : TypeCompanion<SnippetChunk> {
        override val type: GeneratedClassKGType<SnippetChunk> =
            GeneratedClassKGType(getTypeOrNull()!!) { SnippetChunk(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of SnippetChunk
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_snippet_chunk_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_snippet_chunk_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_snippet_chunk_get_type")
    }
}
