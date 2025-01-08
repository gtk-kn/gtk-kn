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
 * An individual parameter of a callable.
 *
 * @constructor Creates a GirParameter.
 * @param nullable Indicates if the parameter can have a null value.
 * @param allowNone Deprecated. Indicates if the parameter allows a `None` value (replaced by nullable).
 * @param optional Indicates if the parameter is optional.
 * @property name Name of the parameter.
 * @property introspectable Indicates if the parameter is introspectable.
 * @property closure Indicates that this parameter is user_data for a callback.
 * @property destroy Indicates that this parameter is destroy_data for a callback.
 * @property scope Specifies the lifetime of the callback.
 * @property direction Indicates the direction of the parameter ("in", "out", or "inout").
 * @property callerAllocates Indicates if the caller should allocate the parameter before calling the callable.
 * @property skip Indicates if the parameter should be omitted from introspected output.
 * @property transferOwnership Specifies ownership transfer for the parameter.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the parameter.
 * @property type The type of the parameter.
 * @property gtkKnEnumRawValue Whether the enum should use raw value or not.
 * @property gtkKnReinterpret Whether the parameter requires a reinterpret().
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirParameter(
    private val nullable: Boolean? = null,
    private val allowNone: Boolean? = null,
    private val optional: Boolean? = null,
    val name: String? = null,
    val introspectable: Boolean? = null,
    val closure: Int? = null,
    val destroy: Int? = null,
    val scope: String? = null,
    val direction: GirDirection? = null,
    val callerAllocates: Boolean? = null,
    val skip: Boolean? = null,
    val transferOwnership: GirTransferOwnership? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val type: GirAnyTypeOrVarargs,
    val gtkKnEnumRawValue: Boolean? = null,
    val gtkKnReinterpret: Boolean? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        if (type is GirNode) {
            type.initialize(this, namespace)
        }
    }

    fun isNullable(): Boolean = nullable == true || allowNone == true || optional == true
    fun isDefaultNull(): Boolean = nullable == true && optional == true || nullable == true && allowNone == true
}
