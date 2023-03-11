package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class MethodBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girClass: GirClass,
    private val girMethod: GirMethod
) : BlueprintBuilder<MethodBlueprint>(context) {
    override fun blueprintObjectType(): String = "method"
    override fun blueprintObjectName(): String = girMethod.name

    override fun build(): BlueprintResult<MethodBlueprint> {
        val kotlinName = context.kotlinizeMethodName(girMethod.name)

        if (girMethod.parameters == null) {
            return skip("Method has no parameters object")
        }

        if (girMethod.parameters.instanceParameter == null) {
            return skip("Method has no instance parameter")
        }

        if (girMethod.parameters.parameters.isNotEmpty()) {
            return skip("Method with arguments are not supported")
        }

        val returnValue = girMethod.returnValue ?: return skip("Method has no return value")

        val returnTypeInfo = try {
            when (val type = returnValue.type) {
                is GirArrayType -> return skip("Methods with array return types are unsupported")
                is GirType -> context.resolveTypeNamePair(girNamespace, type)
            }
        } catch (ex: UnresolvableTypeException) {
            return skip("Method return type ${returnValue.type} could not be resolved")
        }

        val nativeMethodName = girMethod.cIdentifier
            ?: return skip("native method ${girMethod.name} does not have cIdentifier")

        return ok(
            MethodBlueprint(
                kotlinName = kotlinName,
                nativeName = nativeMethodName,
                returnTypeInfo = returnTypeInfo,
            ),
        )
    }
}
