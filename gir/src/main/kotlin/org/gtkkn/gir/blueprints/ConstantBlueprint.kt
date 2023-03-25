package org.gtkkn.gir.blueprints

data class ConstantBlueprint(
    val kotlinName: String,
    val typeInfo: TypeInfo,
    val constantValue: String,
    val version: String?,
    val kdoc: String?,
)
