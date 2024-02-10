// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
 * ![An example GtkSeparator](separators.png)
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
public open class Separator(
    pointer: CPointer<GtkSeparator>,
) : Widget(pointer.reinterpret()), Orientable, KGTyped {
    public val gtkSeparatorPointer: CPointer<GtkSeparator>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkSeparator` with the given orientation.
     *
     * @param orientation the separator’s orientation.
     * @return a new `GtkSeparator`.
     */
    public constructor(orientation: Orientation) :
        this(gtk_separator_new(orientation.nativeValue)!!.reinterpret())

    public companion object : TypeCompanion<Separator> {
        override val type: GeneratedClassKGType<Separator> =
            GeneratedClassKGType(gtk_separator_get_type()) { Separator(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
