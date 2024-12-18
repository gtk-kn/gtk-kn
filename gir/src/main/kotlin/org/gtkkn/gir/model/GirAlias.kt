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
 * Type's name substitution, representing a typedef in C.
 *
 * @property info Common attributes for GIR elements.
 * @property name The new name or typedef'd name.
 * @property cType The corresponding C type's name.
 * @property doc Documentation elements.
 * @property annotations Annotations.
 * @property type The type represented by the alias.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirAlias(
    val info: GirInfo,
    override val name: String,
    override val cType: String,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val type: GirAnyType,
) : GirNode, GirNamedElement {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        type.initialize(this, namespace)
    }
}
