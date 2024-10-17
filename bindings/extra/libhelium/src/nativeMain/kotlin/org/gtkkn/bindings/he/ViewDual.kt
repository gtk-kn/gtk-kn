// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeViewDual
import org.gtkkn.native.he.he_view_dual_get_type
import org.gtkkn.native.he.he_view_dual_new

public open class ViewDual(
    pointer: CPointer<HeViewDual>,
) : View(pointer.reinterpret()), KGTyped {
    public val heViewDualPointer: CPointer<HeViewDual>
        get() = gPointer.reinterpret()

    public constructor() : this(he_view_dual_new()!!.reinterpret())

    public companion object : TypeCompanion<ViewDual> {
        override val type: GeneratedClassKGType<ViewDual> =
            GeneratedClassKGType(he_view_dual_get_type()) { ViewDual(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
