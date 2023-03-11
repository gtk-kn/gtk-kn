package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.ProcessorContext

class ClassBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girClass: GirClass
) : BlueprintBuilder<ClassBlueprint>(
    context,
) {

    private val skippedObjects = mutableListOf<SkippedObject>()

    private val methodBluePrints = mutableListOf<MethodBlueprint>()

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
            return skip("Unsupported class with parents")
        }

        if (girClass.implements.isNotEmpty()) {
            return skip("Unsupported class with interfaces")
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
                skippedObjects = skippedObjects
            ),
        )
    }
}
