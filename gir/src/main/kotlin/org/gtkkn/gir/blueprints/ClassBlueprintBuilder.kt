package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class ClassBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girClass: GirClass
) : BlueprintBuilder<ClassBlueprint>(
    context,
) {
    private val methodBluePrints = mutableListOf<MethodBlueprint>()
    private val implementsInterfaces = mutableListOf<TypeName>()
    private var parentTypeName: TypeName? = null

    override fun blueprintObjectType(): String = "class"

    override fun blueprintObjectName(): String = girClass.name

    private fun addMethod(method: GirMethod) {
        when (val result = MethodBlueprintBuilder(context, girNamespace, method).build()) {
            is BlueprintResult.Ok -> methodBluePrints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): ClassBlueprint {
        if (girClass.parent != null) {
            try {
                parentTypeName = context.resolveClassTypeName(girNamespace, girClass.parent)
            } catch (ex: UnresolvableTypeException) {
                throw UnresolvableTypeException("Parent type ${girClass.parent} could not be resolved.")
            }
        }

        addInterfaces()

        girClass.methods.forEach { addMethod(it) }

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

        remainingInterfaces.forEach {
            implementsInterfaces.add(context.resolveInterfaceTypeName(it.first, it.second.name))
        }
    }
}
