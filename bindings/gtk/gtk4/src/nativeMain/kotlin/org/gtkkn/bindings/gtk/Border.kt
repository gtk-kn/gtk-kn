// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkBorder
import org.gtkkn.native.gtk.gtk_border_copy
import org.gtkkn.native.gtk.gtk_border_free
import org.gtkkn.native.gtk.gtk_border_new
import kotlin.Short
import kotlin.Unit

/**
 * A struct that specifies a border around a rectangular area.
 *
 * Each side can have different width.
 */
public class Border(
    pointer: CPointer<GtkBorder>,
) : Record {
    public val gtkBorderPointer: CPointer<GtkBorder> = pointer

    /**
     * The width of the left border
     */
    public var left: Short
        get() = gtkBorderPointer.pointed.left
        set(`value`) {
            gtkBorderPointer.pointed.left = value
        }

    /**
     * The width of the right border
     */
    public var right: Short
        get() = gtkBorderPointer.pointed.right
        set(`value`) {
            gtkBorderPointer.pointed.right = value
        }

    /**
     * The width of the top border
     */
    public var top: Short
        get() = gtkBorderPointer.pointed.top
        set(`value`) {
            gtkBorderPointer.pointed.top = value
        }

    /**
     * The width of the bottom border
     */
    public var bottom: Short
        get() = gtkBorderPointer.pointed.bottom
        set(`value`) {
            gtkBorderPointer.pointed.bottom = value
        }

    /**
     * Copies a `GtkBorder`.
     *
     * @return a copy of @border_.
     */
    public fun copy(): Border =
        gtk_border_copy(gtkBorderPointer.reinterpret())!!.run {
            Border(reinterpret())
        }

    /**
     * Frees a `GtkBorder`.
     */
    public fun free(): Unit = gtk_border_free(gtkBorderPointer.reinterpret())

    public companion object : RecordCompanion<Border, GtkBorder> {
        /**
         * Allocates a new `GtkBorder` struct and initializes its elements to zero.
         *
         * @return a newly allocated `GtkBorder` struct.
         *  Free with [method@Gtk.Border.free]
         */
        public fun new(): Border = Border(gtk_border_new()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Border = Border(pointer.reinterpret())
    }
}
