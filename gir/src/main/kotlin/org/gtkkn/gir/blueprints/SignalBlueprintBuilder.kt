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

package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import net.pearx.kasechange.toPascalCase
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirSignal
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class SignalBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girNode: GirSignal,
) : CallableBlueprintBuilder<SignalBlueprint>(context, girNamespace) {
    private val signalParameters = mutableListOf<ParameterBlueprint>()

    override fun blueprintObjectType(): String = "signal"

    override fun blueprintObjectName(): String = girNode.name

    private fun addParameter(param: GirParameter) {
        when (val result = ParameterBlueprintBuilder(context, girNamespace, param).build()) {
            is BlueprintResult.Ok -> signalParameters.add(result.blueprint)
            is BlueprintResult.Skip -> {
                throw UnresolvableTypeException(
                    "Unsupported parameter `${param.name}` : ${result.skippedObject.reason}",
                )
            }
        }
    }

    override fun buildInternal(): SignalBlueprint {
        context.checkIgnoredSignal(girNode.name)

        girNode.parameters?.parameters?.forEach { addParameter(it) }

        // return value
        val returnValue = girNode.returnValue ?: error("Signal has no return value")

        val returnTypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            is GirType -> try {
                context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            } catch (ex: BlueprintException) {
                throw UnresolvableTypeException("Return type ${type.name} is unsupported")
            }
        }

        val handlerLambdaTypeName =
            LambdaTypeName.get(
                parameters = signalParameters
                    .filterNot { it.isUserData }
                    .map { param ->
                        ParameterSpec.builder(param.kotlinName, param.typeInfo.kotlinTypeName).build()
                    },
                returnType = returnTypeInfo.kotlinTypeName,
            )

        val kotlinConnectName = "connect${girNode.name.toPascalCase()}"
        return SignalBlueprint(
            signalName = girNode.name,
            kotlinConnectName = kotlinConnectName,
            returnTypeInfo = returnTypeInfo,
            parameters = signalParameters,
            lambdaTypeName = handlerLambdaTypeName,
            throws = false, // signals cannot throw
            exceptionResolvingFunctionMember = girNamespace.exceptionResolvingFunction(),
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.info)
                .build()
                .getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
            returnTypeKDoc = context.processKdoc(girNode.returnValue.doc?.doc?.text),
        )
    }
}
