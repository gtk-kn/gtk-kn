// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkRegistry
import org.gtkkn.native.atk.atk_registry_get_factory
import org.gtkkn.native.atk.atk_registry_get_factory_type
import org.gtkkn.native.atk.atk_registry_get_type
import org.gtkkn.native.atk.atk_registry_set_factory_type
import kotlin.ULong
import kotlin.Unit

/**
 * An object used to store the GType of the
 * factories used to create an accessible object for an object of a
 * particular GType.
 *
 * The AtkRegistry is normally used to create appropriate ATK "peers"
 * for user interface components.  Application developers usually need
 * only interact with the AtkRegistry by associating appropriate ATK
 * implementation classes with GObject classes via the
 * atk_registry_set_factory_type call, passing the appropriate GType
 * for application custom widget classes.
 */
public open class Registry(
    pointer: CPointer<AtkRegistry>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val atkRegistryPointer: CPointer<AtkRegistry>
        get() = gPointer.reinterpret()

    /**
     * Gets an #AtkObjectFactory appropriate for creating #AtkObjects
     * appropriate for @type.
     *
     * @param type a #GType with which to look up the associated #AtkObjectFactory
     * @return an #AtkObjectFactory appropriate for creating
     * #AtkObjects appropriate for @type.
     */
    public open fun getFactory(type: ULong): ObjectFactory =
        atk_registry_get_factory(atkRegistryPointer.reinterpret(), type)!!.run {
            ObjectFactory(reinterpret())
        }

    /**
     * Provides a #GType indicating the #AtkObjectFactory subclass
     * associated with @type.
     *
     * @param type a #GType with which to look up the associated #AtkObjectFactory
     * subclass
     * @return a #GType associated with type @type
     */
    public open fun getFactoryType(type: ULong): ULong =
        atk_registry_get_factory_type(atkRegistryPointer.reinterpret(), type)

    /**
     * Associate an #AtkObjectFactory subclass with a #GType. Note:
     * The associated @factory_type will thereafter be responsible for
     * the creation of new #AtkObject implementations for instances
     * appropriate for @type.
     *
     * @param type an #AtkObject type
     * @param factoryType an #AtkObjectFactory type to associate with @type.  Must
     * implement AtkObject appropriate for @type.
     */
    public open fun setFactoryType(
        type: ULong,
        factoryType: ULong,
    ): Unit = atk_registry_set_factory_type(atkRegistryPointer.reinterpret(), type, factoryType)

    public companion object : TypeCompanion<Registry> {
        override val type: GeneratedClassKGType<Registry> =
            GeneratedClassKGType(atk_registry_get_type()) { Registry(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}
