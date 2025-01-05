// This is a generated file. Do not modify.
package org.gtkkn.bindings.jsc

import org.gtkkn.bindings.jsc.annotations.JavaScriptCoreVersion2_24
import org.gtkkn.native.jsc.JSCOptionType

/**
 * Enum values for options types.
 * @since 2.24
 */
@JavaScriptCoreVersion2_24
public enum class OptionType(public val nativeValue: JSCOptionType) {
    /**
     * A #gboolean option type.
     */
    BOOLEAN(JSCOptionType.JSC_OPTION_BOOLEAN),

    /**
     * A #gint option type.
     */
    INT(JSCOptionType.JSC_OPTION_INT),

    /**
     * A #guint option type.
     */
    UINT(JSCOptionType.JSC_OPTION_UINT),

    /**
     * A #gsize options type.
     */
    SIZE(JSCOptionType.JSC_OPTION_SIZE),

    /**
     * A #gdouble options type.
     */
    DOUBLE(JSCOptionType.JSC_OPTION_DOUBLE),

    /**
     * A string option type.
     */
    STRING(JSCOptionType.JSC_OPTION_STRING),

    /**
     * A range string option type.
     */
    RANGE_STRING(JSCOptionType.JSC_OPTION_RANGE_STRING),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: JSCOptionType): OptionType = when (nativeValue) {
            JSCOptionType.JSC_OPTION_BOOLEAN -> BOOLEAN
            JSCOptionType.JSC_OPTION_INT -> INT
            JSCOptionType.JSC_OPTION_UINT -> UINT
            JSCOptionType.JSC_OPTION_SIZE -> SIZE
            JSCOptionType.JSC_OPTION_DOUBLE -> DOUBLE
            JSCOptionType.JSC_OPTION_STRING -> STRING
            JSCOptionType.JSC_OPTION_RANGE_STRING -> RANGE_STRING
            else -> error("invalid nativeValue")
        }
    }
}
