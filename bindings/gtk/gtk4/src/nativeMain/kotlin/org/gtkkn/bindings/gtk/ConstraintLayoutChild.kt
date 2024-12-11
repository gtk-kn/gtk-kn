// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkConstraintLayoutChild
import org.gtkkn.native.gtk.gtk_constraint_layout_child_get_type

/**
 * `GtkLayoutChild` subclass for children in a `GtkConstraintLayout`.
 */
public open class ConstraintLayoutChild(pointer: CPointer<GtkConstraintLayoutChild>) :
    LayoutChild(pointer.reinterpret()),
    KGTyped {
    public val gtkConstraintLayoutChildPointer: CPointer<GtkConstraintLayoutChild>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<ConstraintLayoutChild> {
        override val type: GeneratedClassKGType<ConstraintLayoutChild> =
            GeneratedClassKGType(gtk_constraint_layout_child_get_type()) { ConstraintLayoutChild(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ConstraintLayoutChild
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_constraint_layout_child_get_type()
    }
}
