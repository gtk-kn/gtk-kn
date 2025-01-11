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
    KGTypeGenerator,
    PropertyGenerator,
    SignalGenerator,
    FunctionGenerator {
    fun buildInterface(iface: InterfaceBlueprint, repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.interfaceBuilder(iface.typeName).apply {
            addKdocAndOptInAnnotations(iface)
            addAbstractPointerProperty(iface)
            addProxyObjectMarker()
            addParentInterfaces(iface)
            addProperties(iface)
            addMethods(iface)
            addSignals(iface)
            addImplClass(iface)
            addType(createCompanionObjectBuilder(iface, repository).build())

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
        addKdoc(buildTypeKDoc(iface.kdoc, iface.optInVersionBlueprint, iface.skippedObjects))

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
    private fun TypeSpec.Builder.addImplClass(iface: InterfaceBlueprint) {
        val implClassSpec = TypeSpec.classBuilder(iface.instanceTypeName).apply {
            addModifiers(KModifier.DATA)
            superclass(iface.implClassSuperclassTypeName)
            addSuperinterface(iface.typeName)
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
                iface.typeName,
                iface.typeName,
                iface.typeName,
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
    private fun createCompanionObjectBuilder(
        iface: InterfaceBlueprint,
        repository: RepositoryBlueprint
    ): TypeSpec.Builder {
        val companionBuilder = TypeSpec.companionObjectBuilder()

        // Add KGType property if available
        buildInterfaceKGTypeProperty(iface)?.let { property ->
            companionBuilder.addKGTypeInit(iface.typeName, property, repository)
        }

        // Add top-level functions
        iface.functions.forEach { functionBlueprint ->
            companionBuilder.addFunction(buildFunction(functionBlueprint))
        }

        return companionBuilder
    }
}
