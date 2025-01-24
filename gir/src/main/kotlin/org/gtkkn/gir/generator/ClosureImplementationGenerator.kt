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

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import org.gtkkn.gir.blueprints.ClosureBlueprint

interface ClosureImplementationGenerator : ConversionBlockGenerator {
    fun buildStaticClosureImplementation(closure: ClosureBlueprint): CodeBlock = CodeBlock.builder().apply {
        beginControlFlow("%M", BindingsGenerator.STATIC_C_FUNC)

        val userDataParameter = closure.parameters.firstOrNull { it.isUserData }

        // parameters
        if (closure.hasInstanceParameter) {
            addStatement("_: %T,", BindingsGenerator.KP_OPAQUE_POINTER)
        }

        closure.parameters.forEach { param ->
            val forceNullable =
                if (!param.typeInfo.kotlinTypeName.isNullable && param.typeInfo.isCinteropNullable) "?" else ""
            addStatement("%N: %T$forceNullable,", param.kotlinName, param.typeInfo.nativeTypeName)
        }

        if (userDataParameter == null) {
            addStatement("userData: %T", BindingsGenerator.KP_OPAQUE_POINTER)
        }

        addStatement("->")

        if (closure.needsMemscoped || closure.needsMemscopedReturnValue) {
            beginControlFlow("%M", BindingsGenerator.MEMSCOPED)
        }

        val stableRefParam = userDataParameter?.kotlinName ?: "userData"
        val isUserDataNullable = userDataParameter?.typeInfo?.nativeTypeName?.isNullable == true
        val notNull = if (isUserDataNullable) "!!" else ""

        val newParameters = closure.lambdaTypeName.parameters.filterNot { it.name == stableRefParam }
        val lambdaTypeName = LambdaTypeName.get(
            parameters = newParameters,
            returnType = closure.lambdaTypeName.returnType,
        )

        add(
            "$stableRefParam$notNull.%M<%T>().get().invoke(",
            BindingsGenerator.AS_STABLE_REF_FUNC,
            lambdaTypeName,
        )

        closure.parameters
            .filterNot { it.isUserData }
            .forEachIndexed { index, param ->
                if (index > 0) add(", ")
                add("%N", param.kotlinName)
                add(buildNativeToKotlinConversionsBlock(param.typeInfo))
            }
        add(")")
        add(buildKotlinToNativeTypeConversionBlock(closure.returnTypeInfo))

        if (closure.needsMemscoped || closure.needsMemscopedReturnValue) {
            endControlFlow()
        }

        endControlFlow()
        add(".%M()", BindingsGenerator.REINTERPRET_FUNC)
    }.build()

    fun nativeCallbackCFunctionTypeName(
        resultTypeName: TypeName,
        parameters: List<ParameterSpec> = emptyList()
    ) =
        BindingsGenerator.KP_CPOINTER.parameterizedBy(
            BindingsGenerator.KP_CFUNCTION.parameterizedBy(
                LambdaTypeName.get(
                    returnType = resultTypeName,
                    parameters = parameters,
                ),
            ),
        )
}
