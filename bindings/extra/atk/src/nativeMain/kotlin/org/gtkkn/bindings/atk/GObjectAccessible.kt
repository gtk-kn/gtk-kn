// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkGObjectAccessible
import org.gtkkn.native.atk.atk_gobject_accessible_for_object
import org.gtkkn.native.atk.atk_gobject_accessible_get_object
import org.gtkkn.native.atk.atk_gobject_accessible_get_type

/**
 * This object class is derived from AtkObject and can be used as a basis implementing accessible objects.
 *
 * This object class is derived from AtkObject. It can be used as a
 * basis for implementing accessible objects for GObjects which are
 * not derived from GtkWidget. One example of its use is in providing
 * an accessible object for GnomeCanvasItem in the GAIL library.
 */
public open class GObjectAccessible(
    pointer: CPointer<AtkGObjectAccessible>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val atkGObjectAccessiblePointer: CPointer<AtkGObjectAccessible>
        get() = gPointer.reinterpret()

    /**
     * Gets the GObject for which @obj is the accessible object.
     *
     * @return a #GObject which is the object for which @obj is
     * the accessible object
     */
    public open fun getObject(): org.gtkkn.bindings.gobject.Object =
        atk_gobject_accessible_get_object(atkGObjectAccessiblePointer.reinterpret())!!.run {
            org.gtkkn.bindings.gobject
                .Object(reinterpret())
        }

    public companion object : TypeCompanion<GObjectAccessible> {
        override val type: GeneratedClassKGType<GObjectAccessible> =
            GeneratedClassKGType(atk_gobject_accessible_get_type()) { GObjectAccessible(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        /**
         * Gets the accessible object for the specified @obj.
         *
         * @param obj a #GObject
         * @return a #AtkObject which is the accessible object for
         * the @obj
         */
        public fun forObject(obj: org.gtkkn.bindings.gobject.Object): Object =
            atk_gobject_accessible_for_object(obj.gPointer.reinterpret())!!.run {
                Object(reinterpret())
            }
    }
}
