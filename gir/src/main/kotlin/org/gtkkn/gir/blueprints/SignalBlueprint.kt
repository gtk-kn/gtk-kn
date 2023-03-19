package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName

data class SignalBlueprint(
    val kotlinConnectName: String,
    val signalName: String,
    val returnTypeInfo: TypeInfo,
    val parameters: List<MethodParameterBlueprint>,
    val handlerLambdaTypeName: LambdaTypeName,
)
