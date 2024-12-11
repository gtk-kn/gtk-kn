// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_16
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoGravityHint
import org.gtkkn.native.pango.pango_gravity_hint_get_type

/**
 * `PangoGravityHint` defines how horizontal scripts should behave in a
 * vertical context.
 *
 * That is, English excerpts in a vertical paragraph for example.
 *
 * See also [enum@Pango.Gravity]
 * @since 1.16
 */
@PangoVersion1_16
public enum class GravityHint(public val nativeValue: PangoGravityHint) {
    /**
     * scripts will take their natural gravity based
     *   on the base gravity and the script.  This is the default.
     */
    NATURAL(PangoGravityHint.PANGO_GRAVITY_HINT_NATURAL),

    /**
     * always use the base gravity set, regardless of
     *   the script.
     */
    STRONG(PangoGravityHint.PANGO_GRAVITY_HINT_STRONG),

    /**
     * for scripts not in their natural direction (eg.
     *   Latin in East gravity), choose per-script gravity such that every script
     *   respects the line progression. This means, Latin and Arabic will take
     *   opposite gravities and both flow top-to-bottom for example.
     */
    LINE(PangoGravityHint.PANGO_GRAVITY_HINT_LINE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoGravityHint): GravityHint = when (nativeValue) {
            PangoGravityHint.PANGO_GRAVITY_HINT_NATURAL -> NATURAL
            PangoGravityHint.PANGO_GRAVITY_HINT_STRONG -> STRONG
            PangoGravityHint.PANGO_GRAVITY_HINT_LINE -> LINE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of GravityHint
         *
         * @return the GType
         */
        public fun getType(): GType = pango_gravity_hint_get_type()
    }
}
