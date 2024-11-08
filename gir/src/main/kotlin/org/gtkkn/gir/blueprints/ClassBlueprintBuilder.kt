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
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirProperty
import org.gtkkn.gir.model.GirSignal
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class ClassBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girClass: GirClass,
) : BlueprintBuilder<ClassBlueprint>(
    context,
) {
    private val constructorBlueprints = mutableListOf<ConstructorBlueprint>()
    private val methodBluePrints = mutableListOf<MethodBlueprint>()
    private val propertyBluePrints = mutableListOf<PropertyBlueprint>()
    private val signalBluePrints = mutableListOf<SignalBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()
    private val implementsInterfaces = mutableListOf<ImplementsInterfaceBlueprint>()
    private val propertyMethodBluePrintMap = hashMapOf<String, MethodBlueprint>()
    private var parentTypeName: TypeName? = null
    private val interfacePointerOverrides = mutableListOf<ImplementsInterfaceBlueprint>()

    /**
     * Lazily build the list of superclasses for method override resolution
     */
    private val superClasses: List<GirClass> by lazy {
        buildList {
            var currentClass = girClass
            var currentNamespace = girNamespace
            while (currentClass.parent != null) {
                val (namespace, clazz) = context.findClassByName(currentNamespace, checkNotNull(currentClass.parent))
                add(clazz)
                currentClass = clazz
                currentNamespace = namespace
            }
        }
    }

    /**
     * Lazily build the list of interfaces for method override resolution
     */
    private val interfaces: List<GirInterface> by lazy {
        girClass.implements.map { context.findInterfaceByName(girNamespace, it.name).second }
    }

    override fun blueprintObjectType(): String = "class"

    override fun blueprintObjectName(): String = girClass.name

    private fun addProperty(property: GirProperty) {
        when (val result =
            PropertyBlueprintBuilder(
                context,
                girNamespace,
                property,
                propertyMethodBluePrintMap,
                superClasses,
                interfaces,
                isOpen = girClass.final != true,
            ).build()
        ) {
            is BlueprintResult.Ok -> propertyBluePrints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addMethod(method: GirMethod) {
        when (val result =
            MethodBlueprintBuilder(
                context,
                girNamespace,
                method,
                superClasses,
                interfaces,
                isOpen = girClass.final != true,
            ).build()) {
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

    private fun addConstructor(constructor: GirConstructor) {
        when (val result = ConstructorBlueprintBuilder(context, girNamespace, constructor).build()) {
            is BlueprintResult.Ok -> constructorBlueprints.add(result.blueprint)
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

    override fun buildInternal(): ClassBlueprint {
        if (girClass.info.introspectable == false) {
            throw NotIntrospectableException(girClass.cType ?: girClass.name)
        }

        girClass.cType?.let { context.checkIgnoredType(it) }

        if (girClass.parent != null) {
            try {
                parentTypeName = context.resolveClassTypeName(girNamespace, girClass.parent)
            } catch (ex: UnresolvableTypeException) {
                throw UnresolvableTypeException("Parent type ${girClass.parent} could not be resolved.")
            }
        }

        addInterfaces()
        addInterfaceOverrides()

        girClass.methods.forEach { addMethod(it) }
        girClass.properties.forEach { addProperty(it) }
        girClass.constructors.forEach { addConstructor(it) }
        girClass.signals.forEach { addSignal(it) }
        girClass.functions.forEach { addFunction(it) }

        val kotlinClassName = context.kotlinizeClassName(girClass.name)
        val kotlinPackageName = context.kotlinizePackageName(girNamespace.name)

        val objectPointerName = if (girClass.parent != null) {
            "${context.namespacePrefix(girNamespace)}${girClass.name}Pointer"
        } else {
            "gPointer"
        }
        val objectPointerTypeName = context.resolveClassObjectPointerTypeName(girNamespace, girClass)

        val glibGetTypeMember = if (girClass.glibGetType != "intern") {
            MemberName(context.namespaceNativePackageName(girNamespace), girClass.glibGetType)
        } else {
            null
        }

        return ClassBlueprint(
            kotlinName = kotlinClassName,
            nativeName = girClass.name,
            typeName = ClassName(kotlinPackageName, kotlinClassName),
            methods = methodBluePrints,
            properties = propertyBluePrints,
            constructors = constructorBlueprints,
            signals = signalBluePrints,
            functions = functionBlueprints,
            skippedObjects = skippedObjects,
            implementsInterfaces = implementsInterfaces,
            parentTypeName = parentTypeName,
            objectPointerName = objectPointerName,
            objectPointerTypeName = objectPointerTypeName,
            isFinal = girClass.final == true,
            interfacePointerOverrides = interfacePointerOverrides,
            glibGetTypeFunc = glibGetTypeMember,
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(
                context,
                girNamespace,
                girClass.info
            ).build().getOrNull(),
            kdoc = context.processKdoc(girClass.info.docs.doc?.text),
        )
    }

    /**
     * Add regular interfaces that this class implements.
     */
    private fun addInterfaces() {
        val parentInterfacePairs = if (girClass.parent != null) {
            val (parentNamespace, parentClass) = context.findClassByName(girNamespace, girClass.parent)
            parentClass.implements.map { context.findInterfaceByName(parentNamespace, it.name) }
        } else {
            emptyList()
        }

        val implementsInterfacePairs = girClass.implements.map { context.findInterfaceByName(girNamespace, it.name) }

        // exclude interfaces implemented by parent
        val classUniqueInterfaces = implementsInterfacePairs.filterNot { parentInterfacePairs.contains(it) }

        classUniqueInterfaces.forEach { ifacePair ->
            val interfacePointerName = "${context.namespacePrefix(ifacePair.first)}${ifacePair.second.name}Pointer"
            val interfaceTypeName = context.resolveInterfaceTypeName(ifacePair.first, ifacePair.second.name)
            val interfacePointerTypeName =
                context.resolveInterfaceObjectPointerTypeName(ifacePair.first, ifacePair.second)
            implementsInterfaces.add(
                ImplementsInterfaceBlueprint(
                    interfaceTypeName,
                    interfacePointerTypeName,
                    interfacePointerName,
                ),
            )
        }
    }

    /**
     * Add interfaces that are implemented because they are a parent interface of an already implemented interface.
     *
     * The pointer properties for these can clash with the pointer properties from the parent interface so
     * we add them here for the generator to generate overridden pointer properties.
     */
    private fun addInterfaceOverrides() {
        val allImplementingInterfaces = girClass.implements.flatMap {
            resolveInterfacesRecursively(girNamespace, it.name)
        }

        allImplementingInterfaces.forEach { pair ->
            val namespace = pair.first
            val iface = pair.second
            val kotlinInterfaceName = context.kotlinizeClassName(iface.name)
            val kotlinPackageName = context.kotlinizePackageName(namespace.name)

            val typeName = ClassName(kotlinPackageName, kotlinInterfaceName)
            val objectPointerName = "${context.namespacePrefix(namespace)}${iface.name}Pointer"
            val objectPointerTypeName = context.resolveInterfaceObjectPointerTypeName(namespace, iface)
            val parentIfaceBlueprint = ImplementsInterfaceBlueprint(typeName, objectPointerTypeName, objectPointerName)
            if (!implementsInterfaces.contains(parentIfaceBlueprint)) {
                interfacePointerOverrides.add(parentIfaceBlueprint)
            }
        }
    }

    private fun resolveInterfacesRecursively(
        namespace: GirNamespace,
        name: String
    ): Set<Pair<GirNamespace, GirInterface>> {
        val iface = resolveInterfaceOrNull(namespace, name) ?: return emptySet()
        val parentIfaces = iface.second.implements.flatMap { resolveInterfacesRecursively(iface.first, it.name) }
        return setOf(iface) + parentIfaces
    }

    private fun resolveInterfaceOrNull(namespace: GirNamespace, name: String): Pair<GirNamespace, GirInterface>? = try {
        context.findInterfaceByName(namespace, name)
    } catch (ex: UnresolvableTypeException) {
        null
    }
}
