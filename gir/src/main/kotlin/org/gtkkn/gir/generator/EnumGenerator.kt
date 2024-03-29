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
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.U_INT
import org.gtkkn.gir.blueprints.EnumBlueprint

interface EnumGenerator : MiscGenerator, KDocGenerator {
    fun buildEnum(enum: EnumBlueprint): TypeSpec {
        // primary constructor
        val constructorSpec = FunSpec.constructorBuilder()
            .addParameter("nativeValue", enum.nativeValueTypeName)
            .build()

        // enum spec
        val enumSpec = TypeSpec.enumBuilder(enum.kotlinTypeName)
            .addKdoc(buildTypeKDoc(enum.kdoc, enum.version))
            .primaryConstructor(constructorSpec)
            .addProperty(
                PropertySpec.builder("nativeValue", enum.nativeValueTypeName)
                    .initializer("nativeValue")
                    .build(),
            )

        // add enum members
        enum.memberBlueprints.forEach { member ->
            enumSpec.addEnumConstant(
                member.kotlinName,
                TypeSpec.anonymousClassBuilder()
                    .addKdoc(buildTypeKDoc(member.kdoc, member.version))
                    .addSuperclassConstructorParameter("%M", member.nativeMemberName)
                    .build(),
            )
        }

        // companion
        enumSpec.addType(buildEnumCompanion(enum))

        return enumSpec.build()
    }

    private fun buildEnumCompanion(enum: EnumBlueprint): TypeSpec {
        val fromNativeFunc = FunSpec.builder("fromNativeValue")
            .addParameter("nativeValue", enum.nativeValueTypeName)
            .returns(enum.kotlinTypeName)

        fromNativeFunc.beginControlFlow("return·when·(nativeValue)") // begin when

        // add a case for each member
        for (member in enum.memberBlueprints) {
            fromNativeFunc.addStatement("%M -> %N", member.nativeMemberName, member.kotlinName)
        }

        // most enums can be exhaustive but some exceptions still need an else case due to cinterop member handling
        fromNativeFunc.addStatement("""else -> error("invalid nativeValue")""")

        fromNativeFunc.endControlFlow() // end when

        return TypeSpec.companionObjectBuilder().apply {
            // from native function
            addFunction(fromNativeFunc.build())

            // other functions
            enum.functionBlueprints.forEach { addFunction(buildFunction(it)) }

            // fromError function
            enum.errorDomain?.let { errorDomain ->
                if (enum.functionBlueprints.none { it.kotlinName == "quark" }) {
                    addFunction(buildErrorDomainQuarkFunction(errorDomain))
                }
                addFunction(buildFromErrorFunction(enum))
            }
        }.build()
    }

    private fun buildErrorDomainQuarkFunction(errorDomain: String) =
        FunSpec.builder("quark").apply {
            returns(U_INT)
            addStatement("return·%M(%S)", BindingsGenerator.G_QUARK_FROM_STRING_FUNC, errorDomain)
        }.build()

    private fun buildFromErrorFunction(enum: EnumBlueprint) =
        FunSpec.builder("fromErrorOrNull").apply {
            addParameter("error", BindingsGenerator.GLIB_ERROR_TYPE)
            returns(enum.kotlinTypeName.copy(nullable = true))

            beginControlFlow("return·if·(error.domain != quark())")
            addStatement("null")
            nextControlFlow("else")
            addStatement(
                "%T.values().find·{ it.nativeValue.value.toInt() == error.code }",
                enum.kotlinTypeName,
            )
            endControlFlow()
        }.build()

    fun buildErrorDomainExceptionClass(enum: EnumBlueprint) =
        TypeSpec.classBuilder(checkNotNull(enum.errorExceptionTypeName)).apply {
            superclass(BindingsGenerator.GLIB_EXCEPTION_TYPE)

            primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("error", BindingsGenerator.GLIB_ERROR_TYPE)
                    .addParameter("code", enum.kotlinTypeName)
                    .build(),
            )
            addSuperclassConstructorParameter("error")

            addProperty(
                PropertySpec.builder("code", enum.kotlinTypeName)
                    .initializer("code")
                    .build(),
            )
        }.build()
}
