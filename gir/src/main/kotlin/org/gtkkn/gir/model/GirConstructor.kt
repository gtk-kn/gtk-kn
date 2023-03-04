package org.gtkkn.gir.model

data class GirConstructor(
    val info: GirInfo,
    // Callable.attrs
    val name: String,
    val cIdentifier: String?,
    val shadowedBy: String?,
    val shadows: String?,
    val throws: Boolean?,
    val movedTo: String?,
    val parameters: GirParameters?,
    val returnValue: GirReturnValue?,
)
