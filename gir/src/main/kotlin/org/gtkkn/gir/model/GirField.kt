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
 * A field of struct of union structure, that is a C bit field, that is a fixed length in bits variable.
 *
 * @property info a [GirInfo] that a field can contain.
 * @property name name of the field.
 * @property writable true if the field is writeable.
 * @property readable true if the field is readable.
 * @property private true if the field is private to the structure or has public (false) visibility.
 * @property bits number of bits of the field.
 * @property type a [GirCallbackOrAnyType] that a field can contain.
 */
data class GirField(
    val info: GirInfo,
    val name: String,
    val writable: Boolean?,
    val readable: Boolean?,
    val private: Boolean?,
    val bits: Int?,
    val type: GirCallbackOrAnyType,
)
