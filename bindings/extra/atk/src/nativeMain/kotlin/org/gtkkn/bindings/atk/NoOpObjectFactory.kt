// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkNoOpObjectFactory
import org.gtkkn.native.atk.atk_no_op_object_factory_get_type
import org.gtkkn.native.atk.atk_no_op_object_factory_new

/**
 * The AtkObjectFactory which creates an AtkNoOpObject.
 *
 * The AtkObjectFactory which creates an AtkNoOpObject. An instance of
 * this is created by an AtkRegistry if no factory type has not been
 * specified to create an accessible object of a particular type.
 */
public open class NoOpObjectFactory(
    pointer: CPointer<AtkNoOpObjectFactory>,
) : ObjectFactory(pointer.reinterpret()),
    KGTyped {
    public val atkNoOpObjectFactoryPointer: CPointer<AtkNoOpObjectFactory>
        get() = gPointer.reinterpret()

    /**
     * Creates an instance of an #AtkObjectFactory which generates primitive
     * (non-functioning) #AtkObjects.
     *
     * @return an instance of an #AtkObjectFactory
     */
    public constructor() : this(atk_no_op_object_factory_new()!!.reinterpret())

    public companion object : TypeCompanion<NoOpObjectFactory> {
        override val type: GeneratedClassKGType<NoOpObjectFactory> =
            GeneratedClassKGType(atk_no_op_object_factory_get_type()) { NoOpObjectFactory(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}
