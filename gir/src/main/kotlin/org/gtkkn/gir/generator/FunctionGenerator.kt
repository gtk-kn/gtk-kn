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
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import org.gtkkn.gir.blueprints.FunctionBlueprint

/**
 * Provides functionality to build a [FunSpec] representing the given [FunctionBlueprint].
 */
interface FunctionGenerator : MethodGenerator, ConversionBlockGenerator, KDocGenerator {
    /**
     * Builds a [FunSpec] for the given [FunctionBlueprint], including necessary conversions,
     * error handling, and memory management logic.
     *
     * @param func The [FunctionBlueprint] describing the function to be generated.
     * @return A constructed [FunSpec] for the function.
     */
    fun buildFunction(func: FunctionBlueprint): FunSpec {
        val funBuilder = FunSpec.builder(func.kotlinName)

        addKDocAndAnnotations(funBuilder, func)
        setReturnType(funBuilder, func)
        funBuilder.appendSignatureParameters(func.parameters)

        handleMemScopedStart(funBuilder, func)

        if (func.throws) {
            prepareErrorPointerAndCall(funBuilder, func)
            handleThrowableResultConversion(funBuilder, func)
        } else {
            directNativeCall(funBuilder, func)
            handleNonThrowableResultConversion(funBuilder, func)
        }

        handleMemScopedEnd(funBuilder, func)

        return funBuilder.build()
    }

    /**
     * Adds KDoc and any required annotations (such as opt-in annotations) to the function builder.
     */
    private fun addKDocAndAnnotations(builder: FunSpec.Builder, func: FunctionBlueprint) {
        buildMethodKDoc(
            func.kdoc,
            func.parameters,
            func.optInVersionBlueprint,
            func.returnTypeKDoc,
        )?.let { builder.addKdoc(it) }

        func.optInVersionBlueprint?.typeName?.let { annotationClassName ->
            builder.addAnnotation(annotationClassName)
        }
    }

    /**
     * Sets the return type for the function based on whether it can throw exceptions.
     * If the function can throw, wraps the return type in a [Result].
     */
    private fun setReturnType(builder: FunSpec.Builder, func: FunctionBlueprint) {
        val returnType = if (func.throws) {
            BindingsGenerator.RESULT_TYPE.parameterizedBy(func.returnTypeInfo.kotlinTypeName)
        } else {
            func.returnTypeInfo.kotlinTypeName
        }
        builder.returns(returnType)
    }

    /**
     * If the function requires memscoped allocation (e.g., for error pointers),
     * begins a `memScoped` block.
     */
    private fun handleMemScopedStart(builder: FunSpec.Builder, func: FunctionBlueprint) {
        if (func.needsMemscoped) {
            builder.beginControlFlow("return·%M", BindingsGenerator.MEMSCOPED)
        }
    }

    /**
     * If the function can throw, prepares a GError pointer and starts the native function call,
     * capturing the result in a temporary variable `gResult`.
     */
    private fun prepareErrorPointerAndCall(builder: FunSpec.Builder, func: FunctionBlueprint) {
        builder.addStatement(
            "val gError = %M<%M>()",
            BindingsGenerator.ALLOC_POINTER_TO,
            BindingsGenerator.G_ERROR_MEMBER,
        )
        builder.addCode("val gResult = %M(", func.nativeMemberName)

        appendNativeCallParameters(builder, func)

        builder.addCode(")")
    }

    /**
     * Performs a direct native call (no error pointer) for non-throwable functions,
     * returning immediately from the function.
     */
    private fun directNativeCall(builder: FunSpec.Builder, func: FunctionBlueprint) {
        builder.addCode("return·%M(", func.nativeMemberName)
        appendNativeCallParameters(builder, func)
        builder.addCode(")")
    }

    /**
     * Appends parameters to the native function call, handling throwing logic by adding
     * the `gError` pointer if necessary.
     */
    private fun appendNativeCallParameters(builder: FunSpec.Builder, func: FunctionBlueprint) {
        func.parameters.forEachIndexed { index, param ->
            if (index > 0) builder.addCode(", ")
            builder.addCode(buildParameterConversionBlock(param.typeInfo, param.kotlinName))
        }

        // If the function throws, add the error parameter at the end
        if (func.throws) {
            if (func.parameters.isNotEmpty()) {
                builder.addCode(", ")
            }
            builder.addCode("gError.%M", BindingsGenerator.PTR_FUNC)
        }
    }

    /**
     * Handles the result conversion for a throwable function:
     * - Converts the native result to Kotlin.
     * - Checks for errors and returns a failure [Result] if present.
     * - Otherwise, returns a success [Result].
     */
    private fun handleThrowableResultConversion(builder: FunSpec.Builder, func: FunctionBlueprint) {
        builder.addCode(buildNativeToKotlinConversionsBlock(func.returnTypeInfo.withNullable(true)))
        builder.addStatement("")
        builder.beginControlFlow("return·if·(gError.%M != null)", BindingsGenerator.POINTED_FUNC)
        builder.addStatement(
            "%T.failure(%M(%T(gError.%M!!.%M)))",
            BindingsGenerator.RESULT_TYPE,
            func.exceptionResolvingFunctionMember,
            BindingsGenerator.GLIB_ERROR_TYPE,
            BindingsGenerator.POINTED_FUNC,
            BindingsGenerator.PTR_FUNC,
        )
        builder.endControlFlow()
        builder.beginControlFlow("else")
        if (!func.returnTypeInfo.kotlinTypeName.isNullable && func.returnTypeInfo.isCinteropNullable) {
            builder.addStatement("%T.success(checkNotNull(gResult))", BindingsGenerator.RESULT_TYPE)
        } else {
            builder.addStatement("%T.success(gResult)", BindingsGenerator.RESULT_TYPE)
        }
        builder.endControlFlow()
    }

    /**
     * Handles the result conversion for a non-throwable function:
     * Simply converts the native result to Kotlin types and returns it.
     */
    private fun handleNonThrowableResultConversion(builder: FunSpec.Builder, func: FunctionBlueprint) {
        builder.addCode(buildNativeToKotlinConversionsBlock(func.returnTypeInfo))
    }

    /**
     * Closes the `memScoped` block if it was opened for this function.
     */
    private fun handleMemScopedEnd(builder: FunSpec.Builder, func: FunctionBlueprint) {
        if (func.needsMemscoped) {
            builder.endControlFlow()
        }
    }
}
