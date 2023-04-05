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
 * Type's name substitution, representing a typedef in C.
 *
 * @property name the new name or typedef'd name.
 * @property cType the corresponding C type's name.
 * @property type a [GirType] that an alias can contain.
 * @property info a [GirInfo] that an alias can contain.
 */
data class GirAlias(
    val name: String,
    val cType: String,
    val type: GirType,
    val info: GirInfo,
)
