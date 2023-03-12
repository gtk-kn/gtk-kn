package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.TypeName

/**
 * Helper structure for combining a native type with an associated kotlin type
 * and information about how to convert from one side to another.
 */
data class TypeInfo(
    val nativeTypeName: TypeName,
    val kotlinTypeName: TypeName,
    val conversionType: ConversionType,
)

/**
 * An enum used to describe what kind of conversion is necessary to convert
 * an object from its native type to its kotlin type and vice versa.
 *
 * The idea is that this enum only describes what kind of conversion is necessary,
 * and does not handle the actual conversion. The Phase 3 kotlin writer can then use
 * this information to determine how to implement the actual conversion when generating
 * method implementations.
 */
enum class ConversionType {
    /**
     * Native and kotlin types are exactly the same and no conversion is necessary.
     */
    NO_CONVERSION,

    /**
     * Native type is a cinterop-generated strict enum class and kotlin type is
     * a generated enum class.
     */
    ENUMERATION,

    /**
     * Native type is a CPointer and kotlin type is a generated wrapper class.
     *
     * native to kotlin conversion: wrap the pointer
     * kotlin to native conversion: extract the objectPointer
     */
    OBJECT_POINTER,

    /**
     * Temporary Pokemon case until we have all conversions handled.
     */
    UNKNOWN
}
