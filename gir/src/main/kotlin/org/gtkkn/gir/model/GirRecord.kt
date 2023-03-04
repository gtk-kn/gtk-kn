package org.gtkkn.gir.model

data class GirRecord(
    val info: GirInfo,
    val name: String,
    val cType: String?,
    val disguised: Boolean?,
    val opaque: Boolean?,
    val pointer: Boolean?,
    val glibTypeName: String?,
    val glibGetType: String?,
    val cSymbolPrefix: String?,
    val foreign: Boolean?,
    val glibIsGtypeStructFor: String?,
    val copyFunction: String?,
    val freeFunction: String?,
    val fields: List<GirField>,
    val functions: List<GirFunction>,
    val unions: List<GirUnion>,
    val methods: List<GirMethod>,
    val constructors: List<GirConstructor>,
)
