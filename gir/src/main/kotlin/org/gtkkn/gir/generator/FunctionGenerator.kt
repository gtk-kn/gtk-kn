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
import org.gtkkn.gir.blueprints.FunctionBlueprint

/**
 * Provides functionality to build a [FunSpec] representing the given [FunctionBlueprint].
 */
interface FunctionGenerator : MethodGenerator {
    /**
     * Builds a [FunSpec] for the given [FunctionBlueprint], including necessary conversions,
     * error handling, and memory management logic.
     *
     * @param func The [FunctionBlueprint] describing the function to be generated.
     * @return A constructed [FunSpec] for the function.
     */
    fun buildFunction(func: FunctionBlueprint): FunSpec {
        val builder = FunSpec.builder(func.kotlinName)

        addKDocAndAnnotations(builder, func)
        setReturnType(builder, func)
        builder.appendSignatureParameters(func.parameters)

        handleMemScopedStart(builder, func)

        if (func.throws) {
            prepareErrorPointerAndCall(builder, func)
            handleThrowableResult(builder, func)
        } else {
            directNativeCall(builder, func)
            handleNonThrowableResult(builder, func)
        }

        handleMemScopedEnd(builder, func)

        return builder.build()
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
}
