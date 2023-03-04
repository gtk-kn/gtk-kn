package org.gtkkn.gir.model

data class GirReturnValue(
    val introspectable: Boolean?,
    val nullable: Boolean?,
    val closure: Int?,
    val scope: GirScope?,
    val destroy: Int?,
    val skip: Boolean?,
    val allowNone: Boolean?,
    val transferOwnership: GirTransferOwnership?,
    val type: GirAnyType,
    val docs: GirDocElements,
)
