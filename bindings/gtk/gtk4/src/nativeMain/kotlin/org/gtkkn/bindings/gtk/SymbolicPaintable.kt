// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPaintable
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
 * - parameter `colors`: Gdk.RGBA
 *
 * @since 4.6
 */
public interface SymbolicPaintable : Interface, Paintable, KGTyped {
    public val gtkSymbolicPaintablePointer: CPointer<GtkSymbolicPaintable>

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = gtkSymbolicPaintablePointer.reinterpret()

    private data class Wrapper(
        private val pointer: CPointer<GtkSymbolicPaintable>,
    ) : SymbolicPaintable {
        override val gtkSymbolicPaintablePointer: CPointer<GtkSymbolicPaintable> = pointer
    }

    public companion object : TypeCompanion<SymbolicPaintable> {
        override val type: GeneratedInterfaceKGType<SymbolicPaintable> =
            GeneratedInterfaceKGType(gtk_symbolic_paintable_get_type()) {
                Wrapper(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkSymbolicPaintable>): SymbolicPaintable = Wrapper(pointer)
    }
}
