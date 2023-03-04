package org.gtkkn.gir.model

data class GirCallback(
    val info: GirInfo,
    val name: String,
    val cType: String?,
    val throws: Boolean?,
    val parameters: GirParameters?,
    val returnValue: GirReturnValue?,
) : GirCallbackOrAnyType
