// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_70
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GPatternSpec
import org.gtkkn.native.glib.g_pattern_spec_copy
import org.gtkkn.native.glib.g_pattern_spec_equal
import org.gtkkn.native.glib.g_pattern_spec_free
import org.gtkkn.native.glib.g_pattern_spec_match
import org.gtkkn.native.glib.g_pattern_spec_match_string
import org.gtkkn.native.glib.g_pattern_spec_new
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_pattern_spec_get_type
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A `GPatternSpec` struct is the 'compiled' form of a glob-style pattern.
 *
 * The [func@GLib.pattern_match_simple] and [method@GLib.PatternSpec.match] functions
 * match a string against a pattern containing '*' and '?' wildcards with similar
 * semantics as the standard `glob()` function: '*' matches an arbitrary,
 * possibly empty, string, '?' matches an arbitrary character.
 *
 * Note that in contrast to `glob()`, the '/' character can be matched by
 * the wildcards, there are no '[]' character ranges and '*' and '?'
 * can not be escaped to include them literally in a pattern.
 *
 * When multiple strings must be matched against the same pattern, it is better
 * to compile the pattern to a [struct@GLib.PatternSpec] using
 * [ctor@GLib.PatternSpec.new] and use [method@GLib.PatternSpec.match_string]
 * instead of [func@GLib.pattern_match_simple]. This avoids the overhead of repeated
 * pattern compilation.
 */
public class PatternSpec(pointer: CPointer<GPatternSpec>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GPatternSpec> = pointer

    /**
     * Copies @pspec in a new #GPatternSpec.
     *
     * @return a copy of @pspec.
     * @since 2.70
     */
    @GLibVersion2_70
    public fun copy(): PatternSpec = g_pattern_spec_copy(gPointer)!!.run {
        PatternSpec(this)
    }

    /**
     * Compares two compiled pattern specs and returns whether they will
     * match the same set of strings.
     *
     * @param pspec2 another #GPatternSpec
     * @return Whether the compiled patterns are equal
     */
    public fun equal(pspec2: PatternSpec): Boolean = g_pattern_spec_equal(gPointer, pspec2.gPointer).asBoolean()

    /**
     * Frees the memory allocated for the #GPatternSpec.
     */
    public fun free(): Unit = g_pattern_spec_free(gPointer)

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
    @GLibVersion2_70
    public fun match(stringLength: gsize, string: String, stringReversed: String? = null): Boolean =
        g_pattern_spec_match(gPointer, stringLength, string, stringReversed).asBoolean()

    /**
     * Matches a string against a compiled pattern. If the string is to be
     * matched against more than one pattern, consider using
     * g_pattern_match() instead while supplying the reversed string.
     *
     * @param string the UTF-8 encoded string to match
     * @return true if @string matches @pspec
     * @since 2.70
     */
    @GLibVersion2_70
    public fun matchString(string: String): Boolean = g_pattern_spec_match_string(gPointer, string).asBoolean()

    public companion object {
        /**
         * Compiles a pattern to a #GPatternSpec.
         *
         * @param pattern a zero-terminated UTF-8 encoded string
         * @return a newly-allocated #GPatternSpec
         */
        public fun new(pattern: String): PatternSpec = PatternSpec(g_pattern_spec_new(pattern)!!.reinterpret())

        /**
         * Get the GType of PatternSpec
         *
         * @return the GType
         */
        public fun getType(): GType = g_pattern_spec_get_type()
    }
}
