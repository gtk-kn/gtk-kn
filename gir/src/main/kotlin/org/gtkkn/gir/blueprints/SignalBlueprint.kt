package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName

data class SignalBlueprint(
    val kotlinConnectName: String,
    val signalName: String,
    val returnTypeInfo: TypeInfo,
    val parameters: List<ParameterBlueprint>,
    val handlerLambdaTypeName: LambdaTypeName,
    val kdoc: String?,
    val returnTypeKDoc: String?,
)
