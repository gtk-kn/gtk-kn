// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.pango.annotations.PangoVersion1_16
import org.gtkkn.bindings.pango.annotations.PangoVersion1_26
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gdouble
import org.gtkkn.native.pango.PangoGravity
import org.gtkkn.native.pango.pango_gravity_get_for_matrix
import org.gtkkn.native.pango.pango_gravity_get_for_script
import org.gtkkn.native.pango.pango_gravity_get_for_script_and_width
import org.gtkkn.native.pango.pango_gravity_get_type
import org.gtkkn.native.pango.pango_gravity_to_rotation
import kotlin.Boolean

/**
 * `PangoGravity` represents the orientation of glyphs in a segment
 * of text.
 *
 * This is useful when rendering vertical text layouts. In those situations,
 * the layout is rotated using a non-identity [struct@Pango.Matrix], and then
 * glyph orientation is controlled using `PangoGravity`.
 *
 * Not every value in this enumeration makes sense for every usage of
 * `PangoGravity`; for example, %PANGO_GRAVITY_AUTO only can be passed to
 * [method@Pango.Context.set_base_gravity] and can only be returned by
 * [method@Pango.Context.get_base_gravity].
 *
 * See also: [enum@Pango.GravityHint]
 * @since 1.16
 */
@PangoVersion1_16
public enum class Gravity(public val nativeValue: PangoGravity) {
    /**
     * Glyphs stand upright (default) <img align="right" valign="center" src="m-south.png">
     */
    SOUTH(PangoGravity.PANGO_GRAVITY_SOUTH),

    /**
     * Glyphs are rotated 90 degrees counter-clockwise. <img align="right" valign="center" src="m-east.png">
     */
    EAST(PangoGravity.PANGO_GRAVITY_EAST),

    /**
     * Glyphs are upside-down. <img align="right" valign="cener" src="m-north.png">
     */
    NORTH(PangoGravity.PANGO_GRAVITY_NORTH),

    /**
     * Glyphs are rotated 90 degrees clockwise. <img align="right" valign="center" src="m-west.png">
     */
    WEST(PangoGravity.PANGO_GRAVITY_WEST),

    /**
     * Gravity is resolved from the context matrix
     */
    AUTO(PangoGravity.PANGO_GRAVITY_AUTO),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoGravity): Gravity = when (nativeValue) {
            PangoGravity.PANGO_GRAVITY_SOUTH -> SOUTH
            PangoGravity.PANGO_GRAVITY_EAST -> EAST
            PangoGravity.PANGO_GRAVITY_NORTH -> NORTH
            PangoGravity.PANGO_GRAVITY_WEST -> WEST
            PangoGravity.PANGO_GRAVITY_AUTO -> AUTO
            else -> error("invalid nativeValue")
        }

        /**
         * Finds the gravity that best matches the rotation component
         * in a `PangoMatrix`.
         *
         * @param matrix a `PangoMatrix`
         * @return the gravity of @matrix, which will never be
         * %PANGO_GRAVITY_AUTO, or %PANGO_GRAVITY_SOUTH if @matrix is null
         * @since 1.16
         */
        @PangoVersion1_16
        public fun getForMatrix(matrix: Matrix? = null): Gravity =
            pango_gravity_get_for_matrix(matrix?.pangoMatrixPointer?.reinterpret()).run {
                Gravity.fromNativeValue(this)
            }

        /**
         * Returns the gravity to use in laying out a `PangoItem`.
         *
         * The gravity is determined based on the script, base gravity, and hint.
         *
         * If @base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
         * preferred gravity of @script.  To get the preferred gravity of a script,
         * pass %PANGO_GRAVITY_AUTO and %PANGO_GRAVITY_HINT_STRONG in.
         *
         * @param script `PangoScript` to query
         * @param baseGravity base gravity of the paragraph
         * @param hint orientation hint
         * @return resolved gravity suitable to use for a run of text
         * with @script
         * @since 1.16
         */
        @PangoVersion1_16
        public fun getForScript(script: Script, baseGravity: Gravity, hint: GravityHint): Gravity =
            pango_gravity_get_for_script(script.nativeValue, baseGravity.nativeValue, hint.nativeValue).run {
                Gravity.fromNativeValue(this)
            }

        /**
         * Returns the gravity to use in laying out a single character
         * or `PangoItem`.
         *
         * The gravity is determined based on the script, East Asian width,
         * base gravity, and hint,
         *
         * This function is similar to [func@Pango.Gravity.get_for_script] except
         * that this function makes a distinction between narrow/half-width and
         * wide/full-width characters also. Wide/full-width characters always
         * stand *upright*, that is, they always take the base gravity,
         * whereas narrow/full-width characters are always rotated in vertical
         * context.
         *
         * If @base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
         * preferred gravity of @script.
         *
         * @param script `PangoScript` to query
         * @param wide true for wide characters as returned by g_unichar_iswide()
         * @param baseGravity base gravity of the paragraph
         * @param hint orientation hint
         * @return resolved gravity suitable to use for a run of text
         * with @script and @wide.
         * @since 1.26
         */
        @PangoVersion1_26
        public fun getForScriptAndWidth(
            script: Script,
            wide: Boolean,
            baseGravity: Gravity,
            hint: GravityHint,
        ): Gravity = pango_gravity_get_for_script_and_width(
            script.nativeValue,
            wide.asGBoolean(),
            baseGravity.nativeValue,
            hint.nativeValue
        ).run {
            Gravity.fromNativeValue(this)
        }

        /**
         * Converts a `PangoGravity` value to its natural rotation in radians.
         *
         * Note that [method@Pango.Matrix.rotate] takes angle in degrees, not radians.
         * So, to call [method@Pango.Matrix,rotate] with the output of this function
         * you should multiply it by (180. / G_PI).
         *
         * @param gravity gravity to query, should not be %PANGO_GRAVITY_AUTO
         * @return the rotation value corresponding to @gravity.
         * @since 1.16
         */
        @PangoVersion1_16
        public fun toRotation(gravity: Gravity): gdouble = pango_gravity_to_rotation(gravity.nativeValue)

        /**
         * Get the GType of Gravity
         *
         * @return the GType
         */
        public fun getType(): GType = pango_gravity_get_type()
    }
}
