package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
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
    private val implementsInterfaces = mutableListOf<ImplementsInterfaceBlueprint>()
    private var parentTypeName: TypeName? = null

    override fun blueprintObjectType(): String = "class"

    override fun blueprintObjectName(): String = girClass.name

    private fun addMethod(method: GirMethod) {
        when (val result = MethodBlueprintBuilder(context, girNamespace, method).build()) {
            is BlueprintResult.Ok -> methodBluePrints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addConstructor(constructor: GirConstructor) {
        when (val result = ConstructorBlueprintBuilder(context, girNamespace, girClass, constructor).build()) {
            is BlueprintResult.Ok -> constructorBlueprints.add(result.blueprint)
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

        girClass.methods.forEach { addMethod(it) }
        girClass.constructors.forEach { addConstructor(it) }

        val kotlinClassName = context.kotlinizeClassName(girClass.name)
        val kotlinPackageName = context.kotlinizePackageName(girNamespace.name)

        val objectPointerName = if (girClass.parent != null) {
            "${context.namespacePrefix(girNamespace)}${girClass.name}Pointer"
        } else {
            "gPointer"
        }
        val objectPointerTypeName = context.resolveClassObjectPointerTypeName(girNamespace, girClass)

        return ClassBlueprint(
            kotlinName = kotlinClassName,
            nativeName = girClass.name,
            typeName = ClassName(kotlinPackageName, kotlinClassName),
            methods = methodBluePrints,
            constructors = constructorBlueprints,
            skippedObjects = skippedObjects,
            implementsInterfaces = implementsInterfaces,
            parentTypeName = parentTypeName,
            objectPointerName = objectPointerName,
            objectPointerTypeName = objectPointerTypeName,
        )
    }

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

        // exclude interfaces that are parents of other interfaces in the list
        val remainingInterfaces = classUniqueInterfaces.filterNot { pair ->
            val simpleName = pair.second.name
            val fullyQualifiedName = "${pair.first.name}.${pair.second.name}"
            val allParentNames = implementsInterfacePairs.flatMap { ifacePair ->
                ifacePair.second.prerequisites.map { iface -> iface.name }
            }
            allParentNames.contains(simpleName) || allParentNames.contains(fullyQualifiedName)
        }

        remainingInterfaces.forEach { ifacePair ->
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
}
