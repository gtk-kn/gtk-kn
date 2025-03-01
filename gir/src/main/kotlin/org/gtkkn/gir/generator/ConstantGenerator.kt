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

import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.BYTE
import com.squareup.kotlinpoet.CHAR
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.U_BYTE
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT
import org.gtkkn.gir.blueprints.ConstantBlueprint
import org.gtkkn.gir.blueprints.TypeInfo

/**
 * Provides functionality to build a [FunSpec] representing the given [ConstantBlueprint].
 */
interface ConstantGenerator : KDocGenerator {
    fun buildConstant(constant: ConstantBlueprint): PropertySpec {
        val data = computeConstantPropertyData(constant)
        return PropertySpec.builder(constant.kotlinName, data.typeName, data.modifiers).apply {
            addKdoc(buildPropertyKDoc(constant.kdoc, constant.optInVersionBlueprint, constant.deprecatedBlueprint))
            @Suppress("SpreadOperator")
            initializer(data.format, *data.values.toTypedArray())
        }.build()
    }

    private fun computeConstantPropertyData(constant: ConstantBlueprint): ConstantPropertyData {
        val value: Any = constant.constantValue
        val initialTypeName = constant.typeInfo.kotlinTypeName
        val modifiers = mutableListOf(KModifier.CONST)
        val defaultFormat = "%L"

        // Handle special value replacements
        getSpecialValueReplacement(value.toString())?.let { replacement ->
            return ConstantPropertyData(
                typeName = replacement.typeName ?: initialTypeName,
                format = defaultFormat,
                values = replacement.values,
                modifiers = modifiers,
            )
        }

        // Handle boolean values
        if (initialTypeName == BOOLEAN) {
            return ConstantPropertyData(
                typeName = initialTypeName,
                format = defaultFormat,
                values = listOf(value.toString().toBoolean()),
                modifiers = modifiers,
            )
        }

        // Handle bitfield types
        if (constant.typeInfo is TypeInfo.Bitfield) {
            modifiers.remove(KModifier.CONST)
            return ConstantPropertyData(
                typeName = initialTypeName,
                format = "%T(%Lu)",
                values = listOf(initialTypeName, value),
                modifiers = modifiers,
            )
        }

        // Handle alias types
        if (constant.typeInfo is TypeInfo.Alias) {
            val format = getFormatForType(constant.typeInfo.baseTypeInfo.nativeTypeName, defaultFormat) ?: defaultFormat
            return ConstantPropertyData(
                typeName = initialTypeName,
                format = format,
                values = listOf(value),
                modifiers = modifiers,
            )
        }

        // Handle format based on type
        val format = getFormatForType(initialTypeName, defaultFormat)
            ?: error("Mapping for constant with type $initialTypeName missing!")

        return ConstantPropertyData(
            typeName = initialTypeName,
            format = format,
            values = listOf(value),
            modifiers = modifiers,
        )
    }

    private fun getSpecialValueReplacement(value: String): ValueReplacement? =
        when (value) {
            "9223372036854775807" -> ValueReplacement(listOf("Long.MAX_VALUE"))
            "-9223372036854775808" -> ValueReplacement(listOf("Long.MIN_VALUE"))
            "18446744073709551615" -> ValueReplacement(listOf("ULong.MAX_VALUE"))
            "2147483647" -> ValueReplacement(listOf("Int.MAX_VALUE"))
            "-2147483648" -> ValueReplacement(listOf("Int.MIN_VALUE"))
            "4294967295" -> ValueReplacement(listOf("UInt.MAX_VALUE"), G_UINT32)
            "32767" -> ValueReplacement(listOf("Short.MAX_VALUE"))
            "-32768" -> ValueReplacement(listOf("Short.MIN_VALUE"))
            "255" -> ValueReplacement(listOf("UByte.MAX_VALUE"), G_UINT8)
            "127" -> ValueReplacement(listOf("Byte.MAX_VALUE"), G_INT8)
            "-128" -> ValueReplacement(listOf("Byte.MIN_VALUE"), G_INT8)
            else -> null
        }

    private fun getFormatForType(typeName: TypeName, currentFormat: String): String? = when (typeName) {
        BYTE,
        G_INT8 -> "%L.toByte()"

        U_BYTE,
        G_UINT8 -> "%L.toUByte()"

        CHAR -> "'$currentFormat'"

        SHORT,
        INT,
        G_INT,
        LONG,
        G_INT64,
        G_LONG,
        DOUBLE,
        G_DOUBLE -> currentFormat

        U_SHORT,
        G_UINT16,
        U_INT,
        G_UINT,
        G_UINT32,
        G_UNICHAR,
        U_LONG,
        G_TYPE,
        G_SIZE,
        G_UINT64,
        G_ULONG -> "${currentFormat}u"

        STRING -> "%S"
        else -> null
    }

    private data class ConstantPropertyData(
        val typeName: TypeName,
        val format: String,
        val values: List<Any>,
        val modifiers: List<KModifier>
    )

    private data class ValueReplacement(val values: List<Any>, val typeName: TypeName? = null)
}
