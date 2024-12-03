// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.native.glib.GRegexError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by regular expressions functions.
 * @since 2.14
 */
@GLibVersion2_14
public enum class RegexError(public val nativeValue: GRegexError) {
    /**
     * Compilation of the regular expression failed.
     */
    COMPILE(GRegexError.G_REGEX_ERROR_COMPILE),

    /**
     * Optimization of the regular expression failed.
     */
    OPTIMIZE(GRegexError.G_REGEX_ERROR_OPTIMIZE),

    /**
     * Replacement failed due to an ill-formed replacement
     *     string.
     */
    REPLACE(GRegexError.G_REGEX_ERROR_REPLACE),

    /**
     * The match process failed.
     */
    MATCH(GRegexError.G_REGEX_ERROR_MATCH),

    /**
     * Internal error of the regular expression engine.
     *     Since 2.16
     */
    INTERNAL(GRegexError.G_REGEX_ERROR_INTERNAL),

    /**
     * "\\" at end of pattern. Since 2.16
     */
    STRAY_BACKSLASH(GRegexError.G_REGEX_ERROR_STRAY_BACKSLASH),

    /**
     * "\\c" at end of pattern. Since 2.16
     */
    MISSING_CONTROL_CHAR(GRegexError.G_REGEX_ERROR_MISSING_CONTROL_CHAR),

    /**
     * Unrecognized character follows "\\".
     *     Since 2.16
     */
    UNRECOGNIZED_ESCAPE(GRegexError.G_REGEX_ERROR_UNRECOGNIZED_ESCAPE),

    /**
     * Numbers out of order in "{}"
     *     quantifier. Since 2.16
     */
    QUANTIFIERS_OUT_OF_ORDER(GRegexError.G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER),

    /**
     * Number too big in "{}" quantifier.
     *     Since 2.16
     */
    QUANTIFIER_TOO_BIG(GRegexError.G_REGEX_ERROR_QUANTIFIER_TOO_BIG),

    /**
     * Missing terminating "]" for
     *     character class. Since 2.16
     */
    UNTERMINATED_CHARACTER_CLASS(GRegexError.G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS),

    /**
     * Invalid escape sequence
     *     in character class. Since 2.16
     */
    INVALID_ESCAPE_IN_CHARACTER_CLASS(GRegexError.G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS),

    /**
     * Range out of order in character class.
     *     Since 2.16
     */
    RANGE_OUT_OF_ORDER(GRegexError.G_REGEX_ERROR_RANGE_OUT_OF_ORDER),

    /**
     * Nothing to repeat. Since 2.16
     */
    NOTHING_TO_REPEAT(GRegexError.G_REGEX_ERROR_NOTHING_TO_REPEAT),

    /**
     * Unrecognized character after "(?",
     *     "(?<" or "(?P". Since 2.16
     */
    UNRECOGNIZED_CHARACTER(GRegexError.G_REGEX_ERROR_UNRECOGNIZED_CHARACTER),

    /**
     * POSIX named classes are
     *     supported only within a class. Since 2.16
     */
    POSIX_NAMED_CLASS_OUTSIDE_CLASS(GRegexError.G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS),

    /**
     * Missing terminating ")" or ")"
     *     without opening "(". Since 2.16
     */
    UNMATCHED_PARENTHESIS(GRegexError.G_REGEX_ERROR_UNMATCHED_PARENTHESIS),

    /**
     * Reference to non-existent
     *     subpattern. Since 2.16
     */
    INEXISTENT_SUBPATTERN_REFERENCE(GRegexError.G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE),

    /**
     * Missing terminating ")" after comment.
     *     Since 2.16
     */
    UNTERMINATED_COMMENT(GRegexError.G_REGEX_ERROR_UNTERMINATED_COMMENT),

    /**
     * Regular expression too large.
     *     Since 2.16
     */
    EXPRESSION_TOO_LARGE(GRegexError.G_REGEX_ERROR_EXPRESSION_TOO_LARGE),

    /**
     * Failed to get memory. Since 2.16
     */
    MEMORY_ERROR(GRegexError.G_REGEX_ERROR_MEMORY_ERROR),

    /**
     * Lookbehind assertion is not
     *     fixed length. Since 2.16
     */
    VARIABLE_LENGTH_LOOKBEHIND(GRegexError.G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND),

