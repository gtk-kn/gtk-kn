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

package org.gtkkn.gir.model

/**
 * Common attributes for GIR elements like version, deprecation, stability, introspectability, etc.
 *
 * @property introspectable Binary attribute which is "0" (false) if the element is not introspectable.
 * @property deprecated Binary attribute which is "1" (true) if the element has been deprecated.
 * @property deprecatedVersion Version number from which this element is deprecated.
 * @property version Version number of an element.
 * @property stability Stability status of the element. Can be "Stable", "Unstable", or "Private".
 * @property gtkKnIgnore Binary attribute which is "1" (true) if the element should be ignored.
 * @property gtkKnNoStringConversion Binary attribute which is "1" (true) if the element automatic conversion is skipped
 *                                   and raw pointers are used in the bindings.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirInfo(
    val introspectable: Boolean? = null,
    val deprecated: Boolean? = null,
    val deprecatedVersion: String? = null,
    val version: String? = null,
    val stability: Stability? = null,
    val gtkKnIgnore: Boolean? = null,
    val gtkKnNoStringConversion: Boolean? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        // No children
    }

    enum class Stability {
        STABLE,
        UNSTABLE,
        PRIVATE,
        ;

        companion object {
            fun fromString(str: String): Stability = when (str) {
                "Stable" -> STABLE
                "Unstable" -> UNSTABLE
                "Private" -> PRIVATE
                else -> error("String '$str' is not a valid Stability value")
            }
        }
    }
}
