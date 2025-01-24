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
 * Element defining a member of a bit field or an enumeration.
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the member.
 * @property value Value of the member.
 * @property cIdentifier Corresponding C identifier in the source code.
 * @property glibNick Short nickname of the member (from GEnumValue/GFlagsValue).
 * @property glibName Name of the member (from GEnumValue/GFlagsValue).
 * @property doc Documentation elements.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirMember(
    val info: GirInfo,
    val name: String,
    val value: String,
    val cIdentifier: String,
    val glibNick: String? = null,
    val glibName: String? = null,
    val doc: GirDoc? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
    }
}
