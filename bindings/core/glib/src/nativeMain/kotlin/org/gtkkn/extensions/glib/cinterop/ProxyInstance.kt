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
 * Base type for a Kotlin proxy object to an instance in native memory.
 *
 * Create a new [ProxyInstance] object for an instance in native
 * memory.
 *
 * @param handle the memory address of the instance
 */
public open class ProxyInstance(public override val handle: gpointer) : Proxy {
    private val cleanerSet: MutableSet<Cleaner> = LinkedHashSet()

    override fun addCleaner(cleaner: Cleaner): Boolean = cleanerSet.add(cleaner)
    override fun removeCleaner(cleaner: Cleaner): Boolean = cleanerSet.remove(cleaner)

    /**
     * Compare two proxy instances for equality. This will compare both the type
     * of the instances, and their memory addresses.
     *
     * @param other the proxy instance to compare
     * @return whether the instances are equal
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as ProxyInstance
        return handle == other.handle
    }

    override fun hashCode(): Int = handle.hashCode()
}
