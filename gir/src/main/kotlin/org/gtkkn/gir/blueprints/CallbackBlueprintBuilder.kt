/*
 * Copyright (c) 2023 gtk-kn
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
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirCallback
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class CallbackBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girCallback: GirCallback,
) : CallableBlueprintBuilder<CallbackBlueprint>(context, girNamespace) {
    private val callbackParameters = mutableListOf<ParameterBlueprint>()

    override fun blueprintObjectType(): String = "callback"

    override fun blueprintObjectName(): String = girCallback.name

    private fun addParameter(param: GirParameter) {
        when (val result = ParameterBlueprintBuilder(context, girNamespace, param).build()) {
            is BlueprintResult.Ok -> callbackParameters.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): CallbackBlueprint {
        if (girCallback.info.introspectable == false) {
            throw NotIntrospectableException(girCallback.cType ?: girCallback.name)
        }

        if (girCallback.throws == true) {
            throw UnresolvableTypeException("Callbacks that throw are not supported")
        }

        if (girCallback.parameters?.instanceParameter != null) {
            error("Callback with instance parameter")
        }

        val returnValue = girCallback.returnValue ?: error("Callback has no return value")

        val returnTypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            is GirType -> try {
                context.resolveTypeInfo(girNamespace, type, returnValue.isNullable(), isReturnType = true)
            } catch (ex: BlueprintException) {
                throw UnresolvableTypeException("Return type ${type.name} is unsupported")
            }
        }

        if (returnTypeInfo is TypeInfo.KString) {
            logger.warn("Skipping callback with String return value")
            throw UnresolvableTypeException("Callback with String return value is not supported")
        }

        girCallback.parameters?.parameters?.forEach { addParameter(it) }

        val callbackLambdaTypeName =
            LambdaTypeName.get(
                parameters = callbackParameters.map { param ->
                    ParameterSpec.builder(param.kotlinName, param.typeInfo.kotlinTypeName).build()
                },
                returnType = returnTypeInfo.kotlinTypeName,
            )

        return CallbackBlueprint(
            kotlinName = girCallback.name,
            returnTypeInfo = returnTypeInfo,
            lambdaTypeName = callbackLambdaTypeName,
            parameters = callbackParameters,
            throws = girCallback.throws == true,
            exceptionResolvingFunctionMember = exceptionResolvingFunction(),
            kdoc = context.processKdoc(girCallback.info.docs.doc?.text),
            returnTypeKDoc = context.processKdoc(girCallback.returnValue.docs.doc?.text),
        )
    }
}
