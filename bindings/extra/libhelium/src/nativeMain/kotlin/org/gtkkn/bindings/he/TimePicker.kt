// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Entry
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.he.HeTimePicker
import org.gtkkn.native.he.he_time_picker_get_format_12
import org.gtkkn.native.he.he_time_picker_get_format_24
import org.gtkkn.native.he.he_time_picker_get_time
import org.gtkkn.native.he.he_time_picker_get_type
import org.gtkkn.native.he.he_time_picker_new
import org.gtkkn.native.he.he_time_picker_new_with_format
import org.gtkkn.native.he.he_time_picker_set_time
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `format-12`: Property has no getter nor setter
 * - method `format-24`: Property has no getter nor setter
 * - method `time`: Property has no getter nor setter
 */
public open class TimePicker(
    pointer: CPointer<HeTimePicker>,
) : Entry(pointer.reinterpret()), KGTyped {
    public val heTimePickerPointer: CPointer<HeTimePicker>
        get() = gPointer.reinterpret()

    public constructor() : this(he_time_picker_new()!!.reinterpret())

    /**
     *
     *
     * @param format12
     * @param format24
     */
    public constructor(format12: String, format24: String) :
        this(he_time_picker_new_with_format(format12, format24)!!.reinterpret())

    public open fun getFormat12(): String =
        he_time_picker_get_format_12(heTimePickerPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    public open fun getFormat24(): String =
        he_time_picker_get_format_24(heTimePickerPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    public open fun getTime(): DateTime =
        he_time_picker_get_time(heTimePickerPointer.reinterpret())!!.run {
            DateTime(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setTime(`value`: DateTime): Unit =
        he_time_picker_set_time(heTimePickerPointer.reinterpret(), `value`.glibDateTimePointer)

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectTimeChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "time-changed",
            connectTimeChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<TimePicker> {
        override val type: GeneratedClassKGType<TimePicker> =
            GeneratedClassKGType(he_time_picker_get_type()) { TimePicker(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}

private val connectTimeChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
