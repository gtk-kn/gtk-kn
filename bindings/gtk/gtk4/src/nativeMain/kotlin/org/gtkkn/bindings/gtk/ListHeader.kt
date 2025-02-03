// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkListHeader
import org.gtkkn.native.gtk.gtk_list_header_get_child
import org.gtkkn.native.gtk.gtk_list_header_get_end
import org.gtkkn.native.gtk.gtk_list_header_get_item
import org.gtkkn.native.gtk.gtk_list_header_get_n_items
import org.gtkkn.native.gtk.gtk_list_header_get_start
import org.gtkkn.native.gtk.gtk_list_header_get_type
import org.gtkkn.native.gtk.gtk_list_header_set_child

/**
 * `GtkListHeader` is used by list widgets to represent the headers they
 * display.
 *
 * `GtkListHeader` objects are managed just like [class@Gtk.ListItem]
 * objects via their factory, but provide a different set of properties suitable
 * for managing the header instead of individual items.
 * @since 4.12
 */
@GtkVersion4_12
public open class ListHeader(public val gtkListHeaderPointer: CPointer<GtkListHeader>) :
    Object(gtkListHeaderPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Widget used for display.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var child: Widget?
        /**
         * Gets the child previously set via gtk_list_header_set_child() or
         * null if none was set.
         *
         * @return The child
         * @since 4.12
         */
        get() = gtk_list_header_get_child(gtkListHeaderPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the child to be used for this listitem.
         *
         * This function is typically called by applications when
         * setting up a header so that the widget can be reused when
         * binding it multiple times.
         *
         * @param child The list item's child or null to unset
         * @since 4.12
         */
        @GtkVersion4_12
        set(child) = gtk_list_header_set_child(gtkListHeaderPointer, child?.gtkWidgetPointer)

    /**
     * The first position no longer part of this section.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open val end: guint
        /**
         * Gets the end position in the model of the section that @self is
         * currently the header for.
         *
         * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
         *
         * @return The end position of the section
         * @since 4.12
         */
        get() = gtk_list_header_get_end(gtkListHeaderPointer)

    /**
     * The item at the start of the section.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open val item: Object?
        /**
         * Gets the model item at the start of the section.
         * This is the item that occupies the list model at position
         * [property@Gtk.ListHeader:start].
         *
         * If @self is unbound, this function returns null.
         *
         * @return The item displayed
         * @since 4.12
         */
        get() = gtk_list_header_get_item(gtkListHeaderPointer)?.run {
            InstanceCache.get(reinterpret(), true) { Object(reinterpret()) }!!
        }

    /**
     * Number of items in this section.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open val nItems: guint
        /**
         * Gets the the number of items in the section.
         *
         * If @self is unbound, 0 is returned.
         *
         * @return The number of items in the section
         * @since 4.12
         */
        get() = gtk_list_header_get_n_items(gtkListHeaderPointer)

    /**
     * First position of items in this section.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open val start: guint
        /**
         * Gets the start position in the model of the section that @self is
         * currently the header for.
         *
         * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
         *
         * @return The start position of the section
         * @since 4.12
         */
        get() = gtk_list_header_get_start(gtkListHeaderPointer)

    public companion object : TypeCompanion<ListHeader> {
        override val type: GeneratedClassKGType<ListHeader> =
            GeneratedClassKGType(getTypeOrNull()!!) { ListHeader(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ListHeader
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_list_header_get_type()

        /**
         * Gets the GType of from the symbol `gtk_list_header_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_list_header_get_type")
    }
}
