// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class ListHeader(pointer: CPointer<GtkListHeader>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkListHeaderPointer: CPointer<GtkListHeader>
        get() = gPointer.reinterpret()

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
        get() = gtk_list_header_get_child(gtkListHeaderPointer.reinterpret())?.run {
            Widget(reinterpret())
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
        set(
            child
        ) = gtk_list_header_set_child(gtkListHeaderPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

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
        get() = gtk_list_header_get_end(gtkListHeaderPointer.reinterpret())

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
        get() = gtk_list_header_get_item(gtkListHeaderPointer.reinterpret())?.run {
            Object(reinterpret())
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
        get() = gtk_list_header_get_n_items(gtkListHeaderPointer.reinterpret())

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
        get() = gtk_list_header_get_start(gtkListHeaderPointer.reinterpret())

    public companion object : TypeCompanion<ListHeader> {
        override val type: GeneratedClassKGType<ListHeader> =
            GeneratedClassKGType(gtk_list_header_get_type()) { ListHeader(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ListHeader
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_list_header_get_type()
    }
}
