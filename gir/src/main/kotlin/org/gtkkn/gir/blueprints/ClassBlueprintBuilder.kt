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

    private val skippedObjects = mutableListOf<SkippedObject>()

    private val methodBluePrints = mutableListOf<MethodBlueprint>()
    private val implementsInterfaces = mutableListOf<TypeName>()
    private var parentTypeName: TypeName? = null

    override fun blueprintObjectType(): String = "class"
    override fun blueprintObjectName(): String = girClass.name

    private fun addMethod(method: GirMethod) {
        when (val result = MethodBlueprintBuilder(context, method).build()) {
            is BlueprintResult.Ok -> methodBluePrints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun build(): BlueprintResult<ClassBlueprint> {
        if (girClass.parent != null) {
            try {
                parentTypeName = context.resolveClassTypeName(girNamespace, girClass.parent)
            } catch (ex: UnresolvableTypeException) {
                return skip("Parent type ${girClass.parent} could not be resolved.")
            }
        }

        // process interfaces
        girClass.implements.forEach { iface ->
            // TODO filter because implements property contains all interfaces in the hierarchy
            try {
                val ifaceTypeName = context.resolveInterfaceTypeName(girNamespace, iface.name)
                implementsInterfaces.add(ifaceTypeName)
            } catch (ex: UnresolvableTypeException) {
                return skip("Interface type ${iface.name} could not be resolved.")
            }
        }

        girClass.methods.forEach { addMethod(it) }

        val kotlinClassName = context.kotlinizeClassName(girClass.name)
        val kotlinPackageName = context.kotlinizePackageName(girNamespace.name)

        return ok(
            ClassBlueprint(
                kotlinName = kotlinClassName,
                nativeName = girClass.name,
                typeName = ClassName(kotlinPackageName, kotlinClassName),
                methods = methodBluePrints,
                skippedObjects = skippedObjects,
                implementsInterfaces = implementsInterfaces,
                parentTypeName = parentTypeName
            ),
        )
    }
}
