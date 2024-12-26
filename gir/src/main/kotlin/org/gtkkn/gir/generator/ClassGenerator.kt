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
    FunctionGenerator {
    @Suppress("LongMethod", "CyclomaticComplexMethod")
    fun buildClass(clazz: ClassBlueprint, repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.classBuilder(clazz.typeName).apply {
            // kdoc
            addKdoc(buildTypeKDoc(clazz.kdoc, clazz.optInVersionBlueprint, clazz.skippedObjects))

            // optInVersion
            clazz.optInVersionBlueprint?.typeName?.let { annotationClassName ->
                addAnnotation(annotationClassName)
            }

            // modifiers
            if (!clazz.isFinal) {
                addModifiers(KModifier.OPEN)
            }

            // parent class
            clazz.parentClassName?.let { superclass(it) }

            // interfaces
            addSuperinterfaces(clazz.implementsInterfaces.map { it.interfaceTypeName })

            // KGType property and companion init
            val companionSpecBuilder = TypeSpec.companionObjectBuilder()
            buildKGTypeProperty(clazz)?.let { property ->
                addSuperinterface(BindingsGenerator.KG_TYPED_INTERFACE_TYPE)
                companionSpecBuilder.addKGTypeInit(clazz.typeName, property, repository)
            }

            // pointer constructor
            buildPointerConstructor(this, clazz)

            // constructors

            // some classes have multiple no-arg constructors which would have conflicting overloads if we generate all
            // of them as Kotlin constructors, so we only generate constructors for the non-conflicting ones, and we add
            // the others to the companion object as static functions
            val (noArgConstructors, argumentConstructors) = clazz.constructors.partition { it.parameters.isEmpty() }

            // in case of multiple no-arg constructors, we pick the shorted method name to be the constructor
            noArgConstructors
                .sortedBy { it.nativeName.length }
                .forEachIndexed { index, constructor ->
                    if (index == 0) {
                        // main no-arg constructor
                        val primaryConstructor = buildClassConstructor(constructor) { codeBlock ->
                            callThisConstructor(codeBlock)
                        }
                        addFunction(primaryConstructor)
                    } else {
                        // conflicting no-arg constructor: add as factory method in companion
                        val factory = buildClassConstructorFactoryMethod(
                            clazz,
                            constructor,
                            appendSignatureParameters = { params -> appendSignatureParameters(params) },
                            addGErrorAllocation = { addGErrorAllocation() },
                            addErrorHandling = { ctor, name -> addErrorHandling(ctor, name) },
                        )
                        companionSpecBuilder.addFunction(factory)
                    }
                }

            // argument constructors can also be conflicting
            val groupBySignature = argumentConstructors.groupBy { constructor ->
                constructor.parameters.joinToString(",") { it.typeInfo.kotlinTypeName.toString() }
            }

            groupBySignature.values.forEach { group ->
                when (group.size) {
                    0 -> error("Should not happen")
                    1 -> {
                        // non-conflicting constructor
                        val primaryConstructor = buildClassConstructor(group.first()) { codeBlock ->
                            callThisConstructor(codeBlock)
                        }
                        addFunction(primaryConstructor)
                    }

                    else -> {
                        // conflicting constructors with same signature
                        group.sortedBy { it.nativeName.length }.forEachIndexed { index, constructor ->
                            if (index == 0) {
                                // add the shortest conflicting method name as an actual constructor
                                // this isn't the best heuristic but it works for most use cases
                                val primaryConstructor = buildClassConstructor(constructor) { codeBlock ->
                                    callThisConstructor(codeBlock)
                                }
                                addFunction(primaryConstructor)
                            }
                            // add all conflicting as constructors as factory functions
                            // this helps with developer discoverability (for example Gtk4 Button)
                            val factory = buildClassConstructorFactoryMethod(
                                clazz,
                                constructor,
                                appendSignatureParameters = { params -> appendSignatureParameters(params) },
                                addGErrorAllocation = { addGErrorAllocation() },
                                addErrorHandling = { ctor, name -> addErrorHandling(ctor, name) },
                            )
                            companionSpecBuilder.addFunction(factory)
                        }
                    }
                }
            }

            // object pointer
            addProperty(buildClassObjectPointerProperty(clazz))

            // interface pointers
            clazz.implementsInterfaces.forEach {
                addProperty(buildClassInterfacePointerProperty(it))
            }

            // override pointers
            clazz.interfacePointerOverrides.forEach {
                addProperty(buildClassInterfacePointerProperty(it))
            }

            // properties
            clazz.properties.forEach { property ->
                addProperty(buildProperty(property, clazz.objectPointerName))
            }

            // methods
            clazz.methods.forEach { method ->
                addFunction(buildMethod(method, clazz.objectPointerName))
            }

            // signal connect methods
            clazz.signals.forEach { signal ->
                addFunction(buildSignalConnectFunction(signal, "gPointer"))
            }

            // companion functions
            clazz.functions.forEach { companionSpecBuilder.addFunction(buildFunction(it)) }

            if (companionSpecBuilder.propertySpecs.isNotEmpty() || companionSpecBuilder.funSpecs.isNotEmpty()) {
                addType(companionSpecBuilder.build())
            }
        }.build()
}
