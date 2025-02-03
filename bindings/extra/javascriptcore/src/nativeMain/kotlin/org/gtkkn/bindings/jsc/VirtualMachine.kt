// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.jsc

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.jsc.JSCVirtualMachine
import org.gtkkn.native.jsc.jsc_virtual_machine_get_type
import org.gtkkn.native.jsc.jsc_virtual_machine_new

/**
 * JSCVirtualMachine represents a group of JSCContext<!-- -->s. It allows
 * concurrent JavaScript execution by creating a different instance of
 * JSCVirtualMachine in each thread.
 *
 * To create a group of JSCContext<!-- -->s pass the same JSCVirtualMachine
 * instance to every JSCContext constructor.
 */
public class VirtualMachine(public val jscVirtualMachinePointer: CPointer<JSCVirtualMachine>) :
    Object(jscVirtualMachinePointer.reinterpret()),
    KGTyped {
    init {
        JavaScriptCore
    }

    /**
     * Create a new #JSCVirtualMachine.
     *
     * @return the newly created #JSCVirtualMachine.
     */
    public constructor() : this(jsc_virtual_machine_new()!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<VirtualMachine> {
        override val type: GeneratedClassKGType<VirtualMachine> =
            GeneratedClassKGType(getTypeOrNull()!!) { VirtualMachine(it.reinterpret()) }

        init {
            JavaScriptCoreTypeProvider.register()
        }

        /**
         * Get the GType of VirtualMachine
         *
         * @return the GType
         */
        public fun getType(): GType = jsc_virtual_machine_get_type()

        /**
         * Gets the GType of from the symbol `jsc_virtual_machine_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("jsc_virtual_machine_get_type")
    }
}
