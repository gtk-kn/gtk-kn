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

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.EnumBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint

interface RepositoryObjectGenerator : FunctionGenerator, ConstantGenerator {
    fun buildRepositoryObject(repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.objectBuilder(repository.repositoryObjectName.simpleName).apply {
            addKdoc(buildTypeKDoc(null, null, repository.skippedObjects))

            val typesToRegister: Set<Pair<ClassName, ClassName>> = buildSet {
                repository.classBlueprints
                    .filter { it.glibGetTypeFunc != null }
                    .mapTo(this) { it.kotlinTypeName to it.instanceTypeName }

                repository.interfaceBlueprints
                    .filter { it.glibGetTypeFunc != null }
                    .mapTo(this) { it.kotlinTypeName to it.instanceTypeName }
            }

            val registerTypesFunction =
                if (typesToRegister.isNotEmpty()) buildRegisterTypesFunction(typesToRegister) else null

            registerTypesFunction?.let { addInitializerBlock(CodeBlock.of("%L()\n", it.name)) }
            repository.functionBlueprints.forEach { addFunction(buildFunction(it)) }
            repository.constantBlueprints.forEach { addProperty(buildConstant(it)) }

            val errorDomainEnums = repository.errorDomainEnums()
            if (errorDomainEnums.isNotEmpty()) {
                addFunction(buildExceptionResolverFunction(errorDomainEnums))
            }

            registerTypesFunction?.let { addFunction(it) }
        }.build()

    fun buildRegisterTypesFunction(typesToRegister: Set<Pair<ClassName, ClassName>>) =
        FunSpec.builder("registerTypes").apply {
            addModifiers(KModifier.PRIVATE)
            typesToRegister.forEach { pair ->
                addStatement(
                    "%T.register(%T::class, %T.getType()) { %T(it.%M()) }",
                    BindingsGenerator.TYPE_CACHE_TYPE,
                    pair.first,
                    pair.first,
                    pair.second,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
            }
        }.build()

    private fun buildExceptionResolverFunction(
        errorDomainEnums: List<EnumBlueprint>
    ): FunSpec = FunSpec.builder("resolveException").apply {
        addParameter("error", BindingsGenerator.GLIB_ERROR_TYPE)
        returns(BindingsGenerator.GLIB_EXCEPTION_TYPE)

        beginControlFlow("val ex = when (error.domain)")
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

        addStatement("return ex ?: %T(error)", BindingsGenerator.GLIB_EXCEPTION_TYPE)
    }.build()
}
