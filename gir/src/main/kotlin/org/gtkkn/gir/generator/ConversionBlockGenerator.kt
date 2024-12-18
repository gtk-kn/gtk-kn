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

import com.squareup.kotlinpoet.CodeBlock
import org.gtkkn.gir.blueprints.ListSize
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
    @Suppress("LongMethod", "CyclomaticComplexMethod")
    fun buildParameterConversionBlock(param: ParameterBlueprint): CodeBlock =
        CodeBlock.builder().apply {
            val isParamNullable = param.typeInfo.kotlinTypeName.isNullable
            val safeCall = if (isParamNullable) "?" else ""

            when (val type = param.typeInfo) {
                is TypeInfo.Enumeration -> add("%N$safeCall.nativeValue", param.kotlinName)
                is TypeInfo.ObjectPointer -> {
                    add(
                        "%N$safeCall.%N$safeCall.%M()",
                        param.kotlinName,
                        type.objectPointerName,
                        BindingsGenerator.REINTERPRET_FUNC,
                    )
                }

                is TypeInfo.InterfacePointer -> {
                    add(
                        "%N$safeCall.%N",
                        param.kotlinName,
                        type.objectPointerName,
                    )
                }

                is TypeInfo.RecordPointer -> {
                    add(
                        "%N$safeCall.%N$safeCall.%M()",
                        param.kotlinName,
                        type.objectPointerName,
                        BindingsGenerator.REINTERPRET_FUNC,
                    )
                }

                is TypeInfo.Alias,
                is TypeInfo.Primitive -> add("%N", param.kotlinName)

                is TypeInfo.GBoolean -> add("%N$safeCall.%M()", param.kotlinName, BindingsGenerator.AS_GBOOLEAN_FUNC)
                is TypeInfo.GChar -> add("%N$safeCall.code.toByte()", param.kotlinName)
                is TypeInfo.KString -> if (type.immutable) {
                    add("%N", param.kotlinName)
                } else {
                    add("%N$safeCall.%M", param.kotlinName, BindingsGenerator.CSTR_FUNC)
                }

                is TypeInfo.Bitfield -> add("%N$safeCall.mask", param.kotlinName)
                is TypeInfo.StringList -> add(
                    "%N$safeCall.%M(this)",
                    param.kotlinName,
                    BindingsGenerator.TO_C_STRING_LIST,
                )

                is TypeInfo.CallbackWithDestroy -> {
                    if (param.typeInfo.kotlinTypeName.isNullable) {
                        add(
                            "%L?.let { %M.%M() }",
                            param.kotlinName,
                            type.staticPropertyMemberName,
                            BindingsGenerator.REINTERPRET_FUNC,
                        )
                        add(
                            ", %L?.let { %T.create(%L).asCPointer() }",
                            param.kotlinName,
                            BindingsGenerator.STABLEREF,
                            param.kotlinName,
                        )
                        if (type.hasDestroyParam) {
                            add(
                                ", %L?.let { %M.%M() }",
                                param.kotlinName,
                                BindingsGenerator.STATIC_STABLEREF_DESTROY,
                                BindingsGenerator.REINTERPRET_FUNC,
                            )
                        }
                    } else {
                        add(
                            "%M.%M()",
                            type.staticPropertyMemberName,
                            BindingsGenerator.REINTERPRET_FUNC,
                        )
                        add(
                            ", %T.create(%L).asCPointer()",
                            BindingsGenerator.STABLEREF,
                            param.kotlinName,
                        )
                        if (type.hasDestroyParam) {
                            add(
                                ", %M.%M()",
                                BindingsGenerator.STATIC_STABLEREF_DESTROY,
                                BindingsGenerator.REINTERPRET_FUNC,
                            )
                        }
                    }
                }

                is TypeInfo.GPointer -> add("%N", param.kotlinName)
                is TypeInfo.GPointerList -> add(
                    "%N$safeCall.%M(this)",
                    param.kotlinName,
                    BindingsGenerator.TO_G_POINTER_C_ARRAY,
                )
            }
        }.build()

    /**
     * Build a [CodeBlock] that converts a Kotlin value into its native counterpart.
     *
     * The resulting codeblock should be placed right after the value to be converted.
     *
     * Nullability is handled.
     */
    fun buildKotlinToNativeTypeConversionBlock(typeInfo: TypeInfo): CodeBlock =
        CodeBlock.builder().apply {
            val isParamNullable = typeInfo.kotlinTypeName.isNullable
            val safeCall = if (isParamNullable) "?" else ""

            when (typeInfo) {
                is TypeInfo.Enumeration -> add("$safeCall.nativeValue")
                is TypeInfo.ObjectPointer -> add("$safeCall.%N", typeInfo.objectPointerName)
                is TypeInfo.InterfacePointer -> {
                    add(
                        "$safeCall.%N",
                        typeInfo.objectPointerName,
                    )
                }

                is TypeInfo.RecordPointer -> {
                    add(
                        "$safeCall.%N",
                        typeInfo.objectPointerName,
                    )
                }

                is TypeInfo.Alias,
                is TypeInfo.GPointer,
                is TypeInfo.Primitive -> Unit

                is TypeInfo.GBoolean -> add("$safeCall.%M()", BindingsGenerator.AS_GBOOLEAN_FUNC)
                is TypeInfo.GChar -> add("$safeCall.code.toByte()")
                is TypeInfo.GPointerList -> add("$safeCall.%M(this)", BindingsGenerator.TO_G_POINTER_C_ARRAY)
                is TypeInfo.KString -> add("$safeCall.let { %M(it) }", BindingsGenerator.G_STRDUP_FUNC)
                is TypeInfo.Bitfield -> add("$safeCall.mask")
                is TypeInfo.StringList -> add("$safeCall.%M(this)", BindingsGenerator.TO_C_STRING_LIST)
                is TypeInfo.CallbackWithDestroy -> error("CallbackWithDestroy conversion not supported")
            }
        }.build()

    fun buildNativeToKotlinConversionsBlock(returnTypeInfo: TypeInfo): CodeBlock =
        CodeBlock.builder().apply {
            val isNullable = returnTypeInfo.kotlinTypeName.isNullable

            when (returnTypeInfo) {
                is TypeInfo.Enumeration -> NativeToKotlinConversions.buildEnumeration(this, returnTypeInfo)
                is TypeInfo.ObjectPointer -> NativeToKotlinConversions.buildObjectPointer(returnTypeInfo, this)
                is TypeInfo.InterfacePointer -> NativeToKotlinConversions.buildInterfacePointer(
                    isNullable,
                    this,
                    returnTypeInfo,
                )

                is TypeInfo.RecordPointer -> NativeToKotlinConversions.buildRecordPointer(
                    isNullable,
                    this,
                    returnTypeInfo,
                )

                is TypeInfo.Alias,
                is TypeInfo.Primitive -> Unit

                is TypeInfo.Bitfield -> NativeToKotlinConversions.buildBitfield(this, returnTypeInfo)
                is TypeInfo.GBoolean -> NativeToKotlinConversions.buildGBoolean(this)
                is TypeInfo.GChar -> NativeToKotlinConversions.buildGChar(this)
                is TypeInfo.GPointer -> NativeToKotlinConversions.buildGPointer(isNullable, this)
                is TypeInfo.GPointerList -> NativeToKotlinConversions.buildGPointerList(
                    codeBlockBuilder = this,
                    listSize = returnTypeInfo.listSize,
                )

                is TypeInfo.KString -> NativeToKotlinConversions.buildKString(isNullable, this)
                is TypeInfo.StringList -> NativeToKotlinConversions.buildKStringList(
                    isNullable = isNullable,
                    codeBlockBuilder = this,
                    listSize = returnTypeInfo.listSize,
                )

                is TypeInfo.CallbackWithDestroy ->
                    error("CallbackWithDestroy unsupported for native to Kotlin conversion")
            }
        }.build()
}

