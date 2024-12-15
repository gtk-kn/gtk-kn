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
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeAliasSpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.U_LONG
import org.gtkkn.gir.blueprints.AliasBlueprint
import org.gtkkn.gir.blueprints.CallbackBlueprint
import org.gtkkn.gir.blueprints.ClosureBlueprint
import org.gtkkn.gir.blueprints.FunctionBlueprint
import org.gtkkn.gir.blueprints.MethodBlueprint
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.PropertyBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.blueprints.SignalBlueprint

interface MiscGenerator : ConversionBlockGenerator, KDocGenerator {
    fun buildProperty(property: PropertyBlueprint, instancePointer: String?): PropertySpec =
        PropertySpec.builder(property.kotlinName, property.typeInfo.kotlinTypeName, KModifier.PUBLIC).apply {
            addKdoc(buildPropertyKDoc(property.kdoc, property.optInVersionBlueprint))

            // optInVersion
            property.optInVersionBlueprint?.typeName?.let { annotationClassName ->
                addAnnotation(annotationClassName)
            }

            if (property.isOverride) {
                addModifiers(KModifier.OVERRIDE)
            }

            if (property.isOpen && !property.isOverride) {
                addModifiers(KModifier.OPEN)
            }

            getter(buildMethod(property.getter, instancePointer, FunSpecBuilderType.GETTER))

            property.setter?.let { setter ->
                mutable(true)
                setter(buildMethod(setter, instancePointer, FunSpecBuilderType.SETTER))
            }
        }.build()

    @Suppress("LongMethod", "CyclomaticComplexMethod")
    fun buildMethod(
        method: MethodBlueprint,
        instancePointer: String?,
        builderType: FunSpecBuilderType = FunSpecBuilderType.DEFAULT
    ): FunSpec = when (builderType) {
        FunSpecBuilderType.DEFAULT -> FunSpec.builder(method.kotlinName)
        FunSpecBuilderType.GETTER -> FunSpec.getterBuilder()
        FunSpecBuilderType.SETTER -> FunSpec.setterBuilder()
    }.apply {
        buildMethodKDoc(
            method.kdoc,
            method.parameters,
            method.optInVersionBlueprint,
            method.returnTypeKDoc,
        )?.let { addKdoc(it) }

        // optInVersion
        if (builderType != FunSpecBuilderType.GETTER && method.optInVersionBlueprint?.typeName != null) {
            if (method.isOverride && method.kotlinName == "toString") {
                addAnnotation(
                    AnnotationSpec.builder(Suppress::class)
                        .addMember("%S", "POTENTIALLY_NON_REPORTED_ANNOTATION")
                        .build(),
                )
            }
            addAnnotation(method.optInVersionBlueprint.typeName)
        }

        if (builderType == FunSpecBuilderType.DEFAULT) {
            val returnTypeName = if (method.throws) {
                BindingsGenerator.RESULT_TYPE.parameterizedBy(method.returnTypeInfo.kotlinTypeName)
            } else {
                method.returnTypeInfo.kotlinTypeName
            }

            returns(returnTypeName)

            if (method.isOverride) {
                addModifiers(KModifier.OVERRIDE)
            }

            if (method.isOpen && !method.isOverride) {
                addModifiers(KModifier.OPEN)
            }
        }

        val includeDefaults = builderType == FunSpecBuilderType.DEFAULT && !method.isOverride
        appendSignatureParameters(method.parameters, includeDefaults)

        // begin implementation
        if (method.needsMemscoped) {
            beginControlFlow("return·%M", BindingsGenerator.MEMSCOPED)
        }

        if (method.throws) {
            // prepare error pointer
            addStatement("val gError = %M<%M>()", BindingsGenerator.ALLOC_POINTER_TO, BindingsGenerator.G_ERROR_MEMBER)
            // open native method call into intermediate val
            addCode("val gResult = %M(", method.nativeMemberName) // open native function call
        } else {
            // if not throws, we can return directly without intermediate
            addCode("return·%M(", method.nativeMemberName) // open native function call
        }

        var needsComma = false
        if (instancePointer != null) {
            // adding reinterpret() here because sometimes the instancePointer has a different type
            addCode("%N.%M()", instancePointer, BindingsGenerator.REINTERPRET_FUNC)
            needsComma = true
        }

        method.parameters.forEach { param ->
            if (needsComma) {
                addCode(", ")
            }

            addCode(buildParameterConversionBlock(param))
        }

        if (method.throws) {
            addCode(", gError.%M", BindingsGenerator.PTR_FUNC)
        }

        addCode(")") // close native function call

        if (method.throws) {
            // native function return value conversion
            // in case the method throws, we force the returnValue conversion to be nullable so we can do
            // error checking first
            addCode(buildNativeToKotlinConversionsBlock(method.returnTypeInfo.withNullable(true)))
            addStatement("")
            // check errors and wrap in Result
            beginControlFlow("return·if·(gError.%M != null)", BindingsGenerator.POINTED_FUNC)
            addStatement(
                "%T.failure(%M(%T(gError.%M!!.%M)))",
                BindingsGenerator.RESULT_TYPE,
                method.exceptionResolvingFunctionMember,
                BindingsGenerator.GLIB_ERROR_TYPE,
                BindingsGenerator.POINTED_FUNC,
                BindingsGenerator.PTR_FUNC,
            )
            endControlFlow()
            beginControlFlow("else")
            if (!method.returnTypeInfo.kotlinTypeName.isNullable && method.returnTypeInfo.isCinteropNullable) {
                addStatement("%T.success(checkNotNull(gResult))", BindingsGenerator.RESULT_TYPE)
            } else {
                addStatement("%T.success(gResult)", BindingsGenerator.RESULT_TYPE)
            }

            endControlFlow()
        } else {
            // native function return value conversion
            addCode(buildNativeToKotlinConversionsBlock(method.returnTypeInfo))
            // return is already handled
        }

        if (method.needsMemscoped) {
            endControlFlow()
        }
    }.build()

