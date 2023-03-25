package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRecord
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class RecordBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girRecord: GirRecord,
) : BlueprintBuilder<RecordBlueprint>(context) {

    private val constructorBlueprints = mutableListOf<ConstructorBlueprint>()
    private val methodBluePrints = mutableListOf<MethodBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()

    override fun blueprintObjectType(): String = "record"

    override fun blueprintObjectName(): String = girRecord.name

    private fun addMethod(method: GirMethod) {
        when (val result =
            MethodBlueprintBuilder(
                context,
                girNamespace,
                method,
            ).build()) {
            is BlueprintResult.Ok -> methodBluePrints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addConstructor(constructor: GirConstructor) {
        when (val result = ConstructorBlueprintBuilder(context, girNamespace, constructor).build()) {
            is BlueprintResult.Ok -> constructorBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    private fun addFunction(function: GirFunction) {
        when (val result = FunctionBlueprintBuilder(context, girNamespace, function).build()) {
            is BlueprintResult.Ok -> functionBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): RecordBlueprint {
        if (girRecord.info.introspectable == false) throw NotIntrospectableException(girRecord.name)

        girRecord.cType?.let { context.checkIgnoredType(it) }

        if (girRecord.foreign == true) throw UnresolvableTypeException("foreign records are ignored")
        if (girRecord.foreign == true) throw UnresolvableTypeException("foreign records are ignored")
        if (girRecord.glibIsGtypeStructFor != null && girRecord.glibIsGtypeStructFor != "Object") throw UnresolvableTypeException("glib type struct are ignored")
        if (girRecord.disguised == true) throw UnresolvableTypeException("Disguised records are ignored")

        girRecord.methods.forEach { addMethod(it) }
        girRecord.constructors.forEach { addConstructor(it) }
        girRecord.functions.forEach { addFunction(it) }

        val objectPointerName = "${context.namespacePrefix(girNamespace)}${girRecord.name}Pointer"
        val objectPointerTypeName = context.resolveRecordObjectPointerTypeName(girNamespace, girRecord)

        val kotlinName = context.kotlinizeClassName(girRecord.name) // todo Record name
        return RecordBlueprint(
            kotlinName = kotlinName,
            kotlinTypeName = ClassName(context.namespaceBindingsPackageName(girNamespace), kotlinName),
            constructors = constructorBlueprints,
            functions = functionBlueprints,
            methods = methodBluePrints,
            objectPointerName = objectPointerName,
            objectPointerTypeName = objectPointerTypeName,
        )
    }

}
