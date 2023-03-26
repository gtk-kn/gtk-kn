package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName

data class CallbackBlueprint(
    val kotlinName: String,
    override val returnTypeInfo: TypeInfo,
    override val parameters: List<ParameterBlueprint>,
    override val throws: Boolean = false, // TODO throws for callbacks?
    override val lambdaTypeName: LambdaTypeName,
    val kdoc: String?,
    val returnTypeKDoc: String?,
) : ClosureBlueprint {
    override val hasInstanceParameter: Boolean = false
}
