// This is a generated file. Do not modify.
package org.gtkkn.bindings.javascriptcore

import org.gtkkn.native.javascriptcore.JSCCheckSyntaxResult

/**
 * Enum values to specify the result of jsc_context_check_syntax().
 */
public enum class CheckSyntaxResult(
    public val nativeValue: JSCCheckSyntaxResult,
) {
    /**
     * no errors
     */
    SUCCESS(JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_SUCCESS),

    /**
     * recoverable syntax error
     */
    RECOVERABLE_ERROR(JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_RECOVERABLE_ERROR),

    /**
     * irrecoverable syntax error
     */
    IRRECOVERABLE_ERROR(JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_IRRECOVERABLE_ERROR),

    /**
     * unterminated literal error
     */
    UNTERMINATED_LITERAL_ERROR(JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_UNTERMINATED_LITERAL_ERROR),

    /**
     * out of memory error
     */
    OUT_OF_MEMORY_ERROR(JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_OUT_OF_MEMORY_ERROR),

    /**
     * stack overflow error
     */
    STACK_OVERFLOW_ERROR(JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_STACK_OVERFLOW_ERROR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: JSCCheckSyntaxResult): CheckSyntaxResult =
            when (nativeValue) {
                JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_SUCCESS -> SUCCESS
                JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_RECOVERABLE_ERROR -> RECOVERABLE_ERROR
                JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_IRRECOVERABLE_ERROR -> IRRECOVERABLE_ERROR
                JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_UNTERMINATED_LITERAL_ERROR -> UNTERMINATED_LITERAL_ERROR
                JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_OUT_OF_MEMORY_ERROR -> OUT_OF_MEMORY_ERROR
                JSCCheckSyntaxResult.JSC_CHECK_SYNTAX_RESULT_STACK_OVERFLOW_ERROR -> STACK_OVERFLOW_ERROR
                else -> error("invalid nativeValue")
            }
    }
}
