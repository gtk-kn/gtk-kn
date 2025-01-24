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
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import org.gtkkn.gir.blueprints.CallableBlueprint
import org.gtkkn.gir.blueprints.ParameterBlueprint

/**
 * Provides functionality to build a [FunSpec] representing the given [CallableBlueprint].
 */
interface CallableGenerator : ConversionBlockGenerator {
    /**
     * Appends parameters to the native function call, handling throwing logic by adding
     * the `gError` pointer if necessary.
     */
    fun appendNativeCallParameters(builder: FunSpec.Builder, callable: CallableBlueprint) {
        callable.parameters.forEachIndexed { index, param ->
            if (index > 0) builder.addCode(", ")
            builder.addCode(buildParameterConversionBlock(param.typeInfo, param.kotlinName))
        }

        // If the function throws, add the error parameter at the end
        if (callable.throws) {
            if (callable.parameters.isNotEmpty()) {
                builder.addCode(", ")
            }
            builder.addCode("gError.%M", BindingsGenerator.PTR_FUNC)
        }
    }

    /**
     * Sets the return type, and adds method-level modifiers (override/open) if applicable.
     */
    fun setReturnType(
        builder: FunSpec.Builder,
        callable: CallableBlueprint,
        isOverride: Boolean = false,
        isOpen: Boolean = false,
        builderType: FunSpecBuilderType = FunSpecBuilderType.DEFAULT,
    ) {
        if (builderType == FunSpecBuilderType.DEFAULT) {
            val returnTypeName = if (callable.throws) {
                BindingsGenerator.RESULT_TYPE.parameterizedBy(callable.returnTypeInfo.kotlinTypeName)
            } else {
                callable.returnTypeInfo.kotlinTypeName
            }
            builder.returns(returnTypeName)

            if (isOverride) {
                builder.addModifiers(KModifier.OVERRIDE)
            }

            if (isOpen && !isOverride) {
                builder.addModifiers(KModifier.OPEN)
            }
        }
    }

    /**
     * If needed, begins a `memScoped` block to ensure proper memory management
     * for parameters and error pointers.
     */
    fun handleMemScopedStart(builder: FunSpec.Builder, callable: CallableBlueprint) {
        if (callable.needsMemscoped) {
            builder.beginControlFlow("return %M", BindingsGenerator.MEMSCOPED)
        }
    }

    /**
     * Ends the `memScoped` block if it was started for this method.
     */
    fun handleMemScopedEnd(builder: FunSpec.Builder, callable: CallableBlueprint) {
        if (callable.needsMemscoped) {
            builder.endControlFlow()
        }
    }

    /**
     * Handles the result conversion for a throwable function:
     * - Converts the native result to Kotlin.
     * - Checks for errors and returns a failure [Result] if present.
     * - Otherwise, returns a success [Result].
     */
    fun handleThrowableResult(builder: FunSpec.Builder, callable: CallableBlueprint) {
        builder.addCode(buildNativeToKotlinConversionsBlock(callable.returnTypeInfo.withNullable(true)))
        builder.addStatement("")
        builder.beginControlFlow("return·if·(gError.%M != null)", BindingsGenerator.POINTED_FUNC)
        builder.addStatement(
            "%T.failure(%M(%T(gError.%M!!.%M)))",
            BindingsGenerator.RESULT_TYPE,
            callable.exceptionResolvingFunctionMember,
            BindingsGenerator.GLIB_ERROR_TYPE,
            BindingsGenerator.POINTED_FUNC,
            BindingsGenerator.PTR_FUNC,
        )
        builder.nextControlFlow("else")
        if (!callable.returnTypeInfo.kotlinTypeName.isNullable && callable.returnTypeInfo.isCinteropNullable) {
            builder.addStatement("%T.success(checkNotNull(gResult))", BindingsGenerator.RESULT_TYPE)
        } else {
            builder.addStatement("%T.success(gResult)", BindingsGenerator.RESULT_TYPE)
        }
        builder.endControlFlow()
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

    /**
     * Handles the result conversion for a non-throwable function:
     * Simply converts the native result to Kotlin types and returns it.
     */
    fun handleNonThrowableResult(
        builder: FunSpec.Builder,
        callable: CallableBlueprint,
        reinterpretReturnValue: Boolean = false
    ) {
        builder.addCode(buildNativeToKotlinConversionsBlock(callable.returnTypeInfo, reinterpretReturnValue))
    }
}
