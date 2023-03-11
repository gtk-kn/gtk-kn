package org.gtkkn.gir.blueprints

data class RepositoryBlueprint(
    val name: String,
    val kotlinModuleName: String,
    val classBlueprints: List<ClassBlueprint>,
    val skippedObjects: List<SkippedObject>,
)
