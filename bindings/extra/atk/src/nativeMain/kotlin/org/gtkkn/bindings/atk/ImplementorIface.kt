// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkImplementorIface
import org.gtkkn.native.atk.atk_implementor_get_type

/**
 * The AtkImplementor interface is implemented by objects for which
 * AtkObject peers may be obtained via calls to
 * iface->(ref_accessible)(implementor);
 */
public interface ImplementorIface :
    Interface,
    KGTyped {
    public val atkImplementorIfacePointer: CPointer<AtkImplementorIface>

    private data class Wrapper(
        private val pointer: CPointer<AtkImplementorIface>,
    ) : ImplementorIface {
        override val atkImplementorIfacePointer: CPointer<AtkImplementorIface> = pointer
    }

    public companion object : TypeCompanion<ImplementorIface> {
        override val type: GeneratedInterfaceKGType<ImplementorIface> =
            GeneratedInterfaceKGType(atk_implementor_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkImplementorIface>): ImplementorIface = Wrapper(pointer)
    }
}
