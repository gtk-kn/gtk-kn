package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ClassBlueprint
import org.gtkkn.gir.blueprints.ConstructorBlueprint
import org.gtkkn.gir.blueprints.ImplementsInterfaceBlueprint
import org.gtkkn.gir.blueprints.TypeInfo

interface ClassGenerator : MiscGenerator, KDocGenerator {
    fun buildClass(clazz: ClassBlueprint): TypeSpec =
        TypeSpec.classBuilder(clazz.typeName).apply {
            // companion object
            val companionSpecBuilder = TypeSpec.companionObjectBuilder()

            // kdoc
            addKdoc(buildTypeKDoc(clazz.kdoc, clazz.skippedObjects))

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

            // argument constructors
            // argument constructors can also be conflicting
            val groupBySignature = argumentConstructors.groupBy { constructor ->
                constructor.parameters.joinToString(",") { it.typeInfo.kotlinTypeName.toString() }
            }
            groupBySignature.values.forEach { group ->
                when (group.size) {
                    0 -> error("Should not happen")
                    1 -> {
                        // non conflicting constructor
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

            addType(companionSpecBuilder.build())
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
            constructorSpecBuilder.addStatement("gPointer = pointer.%M()", BindingsGenerator.REINTERPRET_FUNC)
        }

        builder.primaryConstructor(constructorSpecBuilder.build())
    }

    /**
     * Build a class constructor based on a [ConstructorBlueprint].
     */
    private fun buildClassConstructor(constructor: ConstructorBlueprint): FunSpec =
        FunSpec.constructorBuilder().apply {
            if (constructor.returnTypeInfo !is TypeInfo.ObjectPointer) {
                error("Invalid constructor return type")
            }

            addKdoc(buildMethodKDoc(constructor.kdoc, constructor.parameters, constructor.returnTypeKDoc))

            if (constructor.parameters.isEmpty()) {
                // no arg constructor
                callThisConstructor(CodeBlock.of("%M()!!.reinterpret()", constructor.nativeMemberName))
            } else {
                // constructor with arguments
                appendSignatureParameters(constructor.parameters)
                val codeBlockBuilder = CodeBlock.builder()

                codeBlockBuilder.add("%M(", constructor.nativeMemberName) // open native func paren

                constructor.parameters.forEachIndexed { index, param ->
                    if (index > 0) {
                        codeBlockBuilder.add(", ")
                    }
                    codeBlockBuilder.add(buildParameterConversionBlock(param))
                }

                codeBlockBuilder.add(")") // close native func paren
                codeBlockBuilder.add("!!.reinterpret()")

                callThisConstructor(codeBlockBuilder.build())
            }
        }.build()

    /**
     * Build a constructor factory method based on a [ConstructorBlueprint].
     */
    private fun buildClassConstructorFactoryMethod(clazz: ClassBlueprint, constructor: ConstructorBlueprint): FunSpec =
        FunSpec.builder(constructor.kotlinName).apply {
            returns(clazz.typeName)

            if (constructor.returnTypeInfo !is TypeInfo.ObjectPointer) {
                error("Invalid constructor return type for ${constructor.nativeName}")
            }

            addKdoc(buildMethodKDoc(constructor.kdoc, constructor.parameters, constructor.returnTypeKDoc))

            if (constructor.parameters.isEmpty()) {
                // no-arg factory method
                addStatement("return %T(%M()!!.reinterpret())", clazz.typeName, constructor.nativeMemberName)
            } else {
                appendSignatureParameters(constructor.parameters)

                // open native function paren
                addCode("return %T(%M(", clazz.typeName, constructor.nativeMemberName)

                constructor.parameters.forEachIndexed { index, param ->
                    if (index > 0) {
                        addCode(", ")
                    }
                    addCode(buildParameterConversionBlock(param))
                }

                addCode(")!!.%M())", BindingsGenerator.REINTERPRET_FUNC) // close native function paren
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
                    .addStatement("return gPointer.%M()", BindingsGenerator.REINTERPRET_FUNC)
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
                .addStatement("return gPointer.%M()", BindingsGenerator.REINTERPRET_FUNC)
                .build(),
        )

        return propertyBuilder.build()
    }
}
