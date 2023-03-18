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
    abstract val nativeTypeName: TypeName
    abstract val kotlinTypeName: TypeName

    abstract fun withNullable(nullable: Boolean): TypeInfo

    /**
     * Native and kotlin types are exactly the same and no conversion is necessary.
     */
    data class Primitive(
        val typeName: TypeName,
    ) : TypeInfo() {
        override val nativeTypeName: TypeName
            get() = typeName
        override val kotlinTypeName: TypeName
            get() = typeName

        override fun withNullable(nullable: Boolean): Primitive = copy(
            typeName = typeName.copy(nullable),
        )
    }

    /**
     * Native type is a cinterop-generated strict enum class and kotlin type is
     * a generated enum class.
     */
    data class Enumeration(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
    ) : TypeInfo() {
        override fun withNullable(nullable: Boolean): Enumeration = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    /**
     * Native type is a CPointer and kotlin type is a generated wrapper class.
     *
     * native to kotlin conversion: wrap the pointer
     * kotlin to native conversion: extract the objectPointer
     *
     * @property nativeTypeName TypeName for the native side
     * @property kotlinTypeName TypeName for the kotlin side
     * @property objectPointerName name for the pointer to be used as instancePointer
     */
    data class ObjectPointer(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
        val objectPointerName: String,
    ) : TypeInfo() {
        override fun withNullable(nullable: Boolean): ObjectPointer = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    /**
     * Native type is a CPointer and kotlin type is a generated wrapper class.
     *
     * native to kotlin conversion: wrap the pointer
     * kotlin to native conversion: extract the objectPointer
     *
     * @property nativeTypeName TypeName for the native side
     * @property kotlinTypeName TypeName for the kotlin side
     * @property objectPointerName name for the pointer to be used as instancePointer
     */
    data class InterfacePointer(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
        val objectPointerName: String,
    ) : TypeInfo() {
        override fun withNullable(nullable: Boolean): InterfacePointer = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class GBoolean(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
    ) : TypeInfo() {
        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class KString(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
    ) : TypeInfo() {
        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class Bitfield(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
    ) : TypeInfo() {
        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    /**
     * Temporary Pokemon case until we have all conversions handled.
     */
    data class Unknown(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
    ) : TypeInfo() {
        override fun withNullable(nullable: Boolean): Unknown = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }
}
