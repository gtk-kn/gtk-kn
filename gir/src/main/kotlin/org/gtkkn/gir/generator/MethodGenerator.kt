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

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import org.gtkkn.gir.blueprints.MethodBlueprint
import org.gtkkn.gir.blueprints.ParameterBlueprint

/**
 * Provides functionality to build a [FunSpec] representing the given [MethodBlueprint].
 */
interface MethodGenerator : ConversionBlockGenerator, KDocGenerator {
    /**
     * Builds a [FunSpec] for the provided [MethodBlueprint].
     *
     * @param method The method blueprint describing the native method.
     * @param instancePointer The instance pointer name, if this is an instance method.
     * @param builderType The type of builder to use (default, getter, setter).
     * @return A constructed [FunSpec] representing the native method call in Kotlin.
     */
    fun buildMethod(
        method: MethodBlueprint,
        instancePointer: String?,
        builderType: FunSpecBuilderType = FunSpecBuilderType.DEFAULT
    ): FunSpec {
        // Start with a builder appropriate for the method type (default, getter, or setter)
        val builder = createFunSpecBuilder(method, builderType)

        addMethodKDocAndAnnotations(builder, method, builderType)
        setMethodReturnTypeAndModifiers(builder, method, builderType)
        val includeDefaults = builderType == FunSpecBuilderType.DEFAULT && !method.isOverride
        builder.appendSignatureParameters(method.parameters, includeDefaults)

        handleMemScopedStart(builder, method)

        // Call logic
        if (method.throws) {
            // Throwable call path
            prepareThrowableCall(builder, method, instancePointer)
            handleThrowableResult(builder, method)
        } else {
            // Non-throwable call path
            directNonThrowableCall(builder, method, instancePointer)
            handleNonThrowableResult(builder, method)
        }

        handleMemScopedEnd(builder, method)

        return builder.build()
    }

    /**
     * Creates the initial [FunSpec.Builder] based on the method type (default, getter, or setter).
     */
    private fun createFunSpecBuilder(method: MethodBlueprint, builderType: FunSpecBuilderType): FunSpec.Builder =
        when (builderType) {
            FunSpecBuilderType.DEFAULT -> FunSpec.builder(method.kotlinName)
            FunSpecBuilderType.GETTER -> FunSpec.getterBuilder()
            FunSpecBuilderType.SETTER -> FunSpec.setterBuilder()
        }

    /**
     * Adds method-level KDoc and annotations (including any opt-in annotations) to the builder.
     */
    private fun addMethodKDocAndAnnotations(
        builder: FunSpec.Builder,
        method: MethodBlueprint,
        builderType: FunSpecBuilderType
    ) {
        buildMethodKDoc(
            method.kdoc,
            method.parameters,
            method.optInVersionBlueprint,
            method.returnTypeKDoc,
        )?.let { builder.addKdoc(it) }

        if (builderType != FunSpecBuilderType.GETTER && method.optInVersionBlueprint?.typeName != null) {
            // Special handling for toString override which may require a suppression annotation
            if (method.isOverride && method.kotlinName == "toString") {
                builder.addAnnotation(
                    AnnotationSpec.builder(Suppress::class)
                        .addMember("%S", "POTENTIALLY_NON_REPORTED_ANNOTATION")
                        .build(),
                )
            }
            builder.addAnnotation(method.optInVersionBlueprint.typeName)
        }
    }

    /**
     * Sets the return type, and adds method-level modifiers (override/open) if applicable.
     */
    private fun setMethodReturnTypeAndModifiers(
        builder: FunSpec.Builder,
        method: MethodBlueprint,
        builderType: FunSpecBuilderType
    ) {
        if (builderType == FunSpecBuilderType.DEFAULT) {
            val returnTypeName = if (method.throws) {
                BindingsGenerator.RESULT_TYPE.parameterizedBy(method.returnTypeInfo.kotlinTypeName)
            } else {
                method.returnTypeInfo.kotlinTypeName
            }
            builder.returns(returnTypeName)

            if (method.isOverride) {
                builder.addModifiers(KModifier.OVERRIDE)
            }

            if (method.isOpen && !method.isOverride) {
                builder.addModifiers(KModifier.OPEN)
            }
        }
    }

    /**
     * If needed, begins a `memScoped` block to ensure proper memory management
     * for parameters and error pointers.
     */
    private fun handleMemScopedStart(builder: FunSpec.Builder, method: MethodBlueprint) {
        if (method.needsMemscoped) {
            builder.beginControlFlow("return %M", BindingsGenerator.MEMSCOPED)
        }
    }

