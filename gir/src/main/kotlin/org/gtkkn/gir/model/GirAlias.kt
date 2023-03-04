package org.gtkkn.gir.model

data class GirAlias(
    val name: String,
    val cType: String,
    val type: GirType,
    val info: GirInfo,
)
