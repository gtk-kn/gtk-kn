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
 * A simple type of data (as opposed to an array type).
 *
 * @property name Name of the type.
 * @property cType C representation of the type.
 * @property introspectable Indicates if the type is introspectable.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the type.
 * @property types Nested types contained within this type.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirType(
    val name: String? = null,
    val cType: String? = null,
    val introspectable: Boolean? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val types: List<GirAnyType> = emptyList(),
) : GirAnyType {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        types.forEach { it.initialize(this, namespace) }
    }
}
