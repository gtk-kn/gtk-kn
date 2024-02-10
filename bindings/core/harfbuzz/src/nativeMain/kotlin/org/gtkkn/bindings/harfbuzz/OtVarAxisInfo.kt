// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_ot_var_axis_info_t
import kotlin.Float
import kotlin.UInt

/**
 * Data type for holding variation-axis values.
 *
 * The minimum, default, and maximum values are in un-normalized, user scales.
 *
 * <note>Note: at present, the only flag defined for @flags is
 * #HB_OT_VAR_AXIS_FLAG_HIDDEN.</note>
 *
 * ## Skipped during bindings generation
 *
 * - field `tag`: tag_t
 * - field `name_id`: ot_name_id_t
 * - field `reserved`: Record field reserved is private
 *
 * @since 2.2.0
 */
public class OtVarAxisInfo(
    pointer: CPointer<hb_ot_var_axis_info_t>,
) : Record {
    public val harfbuzzot_var_axis_info_tPointer: CPointer<hb_ot_var_axis_info_t> = pointer

    /**
     * Index of the axis in the variation-axis array
     */
    public var axisIndex: UInt
        get() = harfbuzzot_var_axis_info_tPointer.pointed.axis_index
        set(`value`) {
            harfbuzzot_var_axis_info_tPointer.pointed.axis_index = value
        }

    /**
     * The #hb_ot_var_axis_flags_t flags for the axis
     */
    public var flags: OtVarAxisFlags
        get() =
            harfbuzzot_var_axis_info_tPointer.pointed.flags.run {
                OtVarAxisFlags(this)
            }
        set(`value`) {
            harfbuzzot_var_axis_info_tPointer.pointed.flags = value.mask
        }

    /**
     * The mininum value on the variation axis that the font covers
     */
    public var minValue: Float
        get() = harfbuzzot_var_axis_info_tPointer.pointed.min_value
        set(`value`) {
            harfbuzzot_var_axis_info_tPointer.pointed.min_value = value
        }

    /**
     * The position on the variation axis corresponding to the font's defaults
     */
    public var defaultValue: Float
        get() = harfbuzzot_var_axis_info_tPointer.pointed.default_value
        set(`value`) {
            harfbuzzot_var_axis_info_tPointer.pointed.default_value = value
        }

    /**
     * The maximum value on the variation axis that the font covers
     */
    public var maxValue: Float
        get() = harfbuzzot_var_axis_info_tPointer.pointed.max_value
        set(`value`) {
            harfbuzzot_var_axis_info_tPointer.pointed.max_value = value
        }

    public companion object : RecordCompanion<OtVarAxisInfo, hb_ot_var_axis_info_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): OtVarAxisInfo =
            OtVarAxisInfo(pointer.reinterpret())
    }
}
