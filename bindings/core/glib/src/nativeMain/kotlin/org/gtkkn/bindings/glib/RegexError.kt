// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GRegexError
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_ASSERTION_EXPECTED
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_COMPILE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_DEFINE_REPETION
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_EXPRESSION_TOO_LARGE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_HEX_CODE_TOO_LARGE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_INFINITE_LOOP
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_INTERNAL
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_INVALID_CONDITION
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_INVALID_CONTROL_CHAR
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_INVALID_DATA_CHARACTER
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_INVALID_OCTAL_VALUE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_MALFORMED_CONDITION
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_MALFORMED_PROPERTY
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_MATCH
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_MEMORY_ERROR
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_MISSING_BACK_REFERENCE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_MISSING_CONTROL_CHAR
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_MISSING_DIGIT
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_MISSING_NAME
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_NAME_TOO_LONG
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_NOTHING_TO_REPEAT
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_NUMBER_TOO_BIG
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_OPTIMIZE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_QUANTIFIER_TOO_BIG
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_RANGE_OUT_OF_ORDER
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_REPLACE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_STRAY_BACKSLASH
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_TOO_MANY_SUBPATTERNS
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_UNKNOWN_PROPERTY
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_UNMATCHED_PARENTHESIS
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_UNRECOGNIZED_CHARACTER
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_UNRECOGNIZED_ESCAPE
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_UNTERMINATED_COMMENT
import org.gtkkn.native.glib.GRegexError.G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by regular expressions functions.
 * @since 2.14
 */
