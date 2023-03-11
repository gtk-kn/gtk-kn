package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRepository
import org.gtkkn.gir.processor.ProcessorContext

class RepositoryBlueprintBuilder(
    context: ProcessorContext,
    private val girRepository: GirRepository
) : BlueprintBuilder<RepositoryBlueprint>(context) {

    private val namespace: GirNamespace get() = girRepository.namespace

    private val classBlueprints = mutableListOf<ClassBlueprint>()
    private val skippedObjects = mutableListOf<SkippedObject>()

    private fun addClass(girClass: GirClass) {
        when (val classResult = ClassBlueprintBuilder(context, namespace, girClass).build()) {
            is BlueprintResult.Ok -> classBlueprints.add(classResult.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(classResult.skippedObject)
        }
    }

    override fun blueprintObjectType(): String = "repository"
    override fun blueprintObjectName(): String = girRepository.namespace.name

    override fun build(): BlueprintResult<RepositoryBlueprint> {
        namespace.classes.forEach { clazz ->
            addClass(clazz)
        }

        return BlueprintResult.Ok(RepositoryBlueprint(girRepository.namespace.name, classBlueprints, skippedObjects))
    }
}
