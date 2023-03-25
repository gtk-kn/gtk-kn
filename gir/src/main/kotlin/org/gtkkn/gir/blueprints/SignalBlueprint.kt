package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName

data class SignalBlueprint(
    val kotlinConnectName: String,
    val signalName: String,
    override val returnTypeInfo: TypeInfo,
    override val parameters: List<ParameterBlueprint>,
    val handlerLambdaTypeName: LambdaTypeName,
    val version: String?,
    val kdoc: String?,
    val returnTypeKDoc: String?,
) : CallableBlueprint