public enum class RegexError(
    public val nativeValue: GRegexError,
) {
    /**
     * Compilation of the regular expression failed.
     */
    COMPILE(G_REGEX_ERROR_COMPILE),

    /**
     * Optimization of the regular expression failed.
     */
    OPTIMIZE(G_REGEX_ERROR_OPTIMIZE),

    /**
     * Replacement failed due to an ill-formed replacement
     *     string.
     */
    REPLACE(G_REGEX_ERROR_REPLACE),

    /**
     * The match process failed.
     */
    MATCH(G_REGEX_ERROR_MATCH),

    /**
     * Internal error of the regular expression engine.
     *     Since 2.16
     */
    INTERNAL(G_REGEX_ERROR_INTERNAL),

    /**
     * "\\" at end of pattern. Since 2.16
     */
    STRAY_BACKSLASH(G_REGEX_ERROR_STRAY_BACKSLASH),

    /**
     * "\\c" at end of pattern. Since 2.16
     */
    MISSING_CONTROL_CHAR(G_REGEX_ERROR_MISSING_CONTROL_CHAR),

    /**
     * Unrecognized character follows "\\".
     *     Since 2.16
     */
    UNRECOGNIZED_ESCAPE(G_REGEX_ERROR_UNRECOGNIZED_ESCAPE),

    /**
     * Numbers out of order in "{}"
     *     quantifier. Since 2.16
     */
    QUANTIFIERS_OUT_OF_ORDER(G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER),

    /**
     * Number too big in "{}" quantifier.
     *     Since 2.16
     */
    QUANTIFIER_TOO_BIG(G_REGEX_ERROR_QUANTIFIER_TOO_BIG),

    /**
     * Missing terminating "]" for
     *     character class. Since 2.16
     */
    UNTERMINATED_CHARACTER_CLASS(G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS),

    /**
     * Invalid escape sequence
     *     in character class. Since 2.16
     */
    INVALID_ESCAPE_IN_CHARACTER_CLASS(G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS),

    /**
     * Range out of order in character class.
     *     Since 2.16
     */
    RANGE_OUT_OF_ORDER(G_REGEX_ERROR_RANGE_OUT_OF_ORDER),

    /**
     * Nothing to repeat. Since 2.16
     */
    NOTHING_TO_REPEAT(G_REGEX_ERROR_NOTHING_TO_REPEAT),

    /**
     * Unrecognized character after "(?",
     *     "(?<" or "(?P". Since 2.16
     */
    UNRECOGNIZED_CHARACTER(G_REGEX_ERROR_UNRECOGNIZED_CHARACTER),

    /**
     * POSIX named classes are
     *     supported only within a class. Since 2.16
     */
    POSIX_NAMED_CLASS_OUTSIDE_CLASS(G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS),

    /**
     * Missing terminating ")" or ")"
     *     without opening "(". Since 2.16
     */
    UNMATCHED_PARENTHESIS(G_REGEX_ERROR_UNMATCHED_PARENTHESIS),

    /**
     * Reference to non-existent
     *     subpattern. Since 2.16
     */
    INEXISTENT_SUBPATTERN_REFERENCE(G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE),

    /**
     * Missing terminating ")" after comment.
     *     Since 2.16
     */
    UNTERMINATED_COMMENT(G_REGEX_ERROR_UNTERMINATED_COMMENT),

    /**
     * Regular expression too large.
     *     Since 2.16
     */
    EXPRESSION_TOO_LARGE(G_REGEX_ERROR_EXPRESSION_TOO_LARGE),

    /**
     * Failed to get memory. Since 2.16
     */
    MEMORY_ERROR(G_REGEX_ERROR_MEMORY_ERROR),

    /**
     * Lookbehind assertion is not
     *     fixed length. Since 2.16
     */
    VARIABLE_LENGTH_LOOKBEHIND(G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND),

    /**
     * Malformed number or name after "(?(".
     *     Since 2.16
     */
    MALFORMED_CONDITION(G_REGEX_ERROR_MALFORMED_CONDITION),

    /**
     * Conditional group contains
     *     more than two branches. Since 2.16
     */
    TOO_MANY_CONDITIONAL_BRANCHES(G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES),

    /**
     * Assertion expected after "(?(".
     *     Since 2.16
     */
    ASSERTION_EXPECTED(G_REGEX_ERROR_ASSERTION_EXPECTED),

    /**
     * Unknown POSIX class name.
     *     Since 2.16
     */
    UNKNOWN_POSIX_CLASS_NAME(G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME),

    /**
     * POSIX collating
     *     elements are not supported. Since 2.16
     */
    POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED(G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED),

    /**
     * Character value in "\\x{...}" sequence
     *     is too large. Since 2.16
     */
    HEX_CODE_TOO_LARGE(G_REGEX_ERROR_HEX_CODE_TOO_LARGE),

    /**
     * Invalid condition "(?(0)". Since 2.16
     */
    INVALID_CONDITION(G_REGEX_ERROR_INVALID_CONDITION),

    /**
     * \\C not allowed in
     *     lookbehind assertion. Since 2.16
     */
    SINGLE_BYTE_MATCH_IN_LOOKBEHIND(G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND),

    /**
     * Recursive call could loop indefinitely.
     *     Since 2.16
     */
    INFINITE_LOOP(G_REGEX_ERROR_INFINITE_LOOP),

    /**
     * Missing terminator
     *     in subpattern name. Since 2.16
     */
    MISSING_SUBPATTERN_NAME_TERMINATOR(G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR),

    /**
     * Two named subpatterns have
     *     the same name. Since 2.16
     */
    DUPLICATE_SUBPATTERN_NAME(G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME),

    /**
     * Malformed "\\P" or "\\p" sequence.
     *     Since 2.16
     */
    MALFORMED_PROPERTY(G_REGEX_ERROR_MALFORMED_PROPERTY),

    /**
     * Unknown property name after "\\P" or
     *     "\\p". Since 2.16
     */
    UNKNOWN_PROPERTY(G_REGEX_ERROR_UNKNOWN_PROPERTY),

    /**
     * Subpattern name is too long
     *     (maximum 32 characters). Since 2.16
     */
    SUBPATTERN_NAME_TOO_LONG(G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG),

    /**
     * Too many named subpatterns (maximum
     *     10,000). Since 2.16
     */
    TOO_MANY_SUBPATTERNS(G_REGEX_ERROR_TOO_MANY_SUBPATTERNS),

    /**
     * Octal value is greater than "\\377".
     *     Since 2.16
     */
    INVALID_OCTAL_VALUE(G_REGEX_ERROR_INVALID_OCTAL_VALUE),

    /**
     * "DEFINE" group contains more
     *     than one branch. Since 2.16
     */
    TOO_MANY_BRANCHES_IN_DEFINE(G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE),

    /**
     * Repeating a "DEFINE" group is not allowed.
     *     This error is never raised. Since: 2.16 Deprecated: 2.34
     */
    DEFINE_REPETION(G_REGEX_ERROR_DEFINE_REPETION),

    /**
     * Inconsistent newline options.
     *     Since 2.16
     */
    INCONSISTENT_NEWLINE_OPTIONS(G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS),

    /**
     * "\\g" is not followed by a braced,
     *      angle-bracketed, or quoted name or number, or by a plain number. Since: 2.16
     */
    MISSING_BACK_REFERENCE(G_REGEX_ERROR_MISSING_BACK_REFERENCE),

    /**
     * relative reference must not be zero. Since: 2.34
     */
    INVALID_RELATIVE_REFERENCE(G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE),

    /**
     * the backtracing
     *     control verb used does not allow an argument. Since: 2.34
     */
    BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN(G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN),

    /**
     * unknown backtracing
     *     control verb. Since: 2.34
     */
    UNKNOWN_BACKTRACKING_CONTROL_VERB(G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB),

    /**
     * number is too big in escape sequence. Since: 2.34
     */
    NUMBER_TOO_BIG(G_REGEX_ERROR_NUMBER_TOO_BIG),

    /**
     * Missing subpattern name. Since: 2.34
     */
    MISSING_SUBPATTERN_NAME(G_REGEX_ERROR_MISSING_SUBPATTERN_NAME),

    /**
     * Missing digit. Since 2.34
     */
    MISSING_DIGIT(G_REGEX_ERROR_MISSING_DIGIT),

    /**
     * In JavaScript compatibility mode,
     *     "[" is an invalid data character. Since: 2.34
     */
    INVALID_DATA_CHARACTER(G_REGEX_ERROR_INVALID_DATA_CHARACTER),

    /**
     * different names for subpatterns of the
     *     same number are not allowed. Since: 2.34
     */
    EXTRA_SUBPATTERN_NAME(G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME),

    /**
     * the backtracing control
     *     verb requires an argument. Since: 2.34
     */
    BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED(G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED),

    /**
     * "\\c" must be followed by an ASCII
     *     character. Since: 2.34
     */
    INVALID_CONTROL_CHAR(G_REGEX_ERROR_INVALID_CONTROL_CHAR),

    /**
     * "\\k" is not followed by a braced, angle-bracketed, or
     *     quoted name. Since: 2.34
     */
    MISSING_NAME(G_REGEX_ERROR_MISSING_NAME),

    /**
     * "\\N" is not supported in a class. Since: 2.34
     */
    NOT_SUPPORTED_IN_CLASS(G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS),

    /**
     * too many forward references. Since: 2.34
     */
    TOO_MANY_FORWARD_REFERENCES(G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES),

    /**
     * the name is too long in "(*MARK)", "(*PRUNE)",
     *     "(*SKIP)", or "(*THEN)". Since: 2.34
     */
    NAME_TOO_LONG(G_REGEX_ERROR_NAME_TOO_LONG),

    /**
     * the character value in the \\u sequence is
     *     too large. Since: 2.34
     */
    CHARACTER_VALUE_TOO_LARGE(G_REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GRegexError): RegexError =
            when (nativeValue) {
                G_REGEX_ERROR_COMPILE -> COMPILE
                G_REGEX_ERROR_OPTIMIZE -> OPTIMIZE
                G_REGEX_ERROR_REPLACE -> REPLACE
                G_REGEX_ERROR_MATCH -> MATCH
                G_REGEX_ERROR_INTERNAL -> INTERNAL
                G_REGEX_ERROR_STRAY_BACKSLASH -> STRAY_BACKSLASH
                G_REGEX_ERROR_MISSING_CONTROL_CHAR -> MISSING_CONTROL_CHAR
                G_REGEX_ERROR_UNRECOGNIZED_ESCAPE -> UNRECOGNIZED_ESCAPE
                G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER -> QUANTIFIERS_OUT_OF_ORDER
                G_REGEX_ERROR_QUANTIFIER_TOO_BIG -> QUANTIFIER_TOO_BIG
                G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS -> UNTERMINATED_CHARACTER_CLASS
                G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS -> INVALID_ESCAPE_IN_CHARACTER_CLASS
                G_REGEX_ERROR_RANGE_OUT_OF_ORDER -> RANGE_OUT_OF_ORDER
                G_REGEX_ERROR_NOTHING_TO_REPEAT -> NOTHING_TO_REPEAT
                G_REGEX_ERROR_UNRECOGNIZED_CHARACTER -> UNRECOGNIZED_CHARACTER
                G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS -> POSIX_NAMED_CLASS_OUTSIDE_CLASS
                G_REGEX_ERROR_UNMATCHED_PARENTHESIS -> UNMATCHED_PARENTHESIS
                G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE -> INEXISTENT_SUBPATTERN_REFERENCE
                G_REGEX_ERROR_UNTERMINATED_COMMENT -> UNTERMINATED_COMMENT
                G_REGEX_ERROR_EXPRESSION_TOO_LARGE -> EXPRESSION_TOO_LARGE
                G_REGEX_ERROR_MEMORY_ERROR -> MEMORY_ERROR
                G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND -> VARIABLE_LENGTH_LOOKBEHIND
                G_REGEX_ERROR_MALFORMED_CONDITION -> MALFORMED_CONDITION
                G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES -> TOO_MANY_CONDITIONAL_BRANCHES
                G_REGEX_ERROR_ASSERTION_EXPECTED -> ASSERTION_EXPECTED
                G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME -> UNKNOWN_POSIX_CLASS_NAME
                G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED -> POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED
                G_REGEX_ERROR_HEX_CODE_TOO_LARGE -> HEX_CODE_TOO_LARGE
                G_REGEX_ERROR_INVALID_CONDITION -> INVALID_CONDITION
                G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND -> SINGLE_BYTE_MATCH_IN_LOOKBEHIND
                G_REGEX_ERROR_INFINITE_LOOP -> INFINITE_LOOP
                G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR -> MISSING_SUBPATTERN_NAME_TERMINATOR
                G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME -> DUPLICATE_SUBPATTERN_NAME
                G_REGEX_ERROR_MALFORMED_PROPERTY -> MALFORMED_PROPERTY
                G_REGEX_ERROR_UNKNOWN_PROPERTY -> UNKNOWN_PROPERTY
                G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG -> SUBPATTERN_NAME_TOO_LONG
                G_REGEX_ERROR_TOO_MANY_SUBPATTERNS -> TOO_MANY_SUBPATTERNS
                G_REGEX_ERROR_INVALID_OCTAL_VALUE -> INVALID_OCTAL_VALUE
                G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE -> TOO_MANY_BRANCHES_IN_DEFINE
                G_REGEX_ERROR_DEFINE_REPETION -> DEFINE_REPETION
                G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS -> INCONSISTENT_NEWLINE_OPTIONS
                G_REGEX_ERROR_MISSING_BACK_REFERENCE -> MISSING_BACK_REFERENCE
                G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE -> INVALID_RELATIVE_REFERENCE
                G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN -> BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN
                G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB -> UNKNOWN_BACKTRACKING_CONTROL_VERB
                G_REGEX_ERROR_NUMBER_TOO_BIG -> NUMBER_TOO_BIG
                G_REGEX_ERROR_MISSING_SUBPATTERN_NAME -> MISSING_SUBPATTERN_NAME
                G_REGEX_ERROR_MISSING_DIGIT -> MISSING_DIGIT
                G_REGEX_ERROR_INVALID_DATA_CHARACTER -> INVALID_DATA_CHARACTER
                G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME -> EXTRA_SUBPATTERN_NAME
                G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED -> BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED
                G_REGEX_ERROR_INVALID_CONTROL_CHAR -> INVALID_CONTROL_CHAR
                G_REGEX_ERROR_MISSING_NAME -> MISSING_NAME
                G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS -> NOT_SUPPORTED_IN_CLASS
                G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES -> TOO_MANY_FORWARD_REFERENCES
                G_REGEX_ERROR_NAME_TOO_LONG -> NAME_TOO_LONG
                G_REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE -> CHARACTER_VALUE_TOO_LARGE
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-regex-error-quark")

        public fun fromErrorOrNull(error: Error): RegexError? =
            if (error.domain != quark()) {
                null
            } else {
                RegexError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