    /**
     * Malformed number or name after "(?(".
     *     Since 2.16
     */
    MALFORMED_CONDITION(GRegexError.G_REGEX_ERROR_MALFORMED_CONDITION),

    /**
     * Conditional group contains
     *     more than two branches. Since 2.16
     */
    TOO_MANY_CONDITIONAL_BRANCHES(GRegexError.G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES),

    /**
     * Assertion expected after "(?(".
     *     Since 2.16
     */
    ASSERTION_EXPECTED(GRegexError.G_REGEX_ERROR_ASSERTION_EXPECTED),

    /**
     * Unknown POSIX class name.
     *     Since 2.16
     */
    UNKNOWN_POSIX_CLASS_NAME(GRegexError.G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME),

    /**
     * POSIX collating
     *     elements are not supported. Since 2.16
     */
    POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED(GRegexError.G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED),

    /**
     * Character value in "\\x{...}" sequence
     *     is too large. Since 2.16
     */
    HEX_CODE_TOO_LARGE(GRegexError.G_REGEX_ERROR_HEX_CODE_TOO_LARGE),

    /**
     * Invalid condition "(?(0)". Since 2.16
     */
    INVALID_CONDITION(GRegexError.G_REGEX_ERROR_INVALID_CONDITION),

    /**
     * \\C not allowed in
     *     lookbehind assertion. Since 2.16
     */
    SINGLE_BYTE_MATCH_IN_LOOKBEHIND(GRegexError.G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND),

    /**
     * Recursive call could loop indefinitely.
     *     Since 2.16
     */
    INFINITE_LOOP(GRegexError.G_REGEX_ERROR_INFINITE_LOOP),

    /**
     * Missing terminator
     *     in subpattern name. Since 2.16
     */
    MISSING_SUBPATTERN_NAME_TERMINATOR(GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR),

    /**
     * Two named subpatterns have
     *     the same name. Since 2.16
     */
    DUPLICATE_SUBPATTERN_NAME(GRegexError.G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME),

    /**
     * Malformed "\\P" or "\\p" sequence.
     *     Since 2.16
     */
    MALFORMED_PROPERTY(GRegexError.G_REGEX_ERROR_MALFORMED_PROPERTY),

    /**
     * Unknown property name after "\\P" or
     *     "\\p". Since 2.16
     */
    UNKNOWN_PROPERTY(GRegexError.G_REGEX_ERROR_UNKNOWN_PROPERTY),

    /**
     * Subpattern name is too long
     *     (maximum 32 characters). Since 2.16
     */
    SUBPATTERN_NAME_TOO_LONG(GRegexError.G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG),

    /**
     * Too many named subpatterns (maximum
     *     10,000). Since 2.16
     */
    TOO_MANY_SUBPATTERNS(GRegexError.G_REGEX_ERROR_TOO_MANY_SUBPATTERNS),

    /**
     * Octal value is greater than "\\377".
     *     Since 2.16
     */
    INVALID_OCTAL_VALUE(GRegexError.G_REGEX_ERROR_INVALID_OCTAL_VALUE),

    /**
     * "DEFINE" group contains more
     *     than one branch. Since 2.16
     */
    TOO_MANY_BRANCHES_IN_DEFINE(GRegexError.G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE),

    /**
     * Repeating a "DEFINE" group is not allowed.
     *     This error is never raised. Since: 2.16 Deprecated: 2.34
     */
    DEFINE_REPETION(GRegexError.G_REGEX_ERROR_DEFINE_REPETION),

    /**
     * Inconsistent newline options.
     *     Since 2.16
     */
    INCONSISTENT_NEWLINE_OPTIONS(GRegexError.G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS),

    /**
     * "\\g" is not followed by a braced,
     *      angle-bracketed, or quoted name or number, or by a plain number. Since: 2.16
     */
    MISSING_BACK_REFERENCE(GRegexError.G_REGEX_ERROR_MISSING_BACK_REFERENCE),

    /**
     * relative reference must not be zero. Since: 2.34
     */
    INVALID_RELATIVE_REFERENCE(GRegexError.G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE),

    /**
     * the backtracing
     *     control verb used does not allow an argument. Since: 2.34
     */
    BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN(
        GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN
    ),

