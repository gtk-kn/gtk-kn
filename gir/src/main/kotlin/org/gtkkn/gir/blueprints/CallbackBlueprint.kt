package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName

data class CallbackBlueprint(
    val kotlinName: String,
    val returnTypeInfo: TypeInfo,
    val callbackLambdaTypeName: LambdaTypeName,
)
