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
import net.pearx.kasechange.toPascalCase
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirField
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRecord
import org.gtkkn.gir.model.GirUnion
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

    override fun buildInternal(): RecordBlueprint {
        if (girRecord.shouldNotBeGenerated()) {
            throw NotIntrospectableException(girRecord.name)
        }

        girRecord.cType?.let { context.checkIgnoredType(it) }

        if (girRecord.foreign == true) throw UnresolvableTypeException("foreign records are ignored")
        if (girRecord.glibIsGTypeStructFor != null && girRecord.glibIsGTypeStructFor != "Object") {
            throw UnresolvableTypeException("glib type struct are ignored")
        }

        // Add top-level methods, constructors, functions
        girRecord.methods.forEach { addMethod(it) }
        girRecord.constructors.forEach { addConstructor(it) }
        girRecord.functions.forEach { addFunction(it) }

        // Add top-level fields (no prefix for top-level)
        girRecord.fields.forEach { addField(it, prefix = null) }

        // Recursively merge all union fields and their nested records' fields
        girRecord.unions.forEach { addUnionFields(it, prefix = null) }

        val objectPointerName = "${context.namespacePrefix(girNamespace)}${girRecord.name}Pointer"
        val objectPointerTypeName = context.resolveRecordObjectPointerTypeName(girNamespace, girRecord)

        val kotlinName = girRecord.name.toPascalCase()

        return RecordBlueprint(
            kotlinName = kotlinName,
            kotlinTypeName = ClassName(context.namespaceBindingsPackageName(girNamespace), kotlinName),
            nativeTypeName = context.buildNativeClassName(girNamespace, girRecord),
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
            isDisguised = girRecord.disguised == true,
            hasNewConstructor = girRecord.constructors.any { it.callable.getName() == "new" },
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girRecord.info)
                .build()
                .getOrNull(),
            kdoc = context.processKdoc(girRecord.doc?.doc?.text),
            skippedObjects = skippedObjects,
        )
    }

    private fun addMethod(method: GirMethod) {
        when (val result = MethodBlueprintBuilder(context, girNamespace, method).build()) {
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

    /**
     * Add a field with an optional prefix (access path).
     */
    private fun addField(field: GirField, prefix: String?) {
        when (val result = FieldBlueprintBuilder(context, girNamespace, field, prefix).build()) {
            is BlueprintResult.Ok -> fieldBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    /**
     * Recursively add fields from a GirRecord and its unions.
     */
    private fun addRecordFields(record: GirRecord, prefix: String?) {
        // Append the record name to the current path, if it exists
        val currentPrefix = if (record.name.isNotBlank()) {
            if (prefix.isNullOrBlank()) record.name else "$prefix.${record.name}"
        } else {
            prefix
        }

        record.fields.forEach { addField(it, currentPrefix) }
        record.unions.forEach { addUnionFields(it, currentPrefix) }
    }

    /**
     * Recursively add fields from a GirUnion and any nested GirRecords.
     */
    private fun addUnionFields(girUnion: GirUnion, prefix: String?) {
        if (girUnion.shouldBeGenerated()) {
            // Append the union name to the current path, if it exists
            val currentPrefix = if (!girUnion.name.isNullOrBlank()) {
                if (prefix.isNullOrBlank()) girUnion.name else "$prefix.${girUnion.name}"
            } else {
                prefix
            }

            girUnion.fields.forEach { addField(it, currentPrefix) }
            girUnion.records.forEach { addRecordFields(it, currentPrefix) }
        }
    }

    private fun GirRecord.shouldNotBeGenerated(): Boolean =
        !info.shouldBeGenerated() ||
            cType != "GPrivate" && name.endsWith("Private")
}
