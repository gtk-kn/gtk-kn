// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeButton
import org.gtkkn.native.he.he_button_get_color
import org.gtkkn.native.he.he_button_get_icon
import org.gtkkn.native.he.he_button_get_type
import org.gtkkn.native.he.he_button_set_color
import org.gtkkn.native.he.he_button_set_icon
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `color`: Property has no getter nor setter
 * - method `icon`: Property has no getter nor setter
 */
public open class Button(
    pointer: CPointer<HeButton>,
) : org.gtkkn.bindings.gtk.Button(pointer.reinterpret()), KGTyped {
    public val heButtonPointer: CPointer<HeButton>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public open fun getColor_(): Colors =
        he_button_get_color(heButtonPointer.reinterpret()).run {
            Colors.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setColor(`value`: Colors): Unit =
        he_button_set_color(heButtonPointer.reinterpret(), `value`.nativeValue)

    public open fun getIcon(): String =
        he_button_get_icon(heButtonPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setIcon(`value`: String): Unit = he_button_set_icon(heButtonPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<Button> {
        override val type: GeneratedClassKGType<Button> =
            GeneratedClassKGType(he_button_get_type()) { Button(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
