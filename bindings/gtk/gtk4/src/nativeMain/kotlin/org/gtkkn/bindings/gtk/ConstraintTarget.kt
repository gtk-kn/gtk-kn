// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_constraint_target_get_type

/**
 * The `GtkConstraintTarget` interface is implemented by objects that
 * can be used as source or target in `GtkConstraint`s.
 *
 * Besides `GtkWidget`, it is also implemented by `GtkConstraintGuide`.
 */
public interface ConstraintTarget : Interface, KGTyped {
    public val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>

    private data class Wrapper(
        private val pointer: CPointer<GtkConstraintTarget>,
    ) : ConstraintTarget {
        override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget> = pointer
    }

    public companion object : TypeCompanion<ConstraintTarget> {
        override val type: GeneratedInterfaceKGType<ConstraintTarget> =
            GeneratedInterfaceKGType(gtk_constraint_target_get_type()) {
                Wrapper(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkConstraintTarget>): ConstraintTarget = Wrapper(pointer)
    }
}
