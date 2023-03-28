package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.InterfaceBlueprint

interface InterfaceGenerator : KDocGenerator, MiscGenerator {
    fun buildInterface(iface: InterfaceBlueprint): TypeSpec =
        TypeSpec.interfaceBuilder(iface.typeName).apply {
            addProperty(buildInterfacePointerProperty(iface))

            // kdoc
            addKdoc(buildTypeKDoc(iface.kdoc, iface.version, iface.skippedObjects))

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

            // wrap factory function
            val factoryFunc = FunSpec.builder("wrap")
                .addParameter("pointer", iface.objectPointerTypeName)
                .returns(iface.typeName)
                .addStatement("return Wrapper(pointer)")
            companionBuilder.addFunction(factoryFunc.build())

            iface.functions.forEach { companionBuilder.addFunction(buildFunction(it)) }

            addType(companionBuilder.build())
        }.build()

    private fun buildInterfacePointerProperty(iface: InterfaceBlueprint): PropertySpec =
        PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName)
            .build()
}
