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

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ClassBlueprint
import org.gtkkn.gir.blueprints.ConstructorBlueprint
import org.gtkkn.gir.blueprints.ImplementsInterfaceBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.blueprints.TypeInfo

interface ClassGenerator : MiscGenerator, KDocGenerator {
    @Suppress("LongMethod", "CyclomaticComplexMethod")
    fun buildClass(clazz: ClassBlueprint, repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.classBuilder(clazz.typeName).apply {
            // companion object
            val companionSpecBuilder = TypeSpec.companionObjectBuilder()

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
            if (clazz.parentTypeName != null) {
                superclass(clazz.parentTypeName)
            }

            // interfaces
            addSuperinterfaces(clazz.implementsInterfaces.map { it.interfaceTypeName })

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
                        addFunction(buildClassConstructor(constructor))
                    } else {
                        companionSpecBuilder.addFunction(buildClassConstructorFactoryMethod(clazz, constructor))
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
                        addFunction(buildClassConstructor(group.first()))
                    }

                    else -> {
                        // conflicting constructors with same signature
                        group.sortedBy { it.nativeName.length }.forEachIndexed { index, constructor ->
                            if (index == 0) {
                                // add the shortest conflicting method name as an actual constructor
                                // this isn't the best heuristic but it works for most use cases
                                addFunction(buildClassConstructor(constructor))
                            }
                            // add all conflicting as constructors as factory functions
                            // this helps with developer discoverability (for example Gtk4 Button)
                            companionSpecBuilder.addFunction(buildClassConstructorFactoryMethod(clazz, constructor))
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

            // add companion functions
            clazz.functions.forEach { companionSpecBuilder.addFunction(buildFunction(it)) }

            if (companionSpecBuilder.propertySpecs.isNotEmpty() || companionSpecBuilder.funSpecs.isNotEmpty()) {
                addType(companionSpecBuilder.build())
            }
        }.build()

    /**
     * Build the constructor for pointer wrapping.
     */
    private fun buildPointerConstructor(builder: TypeSpec.Builder, clazz: ClassBlueprint) {
        val constructorSpecBuilder = FunSpec.constructorBuilder()

        val pointerParamSpec = ParameterSpec.builder("pointer", clazz.objectPointerTypeName).build()
        constructorSpecBuilder.addParameter(pointerParamSpec)

        if (clazz.hasParent) {
            // call superclass constructor
            builder.addSuperclassConstructorParameter(CodeBlock.of("pointer.%M()", BindingsGenerator.REINTERPRET_FUNC))
        } else {
            // init pointer property
            constructorSpecBuilder.addStatement("gPointer·= pointer.%M()", BindingsGenerator.REINTERPRET_FUNC)
            if (clazz.kotlinName == "Object") {
                constructorSpecBuilder.addStatement("%M()", BindingsGenerator.GOBJECT_ASSOCIATE_CUSTOM_OBJECT)
            }
        }

        builder.primaryConstructor(constructorSpecBuilder.build())
    }

    /**
     * Build a class constructor based on a [ConstructorBlueprint].
     */
    @Suppress("LongMethod")
    private fun buildClassConstructor(constructor: ConstructorBlueprint): FunSpec =
        FunSpec.constructorBuilder().apply {
            if (constructor.returnTypeInfo !is TypeInfo.ObjectPointer) {
                error("Invalid constructor return type")
            }

            addKdoc(
                buildMethodKDoc(
                    kdoc = constructor.kdoc,
                    parameters = constructor.parameters,
                    optInVersionBlueprint = constructor.optInVersionBlueprint,
                    returnTypeKDoc = constructor.returnTypeKDoc,
                ),
            )

            if (constructor.throws) {
                // add throw annotation
                addAnnotation(
                    AnnotationSpec.builder(BindingsGenerator.THROWS_TYPE)
                        .addMember("%T::class", BindingsGenerator.GLIB_EXCEPTION_TYPE)
                        .build(),
                )
            }

            if (constructor.parameters.isEmpty()) {
                if (constructor.throws) error("Throwing no-argument constructors are not supported")
                // no arg constructor
                callThisConstructor(CodeBlock.of("%M()!!.reinterpret()", constructor.nativeMemberName))
            } else {
                // constructor with arguments
                appendSignatureParameters(constructor.parameters)
                val codeBlockBuilder = CodeBlock.builder()

                if (constructor.needsMemscoped) {
                    codeBlockBuilder.beginControlFlow("%M", BindingsGenerator.MEMSCOPED)
                }

                if (constructor.throws) {
                    // prepare error pointer
                    codeBlockBuilder.addStatement(
                        "val gError = %M<%M>()",
                        BindingsGenerator.ALLOC_POINTER_TO,
                        BindingsGenerator.G_ERROR_MEMBER,
                    )
                    // open native method call into intermediate val
                    codeBlockBuilder.add("val gResult = %M(", constructor.nativeMemberName) // open native function call
                } else {
                    // if not throws, we can return directly without intermediate
                    codeBlockBuilder.add("%M(", constructor.nativeMemberName) // open native func call
                }

                constructor.parameters.forEachIndexed { index, param ->
                    if (index > 0) {
                        codeBlockBuilder.add(", ")
                    }
                    codeBlockBuilder.add(buildParameterConversionBlock(param))
                }

                if (constructor.throws) {
                    codeBlockBuilder.add(", gError.%M", BindingsGenerator.PTR_FUNC)
                }

                codeBlockBuilder.add(")") // close native func call

                if (constructor.throws) {
                    codeBlockBuilder.addStatement("")
                    // error handling
                    codeBlockBuilder.beginControlFlow("if·(gError.%M != null)", BindingsGenerator.POINTED_FUNC)
                    // throw the exception
                    codeBlockBuilder.addStatement(
                        "throw·%M(%T(gError.%M!!.%M))",
                        constructor.exceptionResolvingFunctionMember,
                        BindingsGenerator.GLIB_ERROR_TYPE,
                        BindingsGenerator.POINTED_FUNC,
                        BindingsGenerator.PTR_FUNC,
                    )
                    codeBlockBuilder.endControlFlow()
                    // if no error, use the result
                    codeBlockBuilder.addStatement("gResult!!.reinterpret()")
                } else {
                    codeBlockBuilder.add("!!.reinterpret()")
                }

                if (constructor.needsMemscoped) {
                    codeBlockBuilder.endControlFlow()
                }

                callThisConstructor(codeBlockBuilder.build())
            }
        }.build()

    /**
     * Build a constructor factory method based on a [ConstructorBlueprint].
     */
    @Suppress("LongMethod")
    private fun buildClassConstructorFactoryMethod(clazz: ClassBlueprint, constructor: ConstructorBlueprint): FunSpec =
        FunSpec.builder(constructor.kotlinName).apply {
            // Determine the return type
            val returnTypeName = if (constructor.throws) {
                BindingsGenerator.RESULT_TYPE.parameterizedBy(clazz.typeName)
            } else {
                clazz.typeName
            }
            returns(returnTypeName)

            // Ensure the constructor returns an object pointer
            if (constructor.returnTypeInfo !is TypeInfo.ObjectPointer) {
                error("Invalid constructor return type for ${constructor.nativeName}")
            }

            // Add KDoc to the method
            addKdoc(
                buildMethodKDoc(
                    kdoc = constructor.kdoc,
                    parameters = constructor.parameters,
                    optInVersionBlueprint = constructor.optInVersionBlueprint,
                    returnTypeKDoc = constructor.returnTypeKDoc,
                ),
            )

            // Use memScoped if needed
            if (constructor.needsMemscoped) {
                beginControlFlow("return·%M", BindingsGenerator.MEMSCOPED)
            }

            // Handle constructors without parameters
            if (constructor.parameters.isEmpty()) {
                if (constructor.throws) {
                    // Allocate GError**
                    addStatement(
                        "val gError = %M<%M>()",
                        BindingsGenerator.ALLOC_POINTER_TO,
                        BindingsGenerator.G_ERROR_MEMBER,
                    )
                    // Initialize gError.value to null
                    addStatement("gError.%M = null", BindingsGenerator.VALUE_PROPERTY)

                    // Call the native constructor function with gError
                    addStatement(
                        "val gResult = %M(gError.%M)",
                        constructor.nativeMemberName,
                        BindingsGenerator.PTR_FUNC,
                    )

                    // Check for errors
                    beginControlFlow("return·if·(gError.%M != null)", BindingsGenerator.POINTED_FUNC)
                    addStatement(
                        "%T.failure(%M(%T(gError.%M!!.%M)))",
                        BindingsGenerator.RESULT_TYPE,
                        constructor.exceptionResolvingFunctionMember,
                        BindingsGenerator.GLIB_ERROR_TYPE,
                        BindingsGenerator.POINTED_FUNC,
                        BindingsGenerator.PTR_FUNC,
                    )
                    endControlFlow()
                    beginControlFlow("else")
                    addStatement(
                        "%T.success(%T(gResult!!.%M()))",
                        BindingsGenerator.RESULT_TYPE,
                        clazz.typeName,
                        BindingsGenerator.REINTERPRET_FUNC,
                    )
                    endControlFlow()
                } else {
                    // Non-throwing no-arg factory method
                    addStatement(
                        "return·%T(%M()!!.%M())",
                        clazz.typeName,
                        constructor.nativeMemberName,
                        BindingsGenerator.REINTERPRET_FUNC,
                    )
                }

                if (constructor.needsMemscoped) {
                    endControlFlow()
                }
            } else {
                // Handle constructors with parameters
                appendSignatureParameters(constructor.parameters)

                if (constructor.throws) {
                    // Prepare error pointer
                    addStatement(
                        "val gError = %M<%M>()",
                        BindingsGenerator.ALLOC_POINTER_TO,
                        BindingsGenerator.G_ERROR_MEMBER,
                    )
                    addStatement("gError.%M = null", BindingsGenerator.VALUE_PROPERTY)

                    // Begin native function call
                    addCode("val gResult = %M(", constructor.nativeMemberName)
                } else {
                    // Return directly if the constructor doesn't throw
                    addCode("return·%T(%M(", clazz.typeName, constructor.nativeMemberName)
                }

                // Add parameters to the native function call
                constructor.parameters.forEachIndexed { index, param ->
                    if (index > 0) {
                        addCode(", ")
                    }
                    addCode(buildParameterConversionBlock(param))
                }

                // Add the error parameter if needed
                if (constructor.throws) {
                    addCode(", gError.%M", BindingsGenerator.PTR_FUNC)
                }

                // Close the native function call
                if (constructor.throws) {
                    addCode(")")
                    addStatement("")

                    // Check for errors
                    beginControlFlow("return·if·(gError.%M != null)", BindingsGenerator.POINTED_FUNC)
                    addStatement(
                        "%T.failure(%M(%T(gError.%M!!.%M)))",
                        BindingsGenerator.RESULT_TYPE,
                        constructor.exceptionResolvingFunctionMember,
                        BindingsGenerator.GLIB_ERROR_TYPE,
                        BindingsGenerator.POINTED_FUNC,
                        BindingsGenerator.PTR_FUNC,
                    )
                    endControlFlow()
                    beginControlFlow("else")
                    if (!constructor.returnTypeInfo.kotlinTypeName.isNullable) {
                        addStatement(
                            "%T.success(%T(checkNotNull(gResult).%M()))",
                            BindingsGenerator.RESULT_TYPE,
                            constructor.returnTypeInfo.kotlinTypeName,
                            BindingsGenerator.REINTERPRET_FUNC,
                        )
                    } else {
                        addStatement(
                            "%T.success(%T(checkNotNull(gResult).%M()))",
                            BindingsGenerator.RESULT_TYPE,
                            constructor.returnTypeInfo.withNullable(false).kotlinTypeName,
                            BindingsGenerator.REINTERPRET_FUNC,
                        )
                    }
                    endControlFlow()
                } else {
                    addCode(")!!.%M())", BindingsGenerator.REINTERPRET_FUNC)
                }

                if (constructor.needsMemscoped) {
                    endControlFlow()
                }
            }
        }.build()

    /**
     * Build the pointer property for a class.
     */
    private fun buildClassObjectPointerProperty(clazz: ClassBlueprint): PropertySpec {
        val propertyBuilder = PropertySpec.builder(clazz.objectPointerName, clazz.objectPointerTypeName)

        if (clazz.hasParent) {
            // if class has a parent, we can downcast the gPointer from parent, using a getter
            propertyBuilder.getter(
                FunSpec.getterBuilder()
                    .addStatement("return·gPointer.%M()", BindingsGenerator.REINTERPRET_FUNC)
                    .build(),
            )
        }

        return propertyBuilder.build()
    }

    /**
     * Build the interface pointer property for classes implementing an interface.
     *
     * This is the pointer that needs to be overridden to conform to the interface.
     */
    private fun buildClassInterfacePointerProperty(iface: ImplementsInterfaceBlueprint): PropertySpec {
        val propertyBuilder = PropertySpec.builder(iface.interfacePointerName, iface.interfacePointerTypeName)
            .addModifiers(KModifier.OVERRIDE)

        propertyBuilder.getter(
            FunSpec.getterBuilder()
                .addStatement("return·gPointer.%M()", BindingsGenerator.REINTERPRET_FUNC)
                .build(),
        )

        return propertyBuilder.build()
    }

    /**
     * Build the KGType property for a class. If no glibGetType is defined, we skip this property.
     */
    fun buildKGTypeProperty(clazz: ClassBlueprint): PropertySpec? = if (clazz.glibGetTypeFunc == null) {
        null
    } else {
        val propertyType = BindingsGenerator.GOBJECT_GEN_CLASS_KG_TYPE.parameterizedBy(clazz.typeName)
        PropertySpec.builder("type", propertyType, KModifier.OVERRIDE).initializer(
            "%T(%M())·{ %T(it.%M()) }",
            BindingsGenerator.GOBJECT_GEN_CLASS_KG_TYPE,
            clazz.glibGetTypeFunc,
            clazz.typeName,
            BindingsGenerator.REINTERPRET_FUNC,
        ).build()
    }
}
