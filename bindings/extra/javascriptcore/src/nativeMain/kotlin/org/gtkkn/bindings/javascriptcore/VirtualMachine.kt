// This is a generated file. Do not modify.
package org.gtkkn.bindings.javascriptcore

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.javascriptcore.JSCVirtualMachine
import org.gtkkn.native.javascriptcore.jsc_virtual_machine_get_type
import org.gtkkn.native.javascriptcore.jsc_virtual_machine_new

/**
 * JSCVirtualMachine represents a group of JSCContext<!-- -->s. It allows
 * concurrent JavaScript execution by creating a different instance of
 * JSCVirtualMachine in each thread.
 *
 * To create a group of JSCContext<!-- -->s pass the same JSCVirtualMachine
 * instance to every JSCContext constructor.
 */
public class VirtualMachine(pointer: CPointer<JSCVirtualMachine>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val javascriptcoreVirtualMachinePointer: CPointer<JSCVirtualMachine>
        get() = gPointer.reinterpret()

    /**
     * Create a new #JSCVirtualMachine.
     *
     * @return the newly created #JSCVirtualMachine.
     */
    public constructor() : this(jsc_virtual_machine_new()!!.reinterpret())

    public companion object : TypeCompanion<VirtualMachine> {
        override val type: GeneratedClassKGType<VirtualMachine> =
            GeneratedClassKGType(jsc_virtual_machine_get_type()) { VirtualMachine(it.reinterpret()) }

        init {
            JavascriptcoreTypeProvider.register()
        }

        /**
         * Get the GType of VirtualMachine
         *
         * @return the GType
         */
        public fun getType(): GType = jsc_virtual_machine_get_type()
    }
}