    /**
     * unknown backtracing
     *     control verb. Since: 2.34
     */
    UNKNOWN_BACKTRACKING_CONTROL_VERB(GRegexError.G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB),

    /**
     * number is too big in escape sequence. Since: 2.34
     */
    NUMBER_TOO_BIG(GRegexError.G_REGEX_ERROR_NUMBER_TOO_BIG),

    /**
     * Missing subpattern name. Since: 2.34
     */
    MISSING_SUBPATTERN_NAME(GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME),

    /**
     * Missing digit. Since 2.34
     */
    MISSING_DIGIT(GRegexError.G_REGEX_ERROR_MISSING_DIGIT),

    /**
     * In JavaScript compatibility mode,
     *     "[" is an invalid data character. Since: 2.34
     */
    INVALID_DATA_CHARACTER(GRegexError.G_REGEX_ERROR_INVALID_DATA_CHARACTER),

    /**
     * different names for subpatterns of the
     *     same number are not allowed. Since: 2.34
     */
    EXTRA_SUBPATTERN_NAME(GRegexError.G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME),

    /**
     * the backtracing control
     *     verb requires an argument. Since: 2.34
     */
    BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED(GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED),

    /**
     * "\\c" must be followed by an ASCII
     *     character. Since: 2.34
     */
    INVALID_CONTROL_CHAR(GRegexError.G_REGEX_ERROR_INVALID_CONTROL_CHAR),

    /**
     * "\\k" is not followed by a braced, angle-bracketed, or
     *     quoted name. Since: 2.34
     */
    MISSING_NAME(GRegexError.G_REGEX_ERROR_MISSING_NAME),

    /**
     * "\\N" is not supported in a class. Since: 2.34
     */
    NOT_SUPPORTED_IN_CLASS(GRegexError.G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS),

    /**
     * too many forward references. Since: 2.34
     */
    TOO_MANY_FORWARD_REFERENCES(GRegexError.G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES),

    /**
     * the name is too long in "(*MARK)", "(*PRUNE)",
     *     "(*SKIP)", or "(*THEN)". Since: 2.34
     */
    NAME_TOO_LONG(GRegexError.G_REGEX_ERROR_NAME_TOO_LONG),

