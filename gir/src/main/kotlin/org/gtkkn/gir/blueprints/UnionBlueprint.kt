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

data class UnionBlueprint(
    override val kotlinName: String,
    override val kotlinTypeName: ClassName,
    override val nativeTypeName: TypeName,
    override val objectPointerTypeName: TypeName,
    override val objectPointerName: String,
    override val constructors: List<ConstructorBlueprint>,
    override val functions: List<FunctionBlueprint>,
    override val methods: List<MethodBlueprint>,
    override val fields: List<FieldBlueprint>,
    override val cStructTypeName: ClassName,
    override val hasNewConstructor: Boolean,
    override val optInVersionBlueprint: OptInVersionBlueprint?,
    override val kdoc: String?,
    override val skippedObjects: List<SkippedObject>,
) : RecordUnionCommonBlueprint
