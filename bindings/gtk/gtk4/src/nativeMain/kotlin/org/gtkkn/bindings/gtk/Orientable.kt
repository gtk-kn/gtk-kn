// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
 */
public interface Orientable : Interface, KGTyped {
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
        get() =
            gtk_orientable_get_orientation(gtkOrientablePointer.reinterpret()).run {
                Orientation.fromNativeValue(this)
            }

        /**
         * Sets the orientation of the @orientable.
         *
         * @param orientation the orientable’s new orientation
         */
        set(orientation) =
            gtk_orientable_set_orientation(
                gtkOrientablePointer.reinterpret(),
                orientation.nativeValue
            )

    /**
     * Retrieves the orientation of the @orientable.
     *
     * @return the orientation of the @orientable
     */
    public fun getOrientation(): Orientation =
        gtk_orientable_get_orientation(gtkOrientablePointer.reinterpret()).run {
            Orientation.fromNativeValue(this)
        }

    /**
     * Sets the orientation of the @orientable.
     *
     * @param orientation the orientable’s new orientation
     */
    public fun setOrientation(orientation: Orientation): Unit =
        gtk_orientable_set_orientation(
            gtkOrientablePointer.reinterpret(),
            orientation.nativeValue
        )

    private data class Wrapper(
        private val pointer: CPointer<GtkOrientable>,
    ) : Orientable {
        override val gtkOrientablePointer: CPointer<GtkOrientable> = pointer
    }

    public companion object : TypeCompanion<Orientable> {
        override val type: GeneratedInterfaceKGType<Orientable> =
            GeneratedInterfaceKGType(gtk_orientable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkOrientable>): Orientable = Wrapper(pointer)
    }
}
