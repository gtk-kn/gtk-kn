// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeDisclosureButton
import org.gtkkn.native.he.he_disclosure_button_get_icon
import org.gtkkn.native.he.he_disclosure_button_get_type
import org.gtkkn.native.he.he_disclosure_button_new
import org.gtkkn.native.he.he_disclosure_button_new_from_icon
import org.gtkkn.native.he.he_disclosure_button_set_icon
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `icon`: Property has no getter nor setter
 */
public open class DisclosureButton(
    pointer: CPointer<HeDisclosureButton>,
) : Button(pointer.reinterpret()), KGTyped {
    public val heDisclosureButtonPointer: CPointer<HeDisclosureButton>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param icon
     */
    public constructor(icon: String) : this(he_disclosure_button_new(icon)!!.reinterpret())

    public open fun getIcon_(): String =
        he_disclosure_button_get_icon(heDisclosureButtonPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    open override fun setIcon(`value`: String): Unit =
        he_disclosure_button_set_icon(heDisclosureButtonPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<DisclosureButton> {
        override val type: GeneratedClassKGType<DisclosureButton> =
            GeneratedClassKGType(he_disclosure_button_get_type()) {
                DisclosureButton(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }

        /**
         *
         *
         * @param icon
         */
        public fun new(icon: String): DisclosureButton =
            DisclosureButton(he_disclosure_button_new(icon)!!.reinterpret())

        /**
         *
         *
         * @param icon
         */
        public fun fromIcon(icon: String): DisclosureButton =
            DisclosureButton(he_disclosure_button_new_from_icon(icon)!!.reinterpret())
    }
}
