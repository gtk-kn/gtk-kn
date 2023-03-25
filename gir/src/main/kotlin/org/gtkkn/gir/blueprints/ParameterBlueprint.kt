package org.gtkkn.gir.blueprints

data class ParameterBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val typeInfo: TypeInfo,
    val kdoc: String?,
)
