package org.gtkkn.gir.model

data class GirField(
    val info: GirInfo,
    val name: String,
    val writable: Boolean?,
    val readable: Boolean?,
    val private: Boolean?,
    val bits: Int?,
    val type: GirCallbackOrAnyType,
)
