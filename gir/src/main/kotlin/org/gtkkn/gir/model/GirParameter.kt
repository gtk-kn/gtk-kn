package org.gtkkn.gir.model

data class GirParameter(
    val name: String,
    val nullable: Boolean?,
    val allowNone: Boolean?,
    val introspectable: Boolean?,
    val closure: Int?,
    val destroy: Int?,
    val scope: GirScope?,
    val direction: GirDirection?,
    val callerAllocates: Boolean?,
    val optional: Boolean?,
    val skip: Boolean?,
    val transferOwnership: GirTransferOwnership?,
    val docs: GirDocElements,
    val type: GirAnyTypeOrVarargs,
)
