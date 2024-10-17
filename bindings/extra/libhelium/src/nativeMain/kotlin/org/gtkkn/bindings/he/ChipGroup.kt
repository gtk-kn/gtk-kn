// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.SingleSelection
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeChipGroup
import org.gtkkn.native.he.he_chip_group_get_selection_model
import org.gtkkn.native.he.he_chip_group_get_single_line
import org.gtkkn.native.he.he_chip_group_get_type
import org.gtkkn.native.he.he_chip_group_new
import org.gtkkn.native.he.he_chip_group_set_selection_model
import org.gtkkn.native.he.he_chip_group_set_single_line
import kotlin.Boolean
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `selection-model`: Property has no getter nor setter
 * - method `single-line`: Property has no getter nor setter
 */
public open class ChipGroup(
    pointer: CPointer<HeChipGroup>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heChipGroupPointer: CPointer<HeChipGroup>
        get() = gPointer.reinterpret()

    public constructor() : this(he_chip_group_new()!!.reinterpret())

    public open fun getSelectionModel(): SingleSelection =
        he_chip_group_get_selection_model(heChipGroupPointer.reinterpret())!!.run {
            SingleSelection(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setSelectionModel(`value`: SingleSelection): Unit =
        he_chip_group_set_selection_model(
            heChipGroupPointer.reinterpret(),
            `value`.gtkSingleSelectionPointer.reinterpret()
        )

    public open fun getSingleLine(): Boolean =
        he_chip_group_get_single_line(heChipGroupPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setSingleLine(`value`: Boolean): Unit =
        he_chip_group_set_single_line(heChipGroupPointer.reinterpret(), `value`.asGBoolean())

    public companion object : TypeCompanion<ChipGroup> {
        override val type: GeneratedClassKGType<ChipGroup> =
            GeneratedClassKGType(he_chip_group_get_type()) { ChipGroup(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
