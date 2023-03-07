package org.gtkkn.gir.model

/**
 * Element defining a enumeration type similar to enum in C/C++.
 *
 * @property info attributes of an enumeration (see [GirInfo]).
 * @property name name of the enumeration.
 * @property cType corresponding C type.
 * @property glibTypeName type name compatible with the GObject type system.
 * @property glibGetType function to get the GObject compatible type of the enumeration.
 * @property glibErrorDomain error domain of this enumeration in a stringified form.
 * @property members a list of [GirMember] that an enumeration can contain.
 * @property functions a list of [GirFunction] that an enumeration can contain.
 */
data class GirEnum(
    val info: GirInfo,
    val name: String,
    val cType: String,
    val glibTypeName: String?,
    val glibGetType: String?,
    val glibErrorDomain: String?,
    val members: List<GirMember>,
    val functions: List<GirFunction>,
)
