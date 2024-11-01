/*
 * Copyright (c) 2023 gtk-kn
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
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.U_BYTE
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT
import org.gtkkn.gir.blueprints.ConstantBlueprint
import org.gtkkn.gir.blueprints.EnumBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint

interface RepositoryObjectGenerator : MiscGenerator, KDocGenerator {
    fun buildRepositoryObject(repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.objectBuilder(repository.repositoryObjectName.simpleName).apply {
            repository.functionBlueprints.forEach { addFunction(buildFunction(it)) }
            repository.constantBlueprints.forEach { addProperty(buildConstant(it)) }

            val errorDomainEnums = repository.errorDomainEnums()
            if (errorDomainEnums.isNotEmpty()) {
                addFunction(buildExceptionResolverFunction(errorDomainEnums))
            }
            addKdoc(buildTypeKDoc(null, null, repository.skippedObjects))
        }.build()

    @Suppress("CyclomaticComplexMethod")
    private fun buildConstant(constant: ConstantBlueprint): PropertySpec {
        var format = "%L"
        var value: Any = constant.constantValue
        var type = constant.typeInfo.kotlinTypeName
        when {
            value == "9223372036854775807" -> value = "Long.MAX_VALUE"
            value == "-9223372036854775808" -> value = "Long.MIN_VALUE"
            value == "18446744073709551615" -> value = "ULong.MAX_VALUE"
            value == "2147483647" -> value = "Int.MAX_VALUE"
            value == "-2147483648" -> value = "Int.MIN_VALUE"
            value == "4294967295" -> {
                value = "UInt.MAX_VALUE"
                type = U_INT
            }

            value == "255" -> {
                value = "UByte.MAX_VALUE"
                type = U_BYTE
            }

            value == "127" -> {
                value = "Byte.MAX_VALUE"
                type = BYTE
            }

            value == "-128" -> {
                value = "Byte.MIN_VALUE"
                type = BYTE
            }

            type == BYTE -> format = "%L.toByte()"
            type == U_BYTE -> format = "%L.toUByte()"
            type == CHAR -> format = "'$format'"
            type == SHORT || type == INT || type == LONG || type == DOUBLE -> Unit
            type == U_SHORT || type == U_INT || type == U_LONG -> format = "${format}u"
            type == BOOLEAN -> value = value.toString().toBoolean()
            type == STRING -> format = "%S"
            else -> error("Mapping for constant with type $type missing!")
        }
        return PropertySpec.builder(constant.kotlinName, type, KModifier.CONST).apply {
            addKdoc(buildPropertyKDoc(constant.kdoc, constant.version))
            initializer(format, value)
        }.build()
    }

    private fun buildExceptionResolverFunction(
        errorDomainEnums: List<EnumBlueprint>
    ): FunSpec = FunSpec.builder("resolveException").apply {
        addParameter("error", BindingsGenerator.GLIB_ERROR_TYPE)
        returns(BindingsGenerator.GLIB_EXCEPTION_TYPE)

        beginControlFlow("val ex = when·(error.domain)")
        // this currently resolves only errorDomains from the same module
        for (enum in errorDomainEnums) {
            addStatement(
                "%T.quark() -> %T.fromErrorOrNull(error)",
                enum.kotlinTypeName,
                enum.kotlinTypeName,
            )
            beginControlFlow("?.let")
            addStatement("%T(error, it)", checkNotNull(enum.errorExceptionTypeName))
            endControlFlow()
        }
        addStatement("else -> null")
        endControlFlow() // end when

        addStatement("return·ex ?: %T(error)", BindingsGenerator.GLIB_EXCEPTION_TYPE)
    }.build()
}
