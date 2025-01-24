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
 * Element defining an inline function.
 *
 * @property callable Attributes of a callable.
 * @property parameters Parameters for the inline function.
 * @property returnValue Return value of the inline function.
 * @property doc Documentation elements.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirFunctionInline(
    val callable: GirCallable,
    val parameters: GirParameters? = null,
    val returnValue: GirReturnValue? = null,
    val doc: GirDoc? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        callable.initialize(this, namespace)
        parameters?.initialize(this, namespace)
        returnValue?.initialize(this, namespace)
        doc?.initialize(this, namespace)
    }
}
