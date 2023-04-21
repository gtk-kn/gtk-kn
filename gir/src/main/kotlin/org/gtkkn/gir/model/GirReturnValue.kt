/*
 * Copyright (c) 2023 gtk-kn
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
 * @property introspectable true if the element is introspectable. It doesn't exist in the bindings, due in general to
 *                          missing information in the annotations in the original C code.
 * @property nullable true if the parameter can have a null value.
 * @property closure the parameter is a user_data for callbacks. The value points to a different parameter that is the
 *                   actual callback.
 * @property scope indicates the lifetime of the call.
 * @property destroy the parameter is a destroy_data for callbacks. The value points to a different parameter that is
 *                   the actual callback.
 * @property skip true if the parameter can be omitted from the introspected output.
 * @property allowNone deprecated. Replaced by nullable and optional.
 * @property transferOwnership an [GirTransferOwnership].
 * @property type a [GirAnyTypeOrVarargs].
 * @property docs a [GirDocElements].
 */
data class GirReturnValue(
    val introspectable: Boolean?,
    private val nullable: Boolean?,
    val closure: Int?,
    val scope: GirScope?,
    val destroy: Int?,
    val skip: Boolean?,
    private val allowNone: Boolean?,
    val transferOwnership: GirTransferOwnership?,
    val type: GirAnyType,
    val docs: GirDocElements,
) {
    fun isNullable(): Boolean = nullable == true || allowNone == true
}
