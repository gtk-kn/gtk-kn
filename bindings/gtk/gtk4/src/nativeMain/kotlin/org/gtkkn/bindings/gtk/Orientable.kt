// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_orientable_get_orientation
import org.gtkkn.native.gtk.gtk_orientable_get_type
import org.gtkkn.native.gtk.gtk_orientable_set_orientation
import kotlin.Unit

/**
 * The `GtkOrientable` interface is implemented by all widgets that can be
 * oriented horizontally or vertically.
 *
 * `GtkOrientable` is more flexible in that it allows the orientation to be
 * changed at runtime, allowing the widgets to “flip”.
 *
 * ## CSS nodes
 *
 * `GtkWidget` types implementing the `GtkOrientable` interface will
 * automatically acquire the `horizontal` or `vertical` CSS class depending on
 * the value of the [property@Gtk.Orientable:orientation] property.
 */
public interface Orientable :
    Proxy,
    KGTyped {
    public val gtkOrientablePointer: CPointer<GtkOrientable>

    /**
     * The orientation of the orientable.
     */
    public var orientation: Orientation
        /**
         * Retrieves the orientation of the @orientable.
         *
         * @return the orientation of the @orientable
         */
        get() = gtk_orientable_get_orientation(gtkOrientablePointer).run {
            Orientation.fromNativeValue(this)
        }

        /**
         * Sets the orientation of the @orientable.
         *
         * @param orientation the orientable’s new orientation
         */
        set(orientation) = gtk_orientable_set_orientation(gtkOrientablePointer, orientation.nativeValue)

    /**
     * Retrieves the orientation of the @orientable.
     *
     * @return the orientation of the @orientable
     */
    public fun getOrientation(): Orientation = gtk_orientable_get_orientation(gtkOrientablePointer).run {
        Orientation.fromNativeValue(this)
    }

    /**
     * Sets the orientation of the @orientable.
     *
     * @param orientation the orientable’s new orientation
     */
    public fun setOrientation(orientation: Orientation): Unit =
        gtk_orientable_set_orientation(gtkOrientablePointer, orientation.nativeValue)

    /**
     * The OrientableImpl type represents a native instance of the Orientable interface.
     *
     * @constructor Creates a new instance of Orientable for the provided [CPointer].
     */
    public class OrientableImpl(gtkOrientablePointer: CPointer<GtkOrientable>) :
        Object(gtkOrientablePointer.reinterpret()),
        Orientable {
        init {
            Gtk
        }

        override val gtkOrientablePointer: CPointer<GtkOrientable> = gtkOrientablePointer
    }

    public companion object : TypeCompanion<Orientable> {
        override val type: GeneratedInterfaceKGType<Orientable> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { OrientableImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Orientable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_orientable_get_type()

        /**
         * Gets the GType of from the symbol `gtk_orientable_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_orientable_get_type")
    }
}
