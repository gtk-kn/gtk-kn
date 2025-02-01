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

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName
import net.pearx.kasechange.toPascalCase
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirConstant
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirProperty
import org.gtkkn.gir.model.GirSignal
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException
import org.gtkkn.gir.processor.namespaceBindingsPackageName
import org.gtkkn.gir.processor.namespaceNativePackageName
import org.gtkkn.gir.processor.namespacePrefix

class InterfaceBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girNode: GirInterface,
) : BlueprintBuilder<InterfaceBlueprint>(context) {
    private val methodBlueprints = mutableListOf<MethodBlueprint>()
    private val constantBlueprints = mutableListOf<ConstantBlueprint>()
    private val propertyBlueprints = mutableListOf<PropertyBlueprint>()
    private val signalBlueprints = mutableListOf<SignalBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()
    private val propertyMethodBlueprintMap = hashMapOf<String, MethodBlueprint>()
    private val parentInterfaces = mutableListOf<ImplementsInterfaceBlueprint>()

    override fun blueprintObjectType(): String = "interface"

    override fun blueprintObjectName(): String = checkNotNull(girNode.name)

    override fun buildInternal(): InterfaceBlueprint {
        checkNotNull(girNode.name)
        checkNotNull(girNamespace.name)
        if (!girNode.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.cType ?: girNode.name)
        }

        girNode.cType?.let { context.checkIgnoredType(it) }

        val objectPointerTypeName = context.resolveInterfaceObjectPointerTypeName(
            namespace = girNamespace,
            cType = checkNotNull(girNode.cType),
        )

        girNode.methods.forEach { addMethod(it, objectPointerTypeName) }
        girNode.constants.forEach { addConstant(it) }
        girNode.properties.forEach { addProperty(it) }
        girNode.signals.forEach { addSignal(it) }
        girNode.functions.forEach { addFunction(it) }

        val kotlinClassName = context.typeRegistry.get(girNode).className

        val objectPointerName = "${namespacePrefix(girNamespace)}${girNode.name.toPascalCase()}Pointer"

        addParentInterfaces()

        val glibGetTypeMember = if (girNode.glibGetType != "intern") {
            MemberName(namespaceNativePackageName(girNamespace), girNode.glibGetType)
        } else {
            null
        }

        val implClassSuperclassTypeName = girNode
            .prerequisites
            .firstNotNullOfOrNull { p ->
                context.typeRegistry.get(girNamespace, p.name).takeIf { type -> type.girNamedElement is GirClass }
            }
            ?.className
            ?: BindingsGenerator.G_OBJECT

        return InterfaceBlueprint(
            kotlinName = kotlinClassName.simpleName,
            nativeName = girNode.name,
            kotlinTypeName = kotlinClassName,
            methods = methodBlueprints,
            constants = constantBlueprints,
            properties = propertyBlueprints,
            skippedObjects = skippedObjects,
            objectPointerName = objectPointerName,
            objectPointerTypeName = objectPointerTypeName,
            signals = signalBlueprints,
            functions = functionBlueprints,
            parentInterfaces = parentInterfaces,
            implClassSuperclassTypeName = implClassSuperclassTypeName,
            glibGetTypeFunc = glibGetTypeMember,
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.info).build()
                .getOrNull(),
            deprecatedBlueprint = DeprecatedBlueprintBuilder(context, girNode.info, girNode.doc).build().getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
        )
    }

    private fun addConstant(girConstant: GirConstant) {
        when (val result = ConstantBlueprintBuilder(context, girNamespace, girConstant).build()) {
            is BlueprintResult.Ok -> constantBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addProperty(property: GirProperty) {
        when (val result =
            PropertyBlueprintBuilder(
                context,
                girNamespace,
                property,
                propertyMethodBlueprintMap,
            ).build()
        ) {
            is BlueprintResult.Ok -> propertyBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addMethod(method: GirMethod, objectPointerTypeName: ParameterizedTypeName) {
        when (val result = MethodBlueprintBuilder(
            context = context,
            girNamespace = girNamespace,
            girNode = method,
            objectPointerTypeName = objectPointerTypeName,
        ).build()) {
            is BlueprintResult.Ok -> {
                methodBlueprints.add(result.blueprint)
                if (method.callable.getName().startsWith("get") && result.blueprint.parameters.isEmpty() ||
                    method.callable.getName().startsWith("set") && result.blueprint.parameters.size == 1
                ) {
                    propertyMethodBlueprintMap[method.callable.getName()] = result.blueprint
                }
            }

            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addSignal(signal: GirSignal) {
        when (val result = SignalBlueprintBuilder(
            context = context,
            girNamespace = girNamespace,
            girNode = signal,
            methods = girNode.methods,
            functions = girNode.functions,
        ).build()) {
            is BlueprintResult.Ok -> signalBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addFunction(function: GirFunction) {
        when (val result = FunctionBlueprintBuilder(context, girNamespace, function).build()) {
            is BlueprintResult.Ok -> functionBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
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
            val kotlinPackageName = namespaceBindingsPackageName(namespace)

            val typeName = ClassName(kotlinPackageName, kotlinInterfaceName)
            val objectPointerName = "${namespacePrefix(namespace)}${iface.name.toPascalCase()}Pointer"
            val objectPointerTypeName = context.resolveInterfaceObjectPointerTypeName(
                namespace = namespace,
                cType = checkNotNull(iface.cType),
            )
            ImplementsInterfaceBlueprint(typeName, objectPointerTypeName, objectPointerName)
        }
        parentInterfaces.addAll(ifaces)
    }
}
