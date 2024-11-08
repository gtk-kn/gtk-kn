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
 * @param introspectable true if the element is introspectable. It doesn't exist in the bindings, due in general to
 *                          missing information in the annotations in the original C code.
 * @param nullable true if the parameter can have a null value.
 * @param closure the parameter is a user_data for callbacks. The value points to a different parameter that is the
 *                   actual callback.
 * @param scope indicates the lifetime of the call.
 * @param destroy the parameter is a destroy_data for callbacks. The value points to a different parameter that is
 *                   the actual callback.
 * @param skip true if the parameter can be omitted from the introspected output.
 * @param allowNone deprecated. Replaced by nullable and optional.
 * @param transferOwnership an [GirTransferOwnership].
 * @param type a [GirAnyType].
 * @param docs a [GirDocElements].
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
