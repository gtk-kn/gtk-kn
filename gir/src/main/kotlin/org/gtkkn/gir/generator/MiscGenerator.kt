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
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.U_LONG
import org.gtkkn.gir.blueprints.FunctionBlueprint
import org.gtkkn.gir.blueprints.MethodBlueprint
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.SignalBlueprint
import org.gtkkn.gir.processor.NativeTypes

interface MiscGenerator : ConversionBlockGenerator, KDocGenerator {
    fun buildMethod(method: MethodBlueprint, instancePointer: String?): FunSpec =
        FunSpec.builder(method.kotlinName).apply {
            addKdoc(buildMethodKDoc(method.kdoc, method.parameters, method.returnTypeKDoc))
            val returnTypeName = method.returnTypeInfo.kotlinTypeName

            returns(returnTypeName)

            if (method.isOverride) {
                addModifiers(KModifier.OVERRIDE)
            }

            if (method.isOpen) {
                addModifiers(KModifier.OPEN)
            }

            appendSignatureParameters(method.parameters)

            var needsComma = false
            addCode("return %M(", method.nativeMemberName) // open native function paren
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

            addCode(")") // close native function paren

            // return value conversion
            addCode(buildReturnValueConversionBlock(method.returnTypeInfo))
        }.build()

    /**
     * Build a function implementation for standalone functions (not methods with an instance parameter).
     */
    fun buildFunction(func: FunctionBlueprint): FunSpec = FunSpec.builder(func.kotlinName).apply {
        addKdoc(buildMethodKDoc(func.kdoc, func.parameters, func.returnTypeKDoc))
        // add return value to signature
        returns(func.returnTypeInfo.kotlinTypeName)

        // add parameters to signature
        appendSignatureParameters(func.parameters)

        addCode("return %M(", func.nativeMemberName) // open native function paren
        func.parameters.forEachIndexed { index, param ->
            if (index > 0) {
                addCode(", ")
            }
            addCode(buildParameterConversionBlock(param))
        }
        addCode(")") // close native function paren

        // convert return type
        addCode(buildReturnValueConversionBlock(func.returnTypeInfo))
    }.build()

    fun buildSignalConnectFunction(signal: SignalBlueprint, objectPointerName: String): FunSpec =
        FunSpec.builder(signal.kotlinConnectName).apply {
            val connectFlagsTypeName = ClassName("bindings.gobject", "ConnectFlags")
            val connectFlagsDefaultMemberName = MemberName("bindings.gobject.ConnectFlags.Companion", "DEFAULT")

            addKdoc(buildSignalKDoc(signal.kdoc, signal.parameters, signal.returnTypeKDoc))

            // connect flags
            addParameter(
                ParameterSpec.builder("connectFlags", connectFlagsTypeName)
                    .defaultValue("%M", connectFlagsDefaultMemberName)
                    .build(),
            )
            // trailing lambda for handler
            addParameter(
                "handler",
                signal.handlerLambdaTypeName,
            )
            returns(U_LONG)

            // add implementation
            addCode("return %M(", BindingsGenerator.G_SIGNAL_CONNECT_DATA)
            addCode("%N.%M()", objectPointerName, BindingsGenerator.REINTERPRET_FUNC)
            addCode(", %S", signal.signalName)
            addCode(", %NFunc.%M()", signal.kotlinConnectName, BindingsGenerator.REINTERPRET_FUNC)
            addCode(", %T.create(handler).asCPointer()", BindingsGenerator.STABLEREF)
            addCode(", %M", BindingsGenerator.STATIC_STABLEREF_DESTROY)
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
        ).initializer(buildStaticSignalCallbackImplementation(signal))
        return staticCallbackVal.build()
    }

    /**
     * Build the [staticCFunction] implementation for signal connect handlers.
     */
    private fun buildStaticSignalCallbackImplementation(signal: SignalBlueprint) = CodeBlock.builder().apply {
        beginControlFlow("%M", BindingsGenerator.STATIC_C_FUNC)

        // lambda signature
        addStatement("_: %T,", NativeTypes.KP_OPAQUE_POINTER)
        signal.parameters.forEach { param ->
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
        addStatement("data: %T ->", NativeTypes.KP_OPAQUE_POINTER)

        // implementation
        add(
            "data.%M<%T>().get().invoke(",
            BindingsGenerator.AS_STABLE_REF_FUNC,
            signal.handlerLambdaTypeName,
        ) // open invoke
        signal.parameters.forEachIndexed { index, param ->
            if (index > 0) {
                add(", ")
            }
            add("%N", param.kotlinName)
            add(buildReturnValueConversionBlock(param.typeInfo))
        }
        add(")") // close invoke

        // convert the return type and return from the lambda
        add(buildKotlinToNativeTypeConversionBlock(signal.returnTypeInfo))

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
}
