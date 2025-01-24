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

data class RepositoryBlueprint(
    val name: String,
    val kotlinModuleName: String,
    val aliasBlueprints: List<AliasBlueprint>,
    val classBlueprints: List<ClassBlueprint>,
    val interfaceBlueprints: List<InterfaceBlueprint>,
    val enumBlueprints: List<EnumBlueprint>,
    val functionBlueprints: List<FunctionBlueprint>,
    val callbackBlueprints: List<CallbackBlueprint>,
    val bitfieldBlueprints: List<BitfieldBlueprint>,
    val constantBlueprints: List<ConstantBlueprint>,
    val recordBlueprints: List<RecordBlueprint>,
    val unionBlueprints: List<UnionBlueprint>,
    val skippedObjects: List<SkippedObject>,
    val repositoryObjectName: ClassName,
    val repositoryCallbacksName: ClassName,
    val repositoryTypeProviderTypeName: ClassName,
    val optInVersionBlueprints: Set<OptInVersionBlueprint>
) {
    /**
     * Get all enum blueprints that represent an GError error domain.
     */
    fun errorDomainEnums(): List<EnumBlueprint> =
        enumBlueprints.filter { it.errorDomain != null && it.errorExceptionTypeName != null }
}
