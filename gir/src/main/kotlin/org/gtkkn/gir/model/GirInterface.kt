package org.gtkkn.gir.model

data class GirInterface(
    val info: GirInfo,
    val name: String,
    val glibTypeName: String,
    val glibGetType: String,
    val cSymbolPrefix: String,
    val cType: String?,
    val glibTypeStruct: String?,
    val prerequisites: List<GirPrerequisite>,
    val implements: List<GirImplements>,
    val functions: List<GirFunction>,
    val constructor: GirConstructor?,
    val methods: List<GirMethod>,
    val virtualMethods: List<GirVirtualMethod>,
    val fields: List<GirField>,
    val properties: List<GirProperty>,
    val signals: List<GirSignal>,
    val constants: List<GirConstant>,
    val callbacks: List<GirCallback>,
)
