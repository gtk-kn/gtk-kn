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
 * Element defining a virtual method from a class, concept similar to C++.
 *
 * @property name name of the virtual method.
 * @property cIdentifier C identifier in the source code of the virtual method.
 * @property shadowedBy virtual method it is shadowed by. For example, in C++, only one version of an overloaded
 *                      callable will appear.
 * @property shadows virtual method it shadows. For example, in C++, only one version of an overloaded callable will
 *                   appear.
 * @property throws true if the virtual method can throw an error.
 * @property movedTo if for backward compatibility reason the virtual method has a name in the source code but should be
 *                   known by another one, this attribute contains the new name.
 * @property info attributes of a Function (see [GirInfo]).
 * @property parameters a [GirParameters] that a virtual method can contain.
 * @property invoker name of the callable called when invoking this virtual method.
 * @property returnValue a [GirReturnValue] that a virtual method can contain.
 */
data class GirVirtualMethod(
    // Callable.attrs
    val name: String,
    val cIdentifier: String?,
    val shadowedBy: String?,
    val shadows: String?,
    val throws: Boolean,
    val movedTo: String?,
    val info: GirInfo,
    val parameters: GirParameters?,
    val invoker: String?,
    val returnValue: GirReturnValue?,
)
