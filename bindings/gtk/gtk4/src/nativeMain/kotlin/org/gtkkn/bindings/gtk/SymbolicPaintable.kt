// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_6
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSymbolicPaintable
import org.gtkkn.native.gtk.gtk_symbolic_paintable_get_type

/**
 * `GtkSymbolicPaintable` is an interface that support symbolic colors in
 * paintables.
 *
 * `GdkPaintable`s implementing the interface will have the
 * [vfunc@Gtk.SymbolicPaintable.snapshot_symbolic] function called and
 * have the colors for drawing symbolic icons passed. At least 4 colors are guaranteed
 * to be passed every time.
 *
 * These 4 colors are the foreground color, and the colors to use for errors, warnings
 * and success information in that order.
 *
 * More colors may be added in the future.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `colors`: Array parameter of type Gdk.RGBA is not supported
 *
 * @since 4.6
 */
@GtkVersion4_6
public interface SymbolicPaintable :
    Proxy,
    Paintable,
    KGTyped {
    public val gtkSymbolicPaintablePointer: CPointer<GtkSymbolicPaintable>

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = gtkSymbolicPaintablePointer.reinterpret()

    /**
     * The SymbolicPaintableImpl type represents a native instance of the SymbolicPaintable interface.
     *
     * @constructor Creates a new instance of SymbolicPaintable for the provided [CPointer].
     */
    public data class SymbolicPaintableImpl(override val gtkSymbolicPaintablePointer: CPointer<GtkSymbolicPaintable>) :
        Object(gtkSymbolicPaintablePointer.reinterpret()),
        SymbolicPaintable

    public companion object : TypeCompanion<SymbolicPaintable> {
        override val type: GeneratedInterfaceKGType<SymbolicPaintable> =
            GeneratedInterfaceKGType(getTypeOrNull("gtk_symbolic_paintable_get_type")!!) {
                SymbolicPaintableImpl(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of SymbolicPaintable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_symbolic_paintable_get_type()
    }
}
