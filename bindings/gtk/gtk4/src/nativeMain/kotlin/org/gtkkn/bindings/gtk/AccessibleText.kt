// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleText
import org.gtkkn.native.gtk.gtk_accessible_text_get_type
import org.gtkkn.native.gtk.gtk_accessible_text_update_caret_position
import org.gtkkn.native.gtk.gtk_accessible_text_update_contents
import org.gtkkn.native.gtk.gtk_accessible_text_update_selection_bound
import kotlin.Unit

/**
 * An interface for accessible objects containing formatted text.
 *
 * The `GtkAccessibleText` interfaces is meant to be implemented by accessible
 * objects that have text formatted with attributes, or non-trivial text contents.
 *
 * You should use the [enum@Gtk.AccessibleProperty.LABEL] or the
 * [enum@Gtk.AccessibleProperty.DESCRIPTION] properties for accessible
 * objects containing simple, unformatted text.
 * @since 4.14
 */
@GtkVersion4_14
public interface AccessibleText :
    Interface,
    Accessible,
    KGTyped {
    public val gtkAccessibleTextPointer: CPointer<GtkAccessibleText>

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gtkAccessibleTextPointer.reinterpret()

    /**
     * Updates the position of the caret.
     *
     * Implementations of the `GtkAccessibleText` interface should call this
     * function every time the caret has moved, in order to notify assistive
     * technologies.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public fun updateCaretPosition(): Unit = gtk_accessible_text_update_caret_position(gtkAccessibleTextPointer)

    /**
     * Notifies assistive technologies of a change in contents.
     *
     * Implementations of the `GtkAccessibleText` interface should call this
     * function every time their contents change as the result of an operation,
     * like an insertion or a removal.
     *
     * Note: If the change is a deletion, this function must be called *before*
     * removing the contents, if it is an insertion, it must be called *after*
     * inserting the new contents.
     *
     * @param change the type of change in the contents
     * @param start the starting offset of the change, in characters
     * @param end the end offset of the change, in characters
     * @since 4.14
     */
    @GtkVersion4_14
    public fun updateContents(change: AccessibleTextContentChange, start: guint, end: guint): Unit =
        gtk_accessible_text_update_contents(gtkAccessibleTextPointer, change.nativeValue, start, end)

    /**
     * Updates the boundary of the selection.
     *
     * Implementations of the `GtkAccessibleText` interface should call this
     * function every time the selection has moved, in order to notify assistive
     * technologies.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public fun updateSelectionBound(): Unit = gtk_accessible_text_update_selection_bound(gtkAccessibleTextPointer)

    private data class Wrapper(private val pointer: CPointer<GtkAccessibleText>) : AccessibleText {
        override val gtkAccessibleTextPointer: CPointer<GtkAccessibleText> = pointer
    }

    public companion object : TypeCompanion<AccessibleText> {
        override val type: GeneratedInterfaceKGType<AccessibleText> =
            GeneratedInterfaceKGType(gtk_accessible_text_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkAccessibleText>): AccessibleText = Wrapper(pointer)

        /**
         * Get the GType of AccessibleText
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_text_get_type()
    }
}
