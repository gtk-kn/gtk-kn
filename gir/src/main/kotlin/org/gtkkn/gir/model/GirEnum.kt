package org.gtkkn.gir.model

data class GirEnum(
    val info: GirInfo,
    val name: String,
    val cType: String,
    val glibTypeName: String?,
    val glibGetType: String?,
    val glibErrorDomain: String?,
    val members: List<GirMember>,
    val functions: List<GirFunction>,
)
