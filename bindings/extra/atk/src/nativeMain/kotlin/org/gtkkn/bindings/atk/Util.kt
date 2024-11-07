// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkUtil
import org.gtkkn.native.atk.atk_util_get_type

/**
 * A set of ATK utility functions for event and toolkit support.
 *
 * A set of ATK utility functions which are used to support event
 * registration of various types, and obtaining the 'root' accessible
 * of a process and information about the current ATK implementation
 * and toolkit version.
 */
public open class Util(
    pointer: CPointer<AtkUtil>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val atkUtilPointer: CPointer<AtkUtil>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<Util> {
        override val type: GeneratedClassKGType<Util> =
            GeneratedClassKGType(atk_util_get_type()) { Util(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}
