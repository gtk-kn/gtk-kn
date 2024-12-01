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
 * Attributes of a callable (functions, callbacks, closures, etc.).
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the callable.
 * @property cIdentifier C identifier in the source code of the callable.
 * @property shadowedBy Name of the callable that shadows this callable.
 * @property shadows Name of the callable that this callable shadows.
 * @property throws Indicates if the callable can throw an error.
 * @property movedTo Indicates the new name of the callable if it has been moved.
 * @property glibAsyncFunc Name of the asynchronous version of this callable.
 * @property glibSyncFunc Name of the synchronous version of this callable.
 * @property glibFinishFunc Name of the callable that finishes the asynchronous operation of this function.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirCallable(
    val info: GirInfo,
    val name: String,
    val cIdentifier: String? = null,
    val shadowedBy: String? = null,
    val shadows: String? = null,
    val throws: Boolean? = null,
    val movedTo: String? = null,
    val glibAsyncFunc: String? = null,
    val glibSyncFunc: String? = null,
    val glibFinishFunc: String? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
    }
}
