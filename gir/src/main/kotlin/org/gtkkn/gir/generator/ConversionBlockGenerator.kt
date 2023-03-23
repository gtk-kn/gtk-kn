package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.CodeBlock
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.TypeInfo

interface ConversionBlockGenerator {
    /**
     * Build a [CodeBlock] that converts a Kotlin parameter into a native parameter.
     *
     * The resulting codeblock can be passed as an argument in a call to a native function.
     *
     * For example, given a `button: Button` Kotlin param with a `CPointer<GtkButton>` native type,
     * this method will output something like `button.gtkButtonPointer`.
     *
     * Nullability is handled.
     */
    fun buildParameterConversionBlock(param: ParameterBlueprint): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()
        val isParamNullable = param.typeInfo.kotlinTypeName.isNullable
        val safeCall = if (isParamNullable) "?" else ""

        when (param.typeInfo) {
            is TypeInfo.Enumeration -> codeBlockBuilder.add("%N$safeCall.nativeValue", param.kotlinName)
            is TypeInfo.ObjectPointer -> {
                codeBlockBuilder.add(
                    "%N$safeCall.%N$safeCall.%M()",
                    param.kotlinName,
                    param.typeInfo.objectPointerName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
            }

            is TypeInfo.InterfacePointer -> {
                codeBlockBuilder.add(
                    "%N$safeCall.%N$safeCall.%M()",
                    param.kotlinName,
                    param.typeInfo.objectPointerName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
            }

            is TypeInfo.Primitive -> codeBlockBuilder.add("%N", param.kotlinName)
            is TypeInfo.GBoolean -> codeBlockBuilder.add(
                "%N$safeCall.%M()",
                param.kotlinName,
                BindingsGenerator.AS_GBOOLEAN_FUNC,
            )

            is TypeInfo.KString -> codeBlockBuilder.add("%N", param.kotlinName)
            is TypeInfo.Bitfield -> {
                codeBlockBuilder.add("%N$safeCall.mask", param.kotlinName)
            }
        }
        return codeBlockBuilder.build()
    }

    /**
     * Build a [CodeBlock] that converts a Kotlin value into its native counterpart.
     *
     * The resulting codeblock should be placed right after the value to be converted.
     *
     * Nullability is handled.
     */
    fun buildKotlinToNativeTypeConversionBlock(typeInfo: TypeInfo): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()
        val isParamNullable = typeInfo.kotlinTypeName.isNullable
        val safeCall = if (isParamNullable) "?" else ""

        when (typeInfo) {
            is TypeInfo.Primitive -> Unit
            is TypeInfo.KString -> Unit
            is TypeInfo.Enumeration -> codeBlockBuilder.add("$safeCall.nativeValue")
            is TypeInfo.ObjectPointer -> {
                codeBlockBuilder.add(
                    "$safeCall.%N",
                    typeInfo.objectPointerName,
                )
            }

            is TypeInfo.InterfacePointer -> {
                codeBlockBuilder.add(
                    "$safeCall.%N$safeCall.%M()",
                    typeInfo.objectPointerName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
            }

            is TypeInfo.GBoolean -> codeBlockBuilder.add(
                "$safeCall.%M()",
                BindingsGenerator.AS_GBOOLEAN_FUNC,
            )

            is TypeInfo.Bitfield -> {
                codeBlockBuilder.add("$safeCall.mask")
            }
        }
        return codeBlockBuilder.build()
    }

    fun buildReturnValueConversionBlock(returnTypeInfo: TypeInfo): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()
        val isNullable = returnTypeInfo.kotlinTypeName.isNullable
        val safeCall = if (isNullable) "?" else ""

        when (returnTypeInfo) {
            is TypeInfo.Enumeration -> ReturnValueConversions.buildEnumeration(codeBlockBuilder, returnTypeInfo)
            is TypeInfo.ObjectPointer -> ReturnValueConversions.buildObjectPointer(returnTypeInfo, codeBlockBuilder)
            is TypeInfo.InterfacePointer -> ReturnValueConversions.buildInterfacePointer(
                isNullable,
                codeBlockBuilder,
                returnTypeInfo,
            )

            is TypeInfo.Primitive -> Unit
            is TypeInfo.GBoolean -> ReturnValueConversions.buildGBoolean(codeBlockBuilder)
            is TypeInfo.KString -> ReturnValueConversions.buildKString(isNullable, codeBlockBuilder)
            is TypeInfo.Bitfield -> ReturnValueConversions.buildBitfield(codeBlockBuilder, safeCall, returnTypeInfo)
        }
        return codeBlockBuilder.build()
    }
}

private object ReturnValueConversions {
    fun buildEnumeration(
        codeBlockBuilder: CodeBlock.Builder,
        returnTypeInfo: TypeInfo,
    ) {
        codeBlockBuilder
            .beginControlFlow(".run")
            .add("%T.fromNativeValue(this)", returnTypeInfo.kotlinTypeName)
            .endControlFlow()
    }

    fun buildObjectPointer(
        returnTypeInfo: TypeInfo.ObjectPointer,
        codeBlockBuilder: CodeBlock.Builder,
    ) {
        if (returnTypeInfo.kotlinTypeName.isNullable) {
            codeBlockBuilder
                .beginControlFlow("?.run")
                .add(
                    "%T(%M())",
                    returnTypeInfo.withNullable(false).kotlinTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .endControlFlow()
        } else {
            // some C functions that according to gir are not nullable, will be mapped by cinterop to return a
            // nullable type, so we use force !! here
            codeBlockBuilder
                .beginControlFlow("!!.run")
                .add(
                    "%T(%M())",
                    returnTypeInfo.withNullable(false).kotlinTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .endControlFlow()
        }
    }

    fun buildInterfacePointer(
        isNullable: Boolean,
        codeBlockBuilder: CodeBlock.Builder,
        returnTypeInfo: TypeInfo.InterfacePointer,
    ) {
        if (isNullable) {
            codeBlockBuilder
                .beginControlFlow("?.run")
                .add(
                    "%T.wrap(%M())",
                    returnTypeInfo.withNullable(false).kotlinTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .endControlFlow()
        } else {
            // some C functions that according to gir are not nullable, will be mapped by cinterop to return a
            // nullable type, so we use force !! here
            codeBlockBuilder
                .beginControlFlow("!!.run")
                .add(
                    "%T.wrap(%M())",
                    returnTypeInfo.withNullable(false).kotlinTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .endControlFlow()
        }
    }

    fun buildGBoolean(codeBlockBuilder: CodeBlock.Builder) {
        codeBlockBuilder.add(".%M()", BindingsGenerator.AS_BOOLEAN_FUNC)
    }

    fun buildKString(isNullable: Boolean, codeBlockBuilder: CodeBlock.Builder) {
        // cinterop seems to map all string returning functions as nullable  so here we return a nullable string
        // if the gir says nullable or error() when we encounter an unexpected null when the gir says non-null
        if (isNullable) {
            codeBlockBuilder.add("?.%M()", BindingsGenerator.TO_KSTRING_FUNC)
        } else {
            codeBlockBuilder.add(
                "?.%M() ?: error(%S)",
                BindingsGenerator.TO_KSTRING_FUNC,
                "Expected not null string",
            )
        }
    }

    fun buildBitfield(
        codeBlockBuilder: CodeBlock.Builder,
        nullableString: String,
        returnTypeInfo: TypeInfo,
    ) {
        // use mask constructor for conversion
        codeBlockBuilder
            .add(nullableString)
            .beginControlFlow(".run")
            .add("%T(this)", returnTypeInfo.kotlinTypeName)
            .endControlFlow()
    }
}
