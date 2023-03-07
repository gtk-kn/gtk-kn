package org.gtkkn.gir.model

/**
 * Property, that is a variable or members with getter and setter functions.
 *
 * @property info info attributes of a Property (see [GirInfo]).
 * @property name name of the property.
 * @property writable true if the property is writeable and has a setter function.
 * @property readable true if the property is readable and has a getter function.
 * @property construct true if the property will be set upon construction.
 * @property constructOnly true if the property can only be set upon construction.
 * @property setter the setter function for this property.
 * @property getter the getter function for this property.
 * @property defaultValue the default value of the property, as a string; if missing, the default value is zero for
 *                        integer types, and null for pointer types.
 * @property transferOwnership define the transfer of ownership of the property element.
 * @property type a [GirType] that a property can contain.
 */
data class GirProperty(
    val info: GirInfo,
    val name: String,
    val writable: Boolean?,
    val readable: Boolean?,
    val construct: Boolean?,
    val constructOnly: Boolean?,
    val setter: String?,
    val getter: String?,
    val defaultValue: String?,
    val transferOwnership: GirTransferOwnership?,
    val type: GirAnyType,
)
