// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTextTag
import org.gtkkn.native.gtk.gtk_text_tag_changed
import org.gtkkn.native.gtk.gtk_text_tag_get_priority
import org.gtkkn.native.gtk.gtk_text_tag_get_type
import org.gtkkn.native.gtk.gtk_text_tag_new
import org.gtkkn.native.gtk.gtk_text_tag_set_priority
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A tag that can be applied to text contained in a `GtkTextBuffer`.
 *
 * You may wish to begin by reading the
 * [text widget conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 *
 * Tags should be in the [class@Gtk.TextTagTable] for a given
 * `GtkTextBuffer` before using them with that buffer.
 *
 * [method@Gtk.TextBuffer.create_tag] is the best way to create tags.
 * See “gtk4-demo” for numerous examples.
 *
 * For each property of `GtkTextTag`, there is a “set” property, e.g.
 * “font-set” corresponds to “font”. These “set” properties reflect
 * whether a property has been set or not.
 *
 * They are maintained by GTK and you should not set them independently.
 *
 * ## Skipped during bindings generation
 *
 * - method `accumulative-margin`: Property has no getter nor setter
 * - method `allow-breaks`: Property has no getter nor setter
 * - method `allow-breaks-set`: Property has no getter nor setter
 * - method `background`: Property has no getter nor setter
 * - method `background-full-height`: Property has no getter nor setter
 * - method `background-full-height-set`: Property has no getter nor setter
 * - method `background-rgba`: Property has no getter nor setter
 * - method `background-set`: Property has no getter nor setter
 * - method `direction`: Property has no getter nor setter
 * - method `editable`: Property has no getter nor setter
 * - method `editable-set`: Property has no getter nor setter
 * - method `fallback`: Property has no getter nor setter
 * - method `fallback-set`: Property has no getter nor setter
 * - method `family`: Property has no getter nor setter
 * - method `family-set`: Property has no getter nor setter
 * - method `font`: Property has no getter nor setter
 * - method `font-desc`: Property has no getter nor setter
 * - method `font-features`: Property has no getter nor setter
 * - method `font-features-set`: Property has no getter nor setter
 * - method `foreground`: Property has no getter nor setter
 * - method `foreground-rgba`: Property has no getter nor setter
 * - method `foreground-set`: Property has no getter nor setter
 * - method `indent`: Property has no getter nor setter
 * - method `indent-set`: Property has no getter nor setter
 * - method `insert-hyphens`: Property has no getter nor setter
 * - method `insert-hyphens-set`: Property has no getter nor setter
 * - method `invisible`: Property has no getter nor setter
 * - method `invisible-set`: Property has no getter nor setter
 * - method `justification`: Property has no getter nor setter
 * - method `justification-set`: Property has no getter nor setter
 * - method `language`: Property has no getter nor setter
 * - method `language-set`: Property has no getter nor setter
 * - method `left-margin`: Property has no getter nor setter
 * - method `left-margin-set`: Property has no getter nor setter
 * - method `letter-spacing`: Property has no getter nor setter
 * - method `letter-spacing-set`: Property has no getter nor setter
 * - method `line-height`: Property has no getter nor setter
 * - method `line-height-set`: Property has no getter nor setter
 * - method `name`: Property has no getter nor setter
 * - method `overline`: Property has no getter nor setter
 * - method `overline-rgba`: Property has no getter nor setter
 * - method `overline-rgba-set`: Property has no getter nor setter
 * - method `overline-set`: Property has no getter nor setter
 * - method `paragraph-background`: Property has no getter nor setter
 * - method `paragraph-background-rgba`: Property has no getter nor setter
 * - method `paragraph-background-set`: Property has no getter nor setter
 * - method `pixels-above-lines`: Property has no getter nor setter
 * - method `pixels-above-lines-set`: Property has no getter nor setter
 * - method `pixels-below-lines`: Property has no getter nor setter
 * - method `pixels-below-lines-set`: Property has no getter nor setter
 * - method `pixels-inside-wrap`: Property has no getter nor setter
 * - method `pixels-inside-wrap-set`: Property has no getter nor setter
 * - method `right-margin`: Property has no getter nor setter
 * - method `right-margin-set`: Property has no getter nor setter
 * - method `rise`: Property has no getter nor setter
 * - method `rise-set`: Property has no getter nor setter
 * - method `scale`: Property has no getter nor setter
 * - method `scale-set`: Property has no getter nor setter
 * - method `sentence`: Property has no getter nor setter
 * - method `sentence-set`: Property has no getter nor setter
 * - method `show-spaces`: Property has no getter nor setter
 * - method `show-spaces-set`: Property has no getter nor setter
 * - method `size`: Property has no getter nor setter
 * - method `size-points`: Property has no getter nor setter
 * - method `size-set`: Property has no getter nor setter
 * - method `stretch`: Property has no getter nor setter
 * - method `stretch-set`: Property has no getter nor setter
 * - method `strikethrough`: Property has no getter nor setter
 * - method `strikethrough-rgba`: Property has no getter nor setter
 * - method `strikethrough-rgba-set`: Property has no getter nor setter
 * - method `strikethrough-set`: Property has no getter nor setter
 * - method `style`: Property has no getter nor setter
 * - method `style-set`: Property has no getter nor setter
 * - method `tabs`: Property has no getter nor setter
 * - method `tabs-set`: Property has no getter nor setter
 * - method `text-transform`: Property has no getter nor setter
 * - method `text-transform-set`: Property has no getter nor setter
 * - method `underline`: Property has no getter nor setter
 * - method `underline-rgba`: Property has no getter nor setter
 * - method `underline-rgba-set`: Property has no getter nor setter
 * - method `underline-set`: Property has no getter nor setter
 * - method `variant`: Property has no getter nor setter
 * - method `variant-set`: Property has no getter nor setter
 * - method `weight`: Property has no getter nor setter
 * - method `weight-set`: Property has no getter nor setter
 * - method `word`: Property has no getter nor setter
 * - method `word-set`: Property has no getter nor setter
 * - method `wrap-mode`: Property has no getter nor setter
 * - method `wrap-mode-set`: Property has no getter nor setter
 */
public open class TextTag(public val gtkTextTagPointer: CPointer<GtkTextTag>) :
    Object(gtkTextTagPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a `GtkTextTag`.
     *
     * @param name tag name
     * @return a new `GtkTextTag`
     */
    public constructor(name: String? = null) : this(gtk_text_tag_new(name)!!.reinterpret())

    /**
     * Emits the [signal@Gtk.TextTagTable::tag-changed] signal on the
     * `GtkTextTagTable` where the tag is included.
     *
     * The signal is already emitted when setting a `GtkTextTag` property.
     * This function is useful for a `GtkTextTag` subclass.
     *
     * @param sizeChanged whether the change affects the `GtkTextView` layout
     */
    public open fun changed(sizeChanged: Boolean): Unit =
        gtk_text_tag_changed(gtkTextTagPointer, sizeChanged.asGBoolean())

    /**
     * Get the tag priority.
     *
     * @return The tag’s priority.
     */
    public open fun getPriority(): gint = gtk_text_tag_get_priority(gtkTextTagPointer)

    /**
     * Sets the priority of a `GtkTextTag`.
     *
     * Valid priorities start at 0 and go to one less than
     * [method@Gtk.TextTagTable.get_size]. Each tag in a table
     * has a unique priority; setting the priority of one tag shifts
     * the priorities of all the other tags in the table to maintain
     * a unique priority for each tag.
     *
     * Higher priority tags “win” if two tags both set the same text
     * attribute. When adding a tag to a tag table, it will be assigned
     * the highest priority in the table by default; so normally the
     * precedence of a set of tags is the order in which they were added
     * to the table, or created with [method@Gtk.TextBuffer.create_tag],
     * which adds the tag to the buffer’s table automatically.
     *
     * @param priority the new priority
     */
    public open fun setPriority(priority: gint): Unit = gtk_text_tag_set_priority(gtkTextTagPointer, priority)

    public companion object : TypeCompanion<TextTag> {
        override val type: GeneratedClassKGType<TextTag> =
            GeneratedClassKGType(getTypeOrNull("gtk_text_tag_get_type")!!) { TextTag(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TextTag
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_tag_get_type()
    }
}
