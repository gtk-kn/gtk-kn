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

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ClassBlueprint
import org.gtkkn.gir.blueprints.InterfaceBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint

interface KGTypeGenerator {
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
        addProperty(property)
        if (!typeName.packageName.contains("bindings.glib")) {
            val companionInitializerBlock = CodeBlock.of(
                "%T.register()",
                repository.repositoryTypeProviderTypeName,
            )
            addInitializerBlock(companionInitializerBlock)
        }
    }

    /**
     * Build the KGType property for a class. If no glibGetType is defined, returns null.
     */
    fun buildKGTypeProperty(clazz: ClassBlueprint): PropertySpec? =
        if (clazz.glibGetTypeFunc == null) {
            null
        } else {
            val propertyType = BindingsGenerator.GOBJECT_GEN_CLASS_KG_TYPE.parameterizedBy(clazz.typeName)
            PropertySpec.builder("type", propertyType)
                .initializer(
                    "%T(%M()) { %T(it.%M()) }",
                    BindingsGenerator.GOBJECT_GEN_CLASS_KG_TYPE,
                    clazz.glibGetTypeFunc,
                    clazz.instanceTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .addModifiers(KModifier.OVERRIDE)
                .build()
        }

    /**
     * Build the KGType property for an interface. If no glibGetType is defined, returns null.
     */
    fun buildInterfaceKGTypeProperty(iface: InterfaceBlueprint): PropertySpec? =
        if (iface.glibGetTypeFunc == null) {
            null
        } else {
            val propertyType = BindingsGenerator.GOBJECT_GEN_IFACE_KG_TYPE.parameterizedBy(iface.typeName)
            PropertySpec.builder("type", propertyType)
                .initializer(
                    "%T(%M()) { %T(it.%M()) }",
                    BindingsGenerator.GOBJECT_GEN_IFACE_KG_TYPE,
                    iface.glibGetTypeFunc,
                    iface.instanceTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .addModifiers(KModifier.OVERRIDE)
                .build()
        }
}
