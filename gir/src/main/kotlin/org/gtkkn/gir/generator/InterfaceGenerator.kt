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

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.InterfaceBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint

/**
 * A generator that produces Kotlin code for GInterface definitions.
 *
 * The interface is split into extension methods on [TypeSpec.Builder] for clarity,
 * mirroring the approach used in the ClassGenerator refactoring.
 * The logic and final generated code remain unchanged.
 */
interface InterfaceGenerator :
    ConstructorGenerator,
    KGTypeGenerator,
    PropertyGenerator,
    SignalGenerator,
    FunctionGenerator,
    ConstantGenerator {
    fun buildInterface(iface: InterfaceBlueprint, repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.interfaceBuilder(iface.kotlinTypeName).apply {
            addKdocAndOptInAnnotations(iface)
            addAbstractPointerProperty(iface)
            addProxyObjectMarker()
            addParentInterfaces(iface)
            addProperties(iface)
            addMethods(iface)
            addSignals(iface)
            addImplClass(iface, repository)
            val companionSpecBuilder = buildAndConfigureInterfaceCompanion(iface, repository)
            if (companionSpecBuilder.propertySpecs.isNotEmpty() || companionSpecBuilder.funSpecs.isNotEmpty()) {
                addType(companionSpecBuilder.build())
            }

            // Add KG_TYPED_INTERFACE_TYPE if KGType is available
            if (buildInterfaceKGTypeProperty(iface) != null) {
                addSuperinterface(BindingsGenerator.KG_TYPED_INTERFACE_TYPE)
            }
        }.build()

    /**
     * Adds the KDoc and any opt-in annotations for the interface.
     */
    private fun TypeSpec.Builder.addKdocAndOptInAnnotations(iface: InterfaceBlueprint) {
        // KDoc
        addKdoc(buildTypeKDoc(iface.kdoc, iface.optInVersionBlueprint, iface.deprecatedBlueprint, iface.skippedObjects))

        // optInVersion
        iface.optInVersionBlueprint?.typeName?.let { annotationClassName ->
            addAnnotation(annotationClassName)
        }
    }

    /**
     * Adds an abstract pointer property for the interface.
     */
    private fun TypeSpec.Builder.addAbstractPointerProperty(iface: InterfaceBlueprint) {
        val property = PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName).build()
        addProperty(property)
    }

    /**
     * Adds the Proxy object interface marker type as a superinterface.
     */
    private fun TypeSpec.Builder.addProxyObjectMarker() {
        addSuperinterface(BindingsGenerator.PROXY_TYPE)
    }

    /**
     * Adds all parent interfaces to the interface, along with their pointer overrides.
     */
    private fun TypeSpec.Builder.addParentInterfaces(iface: InterfaceBlueprint) {
        iface.parentInterfaces.forEach { parent ->
            addSuperinterface(parent.interfaceTypeName)
            val property = PropertySpec.builder(
                parent.interfacePointerName,
                parent.interfacePointerTypeName,
                KModifier.OVERRIDE,
            ).getter(
                FunSpec.getterBuilder()
                    .addStatement("return %L.%M()", iface.objectPointerName, BindingsGenerator.REINTERPRET_FUNC)
                    .build(),
            ).build()
            addProperty(property)
        }
    }

    /**
     * Adds the interface-level properties from the [InterfaceBlueprint].
     */
    private fun TypeSpec.Builder.addProperties(iface: InterfaceBlueprint) {
        iface.properties.forEach { property ->
            addProperty(buildProperty(property, iface.objectPointerName))
        }
    }

    /**
     * Adds all methods from the [InterfaceBlueprint].
     */
    private fun TypeSpec.Builder.addMethods(iface: InterfaceBlueprint) {
        iface.methods.forEach { method ->
            addFunction(buildMethod(method, iface.objectPointerName))
        }
    }

    /**
     * Adds all signal connect methods from the [InterfaceBlueprint].
     */
    private fun TypeSpec.Builder.addSignals(iface: InterfaceBlueprint) {
        iface.signals.forEach { signal ->
            addFunction(buildSignalConnectFunction(signal, iface.objectPointerName))
        }
    }

    /**
     * Adds a nested `Impl` class inside the main `iface.typeName` interface.
     */
    private fun TypeSpec.Builder.addImplClass(iface: InterfaceBlueprint, repository: RepositoryBlueprint) {
        val implClassSpec = TypeSpec.classBuilder(iface.instanceTypeName).apply {
            superclass(iface.implClassSuperclassTypeName)
            addSuperinterface(iface.kotlinTypeName)
            // We need to ensure that the TypeCache will be populated by the repository object
            addRepositoryObjectInitializerBlock(repository)
            primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter(ParameterSpec.builder(iface.objectPointerName, iface.objectPointerTypeName).build())
                    .build(),
            )
            addSuperclassConstructorParameter("%L.%M()", iface.objectPointerName, BindingsGenerator.REINTERPRET_FUNC)
            addProperty(
                PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName, KModifier.OVERRIDE)
                    .initializer(iface.objectPointerName)
                    .build(),
            )
            addKdoc(
                """
                    The %TImpl type represents a native instance of the %T interface.

                    @constructor Creates a new instance of %T for the provided [CPointer].
                """.trimIndent(),
                iface.kotlinTypeName,
                iface.kotlinTypeName,
                iface.kotlinTypeName,
            )
        }.build()

        // Add the nested data class to the main class
        addType(implClassSpec)
    }

    /**
     * Creates and returns a [TypeSpec.Builder] for the companion object,
     * including an optional KGType property, a `wrap` factory function,
     * and any top-level functions for this interface.
     */
    private fun buildAndConfigureInterfaceCompanion(
        iface: InterfaceBlueprint,
        repository: RepositoryBlueprint
    ): TypeSpec.Builder {
        val companionSpecBuilder = TypeSpec.companionObjectBuilder()

        iface.constants.forEach { companionSpecBuilder.addProperty(buildConstant(it)) }

        // Add KGType property if available
        buildInterfaceKGTypeProperty(iface)?.let { property ->
            companionSpecBuilder.addKGTypeInit(iface.kotlinTypeName, property, repository)
        }

        // Add top-level functions
        iface.functions.forEach { functionBlueprint ->
            companionSpecBuilder.addFunction(buildFunction(functionBlueprint))
        }
        companionSpecBuilder.buildInternalGetTypeOrNullFunction(iface.functions)

        return companionSpecBuilder
    }
}
