package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class ConstructorBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girClass: GirClass,
    private val girConstructor: GirConstructor,
) : BlueprintBuilder<ConstructorBlueprint>(context) {

    private val parameters = mutableListOf<MethodParameterBlueprint>()

    override fun blueprintObjectType(): String = "constructor"

    override fun blueprintObjectName(): String = girConstructor.name

    override fun buildInternal(): ConstructorBlueprint {
        if (!girConstructor.parameters?.parameters.isNullOrEmpty()) {
            throw UnresolvableTypeException("Constructor with arguments is not supported")
        }  // else no parameters object means the default noArg constructor

        // return value
        val returnValue = girConstructor.returnValue
            ?: throw UnresolvableTypeException("Constructor has no return value")

        val returnTypeInfo = try {
            when (val type = returnValue.type) {
                is GirArrayType -> throw UnresolvableTypeException(
                    "Constructors with array return types are unsupported",
                )
                is GirType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            }
        } catch (ex: UnresolvableTypeException) {
            throw UnresolvableTypeException("Constructor return type ${returnValue.type} could not be resolved")
        }

        // method name
        val nativeMethodName = girConstructor.cIdentifier ?: throw UnresolvableTypeException(
            "Constructor ${girConstructor.name} for ${girClass.name} does not have cIdentifier",
        )

        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeMethodName)

        return ConstructorBlueprint(
            kotlinName = context.kotlinizeMethodName(girConstructor.name),
            nativeName = nativeMethodName,
            nativeMemberName = nativeMemberName,
            returnTypeInfo = returnTypeInfo,
            parameters = parameters,
        )
    }
}
