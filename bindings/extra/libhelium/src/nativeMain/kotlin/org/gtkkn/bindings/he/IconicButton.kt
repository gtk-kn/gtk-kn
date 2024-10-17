// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeIconicButton
import org.gtkkn.native.he.he_iconic_button_get_icon
import org.gtkkn.native.he.he_iconic_button_get_tooltip
import org.gtkkn.native.he.he_iconic_button_get_type
import org.gtkkn.native.he.he_iconic_button_new
import org.gtkkn.native.he.he_iconic_button_set_icon
import org.gtkkn.native.he.he_iconic_button_set_tooltip
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `icon`: Property has no getter nor setter
 * - method `tooltip`: Property has no getter nor setter
 */
public open class IconicButton(
    pointer: CPointer<HeIconicButton>,
) : Button(pointer.reinterpret()), KGTyped {
    public val heIconicButtonPointer: CPointer<HeIconicButton>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param icon
     */
    public constructor(icon: String) : this(he_iconic_button_new(icon)!!.reinterpret())

    public open fun getIcon_(): String =
        he_iconic_button_get_icon(heIconicButtonPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    open override fun setIcon(`value`: String): Unit =
        he_iconic_button_set_icon(heIconicButtonPointer.reinterpret(), `value`)

    public open fun getTooltip(): String =
        he_iconic_button_get_tooltip(heIconicButtonPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTooltip(`value`: String): Unit =
        he_iconic_button_set_tooltip(heIconicButtonPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<IconicButton> {
        override val type: GeneratedClassKGType<IconicButton> =
            GeneratedClassKGType(he_iconic_button_get_type()) { IconicButton(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
