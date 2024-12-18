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

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ConstructorBlueprint
import org.gtkkn.gir.blueprints.RecordUnionCommonBlueprint

/**
 * Provides common logic for generating records/unions, such as:
 * - Adding KDoc/Annotations
 * - Adding methods, fields
 * - Adding toString if needed
 * - Building companion object with factory constructors and functions
 */
interface RecordUnionGenerator : FieldGenerator, MethodGenerator, FunctionGenerator, ConstructorGenerator {
    fun TypeSpec.Builder.addCommonTopLevelKdocAndAnnotations(
        blueprint: RecordUnionCommonBlueprint
    ) {
        addKdoc(buildTypeKDoc(blueprint.kdoc, blueprint.optInVersionBlueprint, blueprint.skippedObjects))
        blueprint.optInVersionBlueprint?.typeName?.let { addAnnotation(it) }
    }

    fun TypeSpec.Builder.addMethodsAndFields(
        blueprint: RecordUnionCommonBlueprint
    ) {
        // Instance methods
        blueprint.methods.forEach { addFunction(buildMethod(it, blueprint.objectPointerName)) }

        // Fields
        blueprint.fields.forEach { addProperty(buildFieldProperty(blueprint.objectPointerName, it)) }
    }

    fun TypeSpec.Builder.addToStringIfNeeded(
        blueprint: RecordUnionCommonBlueprint,
        isDisguised: Boolean = false
    ) {
        if (blueprint.fields.isNotEmpty() && blueprint.methods.none { it.kotlinName == "toString" }) {
            addFunction(buildToStringFunction(blueprint))
        } else if ((blueprint.nativeTypeName as ClassName).simpleName == "GValue") {
            addFunction(buildGValueToStringFunction())
        }
    }

    fun buildToStringFunction(blueprint: RecordUnionCommonBlueprint): FunSpec {
        val fieldValues = blueprint.fields.joinToString(", ") { "${it.kotlinName}=\$${it.kotlinName}" }
        return FunSpec.builder("toString")
            .addModifiers(KModifier.OVERRIDE)
            .returns(String::class)
            .addCode("return \"${blueprint.kotlinName}($fieldValues)\"")
            .build()
    }

    fun buildGValueToStringFunction(): FunSpec = FunSpec.builder("toString")
        .addModifiers(KModifier.OVERRIDE)
        .returns(String::class)
        .addCode("return %T.strdupValueContents(this)", BindingsGenerator.G_OBJECT)
        .build()

    fun buildCompanionObject(
        blueprint: RecordUnionCommonBlueprint,
        kotlinTypeName: ClassName
    ): TypeSpec? {
        if (blueprint.constructors.isEmpty() && blueprint.functions.isEmpty()) {
            return null
        }
        val companionSpecBuilder = TypeSpec.companionObjectBuilder()
        blueprint.constructors.forEach {
            companionSpecBuilder.addFunction(buildFactoryConstructorFunction(kotlinTypeName, it))
        }
        blueprint.functions.forEach {
            companionSpecBuilder.addFunction(buildFunction(it))
        }
        return companionSpecBuilder.build()
    }

    /**
     * Builds a factory constructor function (in the companion object) from a ConstructorBlueprint.
     */
    fun buildFactoryConstructorFunction(
        kotlinTypeName: ClassName,
        constructor: ConstructorBlueprint
    ): FunSpec {
        val funSpecBuilder = FunSpec.builder(constructor.kotlinName)

        // Add KDoc
        buildMethodKDoc(
            constructor.kdoc,
            constructor.parameters,
            constructor.optInVersionBlueprint,
            constructor.returnTypeKDoc,
        )?.let { funSpecBuilder.addKdoc(it) }

        // Determine return type
        val returnTypeName = if (constructor.throws) {
            BindingsGenerator.RESULT_TYPE.parameterizedBy(constructor.returnTypeInfo.kotlinTypeName)
        } else {
            constructor.returnTypeInfo.kotlinTypeName
        }
        funSpecBuilder.returns(returnTypeName)

        if (constructor.parameters.isNotEmpty()) {
            funSpecBuilder.appendSignatureParameters(constructor.parameters)
        }

        if (constructor.needsMemscoped) {
            funSpecBuilder.beginControlFlow("%M", BindingsGenerator.MEMSCOPED)
        }

        if (constructor.parameters.isEmpty()) {
            if (constructor.throws) {
                error("Throwing no-argument constructors are not supported")
            }
            funSpecBuilder.addStatement(
                "return %T(%M()!!.%M())",
                kotlinTypeName,
                constructor.nativeMemberName,
                BindingsGenerator.REINTERPRET_FUNC,
            )
        } else {
            if (constructor.throws) {
                addThrowableFactoryConstructorLogic(funSpecBuilder, constructor)
            } else {
                addNonThrowableFactoryConstructorLogic(funSpecBuilder, kotlinTypeName, constructor)
            }
        }

        if (constructor.needsMemscoped) {
            funSpecBuilder.endControlFlow()
        }

        return funSpecBuilder.build()
    }
}
