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

package org.gtkkn.gir.processor

import me.tatarka.inject.annotations.Inject
import org.gtkkn.gir.blueprints.BlueprintResult
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprintBuilder
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirRepository

@Inject
class Phase2Processor(
    private val typeRegistry: TypeRegistry,
) {
    /**
     * Process a list of [GirRepository] into [RepositoryBlueprint]
     */
    fun process(repositories: List<GirRepository>): List<RepositoryBlueprint> {
        val context = ProcessorContext(repositories, typeRegistry)
        logger.info { "Registering Types" }
        repositories.forEach { repository ->
            repository.namespaces.forEach { namespace ->
                namespace.aliases.forEach { it.registerType(typeRegistry) }
                namespace.bitfields.forEach { it.registerType(typeRegistry) }
                namespace.callbacks.forEach { it.registerType(typeRegistry) }
                namespace.classes.forEach { it.registerType(typeRegistry) }
                namespace.enumerations.forEach { it.registerType(typeRegistry) }
                namespace.interfaces.forEach { it.registerType(typeRegistry) }
                namespace.records.forEach { it.registerType(typeRegistry) }
                namespace.unions.forEach { it.registerType(typeRegistry) }
            }
        }
        logger.info { "Resolving Types' Inheritance" }
        typeRegistry.resolveInheritance()
        val result = repositories.map { repo ->
            when (val result = RepositoryBlueprintBuilder(context, repo).build()) {
                is BlueprintResult.Ok -> result.blueprint
                is BlueprintResult.Skip -> error("Could not process repository")
            }
        }
        return result
    }
}
