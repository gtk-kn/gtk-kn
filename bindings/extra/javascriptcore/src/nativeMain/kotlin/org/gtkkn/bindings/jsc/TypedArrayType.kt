// This is a generated file. Do not modify.
package org.gtkkn.bindings.jsc

import org.gtkkn.bindings.jsc.annotations.JavaScriptCoreVersion2_38
import org.gtkkn.native.jsc.JSCTypedArrayType

/**
 * Possible types of the elements contained in a typed array.
 * @since 2.38
 */
@JavaScriptCoreVersion2_38
public enum class TypedArrayType(public val nativeValue: JSCTypedArrayType) {
    /**
     * Not a typed array, or type unsupported.
     */
    NONE(JSCTypedArrayType.JSC_TYPED_ARRAY_NONE),

    /**
     * Array elements are 8-bit signed integers (int8_t).
     */
    INT8(JSCTypedArrayType.JSC_TYPED_ARRAY_INT8),

    /**
     * Array elements are 16-bit signed integers (int16_t).
     */
    INT16(JSCTypedArrayType.JSC_TYPED_ARRAY_INT16),

    /**
     * Array elements are 32-bit signed integers (int32_t).
     */
    INT32(JSCTypedArrayType.JSC_TYPED_ARRAY_INT32),

    /**
     * Array elements are 64-bit signed integers (int64_t).
     */
    INT64(JSCTypedArrayType.JSC_TYPED_ARRAY_INT64),

    /**
     * Array elements are 8-bit unsigned integers (uint8_t).
     */
    UINT8(JSCTypedArrayType.JSC_TYPED_ARRAY_UINT8),

    /**
     * Array elements are 8-bit unsigned integers (uint8_t).
     */
    UINT8_CLAMPED(JSCTypedArrayType.JSC_TYPED_ARRAY_UINT8_CLAMPED),

    /**
     * Array elements are 16-bit unsigned integers (uint16_t).
     */
    UINT16(JSCTypedArrayType.JSC_TYPED_ARRAY_UINT16),

    /**
     * Array elements are 32-bit unsigned integers (uint32_t).
     */
    UINT32(JSCTypedArrayType.JSC_TYPED_ARRAY_UINT32),

    /**
     * Array elements are 64-bit unsigned integers (uint64_t).
     */
    UINT64(JSCTypedArrayType.JSC_TYPED_ARRAY_UINT64),

    /**
     * Array elements are 32-bit floating point numbers (float).
     */
    FLOAT32(JSCTypedArrayType.JSC_TYPED_ARRAY_FLOAT32),

    /**
     * Array elements are 64-bit floating point numbers (double).
     */
    FLOAT64(JSCTypedArrayType.JSC_TYPED_ARRAY_FLOAT64),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: JSCTypedArrayType): TypedArrayType = when (nativeValue) {
            JSCTypedArrayType.JSC_TYPED_ARRAY_NONE -> NONE
            JSCTypedArrayType.JSC_TYPED_ARRAY_INT8 -> INT8
            JSCTypedArrayType.JSC_TYPED_ARRAY_INT16 -> INT16
            JSCTypedArrayType.JSC_TYPED_ARRAY_INT32 -> INT32
            JSCTypedArrayType.JSC_TYPED_ARRAY_INT64 -> INT64
            JSCTypedArrayType.JSC_TYPED_ARRAY_UINT8 -> UINT8
            JSCTypedArrayType.JSC_TYPED_ARRAY_UINT8_CLAMPED -> UINT8_CLAMPED
            JSCTypedArrayType.JSC_TYPED_ARRAY_UINT16 -> UINT16
            JSCTypedArrayType.JSC_TYPED_ARRAY_UINT32 -> UINT32
            JSCTypedArrayType.JSC_TYPED_ARRAY_UINT64 -> UINT64
            JSCTypedArrayType.JSC_TYPED_ARRAY_FLOAT32 -> FLOAT32
            JSCTypedArrayType.JSC_TYPED_ARRAY_FLOAT64 -> FLOAT64
            else -> error("invalid nativeValue")
        }
    }
}