    /**
     * Build a function implementation for standalone functions (not methods with an instance parameter).
     */
    @Suppress("LongMethod", "CyclomaticComplexMethod")
    fun buildFunction(func: FunctionBlueprint): FunSpec = FunSpec.builder(func.kotlinName).apply {
        // kdoc
        buildMethodKDoc(
            func.kdoc,
            func.parameters,
            func.optInVersionBlueprint,
            func.returnTypeKDoc,
        )?.let { addKdoc(it) }

        // optInVersion
        func.optInVersionBlueprint?.typeName?.let { annotationClassName ->
            addAnnotation(annotationClassName)
        }

        // add return value to signature
        val returnType = if (func.throws) {
            BindingsGenerator.RESULT_TYPE.parameterizedBy(func.returnTypeInfo.kotlinTypeName)
        } else {
            func.returnTypeInfo.kotlinTypeName
        }
        returns(returnType)

        // add parameters to signature
        appendSignatureParameters(func.parameters)

        if (func.needsMemscoped) {
            beginControlFlow("return·%M", BindingsGenerator.MEMSCOPED)
        }

        if (func.throws) {
            // prepare error pointer
            addStatement("val gError = %M<%M>()", BindingsGenerator.ALLOC_POINTER_TO, BindingsGenerator.G_ERROR_MEMBER)
            // open native method call into intermediate val
            addCode("val gResult = %M(", func.nativeMemberName) // open native function call
        } else {
            addCode("return·%M(", func.nativeMemberName) // open native function call
        }

        func.parameters.forEachIndexed { index, param ->
            if (index > 0) {
                addCode(", ")
            }
            addCode(buildParameterConversionBlock(param))
        }

        if (func.throws) {
            if (func.parameters.isNotEmpty()) {
                addCode(", ")
            }
            addCode("gError.%M", BindingsGenerator.PTR_FUNC)
        }

        addCode(")") // close native function call

        if (func.throws) {
            // native function return value conversion
            // in case the method throws, we force the returnValue conversion to be nullable so we can do
            // error checking first
            addCode(buildNativeToKotlinConversionsBlock(func.returnTypeInfo.withNullable(true)))
            addStatement("")
            // check errors and wrap in Result
            beginControlFlow("return·if·(gError.%M != null)", BindingsGenerator.POINTED_FUNC)
            addStatement(
                "%T.failure(%M(%T(gError.%M!!.%M)))",
                BindingsGenerator.RESULT_TYPE,
                func.exceptionResolvingFunctionMember,
                BindingsGenerator.GLIB_ERROR_TYPE,
                BindingsGenerator.POINTED_FUNC,
                BindingsGenerator.PTR_FUNC,
            )
            endControlFlow()
            beginControlFlow("else")
            if (!func.returnTypeInfo.kotlinTypeName.isNullable && func.returnTypeInfo.isCinteropNullable) {
                addStatement("%T.success(checkNotNull(gResult))", BindingsGenerator.RESULT_TYPE)
            } else {
                addStatement("%T.success(gResult)", BindingsGenerator.RESULT_TYPE)
            }

            endControlFlow()
        } else {
            // native function return value conversion
            addCode(buildNativeToKotlinConversionsBlock(func.returnTypeInfo))
        }

        if (func.needsMemscoped) {
            endControlFlow()
        }
    }.build()

