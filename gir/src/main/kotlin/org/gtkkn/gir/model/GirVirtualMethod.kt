package org.gtkkn.gir.model

data class GirVirtualMethod(
    // Callable.attrs
    val name: String,
    val cIdentifier: String?,
    val shadowedBy: String?,
    val shadows: String?,
    val throws: Boolean,
    val movedTo: String?,
    val info: GirInfo,
    val parameters: GirParameters?,
    val invoker: String?,
    val returnValue: GirReturnValue?,
)
