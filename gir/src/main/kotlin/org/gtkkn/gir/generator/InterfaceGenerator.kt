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

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.InterfaceBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint

interface InterfaceGenerator : KDocGenerator, MiscGenerator {
    @Suppress("LongMethod")
    fun buildInterface(iface: InterfaceBlueprint, repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.interfaceBuilder(iface.typeName).apply {
            addProperty(buildAbstractInterfacePointerProperty(iface.objectPointerName, iface.objectPointerTypeName))

            // kdoc
            addKdoc(buildTypeKDoc(iface.kdoc, iface.optInVersionBlueprint, iface.skippedObjects))

            // optInVersion
            iface.optInVersionBlueprint?.typeName?.let { annotationClassName ->
                addAnnotation(annotationClassName)
            }

            // marker interface
            addSuperinterface(BindingsGenerator.GLIB_INTERFACE_MARKER_TYPE)

            // parent interfaces
            iface.parentInterfaces.forEach { parent ->
                addSuperinterface(parent.interfaceTypeName)
                addProperty(
                    buildOverrideInterfacePointerProperty(
                        iface.objectPointerName,
                        parent.interfacePointerName,
                        parent.interfacePointerTypeName,
                    ),
                )
            }

            // properties
            iface.properties.forEach { property ->
                addProperty(buildProperty(property, iface.objectPointerName))
            }

            // methods
            iface.methods.forEach { method ->
                addFunction(buildMethod(method, iface.objectPointerName))
            }

            // signal connect methods
            iface.signals.forEach { signal ->
                addFunction(buildSignalConnectFunction(signal, iface.objectPointerName))
            }

            val wrapperClass = TypeSpec.classBuilder("Wrapper")
                .addModifiers(KModifier.PRIVATE, KModifier.DATA)
                .addSuperinterface(iface.typeName)
                .primaryConstructor(
                    FunSpec.constructorBuilder()
                        .addParameter("pointer", iface.objectPointerTypeName)
                        .build(),
                )
                .addProperty(
                    PropertySpec.builder("pointer", iface.objectPointerTypeName, KModifier.PRIVATE)
                        .initializer("pointer")
                        .build(),
                )
                .addProperty(
                    PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName, KModifier.OVERRIDE)
                        .initializer("pointer")
                        .build(),
                )
                .build()

            addType(wrapperClass)

            // Add companion with factory wrapper function
            val companionBuilder = TypeSpec.companionObjectBuilder()

            buildKGTypeProperty(iface)?.let { property ->
                addSuperinterface(BindingsGenerator.KG_TYPED_INTERFACE_TYPE)
                companionBuilder.addKGTypeInit(iface.typeName, property, repository)
            }

            // wrap factory function
            val factoryFunc = FunSpec.builder("wrap")
                .addParameter("pointer", iface.objectPointerTypeName)
                .returns(iface.typeName)
                .addStatement("return·Wrapper(pointer)")
            companionBuilder.addFunction(factoryFunc.build())

            iface.functions.forEach { companionBuilder.addFunction(buildFunction(it)) }

            addType(companionBuilder.build())
        }.build()

    private fun buildAbstractInterfacePointerProperty(pointerName: String, pointerTypeName: TypeName): PropertySpec =
        PropertySpec.builder(pointerName, pointerTypeName)
            .build()

    private fun buildOverrideInterfacePointerProperty(
        objectPointerName: String,
        pointerName: String,
        pointerTypeName: TypeName
    ): PropertySpec =
        PropertySpec.builder(pointerName, pointerTypeName, KModifier.OVERRIDE)
            .getter(
                FunSpec.getterBuilder()
                    .addStatement(
                        "return·%L.%M()",
                        objectPointerName,
                        BindingsGenerator.REINTERPRET_FUNC,
                    )
                    .build(),
            )
            .build()

    /**
     * Build the KGType property for a class. If no glibGetType is defined, we skip this property.
     */
    fun buildKGTypeProperty(iface: InterfaceBlueprint): PropertySpec? = if (iface.glibGetTypeFunc == null) {
        null
    } else {
        val propertyType = BindingsGenerator.GOBJECT_GEN_IFACE_KG_TYPE.parameterizedBy(iface.typeName)
        PropertySpec.builder("type", propertyType, KModifier.OVERRIDE).initializer(
            "%T(%M())·{ Wrapper(it.%M()) }",
            BindingsGenerator.GOBJECT_GEN_IFACE_KG_TYPE,
            iface.glibGetTypeFunc,
            BindingsGenerator.REINTERPRET_FUNC,
        ).build()
    }
}
