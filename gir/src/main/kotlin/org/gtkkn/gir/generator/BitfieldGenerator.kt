package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.BitfieldBlueprint

interface BitfieldGenerator : MiscGenerator, KDocGenerator {
    fun buildBitfield(bitfield: BitfieldBlueprint): TypeSpec {
        val companionSpecBuilder = TypeSpec.companionObjectBuilder()

        bitfield.members.forEach { member ->
            companionSpecBuilder.addProperty(
                PropertySpec.builder(member.kotlinName, bitfield.kotlinTypeName)
                    .addKdoc(buildTypeKDoc(member.kdoc, member.version))
                    .initializer("%T(%M)", bitfield.kotlinTypeName, member.nativeMemberName)
                    .build(),
            )
        }

        val constructorSpec = FunSpec.constructorBuilder()
            .addParameter("mask", bitfield.nativeValueTypeName)
            .build()

        val orFuncSpec = FunSpec.builder("or")
            .addModifiers(KModifier.INFIX)
            .addParameter("other", bitfield.kotlinTypeName)
            .returns(bitfield.kotlinTypeName)
            .addStatement("return %T(mask or other.mask)", bitfield.kotlinTypeName)
            .build()

        val bitfieldSpec = TypeSpec.classBuilder(bitfield.kotlinName)
            .addKdoc(buildTypeKDoc(bitfield.kdoc, bitfield.version))
            .primaryConstructor(constructorSpec)
            .addProperty(
                PropertySpec.builder("mask", bitfield.nativeValueTypeName)
                    .initializer("mask")
                    .build(),
            )
            .addFunction(orFuncSpec)
            .addType(companionSpecBuilder.build())

        // add functions
        bitfield.functionBlueprints.forEach { companionSpecBuilder.addFunction(buildFunction(it)) }

        return bitfieldSpec.build()
    }
}
