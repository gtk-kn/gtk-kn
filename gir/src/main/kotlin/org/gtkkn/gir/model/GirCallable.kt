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
 * Attributes of a callable (functions, callbacks, closures, etc.).
 *
 * @property info Common attributes for GIR elements.
 * @param name Name of the callable.
 * @property cIdentifier C identifier in the source code of the callable.
 * @property shadowedBy Name of the callable that shadows this callable.
 * @param shadows Name of the callable that this callable shadows.
 * @property throws Indicates if the callable can throw an error.
 * @param movedTo Indicates the new name of the callable if it has been moved.
 * @property glibAsyncFunc Name of the asynchronous version of this callable.
 * @property glibSyncFunc Name of the synchronous version of this callable.
 * @property glibFinishFunc Name of the callable that finishes the asynchronous operation of this function.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirCallable(
    val info: GirInfo,
    private val name: String,
    val cIdentifier: String? = null,
    val shadowedBy: String? = null,
    private val shadows: String? = null,
    val throws: Boolean? = null,
    private val movedTo: String? = null,
    val glibAsyncFunc: String? = null,
    val glibSyncFunc: String? = null,
    val glibFinishFunc: String? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
    }

    fun getName(): String = when {
        !movedTo.isNullOrBlank() -> movedTo
        !shadows.isNullOrBlank() -> shadows
        name.isNotBlank() -> name
        else -> error("Name must not be blank")
    }

    fun shouldBeGenerated(): Boolean =
        info.gtkKnIgnore != true && shadowedBy.isNullOrEmpty() && movedTo?.contains(".") != true
}
