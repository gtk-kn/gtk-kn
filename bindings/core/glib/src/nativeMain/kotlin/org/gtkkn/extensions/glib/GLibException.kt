/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.extensions.glib

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.FileError
import org.gtkkn.bindings.glib.FileErrorException

/**
 * An exception that represents a GLib GError that occurred.
 *
 * All **gtk-kn** methods and functions that wrap a C function that uses the `GError` error mechanism
 * from GLib return a Kotlin [Result] with [GLibException] as the throwable type for the failure case.
 *
 * Constructors that use GError will throw [GLibException] since they cannot return a [Result].
 *
 * When gtk-kn is able to match the error domain to a domain and associated error enum that it knows about,
 * a more specific subclass of [GLibException] is used. In this case the more specific subclass contains
 * a `code` property that is strongly typed to the associated enum class. (for example [FileErrorException]
 * has a `code` property of type [FileError] which can be used in an exhaustive `when` statement).
 *
 *
 * ## Note on automatic domain matching
 *
 * Automatic domain matching currently only supports matching error domains from the module in which the
 * throwing method is defined. For example, a method in the gtk4 module can only match error domains from gtk4.
 *
 * In case you expect an error from an error domain in another module, you can use the [GLibException.error] property
 * and match it manually against an error enum using its `fromErrorOrNull()` companion method.
 *
 * ```
 * try {
 *   /* a method call that throws */
 * } catch (ex: GlibException) {
 *     val fileError = FileError.fromErrorOrNull(ex.error)
 *     if (fileError != null) {
 *         when (fileError) {
 *             FileError.EXISTS -> {}
 *             FileError.ISDIR -> {}
 *             ...
 *         }
 *     }
 * }
 * ```
 *
 * @property error the [Error] wrapping the `GError` struct that caused this exception.
 */
public open class GLibException(public val error: Error) : Exception(
    error.message,
)
