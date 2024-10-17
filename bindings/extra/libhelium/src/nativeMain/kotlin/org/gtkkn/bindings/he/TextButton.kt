// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeTextButton
import org.gtkkn.native.he.he_text_button_get_type
import org.gtkkn.native.he.he_text_button_new
import org.gtkkn.native.he.he_text_button_new_from_icon
import kotlin.String

public open class TextButton(
    pointer: CPointer<HeTextButton>,
) : Button(pointer.reinterpret()), KGTyped {
    public val heTextButtonPointer: CPointer<HeTextButton>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param label
     */
    public constructor(label: String) : this(he_text_button_new(label)!!.reinterpret())

    public companion object : TypeCompanion<TextButton> {
        override val type: GeneratedClassKGType<TextButton> =
            GeneratedClassKGType(he_text_button_get_type()) { TextButton(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }

        /**
         *
         *
         * @param label
         */
        public fun new(label: String): TextButton = TextButton(he_text_button_new(label)!!.reinterpret())

        /**
         *
         *
         * @param icon
         */
        public fun fromIcon(icon: String): TextButton = TextButton(he_text_button_new_from_icon(icon)!!.reinterpret())
    }
}
