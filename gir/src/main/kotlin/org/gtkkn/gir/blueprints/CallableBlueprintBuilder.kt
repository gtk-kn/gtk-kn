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

import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirDirection
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirParameters
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.SkippedObjectException
import org.gtkkn.gir.processor.UnresolvableTypeException
import org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeAsciiOnly

/**
 * An interface containing common behavior for all callable blueprints like Signals, Methods,
 * Functions and Constructors.
 */
abstract class CallableBlueprintBuilder<T : Any>(
    context: ProcessorContext,
    protected val girNamespace: GirNamespace,
) : BlueprintBuilder<T>(context) {
    protected val parameterBlueprints = mutableListOf<ParameterBlueprint>()

    protected fun addParameters(parameters: GirParameters) {
        parameters.parameters.forEach { checkSupportedParam(it) }

        val processedParams = processParameters(parameters)
        processedParams.forEach { callbackParam ->
            when (callbackParam) {
                is SimpleParam -> addParameter(callbackParam.param)
                is CallbackParam -> {
                    val kotlinTypeName = context.resolveCallbackTypeName(
                        girNamespace,
                        callbackParam.callbackType.name ?: error("unknown callback type name"),
                    ) ?: throw UnresolvableTypeException("callback ${callbackParam.callbackType.name} not found")
                    val cbTypeInfo = TypeInfo.CallbackWithDestroy(
                        kotlinTypeName = kotlinTypeName,
                        hasDestroyParam = callbackParam.destroyParam != null,
                    )
                    val cbParamBluePrint = ParameterBlueprint(
                        kotlinName = context.kotlinizeParameterName(checkNotNull(callbackParam.callbackParam.name)),
                        nativeName = callbackParam.callbackParam.name,
                        typeInfo = cbTypeInfo,
                        defaultNull = false,
                        kdoc = context.processKdoc(callbackParam.callbackParam.doc?.doc?.text),
                    )
                    parameterBlueprints.add(cbParamBluePrint)
                }
            }
        }
    }

    private fun addParameter(param: GirParameter) {
        when (val result = ParameterBlueprintBuilder(context, girNamespace, param).build()) {
            is BlueprintResult.Ok -> parameterBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> throw SkippedObjectException(result.skippedObject)
        }
    }

    /**
     * Process the parameters by transforming them into [ProcessedParam] subtypes.
     *
     * The return list can be smaller than the input list because callback parameters combine multiple
     * native params into one combined param.
     */
    private fun processParameters(parameters: GirParameters): List<ProcessedParam> {
        if (parameters.parameters.all { it.closure == null }) {
            // no closures found, return all params as [SimpleParam]
            return parameters.parameters.map { SimpleParam(it) }
        }

        // we have 1 closure param, find its user data and destroy function
        val closureParam = parameters.parameters.first { it.closure != null }
        logger.debug { "Found ${blueprintObjectType()} ${blueprintObjectName()} with closure: ${closureParam.name}" }

        if (closureParam.type !is GirType) error("Callback type is not a GirType")
        closureParam.type.cType?.let { context.checkIgnoredType(it) }

        val closureParamIndex = parameters.parameters.indexOf(closureParam)
        val remainingParams = parameters.parameters.drop(closureParamIndex + 1)

        // currently assumed to be the first gpointer param after the closure param
        val userDataParam = remainingParams.firstOrNull {
            it.type is GirType && it.type.name == "gpointer"
        }
        if (userDataParam == null) {
            logger.warn { "No user_data param for ${blueprintObjectType()} ${blueprintObjectName()}" }
            throw UnresolvableTypeException("Could not resolve user_data param")
        }

        val destroyDataParam = remainingParams.firstOrNull {
            it.type is GirType && it.type.cType == "GDestroyNotify"
        }
        if (destroyDataParam == null) {
            logger.debug { "No destroy notify param found for ${blueprintObjectType()} ${blueprintObjectName()}" }
        } else {
            logger.debug { "Found destroy notify param for ${blueprintObjectType()} ${blueprintObjectName()}" }
        }

        return parameters.parameters.mapNotNull { param ->
            when (param) {
                destroyDataParam -> null // bundled into callback param
                userDataParam -> null  // bundled into callback param
                closureParam -> CallbackParam(closureParam.type, param, userDataParam, destroyDataParam)
                else -> SimpleParam(param)
            }
        }
    }

    private fun checkSupportedParam(param: GirParameter) {
        when {
            param.type is GirVarArgs -> throw UnresolvableTypeException("Varargs parameter is not supported")
            param.direction == GirDirection.IN_OUT -> {
                throw UnresolvableTypeException("In/Out parameter is not supported")
            }
        }
    }

    protected fun exceptionResolvingFunction() =
        MemberName(
            context.namespaceBindingsPackageName(girNamespace) + "." + checkNotNull(girNamespace.name).lowercase()
                .capitalizeAsciiOnly(),
            "resolveException",
        )
}

sealed class ProcessedParam

data class SimpleParam(val param: GirParameter) : ProcessedParam()

data class CallbackParam(
    val callbackType: GirType,
    val callbackParam: GirParameter,
    val userDataParam: GirParameter,
    val destroyParam: GirParameter?
) : ProcessedParam()
