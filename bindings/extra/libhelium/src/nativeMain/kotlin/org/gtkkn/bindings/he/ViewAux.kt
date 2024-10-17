// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeViewAux
import org.gtkkn.native.he.he_view_aux_get_show_aux
import org.gtkkn.native.he.he_view_aux_get_type
import org.gtkkn.native.he.he_view_aux_new
import org.gtkkn.native.he.he_view_aux_set_show_aux
import kotlin.Boolean
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `show-aux`: Property has no getter nor setter
 */
public open class ViewAux(
    pointer: CPointer<HeViewAux>,
) : View(pointer.reinterpret()), KGTyped {
    public val heViewAuxPointer: CPointer<HeViewAux>
        get() = gPointer.reinterpret()

    public constructor() : this(he_view_aux_new()!!.reinterpret())

    public open fun getShowAux(): Boolean = he_view_aux_get_show_aux(heViewAuxPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setShowAux(`value`: Boolean): Unit =
        he_view_aux_set_show_aux(heViewAuxPointer.reinterpret(), `value`.asGBoolean())

    public companion object : TypeCompanion<ViewAux> {
        override val type: GeneratedClassKGType<ViewAux> =
            GeneratedClassKGType(he_view_aux_get_type()) { ViewAux(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