private object NativeToKotlinConversions {
    fun buildEnumeration(
        codeBlockBuilder: CodeBlock.Builder,
        returnTypeInfo: TypeInfo,
    ) {
        codeBlockBuilder
            .beginControlFlow(".run")
            .add("%T.fromNativeValue(this)", returnTypeInfo.withNullable(false).kotlinTypeName)
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

    fun buildRecordPointer(
        isNullable: Boolean,
        codeBlockBuilder: CodeBlock.Builder,
        returnTypeInfo: TypeInfo.RecordPointer,
    ) {
        // some C functions that according to gir are not nullable, will be mapped by cinterop to return a
        // nullable type, so we use force !! here
        codeBlockBuilder
            .beginControlFlow("%L.run", if (isNullable) "?" else "!!")
            .add(
                "%T(%M())",
                returnTypeInfo.withNullable(false).kotlinTypeName,
                BindingsGenerator.REINTERPRET_FUNC,
            )
            .endControlFlow()
    }

    fun buildGPointer(
        isNullable: Boolean,
        codeBlockBuilder: CodeBlock.Builder
    ) {
        codeBlockBuilder.add("%L", if (isNullable) "" else "!!")
    }

    fun buildGBoolean(codeBlockBuilder: CodeBlock.Builder) {
        codeBlockBuilder.add(".%M()", BindingsGenerator.AS_BOOLEAN_FUNC)
    }

    fun buildGChar(codeBlockBuilder: CodeBlock.Builder) {
        codeBlockBuilder.add(".toInt().toChar()")
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
        returnTypeInfo: TypeInfo,
    ) {
        // use mask constructor for conversion
        codeBlockBuilder
            .beginControlFlow(".run")
            .add("%T(this)", returnTypeInfo.withNullable(false).kotlinTypeName)
            .endControlFlow()
    }

    fun buildKStringList(isNullable: Boolean, codeBlockBuilder: CodeBlock.Builder, listSize: ListSize) {
        // cinterop seems to map all string returning functions as nullable  so here we return a nullable string
        // if the gir says nullable or error() when we encounter an unexpected null when the gir says non-null
        val size = if (listSize is ListSize.FixedSize) listSize.size.toString() else ""
        if (isNullable) {
            codeBlockBuilder.add("?.%M($size)", BindingsGenerator.TO_K_STRING_LIST)
        } else {
            codeBlockBuilder.add(
                "?.%M($size) ?: error(%S)",
                BindingsGenerator.TO_K_STRING_LIST,
                "Expected not null string array",
            )
        }
    }

    fun buildGPointerList(codeBlockBuilder: CodeBlock.Builder, listSize: ListSize) {
        val size = if (listSize is ListSize.FixedSize) listSize.size.toString() else ""
        codeBlockBuilder.add(".%M($size)", BindingsGenerator.TO_G_POINTER_LIST)
    }
}
