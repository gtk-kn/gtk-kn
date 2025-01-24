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
