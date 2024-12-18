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

import net.pearx.kasechange.toCamelCase
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
        parameters.parameters.forEach { validateParam(it) }

        val processedParams = processParameters(parameters)
        processedParams.forEach { param ->
            when (param) {
                is SimpleParam -> addParameter(param.param)
                is CallbackParam -> parameterBlueprints.add(param.toBlueprint())
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
     * This method supports multiple callbacks (closure parameters). For each parameter:
     * - If it's a simple parameter (no closure), we create a [SimpleParam].
     * - If it's a closure parameter, we find its associated userData and destroyData parameters
     *   and combine them into a single [CallbackParam].
     *
     * Special Considerations:
     * 1. There can be multiple closure parameters in the same function.
     * 2. The order of parameters must be preserved. We output parameters in the same order they appear.
     *    When we encounter a closure parameter, its associated userData and destroy parameters are merged
     *    into a single [CallbackParam] that occupies the position of the closure parameter in the final list.
     * 3. Cyclic Closures (Valid Case):
     *    In some GIR files, the `closure` and `userData` parameters may reference each other via their `closure`
     *    properties. For example, the closure parameter references the userData parameter's index, and the userData
     *    parameter references the closure parameter's index. This is valid and supported.
     * 4. Invalid `userData` Reference:
     *    If the `closure` parameter references the `userData` parameter, but the `userData` parameter's `closure`
     *    property is set and does **not** point back to the original closure parameter, this is invalid and will
     *    throw an [UnresolvableTypeException].
     *
     * Error Handling:
     * - If any closure parameter's userData or destroy indices are invalid, log and throw [UnresolvableTypeException].
     * - If any parameter involved (closure/userData/destroy) is not a [GirType], throw an error.
     * - Varargs and in/out parameters are not supported and will cause [UnresolvableTypeException].
     *
     * @param parameters The list of parameters as defined in the GIR.
     * @return A list of processed parameters, which may be fewer than the original list because callback-related
     *         parameters collapse into a single [CallbackParam].
     * @throws UnresolvableTypeException if a closure is expected but user_data cannot be resolved or if unsupported
     *         parameter types (varargs, in/out) are encountered.
     */
    @Suppress("LongMethod")
    private fun processParameters(parameters: GirParameters): List<ProcessedParam> {
        val allParams = parameters.parameters

        // If there are no closures, return all as SimpleParam
        if (allParams.all { it.closure == null }) {
            return allParams.map { SimpleParam(it) }
        }

        val processedFlags = BooleanArray(allParams.size)
        val userDataIndices = mutableSetOf<Int>()
        val result = mutableListOf<ProcessedParam>()

        allParams.forEachIndexed { index, param ->
            if (processedFlags[index]) return@forEachIndexed // Skip already processed parameters

            if (param.closure == null) {
                // Simple parameter
                processedFlags[index] = true
                result.add(SimpleParam(param))
            } else {
                // Closure parameter with userData and destroy references
                val callback = processClosureParam(index, param, allParams, processedFlags, userDataIndices)
                result.add(callback)
            }
        }

        return result
    }

    private fun processClosureParam(
        index: Int,
        closureParam: GirParameter,
        allParams: List<GirParameter>,
        processedFlags: BooleanArray,
        userDataIndices: MutableSet<Int>
    ): CallbackParam {
        val userDataParam = fetchUserDataParam(index, closureParam, allParams, userDataIndices)
        val destroyParam = fetchDestroyParam(closureParam, allParams)

        validateGirType(closureParam, "Callback")
        validateGirType(userDataParam, "User data")
        destroyParam?.let { validateGirType(it, "Destroy data") }

        // Mark parameters as processed
        processedFlags[index] = true
        processedFlags[allParams.indexOf(userDataParam)] = true
        destroyParam?.let { processedFlags[allParams.indexOf(it)] = true }

        return CallbackParam(
            callbackType = closureParam.type as GirType,
            callbackParam = closureParam,
            userDataParam = userDataParam,
            destroyParam = destroyParam,
        )
    }

    private fun fetchUserDataParam(
        closureIndex: Int,
        closureParam: GirParameter,
        allParams: List<GirParameter>,
        userDataIndices: MutableSet<Int>
    ): GirParameter {
        val userDataIndex = closureParam.closure
            ?: throw UnresolvableTypeException("No user_data index for closure '${closureParam.name}'")

        if (userDataIndex !in allParams.indices) {
            logger.error { "Invalid user_data index $userDataIndex for closure '${closureParam.name}'" }
            throw UnresolvableTypeException("Invalid user_data index for closure '${closureParam.name}'")
        }

        val userDataParam = allParams[userDataIndex]

        if (!userDataIndices.add(userDataIndex)) {
            logger.error { "Multiple closures share the same user_data '${userDataParam.name}'" }
            throw UnresolvableTypeException("User data '${userDataParam.name}' cannot be shared by multiple closures")
        }

        if (userDataParam.closure != null && userDataParam.closure != closureIndex) {
            logger.error { "Invalid closure reference in user_data '${userDataParam.name}'" }
            throw UnresolvableTypeException(
                "Invalid closure relationship between '${closureParam.name}' and '${userDataParam.name}'",
            )
        }

        return userDataParam
    }

    private fun fetchDestroyParam(
        closureParam: GirParameter,
        allParams: List<GirParameter>
    ): GirParameter? {
        val destroyIndex = closureParam.destroy ?: return null

        if (destroyIndex !in allParams.indices) {
            logger.error { "Invalid destroy_data index $destroyIndex for closure '${closureParam.name}'" }
            throw UnresolvableTypeException("Invalid destroy_data index for closure '${closureParam.name}'")
        }

        return allParams[destroyIndex]
    }

    private fun validateGirType(param: GirParameter, typeName: String) {
        require(param.type is GirType) { "$typeName parameter '${param.name}' is not a GirType" }
    }

    private fun validateParam(param: GirParameter) {
        when {
            param.type is GirVarArgs -> throw UnresolvableTypeException("Varargs parameter is not supported")
            param.direction == GirDirection.IN_OUT ->
                throw UnresolvableTypeException("In/Out parameter is not supported")
        }
    }

    private fun CallbackParam.toBlueprint(): ParameterBlueprint {
        val kotlinTypeName = context.resolveCallbackTypeName(
            girNamespace,
            callbackType.name ?: error("Unknown callback type name"),
        ) ?: throw UnresolvableTypeException("Callback ${callbackType.name} not found")

        return ParameterBlueprint(
            kotlinName = callbackParam.name?.toCamelCase() ?: error("Callback name missing"),
            nativeName = callbackParam.name,
            typeInfo = TypeInfo.CallbackWithDestroy(
                kotlinTypeName = kotlinTypeName,
                hasDestroyParam = destroyParam != null,
            ).withNullable(callbackParam.isNullable()),
            defaultNull = false,
            isUserData = false,
            isDestroyData = false,
            kdoc = context.processKdoc(callbackParam.doc?.doc?.text),
        )
    }
}

sealed class ProcessedParam

data class SimpleParam(val param: GirParameter) : ProcessedParam()

data class CallbackParam(
    val callbackType: GirType,
    val callbackParam: GirParameter,
    val userDataParam: GirParameter,
    val destroyParam: GirParameter?
) : ProcessedParam()
