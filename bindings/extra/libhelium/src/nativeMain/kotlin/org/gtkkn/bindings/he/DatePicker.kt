// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.gtk.Entry
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeDatePicker
import org.gtkkn.native.he.he_date_picker_get_date
import org.gtkkn.native.he.he_date_picker_get_format
import org.gtkkn.native.he.he_date_picker_get_type
import org.gtkkn.native.he.he_date_picker_new
import org.gtkkn.native.he.he_date_picker_new_with_format
import org.gtkkn.native.he.he_date_picker_set_date
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `format`: Property has no getter nor setter
 * - method `date`: Property has no getter nor setter
 */
public open class DatePicker(
    pointer: CPointer<HeDatePicker>,
) : Entry(pointer.reinterpret()), KGTyped {
    public val heDatePickerPointer: CPointer<HeDatePicker>
        get() = gPointer.reinterpret()

    public constructor() : this(he_date_picker_new()!!.reinterpret())

    /**
     *
     *
     * @param format
     */
    public constructor(format: String) :
        this(he_date_picker_new_with_format(format)!!.reinterpret())

    public open fun getFormat(): String =
        he_date_picker_get_format(heDatePickerPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    public open fun getDate(): DateTime =
        he_date_picker_get_date(heDatePickerPointer.reinterpret())!!.run {
            DateTime(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setDate(`value`: DateTime): Unit =
        he_date_picker_set_date(heDatePickerPointer.reinterpret(), `value`.glibDateTimePointer)

    public companion object : TypeCompanion<DatePicker> {
        override val type: GeneratedClassKGType<DatePicker> =
            GeneratedClassKGType(he_date_picker_get_type()) { DatePicker(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
