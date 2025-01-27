// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTextMark
import org.gtkkn.native.gtk.gtk_text_mark_get_buffer
import org.gtkkn.native.gtk.gtk_text_mark_get_deleted
import org.gtkkn.native.gtk.gtk_text_mark_get_left_gravity
import org.gtkkn.native.gtk.gtk_text_mark_get_name
import org.gtkkn.native.gtk.gtk_text_mark_get_type
import org.gtkkn.native.gtk.gtk_text_mark_get_visible
import org.gtkkn.native.gtk.gtk_text_mark_new
import org.gtkkn.native.gtk.gtk_text_mark_set_visible
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A `GtkTextMark` is a position in a `GtkTextbuffer` that is preserved
 * across modifications.
 *
 * You may wish to begin by reading the
 * [text widget conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 *
 * A `GtkTextMark` is like a bookmark in a text buffer; it preserves
 * a position in the text. You can convert the mark to an iterator using
 * [method@Gtk.TextBuffer.get_iter_at_mark]. Unlike iterators, marks remain
 * valid across buffer mutations, because their behavior is defined when
 * text is inserted or deleted. When text containing a mark is deleted,
 * the mark remains in the position originally occupied by the deleted
 * text. When text is inserted at a mark, a mark with “left gravity” will
 * be moved to the beginning of the newly-inserted text, and a mark with
 * “right gravity” will be moved to the end.
 *
 * Note that “left” and “right” here refer to logical direction (left
 * is the toward the start of the buffer); in some languages such as
 * Hebrew the logically-leftmost text is not actually on the left when
 * displayed.
 *
 * Marks are reference counted, but the reference count only controls
 * the validity of the memory; marks can be deleted from the buffer at
 * any time with [method@Gtk.TextBuffer.delete_mark]. Once deleted from
 * the buffer, a mark is essentially useless.
 *
 * Marks optionally have names; these can be convenient to avoid passing
 * the `GtkTextMark` object around.
 *
 * Marks are typically created using the [method@Gtk.TextBuffer.create_mark]
 * function.
 */
public open class TextMark(public val gtkTextMarkPointer: CPointer<GtkTextMark>) :
    Object(gtkTextMarkPointer.reinterpret()),
    KGTyped {
    /**
     * Whether the mark has left gravity.
     *
     * When text is inserted at the mark’s current location, if the mark
     * has left gravity it will be moved to the left of the newly-inserted
     * text, otherwise to the right.
     */
    public open val leftGravity: Boolean
        /**
         * Determines whether the mark has left gravity.
         *
         * @return true if the mark has left gravity, false otherwise
         */
        get() = gtk_text_mark_get_left_gravity(gtkTextMarkPointer).asBoolean()

    /**
     * The name of the mark or null if the mark is anonymous.
     */
    public open val name: String?
        /**
         * Returns the mark name.
         *
         * Returns null for anonymous marks.
         *
         * @return mark name
         */
        get() = gtk_text_mark_get_name(gtkTextMarkPointer)?.toKString()

    /**
     * Creates a text mark.
     *
     * Add it to a buffer using [method@Gtk.TextBuffer.add_mark].
     * If @name is null, the mark is anonymous; otherwise, the mark can be
     * retrieved by name using [method@Gtk.TextBuffer.get_mark]. If a mark
     * has left gravity, and text is inserted at the mark’s current location,
     * the mark will be moved to the left of the newly-inserted text. If the
     * mark has right gravity (@left_gravity = false), the mark will end up
     * on the right of newly-inserted text. The standard left-to-right cursor
     * is a mark with right gravity (when you type, the cursor stays on the
     * right side of the text you’re typing).
     *
     * @param name mark name
     * @param leftGravity whether the mark should have left gravity
     * @return new `GtkTextMark`
     */
    public constructor(
        name: String? = null,
        leftGravity: Boolean,
    ) : this(gtk_text_mark_new(name, leftGravity.asGBoolean())!!.reinterpret())

    /**
     * Gets the buffer this mark is located inside.
     *
     * Returns null if the mark is deleted.
     *
     * @return the mark’s `GtkTextBuffer`
     */
    public open fun getBuffer(): TextBuffer? = gtk_text_mark_get_buffer(gtkTextMarkPointer)?.run {
        TextBuffer(this)
    }

    /**
     * Returns true if the mark has been removed from its buffer.
     *
     * See [method@Gtk.TextBuffer.add_mark] for a way to add it
     * to a buffer again.
     *
     * @return whether the mark is deleted
     */
    public open fun getDeleted(): Boolean = gtk_text_mark_get_deleted(gtkTextMarkPointer).asBoolean()

    /**
     * Returns true if the mark is visible.
     *
     * A cursor is displayed for visible marks.
     *
     * @return true if visible
     */
    public open fun getVisible(): Boolean = gtk_text_mark_get_visible(gtkTextMarkPointer).asBoolean()

    public open fun setVisible(setting: Boolean): Unit =
        gtk_text_mark_set_visible(gtkTextMarkPointer, setting.asGBoolean())

    public companion object : TypeCompanion<TextMark> {
        override val type: GeneratedClassKGType<TextMark> =
            GeneratedClassKGType(getTypeOrNull("gtk_text_mark_get_type")!!) { TextMark(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TextMark
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_mark_get_type()
    }
}
