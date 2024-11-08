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
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirField
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRecord
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class RecordBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girRecord: GirRecord,
) : BlueprintBuilder<RecordBlueprint>(context) {
    private val constructorBlueprints = mutableListOf<ConstructorBlueprint>()
    private val methodBluePrints = mutableListOf<MethodBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()
    private val fieldBlueprints = mutableListOf<FieldBlueprint>()

    override fun blueprintObjectType(): String = "record"

    override fun blueprintObjectName(): String = girRecord.name

    private fun addMethod(method: GirMethod) {
        when (val result =
            MethodBlueprintBuilder(
                context,
                girNamespace,
                method,
            ).build()) {
            is BlueprintResult.Ok -> methodBluePrints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addConstructor(constructor: GirConstructor) {
        when (val result = ConstructorBlueprintBuilder(context, girNamespace, constructor).build()) {
            is BlueprintResult.Ok -> constructorBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addFunction(function: GirFunction) {
        when (val result = FunctionBlueprintBuilder(context, girNamespace, function).build()) {
            is BlueprintResult.Ok -> functionBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addField(field: GirField) {
        when (val result = FieldBlueprintBuilder(context, girNamespace, field).build()) {
            is BlueprintResult.Ok -> fieldBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): RecordBlueprint {
        if (girRecord.info.introspectable == false) throw NotIntrospectableException(girRecord.name)

        girRecord.cType?.let { context.checkIgnoredType(it) }

        if (girRecord.foreign == true) throw UnresolvableTypeException("foreign records are ignored")
        if (girRecord.glibIsGtypeStructFor != null && girRecord.glibIsGtypeStructFor != "Object") {
            throw UnresolvableTypeException("glib type struct are ignored")
        }
        if (girRecord.disguised == true) throw UnresolvableTypeException("Disguised records are ignored")

        girRecord.methods.forEach { addMethod(it) }
        girRecord.constructors.forEach { addConstructor(it) }
        girRecord.functions.forEach { addFunction(it) }
        girRecord.fields.forEach { addField(it) }

        val objectPointerName = "${context.namespacePrefix(girNamespace)}${girRecord.name}Pointer"
        val objectPointerTypeName = context.resolveRecordObjectPointerTypeName(girNamespace, girRecord)

        val kotlinName = context.kotlinizeRecordName(girRecord.name)
        return RecordBlueprint(
            kotlinName = kotlinName,
            kotlinTypeName = ClassName(context.namespaceBindingsPackageName(girNamespace), kotlinName),
            constructors = constructorBlueprints,
            functions = functionBlueprints,
            methods = methodBluePrints,
            fields = fieldBlueprints,
            objectPointerName = objectPointerName,
            objectPointerTypeName = objectPointerTypeName,
            cStructTypeName = ClassName(
                context.namespaceNativePackageName(girNamespace),
                girRecord.cType ?: error("unknown cType"),
            ),
            isOpaque = girRecord.opaque == true,
            kdoc = context.processKdoc(girRecord.info.docs.doc?.text),
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girRecord.info)
                .build()
                .getOrNull(),
            skippedObjects = skippedObjects,
        )
    }
}
