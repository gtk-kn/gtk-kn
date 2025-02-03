// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gsk.Transform
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFixedLayoutChild
import org.gtkkn.native.gtk.gtk_fixed_layout_child_get_transform
import org.gtkkn.native.gtk.gtk_fixed_layout_child_get_type
import org.gtkkn.native.gtk.gtk_fixed_layout_child_set_transform
import kotlin.Unit

/**
 * `GtkLayoutChild` subclass for children in a `GtkFixedLayout`.
 *
 * ## Skipped during bindings generation
 *
 * - method `transform`: Property TypeInfo of getter and setter do not match
 */
public open class FixedLayoutChild(public val gtkFixedLayoutChildPointer: CPointer<GtkFixedLayoutChild>) :
    LayoutChild(gtkFixedLayoutChildPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Retrieves the transformation of the child.
     *
     * @return a `GskTransform`
     */
    public open fun getTransform(): Transform? = gtk_fixed_layout_child_get_transform(gtkFixedLayoutChildPointer)?.run {
        Transform(this)
    }

    /**
     * Sets the transformation of the child of a `GtkFixedLayout`.
     *
     * @param transform a `GskTransform`
     */
    public open fun setTransform(transform: Transform): Unit =
        gtk_fixed_layout_child_set_transform(gtkFixedLayoutChildPointer, transform.gskTransformPointer)

    public companion object : TypeCompanion<FixedLayoutChild> {
        override val type: GeneratedClassKGType<FixedLayoutChild> =
            GeneratedClassKGType(getTypeOrNull()!!) { FixedLayoutChild(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FixedLayoutChild
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_fixed_layout_child_get_type()

        /**
         * Gets the GType of from the symbol `gtk_fixed_layout_child_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_fixed_layout_child_get_type")
    }
}
