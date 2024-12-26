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

import com.squareup.kotlinpoet.MemberName

interface CallableBlueprint {
    val parameters: List<ParameterBlueprint>
    val returnTypeInfo: TypeInfo
    val throws: Boolean
    val exceptionResolvingFunctionMember: MemberName
    val noStringConversion: Boolean

    /**
     * Determine if this callable implementation needs to be wrapped in a memscoped block.
     */
    val needsMemscoped: Boolean
        get() = throws || parameters.any { it.typeInfo is TypeInfo.StringList } || noStringConversion

    val needsMemscopedReturnValue: Boolean
        get() = returnTypeInfo is TypeInfo.StringList
}
