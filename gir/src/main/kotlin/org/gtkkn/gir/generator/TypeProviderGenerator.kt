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
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MAP
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.RepositoryBlueprint

interface TypeProviderGenerator {
    fun buildTypeProvider(repository: RepositoryBlueprint): TypeSpec = TypeSpec.objectBuilder(
        repository.repositoryTypeProviderTypeName.simpleName,
    ).apply {
        addSuperinterface(BindingsGenerator.TYPE_PROVIDER_INTERFACE_TYPE)
        addProperty(buildTypeMapProperty(repository))
    }.build()

    private fun buildTypeMapProperty(repository: RepositoryBlueprint): PropertySpec {
        val mapType = MAP
            .parameterizedBy(BindingsGenerator.KCLASS_TYPE.parameterizedBy(STAR))
            .plusParameter(BindingsGenerator.GOBJECT_KG_TYPE.parameterizedBy(STAR))

        val initializer = CodeBlock.builder().apply {
            addStatement("mapOf(")
            repository.classBlueprints
                .filter { it.glibGetTypeFunc != null }
                .forEach { clazz ->
                    addStatement(
                        "%T::class to %T.type,",
                        clazz.typeName,
                        clazz.typeName,
                    )
                }
            repository.interfaceBlueprints
                .filter { it.glibGetTypeFunc != null }
                .forEach { iface ->
                    addStatement(
                        "%T::class to %T.type,",
                        iface.typeName,
                        iface.typeName,
                    )
                }
            addStatement(")")
        }.build()

        return PropertySpec.builder("typeMap", mapType, KModifier.OVERRIDE)
            .initializer(initializer)
            .build()
    }
}
