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
 * Documentation elements for GIR elements.
 *
 * @property docVersion Version of the documentation.
 * @property docStability Stability of the documentation.
 * @property doc Documentation text.
 * @property docDeprecated Deprecated documentation text.
 * @property sourcePosition Source position of the documentation in the original source code.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirDoc(
    val docVersion: GirDocVersion? = null,
    val docStability: GirDocStability? = null,
    val doc: GirDocText? = null,
    val docDeprecated: GirDocDeprecated? = null,
    val sourcePosition: GirSourcePosition? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        docVersion?.initialize(this, namespace)
        docStability?.initialize(this, namespace)
        doc?.initialize(this, namespace)
        docDeprecated?.initialize(this, namespace)
        sourcePosition?.initialize(this, namespace)
    }
}
