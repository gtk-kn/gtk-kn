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
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.ShadowedFunctionException
import org.gtkkn.gir.processor.UnresolvableTypeException

class FunctionBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girFunction: GirFunction,
) : CallableBlueprintBuilder<FunctionBlueprint>(context, girNamespace) {

    override fun blueprintObjectType(): String = "function"
    override fun blueprintObjectName(): String = girFunction.name

    override fun buildInternal(): FunctionBlueprint {
        if (girFunction.info.introspectable == false) {
            throw NotIntrospectableException(girFunction.cIdentifier ?: girFunction.name)
        }

        if (girFunction.shadowedBy != null) {
            throw ShadowedFunctionException(girFunction.cIdentifier ?: girFunction.name, girFunction.shadowedBy)
        }

        if (girFunction.cIdentifier == null) {
            throw UnresolvableTypeException("Function ${girFunction.name} does not have cIdentifier")
        }

        context.checkIgnoredFunction(girFunction.cIdentifier)

        girFunction.parameters?.let { addParameters(it) }

        val returnValue = girFunction.returnValue ?: throw UnresolvableTypeException("Method has no return value")

        val returnTypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            is GirType -> {
                try {
                    context.resolveTypeInfo(girNamespace, type, returnValue.isNullable(), isReturnType = true)
                } catch (ex: BlueprintException) {
                    throw UnresolvableTypeException("Return type ${type.name} is unsupported")
                }
            }
        }

        val nativeName = girFunction.cIdentifier
        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeName)
        val kotlinName = context.kotlinizeMethodName(girFunction.name)

        return FunctionBlueprint(
            kotlinName = kotlinName,
            nativeName = nativeName,
            nativeMemberName = nativeMemberName,
            parameters = parameterBlueprints,
            returnTypeInfo = returnTypeInfo,
            throws = girFunction.throws,
            exceptionResolvingFunctionMember = exceptionResolvingFunction(),
            version = girFunction.info.version,
            kdoc = context.processKdoc(girFunction.info.docs.doc?.text),
            returnTypeKDoc = context.processKdoc(girFunction.returnValue.docs.doc?.text),
        )
    }
}
