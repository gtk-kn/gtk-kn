// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
    Proxy,
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

    /**
     * The AccessibleTextImpl type represents a native instance of the AccessibleText interface.
     *
     * @constructor Creates a new instance of AccessibleText for the provided [CPointer].
     */
    public class AccessibleTextImpl(gtkAccessibleTextPointer: CPointer<GtkAccessibleText>) :
        Object(gtkAccessibleTextPointer.reinterpret()),
        AccessibleText {
        init {
            Gtk
        }

        override val gtkAccessibleTextPointer: CPointer<GtkAccessibleText> =
            gtkAccessibleTextPointer
    }

    public companion object : TypeCompanion<AccessibleText> {
        override val type: GeneratedInterfaceKGType<AccessibleText> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { AccessibleTextImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AccessibleText
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_text_get_type()

        /**
         * Gets the GType of from the symbol `gtk_accessible_text_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_accessible_text_get_type")
    }
}
