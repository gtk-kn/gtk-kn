package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ConstantBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint

interface RepositoryObjectGenerator : MiscGenerator {
    fun buildRepositoryObject(repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.objectBuilder(repository.repositoryObjectName.simpleName).apply {
            repository.functionBlueprints.forEach { addFunction(buildFunction(it)) }
            repository.constantBlueprints.forEach { addProperty(buildConstant(it)) }
        }.build()

    private fun buildConstant(constant: ConstantBlueprint) = PropertySpec.builder(
        constant.kotlinName,
        constant.typeInfo.kotlinTypeName,
    ).apply {

        val v = constant.constantValue
        val t = constant.typeInfo.kotlinTypeName
        val (literalPrefix, literalValue) = when {
            v == "9223372036854775807" -> Pair("Long.MAX_VALUE", null)
            v == "-9223372036854775808" -> Pair("Long.MIN_VALUE", null)
            v == "2147483647" -> Pair("Int.MAX_VALUE", null)
            v == "-2147483648" -> Pair("Int.MIN_VALUE", null)
            v == "4294967295" -> Pair("UInt.MAX_VALUE", null)
            v == "18446744073709551615" -> Pair("ULong.MAX_VALUE", null)
            t == INT -> Pair("%L", v)
            t == DOUBLE -> Pair("%L", v)
            t == SHORT -> Pair("%L", v)
            else -> Pair("TODO(%S)", v)
        }
        if (literalValue != null) {
            initializer(literalPrefix, literalValue)
        } else {
            initializer(literalPrefix)
        }
    }.build()

}
