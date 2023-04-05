/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirAnyTypeOrVarargs
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.ShadowedFunctionException
import org.gtkkn.gir.processor.UnresolvableTypeException

class MethodBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girMethod: GirMethod,
    private val superClasses: List<GirClass> = emptyList(),
    private val superInterfaces: List<GirInterface> = emptyList(),
    private val isOpen: Boolean = false,
) : CallableBlueprintBuilder<MethodBlueprint>(context, girNamespace) {
    override fun blueprintObjectType(): String = "method"

    override fun blueprintObjectName(): String = girMethod.name

    override fun buildInternal(): MethodBlueprint {
        checkSkippedMethod()

        val kotlinName = context.kotlinizeMethodName(girMethod.name)

        // parameters
        girMethod.parameters?.let { addParameters(it) }

        // return value
        val returnValue = girMethod.returnValue ?: throw UnresolvableTypeException("Method has no return value")

        val returnTypeInfo: TypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            is GirType -> {
                try {
                    context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
                } catch (ex: BlueprintException) {
                    throw UnresolvableTypeException("Return type ${type.name} is unsupported")
                }
            }
        }

        // check for overrides
        val superMethods = superClasses.flatMap { it.methods } + superInterfaces.flatMap { it.methods }
        val nameMatchingSuperMethods = superMethods
            .filterNot { it.info.introspectable == false }
            .filter { it.name == girMethod.name }

        val isOverride = nameMatchingSuperMethods.any {
            it.debugParameterSignature() == girMethod.debugParameterSignature()
        }
        if (isOverride) {
            logger.warn("Detected method override: ${girMethod.name}")
        }

        val isNameClash = nameMatchingSuperMethods.any {
            it.debugParameterSignature() != girMethod.debugParameterSignature()
        }

        // method name
        val nativeMethodName = girMethod.cIdentifier
            ?: throw UnresolvableTypeException("native method ${girMethod.name} does not have cIdentifier")

        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeMethodName)

        return MethodBlueprint(
            kotlinName = if (isNameClash) {
                resolveNameClash(kotlinName)
            } else {
                kotlinName
            },
            nativeName = nativeMethodName,
            nativeMemberName = nativeMemberName,
            parameters = parameterBlueprints,
            returnTypeInfo = returnTypeInfo,
            isOverride = isOverride,
            isOpen = isOpen,
            throws = girMethod.throws,
            exceptionResolvingFunctionMember = exceptionResolvingFunction(),
            version = girMethod.info.version,
            kdoc = context.processKdoc(girMethod.info.docs.doc?.text),
            returnTypeKDoc = context.processKdoc(girMethod.returnValue.docs.doc?.text),
        )
    }

    private fun resolveNameClash(originalName: String): String {
        val result = "${originalName}_"
        logger.error("Name clash: renaming method $originalName to $result")
        return result
    }

    private fun checkSkippedMethod() {
        if (girMethod.info.introspectable == false) {
            throw NotIntrospectableException(girMethod.cIdentifier ?: girMethod.name)
        }

        if (girMethod.shadowedBy != null) {
            throw ShadowedFunctionException(girMethod.cIdentifier ?: girMethod.name, girMethod.shadowedBy)
        }

        girMethod.cIdentifier?.let { context.checkIgnoredFunction(it) }

        if (girMethod.parameters == null) {
            throw UnresolvableTypeException("Method has no parameters object")
        }

        if (girMethod.parameters.instanceParameter == null) {
            throw UnresolvableTypeException("Method has no instance parameter")
        }
    }
}

/**
 * A debug string containing parameter details for comparing methods for override purposes.
 */
private fun GirMethod.debugParameterSignature(): String {
    val paramsSignature = parameters?.parameters.orEmpty().map { it.debugSignature() }.joinToString(",")
    val returnSignature = checkNotNull(returnValue).type.debugSignature()
    return "$paramsSignature -> $returnSignature"
}

private fun GirParameter.debugSignature(): String = when (type) {
    is GirArrayType -> "array[${type.debugSignature()}]"
    is GirType -> type.debugSignature()
    GirVarArgs -> "varargs"
}

private fun GirAnyTypeOrVarargs.debugSignature(): String = when (this) {
    is GirArrayType -> "array[${type.debugSignature()}]"
    is GirType -> this.cType ?: "unknown"
    GirVarArgs -> "varargs"
}
