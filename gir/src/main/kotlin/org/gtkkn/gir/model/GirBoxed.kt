package org.gtkkn.gir.model

data class GirBoxed(
    val info: GirInfo,
    val glibName: String,
    val cSymbolPrefix: String?,
    val glibTypeName: String?,
    val glibGetType: String?,
    val functions: List<GirFunction>,
)
