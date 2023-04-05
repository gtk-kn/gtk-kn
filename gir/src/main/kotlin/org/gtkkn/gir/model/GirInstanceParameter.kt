/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.model

/**
 * Instance-parameter is a parameter of a C function which is an instance of an existing object.
 *
 * So the callable is surely a method of a class, and this parameter points to the instance of the object. In C++,
 * this would be equivalent to the pointer this which is not passed to the method, in Python it's equivalent to self.
 *
 * @property name name of the instance-parameter.
 * @property nullable true if the instance-parameter can have a null value.
 * @property allowNone deprecated. Replaced by nullable and optional.
 * @property direction direction of the instance-parameter.
 * @property callerAllocates true if the caller should allocate the instance-parameter before calling the callable.
 * @property transferOwnership an [GirTransferOwnership].
 * @property type a [GirAnyTypeOrVarargs].
 * @property docs a [GirDocElements].
 */
data class GirInstanceParameter(
    val name: String,
    val nullable: Boolean?,
    val allowNone: Boolean?,
    val direction: GirDirection?,
    val callerAllocates: Boolean?,
    val transferOwnership: GirTransferOwnership?,
    val type: GirType,
    val docs: GirDocElements,
)
