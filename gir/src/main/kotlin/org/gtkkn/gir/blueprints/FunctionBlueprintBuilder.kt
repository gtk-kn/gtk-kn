package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.ShadowedFunctionException
import org.gtkkn.gir.processor.UnresolvableTypeException

class FunctionBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girFunction: GirFunction,
) : CallableBlueprintBuilder<FunctionBlueprint>(context, girNamespace) {

    override fun blueprintObjectType(): String = "function"
    override fun blueprintObjectName(): String = girFunction.name

    override fun buildInternal(): FunctionBlueprint {
        if (girFunction.info.introspectable == false) {
            throw NotIntrospectableException(girFunction.cIdentifier ?: girFunction.name)
        }

        if (girFunction.shadowedBy != null) {
            throw ShadowedFunctionException(girFunction.cIdentifier ?: girFunction.name, girFunction.shadowedBy)
        }

        if (girFunction.cIdentifier == null) {
            throw UnresolvableTypeException("Function ${girFunction.name} does not have cIdentifier")
        }

        context.checkIgnoredFunction(girFunction.cIdentifier)

        if (girFunction.throws) {
            throw UnresolvableTypeException("Functions that throw are not supported")
        }

        girFunction.parameters?.let { addParameters(it) }

        val returnValue = girFunction.returnValue ?: throw UnresolvableTypeException("Method has no return value")

        val returnTypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            is GirType -> {
                try {
                    context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
                } catch (ex: BlueprintException) {
                    throw UnresolvableTypeException("Return type ${type.name} is unsupported")
                }
            }
        }

        val nativeName = girFunction.cIdentifier
        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeName)
        val kotlinName = context.kotlinizeMethodName(girFunction.name)

        return FunctionBlueprint(
            kotlinName = kotlinName,
            nativeName = nativeName,
            nativeMemberName = nativeMemberName,
            parameters = parameterBlueprints,
            returnTypeInfo = returnTypeInfo,
            throws = girFunction.throws,
            exceptionResolvingFunctionMember = exceptionResolvingFunction(),
            version = girFunction.info.version,
            kdoc = context.processKdoc(girFunction.info.docs.doc?.text),
            returnTypeKDoc = context.processKdoc(girFunction.returnValue.docs.doc?.text),
        )
    }
}
