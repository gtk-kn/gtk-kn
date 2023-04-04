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

import com.squareup.kotlinpoet.ClassName
import org.gtkkn.gir.model.GirBitField
import org.gtkkn.gir.model.GirCallback
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirConstant
import org.gtkkn.gir.model.GirEnum
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRecord
import org.gtkkn.gir.model.GirRepository
import org.gtkkn.gir.processor.ProcessorContext
import org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeAsciiOnly

class RepositoryBlueprintBuilder(
    context: ProcessorContext,
    private val girRepository: GirRepository,
) : BlueprintBuilder<RepositoryBlueprint>(context) {
    private val namespace: GirNamespace get() = girRepository.namespace

    private val classBlueprints = mutableListOf<ClassBlueprint>()
    private val interfaceBlueprints = mutableListOf<InterfaceBlueprint>()
    private val enumBlueprints = mutableListOf<EnumBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()
    private val callbackBlueprints = mutableListOf<CallbackBlueprint>()
    private val bitfieldBlueprints = mutableListOf<BitfieldBlueprint>()
    private val constantBlueprints = mutableListOf<ConstantBlueprint>()
    private val recordBlueprints = mutableListOf<RecordBlueprint>()

    private fun addClass(girClass: GirClass) {
        when (val result = ClassBlueprintBuilder(context, namespace, girClass).build()) {
            is BlueprintResult.Ok -> classBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addInterface(girInterface: GirInterface) {
        when (val result = InterfaceBlueprintBuilder(context, namespace, girInterface).build()) {
            is BlueprintResult.Ok -> interfaceBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addEnum(girEnum: GirEnum) {
        when (val result = EnumBlueprintBuilder(context, namespace, girEnum).build()) {
            is BlueprintResult.Ok -> enumBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addFunction(girFunction: GirFunction) {
        when (val result = FunctionBlueprintBuilder(context, namespace, girFunction).build()) {
            is BlueprintResult.Ok -> functionBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addCallback(girCallback: GirCallback) {
        when (val result = CallbackBlueprintBuilder(context, namespace, girCallback).build()) {
            is BlueprintResult.Ok -> callbackBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addBitfield(girBitfield: GirBitField) {
        when (val result = BitfieldBlueprintBuilder(context, namespace, girBitfield).build()) {
            is BlueprintResult.Ok -> bitfieldBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addConstant(girConstant: GirConstant) {
        when (val result = ConstantBlueprintBuilder(context, namespace, girConstant).build()) {
            is BlueprintResult.Ok -> constantBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addRecord(girRecord: GirRecord) {
        when (val result = RecordBlueprintBuilder(context, namespace, girRecord).build()) {
            is BlueprintResult.Ok -> recordBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun blueprintObjectType(): String = "repository"
    override fun blueprintObjectName(): String = girRepository.namespace.name

    override fun buildInternal(): RepositoryBlueprint {
        namespace.classes.forEach { addClass(it) }
        namespace.interfaces.forEach { addInterface(it) }
        namespace.enums.forEach { addEnum(it) }
        namespace.functions.forEach { addFunction(it) }
        namespace.callbacks.forEach { addCallback(it) }
        namespace.bitfields.forEach { addBitfield(it) }
        namespace.constants.forEach { addConstant(it) }
        namespace.records.forEach { addRecord(it) }

        girRepository.includes.forEach { include ->
            if (context.findRepositoryByNameOrNull(include.name) == null) {
                skippedObjects.add(SkippedObject("include", include.name, "Missing dependant repository"))
            }
        }

        val kotlinModuleName = girRepository.namespace.name.lowercase()
        val repositoryObjectName = ClassName(
            context.namespaceBindingsPackageName(namespace),
            kotlinModuleName.capitalizeAsciiOnly(),
        )
        val repositoryCallbacksName = ClassName(
            context.namespaceBindingsPackageName(namespace),
            "Callbacks",
        )

        return RepositoryBlueprint(
            name = girRepository.namespace.name,
            kotlinModuleName = kotlinModuleName,
            classBlueprints = classBlueprints,
            interfaceBlueprints = interfaceBlueprints,
            enumBlueprints = enumBlueprints,
            functionBlueprints = functionBlueprints,
            callbackBlueprints = callbackBlueprints,
            bitfieldBlueprints = bitfieldBlueprints,
            constantBlueprints = constantBlueprints,
            recordBlueprints = recordBlueprints,
            skippedObjects = skippedObjects,
            repositoryObjectName = repositoryObjectName,
            repositoryCallbacksName = repositoryCallbacksName,
        )
    }
}
