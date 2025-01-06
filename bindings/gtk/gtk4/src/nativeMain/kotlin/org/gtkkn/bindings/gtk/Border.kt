// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBorder
import org.gtkkn.native.gtk.gtk_border_copy
import org.gtkkn.native.gtk.gtk_border_free
import org.gtkkn.native.gtk.gtk_border_get_type
import org.gtkkn.native.gtk.gtk_border_new
import kotlin.Short
import kotlin.String
import kotlin.Unit

/**
 * A struct that specifies a border around a rectangular area.
 *
 * Each side can have different width.
 */
public class Border(pointer: CPointer<GtkBorder>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GtkBorder> = pointer

    /**
     * The width of the left border
     */
    public var left: Short
        get() = gPointer.pointed.left

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.left = value
        }

    /**
     * The width of the right border
     */
    public var right: Short
        get() = gPointer.pointed.right

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.right = value
        }

    /**
     * The width of the top border
     */
    public var top: Short
        get() = gPointer.pointed.top

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.top = value
        }

    /**
     * The width of the bottom border
     */
    public var bottom: Short
        get() = gPointer.pointed.bottom

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.bottom = value
        }

    /**
     * Copies a `GtkBorder`.
     *
     * @return a copy of @border_.
     */
    public fun copy(): Border = gtk_border_copy(gPointer.reinterpret())!!.run {
        Border(reinterpret())
    }

    /**
     * Frees a `GtkBorder`.
     */
    public fun free(): Unit = gtk_border_free(gPointer.reinterpret())

    override fun toString(): String = "Border(left=$left, right=$right, top=$top, bottom=$bottom)"

    public companion object {
        /**
         * Allocates a new `GtkBorder` struct and initializes its elements to zero.
         *
         * @return a newly allocated `GtkBorder` struct.
         *  Free with [method@Gtk.Border.free]
         */
        public fun new(): Border = Border(gtk_border_new()!!.reinterpret())

        /**
         * Get the GType of Border
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_border_get_type()
    }
}
