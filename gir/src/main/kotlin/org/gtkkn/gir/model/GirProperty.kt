/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

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
