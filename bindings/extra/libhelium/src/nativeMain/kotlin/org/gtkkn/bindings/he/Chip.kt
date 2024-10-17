// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.ToggleButton
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.he.HeChip
import org.gtkkn.native.he.he_chip_get_chip_label
import org.gtkkn.native.he.he_chip_get_type
import org.gtkkn.native.he.he_chip_new
import org.gtkkn.native.he.he_chip_set_chip_label
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `chip-label`: Property has no getter nor setter
 */
public open class Chip(
    pointer: CPointer<HeChip>,
) : ToggleButton(pointer.reinterpret()), KGTyped {
    public val heChipPointer: CPointer<HeChip>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param label
     */
    public constructor(label: String) : this(he_chip_new(label)!!.reinterpret())

    public open fun getChipLabel(): String =
        he_chip_get_chip_label(heChipPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setChipLabel(`value`: String): Unit = he_chip_set_chip_label(heChipPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<Chip> {
        override val type: GeneratedClassKGType<Chip> =
            GeneratedClassKGType(he_chip_get_type()) {
                Chip(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
