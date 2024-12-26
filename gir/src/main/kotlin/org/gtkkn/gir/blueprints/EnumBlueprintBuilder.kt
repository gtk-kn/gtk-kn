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

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeName
import org.gtkkn.gir.model.GirEnumeration
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirMember
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext

class EnumBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girNode: GirEnumeration,
) : BlueprintBuilder<EnumBlueprint>(context) {
    private val members = mutableListOf<EnumMemberBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()

    override fun blueprintObjectType() = "enum"

    override fun blueprintObjectName(): String = girNode.name

    private fun addMember(girMember: GirMember) {
        val nativeValue = girMember.value.toLong()
        val nativeMemberName = if (context.needsEnumMemberPackageImport(girNode)) {
            MemberName(context.namespaceNativePackageName(girNamespace), girMember.cIdentifier)
        } else {
            MemberName(
                context.namespaceNativePackageName(girNamespace) + "." + girNode.cType,
                girMember.cIdentifier,
            )
        }

        var memberBlueprint = EnumMemberBlueprint(
            kotlinName = girMember.name.uppercase(),
            nativeName = girMember.name,
            nativeValue = nativeValue,
            nativeMemberName = nativeMemberName,
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girMember.info)
                .build()
                .getOrNull(),
            kdoc = context.processKdoc(girMember.doc?.doc?.text),
        )

        if (members.any { it.nativeValue == nativeValue }) {
            // If a member has the same value as an already added member,
            // it means the member is aliased to another member in the enum typedef.
            // Cinterop adds these members to the companion object of the generated enum.

            memberBlueprint = memberBlueprint.copy(
                nativeMemberName = MemberName(nativeMemberName.packageName + ".Companion", nativeMemberName.simpleName),
            )
        }

        members.add(
            memberBlueprint,
        )
    }

    private fun addFunction(function: GirFunction) {
        when (val result = FunctionBlueprintBuilder(context, girNamespace, function).build()) {
            is BlueprintResult.Ok -> functionBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): EnumBlueprint {
        if (!girNode.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.cType)
        }

        context.checkIgnoredType(girNode.cType)

        girNode.members.forEach { addMember(it) }
        girNode.functions.forEach { addFunction(it) }

        val kotlinClassName = context.typeRegistry.get(girNode).className

        val nativePackageName = context.namespaceNativePackageName(girNamespace)
        val nativeValueTypeName = ClassName(nativePackageName, girNode.cType)

        val exceptionTypeName = girNode.glibErrorDomain?.let {
            ClassName(context.namespaceBindingsPackageName(girNamespace), "${kotlinClassName.simpleName}Exception")
        }

        return EnumBlueprint(
            kotlinName = kotlinClassName.simpleName,
            kotlinTypeName = kotlinClassName,
            nativeTypeName = ClassName(context.namespaceNativePackageName(girNamespace), girNode.cType),
            nativeValueTypeName = nativeValueTypeName,
            memberBlueprints = members,
            functionBlueprints = functionBlueprints,
            errorDomain = girNode.glibErrorDomain,
            errorExceptionTypeName = exceptionTypeName,
            memberConstantsAreScopedToType = determineIfConstantsAreScopedToType(nativeValueTypeName, members),
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.info)
                .build()
                .getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
        )
    }

    private fun determineIfConstantsAreScopedToType(
        nativeValueTypeName: TypeName,
        memberBlueprints: List<EnumMemberBlueprint>
    ): Boolean {
        val enumTypeName = nativeValueTypeName as? ClassName ?: return false
        val enumCanonicalName = enumTypeName.canonicalName
        val memberPackageName = memberBlueprints.firstOrNull()?.nativeMemberName?.packageName
        return enumCanonicalName == memberPackageName
    }
}