    fun buildSignalConnectFunction(signal: SignalBlueprint, objectPointerName: String): FunSpec =
        FunSpec.builder(signal.kotlinConnectName).apply {
            val connectFlagsTypeName = ClassName("org.gtkkn.bindings.gobject", "ConnectFlags")

            addKdoc(
                buildSignalKDoc(
                    signal.kdoc,
                    signal.parameters,
                    signal.optInVersionBlueprint,
                    signal.returnTypeKDoc,
                ),
            )

            // optInVersion
            signal.optInVersionBlueprint?.typeName?.let { annotationClassName ->
                addAnnotation(annotationClassName)
            }

            // connect flags
            addParameter(
                ParameterSpec.builder("connectFlags", connectFlagsTypeName)
                    .defaultValue("%T(0u)", connectFlagsTypeName)
                    .build(),
            )
            // trailing lambda for handler
            addParameter(
                "handler",
                signal.lambdaTypeName,
            )
            returns(U_LONG)

            // add implementation
            addCode("return·%M(", BindingsGenerator.G_SIGNAL_CONNECT_DATA)
            addCode("%N.%M()", objectPointerName, BindingsGenerator.REINTERPRET_FUNC)
            addCode(", %S", signal.signalName)
            addCode(", %NFunc.%M()", signal.kotlinConnectName, BindingsGenerator.REINTERPRET_FUNC)
            addCode(", %T.create(handler).asCPointer()", BindingsGenerator.STABLEREF)
            addCode(", %M.%M()", BindingsGenerator.STATIC_STABLEREF_DESTROY, BindingsGenerator.REINTERPRET_FUNC)
            addCode(", connectFlags.mask")

            addCode(")")
        }.build()

    /**
     * Build the private property that holds the static C callback functions that we use for implementing
     * the connect<signal-name>() methods.
     */
    fun buildStaticSignalCallback(signal: SignalBlueprint): PropertySpec {
        val staticCallbackVal = PropertySpec.builder(
            "${signal.kotlinConnectName}Func",
            nativeCallbackCFunctionTypeName(
                signal.returnTypeInfo.nativeTypeName,
                signal.parameters
                    .filterNot { it.isUserData }
                    .map { param ->
                        ParameterSpec.builder("", param.typeInfo.nativeTypeName).build()
                    },
            ),
            KModifier.PRIVATE,
        ).initializer(buildStaticClosureImplementation(signal))
        return staticCallbackVal.build()
    }

    /**
     * Build the [staticCFunction] implementation for closures like signal connect handlers and callbacks.
     */
    private fun buildStaticClosureImplementation(closure: ClosureBlueprint) = CodeBlock.builder().apply {
        beginControlFlow("%M", BindingsGenerator.STATIC_C_FUNC)

        // Check if we have a parameter marked as user data
        val userDataParameter = closure.parameters.firstOrNull { it.isUserData }

        // lambda signature
        if (closure.hasInstanceParameter) {
            addStatement("_: %T,", BindingsGenerator.KP_OPAQUE_POINTER)
        }

        closure.parameters.forEach { param ->
            // cinterop maps methods return values with pointer types as nullable
            // so we do the same thing here for the staticCFunction pointer arguments
            // check for gir-based nullability first to avoid double ?? in Kotlin
            val forceNullable = if (!param.typeInfo.kotlinTypeName.isNullable && param.typeInfo.isCinteropNullable) {
                "?"
            } else {
                ""
            }
            addStatement("%N: %T$forceNullable,", param.kotlinName, param.typeInfo.nativeTypeName)
        }

        // If we did not find a parameter with isUserData, we must add our own userData param
        if (userDataParameter == null) {
            addStatement("userData: %T", BindingsGenerator.KP_OPAQUE_POINTER)
        }

        addStatement("->")

        if (closure.needsMemscoped || closure.needsMemscopedReturnValue) {
            beginControlFlow("%M", BindingsGenerator.MEMSCOPED)
        }

        // Determine the parameter to use for stable ref extraction
        val stableRefParam = userDataParameter?.kotlinName ?: "userData"

        // Invoke the lambda retrieved from the stable ref
        val isUserDataNullable = userDataParameter?.typeInfo?.nativeTypeName?.isNullable == true
        val notNull = if (isUserDataNullable) "!!" else ""

        // Filter the userData parameter
        val newParameters = closure.lambdaTypeName.parameters.filterNot { it.name == stableRefParam }

        // Return a new LambdaTypeName with the updated parameters
        val lambdaTypeName = LambdaTypeName.get(
            parameters = newParameters,
            returnType = closure.lambdaTypeName.returnType,
        )

        add(
            "$stableRefParam$notNull.%M<%T>().get().invoke(",
            BindingsGenerator.AS_STABLE_REF_FUNC,
            lambdaTypeName,
        ) // open invoke

        // Pass all the non-userData parameters to the lambda
        closure.parameters
            .filterNot { it.isUserData }
            .forEachIndexed { index, param ->
                if (index > 0) {
                    add(", ")
                }
                add("%N", param.kotlinName)
                add(buildNativeToKotlinConversionsBlock(param.typeInfo))
            }
        add(")") // close invoke

        // Convert the return type and return from the lambda
        add(buildKotlinToNativeTypeConversionBlock(closure.returnTypeInfo))

        if (closure.needsMemscoped || closure.needsMemscopedReturnValue) {
            endControlFlow()
        }

        endControlFlow()
        add(".%M()", BindingsGenerator.REINTERPRET_FUNC)
    }.build()

