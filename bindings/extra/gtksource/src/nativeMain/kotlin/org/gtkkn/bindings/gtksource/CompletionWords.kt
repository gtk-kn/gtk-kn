// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.TextBuffer
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceCompletionProvider
import org.gtkkn.native.gtksource.GtkSourceCompletionWords
import org.gtkkn.native.gtksource.gtk_source_completion_words_get_type
import org.gtkkn.native.gtksource.gtk_source_completion_words_new
import org.gtkkn.native.gtksource.gtk_source_completion_words_register
import org.gtkkn.native.gtksource.gtk_source_completion_words_unregister
import kotlin.String
import kotlin.Unit

/**
 * A [iface@CompletionProvider] for the completion of words.
 *
 * The `GtkSourceCompletionWords` is an example of an implementation of
 * the [iface@CompletionProvider] interface. The proposals are words
 * appearing in the registered [class@Gtk.TextBuffer]s.
 *
 * ## Skipped during bindings generation
 *
 * - method `minimum-word-size`: Property has no getter nor setter
 * - method `priority`: Property has no getter nor setter
 * - method `proposals-batch-size`: Property has no getter nor setter
 * - method `scan-batch-size`: Property has no getter nor setter
 * - method `title`: Property has no getter nor setter
 */
public open class CompletionWords(public val gtksourceCompletionWordsPointer: CPointer<GtkSourceCompletionWords>) :
    Object(gtksourceCompletionWordsPointer.reinterpret()),
    CompletionProvider,
    KGTyped {
    override val gtksourceCompletionProviderPointer: CPointer<GtkSourceCompletionProvider>
        get() = handle.reinterpret()

    /**
     *
     *
     * @param title The title for the provider, or null.
     * @return a new #GtkSourceCompletionWords provider
     */
    public constructor(title: String? = null) : this(gtk_source_completion_words_new(title)!!.reinterpret())

    /**
     * Registers @buffer in the @words provider.
     *
     * @param buffer a #GtkTextBuffer
     */
    public open fun register(buffer: TextBuffer): Unit =
        gtk_source_completion_words_register(gtksourceCompletionWordsPointer, buffer.gtkTextBufferPointer)

    /**
     * Unregisters @buffer from the @words provider.
     *
     * @param buffer a #GtkTextBuffer
     */
    public open fun unregister(buffer: TextBuffer): Unit =
        gtk_source_completion_words_unregister(gtksourceCompletionWordsPointer, buffer.gtkTextBufferPointer)

    public companion object : TypeCompanion<CompletionWords> {
        override val type: GeneratedClassKGType<CompletionWords> =
            GeneratedClassKGType(gtk_source_completion_words_get_type()) { CompletionWords(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of CompletionWords
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_completion_words_get_type()
    }
}
