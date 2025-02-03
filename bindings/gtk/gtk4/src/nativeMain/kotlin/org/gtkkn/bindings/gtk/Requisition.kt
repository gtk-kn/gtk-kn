// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
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
public class Requisition(public val gtkRequisitionPointer: CPointer<GtkRequisition>) :
    ProxyInstance(gtkRequisitionPointer) {
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
     * Allocates a new `GtkRequisition`.
     *
     * The struct is initialized to zero.
     *
     * @return a new empty `GtkRequisition`. The newly
     *   allocated `GtkRequisition` should be freed with
     *   [method@Gtk.Requisition.free]
     */
    public constructor() : this(gtk_requisition_new()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Copies a `GtkRequisition`.
     *
     * @return a copy of @requisition
     */
    public fun copy(): Requisition = gtk_requisition_copy(gtkRequisitionPointer)!!.run {
        Requisition(this)
    }

    /**
     * Frees a `GtkRequisition`.
     */
    public fun free(): Unit = gtk_requisition_free(gtkRequisitionPointer)

    override fun toString(): String = "Requisition(width=$width, height=$height)"

    public companion object {
        /**
         * Get the GType of Requisition
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_requisition_get_type()
    }
}
