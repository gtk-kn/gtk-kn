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

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.FunSpec
import org.gtkkn.gir.blueprints.MethodBlueprint

/**
 * Provides functionality to build a [FunSpec] representing the given [MethodBlueprint].
 */
interface MethodGenerator : CallableGenerator, KDocGenerator {
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
        setReturnType(
            builder = builder,
            callable = method,
            isOverride = method.isOverride,
            isOpen = method.isOpen,
            builderType = builderType,
        )
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
            handleNonThrowableResult(builder, method, method.reinterpretReturnValue)
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
            kdoc = method.kdoc,
            parameters = method.parameters,
            optInVersionBlueprint = method.optInVersionBlueprint,
            deprecatedBlueprint = method.deprecatedBlueprint,
            returnTypeKDoc = method.returnTypeKDoc,
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
     * Makes a direct native call for non-throwable methods. If there's an instance pointer,
     * it's included first. Returns directly without intermediate variable storage.
     */
    private fun directNonThrowableCall(builder: FunSpec.Builder, method: MethodBlueprint, instancePointer: String?) {
        builder.addCode("return %M(", method.nativeMemberName)
        appendNativeCallParameters(builder, method, instancePointer, includeError = false)
        builder.addCode(")")
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
            builder.addCode("%N", instancePointer)
            if (method.reinterpretInstanceParameter) {
                builder.addCode(".%M()", BindingsGenerator.REINTERPRET_FUNC)
            }
            needsComma = true
        }

        method.parameters.forEach { param ->
            if (needsComma) builder.addCode(", ")
            builder.addCode(buildParameterConversionBlock(param.typeInfo, param.kotlinName))
            if (param.needsRawValueForEnums) {
                builder.addCode(".value")
            }
            needsComma = true
        }

        if (includeError) {
            builder.addCode(", gError.%M", BindingsGenerator.PTR_FUNC)
        }
    }
}
