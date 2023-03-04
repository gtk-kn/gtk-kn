package org.gtkkn.gir.model

data class GirMethod(
    // Callable.attrs
    val name: String,
    val cIdentifier: String?,
    val shadowedBy: String?,
    val shadows: String?,
    val throws: Boolean,
    val movedTo: String?,
    val info: GirInfo,
    val parameters: GirParameters?,
    val glibSetProperty: String?,
    val glibGetProperty: String?,
    val returnValue: GirReturnValue?,
)
