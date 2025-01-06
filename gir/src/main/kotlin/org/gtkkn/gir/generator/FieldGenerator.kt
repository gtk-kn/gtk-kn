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

package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import org.gtkkn.gir.blueprints.FieldBlueprint
import org.gtkkn.gir.blueprints.TypeInfo

interface FieldGenerator : ConversionBlockGenerator, KDocGenerator {
    /**
     * Builds a property for a field, including getter and possibly setter if supported.
     */
    fun buildFieldProperty(objectPointerName: String, field: FieldBlueprint): PropertySpec {
        val propertyBuilder = PropertySpec.builder(field.kotlinName, field.typeInfo.kotlinTypeName)
            .addKdoc(buildPropertyKDoc(field.kdoc, field.optInVersionBlueprint))

        val fieldNativeName =
            if (field.accessPath.isNullOrBlank()) field.nativeName else "${field.accessPath}.${field.nativeName}"

        // Getter
        propertyBuilder.getter(
            FunSpec.getterBuilder()
                .addCode("return $objectPointerName.%M.$fieldNativeName", BindingsGenerator.POINTED)
                .addCode(buildNativeToKotlinConversionsBlock(field.typeInfo))
                .build(),
        )

        // Setter if supported
        if (isFieldSetterSupported(field)) {
            propertyBuilder.mutable(true)
            propertyBuilder.setter(
                FunSpec.setterBuilder().apply {
                    addAnnotation(BindingsGenerator.UNSAFE_FIELD_SETTER_TYPE)
                    addParameter("value", field.typeInfo.kotlinTypeName)
                    if (field.typeInfo is TypeInfo.KString) {
                        if (field.typeInfo.isCinteropNullable) {
                            addCode(
                                "$objectPointerName.%M.$fieldNativeName?.let { %M(it) }\n",
                                BindingsGenerator.POINTED,
                                BindingsGenerator.G_FREE_FUNC,
                            )
                        } else {
                            addCode(
                                "%M($objectPointerName.%M.$fieldNativeName)",
                                BindingsGenerator.G_FREE_FUNC,
                                BindingsGenerator.POINTED,
                            )
                        }
                    }
                    addCode("$objectPointerName.%M.$fieldNativeName = value", BindingsGenerator.POINTED)
                    addCode(buildKotlinToNativeTypeConversionBlock(field.typeInfo))
                    if (field.typeInfo is TypeInfo.ObjectPointer) {
                        val isParamNullable = field.typeInfo.kotlinTypeName.isNullable
                        val safeCall = if (isParamNullable) "?" else ""
                        addCode("$safeCall.%M()", BindingsGenerator.REINTERPRET_FUNC)
                    }
                }.build(),
            )
        } else if (field.writeable) {
            // Writeable but not supported
            propertyBuilder.addKdoc("\n\nNote: this property is writeable but the setter binding is not supported yet.")
        }

        return propertyBuilder.build()
    }

    /**
     * Check if we can generate a setter for the field type.
     */
    fun isFieldSetterSupported(field: FieldBlueprint): Boolean = field.writeable && when (field.typeInfo) {
        is TypeInfo.Alias,
        is TypeInfo.Bitfield,
        is TypeInfo.Enumeration,
        is TypeInfo.GBoolean,
        is TypeInfo.GChar,
        is TypeInfo.GPointer,
        is TypeInfo.KString,
        is TypeInfo.ObjectPointer,
        is TypeInfo.Primitive,
        is TypeInfo.RecordUnionPointer -> true

        is TypeInfo.CallbackWithDestroy,
        is TypeInfo.InterfacePointer,
        is TypeInfo.StringList -> false
    }
}
