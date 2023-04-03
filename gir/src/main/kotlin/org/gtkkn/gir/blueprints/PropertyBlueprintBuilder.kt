package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.UNIT
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirProperty
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class PropertyBlueprintBuilder(
    context: ProcessorContext,
    private val girProperty: GirProperty,
    private val methodsMap: HashMap<String, MethodBlueprint>,
    private val superClasses: List<GirClass> = emptyList(),
    private val superInterfaces: List<GirInterface> = emptyList(),
    private val isOpen: Boolean = false,
) : BlueprintBuilder<PropertyBlueprint>(context) {

    override fun blueprintObjectType(): String = "method"

    override fun blueprintObjectName(): String = girProperty.name

    override fun buildInternal(): PropertyBlueprint {
        val getter = methodsMap[girProperty.getter]
        val setter = methodsMap[girProperty.setter]

        checkSkippedProperty(getter, setter)

        val kotlinName = context.kotlinizeMethodName(girProperty.name)

        // check for overrides
        val superProperties = superClasses.flatMap { it.properties } + superInterfaces.flatMap { it.properties }
        val nameMatchingSuperProperties = superProperties
            .filterNot { it.info.introspectable == false }
            .filter { it.name == girProperty.name }

        val isOverride = nameMatchingSuperProperties.isNotEmpty()
        if (isOverride) {
            logger.warn("Detected property override: ${girProperty.name}")
        }

        return PropertyBlueprint(
            kotlinName = kotlinName,
            typeInfo = checkNotNull(getter).returnTypeInfo,
            getter = getter,
            setter = setter,
            isOverride = isOverride,
            isOpen = isOpen,
            version = girProperty.info.version,
            kdoc = context.processKdoc(girProperty.info.docs.doc?.text),
        )
    }

    private fun checkSkippedProperty(getter: MethodBlueprint?, setter: MethodBlueprint?) {
        if (girProperty.info.introspectable == false) {
            throw NotIntrospectableException(girProperty.name)
        }

        if (getter == null && setter == null) {
            throw UnresolvableTypeException("Property has no getter nor setter")
        }

        if (getter == null) {
            throw UnresolvableTypeException("Property has no getter")
        }

        if (setter != null && setter.parameters.first().typeInfo != getter.returnTypeInfo) {
            throw UnresolvableTypeException("Property TypeInfo of getter and setter do not match")
        }

        if (setter != null && setter.returnTypeInfo.kotlinTypeName != UNIT) {
            throw UnresolvableTypeException("Property setter does not return Unit")
        }

        if (getter.throws) {
            throw UnresolvableTypeException("Property getter throws")
        }

        if (setter?.throws == true) {
            throw UnresolvableTypeException("Property setter throws")
        }
    }
}
