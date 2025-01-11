/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.generator.G_POINTER

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
    abstract val isCinteropNullable: Boolean

    abstract fun withNullable(nullable: Boolean): TypeInfo

    fun sameType(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TypeInfo

        if (nativeTypeName != other.nativeTypeName) return false
        if (kotlinTypeName != other.kotlinTypeName) return false

        return true
    }

    data class Alias(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
        val baseTypeInfo: TypeInfo,
    ) : TypeInfo() {
        override val isCinteropNullable = false

        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class Bitfield(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
    ) : TypeInfo() {
        override val isCinteropNullable = false

        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class CallbackWithDestroy(
        override val kotlinTypeName: ClassName,
        val hasDestroyParam: Boolean,
    ) : TypeInfo() {
        val staticPropertyMemberName: MemberName = MemberName(
            kotlinTypeName.packageName,
            "${kotlinTypeName.simpleName}Func",
        )
        override val isCinteropNullable: Boolean = true

        override val nativeTypeName: TypeName
            get() = error("nativeTypeName of CallbackWithDestroy should not be called")

        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            kotlinTypeName = kotlinTypeName.copy(nullable) as ClassName,
        )
    }

    /**
     * Native type is a cinterop-generated strict enum class and kotlin type is
     * a generated enum class.
     */
    data class Enumeration(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
        val useRawValue: Boolean = false
    ) : TypeInfo() {
        override val isCinteropNullable = false

        override fun withNullable(nullable: Boolean): Enumeration = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class GBoolean(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
    ) : TypeInfo() {
        override val isCinteropNullable = false

        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class GChar(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
    ) : TypeInfo() {
        override val isCinteropNullable = false

        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class GPointer(
        override val nativeTypeName: TypeName = G_POINTER,
        override val kotlinTypeName: TypeName = G_POINTER,
    ) : TypeInfo() {
        override val isCinteropNullable = false

        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class InterfacePointer(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
        val kotlinTypeNameImpl: TypeName,
        val objectPointerName: String,
    ) : TypeInfo() {
        override val isCinteropNullable = true
        override fun withNullable(nullable: Boolean): InterfacePointer = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class KString(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
        val immutable: Boolean,
        val noStringConversion: Boolean = false,
    ) : TypeInfo() {
        override val isCinteropNullable = true
        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }

    data class ObjectPointer(
        override val nativeTypeName: TypeName,
        override val kotlinTypeName: TypeName,
        val kotlinTypeNameImpl: TypeName?,
        val objectPointerName: String,
        private val needsReinterpret: Boolean = false,
    ) : TypeInfo() {
        override val isCinteropNullable = true
        override fun withNullable(nullable: Boolean): ObjectPointer = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
            kotlinTypeNameImpl = kotlinTypeNameImpl?.copy(nullable),
        )

        fun needsReinterpret() = !((nativeTypeName as ParameterizedTypeName).typeArguments.first() as ClassName)
            .simpleName
            .contains((kotlinTypeName as ClassName).simpleName, ignoreCase = true) || needsReinterpret
    }

    /**
     * Native and kotlin types are exactly the same and no conversion is necessary.
     */
    data class Primitive(
        val typeName: TypeName,
    ) : TypeInfo() {
        override val nativeTypeName = typeName
        override val kotlinTypeName = typeName

        override val isCinteropNullable = false
        override fun withNullable(nullable: Boolean): Primitive = copy(
            typeName = typeName.copy(nullable),
        )
    }

    data class RecordUnionPointer(
        override val kotlinTypeName: TypeName,
        override val nativeTypeName: TypeName,
        val objectPointerName: String,
        private val needsReinterpret: Boolean = false,
    ) : TypeInfo() {
        override val isCinteropNullable: Boolean = true
        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )

        fun needsReinterpret() = needsReinterpret
    }

    data class StringList(
        val listSize: ListSize,
        override val nativeTypeName: TypeName = BindingsGenerator.KP_STRING_ARRAY,
        override val kotlinTypeName: TypeName = LIST.parameterizedBy(STRING),
    ) : TypeInfo() {
        override val isCinteropNullable = true

        override fun withNullable(nullable: Boolean): TypeInfo = copy(
            nativeTypeName = nativeTypeName.copy(nullable),
            kotlinTypeName = kotlinTypeName.copy(nullable),
        )
    }
}
