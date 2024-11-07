// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.toKString
import org.gtkkn.native.atk.AtkValueType
import org.gtkkn.native.atk.atk_value_type_get_localized_name
import org.gtkkn.native.atk.atk_value_type_get_name
import kotlin.String

/**
 * Default types for a given value. Those are defined in order to
 * easily get localized strings to describe a given value or a given
 * subrange, using atk_value_type_get_localized_name().
 */
public enum class ValueType(
    public val nativeValue: AtkValueType,
) {
    VERY_WEAK(AtkValueType.ATK_VALUE_VERY_WEAK),
    WEAK(AtkValueType.ATK_VALUE_WEAK),
    ACCEPTABLE(AtkValueType.ATK_VALUE_ACCEPTABLE),
    STRONG(AtkValueType.ATK_VALUE_STRONG),
    VERY_STRONG(AtkValueType.ATK_VALUE_VERY_STRONG),
    VERY_LOW(AtkValueType.ATK_VALUE_VERY_LOW),
    LOW(AtkValueType.ATK_VALUE_LOW),
    MEDIUM(AtkValueType.ATK_VALUE_MEDIUM),
    HIGH(AtkValueType.ATK_VALUE_HIGH),
    VERY_HIGH(AtkValueType.ATK_VALUE_VERY_HIGH),
    VERY_BAD(AtkValueType.ATK_VALUE_VERY_BAD),
    BAD(AtkValueType.ATK_VALUE_BAD),
    GOOD(AtkValueType.ATK_VALUE_GOOD),
    VERY_GOOD(AtkValueType.ATK_VALUE_VERY_GOOD),
    BEST(AtkValueType.ATK_VALUE_BEST),
    LAST_DEFINED(AtkValueType.ATK_VALUE_LAST_DEFINED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkValueType): ValueType =
            when (nativeValue) {
                AtkValueType.ATK_VALUE_VERY_WEAK -> VERY_WEAK
                AtkValueType.ATK_VALUE_WEAK -> WEAK
                AtkValueType.ATK_VALUE_ACCEPTABLE -> ACCEPTABLE
                AtkValueType.ATK_VALUE_STRONG -> STRONG
                AtkValueType.ATK_VALUE_VERY_STRONG -> VERY_STRONG
                AtkValueType.ATK_VALUE_VERY_LOW -> VERY_LOW
                AtkValueType.ATK_VALUE_LOW -> LOW
                AtkValueType.ATK_VALUE_MEDIUM -> MEDIUM
                AtkValueType.ATK_VALUE_HIGH -> HIGH
                AtkValueType.ATK_VALUE_VERY_HIGH -> VERY_HIGH
                AtkValueType.ATK_VALUE_VERY_BAD -> VERY_BAD
                AtkValueType.ATK_VALUE_BAD -> BAD
                AtkValueType.ATK_VALUE_GOOD -> GOOD
                AtkValueType.ATK_VALUE_VERY_GOOD -> VERY_GOOD
                AtkValueType.ATK_VALUE_BEST -> BEST
                AtkValueType.ATK_VALUE_LAST_DEFINED -> LAST_DEFINED
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the localized description string describing the #AtkValueType @value_type.
         *
         * @param valueType The #AtkValueType whose localized name is required
         * @return the localized string describing the #AtkValueType
         */
        public fun getLocalizedName(valueType: ValueType): String =
            atk_value_type_get_localized_name(valueType.nativeValue)?.toKString() ?: error("Expected not null string")

        /**
         * Gets the description string describing the #AtkValueType @value_type.
         *
         * @param valueType The #AtkValueType whose name is required
         * @return the string describing the #AtkValueType
         */
        public fun getName(valueType: ValueType): String =
            atk_value_type_get_name(valueType.nativeValue)?.toKString() ?: error("Expected not null string")
    }
}
