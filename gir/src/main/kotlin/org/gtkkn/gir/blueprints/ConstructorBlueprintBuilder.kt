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

import com.squareup.kotlinpoet.MemberName
import net.pearx.kasechange.toCamelCase
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException
import org.gtkkn.gir.processor.namespaceNativePackageName

class ConstructorBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girNode: GirConstructor,
    private val memoryManagement: MemoryManagement,
) : CallableBlueprintBuilder<ConstructorBlueprint>(context, girNamespace) {
    override fun blueprintObjectType(): String = "constructor"

    override fun blueprintObjectName(): String = girNode.callable.getName()

    override fun buildInternal(): ConstructorBlueprint {
        girNode.callable.cIdentifier?.let { context.checkIgnoredFunction(it) }

        if (!girNode.callable.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.callable.cIdentifier ?: girNode.callable.getName())
        }

        girNode.parameters?.let { addParameters(it) }

        // return value
        val returnValue = girNode.returnValue
        if (returnValue == null) {
            logger.error {
                "Constructor ${girNamespace.name}.${blueprintObjectName()}.${girNode.callable.getName()} " +
                    "has no return value"
            }
            throw UnresolvableTypeException("Constructor has no return value")
        }

        val returnTypeInfo = try {
            when (val type = returnValue.type) {
                is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
                is GirType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            }
        } catch (ex: UnresolvableTypeException) {
            throw UnresolvableTypeException("Constructor return type ${returnValue.type} could not be resolved")
        }

        // method name
        val nativeMethodName = girNode.callable.cIdentifier ?: throw UnresolvableTypeException(
            "Constructor ${girNode.callable.getName()} for ${blueprintObjectName()} does not have cIdentifier",
        )

        val nativeMemberName = MemberName(namespaceNativePackageName(girNamespace), nativeMethodName)

        val kotlinName = girNode.callable.getName().let { name ->
            if (name == "new") {
                name
            } else {
                name.removePrefix("new_")
            }
        }.toCamelCase()

        return ConstructorBlueprint(
            kotlinName = kotlinName,
            nativeName = nativeMethodName,
            nativeMemberName = nativeMemberName,
            returnTypeInfo = returnTypeInfo,
            parameters = parameterBlueprints,
            throws = girNode.callable.throws == true,
            exceptionResolvingFunctionMember = girNamespace.exceptionResolvingFunction(),
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.callable.info)
                .build()
                .getOrNull(),
            deprecatedBlueprint = DeprecatedBlueprintBuilder(context, girNode.callable.info, girNode.doc)
                .build()
                .getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
            returnTypeKDoc = context.processKdoc(girNode.returnValue?.doc?.doc?.text),
            memoryManagement = memoryManagement,
        )
    }
}
