package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.TypeName

/**
 * Helper structure for combining a native type with an associated kotlin type.
 */
data class TypeNamePair(
    val nativeTypeName: TypeName,
    val kotlinTypeName: TypeName,
    val conversionType: ConversionType,
) {
    /**
     * True if the native type is the same as the kotlin type and no conversion is needed.
     */
    val isSameType: Boolean = conversionType == ConversionType.SAME_TYPE
}

enum class ConversionType {
    SAME_TYPE,
    ENUMERATION,
    OBJECT,
    UNKNOWN
}
