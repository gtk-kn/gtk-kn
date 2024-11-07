// This is a generated file. Do not modify.
package org.gtkkn.bindings.javascriptcore

import org.gtkkn.native.javascriptcore.JSCCheckSyntaxMode

/**
 * Enum values to specify a mode to check for syntax errors in jsc_context_check_syntax().
 */
public enum class CheckSyntaxMode(
    public val nativeValue: JSCCheckSyntaxMode,
) {
    /**
     * mode to check syntax of a script
     */
    SCRIPT(JSCCheckSyntaxMode.JSC_CHECK_SYNTAX_MODE_SCRIPT),

    /**
     * mode to check syntax of a module
     */
    MODULE(JSCCheckSyntaxMode.JSC_CHECK_SYNTAX_MODE_MODULE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: JSCCheckSyntaxMode): CheckSyntaxMode =
            when (nativeValue) {
                JSCCheckSyntaxMode.JSC_CHECK_SYNTAX_MODE_SCRIPT -> SCRIPT
                JSCCheckSyntaxMode.JSC_CHECK_SYNTAX_MODE_MODULE -> MODULE
                else -> error("invalid nativeValue")
            }
    }
}
