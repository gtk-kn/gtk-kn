/*
 * Copyright (c) 2024 gtk-kn
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

/**
 * Marker interface for wrapper classes that represent C bitfields.
 */
public interface Bitfield<T : Bitfield<T>> {
    public infix fun or(other: T): T
}

/**
 * Utility function for combining bitfields to make passing flag arguments
 * to methods more readable and explicit instead of chaining `or` calls in the argument list.
 *
 * ```
 * // chaining or
 * val app = Application(
 *     "org.gtkkn.samples.gtk.playground",
 *     ApplicationFlags.FLAGS_NONE or
 *         ApplicationFlags.HANDLES_OPEN or
 *         ApplicationFlags.IS_LAUNCHER,
 * )
 *
 * // using flagsOf
 * val app = Application(
 *     "org.gtkkn.samples.gtk.playground",
 *     flagsOf(
 *         ApplicationFlags.FLAGS_NONE,
 *         ApplicationFlags.HANDLES_OPEN,
 *         ApplicationFlags.IS_LAUNCHER,
 *     ),
 * )
 * ```
 */
public fun <T : Bitfield<T>> flagsOf(first: T, vararg flags: T): T =
    flags.fold(first) { acc, item -> acc or item }
