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
 * Element defining a method from a class.
 *
 * @property callable Attributes of a callable.
 * @property glibSetProperty The GObject property set by this method.
 * @property glibGetProperty The GObject property retrieved by this method.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the method.
 * @property parameters Parameters for the method.
 * @property returnValue Return value of the method.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirMethod(
    val callable: GirCallable,
    val glibSetProperty: String? = null,
    val glibGetProperty: String? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val parameters: GirParameters? = null,
    val returnValue: GirReturnValue? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        callable.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        parameters?.initialize(this, namespace)
        returnValue?.initialize(this, namespace)
    }
}
