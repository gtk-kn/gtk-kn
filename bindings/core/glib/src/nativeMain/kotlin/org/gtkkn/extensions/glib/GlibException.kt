/*
 * Copyright (c) 2023 gtk-kt
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.extensions.glib

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.FileError
import org.gtkkn.bindings.glib.FileErrorException

/**
 * An exception that represents a GLib GError that occurred.
 *
 * All **gtk-kn** methods and functions that wrap a C function that uses the `GError` error mechanism
 * from GLib return a Kotlin [Result] with [GlibException] as the throwable type for the failure case.
 *
 * Constructors that use GError will throw [GlibException] since they cannot return a [Result].
 *
 * When gtk-kn is able to match the error domain to a domain and associated error enum that it knows about,
 * a more specific subclass of [GlibException] is used. In this case the more specific subclass contains
 * a `code` property that is strongly typed to the associated enum class. (for example [FileErrorException]
 * has a `code` property of type [FileError] which can be used in an exhaustive `when` statement).
 *
 *
 * ## Note on automatic domain matching
 *
 * Automatic domain matching currently only supports matching error domains from the module in which the
 * throwing method is defined. For example, a method in the gtk4 module can only match error domains from gtk4.
 *
 * In case you expect an error from an error domain in another module, you can use the [GlibException.error] property
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
public open class GlibException(public val error: Error) : Exception(
    error.message,
)
