/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import net.pearx.kasechange.toPascalCase
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
    private val girNode: GirCallback,
) : CallableBlueprintBuilder<CallbackBlueprint>(context, girNamespace) {
    private val callbackParameters = mutableListOf<ParameterBlueprint>()

    override fun blueprintObjectType(): String = "callback"

    override fun blueprintObjectName(): String = girNode.name

    private fun addParameter(param: GirParameter) {
        when (val result = ParameterBlueprintBuilder(context, girNamespace, param).build()) {
            is BlueprintResult.Ok -> callbackParameters.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): CallbackBlueprint {
        if (!girNode.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.cType ?: girNode.name)
        }

        if (girNode.throws == true) {
            throw UnresolvableTypeException("Callbacks that throw are not supported")
        }

        if (girNode.parameters?.instanceParameter != null) {
            error("Callback with instance parameter")
        }

        val returnValue = girNode.returnValue ?: error("Callback has no return value")

        val returnTypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            is GirType -> try {
                context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            } catch (ex: BlueprintException) {
                throw UnresolvableTypeException("Return type ${type.name} is unsupported")
            }
        }

        girNode.parameters?.parameters?.forEach { addParameter(it) }

        val callbackLambdaTypeName =
            LambdaTypeName.get(
                parameters = callbackParameters
                    .filterNot { it.isUserData }
                    .map { param ->
                        ParameterSpec.builder(param.kotlinName, param.typeInfo.kotlinTypeName).build()
                    },
                returnType = returnTypeInfo.kotlinTypeName,
            )

        return CallbackBlueprint(
            kotlinName = girNode.name.toPascalCase(),
            returnTypeInfo = returnTypeInfo,
            lambdaTypeName = callbackLambdaTypeName,
            parameters = callbackParameters,
            throws = girNode.throws == true,
            exceptionResolvingFunctionMember = girNamespace.exceptionResolvingFunction(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
            returnTypeKDoc = context.processKdoc(girNode.returnValue.doc?.doc?.text),
        )
    }
}
