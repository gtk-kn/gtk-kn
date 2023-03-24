package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.RepositoryBlueprint

interface RepositoryObjectGenerator : MiscGenerator {
    fun buildRepositoryObject(repository: RepositoryBlueprint): TypeSpec =
        TypeSpec.objectBuilder(repository.repositoryObjectName.simpleName).apply {
            repository.functionBlueprints.forEach { addFunction(buildFunction(it)) }
        }.build()
}
