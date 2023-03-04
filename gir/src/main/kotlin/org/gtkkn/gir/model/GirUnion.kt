package org.gtkkn.gir.model

data class GirUnion(
    val info: GirInfo,
    val name: String?,
    val cType: String?,
    val cSymbolPrefix: String?,
    val glibTypeName: String?,
    val glibGetType: String?,
    val copyFunction: String?,
    val freeFunction: String?,
    val fields: List<GirField>,
    val constructors: List<GirConstructor>,
    val methods: List<GirMethod>,
    val functions: List<GirFunction>,
    val records: List<GirRecord>,
)
