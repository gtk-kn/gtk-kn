// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GPatternSpec
import org.gtkkn.native.glib.g_pattern_spec_copy
import org.gtkkn.native.glib.g_pattern_spec_equal
import org.gtkkn.native.glib.g_pattern_spec_free
import org.gtkkn.native.glib.g_pattern_spec_match
import org.gtkkn.native.glib.g_pattern_spec_match_string
import org.gtkkn.native.glib.g_pattern_spec_new
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A GPatternSpec struct is the 'compiled' form of a pattern. This
 * structure is opaque and its fields cannot be accessed directly.
 */
public class PatternSpec(
    pointer: CPointer<GPatternSpec>,
) : Record {
    public val glibPatternSpecPointer: CPointer<GPatternSpec> = pointer

    /**
     * Copies @pspec in a new #GPatternSpec.
     *
     * @return a copy of @pspec.
     * @since 2.70
     */
    public fun copy(): PatternSpec =
        g_pattern_spec_copy(glibPatternSpecPointer.reinterpret())!!.run {
            PatternSpec(reinterpret())
        }

    /**
     * Compares two compiled pattern specs and returns whether they will
     * match the same set of strings.
     *
     * @param pspec2 another #GPatternSpec
     * @return Whether the compiled patterns are equal
     */
    public fun equal(pspec2: PatternSpec): Boolean =
        g_pattern_spec_equal(
            glibPatternSpecPointer.reinterpret(),
            pspec2.glibPatternSpecPointer
        ).asBoolean()

    /**
     * Frees the memory allocated for the #GPatternSpec.
     */
    public fun free(): Unit = g_pattern_spec_free(glibPatternSpecPointer.reinterpret())

    /**
     * Matches a string against a compiled pattern. Passing the correct
     * length of the string given is mandatory. The reversed string can be
     * omitted by passing null, this is more efficient if the reversed
     * version of the string to be matched is not at hand, as
     * g_pattern_match() will only construct it if the compiled pattern
     * requires reverse matches.
     *
     * Note that, if the user code will (possibly) match a string against a
     * multitude of patterns containing wildcards, chances are high that
     * some patterns will require a reversed string. In this case, it's
     * more efficient to provide the reversed string to avoid multiple
     * constructions thereof in the various calls to g_pattern_match().
     *
     * Note also that the reverse of a UTF-8 encoded string can in general
     * not be obtained by g_strreverse(). This works only if the string
     * does not contain any multibyte characters. GLib offers the
     * g_utf8_strreverse() function to reverse UTF-8 encoded strings.
     *
     * @param stringLength the length of @string (in bytes, i.e. strlen(),
     *     not g_utf8_strlen())
     * @param string the UTF-8 encoded string to match
     * @param stringReversed the reverse of @string or null
     * @return true if @string matches @pspec
     * @since 2.70
     */
    public fun match(
        stringLength: ULong,
        string: String,
        stringReversed: String? = null,
    ): Boolean =
        g_pattern_spec_match(
            glibPatternSpecPointer.reinterpret(),
            stringLength,
            string,
            stringReversed
        ).asBoolean()

    /**
     * Matches a string against a compiled pattern. If the string is to be
     * matched against more than one pattern, consider using
     * g_pattern_match() instead while supplying the reversed string.
     *
     * @param string the UTF-8 encoded string to match
     * @return true if @string matches @pspec
     * @since 2.70
     */
    public fun matchString(string: String): Boolean =
        g_pattern_spec_match_string(glibPatternSpecPointer.reinterpret(), string).asBoolean()

    public companion object : RecordCompanion<PatternSpec, GPatternSpec> {
        /**
         * Compiles a pattern to a #GPatternSpec.
         *
         * @param pattern a zero-terminated UTF-8 encoded string
         * @return a newly-allocated #GPatternSpec
         */
        public fun new(pattern: String): PatternSpec = PatternSpec(g_pattern_spec_new(pattern)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PatternSpec =
            PatternSpec(pointer.reinterpret())
    }
}
