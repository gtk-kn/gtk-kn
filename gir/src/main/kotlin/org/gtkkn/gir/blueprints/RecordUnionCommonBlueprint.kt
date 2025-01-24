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
import com.squareup.kotlinpoet.TypeName

interface RecordUnionCommonBlueprint {
    val kotlinName: String
    val kotlinTypeName: ClassName
    val nativeTypeName: TypeName
    val objectPointerTypeName: TypeName
    val objectPointerName: String
    val constructors: List<ConstructorBlueprint>
    val functions: List<FunctionBlueprint>
    val methods: List<MethodBlueprint>
    val fields: List<FieldBlueprint>
    val cStructTypeName: ClassName
    val optInVersionBlueprint: OptInVersionBlueprint?
    val kdoc: String?
    val skippedObjects: List<SkippedObject>
    val hasNewConstructor: Boolean
}
