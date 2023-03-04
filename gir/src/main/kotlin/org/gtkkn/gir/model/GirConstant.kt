package org.gtkkn.gir.model

data class GirConstant(
    val info: GirInfo,
    val name: String,
    val value: String,
    val cType: String?,
    val cIdentifier: String?,
    val type: GirAnyType?
)
