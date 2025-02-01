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

package org.gtkkn.extensions.glib.cinterop

import org.gtkkn.native.glib.gpointer
import kotlin.native.ref.Cleaner

/**
 * Represents an instance of a proxy object with a handle to an object in
 * native memory.
 */
public interface Proxy {
    /**
     * Get the native memory address of the object.
     *
     * @return the native memory address
     */
    public val handle: gpointer

    /**
     * Registers a cleaner to be executed when this proxy object is garbage collected.
     *
     * - A cleaner allows for resource cleanup when the object is no longer used.
     * - If the cleaner is not explicitly stored, it may be garbage collected early,
     *   leading to unexpected behavior.
     *
     * @param cleaner The [Cleaner] instance to associate with this object.
     * @return `true` if the cleaner was successfully added, `false` if it was already registered.
     */
    public fun addCleaner(cleaner: Cleaner): Boolean

    /**
     * Removes a previously registered cleaner from this proxy object.
     *
     * @param cleaner The [Cleaner] instance to remove.
     * @return `true` if the cleaner was successfully removed, `false` if it was not found.
     */
    public fun removeCleaner(cleaner: Cleaner): Boolean

    public fun getSimpleNameWithHandle(): String = "${this::class.simpleName}(${handle.rawValue})"
}
