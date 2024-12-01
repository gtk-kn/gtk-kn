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
 * Instance parameter, a parameter of a C function representing the instance of an existing object.
 *
 * @property name Name of the instance parameter.
 * @property nullable Indicates if the parameter can have a null value.
 * @property allowNone Deprecated. Indicates if the parameter allows a `None` value (replaced by nullable).
 * @property direction Indicates the direction of the parameter ("in", "out", or "inout").
 * @property callerAllocates Indicates if the caller should allocate the parameter before calling the callable.
 * @property transferOwnership Specifies ownership transfer for the instance parameter.
 * @property doc Documentation elements.
 * @property type The type of the instance parameter.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirInstanceParameter(
    val name: String,
    val nullable: Boolean? = null,
    val allowNone: Boolean? = null,
    val direction: GirDirection? = null,
    val callerAllocates: Boolean? = null,
    val transferOwnership: GirTransferOwnership? = null,
    val doc: GirDoc? = null,
    val type: GirType,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        doc?.initialize(this, namespace)
        type.initialize(this, namespace)
    }
}
