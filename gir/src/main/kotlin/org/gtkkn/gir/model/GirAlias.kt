package org.gtkkn.gir.model

/**
 * Type's name substitution, representing a typedef in C.
 *
 * @property name the new name or typedef'd name.
 * @property cType the corresponding C type's name.
 * @property type a [GirType] that an alias can contain.
 * @property info a [GirInfo] that an alias can contain.
 */
data class GirAlias(
    val name: String,
    val cType: String,
    val type: GirType,
    val info: GirInfo,
)
