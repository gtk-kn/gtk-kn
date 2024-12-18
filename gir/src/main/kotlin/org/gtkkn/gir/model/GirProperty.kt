/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.model

/**
 * Element defining a property, that is, a variable or member with getter and setter functions.
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the property.
 * @property writable Binary attribute, true if the property is writable.
 * @property readable Binary attribute, true if the property is readable.
 * @property construct Binary attribute, true if the property will be set upon construction.
 * @property constructOnly Binary attribute, true if the property can only be set upon construction.
 * @property setter The setter function for this property.
 * @property getter The getter function for this property.
 * @property defaultValue The default value of the property, as a string.
 * @property transferOwnership Transfer of ownership.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the property.
 * @property type The type of the property.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirProperty(
    val info: GirInfo,
    val name: String,
    val writable: Boolean? = null,
    val readable: Boolean? = null,
    val construct: Boolean? = null,
    val constructOnly: Boolean? = null,
    val setter: String? = null,
    val getter: String? = null,
    val defaultValue: String? = null,
    val transferOwnership: GirTransferOwnership? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val type: GirAnyType,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        type.initialize(this, namespace)
    }
}
