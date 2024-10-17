// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeOutlineButton
import org.gtkkn.native.he.he_outline_button_get_type
import org.gtkkn.native.he.he_outline_button_new
import kotlin.String

public open class OutlineButton(
    pointer: CPointer<HeOutlineButton>,
) : Button(pointer.reinterpret()), KGTyped {
    public val heOutlineButtonPointer: CPointer<HeOutlineButton>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param label
     */
    public constructor(label: String) : this(he_outline_button_new(label)!!.reinterpret())

    public companion object : TypeCompanion<OutlineButton> {
        override val type: GeneratedClassKGType<OutlineButton> =
            GeneratedClassKGType(he_outline_button_get_type()) {
                OutlineButton(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
