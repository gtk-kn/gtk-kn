package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeAliasSpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.U_LONG
import org.gtkkn.gir.blueprints.CallbackBlueprint
import org.gtkkn.gir.blueprints.ClosureBlueprint
import org.gtkkn.gir.blueprints.FunctionBlueprint
import org.gtkkn.gir.blueprints.MethodBlueprint
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.PropertyBlueprint
import org.gtkkn.gir.blueprints.SignalBlueprint
import org.gtkkn.gir.processor.NativeTypes

interface MiscGenerator : ConversionBlockGenerator, KDocGenerator {

    fun buildProperty(property: PropertyBlueprint, instancePointer: String?): PropertySpec =
        PropertySpec.builder(property.kotlinName, property.typeInfo.kotlinTypeName, KModifier.PUBLIC).apply {
            addKdoc(buildPropertyKDoc(property.kdoc, property.version))

            if (property.isOverride) {
                addModifiers(KModifier.OVERRIDE)
            }

            if (property.isOpen) {
                addModifiers(KModifier.OPEN)
            }

            getter(buildMethod(property.getter, instancePointer, FunSpecBuilderType.GETTER))

            property.setter?.let { setter ->
                mutable(true)
                setter(buildMethod(setter, instancePointer, FunSpecBuilderType.SETTER))
            }
        }.build()

    @Suppress("LongMethod")
    fun buildMethod(
        method: MethodBlueprint,
        instancePointer: String?,
        builderType: FunSpecBuilderType = FunSpecBuilderType.DEFAULT
    ): FunSpec = when (builderType) {
        FunSpecBuilderType.DEFAULT -> FunSpec.builder(method.kotlinName)
        FunSpecBuilderType.GETTER -> FunSpec.getterBuilder()
        FunSpecBuilderType.SETTER -> FunSpec.setterBuilder()
    }.apply {
        addKdoc(buildMethodKDoc(method.kdoc, method.parameters, method.version, method.returnTypeKDoc))
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

            if (method.isOpen) {
                addModifiers(KModifier.OPEN)
            }
        }

        appendSignatureParameters(method.parameters)

        // begin implementation
        if (method.needsMemscoped) {
            beginControlFlow("return %M", BindingsGenerator.MEMSCOPED)
        }

        if (method.throws) {
            // prepare error pointer
            addStatement("val gError = %M<%M>()", BindingsGenerator.ALLOC_POINTER_TO, BindingsGenerator.G_ERROR_MEMBER)
            // open native method call into intermediate val
            addCode("val gResult = %M(", method.nativeMemberName) // open native function call
        } else {
            // if not throws, we can return directly without intermediate
            addCode("return %M(", method.nativeMemberName) // open native function call
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
            beginControlFlow("return if (gError.%M != null)", BindingsGenerator.POINTED_FUNC)
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
            if (!method.returnTypeInfo.kotlinTypeName.isNullable) {
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
    fun buildFunction(func: FunctionBlueprint): FunSpec = FunSpec.builder(func.kotlinName).apply {
        addKdoc(buildMethodKDoc(func.kdoc, func.parameters, func.version, func.returnTypeKDoc))
        // add return value to signature
        returns(func.returnTypeInfo.kotlinTypeName)

        // add parameters to signature
        appendSignatureParameters(func.parameters)

        if (func.needsMemscoped) {
            beginControlFlow("return %M", BindingsGenerator.MEMSCOPED)
        }

        addCode("return %M(", func.nativeMemberName) // open native function call
        func.parameters.forEachIndexed { index, param ->
            if (index > 0) {
                addCode(", ")
            }
            addCode(buildParameterConversionBlock(param))
        }
        addCode(")") // close native function call

        // convert return type
        addCode(buildNativeToKotlinConversionsBlock(func.returnTypeInfo))

        if (func.needsMemscoped) {
            endControlFlow()
        }
    }.build()

    fun buildSignalConnectFunction(signal: SignalBlueprint, objectPointerName: String): FunSpec =
        FunSpec.builder(signal.kotlinConnectName).apply {
            val connectFlagsTypeName = ClassName("org.gtkkn.bindings.gobject", "ConnectFlags")

            addKdoc(buildSignalKDoc(signal.kdoc, signal.parameters, signal.version, signal.returnTypeKDoc))

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
            addCode("return %M(", BindingsGenerator.G_SIGNAL_CONNECT_DATA)
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
                signal.parameters.map { param ->
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

        // lambda signature
        if (closure.hasInstanceParameter) {
            addStatement("_: %T,", NativeTypes.KP_OPAQUE_POINTER)
        }
        closure.parameters.forEach { param ->
            // cinterop maps methods return values with pointer types as nullable
            // so we do the same thing here for the staticCFunction pointer arguments
            // we have to check for gir-based nullability first because otherwise we get double `??`
            val forceNullable = if (!param.typeInfo.kotlinTypeName.isNullable && param.typeInfo.isCinteropNullable) {
                "?"
            } else {
                ""
            }
            addStatement("%N: %T$forceNullable,", param.kotlinName, param.typeInfo.nativeTypeName)
        }
        addStatement("userData: %T ->", NativeTypes.KP_OPAQUE_POINTER)

        if (closure.needsMemscoped || closure.needsMemscopedReturnValue) {
            beginControlFlow("%M", BindingsGenerator.MEMSCOPED)
        }

        // implementation
        add(
            "userData.%M<%T>().get().invoke(",
            BindingsGenerator.AS_STABLE_REF_FUNC,
            closure.lambdaTypeName,
        ) // open invoke
        closure.parameters.forEachIndexed { index, param ->
            if (index > 0) {
                add(", ")
            }
            add("%N", param.kotlinName)
            add(buildNativeToKotlinConversionsBlock(param.typeInfo))
        }
        add(")") // close invoke

        // convert the return type and return from the lambda
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
        NativeTypes.KP_CPOINTER.parameterizedBy(
            NativeTypes.KP_CFUNCTION.parameterizedBy(
                LambdaTypeName.get(
                    returnType = resultTypeName,
                    parameters = parameters,
                ),
            ),
        )

    fun FunSpec.Builder.appendSignatureParameters(parameters: List<ParameterBlueprint>) {
        // add arguments to signature
        parameters.forEach { param ->
            val kotlinParamType = param.typeInfo.kotlinTypeName
            addParameter(param.kotlinName, kotlinParamType)
        }
    }

    fun buildCallbackTypeAlias(callback: CallbackBlueprint) =
        TypeAliasSpec.builder(callback.kotlinName, callback.lambdaTypeName)
            .addKdoc(buildCallbackKDoc(callback.kdoc, callback.parameters, callback.returnTypeKDoc))
            .build()

    /**
     * Build the private property that holds the static C callback functions that we use for implementing
     * callbacks methods.
     */
    fun buildStaticCallbackProperty(callback: CallbackBlueprint): PropertySpec {
        val staticCallbackVal = PropertySpec.builder(
            "${callback.kotlinName}Func",
            nativeCallbackCFunctionTypeName(
                callback.returnTypeInfo.nativeTypeName,
                callback.parameters.map { param ->
                    ParameterSpec.builder("", param.typeInfo.nativeTypeName).build()
                },
            ),
        ).initializer(buildStaticClosureImplementation(callback))
        return staticCallbackVal.build()
    }
}
