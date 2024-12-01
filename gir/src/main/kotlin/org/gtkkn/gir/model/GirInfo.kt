/*
 * Copyright (c) 2024 gtk-kn
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
 * Common attributes for GIR elements like version, deprecation, stability, introspectability, etc.
 *
 * @property introspectable Binary attribute which is "0" (false) if the element is not introspectable.
 * @property deprecated Binary attribute which is "1" (true) if the element has been deprecated.
 * @property deprecatedVersion Version number from which this element is deprecated.
 * @property version Version number of an element.
 * @property stability Stability status of the element. Can be "Stable", "Unstable", or "Private".
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirInfo(
    val introspectable: Boolean? = null,
    val deprecated: Boolean? = null,
    val deprecatedVersion: String? = null,
    val version: String? = null,
    val stability: String? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        // No children
    }
}
