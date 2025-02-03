// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
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
public class Border(public val gtkBorderPointer: CPointer<GtkBorder>) : ProxyInstance(gtkBorderPointer) {
    /**
     * The width of the left border
     */
    public var left: Short
        get() = gtkBorderPointer.pointed.left

        @UnsafeFieldSetter
        set(`value`) {
            gtkBorderPointer.pointed.left = value
        }

    /**
     * The width of the right border
     */
    public var right: Short
        get() = gtkBorderPointer.pointed.right

        @UnsafeFieldSetter
        set(`value`) {
            gtkBorderPointer.pointed.right = value
        }

    /**
     * The width of the top border
     */
    public var top: Short
        get() = gtkBorderPointer.pointed.top

        @UnsafeFieldSetter
        set(`value`) {
            gtkBorderPointer.pointed.top = value
        }

    /**
     * The width of the bottom border
     */
    public var bottom: Short
        get() = gtkBorderPointer.pointed.bottom

        @UnsafeFieldSetter
        set(`value`) {
            gtkBorderPointer.pointed.bottom = value
        }

    /**
     * Allocates a new `GtkBorder` struct and initializes its elements to zero.
     *
     * @return a newly allocated `GtkBorder` struct.
     *  Free with [method@Gtk.Border.free]
     */
    public constructor() : this(gtk_border_new()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Copies a `GtkBorder`.
     *
     * @return a copy of @border_.
     */
    public fun copy(): Border = gtk_border_copy(gtkBorderPointer)!!.run {
        Border(this)
    }

    /**
     * Frees a `GtkBorder`.
     */
    public fun free(): Unit = gtk_border_free(gtkBorderPointer)

    override fun toString(): String = "Border(left=$left, right=$right, top=$top, bottom=$bottom)"

    public companion object {
        /**
         * Get the GType of Border
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_border_get_type()
    }
}
