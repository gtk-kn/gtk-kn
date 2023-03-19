package org.gtkkn.gir.model

/**
 * Element defining a member of a bit field or an enumeration.
 *
 * @property info attributes of a member (see [GirInfo]).
 * @property name name of the member.
 * @property value value of the member.
 * @property cIdentifier corresponding C type of the member.
 * @property glibNick short nickname of the member (from GEnumValue/GFlagsValue).
 * @property glibName name of the member (from GEnumValue/GFlagsValue).
 */
data class GirMember(
    val info: GirInfo,
    val name: String,
    val value: String,
    val cIdentifier: String,
    val glibNick: String?,
    val glibName: String?,
)
