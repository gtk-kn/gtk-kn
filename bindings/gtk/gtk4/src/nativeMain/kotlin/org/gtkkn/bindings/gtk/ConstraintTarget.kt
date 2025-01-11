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
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_constraint_target_get_type

/**
 * The `GtkConstraintTarget` interface is implemented by objects that
 * can be used as source or target in `GtkConstraint`s.
 *
 * Besides `GtkWidget`, it is also implemented by `GtkConstraintGuide`.
 */
public interface ConstraintTarget :
    Proxy,
    KGTyped {
    public val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>

    /**
     * The ConstraintTargetImpl type represents a native instance of the ConstraintTarget interface.
     *
     * @constructor Creates a new instance of ConstraintTarget for the provided [CPointer].
     */
    public data class ConstraintTargetImpl(override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>) :
        Object(gtkConstraintTargetPointer.reinterpret()),
        ConstraintTarget

    public companion object : TypeCompanion<ConstraintTarget> {
        override val type: GeneratedInterfaceKGType<ConstraintTarget> =
            GeneratedInterfaceKGType(gtk_constraint_target_get_type()) { ConstraintTargetImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ConstraintTarget
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_constraint_target_get_type()
    }
}
