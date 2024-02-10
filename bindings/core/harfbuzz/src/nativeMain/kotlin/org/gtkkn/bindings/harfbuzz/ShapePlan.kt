// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_shape_plan_t

/**
 * Data type for holding a shaping plan.
 *
 * Shape plans contain information about how HarfBuzz will shape a
 * particular text segment, based on the segment's properties and the
 * capabilities in the font face in use.
 *
 * Shape plans can be queried about how shaping will perform, given a set
 * of specific input parameters (script, language, direction, features,
 * etc.).
 */
public class ShapePlan(
    pointer: CPointer<hb_shape_plan_t>,
) : Record {
    public val harfbuzzshape_plan_tPointer: CPointer<hb_shape_plan_t> = pointer

    public companion object : RecordCompanion<ShapePlan, hb_shape_plan_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ShapePlan = ShapePlan(pointer.reinterpret())
    }
}
