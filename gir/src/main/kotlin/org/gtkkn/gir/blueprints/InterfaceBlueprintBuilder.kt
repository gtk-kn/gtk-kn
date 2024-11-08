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
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirProperty
import org.gtkkn.gir.model.GirSignal
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class InterfaceBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girInterface: GirInterface,
) : BlueprintBuilder<InterfaceBlueprint>(context) {
    private val methodBluePrints = mutableListOf<MethodBlueprint>()
    private val propertyBluePrints = mutableListOf<PropertyBlueprint>()
    private val signalBluePrints = mutableListOf<SignalBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()
    private val propertyMethodBluePrintMap = hashMapOf<String, MethodBlueprint>()
    private val parentInterfaces = mutableListOf<ImplementsInterfaceBlueprint>()

    override fun blueprintObjectType(): String = "interface"

    override fun blueprintObjectName(): String = girInterface.name

    private fun addProperty(property: GirProperty) {
        when (val result =
            PropertyBlueprintBuilder(
                context,
                girNamespace,
                property,
                propertyMethodBluePrintMap,
            ).build()
        ) {
            is BlueprintResult.Ok -> propertyBluePrints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addMethod(method: GirMethod) {
        when (val result = MethodBlueprintBuilder(context, girNamespace, method).build()) {
            is BlueprintResult.Ok -> {
                methodBluePrints.add(result.blueprint)
                if (method.name.startsWith("get") && result.blueprint.parameters.isEmpty() ||
                    method.name.startsWith("set") && result.blueprint.parameters.size == 1
                ) {
                    propertyMethodBluePrintMap[method.name] = result.blueprint
                }
            }

            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addSignal(signal: GirSignal) {
        when (val result = SignalBlueprintBuilder(context, girNamespace, signal).build()) {
            is BlueprintResult.Ok -> signalBluePrints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addFunction(function: GirFunction) {
        when (val result = FunctionBlueprintBuilder(context, girNamespace, function).build()) {
            is BlueprintResult.Ok -> functionBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): InterfaceBlueprint {
        if (girInterface.info.introspectable == false) {
            throw NotIntrospectableException(girInterface.cType ?: girInterface.name)
        }

        girInterface.cType?.let { context.checkIgnoredType(it) }

        girInterface.methods.forEach { addMethod(it) }
        girInterface.properties.forEach { addProperty(it) }
        girInterface.signals.forEach { addSignal(it) }
        girInterface.functions.forEach { addFunction(it) }

        val kotlinInterfaceName = context.kotlinizeClassName(girInterface.name)
        val kotlinPackageName = context.kotlinizePackageName(girNamespace.name)

        val objectPointerName = "${context.namespacePrefix(girNamespace)}${girInterface.name}Pointer"
        val objectPointerTypeName = context.resolveInterfaceObjectPointerTypeName(girNamespace, girInterface)

        addParentInterfaces()

        val glibGetTypeMember = if (girInterface.glibGetType != "intern") {
            MemberName(context.namespaceNativePackageName(girNamespace), girInterface.glibGetType)
        } else {
            null
        }

        return InterfaceBlueprint(
            kotlinName = kotlinInterfaceName,
            nativeName = girInterface.name,
            typeName = ClassName(kotlinPackageName, kotlinInterfaceName),
            methods = methodBluePrints,
            properties = propertyBluePrints,
            skippedObjects = skippedObjects,
            objectPointerName = objectPointerName,
            objectPointerTypeName = objectPointerTypeName,
            signals = signalBluePrints,
            functions = functionBlueprints,
            parentInterfaces = parentInterfaces,
            glibGetTypeFunc = glibGetTypeMember,
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girInterface.info).build()
                .getOrNull(),
            kdoc = context.processKdoc(girInterface.info.docs.doc?.text),
        )
    }

    private fun addParentInterfaces() {
        val ifaces = girInterface.prerequisites.mapNotNull { prereq ->
            try {
                context.findInterfaceByName(girNamespace, prereq.name)
            } catch (ex: UnresolvableTypeException) {
                null
            }
        }.map { (namespace, iface) ->
            val kotlinInterfaceName = context.kotlinizeClassName(iface.name)
            val kotlinPackageName = context.kotlinizePackageName(namespace.name)

            val typeName = ClassName(kotlinPackageName, kotlinInterfaceName)
            val objectPointerName = "${context.namespacePrefix(namespace)}${iface.name}Pointer"
            val objectPointerTypeName = context.resolveInterfaceObjectPointerTypeName(namespace, iface)
            ImplementsInterfaceBlueprint(typeName, objectPointerTypeName, objectPointerName)
        }
        parentInterfaces.addAll(ifaces)
    }
}
