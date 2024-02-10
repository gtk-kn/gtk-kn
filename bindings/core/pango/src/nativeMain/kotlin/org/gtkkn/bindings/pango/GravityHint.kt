// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoGravityHint
import org.gtkkn.native.pango.PangoGravityHint.PANGO_GRAVITY_HINT_LINE
import org.gtkkn.native.pango.PangoGravityHint.PANGO_GRAVITY_HINT_NATURAL
import org.gtkkn.native.pango.PangoGravityHint.PANGO_GRAVITY_HINT_STRONG

/**
 * `PangoGravityHint` defines how horizontal scripts should behave in a
 * vertical context.
 *
 * That is, English excerpts in a vertical paragraph for example.
 *
 * See also [enum@Pango.Gravity]
 * @since 1.16
 */
public enum class GravityHint(
    public val nativeValue: PangoGravityHint,
) {
    /**
     * scripts will take their natural gravity based
     *   on the base gravity and the script.  This is the default.
     */
    NATURAL(PANGO_GRAVITY_HINT_NATURAL),

    /**
     * always use the base gravity set, regardless of
     *   the script.
     */
    STRONG(PANGO_GRAVITY_HINT_STRONG),

    /**
     * for scripts not in their natural direction (eg.
     *   Latin in East gravity), choose per-script gravity such that every script
     *   respects the line progression. This means, Latin and Arabic will take
     *   opposite gravities and both flow top-to-bottom for example.
     */
    LINE(PANGO_GRAVITY_HINT_LINE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoGravityHint): GravityHint =
            when (nativeValue) {
                PANGO_GRAVITY_HINT_NATURAL -> NATURAL
                PANGO_GRAVITY_HINT_STRONG -> STRONG
                PANGO_GRAVITY_HINT_LINE -> LINE
                else -> error("invalid nativeValue")
            }
    }
}
