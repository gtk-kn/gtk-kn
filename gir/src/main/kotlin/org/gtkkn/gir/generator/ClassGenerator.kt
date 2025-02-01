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
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ClassBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint

interface ClassGenerator :
    ConstructorGenerator,
    KGTypeGenerator,
    PropertyGenerator,
    MethodGenerator,
    SignalGenerator,
    FunctionGenerator,
    ConstantGenerator {
    fun buildClass(clazz: ClassBlueprint, repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.classBuilder(clazz.kotlinTypeName).apply {
            addKDocAndOptInAnnotations(clazz)
            applyClassModifiers(clazz)
            setupInheritance(clazz)
            addPrimaryPointerConstructor(clazz)
            // We need to ensure that the TypeCache will be populated by the repository object
            addRepositoryObjectInitializerBlock(repository)
            val companionSpecBuilder = buildAndConfigureClassCompanion(clazz, repository)
            addGirConstructors(clazz, companionSpecBuilder)
            addInterfaceAndOverridePointers(clazz)
            addProperties(clazz)
            addMethods(clazz)
            addSignals(clazz)
            if (clazz.isAbstract) {
                addImplClass(clazz)
            }
            if (companionSpecBuilder.propertySpecs.isNotEmpty() || companionSpecBuilder.funSpecs.isNotEmpty()) {
                addType(companionSpecBuilder.build())
            }
        }.build()

    /**
     * Creates or reuses a companion object builder, adding KGType support if available.
     *
     * Important: If [buildKGTypeProperty] is non-null, we call [addSuperinterface]
     * on the main class builder (this) to add the KG_TYPED_INTERFACE_TYPE,
     * then configure the companion with KGType initialization.
     */
    private fun TypeSpec.Builder.buildAndConfigureClassCompanion(
        clazz: ClassBlueprint,
        repository: RepositoryBlueprint
    ): TypeSpec.Builder {
        val companionSpecBuilder = TypeSpec.companionObjectBuilder()

        clazz.constants.forEach { companionSpecBuilder.addProperty(buildConstant(it)) }
        clazz.functions.forEach { companionSpecBuilder.addFunction(buildFunction(it)) }
        companionSpecBuilder.buildInternalGetTypeOrNullFunction(clazz.functions)

        val kgTypeProperty = buildKGTypeProperty(clazz)

        if (kgTypeProperty != null) {
            // Add KG_TYPED_INTERFACE_TYPE to the main class
            addSuperinterface(BindingsGenerator.KG_TYPED_INTERFACE_TYPE)
            // Add KGType initialization to companion
            companionSpecBuilder.addKGTypeInit(clazz.kotlinTypeName, kgTypeProperty, repository)
        }

        return companionSpecBuilder
    }

    /**
     * Adds KDoc based on [ClassBlueprint] documentation and applies any opt-in version annotation.
     */
    private fun TypeSpec.Builder.addKDocAndOptInAnnotations(clazz: ClassBlueprint) {
        addKdoc(buildTypeKDoc(clazz.kdoc, clazz.optInVersionBlueprint, clazz.deprecatedBlueprint, clazz.skippedObjects))
        clazz.optInVersionBlueprint?.typeName?.let { addAnnotation(it) }
    }

    /**
     * Applies class-level modifiers like [KModifier.OPEN] and [KModifier.ABSTRACT].
     */
    private fun TypeSpec.Builder.applyClassModifiers(clazz: ClassBlueprint) {
        if (clazz.isAbstract) {
            addModifiers(KModifier.ABSTRACT)
        } else if (!clazz.isFinal) {
            addModifiers(KModifier.OPEN)
        }
    }

    /**
     * Sets up inheritance (if [clazz.parentClassName] is present)
     * and implements interfaces.
     */
    private fun TypeSpec.Builder.setupInheritance(clazz: ClassBlueprint) {
        if (clazz.parentClassName != null) {
            superclass(clazz.parentClassName)
        } else {
            superclass(BindingsGenerator.G_TYPE_INSTANCE)
            addSuperclassConstructorParameter("%L.%M()", clazz.objectPointerName, BindingsGenerator.REINTERPRET_FUNC)
        }
        addSuperinterfaces(clazz.implementsInterfaces.map { it.interfaceTypeName })
    }

    /**
     * Adds interface pointers and override pointers to the class.
     */
    private fun TypeSpec.Builder.addInterfaceAndOverridePointers(clazz: ClassBlueprint) {
        clazz.implementsInterfaces.forEach {
            addProperty(buildClassInterfacePointerProperty(it))
        }
        clazz.interfacePointerOverrides.forEach {
            addProperty(buildClassInterfacePointerProperty(it))
        }
    }

    /**
     * Adds all the properties from the [clazz].
     */
    private fun TypeSpec.Builder.addProperties(clazz: ClassBlueprint) {
        clazz.properties.forEach { property -> addProperty(buildProperty(property, clazz.objectPointerName)) }
    }

    /**
     * Adds all methods from the [clazz].
     */
    private fun TypeSpec.Builder.addMethods(clazz: ClassBlueprint) {
        clazz.methods.forEach { method -> addFunction(buildMethod(method, clazz.objectPointerName)) }
    }

    /**
     * Adds signal connect functions (and optional emit functions if present).
     */
    private fun TypeSpec.Builder.addSignals(clazz: ClassBlueprint) {
        clazz.signals.forEach { signal ->
            addFunction(buildSignalConnectFunction(signal, clazz.objectPointerName))
            if (signal.kotlinEmitName != null) {
                addFunction(buildSignalEmitFunction(signal, clazz.objectPointerName))
            }
        }
    }

    /**
     * Adds a nested `Impl` class inside the main `clazz.typeName` class.
     */
    private fun TypeSpec.Builder.addImplClass(clazz: ClassBlueprint) {
        val implClassSpec = TypeSpec.classBuilder(clazz.instanceTypeName)
            .superclass(clazz.kotlinTypeName)
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("pointer", clazz.objectPointerTypeName)
                    .build(),
            )
            .addSuperclassConstructorParameter("pointer")
            .addKdoc(
                """
                    The %TImpl type represents a native instance of the abstract %T class.

                    @constructor Creates a new instance of %T for the provided [CPointer].
                """.trimIndent(),
                clazz.kotlinTypeName,
                clazz.kotlinTypeName,
                clazz.kotlinTypeName,
            )
            .build()

        // Add the nested class to the main class
        addType(implClassSpec)
    }
}