    /**
     * Build a signature for the staticCFunction implementation for connect signal callbacks.
     *
     * This the equivalent of a native.gobject.GCallback typealias, that should point
     *      to a CPointer<CFunction<(T) -> R>> where T = arguments and R = result
     */
    private fun nativeCallbackCFunctionTypeName(
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

    fun FunSpec.Builder.appendSignatureParameters(
        parameters: List<ParameterBlueprint>,
        includeDefaults: Boolean = true
    ) {
        // add arguments to signature
        parameters.forEach { param ->
            val paramSpecBuilder = ParameterSpec.builder(param.kotlinName, param.typeInfo.kotlinTypeName)
            if (includeDefaults && param.typeInfo.kotlinTypeName.isNullable && param.defaultNull) {
                paramSpecBuilder.defaultValue("null")
            }
            addParameter(paramSpecBuilder.build())
        }
    }

    fun buildAliasTypeAlias(alias: AliasBlueprint) =
        TypeAliasSpec.builder(alias.kotlinName, alias.parentTypeName)
            .addKdoc(buildTypeKDoc(alias.kdoc, alias.optInVersionBlueprint))
            .build()

    fun buildCallbackTypeAlias(callback: CallbackBlueprint): TypeAliasSpec {
        val validParameterNames = callback.lambdaTypeName.parameters.map { it.name }.toSet()
        val parameters = callback.parameters.filter { it.kotlinName in validParameterNames }

        return TypeAliasSpec.builder(callback.kotlinName, callback.lambdaTypeName)
            .addKdoc(buildCallbackKDoc(callback.kdoc, parameters, callback.returnTypeKDoc))
            .build()
    }

    /**
     * Build the private property that holds the static C callback functions that we use for implementing
     * callbacks methods.
     */
    fun buildStaticCallbackProperty(callback: CallbackBlueprint): PropertySpec {
        val staticCallbackVal = PropertySpec.builder(
            "${callback.kotlinName}Func",
            nativeCallbackCFunctionTypeName(
                callback.returnTypeInfo.nativeTypeName,
                callback.parameters
                    .filterNot { it.isUserData }
                    .map { param ->
                        ParameterSpec.builder("", param.typeInfo.nativeTypeName).build()
                    },
            ),
        ).initializer(buildStaticClosureImplementation(callback))
        return staticCallbackVal.build()
    }

    /**
     * Add the common KGType-related initialization companions for KGType types.
     */
    fun TypeSpec.Builder.addKGTypeInit(
        typeName: ClassName,
        property: PropertySpec,
        repository: RepositoryBlueprint
    ) {
        addSuperinterface(
            BindingsGenerator.GOBJECT_TYPE_COMPANION
                .parameterizedBy(typeName),
        )
        // property needs to be added before the init block
        addProperty(property)
        if (!typeName.packageName.contains("bindings.glib")) {
            val companionInitializerBlock = CodeBlock.of(
                "%T.register()",
                repository.repositoryTypeProviderTypeName,
            )
            addInitializerBlock(companionInitializerBlock)
        }
    }
}
