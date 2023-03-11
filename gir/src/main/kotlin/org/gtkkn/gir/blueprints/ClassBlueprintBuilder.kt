package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.processor.ProcessorContext

class ClassBlueprintBuilder(context: ProcessorContext, val girClass: GirClass) : BlueprintBuilder<ClassBlueprint>(
    context,
) {
    override fun blueprintObjectType(): String = "class"
    override fun blueprintObjectName(): String = girClass.name

    override fun build(): BlueprintResult<ClassBlueprint> = skip("Unsupported class")
}
