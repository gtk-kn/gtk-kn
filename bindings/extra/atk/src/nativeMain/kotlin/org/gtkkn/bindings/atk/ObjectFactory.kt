// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkObjectFactory
import org.gtkkn.native.atk.atk_object_factory_create_accessible
import org.gtkkn.native.atk.atk_object_factory_get_accessible_type
import org.gtkkn.native.atk.atk_object_factory_get_type
import org.gtkkn.native.atk.atk_object_factory_invalidate
import kotlin.ULong
import kotlin.Unit

/**
 * The base object class for a factory used to
 *  create accessible objects for objects of a specific GType.
 *
 * This class is the base object class for a factory used to create an
 * accessible object for a specific GType. The function
 * atk_registry_set_factory_type() is normally called to store in the
 * registry the factory type to be used to create an accessible of a
 * particular GType.
 */
public open class ObjectFactory(
    pointer: CPointer<AtkObjectFactory>,
) : org.gtkkn.bindings.gobject.Object(pointer.reinterpret()),
    KGTyped {
    public val atkObjectFactoryPointer: CPointer<AtkObjectFactory>
        get() = gPointer.reinterpret()

    /**
     * Provides an #AtkObject that implements an accessibility interface
     * on behalf of @obj
     *
     * @param obj a #GObject
     * @return an #AtkObject that implements an accessibility
     * interface on behalf of @obj
     */
    public open fun createAccessible(obj: org.gtkkn.bindings.gobject.Object): Object =
        atk_object_factory_create_accessible(atkObjectFactoryPointer.reinterpret(), obj.gPointer.reinterpret())!!.run {
            Object(reinterpret())
        }

    /**
     * Gets the GType of the accessible which is created by the factory.
     *
     * @return the type of the accessible which is created by the @factory.
     * The value G_TYPE_INVALID is returned if no type if found.
     */
    public open fun getAccessibleType(): ULong =
        atk_object_factory_get_accessible_type(atkObjectFactoryPointer.reinterpret())

    /**
     * Inform @factory that it is no longer being used to create
     * accessibles. When called, @factory may need to inform
     * #AtkObjects which it has created that they need to be re-instantiated.
     * Note: primarily used for runtime replacement of #AtkObjectFactorys
     * in object registries.
     */
    public open fun invalidate(): Unit = atk_object_factory_invalidate(atkObjectFactoryPointer.reinterpret())

    public companion object : TypeCompanion<ObjectFactory> {
        override val type: GeneratedClassKGType<ObjectFactory> =
            GeneratedClassKGType(atk_object_factory_get_type()) { ObjectFactory(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}
