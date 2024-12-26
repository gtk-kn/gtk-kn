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
import net.pearx.kasechange.toPascalCase
import org.gtkkn.gir.model.GirBitfield
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.namespaceNativePackageName

class BitfieldBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girNode: GirBitfield,
) : BlueprintBuilder<BitfieldBlueprint>(context) {
    private val members = mutableListOf<BitfieldMemberBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()

    override fun blueprintObjectType(): String = "bitfield"

    override fun blueprintObjectName(): String = girNode.name

    private fun addFunction(function: GirFunction) {
        when (val result = FunctionBlueprintBuilder(context, girNamespace, function).build()) {
            is BlueprintResult.Ok -> functionBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): BitfieldBlueprint {
        context.checkIgnoredType(girNode.cType)

        if (!girNode.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.cType)
        }

        val kotlinTypeName = context.typeRegistry.get(girNode).className

        val nativePackageName = namespaceNativePackageName(girNamespace)
        val nativeValueTypeName = ClassName(nativePackageName, girNode.cType)

        girNode.members.forEach { member ->
            val memberKotlinName = member.name.uppercase()
            members.add(
                BitfieldMemberBlueprint(
                    kotlinName = memberKotlinName,
                    nativeValue = member.value.toLong(),
                    nativeMemberName = MemberName(nativePackageName, member.cIdentifier),
                    optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, member.info)
                        .build()
                        .getOrNull(),
                    kdoc = context.processKdoc(member.doc?.doc?.text),
                ),
            )
        }

        girNode.functions.forEach { addFunction(it) }

        return BitfieldBlueprint(
            kotlinName = girNode.name.toPascalCase(),
            members = members,
            functionBlueprints = functionBlueprints,
            kotlinTypeName = kotlinTypeName,
            nativeValueTypeName = nativeValueTypeName,
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.info)
                .build()
                .getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
        )
    }
}
