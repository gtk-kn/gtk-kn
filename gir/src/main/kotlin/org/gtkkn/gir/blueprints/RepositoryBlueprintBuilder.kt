package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirCallback
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirEnum
import org.gtkkn.gir.model.GirFunction
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
    private val enumBlueprints = mutableListOf<EnumBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()
    private val callbackBlueprints = mutableListOf<CallbackBlueprint>()

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

    private fun addEnum(girEnum: GirEnum) {
        when (val result = EnumBlueprintBuilder(context, namespace, girEnum).build()) {
            is BlueprintResult.Ok -> enumBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addFunction(girFunction: GirFunction) {
        when (val result = FunctionBlueprintBuilder(context, namespace, girFunction).build()) {
            is BlueprintResult.Ok -> functionBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addCallback(girCallback: GirCallback) {
        when (val result = CallbackBlueprintBuilder(context, namespace, girCallback).build()) {
            is BlueprintResult.Ok -> callbackBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun blueprintObjectType(): String = "repository"
    override fun blueprintObjectName(): String = girRepository.namespace.name

    override fun build(): BlueprintResult<RepositoryBlueprint> {
        namespace.classes.forEach { clazz -> addClass(clazz) }
        namespace.interfaces.forEach { iface -> addInterface(iface) }
        namespace.enums.forEach { enum -> addEnum(enum) }
        namespace.functions.forEach { func -> addFunction(func) }
        namespace.callbacks.forEach { cb -> addCallback(cb) }

        girRepository.includes.forEach { include ->
            if (context.findRepositoryByName(include.name) == null) {
                skippedObjects.add(SkippedObject("include", include.name, "Missing dependant repository"))
            }
        }

        val kotlinModuleName = girRepository.namespace.name.lowercase()

        return BlueprintResult.Ok(
            RepositoryBlueprint(
                name = girRepository.namespace.name,
                kotlinModuleName = kotlinModuleName,
                classBlueprints = classBlueprints,
                interfaceBlueprints = interfaceBlueprints,
                enumBlueprints = enumBlueprints,
                functionBlueprints = functionBlueprints,
                callbackBlueprints = callbackBlueprints,
                skippedObjects = skippedObjects,
            ),
        )
    }
}
