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
 * Return value of a callable.
 *
 * @constructor Creates a GirReturnValue.
 * @param nullable Indicates if the return value can be null.
 * @param allowNone Deprecated. Indicates if the return value allows a `None` value (replaced by nullable).
 * @property introspectable Indicates if the return value is introspectable.
 * @property closure Indicates that this value is user_data for a callback.
 * @property scope Specifies the lifetime of the callback associated with the return value.
 * @property destroy Indicates that this value is destroy_data for a callback.
 * @property skip Indicates if the return value should be omitted from introspected output.
 * @property transferOwnership Specifies ownership transfer for the return value.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the return value.
 * @property type The type of the return value.
 * @property gtkKnReinterpret Whether the return value requires a reinterpret().
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirReturnValue(
    private val nullable: Boolean? = null,
    private val allowNone: Boolean? = null,
    val introspectable: Boolean? = null,
    val closure: Int? = null,
    val scope: String? = null,
    val destroy: Int? = null,
    val skip: Boolean? = null,
    val transferOwnership: GirTransferOwnership? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val type: GirAnyType,
    val gtkKnReinterpret: Boolean? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    fun isNullable(): Boolean = nullable == true || allowNone == true
    override fun initializeChildren(namespace: GirNamespace) {
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        type.initialize(this, namespace)
    }
}
