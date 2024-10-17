// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HePillButton
import org.gtkkn.native.he.he_pill_button_get_type
import org.gtkkn.native.he.he_pill_button_new
import kotlin.String

public open class PillButton(
    pointer: CPointer<HePillButton>,
) : Button(pointer.reinterpret()), KGTyped {
    public val hePillButtonPointer: CPointer<HePillButton>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param label
     */
    public constructor(label: String) : this(he_pill_button_new(label)!!.reinterpret())

    public companion object : TypeCompanion<PillButton> {
        override val type: GeneratedClassKGType<PillButton> =
            GeneratedClassKGType(he_pill_button_get_type()) { PillButton(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
