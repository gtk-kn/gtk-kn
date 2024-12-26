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
    private val girNode: GirInterface,
) : BlueprintBuilder<InterfaceBlueprint>(context) {
    private val methodBluePrints = mutableListOf<MethodBlueprint>()
    private val propertyBluePrints = mutableListOf<PropertyBlueprint>()
    private val signalBluePrints = mutableListOf<SignalBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()
    private val propertyMethodBluePrintMap = hashMapOf<String, MethodBlueprint>()
    private val parentInterfaces = mutableListOf<ImplementsInterfaceBlueprint>()

    override fun blueprintObjectType(): String = "interface"

    override fun blueprintObjectName(): String = checkNotNull(girNode.name)

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
                if (method.callable.getName().startsWith("get") && result.blueprint.parameters.isEmpty() ||
                    method.callable.getName().startsWith("set") && result.blueprint.parameters.size == 1
                ) {
                    propertyMethodBluePrintMap[method.callable.getName()] = result.blueprint
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
        checkNotNull(girNode.name)
        checkNotNull(girNamespace.name)
        if (!girNode.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.cType ?: girNode.name)
        }

        girNode.cType?.let { context.checkIgnoredType(it) }

        girNode.methods.forEach { addMethod(it) }
        girNode.properties.forEach { addProperty(it) }
        girNode.signals.forEach { addSignal(it) }
        girNode.functions.forEach { addFunction(it) }

        val kotlinClassName = context.typeRegistry.get(girNode).className

        val objectPointerName = "${context.namespacePrefix(girNamespace)}${girNode.name.toPascalCase()}Pointer"
        val objectPointerTypeName = context.resolveInterfaceObjectPointerTypeName(
            namespace = girNamespace,
            cType = checkNotNull(girNode.cType),
        )

        addParentInterfaces()

        val glibGetTypeMember = if (girNode.glibGetType != "intern") {
            MemberName(context.namespaceNativePackageName(girNamespace), girNode.glibGetType)
        } else {
            null
        }

        return InterfaceBlueprint(
            kotlinName = kotlinClassName.simpleName,
            nativeName = girNode.name,
            typeName = kotlinClassName,
            methods = methodBluePrints,
            properties = propertyBluePrints,
            skippedObjects = skippedObjects,
            objectPointerName = objectPointerName,
            objectPointerTypeName = objectPointerTypeName,
            signals = signalBluePrints,
            functions = functionBlueprints,
            parentInterfaces = parentInterfaces,
            glibGetTypeFunc = glibGetTypeMember,
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.info).build()
                .getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
        )
    }

    private fun addParentInterfaces() {
        val ifaces = girNode.prerequisites.mapNotNull { prereq ->
            try {
                val type = context.typeRegistry.get(girNamespace, prereq.name)
                if (type.girNamedElement is GirInterface) {
                    type.girNamedElement.namespace to type.girNamedElement
                } else {
                    null
                }
            } catch (ex: UnresolvableTypeException) {
                null
            }
        }.map { (namespace, iface) ->
            val kotlinInterfaceName = checkNotNull(iface.name).toPascalCase()
            val kotlinPackageName = context.namespaceBindingsPackageName(namespace)

            val typeName = ClassName(kotlinPackageName, kotlinInterfaceName)
            val objectPointerName = "${context.namespacePrefix(namespace)}${iface.name.toPascalCase()}Pointer"
            val objectPointerTypeName = context.resolveInterfaceObjectPointerTypeName(
                namespace = namespace,
                cType = checkNotNull(iface.cType),
            )
            ImplementsInterfaceBlueprint(typeName, objectPointerTypeName, objectPointerName)
        }
        parentInterfaces.addAll(ifaces)
    }
}
