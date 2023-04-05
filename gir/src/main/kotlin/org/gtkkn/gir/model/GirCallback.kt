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
 * A callback closure, that is a function called when a signal is emitted (as an answer to that signal).
 *
 * @property info a [GirInfo] that a callback can contain.
 * @property name name of the callback.
 * @property cType the C type returned by the callback closure (i.e. function).
 * @property throws true if the callback can throw an error.
 * @property parameters a [GirParameters] that a callback can contain.
 * @property returnValue a [GirReturnValue] that a callback can contain.
 */
data class GirCallback(
    val info: GirInfo,
    val name: String,
    val cType: String?,
    val throws: Boolean?,
    val parameters: GirParameters?,
    val returnValue: GirReturnValue?,
) : GirCallbackOrAnyType
