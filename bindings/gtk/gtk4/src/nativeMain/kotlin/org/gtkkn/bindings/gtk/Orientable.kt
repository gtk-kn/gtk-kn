// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    public data class OrientableImpl(override val gtkOrientablePointer: CPointer<GtkOrientable>) :
        Object(gtkOrientablePointer.reinterpret()),
        Orientable

    public companion object : TypeCompanion<Orientable> {
        override val type: GeneratedInterfaceKGType<Orientable> =
            GeneratedInterfaceKGType(gtk_orientable_get_type()) { OrientableImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Orientable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_orientable_get_type()
    }
}
