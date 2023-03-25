package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.EnumBlueprint

interface EnumGenerator : MiscGenerator, KDocGenerator {
    fun buildEnum(enum: EnumBlueprint): TypeSpec {
        // primary constructor
        val constructorSpec = FunSpec.constructorBuilder()
            .addParameter("nativeValue", enum.nativeValueTypeName)
            .build()

        // enum spec
        val enumSpec = TypeSpec.enumBuilder(enum.kotlinTypeName)
            .addKdoc(buildTypeKDoc(enum.kdoc, enum.version))
            .primaryConstructor(constructorSpec)
            .addProperty(
                PropertySpec.builder("nativeValue", enum.nativeValueTypeName)
                    .initializer("nativeValue")
                    .build(),
            )

        // add enum members
        enum.memberBlueprints.forEach { member ->
            enumSpec.addEnumConstant(
                member.kotlinName,
                TypeSpec.anonymousClassBuilder()
                    .addKdoc(buildTypeKDoc(member.kdoc, member.version))
                    .addSuperclassConstructorParameter("%M", member.nativeMemberName)
                    .build(),
            )
        }

        // companion
        enumSpec.addType(buildEnumCompanion(enum))

        return enumSpec.build()
    }

    private fun buildEnumCompanion(enum: EnumBlueprint): TypeSpec {
        val fromNativeFunc = FunSpec.builder("fromNativeValue")
            .addParameter("nativeValue", enum.nativeValueTypeName)
            .returns(enum.kotlinTypeName)

        fromNativeFunc.beginControlFlow("return when (nativeValue)") // begin when

        // add a case for each member
        for (member in enum.memberBlueprints) {
            fromNativeFunc.addStatement("%M -> %N", member.nativeMemberName, member.kotlinName)
        }

        // most enums can be exhaustive but some exceptions still need an else case due to cinterop member handling
        fromNativeFunc.addStatement("""else -> error("invalid nativeValue")""")

        fromNativeFunc.endControlFlow() // end when

        return TypeSpec.companionObjectBuilder().apply {
            // from native function
            addFunction(fromNativeFunc.build())

            // other functions
            enum.functionBlueprints.forEach { addFunction(buildFunction(it)) }
        }.build()
    }
}
