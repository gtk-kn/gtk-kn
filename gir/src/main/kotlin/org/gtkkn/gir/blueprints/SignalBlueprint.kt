package org.gtkkn.gir.blueprints

data class SignalBlueprint(
    val kotlinConnectName: String,
    val signalName: String,
    val returnTypeInfo: TypeInfo,
)
