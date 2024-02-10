// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.harfbuzz.HB_OT_VAR_AXIS_FLAG_HIDDEN
import org.gtkkn.native.harfbuzz.hb_ot_var_axis_flags_t

/**
 *
 * @since 2.2.0
 */
public class OtVarAxisFlags(
    public val mask: hb_ot_var_axis_flags_t,
) : Bitfield<OtVarAxisFlags> {
    override infix fun or(other: OtVarAxisFlags): OtVarAxisFlags = OtVarAxisFlags(mask or other.mask)

    public companion object {
        /**
         * The axis should not be exposed directly in user interfaces.
         */
        public val HIDDEN: OtVarAxisFlags = OtVarAxisFlags(HB_OT_VAR_AXIS_FLAG_HIDDEN)
    }
}
