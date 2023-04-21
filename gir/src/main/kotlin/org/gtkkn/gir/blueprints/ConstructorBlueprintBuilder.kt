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

import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.ShadowedFunctionException
import org.gtkkn.gir.processor.UnresolvableTypeException

class ConstructorBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girConstructor: GirConstructor,
) : CallableBlueprintBuilder<ConstructorBlueprint>(context, girNamespace) {

    override fun blueprintObjectType(): String = "constructor"

    override fun blueprintObjectName(): String = girConstructor.name

    override fun buildInternal(): ConstructorBlueprint {
        girConstructor.cIdentifier?.let { context.checkIgnoredFunction(it) }

        if (girConstructor.info.introspectable == false) {
            throw NotIntrospectableException(girConstructor.cIdentifier ?: girConstructor.name)
        }

        if (girConstructor.shadowedBy != null) {
            throw ShadowedFunctionException(
                girConstructor.cIdentifier ?: girConstructor.name,
                girConstructor.shadowedBy,
            )
        }

        girConstructor.parameters?.let { addParameters(it) }

        // return value
        val returnValue = girConstructor.returnValue
        if (returnValue == null) {
            logger.error(
                "Constructor ${girNamespace.name}.${blueprintObjectName()}.${girConstructor.name} has no return value",
            )
            throw UnresolvableTypeException("Constructor has no return value")
        }

        val returnTypeInfo = try {
            when (val type = returnValue.type) {
                is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
                is GirType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable(), isReturnType = true)
            }
        } catch (ex: UnresolvableTypeException) {
            throw UnresolvableTypeException("Constructor return type ${returnValue.type} could not be resolved")
        }

        // method name
        val nativeMethodName = girConstructor.cIdentifier ?: throw UnresolvableTypeException(
            "Constructor ${girConstructor.name} for ${blueprintObjectName()} does not have cIdentifier",
        )

        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeMethodName)

        return ConstructorBlueprint(
            kotlinName = context.kotlinizeMethodName(girConstructor.name),
            nativeName = nativeMethodName,
            nativeMemberName = nativeMemberName,
            returnTypeInfo = returnTypeInfo,
            parameters = parameterBlueprints,
            throws = girConstructor.throws == true,
            exceptionResolvingFunctionMember = exceptionResolvingFunction(),
            version = girConstructor.info.version,
            kdoc = context.processKdoc(girConstructor.info.docs.doc?.text),
            returnTypeKDoc = context.processKdoc(girConstructor.returnValue?.docs?.doc?.text),
        )
    }
}
