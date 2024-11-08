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

package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

data class RecordBlueprint(
    val kotlinName: String,
    val kotlinTypeName: ClassName,
    val objectPointerTypeName: TypeName,
    val objectPointerName: String,
    val constructors: List<ConstructorBlueprint>,
    val functions: List<FunctionBlueprint>,
    val methods: List<MethodBlueprint>,
    val fields: List<FieldBlueprint>,
    val cStructTypeName: ClassName,
    val skippedObjects: List<SkippedObject>,
    val isOpaque: Boolean,
    val kdoc: String?,
    val optInVersionBlueprint: OptInVersionBlueprint?,
)
