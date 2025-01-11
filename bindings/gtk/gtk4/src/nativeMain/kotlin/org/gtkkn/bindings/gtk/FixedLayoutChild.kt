// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gsk.Transform
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFixedLayoutChild
import org.gtkkn.native.gtk.gtk_fixed_layout_child_get_transform
import org.gtkkn.native.gtk.gtk_fixed_layout_child_get_type
import org.gtkkn.native.gtk.gtk_fixed_layout_child_set_transform
import kotlin.Unit

/**
 * `GtkLayoutChild` subclass for children in a `GtkFixedLayout`.
 *
 * ## Skipped during bindings generation
 *
 * - method `transform`: Property TypeInfo of getter and setter do not match
 */
public open class FixedLayoutChild(public val gtkFixedLayoutChildPointer: CPointer<GtkFixedLayoutChild>) :
    LayoutChild(gtkFixedLayoutChildPointer.reinterpret()),
    KGTyped {
    /**
     * Retrieves the transformation of the child.
     *
     * @return a `GskTransform`
     */
    public open fun getTransform(): Transform? = gtk_fixed_layout_child_get_transform(gtkFixedLayoutChildPointer)?.run {
        Transform(this)
    }

    /**
     * Sets the transformation of the child of a `GtkFixedLayout`.
     *
     * @param transform a `GskTransform`
     */
    public open fun setTransform(transform: Transform): Unit =
        gtk_fixed_layout_child_set_transform(gtkFixedLayoutChildPointer, transform.gskTransformPointer)

    public companion object : TypeCompanion<FixedLayoutChild> {
        override val type: GeneratedClassKGType<FixedLayoutChild> =
            GeneratedClassKGType(gtk_fixed_layout_child_get_type()) { FixedLayoutChild(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FixedLayoutChild
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_fixed_layout_child_get_type()
    }
}
