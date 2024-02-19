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
 * Parameters element of a callable, that is in general parameters of a function or similar.
 *
 * @param name name of the parameter.
 * @param nullable true if the parameter can have a null value.
 * @param allowNone deprecated. Replaced by nullable and optional.
 * @param introspectable true if the element is introspectable. It doesn't exist in the bindings, due in general to
 *                          missing information in the annotations in the original C code.
 * @param closure the parameter is a user_data for callbacks. The value points to a different parameter that is the
 *                   actual callback.
 * @param destroy the parameter is a destroy_data for callbacks. The value points to a different parameter that is
 *                   the actual callback.
 * @param scope indicates the lifetime of the call.
 * @param direction direction of the parameter.
 * @param callerAllocates true if the caller should allocate the parameter before calling the callable.
 * @param optional true if the parameter is optional.
 * @param skip true if the parameter can be omitted from the introspected output.
 * @param transferOwnership an [GirTransferOwnership].
 * @param docs a [GirDocElements].
 * @param type a [GirAnyTypeOrVarargs].
 */
data class GirParameter(
    val name: String,
    private val nullable: Boolean?,
    private val allowNone: Boolean?,
    val introspectable: Boolean?,
    val closure: Int?,
    val destroy: Int?,
    val scope: GirScope?,
    val direction: GirDirection?,
    val callerAllocates: Boolean?,
    private val optional: Boolean?,
    val skip: Boolean?,
    val transferOwnership: GirTransferOwnership?,
    val docs: GirDocElements,
    val type: GirAnyTypeOrVarargs,
) {
    fun isNullable(): Boolean = nullable == true || allowNone == true || optional == true

    fun isDefaultNull(): Boolean = nullable == true && optional == true || nullable == true && allowNone == true
}
