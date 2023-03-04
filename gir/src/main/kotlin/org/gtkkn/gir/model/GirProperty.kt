package org.gtkkn.gir.model

data class GirProperty(
    val info: GirInfo,
    val name: String,
    val writable: Boolean?,
    val readable: Boolean?,
    val construct: Boolean?,
    val constructOnly: Boolean?,
    val setter: String?,
    val getter: String?,
    val defaultValue: String?,
    val transferOwnership: GirTransferOwnership?,
    val type: GirAnyType,
)
