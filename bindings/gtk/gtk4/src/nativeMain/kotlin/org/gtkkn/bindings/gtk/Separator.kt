// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkSeparator
import org.gtkkn.native.gtk.gtk_separator_get_type
import org.gtkkn.native.gtk.gtk_separator_new

/**
 * `GtkSeparator` is a horizontal or vertical separator widget.
 *
 * ![An example GtkSeparator](separator.png)
 *
 * A `GtkSeparator` can be used to group the widgets within a window.
 * It displays a line with a shadow to make it appear sunken into the
 * interface.
 *
 * # CSS nodes
 *
 * `GtkSeparator` has a single CSS node with name separator. The node
 * gets one of the .horizontal or .vertical style classes.
 *
 * # Accessibility
 *
 * `GtkSeparator` uses the %GTK_ACCESSIBLE_ROLE_SEPARATOR role.
 */
public open class Separator(public val gtkSeparatorPointer: CPointer<GtkSeparator>) :
    Widget(gtkSeparatorPointer.reinterpret()),
    Orientable,
    KGTyped {
    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkSeparator` with the given orientation.
     *
     * @param orientation the separator’s orientation.
     * @return a new `GtkSeparator`.
     */
    public constructor(orientation: Orientation) : this(gtk_separator_new(orientation.nativeValue)!!.reinterpret())

    public companion object : TypeCompanion<Separator> {
        override val type: GeneratedClassKGType<Separator> =
            GeneratedClassKGType(gtk_separator_get_type()) { Separator(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Separator
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_separator_get_type()
    }
}
