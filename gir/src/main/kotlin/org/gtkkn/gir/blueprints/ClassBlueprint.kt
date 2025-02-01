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

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeName

data class ClassBlueprint(
    val kotlinName: String,
    val nativeName: String,
    override val kotlinTypeName: ClassName,
    val parentClassName: ClassName?,
    val implementsInterfaces: List<ImplementsInterfaceBlueprint>,
    val methods: List<MethodBlueprint>,
    val constants: List<ConstantBlueprint>,
    val properties: List<PropertyBlueprint>,
    override val constructors: List<ConstructorBlueprint>,
    val signals: List<SignalBlueprint>,
    val functions: List<FunctionBlueprint>,
    val skippedObjects: List<SkippedObject>,
    override val objectPointerName: String,
    override val objectPointerTypeName: TypeName,
    val interfacePointerOverrides: List<ImplementsInterfaceBlueprint>,
    val isAbstract: Boolean,
    val isFinal: Boolean,
    override val glibGetTypeFunc: MemberName?,
    val optInVersionBlueprint: OptInVersionBlueprint?,
    val deprecatedBlueprint: DeprecatedBlueprint?,
    val kdoc: String?,
) : HasConstructorsBlueprint, TypeToRegister {
    override val hasParent: Boolean get() = parentClassName != null
    override val instanceTypeName: ClassName =
        if (isAbstract) kotlinTypeName.nestedClass("${kotlinTypeName.simpleName}Impl") else kotlinTypeName
}
