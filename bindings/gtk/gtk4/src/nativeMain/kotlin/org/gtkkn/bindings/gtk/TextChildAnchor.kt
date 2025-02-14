// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTextChildAnchor
import org.gtkkn.native.gtk.gtk_text_child_anchor_get_deleted
import org.gtkkn.native.gtk.gtk_text_child_anchor_get_type
import org.gtkkn.native.gtk.gtk_text_child_anchor_new
import org.gtkkn.native.gtk.gtk_text_child_anchor_new_with_replacement
import kotlin.Boolean
import kotlin.String

/**
 * A `GtkTextChildAnchor` is a spot in a `GtkTextBuffer` where child widgets can
 * be “anchored”.
 *
 * The anchor can have multiple widgets anchored, to allow for multiple views.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_len`: out_len: Out parameter is not supported
 */
public open class TextChildAnchor(public val gtkTextChildAnchorPointer: CPointer<GtkTextChildAnchor>) :
    Object(gtkTextChildAnchorPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates a new `GtkTextChildAnchor`.
     *
     * Usually you would then insert it into a `GtkTextBuffer` with
     * [method@Gtk.TextBuffer.insert_child_anchor]. To perform the
     * creation and insertion in one step, use the convenience
     * function [method@Gtk.TextBuffer.create_child_anchor].
     *
     * @return a new `GtkTextChildAnchor`
     */
    public constructor() : this(gtk_text_child_anchor_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new `GtkTextChildAnchor` with the given replacement character.
     *
     * Usually you would then insert it into a `GtkTextBuffer` with
     * [method@Gtk.TextBuffer.insert_child_anchor].
     *
     * @param character a replacement character
     * @return a new `GtkTextChildAnchor`
     * @since 4.6
     */
    public constructor(character: String) : this(gtk_text_child_anchor_new_with_replacement(character)!!) {
        InstanceCache.put(this)
    }

    /**
     * Determines whether a child anchor has been deleted from
     * the buffer.
     *
     * Keep in mind that the child anchor will be unreferenced
     * when removed from the buffer, so you need to hold your own
     * reference (with g_object_ref()) if you plan to use this
     * function — otherwise all deleted child anchors will also
     * be finalized.
     *
     * @return true if the child anchor has been deleted from its buffer
     */
    public open fun getDeleted(): Boolean = gtk_text_child_anchor_get_deleted(gtkTextChildAnchorPointer).asBoolean()

    public companion object : TypeCompanion<TextChildAnchor> {
        override val type: GeneratedClassKGType<TextChildAnchor> =
            GeneratedClassKGType(getTypeOrNull()!!) { TextChildAnchor(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TextChildAnchor
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_child_anchor_get_type()

        /**
         * Gets the GType of from the symbol `gtk_text_child_anchor_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_text_child_anchor_get_type")
    }
}
