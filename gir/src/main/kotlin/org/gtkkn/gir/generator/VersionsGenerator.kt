package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.blueprints.VersionBlueprint

interface VersionsGenerator {

    fun buildVersionAnnotation(repository: RepositoryBlueprint, version: VersionBlueprint): TypeSpec {

        val builder = TypeSpec.annotationBuilder(version.annotationTypeName)
        builder.addAnnotation(ClassName("kotlin", "RequiresOptIn"))
        builder.addAnnotation(
            AnnotationSpec.builder(ClassName("kotlin.annotation", "Target"))
                .addMember("%M", MemberName("kotlin.annotation.AnnotationTarget", "CLASS"))
                .addMember("%M", MemberName("kotlin.annotation.AnnotationTarget", "PROPERTY"))
                .addMember("%M", MemberName("kotlin.annotation.AnnotationTarget", "FUNCTION"))
                .addMember("%M", MemberName("kotlin.annotation.AnnotationTarget", "TYPEALIAS"))
                .build()
        )
        return builder.build()
    }

}
