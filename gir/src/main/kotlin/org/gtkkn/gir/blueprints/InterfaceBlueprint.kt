/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeName

data class InterfaceBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val typeName: ClassName,
    val methods: List<MethodBlueprint>,
    val properties: List<PropertyBlueprint>,
    val signals: List<SignalBlueprint>,
    val functions: List<FunctionBlueprint>,
    val skippedObjects: List<SkippedObject>,
    val objectPointerName: String,
    val objectPointerTypeName: TypeName,
    val parentInterfaces: List<ImplementsInterfaceBlueprint>,
    val glibGetTypeFunc: MemberName?,
    val version: String?,
    val kdoc: String?,
)
