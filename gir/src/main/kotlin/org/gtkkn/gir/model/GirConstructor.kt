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
 * A constructor of a class.
 *
 * @property info a [GirInfo] that a constructor can contain.
 * @property name name of the constructor.
 * @property cIdentifier C identifier in the source code of the constructor.
 * @property shadowedBy constructor it is shadowed by. For example, in C++, only one version of an overloaded callable
 *                      will appear.
 * @property shadows constructor it shadows. For example, in C++, only one version of an overloaded callable will
 *                   appear.
 * @property throws true if the constructor can throw an error.
 * @property movedTo if for backward compatibility reason the constructor has a name in the source code but should be
 *                   known by another one, this attribute contains the new name.
 * @property parameters a [GirParameters] that a constructor can contain.
 * @property returnValue a [GirReturnValue] that a constructor can contain.
 */
data class GirConstructor(
    val info: GirInfo,
    // constructor.attrs
    val name: String,
    val cIdentifier: String?,
    val shadowedBy: String?,
    val shadows: String?,
    val throws: Boolean?,
    val movedTo: String?,
    val parameters: GirParameters?,
    val returnValue: GirReturnValue?,
)
