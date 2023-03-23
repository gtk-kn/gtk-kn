package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.InterfaceBlueprint

interface InterfaceGenerator : KDocGenerator, MiscGenerator {
    fun buildInterface(iface: InterfaceBlueprint): TypeSpec {
        val ifaceBuilder = TypeSpec.interfaceBuilder(iface.typeName)
            .addProperty(buildInterfacePointerProperty(iface))

        // kdoc
        ifaceBuilder.addKdoc(buildTypeKDoc(iface.kdoc, iface.skippedObjects))

        // methods
        iface.methods.forEach { method ->
            ifaceBuilder.addFunction(buildMethod(method, iface.objectPointerName))
        }

        // signal connect methods
        iface.signals.forEach { signal ->
            ifaceBuilder.addFunction(buildSignalConnectFunction(signal, iface.objectPointerName))
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

        ifaceBuilder.addType(wrapperClass)

        // Add companion with factory wrapper function
        val companionBuilder = TypeSpec.companionObjectBuilder()

        // wrap factory function
        val factoryFunc = FunSpec.builder("wrap")
            .addParameter("pointer", iface.objectPointerTypeName)
            .returns(iface.typeName)
            .addStatement("return Wrapper(pointer)")
        companionBuilder.addFunction(factoryFunc.build())

        iface.functions.forEach { companionBuilder.addFunction(buildFunction(it)) }

        ifaceBuilder.addType(companionBuilder.build())

        return ifaceBuilder.build()
    }

    private fun buildInterfacePointerProperty(iface: InterfaceBlueprint): PropertySpec =
        PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName)
            .build()
}
