package org.gtkkn.gir.model

data class GirSignal(
    val info: GirInfo,
    val name: String,
    val detailed: Boolean?,
    val `when`: GirSignalWhen?,
    val action: Boolean?,
    val noHooks: Boolean?,
    val noRecurse: Boolean?,
    val emitter: String?,
    val parameters: GirParameters?,
    val returnValue: GirReturnValue?,
)
