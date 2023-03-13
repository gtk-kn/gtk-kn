package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.TypeName

/**
 * A sealed class used to describe what kind of conversion is necessary to convert
 * an object from its native type to its kotlin type and vice versa.
 *
 * The idea is that this sealed class only describes what kind of conversion is necessary,
 * and does not handle the actual conversion. The Phase 3 kotlin writer can then use
 * this information to determine how to implement the actual conversion when generating
 * method implementations.
 */
sealed class TypeInfo {
    /**
     * Native and kotlin types are exactly the same and no conversion is necessary.
     */
    data class Primitive(
        val typeName: TypeName,
    ) : TypeInfo()

    /**
     * Native type is a cinterop-generated strict enum class and kotlin type is
     * a generated enum class.
     */
    data class Enumeration(
        val nativeTypeName: TypeName,
        val kotlinTypeName: TypeName,
    ) : TypeInfo()

    /**
     * Native type is a CPointer and kotlin type is a generated wrapper class.
     *
     * native to kotlin conversion: wrap the pointer
     * kotlin to native conversion: extract the objectPointer
     */
    data class ObjectPointer(
        val nativeTypeName: TypeName,
        val kotlinTypeName: TypeName,
    ) : TypeInfo()

    /**
     * Temporary Pokemon case until we have all conversions handled.
     */
    data class Unknown(
        val nativeTypeName: TypeName,
        val kotlinTypeName: TypeName,
    ) : TypeInfo()
}
