package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MemberName

data class SignalBlueprint(
    val kotlinConnectName: String,
    val signalName: String,
    override val returnTypeInfo: TypeInfo,
    override val parameters: List<ParameterBlueprint>,
    override val throws: Boolean,
    override val exceptionResolvingFunctionMember: MemberName,
    override val lambdaTypeName: LambdaTypeName,
    val version: String?,
    val kdoc: String?,
    val returnTypeKDoc: String?,
) : ClosureBlueprint {
    override val hasInstanceParameter: Boolean = true
}
