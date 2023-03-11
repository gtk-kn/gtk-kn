package org.gtkkn.gir.processor

import org.gtkkn.gir.blueprints.BlueprintResult
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprintBuilder
import org.gtkkn.gir.model.GirRepository

class Phase2Processor {

    /**
     * Process a list of [GirRepository] into [RepositoryBlueprint]
     */
    fun process(repositories: List<GirRepository>): List<RepositoryBlueprint> {
        val context = ProcessorContext(repositories)
        return repositories.map { repo ->
            when (val result = RepositoryBlueprintBuilder(context, repo).build()) {
                is BlueprintResult.Ok -> result.blueprint
                is BlueprintResult.Skip -> error("Could not process repository")
            }
        }
    }
}
