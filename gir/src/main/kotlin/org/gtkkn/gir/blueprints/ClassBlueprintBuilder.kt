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
import org.gtkkn.gir.processor.namespaceBindingsPackageName
import org.gtkkn.gir.processor.namespaceNativePackageName
import org.gtkkn.gir.processor.namespacePrefix

class ClassBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girNode: GirClass,
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
    private var parentClassName: ClassName? = null
    private val interfacePointerOverrides = mutableListOf<ImplementsInterfaceBlueprint>()

    /**
     * Lazily build the list of superclasses for method override resolution
     */
    private val superClasses: List<GirClass> by lazy {
        buildList {
            var currentClass = girNode
            var currentNamespace = girNamespace
            while (currentClass.parent != null) {
                val type = context.typeRegistry.get(currentNamespace, checkNotNull(currentClass.parent))
                val clazz = type.girNamedElement as GirClass
                add(clazz)
                currentClass = clazz
                currentNamespace = type.girNamedElement.namespace
            }
        }
    }

    /**
     * Lazily build the list of interfaces for method override resolution
     */
    private val interfaces: List<GirInterface> by lazy {
        girNode.implements.map { context.typeRegistry.get(girNamespace, it.name).girNamedElement as GirInterface }
    }

    override fun blueprintObjectType(): String = "class"

    override fun buildInternal(): ClassBlueprint {
        if (!girNode.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.cType ?: girNode.name)
        }

        girNode.cType?.let { context.checkIgnoredType(it) }

        if (girNode.parent != null) {
            parentClassName = context.typeRegistry.get(girNamespace, girNode.parent).className
        }

        addInterfaces()
        addInterfaceOverrides()

        val objectPointerTypeName = context.resolveClassObjectPointerTypeName(girNamespace, girNode)

        girNode.methods.forEach { addMethod(it, objectPointerTypeName) }
        girNode.properties.forEach { addProperty(it) }
        girNode.constructors.forEach { addConstructor(it) }
        girNode.signals.forEach { addSignal(it) }
        girNode.functions.forEach { addFunction(it) }
        propertyMethodBluePrintMap.addSuperPropertyOverrides(propertyBluePrints, superClasses, interfaces)

        val kotlinClassName = context.typeRegistry.get(girNode).className

        val objectPointerName = "${namespacePrefix(girNamespace)}${girNode.name.toPascalCase()}Pointer"

        val glibGetTypeMember = if (girNode.glibGetType != "intern") {
            MemberName(namespaceNativePackageName(girNamespace), girNode.glibGetType)
        } else {
            null
        }

        return ClassBlueprint(
            kotlinName = kotlinClassName.simpleName,
            nativeName = girNode.name,
            typeName = kotlinClassName,
            methods = methodBluePrints,
            properties = propertyBluePrints,
            constructors = constructorBlueprints,
            signals = signalBluePrints,
            functions = functionBlueprints,
            skippedObjects = skippedObjects,
            implementsInterfaces = implementsInterfaces,
            parentClassName = parentClassName,
            objectPointerName = objectPointerName,
            objectPointerTypeName = objectPointerTypeName,
            isAbstract = girNode.abstract == true,
            isFinal = girNode.final == true,
            interfacePointerOverrides = interfacePointerOverrides,
            glibGetTypeFunc = glibGetTypeMember,
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(
                context,
                girNamespace,
                girNode.info,
            ).build().getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
        )
    }

    override fun blueprintObjectName(): String = girNode.name

    private fun addProperty(property: GirProperty) {
        when (val result =
            PropertyBlueprintBuilder(
                context,
                girNamespace,
                property,
                propertyMethodBluePrintMap,
                superClasses,
                interfaces,
                isOpen = girNode.final != true,
            ).build()
        ) {
            is BlueprintResult.Ok -> {
                propertyBluePrints.add(result.blueprint)
                // Removing any duplicate getter and setter methods from methodBluePrints
                methodBluePrints.remove(result.blueprint.getter)
                result.blueprint.setter?.let { methodBluePrints.remove(it) }
            }

            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addMethod(method: GirMethod, objectPointerTypeName: ParameterizedTypeName) {
        when (val result =
            MethodBlueprintBuilder(
                context = context,
                girNamespace = girNamespace,
                girNode = method,
                superClasses = superClasses,
                superInterfaces = interfaces,
                isOpen = girNode.final != true,
                objectPointerTypeName = objectPointerTypeName,
            ).build()) {
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

    private fun addConstructor(constructor: GirConstructor) {
        when (val result = ConstructorBlueprintBuilder(context, girNamespace, constructor).build()) {
            is BlueprintResult.Ok -> constructorBlueprints.add(result.blueprint)
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

    /**
     * Adds property overrides for getters and setters defined in the superclasses and interfaces.
     *
     * This function identifies unused getters and setters in the current class that are defined in the
     * superclasses or interfaces (`superProperties`) and should be overridden.
     * The resulting overrides are added to the `propertyBluePrints`.
     *
     * @receiver A map of method names to their corresponding `MethodBlueprint` objects.
     * @param propertyBluePrints A list of `PropertyBlueprint` objects where the new overrides
     * will be added.
     * @param superClasses A list of `GirClass` objects representing the superclasses of the current class.
     * @param interfaces A list of `GirInterface` objects representing the interfaces implemented by the
     * current class.
     */
    private fun HashMap<String, MethodBlueprint>.addSuperPropertyOverrides(
        propertyBluePrints: List<PropertyBlueprint>,
        superClasses: List<GirClass>,
        interfaces: List<GirInterface>
    ) {
        // Collect all properties from superclasses and interfaces
        val superProperties = superClasses.flatMap { it.properties } + interfaces.flatMap { it.properties }

        // Filter getters and setters from the current method map
        val getters = filterKeys { it.startsWith("get_") }
        val setters = filterKeys { it.startsWith("set_") }

        // Extract the keys without the prefixes for matching
        val getterKeys = getters.keys.map { it.removePrefix("get_") }.toSet()
        val setterKeys = setters.keys.map { it.removePrefix("set_") }.toSet()

        // Combine all keys from getters and setters
        val allKeys = getterKeys.union(setterKeys)

        // Collect existing getters and setters from the property blueprints
        val existingGetters = propertyBluePrints.map { it.getter }.toSet()
        val existingSetters = propertyBluePrints.mapNotNull { it.setter }.toSet()

        // Iterate over all keys to find and add unused property overrides
        for (key in allKeys) {
            val getter = getters["get_$key"]
            val setter = setters["set_$key"]

            // Determine if the getter or setter is unused and should be overridden
            val isGetterUnused = getter != null && getter !in existingGetters && getter.isOverride
            val isSetterUnused = setter != null && setter !in existingSetters && setter.isOverride

            if (isGetterUnused || isSetterUnused) {
                // Check if the getter or setter matches a property in the superProperties
                val superProperty = superProperties.find { superProp ->
                    superProp.shouldBeGenerated() &&
                        (superProp.getter == "get_$key" || superProp.setter == "set_$key")
                }

                // Add the matching superProperty as an override
                superProperty?.let { girProperty ->
                    addProperty(
                        girProperty.copy(
                            getter = getter?.let { girProperty.getter },
                            setter = setter?.let { girProperty.setter },
                        ),
                    )
                }
            }
        }
    }

    /**
     * Add regular interfaces that this class implements.
     */
    private fun addInterfaces() {
        val parentInterfaceTypes = if (girNode.parent != null) {
            val namespace = checkNotNull(girNamespace.name)
            val parent = context.typeRegistry.get(namespace, girNode.parent)
            (parent.girNamedElement as GirClass).implements.map { implement ->
                context.typeRegistry.get(implement.namespace, implement.name)
            }
        } else {
            emptyList()
        }

        val implementsInterfaceTypes = girNode.implements.map { implement ->
            context.typeRegistry.get(implement.namespace, implement.name)
        }

        // exclude interfaces implemented by parent
        val classUniqueInterfaceTypes = implementsInterfaceTypes.filterNot { parentInterfaceTypes.contains(it) }

        classUniqueInterfaceTypes.forEach { type ->
            val interfacePointerName =
                "${namespacePrefix(type.namespace)}${type.className.simpleName}Pointer"
            val interfacePointerTypeName =
                context.resolveInterfaceObjectPointerTypeName(
                    namespace = type.namespace,
                    cType = checkNotNull(type.cType),
                )
            implementsInterfaces.add(
                ImplementsInterfaceBlueprint(
                    type.className,
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
        val allImplementingInterfaces = girNode.implements.flatMap {
            resolveInterfacesRecursively(girNamespace, it.name)
        }

        allImplementingInterfaces.forEach { pair ->
            val namespace = pair.first
            val iface = pair.second
            val kotlinInterfaceName = checkNotNull(iface.name).toPascalCase()
            val kotlinPackageName = namespaceBindingsPackageName(namespace)

            val typeName = ClassName(kotlinPackageName, kotlinInterfaceName)
            val objectPointerName = "${namespacePrefix(namespace)}${iface.name.toPascalCase()}Pointer"
            val objectPointerTypeName = context.resolveInterfaceObjectPointerTypeName(
                namespace = namespace,
                cType = checkNotNull(iface.cType),
            )
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
        val type = context.typeRegistry.get(namespace, name)
        type.girNamedElement.namespace to type.girNamedElement as GirInterface
    } catch (ex: UnresolvableTypeException) {
        null
    }
}
