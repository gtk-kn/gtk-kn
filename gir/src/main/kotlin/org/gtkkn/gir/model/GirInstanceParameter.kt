package org.gtkkn.gir.model

data class GirInstanceParameter(
    val name: String,
    val nullable: Boolean?,
    val allowNone: Boolean?,
    val direction: GirDirection?,
    val callerAllocates: Boolean?,
    val transferOwnership: GirTransferOwnership?,
    val type: GirType,
    val docs: GirDocElements,
)
