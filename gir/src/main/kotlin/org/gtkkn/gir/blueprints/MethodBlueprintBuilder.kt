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
import net.pearx.kasechange.toCamelCase
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
import org.gtkkn.gir.processor.UnresolvableTypeException

class MethodBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girNode: GirMethod,
    private val superClasses: List<GirClass> = emptyList(),
    private val superInterfaces: List<GirInterface> = emptyList(),
    private val isOpen: Boolean = false,
) : CallableBlueprintBuilder<MethodBlueprint>(context, girNamespace) {
    override fun blueprintObjectType(): String = "method"

    override fun blueprintObjectName(): String = girNode.callable.getName()

    override fun buildInternal(): MethodBlueprint {
        checkSkippedMethod()

        val kotlinName = girNode.callable.getName().toCamelCase()

        // parameters
        girNode.parameters?.let { addParameters(it) }

        // return value
        val returnValue = girNode.returnValue ?: throw UnresolvableTypeException("Method has no return value")

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
        val nameMatchingSuperMethods = superMethods.filter { method ->
            method.callable.shouldBeGenerated() && method.callable.getName() == girNode.callable.getName()
        }

        val isOverride = nameMatchingSuperMethods.any {
            it.debugParameterSignature() == girNode.debugParameterSignature()
        } || kotlinName == "toString" && parameterBlueprints.isEmpty()
        if (isOverride) {
            logger.debug { "Detected method override: ${girNode.callable.getName()}" }
        }

        // method name
        val nativeMethodName = girNode.callable.cIdentifier ?: throw UnresolvableTypeException(
            "native method ${girNode.callable.getName()} does not have cIdentifier",
        )

        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeMethodName)

        return MethodBlueprint(
            kotlinName = kotlinName,
            nativeName = nativeMethodName,
            nativeMemberName = nativeMemberName,
            parameters = parameterBlueprints,
            returnTypeInfo = returnTypeInfo,
            isOverride = isOverride,
            isOpen = isOpen,
            throws = girNode.callable.throws == true,
            exceptionResolvingFunctionMember = girNamespace.exceptionResolvingFunction(),
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.callable.info)
                .build()
                .getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
            returnTypeKDoc = context.processKdoc(girNode.returnValue.doc?.doc?.text),
        )
    }

    private fun checkSkippedMethod() {
        if (!girNode.callable.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.callable.cIdentifier ?: girNode.callable.getName())
        }

        girNode.callable.cIdentifier?.let { context.checkIgnoredFunction(it) }

        if (girNode.parameters == null) {
            throw UnresolvableTypeException("Method has no parameters object")
        }

        if (girNode.parameters.instanceParameter == null) {
            throw UnresolvableTypeException("Method has no instance parameter")
        }
    }
}

/**
 * A debug string containing parameter details for comparing methods for override purposes.
 */
private fun GirMethod.debugParameterSignature(): String =
    parameters?.parameters.orEmpty().joinToString(",") { it.debugSignature() }

private fun GirParameter.debugSignature(): String = when (type) {
    is GirArrayType -> "array[${type.debugSignature()}]"
    is GirType -> type.debugSignature() + if (this.isNullable()) "?" else ""
    GirVarArgs -> "varargs"
}

private fun GirAnyTypeOrVarargs.debugSignature(): String = when (this) {
    is GirArrayType -> "array[${type.debugSignature()}]"
    is GirType -> this.cType ?: "unknown"
    GirVarArgs -> "varargs"
}
