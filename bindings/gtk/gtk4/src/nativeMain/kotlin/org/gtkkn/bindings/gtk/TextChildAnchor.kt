// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class TextChildAnchor(pointer: CPointer<GtkTextChildAnchor>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkTextChildAnchorPointer: CPointer<GtkTextChildAnchor>
        get() = gPointer.reinterpret()

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
    public constructor() : this(gtk_text_child_anchor_new()!!.reinterpret())

    /**
     * Creates a new `GtkTextChildAnchor` with the given replacement character.
     *
     * Usually you would then insert it into a `GtkTextBuffer` with
     * [method@Gtk.TextBuffer.insert_child_anchor].
     *
     * @param character
     * @return a new `GtkTextChildAnchor`
     * @since 4.6
     */
    public constructor(character: String) : this(gtk_text_child_anchor_new_with_replacement(character)!!.reinterpret())

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
            GeneratedClassKGType(gtk_text_child_anchor_get_type()) { TextChildAnchor(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TextChildAnchor
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_child_anchor_get_type()
    }
}
