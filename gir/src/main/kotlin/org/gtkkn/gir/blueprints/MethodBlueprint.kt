package org.gtkkn.gir.blueprints

data class MethodBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val returnTypeInfo: TypeNamePair
)
