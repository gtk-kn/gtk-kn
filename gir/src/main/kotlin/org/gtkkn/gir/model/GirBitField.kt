package org.gtkkn.gir.model

/**
 * Element defining a bit field (as in C).
 *
 * @property info attributes of a bit field (see [GirInfo]).
 * @property name name of the bit field.
 * @property cType corresponding C type.
 * @property glibTypeName type name compatible with the GObject type system.
 * @property glibGetType function to get the GObject compatible type of the bit field.
 * @property members a list of [GirMember] that a bit field can contain.
 * @property functions a list of [GirFunction] that a bit field can contain.
 */
data class GirBitField(
    val info: GirInfo,
    val name: String,
    val cType: String,
    val glibTypeName: String?,
    val glibGetType: String?,
    val members: List<GirMember>,
    val functions: List<GirFunction>,
)
