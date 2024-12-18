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

class UnionBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girUnion: GirUnion,
) : BlueprintBuilder<UnionBlueprint>(context) {
    private val constructorBlueprints = mutableListOf<ConstructorBlueprint>()
    private val methodBlueprints = mutableListOf<MethodBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()
    private val fieldBlueprints = mutableListOf<FieldBlueprint>()

    override fun blueprintObjectType(): String = "union"

    override fun blueprintObjectName(): String =
        girUnion.name ?: throw NotIntrospectableException("Unnamed union cannot be built")

    override fun buildInternal(): UnionBlueprint {
        if (!girUnion.shouldBeGenerated() || girUnion.name.isNullOrBlank()) {
            throw NotIntrospectableException(girUnion.name ?: "UnnamedUnion")
        }

        girUnion.cType?.let { context.checkIgnoredType(it) }

        // Add top-level methods, constructors, functions
        girUnion.methods.forEach { addMethod(it) }
        girUnion.constructors.forEach { addConstructor(it) }
        girUnion.functions.forEach { addFunction(it) }

        // Add top-level fields (no prefix for top-level)
        girUnion.fields.forEach { addField(it, prefix = null) }

        // If there are nested records, process their fields as well
        girUnion.records.forEach { addRecordFields(it, prefix = null) }

        val objectPointerName = "${context.namespacePrefix(girNamespace)}${girUnion.name}Pointer"
        val objectPointerTypeName = context.resolveUnionObjectPointerTypeName(girNamespace, girUnion)

        val kotlinName = girUnion.name.toPascalCase()
        val nativeTypeName = context.buildNativeClassName(girNamespace, girUnion)

        return UnionBlueprint(
            kotlinName = kotlinName,
            kotlinTypeName = ClassName(context.namespaceBindingsPackageName(girNamespace), kotlinName),
            nativeTypeName = nativeTypeName,
            objectPointerName = objectPointerName,
            objectPointerTypeName = objectPointerTypeName,
            constructors = constructorBlueprints,
            functions = functionBlueprints,
            methods = methodBlueprints,
            fields = fieldBlueprints,
            cStructTypeName = ClassName(
                context.namespaceNativePackageName(girNamespace),
                girUnion.cType ?: error("unknown cType"),
            ),
            hasNewConstructor = girUnion.constructors.any { it.callable.getName() == "new" },
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girUnion.info)
                .build()
                .getOrNull(),
            kdoc = context.processKdoc(girUnion.doc?.doc?.text),
            skippedObjects = skippedObjects,
        )
    }

    private fun addMethod(method: GirMethod) {
        when (val result = MethodBlueprintBuilder(context, girNamespace, method).build()) {
            is BlueprintResult.Ok -> methodBlueprints.add(result.blueprint)
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
     * Recursively add fields from a GirRecord and its unions, since Unions can contain Records.
     */
    private fun addRecordFields(record: GirRecord, prefix: String?) {
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
}
