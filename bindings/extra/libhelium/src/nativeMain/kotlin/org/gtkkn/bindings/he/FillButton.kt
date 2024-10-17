// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeFillButton
import org.gtkkn.native.he.he_fill_button_get_type
import org.gtkkn.native.he.he_fill_button_new
import kotlin.String

public open class FillButton(
    pointer: CPointer<HeFillButton>,
) : Button(pointer.reinterpret()), KGTyped {
    public val heFillButtonPointer: CPointer<HeFillButton>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param label
     */
    public constructor(label: String) : this(he_fill_button_new(label)!!.reinterpret())

    public companion object : TypeCompanion<FillButton> {
        override val type: GeneratedClassKGType<FillButton> =
            GeneratedClassKGType(he_fill_button_get_type()) { FillButton(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
