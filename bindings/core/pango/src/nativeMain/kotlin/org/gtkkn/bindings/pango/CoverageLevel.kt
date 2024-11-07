// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoCoverageLevel

/**
 * `PangoCoverageLevel` is used to indicate how well a font can
 * represent a particular Unicode character for a particular script.
 *
 * Since 1.44, only %PANGO_COVERAGE_NONE and %PANGO_COVERAGE_EXACT
 * will be returned.
 */
public enum class CoverageLevel(
    public val nativeValue: PangoCoverageLevel,
) {
    /**
     * The character is not representable with
     *   the font.
     */
    NONE(PangoCoverageLevel.PANGO_COVERAGE_NONE),

    /**
     * The character is represented in a
     *   way that may be comprehensible but is not the correct
     *   graphical form. For instance, a Hangul character represented
     *   as a a sequence of Jamos, or a Latin transliteration of a
     *   Cyrillic word.
     */
    FALLBACK(PangoCoverageLevel.PANGO_COVERAGE_FALLBACK),

    /**
     * The character is represented as
     *   basically the correct graphical form, but with a stylistic
     *   variant inappropriate for the current script.
     */
    APPROXIMATE(PangoCoverageLevel.PANGO_COVERAGE_APPROXIMATE),

    /**
     * The character is represented as the
     *   correct graphical form.
     */
    EXACT(PangoCoverageLevel.PANGO_COVERAGE_EXACT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoCoverageLevel): CoverageLevel =
            when (nativeValue) {
                PangoCoverageLevel.PANGO_COVERAGE_NONE -> NONE
                PangoCoverageLevel.PANGO_COVERAGE_FALLBACK -> FALLBACK
                PangoCoverageLevel.PANGO_COVERAGE_APPROXIMATE -> APPROXIMATE
                PangoCoverageLevel.PANGO_COVERAGE_EXACT -> EXACT
                else -> error("invalid nativeValue")
            }
    }
}
