package org.gtkkn.gir.blueprints

data class RepositoryBlueprint(
    val name: String,
    val kotlinModuleName: String,
    val classBlueprints: List<ClassBlueprint>,
    val interfaceBlueprints: List<InterfaceBlueprint>,
    val skippedObjects: List<SkippedObject>,
)
