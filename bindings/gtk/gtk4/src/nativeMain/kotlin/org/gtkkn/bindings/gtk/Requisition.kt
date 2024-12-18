// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkRequisition
import org.gtkkn.native.gtk.gtk_requisition_copy
import org.gtkkn.native.gtk.gtk_requisition_free
import org.gtkkn.native.gtk.gtk_requisition_get_type
import org.gtkkn.native.gtk.gtk_requisition_new
import kotlin.String
import kotlin.Unit

/**
 * A `GtkRequisition` represents the desired size of a widget. See
 * [GtkWidget’s geometry management section](class.Widget.html#height-for-width-geometry-management) for
 * more information.
 */
public class Requisition(pointer: CPointer<GtkRequisition>) : ProxyInstance(pointer) {
    public val gtkRequisitionPointer: CPointer<GtkRequisition> = pointer

    /**
     * the widget’s desired width
     */
    public var width: gint
        get() = gtkRequisitionPointer.pointed.width

        @UnsafeFieldSetter
        set(`value`) {
            gtkRequisitionPointer.pointed.width = value
        }

    /**
     * the widget’s desired height
     */
    public var height: gint
        get() = gtkRequisitionPointer.pointed.height

        @UnsafeFieldSetter
        set(`value`) {
            gtkRequisitionPointer.pointed.height = value
        }

    /**
     * Copies a `GtkRequisition`.
     *
     * @return a copy of @requisition
     */
    public fun copy(): Requisition = gtk_requisition_copy(gtkRequisitionPointer.reinterpret())!!.run {
        Requisition(reinterpret())
    }

    /**
     * Frees a `GtkRequisition`.
     */
    public fun free(): Unit = gtk_requisition_free(gtkRequisitionPointer.reinterpret())

    override fun toString(): String = "Requisition(width=$width, height=$height)"

    public companion object {
        /**
         * Allocates a new `GtkRequisition`.
         *
         * The struct is initialized to zero.
         *
         * @return a new empty `GtkRequisition`. The newly
         *   allocated `GtkRequisition` should be freed with
         *   [method@Gtk.Requisition.free]
         */
        public fun new(): Requisition = Requisition(gtk_requisition_new()!!.reinterpret())

        /**
         * Get the GType of Requisition
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_requisition_get_type()
    }
}
