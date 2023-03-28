package org.gtkkn.gir.blueprints

data class PropertyBlueprint(
    val kotlinName: String,
    val typeInfo: TypeInfo,
    val getter: MethodBlueprint,
    val setter: MethodBlueprint?,
    val isOverride: Boolean,
    val isOpen: Boolean,
    val version: String?,
    val kdoc: String?,
)
