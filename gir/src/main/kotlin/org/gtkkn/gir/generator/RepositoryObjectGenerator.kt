package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.CHAR
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT
import org.gtkkn.gir.blueprints.ConstantBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.log.logger

interface RepositoryObjectGenerator : MiscGenerator {
    fun buildRepositoryObject(repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.objectBuilder(repository.repositoryObjectName.simpleName).apply {
            repository.functionBlueprints.forEach { addFunction(buildFunction(it)) }
            repository.constantBlueprints.forEach {
                // TODO tmp try catch because of struct constants (hb_language_t)
                try {
                    addProperty(buildConstant(it))
                } catch (ex: Throwable) {
                    logger.error(ex) { ex.message }
                }
            }
        }.build()

    private fun buildConstant(constant: ConstantBlueprint): PropertySpec {
        var format = "%L"
        var value: Any = constant.constantValue
        var type = constant.typeInfo.kotlinTypeName
        when {
            value == "9223372036854775807" -> value = "Long.MAX_VALUE"
            value == "-9223372036854775808" -> value = "Long.MIN_VALUE"
            value == "18446744073709551615" -> value = "ULong.MAX_VALUE"
            value == "2147483647" -> value = "Int.MAX_VALUE"
            value == "-2147483648" -> value = "Int.MIN_VALUE"
            value == "4294967295" -> {
                value = "UInt.MAX_VALUE"
                type = U_INT
            }

            type == CHAR -> format = "'$format'"
            type == SHORT || type == INT || type == LONG || type == DOUBLE -> Unit
            type == U_SHORT || type == U_INT || type == U_LONG -> format = "${format}u"
            type == BOOLEAN -> value = value.toString().toBoolean()
            else -> error("Mapping for constant with type $type missing!")
        }
        return PropertySpec.builder(constant.kotlinName, type, KModifier.CONST).apply {
            addKdoc(buildPropertyKDoc(constant.kdoc, constant.version))
            initializer(format, value)
        }.build()
    }
}
