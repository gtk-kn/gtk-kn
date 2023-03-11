package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRepository
import org.gtkkn.gir.processor.ProcessorContext

class RepositoryBlueprintBuilder(
    context: ProcessorContext,
    private val girRepository: GirRepository
) : BlueprintBuilder<RepositoryBlueprint>(context) {

    private val namespace: GirNamespace get() = girRepository.namespace

    private val classBlueprints = mutableListOf<ClassBlueprint>()
    private val interfaceBlueprints = mutableListOf<InterfaceBlueprint>()
    private val skippedObjects = mutableListOf<SkippedObject>()

    private fun addClass(girClass: GirClass) {
        when (val result = ClassBlueprintBuilder(context, namespace, girClass).build()) {
            is BlueprintResult.Ok -> classBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addInterface(girInterface: GirInterface) {
        when (val result = InterfaceBlueprintBuilder(context, namespace, girInterface).build()) {
            is BlueprintResult.Ok -> interfaceBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun blueprintObjectType(): String = "repository"
    override fun blueprintObjectName(): String = girRepository.namespace.name

    override fun build(): BlueprintResult<RepositoryBlueprint> {
        namespace.classes.forEach { clazz -> addClass(clazz) }
        namespace.interfaces.forEach { iface -> addInterface(iface) }

        val kotlinModuleName = girRepository.namespace.name.lowercase()

        return BlueprintResult.Ok(
            RepositoryBlueprint(
                name = girRepository.namespace.name,
                kotlinModuleName = kotlinModuleName,
                classBlueprints = classBlueprints,
                interfaceBlueprints = interfaceBlueprints,
                skippedObjects = skippedObjects,
            ),
        )
    }
}
