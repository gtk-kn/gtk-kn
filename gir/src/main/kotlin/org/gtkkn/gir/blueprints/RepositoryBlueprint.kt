/*
 * Copyright (c) 2023 gtk-kn
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

data class RepositoryBlueprint(
    val name: String,
    val kotlinModuleName: String,
    val classBlueprints: List<ClassBlueprint>,
    val interfaceBlueprints: List<InterfaceBlueprint>,
    val enumBlueprints: List<EnumBlueprint>,
    val functionBlueprints: List<FunctionBlueprint>,
    val callbackBlueprints: List<CallbackBlueprint>,
    val bitfieldBlueprints: List<BitfieldBlueprint>,
    val constantBlueprints: List<ConstantBlueprint>,
    val recordBlueprints: List<RecordBlueprint>,
    val skippedObjects: List<SkippedObject>,
    val repositoryObjectName: ClassName,
    val repositoryCallbacksName: ClassName,
) {
    /**
     * Get all enum blueprints that represent an GError error domain.
     */
    fun errorDomainEnums(): List<EnumBlueprint> =
        enumBlueprints.filter { it.errorDomain != null && it.errorExceptionTypeName != null }
}
