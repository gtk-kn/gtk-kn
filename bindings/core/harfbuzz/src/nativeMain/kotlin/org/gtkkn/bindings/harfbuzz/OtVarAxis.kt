// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_ot_var_axis_t
import kotlin.Float

/**
 * ## Skipped during bindings generation
 *
 * - field `tag`: tag_t
 * - field `name_id`: ot_name_id_t
 *
 * @since 1.4.2
 */
public class OtVarAxis(
    pointer: CPointer<hb_ot_var_axis_t>,
) : Record {
    public val harfbuzzot_var_axis_tPointer: CPointer<hb_ot_var_axis_t> = pointer

    public var minValue: Float
        get() = harfbuzzot_var_axis_tPointer.pointed.min_value
        set(`value`) {
            harfbuzzot_var_axis_tPointer.pointed.min_value = value
        }

    public var defaultValue: Float
        get() = harfbuzzot_var_axis_tPointer.pointed.default_value
        set(`value`) {
            harfbuzzot_var_axis_tPointer.pointed.default_value = value
        }

    public var maxValue: Float
        get() = harfbuzzot_var_axis_tPointer.pointed.max_value
        set(`value`) {
            harfbuzzot_var_axis_tPointer.pointed.max_value = value
        }

    public companion object : RecordCompanion<OtVarAxis, hb_ot_var_axis_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): OtVarAxis = OtVarAxis(pointer.reinterpret())
    }
}
