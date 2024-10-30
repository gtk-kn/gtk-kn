// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gsk.GskSerializationError
import org.gtkkn.native.gsk.GskSerializationError.GSK_SERIALIZATION_INVALID_DATA
import org.gtkkn.native.gsk.GskSerializationError.GSK_SERIALIZATION_UNSUPPORTED_FORMAT
import org.gtkkn.native.gsk.GskSerializationError.GSK_SERIALIZATION_UNSUPPORTED_VERSION
import org.gtkkn.native.gsk.gsk_serialization_error_quark
import kotlin.UInt

/**
 * Errors that can happen during (de)serialization.
 */
public enum class SerializationError(
    public val nativeValue: GskSerializationError,
) {
    /**
     * The format can not be identified
     */
    UNSUPPORTED_FORMAT(GSK_SERIALIZATION_UNSUPPORTED_FORMAT),

    /**
     * The version of the data is not
     *   understood
     */
    UNSUPPORTED_VERSION(GSK_SERIALIZATION_UNSUPPORTED_VERSION),

    /**
     * The given data may not exist in
     *   a proper serialization
     */
    INVALID_DATA(GSK_SERIALIZATION_INVALID_DATA),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskSerializationError): SerializationError =
            when (nativeValue) {
                GSK_SERIALIZATION_UNSUPPORTED_FORMAT -> UNSUPPORTED_FORMAT
                GSK_SERIALIZATION_UNSUPPORTED_VERSION -> UNSUPPORTED_VERSION
                GSK_SERIALIZATION_INVALID_DATA -> INVALID_DATA
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = gsk_serialization_error_quark()

        public fun fromErrorOrNull(error: Error): SerializationError? =
            if (error.domain != quark()) {
                null
            } else {
                SerializationError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}