    /**
     * the character value in the \\u sequence is
     *     too large. Since: 2.34
     */
    CHARACTER_VALUE_TOO_LARGE(GRegexError.G_REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GRegexError): RegexError = when (nativeValue) {
            GRegexError.G_REGEX_ERROR_COMPILE -> COMPILE
            GRegexError.G_REGEX_ERROR_OPTIMIZE -> OPTIMIZE
            GRegexError.G_REGEX_ERROR_REPLACE -> REPLACE
            GRegexError.G_REGEX_ERROR_MATCH -> MATCH
            GRegexError.G_REGEX_ERROR_INTERNAL -> INTERNAL
            GRegexError.G_REGEX_ERROR_STRAY_BACKSLASH -> STRAY_BACKSLASH
            GRegexError.G_REGEX_ERROR_MISSING_CONTROL_CHAR -> MISSING_CONTROL_CHAR
            GRegexError.G_REGEX_ERROR_UNRECOGNIZED_ESCAPE -> UNRECOGNIZED_ESCAPE
            GRegexError.G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER -> QUANTIFIERS_OUT_OF_ORDER
            GRegexError.G_REGEX_ERROR_QUANTIFIER_TOO_BIG -> QUANTIFIER_TOO_BIG
            GRegexError.G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS -> UNTERMINATED_CHARACTER_CLASS
            GRegexError.G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS -> INVALID_ESCAPE_IN_CHARACTER_CLASS
            GRegexError.G_REGEX_ERROR_RANGE_OUT_OF_ORDER -> RANGE_OUT_OF_ORDER
            GRegexError.G_REGEX_ERROR_NOTHING_TO_REPEAT -> NOTHING_TO_REPEAT
            GRegexError.G_REGEX_ERROR_UNRECOGNIZED_CHARACTER -> UNRECOGNIZED_CHARACTER
            GRegexError.G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS -> POSIX_NAMED_CLASS_OUTSIDE_CLASS
            GRegexError.G_REGEX_ERROR_UNMATCHED_PARENTHESIS -> UNMATCHED_PARENTHESIS
            GRegexError.G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE -> INEXISTENT_SUBPATTERN_REFERENCE
            GRegexError.G_REGEX_ERROR_UNTERMINATED_COMMENT -> UNTERMINATED_COMMENT
            GRegexError.G_REGEX_ERROR_EXPRESSION_TOO_LARGE -> EXPRESSION_TOO_LARGE
            GRegexError.G_REGEX_ERROR_MEMORY_ERROR -> MEMORY_ERROR
            GRegexError.G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND -> VARIABLE_LENGTH_LOOKBEHIND
            GRegexError.G_REGEX_ERROR_MALFORMED_CONDITION -> MALFORMED_CONDITION
            GRegexError.G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES -> TOO_MANY_CONDITIONAL_BRANCHES
            GRegexError.G_REGEX_ERROR_ASSERTION_EXPECTED -> ASSERTION_EXPECTED
            GRegexError.G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME -> UNKNOWN_POSIX_CLASS_NAME
            GRegexError.G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED -> POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED
            GRegexError.G_REGEX_ERROR_HEX_CODE_TOO_LARGE -> HEX_CODE_TOO_LARGE
            GRegexError.G_REGEX_ERROR_INVALID_CONDITION -> INVALID_CONDITION
            GRegexError.G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND -> SINGLE_BYTE_MATCH_IN_LOOKBEHIND
            GRegexError.G_REGEX_ERROR_INFINITE_LOOP -> INFINITE_LOOP
            GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR -> MISSING_SUBPATTERN_NAME_TERMINATOR
            GRegexError.G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME -> DUPLICATE_SUBPATTERN_NAME
            GRegexError.G_REGEX_ERROR_MALFORMED_PROPERTY -> MALFORMED_PROPERTY
            GRegexError.G_REGEX_ERROR_UNKNOWN_PROPERTY -> UNKNOWN_PROPERTY
            GRegexError.G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG -> SUBPATTERN_NAME_TOO_LONG
            GRegexError.G_REGEX_ERROR_TOO_MANY_SUBPATTERNS -> TOO_MANY_SUBPATTERNS
            GRegexError.G_REGEX_ERROR_INVALID_OCTAL_VALUE -> INVALID_OCTAL_VALUE
            GRegexError.G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE -> TOO_MANY_BRANCHES_IN_DEFINE
            GRegexError.G_REGEX_ERROR_DEFINE_REPETION -> DEFINE_REPETION
            GRegexError.G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS -> INCONSISTENT_NEWLINE_OPTIONS
            GRegexError.G_REGEX_ERROR_MISSING_BACK_REFERENCE -> MISSING_BACK_REFERENCE
            GRegexError.G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE -> INVALID_RELATIVE_REFERENCE
            GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN -> BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN
            GRegexError.G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB -> UNKNOWN_BACKTRACKING_CONTROL_VERB
            GRegexError.G_REGEX_ERROR_NUMBER_TOO_BIG -> NUMBER_TOO_BIG
            GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME -> MISSING_SUBPATTERN_NAME
            GRegexError.G_REGEX_ERROR_MISSING_DIGIT -> MISSING_DIGIT
            GRegexError.G_REGEX_ERROR_INVALID_DATA_CHARACTER -> INVALID_DATA_CHARACTER
            GRegexError.G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME -> EXTRA_SUBPATTERN_NAME
            GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED -> BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED
            GRegexError.G_REGEX_ERROR_INVALID_CONTROL_CHAR -> INVALID_CONTROL_CHAR
            GRegexError.G_REGEX_ERROR_MISSING_NAME -> MISSING_NAME
            GRegexError.G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS -> NOT_SUPPORTED_IN_CLASS
            GRegexError.G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES -> TOO_MANY_FORWARD_REFERENCES
            GRegexError.G_REGEX_ERROR_NAME_TOO_LONG -> NAME_TOO_LONG
            GRegexError.G_REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE -> CHARACTER_VALUE_TOO_LARGE
            else -> error("invalid nativeValue")
        }

        public fun quark(): UInt = g_quark_from_string("g-regex-error-quark")

        public fun fromErrorOrNull(error: Error): RegexError? = if (error.domain != quark()) {
            null
        } else {
            RegexError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
