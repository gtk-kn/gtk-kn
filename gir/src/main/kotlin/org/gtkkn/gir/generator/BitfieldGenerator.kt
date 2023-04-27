/*
 * Copyright (c) 2023 gtk-kn
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
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.BitfieldBlueprint

interface BitfieldGenerator : MiscGenerator, KDocGenerator {
    fun buildBitfield(bitfield: BitfieldBlueprint): TypeSpec {
        val companionSpecBuilder = TypeSpec.companionObjectBuilder()

        bitfield.members.forEach { member ->
            companionSpecBuilder.addProperty(
                PropertySpec.builder(member.kotlinName, bitfield.kotlinTypeName)
                    .addKdoc(buildTypeKDoc(member.kdoc, member.version))
                    .initializer("%T(%M)", bitfield.kotlinTypeName, member.nativeMemberName)
                    .build(),
            )
        }

        val constructorSpec = FunSpec.constructorBuilder()
            .addParameter("mask", bitfield.nativeValueTypeName)
            .build()

        val orFuncSpec = FunSpec.builder("or")
            .addModifiers(KModifier.INFIX, KModifier.OVERRIDE)
            .addParameter("other", bitfield.kotlinTypeName)
            .returns(bitfield.kotlinTypeName)
            .addStatement("return·%T(mask·or·other.mask)", bitfield.kotlinTypeName)
            .build()

        val genericMarkerType = BindingsGenerator.GLIB_BITFIELD_MARKER_TYPE
            .parameterizedBy(bitfield.kotlinTypeName)

        val bitfieldSpec = TypeSpec.classBuilder(bitfield.kotlinName)
            .addSuperinterface(genericMarkerType)
            .addKdoc(buildTypeKDoc(bitfield.kdoc, bitfield.version))
            .primaryConstructor(constructorSpec)
            .addProperty(
                PropertySpec.builder("mask", bitfield.nativeValueTypeName)
                    .initializer("mask")
                    .build(),
            )
            .addFunction(orFuncSpec)
            .addType(companionSpecBuilder.build())

        // add functions
        bitfield.functionBlueprints.forEach { companionSpecBuilder.addFunction(buildFunction(it)) }

        return bitfieldSpec.build()
    }
}
