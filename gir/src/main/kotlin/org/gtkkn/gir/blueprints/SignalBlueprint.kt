package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName

data class SignalBlueprint(
    val kotlinConnectName: String,
    val signalName: String,
    override val returnTypeInfo: TypeInfo,
    override val parameters: List<ParameterBlueprint>,
    override val lambdaTypeName: LambdaTypeName,
    val version: String?,
    val kdoc: String?,
    val returnTypeKDoc: String?,
) : ClosureBlueprint {
    override val hasInstanceParameter: Boolean = true
}
