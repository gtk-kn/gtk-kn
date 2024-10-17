// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeTintButton
import org.gtkkn.native.he.he_tint_button_get_type
import org.gtkkn.native.he.he_tint_button_new
import org.gtkkn.native.he.he_tint_button_new_from_icon
import kotlin.String

public open class TintButton(
    pointer: CPointer<HeTintButton>,
) : Button(pointer.reinterpret()), KGTyped {
    public val heTintButtonPointer: CPointer<HeTintButton>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param label
     */
    public constructor(label: String) : this(he_tint_button_new(label)!!.reinterpret())

    public companion object : TypeCompanion<TintButton> {
        override val type: GeneratedClassKGType<TintButton> =
            GeneratedClassKGType(he_tint_button_get_type()) { TintButton(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }

        /**
         *
         *
         * @param label
         */
        public fun new(label: String): TintButton = TintButton(he_tint_button_new(label)!!.reinterpret())

        /**
         *
         *
         * @param icon
         */
        public fun fromIcon(icon: String): TintButton = TintButton(he_tint_button_new_from_icon(icon)!!.reinterpret())
    }
}