    /**
     * Prepares for a throwable method call by allocating a GError pointer,
     * then starts the native function call into an intermediate value (`gResult`).
     */
    private fun prepareThrowableCall(builder: FunSpec.Builder, method: MethodBlueprint, instancePointer: String?) {
        builder.addStatement(
            "val gError = %M<%M>()",
            BindingsGenerator.ALLOC_POINTER_TO,
            BindingsGenerator.G_ERROR_MEMBER,
        )
        builder.addCode("val gResult = %M(", method.nativeMemberName)
        appendNativeCallParameters(builder, method, instancePointer, includeError = true)
        builder.addCode(")")
    }

    /**
     * Handles the logic after a throwable method call:
     * - Converts the native result to Kotlin.
     * - Checks for errors and throws an exception if found.
     * - Returns a [Result] wrapping success/failure.
     */
    private fun handleThrowableResult(builder: FunSpec.Builder, method: MethodBlueprint) {
        builder.addCode(buildNativeToKotlinConversionsBlock(method.returnTypeInfo.withNullable(true)))
        builder.addStatement("")
        builder.beginControlFlow("return if (gError.%M != null)", BindingsGenerator.POINTED_FUNC)
        builder.addStatement(
            "%T.failure(%M(%T(gError.%M!!.%M)))",
            BindingsGenerator.RESULT_TYPE,
            method.exceptionResolvingFunctionMember,
            BindingsGenerator.GLIB_ERROR_TYPE,
            BindingsGenerator.POINTED_FUNC,
            BindingsGenerator.PTR_FUNC,
        )
        builder.endControlFlow()
        builder.beginControlFlow("else")
        if (!method.returnTypeInfo.kotlinTypeName.isNullable && method.returnTypeInfo.isCinteropNullable) {
            builder.addStatement("%T.success(checkNotNull(gResult))", BindingsGenerator.RESULT_TYPE)
        } else {
            builder.addStatement("%T.success(gResult)", BindingsGenerator.RESULT_TYPE)
        }
        builder.endControlFlow()
    }

    /**
     * Makes a direct native call for non-throwable methods. If there's an instance pointer,
     * it's included first. Returns directly without intermediate variable storage.
     */
    private fun directNonThrowableCall(builder: FunSpec.Builder, method: MethodBlueprint, instancePointer: String?) {
        builder.addCode("return %M(", method.nativeMemberName)
        appendNativeCallParameters(builder, method, instancePointer, includeError = false)
        builder.addCode(")")
    }

    /**
     * After a non-throwable method call, converts the native result to Kotlin types.
     */
    private fun handleNonThrowableResult(builder: FunSpec.Builder, method: MethodBlueprint) {
        builder.addCode(buildNativeToKotlinConversionsBlock(method.returnTypeInfo))
    }

    /**
     * Ends the `memScoped` block if it was started for this method.
     */
    private fun handleMemScopedEnd(builder: FunSpec.Builder, method: MethodBlueprint) {
        if (method.needsMemscoped) {
            builder.endControlFlow()
        }
    }

    /**
     * Appends parameters to the native function call, including the instance pointer if present,
     * and the error parameter if the method can throw.
     */
    private fun appendNativeCallParameters(
        builder: FunSpec.Builder,
        method: MethodBlueprint,
        instancePointer: String?,
        includeError: Boolean
    ) {
        var needsComma = false

        if (instancePointer != null) {
            builder.addCode("%N.%M()", instancePointer, BindingsGenerator.REINTERPRET_FUNC)
            needsComma = true
        }

        method.parameters.forEach { param ->
            if (needsComma) builder.addCode(", ")
            builder.addCode(buildParameterConversionBlock(param))
            if (param.needsRawValueForEnums) {
                builder.addCode(".value")
            }
            needsComma = true
        }

        if (includeError) {
            builder.addCode(", gError.%M", BindingsGenerator.PTR_FUNC)
        }
    }

    /**
     * Appends parameters to the FunSpec signature, including default values if required.
     * Default values are only included if [includeDefaults] is true.
     */
    fun FunSpec.Builder.appendSignatureParameters(
        parameters: List<ParameterBlueprint>,
        includeDefaults: Boolean = true
    ) {
        parameters.forEach { param ->
            val paramSpecBuilder = ParameterSpec.builder(param.kotlinName, param.typeInfo.kotlinTypeName)
            if (includeDefaults && param.typeInfo.kotlinTypeName.isNullable && param.defaultNull) {
                paramSpecBuilder.defaultValue("null")
            }
            addParameter(paramSpecBuilder.build())
        }
    }
}
