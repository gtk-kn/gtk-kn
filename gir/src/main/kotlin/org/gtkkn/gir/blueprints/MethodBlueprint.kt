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

package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName

data class MethodBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val nativeMemberName: MemberName, // not enum member, but the KP reference to the native function name
    override val parameters: List<ParameterBlueprint>,
    override val returnTypeInfo: TypeInfo,
    override val throws: Boolean,
    override val exceptionResolvingFunctionMember: MemberName,
    val isOverride: Boolean,
    val isOpen: Boolean,
    val reinterpretInstanceParameter: Boolean,
    val reinterpretReturnValue: Boolean,
    val optInVersionBlueprint: OptInVersionBlueprint?,
    val deprecatedBlueprint: DeprecatedBlueprint?,
    val kdoc: String?,
    val returnTypeKDoc: String?,
) : CallableBlueprint {
    override val noStringConversion: Boolean = false
}
