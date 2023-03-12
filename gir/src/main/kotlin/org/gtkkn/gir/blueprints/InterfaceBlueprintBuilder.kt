package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.ProcessorContext

class InterfaceBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girInterface: GirInterface,
) : BlueprintBuilder<InterfaceBlueprint>(context) {
    private val skippedObjects = mutableListOf<SkippedObject>()

    private val methodBluePrints = mutableListOf<MethodBlueprint>()

    override fun blueprintObjectType(): String = "interface"
    override fun blueprintObjectName(): String = girInterface.name

    private fun addMethod(method: GirMethod) {
        when (val result = MethodBlueprintBuilder(context, girNamespace, method).build()) {
            is BlueprintResult.Ok -> methodBluePrints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun build(): BlueprintResult<InterfaceBlueprint> {
        try {
            girInterface.methods.forEach { addMethod(it) }

            val kotlinInterfaceName = context.kotlinizeClassName(girInterface.name)
            val kotlinPackageName = context.kotlinizePackageName(girNamespace.name)

            val objectPointerName = "${context.namespacePrefix(girNamespace)}${girInterface.name}Pointer"
            val objectPointerTypeName = context.resolveInterfaceObjectPointerTypeName(girNamespace, girInterface)

            return ok(
                InterfaceBlueprint(
                    kotlinName = kotlinInterfaceName,
                    nativeName = girInterface.name,
                    typeName = ClassName(kotlinPackageName, kotlinInterfaceName),
                    methods = methodBluePrints,
                    skippedObjects = skippedObjects,
                    objectPointerName = objectPointerName,
                    objectPointerTypeName = objectPointerTypeName,
                ),
            )
        } catch (ex: Exception) {
            return skip("Error building blueprint: ${ex.message}")
        }
    }
}
