package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.blueprints.VersionBlueprint

interface VersionsGenerator {

    fun buildVersionAnnotation(repository: RepositoryBlueprint, version: VersionBlueprint): TypeSpec {

        val builder = TypeSpec.annotationBuilder(version.annotationTypeName)
        builder.addAnnotation(ClassName("kotlin", "RequiresOptIn"))
//        builder.addAnnotation(ClassName("kotlin", "RequiresOptIn"))
//        builder.addAnnotation(ClassName("kotlin", "RequiresOptIn"))

        return builder.build()
    }

}
