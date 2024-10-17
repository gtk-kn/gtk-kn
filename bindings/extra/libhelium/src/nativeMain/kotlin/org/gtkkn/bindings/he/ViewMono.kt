// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeViewMono
import org.gtkkn.native.he.he_view_mono_get_type
import org.gtkkn.native.he.he_view_mono_new

public open class ViewMono(
    pointer: CPointer<HeViewMono>,
) : View(pointer.reinterpret()), KGTyped {
    public val heViewMonoPointer: CPointer<HeViewMono>
        get() = gPointer.reinterpret()

    public constructor() : this(he_view_mono_new()!!.reinterpret())

    public companion object : TypeCompanion<ViewMono> {
        override val type: GeneratedClassKGType<ViewMono> =
            GeneratedClassKGType(he_view_mono_get_type()) { ViewMono(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
