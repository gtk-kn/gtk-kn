package org.gtkkn.gir.model

data class GirArrayType(
    val name: String?,
    val zeroTerminated: Boolean?,
    val fixedSize: Int?,
    val introspectable: Boolean?,
    val length: Int?,
    val cType: String?,
    val type: GirAnyType,
) : GirAnyType
