package org.gtkkn.gir.model

data class GirMember(
    val info: GirInfo,
    val name: String,
    val value: String,
    val cIdentifier: String,
    val glibNick: String?,
    val glibName: String?
)
