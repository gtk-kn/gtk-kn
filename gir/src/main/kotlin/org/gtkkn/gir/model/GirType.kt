package org.gtkkn.gir.model

data class GirType(
    val name: String?,
    val cType: String?,
    val introspectable: Boolean?,
    val types: List<GirAnyType>,
    val docs: GirDocElements,
) : GirAnyType
