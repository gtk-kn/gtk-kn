/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
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

    fun buildVariantGetTypeFunction(): FunSpec = FunSpec.builder("getType")
        .returns(G_TYPE)
        .addKdoc(
            """
                Get the GType of Variant

                @return the GType
            """.trimIndent(),
        )
        .addStatement("return %T.VARIANT", BindingsGenerator.GOBJECT_TYPES)
        .build()

    fun TypeSpec.Builder.buildInternalGetTypeOrNullFunction(functions: List<FunctionBlueprint>) {
        functions.firstOrNull { functionBlueprint ->
            functionBlueprint.kotlinName == "getType" &&
                functionBlueprint.returnTypeInfo.kotlinTypeName == G_TYPE &&
                functionBlueprint.parameters.isEmpty()
        }?.let { blueprint ->
            val funSpec = FunSpec.builder("getTypeOrNull")
                .addModifiers(KModifier.INTERNAL)
                .returns(G_TYPE.copy(nullable = true))
                .addKdoc(
                    """
                        Gets the GType of from the symbol `${blueprint.nativeMemberName.simpleName}` if it exists.

                        This function dynamically resolves the specified symbol as a C function pointer and invokes it
                        to retrieve the `GType`.

                        @return the GType, or `null` if the symbol cannot be resolved.
                    """.trimIndent(),
                )
                .addStatement(
                    "return %M(%S)",
                    BindingsGenerator.GET_TYPE_OR_NULL_MEMBER,
                    blueprint.nativeMemberName.simpleName,
                )
                .build()
            addFunction(funSpec)
        }
    }

    /**
     * Adds KDoc and any required annotations (such as opt-in annotations) to the function builder.
     */
    private fun addKDocAndAnnotations(builder: FunSpec.Builder, func: FunctionBlueprint) {
        buildMethodKDoc(
            kdoc = func.kdoc,
            parameters = func.parameters,
            optInVersionBlueprint = func.optInVersionBlueprint,
            deprecatedBlueprint = func.deprecatedBlueprint,
            returnTypeKDoc = func.returnTypeKDoc,
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
