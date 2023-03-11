package org.gtkkn.gir.blueprints

data class RepositoryBlueprint(
    val name: String,
    val classBlueprints: List<ClassBlueprint>,
    val skippedObjects: List<SkippedObject>,
)
