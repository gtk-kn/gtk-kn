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
 * A constant entity, similar to const variable in C.
 *
 * @property info info attributes of a constant (see [GirInfo]).
 * @property name name of the constant.
 * @property value value of the constant.
 * @property cType corresponding C type of the constant in C.
 * @property cIdentifier corresponding C identifier in the source code.
 * @property type a [GirType] that a const can contain.
 */
data class GirConstant(
    val info: GirInfo,
    val name: String,
    val value: String,
    val cType: String?,
    val cIdentifier: String?,
    val type: GirAnyType?,
)
